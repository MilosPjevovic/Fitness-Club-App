package baza;

import java.util.ArrayList;
import java.util.List;
import model.Cene;
import model.Klijent;
import model.Racun;
import model.Zaposleni;

import org.hibernate.Query;
import org.hibernate.Session;
import view.LogovanjeOkvir;
import view.NoviKlijentPanel;

/**
 *
 * @author Pjevovic
 */
public class BazaUpiti {
    
    //Metoda za proveru da li ima zaposlenog sa tim korisnickim imenom i sifrom
    public static Zaposleni proveriZaposlenog(LogovanjeOkvir view1) {

        Zaposleni z = null;

        try {
            Session sesija = HibernateUtil.getSessionFactory().openSession();

            sesija.beginTransaction();

            String upit = "from Zaposleni where korisnickoIme = :korisnickoIme and sifra = :sifra";
            Query query = sesija.createQuery(upit);
            query.setParameter("korisnickoIme", view1.getKorisnickoIme_tf().getText());
            query.setParameter("sifra", view1.getSifra_tf().getText());

            List<Zaposleni> list = query.list();
            z = list.get(0);

            if (z == null) {
                return z;
            }
            sesija.getTransaction().commit();

            if (sesija.isOpen()) {
                sesija.close();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return z;
    }
    
    //Metoda koja upisuje klijenta u bazu
    public static boolean sacuvajKlijentaUBazu(NoviKlijentPanel view3, Klijent model2) {

        String pol = "";

        try {
            Session sesija = HibernateUtil.getSessionFactory().openSession();

            sesija.beginTransaction();

            if (view3.getMuskiPol_rbtn().isSelected()) {
                pol = "Muski";
            }
            if (view3.getZenskiPol_rbtn().isSelected()) {
                pol = "zenski";
            }

            Klijent klijent = new Klijent(Integer.parseInt(view3.getBrKartice_tf().getText()), view3.getIme_tf().getText(),
                    view3.getPrezime_tf().getText(), view3.getBrMob_tf().getText(), view3.getGodine_tf().getText(), view3.getEmail_tf().getText(), pol, "/", "/", "/");

            sesija.save(model2);

            sesija.getTransaction().commit();

            if (sesija.isOpen()) {
                sesija.close();

            }

            return true;

        } catch (Exception e) {

            e.printStackTrace();

        }

        return false;
    }
    
    
    //Metoda koja dovlaci podatke o klijentu iz baze 
    public static Klijent proveriKlijenta(int brKartice) {
        Klijent klijent = null;

        try {
            Session sesija = HibernateUtil.getSessionFactory().openSession();

            sesija.beginTransaction();

            klijent = (Klijent) sesija.load(Klijent.class, brKartice);
            System.out.println(klijent);

            sesija.getTransaction().commit();

            if (sesija.isOpen()) {
                sesija.close();

            }
            return klijent;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return klijent;
    }

    
    //Metoda koja dovlaci podatke o cenama iz baze
    public static Cene ucitajCene() {
        Cene cene = null;
        try {
            Session sesija = HibernateUtil.getSessionFactory().openSession();

            sesija.beginTransaction();

            cene = (Cene) sesija.load(Cene.class, 1);
            System.out.println(cene);

            sesija.getTransaction().commit();

            if (sesija.isOpen()) {
                sesija.close();
                return cene;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cene;

    }
    
    //Metoda koja upisuje podatke o racunu u bazu
    public static boolean upisiRacunUBazu(Racun model4) {

        try {
            Session sesija = HibernateUtil.getSessionFactory().openSession();

            sesija.beginTransaction();

            sesija.save(model4);

            sesija.getTransaction().commit();

            if (sesija.isOpen()) {
                sesija.close();

            }

            return true;

        } catch (Exception e) {

            e.printStackTrace();

        }

        return false;

    }
    
    //Metoda koja menja podatke odredjenog klijenta u bazi
    public static boolean izmeniKlijenta(Klijent model2) {
        try {
            Session sesija = HibernateUtil.getSessionFactory().openSession();

            sesija.beginTransaction();

            sesija.update(model2);

            sesija.getTransaction().commit();

            if (sesija.isOpen()) {
                sesija.close();

            }

            return true;

        } catch (Exception e) {

            e.printStackTrace();

        }

        return false;

    }
    
    
    //Metoda koja brise odredjenog klijenta u bazi
    public static boolean obrisiKlijenta(Klijent model2) {
        try {
            Session sesija = HibernateUtil.getSessionFactory().openSession();

            sesija.beginTransaction();

            sesija.delete(model2);

            sesija.getTransaction().commit();

            if (sesija.isOpen()) {
                sesija.close();
            }

            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
    
    
    //Metoda koja menja odredjene cene u bazi
    public static boolean promeniCene(Cene model3) {

        try {
            Session sesija = HibernateUtil.getSessionFactory().openSession();

            sesija.beginTransaction();

            sesija.update(model3);

            sesija.getTransaction().commit();

            if (sesija.isOpen()) {
                sesija.close();

            }

            return true;

        } catch (Exception e) {

            e.printStackTrace();

        }

        return false;

    }

    public static ArrayList<Klijent> ucitajSveIzTabeleKlijent() {
       
        try{
        Session sesija = HibernateUtil.getSessionFactory().openSession();

            sesija.beginTransaction();

            String upit = "from Klijent";
            Query query = sesija.createQuery(upit);
           
           

            ArrayList<Klijent> zaposleni= (ArrayList<Klijent>) query.list();
           

            
            
            sesija.getTransaction().commit();

            if (sesija.isOpen()) {
                sesija.close();
                
                return zaposleni;
    }
        }catch(Exception e){
            e.printStackTrace();
        }
          return null;
}


}