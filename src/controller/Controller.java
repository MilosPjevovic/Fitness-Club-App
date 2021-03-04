package controller;

import baza.BazaUpiti;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import model.Cene;
import model.Klijent;
import model.Racun;
import model.Zaposleni;
import view.GlavniOkvir;
import view.LogovanjeOkvir;
import view.NoviKlijentPanel;
import view.ObrisiPromeniPanel;
import view.PrikaziSveKarticePanel;
import view.ProveraStatusaPanel;

/**
 *
 * @author Pjevovic
 */
public class Controller {

    private Zaposleni model1;
    private Klijent model2;
    private Cene model3;
    private Racun model4;
    private LogovanjeOkvir view1;
    private GlavniOkvir view2;
    private NoviKlijentPanel view3;
    private ProveraStatusaPanel view4;
    private ObrisiPromeniPanel view5;
    private PrikaziSveKarticePanel view6;
    public Controller(LogovanjeOkvir view1) {
        this.view1 = view1;

        ulogujZaposlenogListenerLO();

    }

    //Metode
    
    
    //Metoda za logovanje Zaposlenog (dugme Uloguj Me-Logovanje okvir)
    private void ulogujZaposlenogListenerLO() {
        view1.getUlogujMe_btn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                model1 = BazaUpiti.proveriZaposlenog(view1);
                if (model1 != null) {
                    view1.logovanjePoruka("da");
                    view1.dispose();
                    view3=new NoviKlijentPanel();
                    view4=new ProveraStatusaPanel();
                    view5=new ObrisiPromeniPanel();
                    view6=new PrikaziSveKarticePanel();
                    view2 = new GlavniOkvir(view3, view4, view5, view6);
                    model3 = BazaUpiti.ucitajCene();
                    view5.prikaziCene(model3);
                    view2.postaviImeZaposlenog(model1);
                    datumIVreme();
                    postaviSveListenereZaGlavniOkvir();
                } else {
                    view1.logovanjePoruka("ne");
                }

            }

        });
    }

    //Metoda za upis Klijenta u bazu podataka (dugme Sacuvaj-Novi klijent panel)
    private void sacuvajKlijentaLestenerNK() {
        view3.getSacuvaj_btn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                model2 = kreirajKlijenta();
                boolean ok = BazaUpiti.sacuvajKlijentaUBazu(view3, model2);
                if (ok == true) {
                    upisiKlijentaUFajl(model2);
                    view3.registracijaKlijentaPoruka("da");
                } else {
                    view3.registracijaKlijentaPoruka("ne");
                }
            }

        });

    }

    //Metoda za proveru klijenta (dugme Proveri-Provera statusa panel)
    private void proveriKlijentaListenerPS() {
        view4.getProveri_btn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                int brKartice = Integer.parseInt(view4.getBrKartice_tf().getText());
                model2 = BazaUpiti.proveriKlijenta(brKartice);
                view4.prikaziKlijenta(model2);

            }

        });
    }
    
    //Metoda za racunanje ukupnog iznosa za naplatu clanarine(dugme Ukupno-Provera statusa panel)
    private void ukupnoZaNaplatuPS() {
        view4.getUkupno_btn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {

                model3 = BazaUpiti.ucitajCene();
                izracunajZaUplatu();

            }

        });
    }
    
    //Metoda za naplatu racuna (dugme Racun-Provera statusa panel)
    private void naplataRacunaPS() {
        view4.getRacun_btn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {

                model4 = napraviRacun();
                dodajCalanarinuKlijentu();
                boolean ok1 = BazaUpiti.izmeniKlijenta(model2);
                boolean ok2 = BazaUpiti.upisiRacunUBazu(model4);
                if (ok2 == true && ok1 == true) {
                    upisiRacunUFajl(model4);
                    view4.uplataClanarinePoruka("da");
                } else {
                    view4.uplataClanarinePoruka("ne");

                }
            }

        });

    }

    //Metoda za proveru klijenta (dugme Proveri-Obrisi promeni panel)
    private void proveriKlijentaListenerOP() {
        view5.getProveri_btn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                int brKartice = Integer.parseInt(view5.getBrKartice_tf().getText());
                model2 = BazaUpiti.proveriKlijenta(brKartice);
                view5.prikaziKlijenta(model2);
            }

        });
    }
    
    //Metoda za brisanje klijenta (dugme Obrisi-Obrisi promeni panel)
    private void obrisiKlijentaListenerOP() {
        view5.getObrisi_btn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                boolean ok = BazaUpiti.obrisiKlijenta(model2);
                if (ok == true) {
                    view5.obrisiKlijentaPoruka("da");
                } else {
                    view5.obrisiKlijentaPoruka("ne");
                }
            }

        });
    }
    
    
    //Metoda za promenu cena (dugme Promeni-Obrisi promeni panel)
    private void promeniCeneListenerOP() {
        view5.getPromeni_btn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                model3 = BazaUpiti.ucitajCene();
                model3 = setujNoveCene(model3);
                boolean ok = BazaUpiti.promeniCene(model3);
                if (ok == true) {
                    view5.promenaCenePoruka("da");
                } else {
                    view5.promenaCenePoruka("ne");
                }
            }

        });
    }
    
    
    private void ucitajSveKarticeSK(){
        view6.getUcitaj_btn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                ArrayList<Klijent>klijenti=BazaUpiti.ucitajSveIzTabeleKlijent();
                dodajUTabelu(klijenti);
            }
           
        });
    }

    //Metoda za menjanje na panel Novi Klijent (dugme Novi Klijent-Glavni Frame)
    private void noviKlijentListenerGO() {
        view2.getNoviKlijent_btn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {

                view2.prikaziNoviKlijentPanel();
                view4.resetujPanelProveraStatusa();
                view5.resetujPanelObrisiPromeni();
                view6.resetujPanelPrikaziSveKartice();
            }

        });
    }
    
    //Metoda za menjanje na panel Provera Statusa (dugme Provera Statusa-Glavni Frame)
    private void proveraListenerGO() {
        view2.getProveraStatusa_btn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {

                view2.prikaziProveraStatusaPanel();
                view3.resetujPanelNoviKlijent();
                view5.resetujPanelObrisiPromeni();
                view6.resetujPanelPrikaziSveKartice();
            }

        });
    }
    
    //Metoda za menjanje na panel Obrisi Promeni (dugme Obrisi Promeni-Glavni Frame)
    private void obrisiListenerGO() {
        view2.getObrisiPromeni_btn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {

                view2.prikaziObrisiPromeniPanel();
                view4.resetujPanelProveraStatusa();
                view3.resetujPanelNoviKlijent();
                view6.resetujPanelPrikaziSveKartice();
            }

        });
    }
    
    
    private void prikaziListenerGO(){
        view2.getUcitajSveZauzeteKartice_btn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
              view2.prikaziSveKarticePanel();
              view3.resetujPanelNoviKlijent();
              view4.resetujPanelProveraStatusa();
              view5.resetujPanelObrisiPromeni(); 
            }
            
});
    }
    
    //Metoda za odjavu i otvaranje Okvira za Logovanje (dugme Odjavi se-Glavni Frame)
    private void odjaviSeListenerGO() {
        view2.getOdjaviMe_btn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                view2.dispose();
                view1 = new LogovanjeOkvir();
                ulogujZaposlenogListenerLO();
            }

        });
    }
    
    //Metoda za kreiranje objekta klase Klijent
    private Klijent kreirajKlijenta() {

        try {
            String pol = "";
            if (view3.getMuskiPol_rbtn().isSelected()) {
                pol = "Muški";
            }
            if (view3.getZenskiPol_rbtn().isSelected()) {
                pol = "Ženski";
            }

            Klijent klijent = new Klijent(Integer.parseInt(view3.getBrKartice_tf().getText()), view3.getIme_tf().getText(),
                    view3.getPrezime_tf().getText(), view3.getBrMob_tf().getText(), view3.getGodine_tf().getText(), view3.getEmail_tf().getText(), pol, "/", "/", "/");

            if (klijent.getIme().equalsIgnoreCase("") || klijent.getPrezime().equalsIgnoreCase("") || klijent.getBrojMobilnog().equalsIgnoreCase("") || klijent.getBrojGodina().equalsIgnoreCase("")
                    || klijent.getEmail().equalsIgnoreCase("") || klijent.getPol().equalsIgnoreCase("")) {
                return null;
            }
            return klijent;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    
    //Metoda za setovanje clanarie
    private void dodajCalanarinuKlijentu() {
        String tipTreninga = view4.getTipTreninga_jComboBox().getSelectedItem().toString();
        String izbor = "";
        switch (tipTreninga) {

            case "Teretana":
                izbor = "Teretana";
                break;
            case "Kardio":
                izbor = "Kardio";
                break;
            case "Teretana + Kardio":
                izbor = "Teretana + Kardio";
                break;
            case "Grupni Fitnes":
                izbor = "Grupni Fitness";
                break;
            case "CrossFit":
                izbor = "CrossFit";
                break;
        }

        String dan = view4.getDan_jComboBox().getSelectedItem().toString();
        String mesec = view4.getMesec_jComboBox().getSelectedItem().toString();
        String godina = view4.getGodina_jComboBox().getSelectedItem().toString();
        String clanarina = dan + "." + mesec + "." + godina;

        String trener = "/";
        if (view4.getPersonalniTrener_rbtn().isSelected()) {
            trener = "Da";
        }
        model2.setTipTreninga(izbor);
        model2.setClanarina(clanarina);
        model2.setTrener(trener);
    }
    
    
    //Metoda za definisanje objekta klase Racun
    private Racun napraviRacun() {
        String tipTreninga = view4.getTipTreninga_jComboBox().getSelectedItem().toString();
        String izbor = "";
        switch (tipTreninga) {

            case "Teretana":
                izbor = "Teretana";
                break;
            case "Kardio":
                izbor = "Kardio";
                break;
            case "Teretana + Kardio":
                izbor = "Teretana + Kardio";
                break;
            case "Grupni Fitnes":
                izbor = "Grupni Fitness";
                break;
            case "CrossFit":
                izbor = "CrossFit";
                break;
        }

        String trener = "/";
        if (view4.getPersonalniTrener_rbtn().isSelected()) {
            trener = "Da";
        }

        Date vreme = new Date();
        SimpleDateFormat formatDatum = new SimpleDateFormat("dd.MM.y.");
        SimpleDateFormat formatVreme = new SimpleDateFormat("HH:mm:ss");

        model4 = new Racun(izbor, trener, view4.getZbir_lab().getText(), formatVreme.format(vreme), formatDatum.format(vreme));

        return model4;
    }
    
    //Metoda za racunanje cene
    private void izracunajZaUplatu() {

        String tipTreninga = view4.getTipTreninga_jComboBox().getSelectedItem().toString();
        float ukupno = 0;
        switch (tipTreninga) {

            case "Teretana":
                ukupno += model3.getTeretana();
                break;
            case "Kardio":
                ukupno += model3.getKardio();
                break;
            case "Teretana + Kardio":
                ukupno += model3.getTeretanaKardio();
                break;
            case "Grupni Fitnes":
                ukupno += model3.getGrupniFitnes();
                break;
            case "CrossFit":
                ukupno += model3.getCrossfit();
                break;
        }

        if (view4.getPersonalniTrener_rbtn().isSelected()) {
            ukupno += model3.getPersonalniTrener();
        }

        view4.getZbir_lab().setText(String.format("%.2f", ukupno));
    }
    
    
    //Metoda za setovanje novih cena
    private Cene setujNoveCene(Cene model3) {

        double teretana = Double.parseDouble(view5.getTeretana_tf().getText());
        double kardio = Double.parseDouble(view5.getKardio_tf().getText());
        double teretanaKardio = Double.parseDouble(view5.getTeretanaKardio_tf().getText());
        double grupniFitnes = Double.parseDouble(view5.getGrupniFitnes_tf().getText());
        double crosFit = Double.parseDouble(view5.getCrosFit_tf().getText());
        double personalniTrener = Double.parseDouble(view5.getPersonalniTrener_tf().getText());

        model3.setTeretana(teretana);
        model3.setKardio(kardio);
        model3.setTeretanaKardio(teretanaKardio);
        model3.setGrupniFitnes(grupniFitnes);
        model3.setCrossfit(crosFit);
        model3.setPersonalniTrener(personalniTrener);
        return model3;
    }
    
    
    private void dodajUTabelu(ArrayList<Klijent>klijenti){
          DefaultTableModel model=(DefaultTableModel) view6.getTabela().getModel(); 
           Object red[]=new Object[7];
           
           for(int i= 0;i<klijenti.size();i++){
               red[0]=klijenti.get(i).getBrojKartice();
               red[1]=klijenti.get(i).getIme();
               red[2]=klijenti.get(i).getPrezime();
               red[3]=klijenti.get(i).getBrojGodina();
               red[4]=klijenti.get(i).getPol();
               red[5]=klijenti.get(i).getBrojMobilnog();
               red[6]=klijenti.get(i).getEmail();
               
               model.addRow(red);
           }
           
       
        }
    
    //Metoda za upis Racuna u fajl
    private void upisiRacunUFajl(Racun model4) {
        String racun = view4.racunUpisUFajlIzgled(model4);
        try {
            FileWriter fw = new FileWriter("TeretanaRacuni.txt", true);
            fw.write(racun);
            fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    
    //Metoda za upis Klijenta u fajl
    private void upisiKlijentaUFajl(Klijent model2) {
        String klijent = view4.klijentUpisUFajlIzgled(model2);
        try {
            FileWriter fw = new FileWriter("TeretanaKlijenti.txt", true);
            fw.write(klijent);
            fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    
    //Metoda za postavljanje Listenera 
    private void postaviSveListenereZaGlavniOkvir() {
        noviKlijentListenerGO();
        proveraListenerGO();
        obrisiListenerGO();
        prikaziListenerGO();
        odjaviSeListenerGO();
        sacuvajKlijentaLestenerNK();
        proveriKlijentaListenerPS();
        ukupnoZaNaplatuPS();
        naplataRacunaPS();
        proveriKlijentaListenerOP();
        obrisiKlijentaListenerOP();
        promeniCeneListenerOP();
        ucitajSveKarticeSK();
    }
    
    
    
    
    //Metoda za vreme i datum, nova nit
    private void datumIVreme() {

        Thread nit = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (1 < 2) {

                        Date vreme = new Date();
                        SimpleDateFormat formatDatum = new SimpleDateFormat("dd.MM.y.");
                        view2.getDatumPrikaz_lab().setText(formatDatum.format(vreme));
                        SimpleDateFormat formatVreme = new SimpleDateFormat("HH:mm:ss");
                        view2.getVremePrikaz_lab().setText(formatVreme.format(vreme));

                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        nit.start();

    }

}
