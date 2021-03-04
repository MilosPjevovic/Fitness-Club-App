
package view;


import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import model.Klijent;
import model.Racun;


/**
 *
 * @author Pjevovic
 */
public class ProveraStatusaPanel  extends JPanel{
        
    
    private JPanel glavni_panel;
    private JPanel provera_panel;
    private JPanel uplata_panel;
    private JLabel slika_lab;
    private JLabel naslovProvera_lab;
    private JLabel naslovUplata_lab;
    private JLabel tipTreninga_lab;
    private JLabel dan_lab;
    private JLabel mesec_lab;
    private JLabel godina_lab;
    private JLabel brKartice_lab;
    private JLabel din_lab;
    private JLabel zbir_lab;
    private JTextField brKartice_tf;
    private JScrollPane podaci_ScrollPane;
    private JList<String> podaci_jList;
    private JComboBox<String> tipTreninga_jComboBox;
    private JComboBox<String> dan_jComboBox;
    private JComboBox<String> mesec_jComboBox;
    private JComboBox<String> godina_jComboBox;
    private JRadioButton personalniTrener_rbtn;
    private JButton proveri_btn;
    private JButton ukupno_btn;
    private JButton racun_btn;
   
    
    
    
    
    public ProveraStatusaPanel() {
          super();
          iscrtajPanel();
            
    }
    
    private void iscrtajPanel(){
        
        glavni_panel = new JPanel();
        provera_panel = new JPanel();
        uplata_panel = new JPanel();
        slika_lab = new JLabel();
        naslovProvera_lab = new JLabel();
        naslovUplata_lab = new JLabel();
        tipTreninga_lab = new JLabel();
        dan_lab = new JLabel();
        brKartice_lab = new JLabel();
        mesec_lab = new JLabel();
        godina_lab = new JLabel();
        din_lab = new JLabel();
        zbir_lab = new JLabel();
        brKartice_tf = new JTextField();
        podaci_ScrollPane = new JScrollPane();
        podaci_jList = new JList<>();
        tipTreninga_jComboBox = new JComboBox<>();
        dan_jComboBox = new JComboBox<>();
        mesec_jComboBox = new JComboBox<>();
        godina_jComboBox = new JComboBox<>();
        personalniTrener_rbtn = new JRadioButton();
        proveri_btn = new JButton();
        ukupno_btn = new JButton();
        racun_btn = new JButton();
        
        

        
        setLayout(null);

        glavni_panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        glavni_panel.setLayout(null);

        provera_panel.setBackground(new java.awt.Color(102, 102, 102));
        provera_panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        podaci_jList.setBackground(new java.awt.Color(204, 204, 204));
        podaci_jList.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));
        podaci_jList.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        podaci_jList.setForeground(new java.awt.Color(0, 0, 0));
        podaci_jList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Ime i Prezime: " ,"Godine: " ,"Pol: ", "Br.Mob: ", "Email: ", "Tip treninga: ", "Personalni trener: ", "Članarina vazi do: " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        podaci_ScrollPane.setViewportView(podaci_jList);

        brKartice_lab.setBackground(new java.awt.Color(255, 255, 255));
        brKartice_lab.setFont(new java.awt.Font("Sitka Small", 0, 36)); // NOI18N
        brKartice_lab.setForeground(new java.awt.Color(0, 0, 0));
        brKartice_lab.setText("Br.Kartice:");

        brKartice_tf.setBackground(new java.awt.Color(204, 204, 204));
        brKartice_tf.setFont(new java.awt.Font("Sitka Small", 0, 36)); // NOI18N
        brKartice_tf.setForeground(new java.awt.Color(0, 0, 0));
        brKartice_tf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));
        brKartice_tf.setCaretColor(new java.awt.Color(0, 0, 0));
        brKartice_tf.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        

        proveri_btn.setBackground(new java.awt.Color(0, 153, 51));
        proveri_btn.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        proveri_btn.setForeground(new java.awt.Color(0, 0, 0));
        proveri_btn.setText("PROVERI");
        proveri_btn.setBorder(null);
        
        
       

        naslovProvera_lab.setFont(new java.awt.Font("Felix Titling", Font.BOLD, 36)); // NOI18N
        naslovProvera_lab.setForeground(new java.awt.Color(0, 0, 0));
        naslovProvera_lab.setText("PROVERA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(provera_panel);
        provera_panel.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(naslovProvera_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(252, 252, 252))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(proveri_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(255, 255, 255))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(brKartice_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(brKartice_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(podaci_ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(naslovProvera_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brKartice_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brKartice_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(podaci_ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(proveri_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        glavni_panel.add(provera_panel);
        provera_panel.setBounds(140, 120, 680, 750);

        uplata_panel.setBackground(new java.awt.Color(102, 102, 102));
        uplata_panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        tipTreninga_jComboBox.setBackground(new java.awt.Color(102, 102, 102));
        tipTreninga_jComboBox.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        tipTreninga_jComboBox.setForeground(new java.awt.Color(255, 255, 255));
        tipTreninga_jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teretana", "Kardio", "Teretana + Kardio", "Grupni Fitnes", "CrossFit", " " }));
        tipTreninga_jComboBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));
        

        dan_jComboBox.setBackground(new java.awt.Color(102, 102, 102));
        dan_jComboBox.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        dan_jComboBox.setForeground(new java.awt.Color(255, 255, 255));
        dan_jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));
        dan_jComboBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));

        mesec_jComboBox.setBackground(new java.awt.Color(102, 102, 102));
        mesec_jComboBox.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        mesec_jComboBox.setForeground(new java.awt.Color(255, 255, 255));
        mesec_jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));
        mesec_jComboBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));

        godina_jComboBox.setBackground(new java.awt.Color(102, 102, 102));
        godina_jComboBox.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        godina_jComboBox.setForeground(new java.awt.Color(255, 255, 255));
        godina_jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031" }));
        godina_jComboBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));
        

        naslovUplata_lab.setFont(new java.awt.Font("Felix Titling", Font.BOLD, 36)); // NOI18N
        naslovUplata_lab.setForeground(new java.awt.Color(0, 0, 0));
        naslovUplata_lab.setText("UPLATA");

        tipTreninga_lab.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        tipTreninga_lab.setForeground(new java.awt.Color(0, 0, 0));
        tipTreninga_lab.setText("Tip treninga:");

        dan_lab.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        dan_lab.setForeground(new java.awt.Color(0, 0, 0));
        dan_lab.setText("Dan:");

        mesec_lab.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        mesec_lab.setForeground(new java.awt.Color(0, 0, 0));
        mesec_lab.setText("Mesec:");

        godina_lab.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        godina_lab.setForeground(new java.awt.Color(0, 0, 0));
        godina_lab.setText("Godina:");

        personalniTrener_rbtn.setBackground(new java.awt.Color(102, 102, 102));
        personalniTrener_rbtn.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        personalniTrener_rbtn.setForeground(new java.awt.Color(0, 0, 0));
        personalniTrener_rbtn.setText("Personalni trener");

        ukupno_btn.setBackground(new java.awt.Color(255, 153, 0));
        ukupno_btn.setFont(new java.awt.Font("Sitka Small", 1, 23)); // NOI18N
        ukupno_btn.setForeground(new java.awt.Color(0, 0, 0));
        ukupno_btn.setText("UKUPNO");
        
        

        racun_btn.setBackground(new java.awt.Color(0, 153, 255));
        racun_btn.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        racun_btn.setForeground(new java.awt.Color(0, 0, 0));
        racun_btn.setText("RAČUN");
        racun_btn.setBorder(null);
        
        

        din_lab.setBackground(new java.awt.Color(204, 204, 204));
        din_lab.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        din_lab.setForeground(new java.awt.Color(0, 0, 0));
        din_lab.setText("DIN.");

        zbir_lab.setBackground(new java.awt.Color(204, 204, 204));
        zbir_lab.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        zbir_lab.setForeground(new java.awt.Color(0, 0, 0));
        zbir_lab.setText("0.00");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(uplata_panel);
        uplata_panel.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(naslovUplata_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mesec_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(godina_jComboBox, 0, 350, Short.MAX_VALUE)
                                .addComponent(dan_jComboBox, 0, 350, Short.MAX_VALUE)
                                .addComponent(tipTreninga_jComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tipTreninga_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(godina_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mesec_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dan_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(personalniTrener_rbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(69, 69, 69))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(ukupno_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(zbir_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(din_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(racun_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(naslovUplata_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(tipTreninga_lab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipTreninga_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dan_lab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dan_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mesec_lab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mesec_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(godina_lab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(godina_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(personalniTrener_rbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(din_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zbir_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ukupno_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(racun_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        glavni_panel.add(uplata_panel);
        uplata_panel.setBounds(970, 120, 540, 750);

        slika_lab.setBackground(new java.awt.Color(204, 204, 204));
        slika_lab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/slika.jpg"))); // NOI18N
        glavni_panel.add(slika_lab);
        slika_lab.setBounds(0, 0, 2560, 1390);

        add(glavni_panel);
        glavni_panel.setBounds(0, 0, 2690, 1340);
    }
    
    
    //Getteri/Setteri
    
    public JTextField getBrKartice_tf() {
        return brKartice_tf;
    }

    public JButton getProveri_btn() {
        return proveri_btn;
    }

    public JLabel getZbir_lab() {
        return zbir_lab;
    }

    public JComboBox<String> getTipTreninga_jComboBox() {
        return tipTreninga_jComboBox;
    }

    public JComboBox<String> getDan_jComboBox() {
        return dan_jComboBox;
    }

    public JComboBox<String> getMesec_jComboBox() {
        return mesec_jComboBox;
    }

    public JComboBox<String> getGodina_jComboBox() {
        return godina_jComboBox;
    }

    public JRadioButton getPersonalniTrener_rbtn() {
        return personalniTrener_rbtn;
    }

    public JButton getUkupno_btn() {
        return ukupno_btn;
    }

    public JButton getRacun_btn() {
        return racun_btn;
    }
    
    
    //Metode
    
    //Metoda za prikaz kod uplate clanarine u panelu Provera Statusa
    public void uplataClanarinePoruka(String opcija){
        
        if(opcija.equalsIgnoreCase("da")){
            JOptionPane.showMessageDialog(this, "Uspesno ste naplatili clanarinu.\nIstampali ste racun.");
           resetujPanelProveraStatusa();
        }
        else{
            JOptionPane.showMessageDialog(this, "Niste uspesno naplatili clanarinu\nNiste istampali racun!");
            
            
        }
    }
    
    //Metoda za formu prikaza Racuna u fajlu
    public String racunUpisUFajlIzgled(Racun model4){
       String racun="\n-------------------------------\n"
               + "-------------RACUN-------------\n"
               + "Broj racuna: "+model4.getId()+"\n"
               + "Tip treninga: "+model4.getTipTreninga()+"\n"
               + "Personalni trener: "+model4.getPersonalniTrener()+"\n"
               + "Cena: "+model4.getCena()+"\n"
               + "Datum: "+model4.getDatum()+"\n"
               + "Vreme: "+model4.getVreme()+"\n"
               + "-------------------------------";
        return racun;
    }
    
    //Metoda za formu prikaza Klijenta u fajlu
    public String klijentUpisUFajlIzgled(Klijent model2) {
        String klijent="\n-------------------------------\n"
                + "------------KLIJENT------------\n"
                + "Ime: "+model2.getIme()+"\n"
                + "Prezime: "+model2.getPrezime()+"\n"
                + "Godine: "+model2.getBrojGodina()+"\n"
                + "Broj telefona: "+model2.getBrojMobilnog()+"\n"
                + "Email: "+model2.getEmail()+"\n"
                + "-------------------------------";
        return klijent;
    }
    
    //Metoda za resotovanje polja u panelu Provera Statusa
    public void resetujPanelProveraStatusa(){
            brKartice_tf.setText("");
            podaci_jList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Ime i Prezime: " ,"Godine: " ,"Pol: ", "Br.Mob: ", "Email: ", "Tip treninga: ", "Personalni trener: ", "Članarina vazi do: " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
       
       zbir_lab.setText("0.00");
    } 
    
    //Metoda za prikaz Klijenta u panelu Provera Statusa
    public void prikaziKlijenta(Klijent model2) {
        
        podaci_jList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Ime i Prezime: "+model2.getIme()+" "+model2.getPrezime()+"" ,"Godine: "+model2.getBrojGodina()+" " ,"Pol: "+model2.getPol()+"", "Br.Mob: "+model2.getBrojMobilnog()+" ", 
                "Email: "+model2.getEmail()+"", "Tip treninga: "+model2.getTipTreninga()+"", "Personalni trener: "+model2.getTrener()+"", "Članarina vazi do: "+model2.getClanarina()+"" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
    }

    









}
 
