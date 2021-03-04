
package view;


import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Pjevovic
 */
public class NoviKlijentPanel extends JPanel {

    
        
    
    private JPanel glavni_panel;
    private JLabel slika_lab;
    private JLabel naslov_lab;
    private JLabel email_lab;
    private JLabel ime_lab;
    private JLabel prezime_lab;
    private JLabel pol_lab;
    private JLabel brKartice_lab;
    private JLabel brMob_lab;
    private JLabel godine_lab;
    private JTextField brMob_tf;
    private JTextField email_tf;
    private JTextField godine_tf;
    private JTextField prezime_tf;
    private JTextField ime_tf;
    private JTextField brKartice_tf;
    private ButtonGroup polGrupa_rbtn;
    private JRadioButton muskiPol_rbtn;
    private JRadioButton zenskiPol_rbtn;
    private JButton sacuvaj_btn;
    
   
    
    
    public NoviKlijentPanel() {
        super();
        iscrtajPanel();
          
    }  
    
    private void iscrtajPanel(){
        glavni_panel = new JPanel();
        brMob_lab = new JLabel();
        brKartice_lab = new JLabel();
        prezime_lab = new JLabel();
        ime_lab = new JLabel();
        email_lab = new JLabel();
        pol_lab = new JLabel();
        naslov_lab = new JLabel();
        godine_lab = new JLabel();
        slika_lab = new JLabel();
        ime_tf = new JTextField();
        brMob_tf = new JTextField();
        email_tf = new JTextField();
        godine_tf = new JTextField();
        prezime_tf = new JTextField();
        brKartice_tf = new JTextField();
        polGrupa_rbtn = new ButtonGroup();
        zenskiPol_rbtn = new JRadioButton();
        muskiPol_rbtn = new JRadioButton();
        sacuvaj_btn = new JButton();
        

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        setLayout(null);

        glavni_panel.setBackground(new java.awt.Color(102, 102, 102));
        glavni_panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        zenskiPol_rbtn.setBackground(new java.awt.Color(153, 0, 153));
        zenskiPol_rbtn.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        zenskiPol_rbtn.setForeground(new java.awt.Color(0, 0, 0));
        zenskiPol_rbtn.setText("Ženski");
        zenskiPol_rbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));
        polGrupa_rbtn.add(zenskiPol_rbtn);
        
        muskiPol_rbtn.setBackground(new java.awt.Color(51, 153, 255));
        muskiPol_rbtn.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        muskiPol_rbtn.setForeground(new java.awt.Color(0, 0, 0));
        muskiPol_rbtn.setText("Muški");
        muskiPol_rbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));
        polGrupa_rbtn.add(muskiPol_rbtn);
        
        ime_tf.setBackground(new java.awt.Color(204, 204, 204));
        ime_tf.setFont(new java.awt.Font("Sitka Small", 0, 36)); // NOI18N
        ime_tf.setForeground(new java.awt.Color(0, 0, 0));
        ime_tf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));
        ime_tf.setCaretColor(new java.awt.Color(0, 0, 0));
        ime_tf.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        

        brMob_tf.setBackground(new java.awt.Color(204, 204, 204));
        brMob_tf.setFont(new java.awt.Font("Sitka Small", 0, 36)); // NOI18N
        brMob_tf.setForeground(new java.awt.Color(0, 0, 0));
        brMob_tf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));
        brMob_tf.setCaretColor(new java.awt.Color(0, 0, 0));
        brMob_tf.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        

        email_tf.setBackground(new java.awt.Color(204, 204, 204));
        email_tf.setFont(new java.awt.Font("Sitka Small", 0, 36)); // NOI18N
        email_tf.setForeground(new java.awt.Color(0, 0, 0));
        email_tf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));
        email_tf.setCaretColor(new java.awt.Color(0, 0, 0));
        email_tf.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        

        godine_tf.setBackground(new java.awt.Color(204, 204, 204));
        godine_tf.setFont(new java.awt.Font("Sitka Small", 0, 36)); // NOI18N
        godine_tf.setForeground(new java.awt.Color(0, 0, 0));
        godine_tf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));
        godine_tf.setCaretColor(new java.awt.Color(0, 0, 0));
        godine_tf.setDisabledTextColor(new java.awt.Color(0, 0, 0));
       

        prezime_tf.setBackground(new java.awt.Color(204, 204, 204));
        prezime_tf.setFont(new java.awt.Font("Sitka Small", 0, 36)); // NOI18N
        prezime_tf.setForeground(new java.awt.Color(0, 0, 0));
        prezime_tf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));
        prezime_tf.setCaretColor(new java.awt.Color(0, 0, 0));
        prezime_tf.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        

        brKartice_tf.setBackground(new java.awt.Color(204, 204, 204));
        brKartice_tf.setFont(new java.awt.Font("Sitka Small", 0, 36)); // NOI18N
        brKartice_tf.setForeground(new java.awt.Color(0, 0, 0));
        brKartice_tf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));
        brKartice_tf.setCaretColor(new java.awt.Color(0, 0, 0));
        brKartice_tf.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        

        sacuvaj_btn.setBackground(new java.awt.Color(0, 153, 51));
        sacuvaj_btn.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        sacuvaj_btn.setForeground(new java.awt.Color(0, 0, 0));
        sacuvaj_btn.setText("SAČUVAJ");
        sacuvaj_btn.setBorder(null);
        

        brMob_lab.setBackground(new java.awt.Color(255, 255, 255));
        brMob_lab.setFont(new java.awt.Font("Sitka Small", 0, 36)); // NOI18N
        brMob_lab.setForeground(new java.awt.Color(0, 0, 0));
        brMob_lab.setText("Br.Mob:");

        brKartice_lab.setBackground(new java.awt.Color(255, 255, 255));
        brKartice_lab.setFont(new java.awt.Font("Sitka Small", 0, 36)); // NOI18N
        brKartice_lab.setForeground(new java.awt.Color(0, 0, 0));
        brKartice_lab.setText("Br.Kartice:");

        prezime_lab.setBackground(new java.awt.Color(255, 255, 255));
        prezime_lab.setFont(new java.awt.Font("Sitka Small", 0, 36)); // NOI18N
        prezime_lab.setForeground(new java.awt.Color(0, 0, 0));
        prezime_lab.setText("Prezime:");

        ime_lab.setBackground(new java.awt.Color(255, 255, 255));
        ime_lab.setFont(new java.awt.Font("Sitka Small", 0, 36)); // NOI18N
        ime_lab.setForeground(new java.awt.Color(0, 0, 0));
        ime_lab.setText("Ime:");

        email_lab.setBackground(new java.awt.Color(255, 255, 255));
        email_lab.setFont(new java.awt.Font("Sitka Small", 0, 36)); // NOI18N
        email_lab.setForeground(new java.awt.Color(0, 0, 0));
        email_lab.setText("Email:");

        pol_lab.setBackground(new java.awt.Color(255, 255, 255));
        pol_lab.setFont(new java.awt.Font("Sitka Small", 0, 36)); // NOI18N
        pol_lab.setForeground(new java.awt.Color(0, 0, 0));
        pol_lab.setText("Pol: ");

        naslov_lab.setFont(new java.awt.Font("Felix Titling", Font.BOLD, 36)); // NOI18N
        naslov_lab.setForeground(new java.awt.Color(0, 0, 0));
        naslov_lab.setText("NOVI KLIJENT");

        godine_lab.setBackground(new java.awt.Color(255, 255, 255));
        godine_lab.setFont(new java.awt.Font("Sitka Small", 0, 36)); // NOI18N
        godine_lab.setForeground(new java.awt.Color(0, 0, 0));
        godine_lab.setText("Godine:");
        
           javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(glavni_panel);
        glavni_panel.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(brMob_lab)
                    .addComponent(brKartice_lab)
                    .addComponent(ime_lab))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ime_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prezime_lab))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(brMob_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(brKartice_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(email_lab)
                            .addComponent(godine_lab))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(godine_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prezime_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(133, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(pol_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(muskiPol_rbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(zenskiPol_rbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(566, 566, 566)
                        .addComponent(naslov_lab)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sacuvaj_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(naslov_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ime_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ime_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prezime_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prezime_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brMob_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brMob_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(godine_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(godine_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brKartice_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brKartice_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(123, 123, 123)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pol_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(muskiPol_rbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zenskiPol_rbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sacuvaj_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        
     

        add(glavni_panel);
        glavni_panel.setBounds(110, 100, 1390, 820);

        slika_lab.setBackground(new java.awt.Color(204, 204, 204));
        slika_lab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/slika.jpg"))); // NOI18N
        add(slika_lab);
        slika_lab.setBounds(0, 0, 2600, 1390);
    }

    
    //Geteri/Seteri

    public JTextField getBrKartice_tf() {
        return brKartice_tf;
    }

    public JTextField getBrMob_tf() {
        return brMob_tf;
    }

    public JTextField getEmail_tf() {
        return email_tf;
    }

    public JTextField getGodine_tf() {
        return godine_tf;
    }

    public JTextField getPrezime_tf() {
        return prezime_tf;
    }

    public JTextField getIme_tf() {
        return ime_tf;
    }

    public JRadioButton getMuskiPol_rbtn() {
        return muskiPol_rbtn;
    }

    public JRadioButton getZenskiPol_rbtn() {
        return zenskiPol_rbtn;
    }
    
    
    
    public JButton getSacuvaj_btn() {
        return sacuvaj_btn;
    }
    
    
    
    
    //Metode
    
    //Metoda za prikaz poruke kod registracije Klijenta
    public void registracijaKlijentaPoruka(String opcija){
        
        if(opcija.equalsIgnoreCase("da")){
            JOptionPane.showMessageDialog(this, "Uspesno ste registrovali Klijenta.");
            resetujPanelNoviKlijent();
        }
        else{
            JOptionPane.showMessageDialog(this, "Niste uspesno registrovali Klijenta.\nMorate da popunite sva polja!");
            
            
        }
    }
    
    //Metoda za resetovanje polja panela Novi Klijent
    public void resetujPanelNoviKlijent(){
       brMob_tf.setText("");
       email_tf.setText("");
       godine_tf.setText("");
       prezime_tf.setText("");
       ime_tf.setText("");
       brKartice_tf.setText("");
    }
    
    
}
