
package view;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import model.Cene;
import model.Klijent;

/**
 *
 * @author Pjevovic
 */
public class ObrisiPromeniPanel extends JPanel {
    
    private JPanel glavni_panel;
    private JPanel obrisi_panel;
    private JPanel promeniCene_panel;
    private JLabel slika_lab;
    private JLabel naslovObrisi_lab;
    private JLabel naslovPromeniCene_lab;
    private JLabel teretana_lab;
    private JLabel kardio_lab;
    private JLabel teretanaKardio_lab;
    private JLabel brKartice_lab;
    private JLabel grupniFitnes_lab;
    private JLabel crosFit_lab;
    private JLabel personalniTrener_lab;
    private JLabel din1_lab;
    private JLabel din2_lab;
    private JLabel din3_lab;
    private JLabel din4_lab;
    private JLabel din5_lab;
    private JLabel din6_lab;
    private JTextField teretana_tf;
    private JTextField kardio_tf;
    private JTextField teretanaKardio_tf;
    private JTextField grupniFitnes_tf;
    private JTextField crosFit_tf;
    private JTextField personalniTrener_tf;
    private JTextField brKartice_tf;
    private JScrollPane podaci_jScrollPane;
    private JList<String> podaci_jList;
    private JButton proveri_btn;
    private JButton obrisi_btn;
    private JButton promeni_btn;
    
    
    
    
     public ObrisiPromeniPanel() {
        super();
        iscrtajPanel();
        
    }
    
    
    
    private void iscrtajPanel(){
        
        glavni_panel = new JPanel();
        obrisi_panel = new JPanel();
        promeniCene_panel = new JPanel();
        slika_lab = new JLabel();
        naslovObrisi_lab = new JLabel();
        naslovPromeniCene_lab = new JLabel();
        teretana_lab = new JLabel();
        kardio_lab = new JLabel();
        teretanaKardio_lab = new JLabel();
        brKartice_lab = new JLabel();
        grupniFitnes_lab = new JLabel();
        crosFit_lab = new JLabel();
        personalniTrener_lab = new JLabel();
        din1_lab = new JLabel();
        din2_lab = new JLabel();
        din3_lab = new JLabel();
        din4_lab = new JLabel();
        din5_lab = new JLabel();
        din6_lab = new JLabel();
        teretana_tf = new JTextField();
        kardio_tf = new JTextField();
        teretanaKardio_tf = new JTextField();
        grupniFitnes_tf = new JTextField();
        crosFit_tf = new JTextField();
        personalniTrener_tf = new JTextField();
        brKartice_tf = new JTextField();
        podaci_jScrollPane = new JScrollPane();
        podaci_jList = new JList<>();
        proveri_btn = new JButton();
        obrisi_btn = new JButton();
        promeni_btn = new JButton();
        
       
        
        
        
        
        setLayout(null);

        glavni_panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        glavni_panel.setLayout(null);

        obrisi_panel.setBackground(new java.awt.Color(102, 102, 102));
        obrisi_panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        podaci_jList.setBackground(new java.awt.Color(204, 204, 204));
        podaci_jList.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));
        podaci_jList.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        podaci_jList.setForeground(new java.awt.Color(0, 0, 0));
        podaci_jList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Ime i Prezime: " ,"Godine: " ,"Pol: ", "Br.Mob: ", "Email: ", "Tip treninga: ", "Personalni trener: ", "Članarina vazi do: " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        podaci_jScrollPane.setViewportView(podaci_jList);

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
        

        obrisi_btn.setBackground(new java.awt.Color(204, 0, 0));
        obrisi_btn.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        obrisi_btn.setForeground(new java.awt.Color(0, 0, 0));
        obrisi_btn.setText("OBRIŠI");
        obrisi_btn.setBorder(null);
        
        

        naslovObrisi_lab.setFont(new java.awt.Font("Felix Titling", Font.BOLD, 36)); // NOI18N
        naslovObrisi_lab.setForeground(new java.awt.Color(0, 0, 0));
        naslovObrisi_lab.setText("OBRIŠI SA KARTICE");

        proveri_btn.setBackground(new java.awt.Color(0, 153, 51));
        proveri_btn.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        proveri_btn.setForeground(new java.awt.Color(0, 0, 0));
        proveri_btn.setText("PROVERI");
        proveri_btn.setBorder(null);
        
       

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(obrisi_panel);
        obrisi_panel.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(proveri_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(obrisi_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(podaci_jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(brKartice_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(brKartice_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(naslovObrisi_lab)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(naslovObrisi_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brKartice_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brKartice_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(podaci_jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(obrisi_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proveri_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        glavni_panel.add(obrisi_panel);
        obrisi_panel.setBounds(140, 120, 680, 750);

        promeniCene_panel.setBackground(new java.awt.Color(102, 102, 102));
        promeniCene_panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        promeni_btn.setBackground(new java.awt.Color(0, 153, 255));
        promeni_btn.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        promeni_btn.setForeground(new java.awt.Color(0, 0, 0));
        promeni_btn.setText("PROMENI");
        promeni_btn.setBorder(null);
        

        naslovPromeniCene_lab.setFont(new java.awt.Font("Felix Titling", Font.BOLD, 36)); // NOI18N
        naslovPromeniCene_lab.setForeground(new java.awt.Color(0, 0, 0));
        naslovPromeniCene_lab.setText("PROMENI CENE");

        teretana_tf.setBackground(new java.awt.Color(204, 204, 204));
        teretana_tf.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        teretana_tf.setForeground(new java.awt.Color(0, 0, 0));
        //teretana_tf.setText("2000");

        kardio_tf.setBackground(new java.awt.Color(204, 204, 204));
        kardio_tf.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        kardio_tf.setForeground(new java.awt.Color(0, 0, 0));
        //kardio_tf.setText("2000");

        teretanaKardio_tf.setBackground(new java.awt.Color(204, 204, 204));
        teretanaKardio_tf.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        teretanaKardio_tf.setForeground(new java.awt.Color(0, 0, 0));
        //teretanaKardio_tf.setText("2000");

        grupniFitnes_tf.setBackground(new java.awt.Color(204, 204, 204));
        grupniFitnes_tf.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        grupniFitnes_tf.setForeground(new java.awt.Color(0, 0, 0));
        //grupniFitnes_tf.setText("2000");

        crosFit_tf.setBackground(new java.awt.Color(204, 204, 204));
        crosFit_tf.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        crosFit_tf.setForeground(new java.awt.Color(0, 0, 0));
        //crosFit_tf.setText("2000");

        teretana_lab.setBackground(new java.awt.Color(0, 0, 0));
        teretana_lab.setFont(new java.awt.Font("Sitka Small", 1, 22)); // NOI18N
        teretana_lab.setForeground(new java.awt.Color(0, 0, 0));
        teretana_lab.setText("TERTANA");

        kardio_lab.setBackground(new java.awt.Color(0, 0, 0));
        kardio_lab.setFont(new java.awt.Font("Sitka Small", 1, 22)); // NOI18N
        kardio_lab.setForeground(new java.awt.Color(0, 0, 0));
        kardio_lab.setText("KARDIO");

        teretanaKardio_lab.setBackground(new java.awt.Color(0, 0, 0));
        teretanaKardio_lab.setFont(new java.awt.Font("Sitka Small", 1, 22)); // NOI18N
        teretanaKardio_lab.setForeground(new java.awt.Color(0, 0, 0));
        teretanaKardio_lab.setText("TERETANA + KARDIO");

        grupniFitnes_lab.setBackground(new java.awt.Color(0, 0, 0));
        grupniFitnes_lab.setFont(new java.awt.Font("Sitka Small", 1, 22)); // NOI18N
        grupniFitnes_lab.setForeground(new java.awt.Color(0, 0, 0));
        grupniFitnes_lab.setText("GRUPNI FITNESS");

        crosFit_lab.setBackground(new java.awt.Color(0, 0, 0));
        crosFit_lab.setFont(new java.awt.Font("Sitka Small", 1, 22)); // NOI18N
        crosFit_lab.setForeground(new java.awt.Color(0, 0, 0));
        crosFit_lab.setText("CROSSFIT");

        din1_lab.setBackground(new java.awt.Color(204, 204, 204));
        din1_lab.setFont(new java.awt.Font("Sitka Small", 1, 22)); // NOI18N
        din1_lab.setForeground(new java.awt.Color(0, 0, 0));
        din1_lab.setText("DIN.");

        din2_lab.setBackground(new java.awt.Color(204, 204, 204));
        din2_lab.setFont(new java.awt.Font("Sitka Small", 1, 22)); // NOI18N
        din2_lab.setForeground(new java.awt.Color(0, 0, 0));
        din2_lab.setText("DIN.");

        din3_lab.setBackground(new java.awt.Color(204, 204, 204));
        din3_lab.setFont(new java.awt.Font("Sitka Small", 1, 22)); // NOI18N
        din3_lab.setForeground(new java.awt.Color(0, 0, 0));
        din3_lab.setText("DIN.");

        din4_lab.setBackground(new java.awt.Color(204, 204, 204));
        din4_lab.setFont(new java.awt.Font("Sitka Small", 1, 22)); // NOI18N
        din4_lab.setForeground(new java.awt.Color(0, 0, 0));
        din4_lab.setText("DIN.");

        din5_lab.setBackground(new java.awt.Color(204, 204, 204));
        din5_lab.setFont(new java.awt.Font("Sitka Small", 1, 22)); // NOI18N
        din5_lab.setForeground(new java.awt.Color(0, 0, 0));
        din5_lab.setText("DIN.");

        personalniTrener_tf.setBackground(new java.awt.Color(204, 204, 204));
        personalniTrener_tf.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        personalniTrener_tf.setForeground(new java.awt.Color(0, 0, 0));
  

        personalniTrener_lab.setBackground(new java.awt.Color(0, 0, 0));
        personalniTrener_lab.setFont(new java.awt.Font("Sitka Small", 1, 22)); // NOI18N
        personalniTrener_lab.setForeground(new java.awt.Color(0, 0, 0));
        personalniTrener_lab.setText("PERSONALNI TRENER");

        din6_lab.setBackground(new java.awt.Color(204, 204, 204));
        din6_lab.setFont(new java.awt.Font("Sitka Small", 1, 22)); // NOI18N
        din6_lab.setForeground(new java.awt.Color(0, 0, 0));
        din6_lab.setText("DIN.");
        
        
       
        
        
        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(promeniCene_panel);
        promeniCene_panel.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(naslovPromeniCene_lab))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(promeni_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(grupniFitnes_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kardio_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(teretana_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(crosFit_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(personalniTrener_lab))
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(teretanaKardio_lab)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(kardio_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teretanaKardio_tf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teretana_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(grupniFitnes_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(crosFit_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(personalniTrener_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(din1_lab)
                            .addComponent(din2_lab)
                            .addComponent(din3_lab)
                            .addComponent(din4_lab)
                            .addComponent(din5_lab)
                            .addComponent(din6_lab))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(naslovPromeniCene_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(teretana_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(din1_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teretana_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kardio_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kardio_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(din2_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(din3_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(teretanaKardio_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teretanaKardio_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grupniFitnes_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(din4_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grupniFitnes_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(crosFit_lab, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                        .addComponent(din5_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(crosFit_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personalniTrener_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personalniTrener_lab, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(din6_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(promeni_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        glavni_panel.add(promeniCene_panel);
        promeniCene_panel.setBounds(970, 120, 540, 750);

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

    public JButton getObrisi_btn() {
        return obrisi_btn;
    }

    public JButton getPromeni_btn() {
        return promeni_btn;
    }

    public JTextField getTeretana_tf() {
        return teretana_tf;
    }

    public JTextField getKardio_tf() {
        return kardio_tf;
    }

    public JTextField getTeretanaKardio_tf() {
        return teretanaKardio_tf;
    }

    public JTextField getGrupniFitnes_tf() {
        return grupniFitnes_tf;
    }

    public JTextField getCrosFit_tf() {
        return crosFit_tf;
    }

    public JTextField getPersonalniTrener_tf() {
        return personalniTrener_tf;
    }

    
    //Metode
    
    //Metoda za prikaz poruke kod brisanja Klijenta
    public void obrisiKlijentaPoruka(String opcija){
        
        if(opcija.equalsIgnoreCase("da")){
            JOptionPane.showMessageDialog(this, "Uspesno ste izbrisali Klijenta sa kartice.");
           resetujPanelObrisiPromeni();
        }
        else{
            JOptionPane.showMessageDialog(this, "Niste uspesno obrisali Klijenta sa kartice.");
            
            
        }
    }
    
    //Metoda za prikaz poruke kod promene cena
    public void promenaCenePoruka(String opcija){
        
        if(opcija.equalsIgnoreCase("da")){
            JOptionPane.showMessageDialog(this, "Uspesno ste promenili cene.");
           resetujPanelObrisiPromeni();
        }
        else{
            JOptionPane.showMessageDialog(this, "Niste uspesno promenili cene.");
            
            
        }
    }
    
    //Metoda za prikaz cena u panelu Obrisi Promeni
    public void prikaziCene(Cene model3){
        
        teretana_tf.setText(String.format("%.2f", model3.getTeretana()));
        kardio_tf.setText(String.format("%.2f", model3.getKardio()));
        teretanaKardio_tf.setText(String.format("%.2f", model3.getTeretanaKardio()));
        grupniFitnes_tf.setText(String.format("%.2f", model3.getGrupniFitnes()));
        crosFit_tf.setText(String.format("%.2f", model3.getCrossfit()));
        personalniTrener_tf.setText(String.format("%.2f", model3.getPersonalniTrener()));
        
    }
    
    
    //Metoda koja resetuje polja u panelu Obrisi Promeni
    public void resetujPanelObrisiPromeni(){
       brKartice_tf.setText("");
       podaci_jList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Ime i Prezime: " ,"Godine: " ,"Pol: ", "Br.Mob: ", "Email: ", "Tip treninga: ", "Personalni trener: ", "Članarina vazi do: " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
    }
    
    //Metoda za prikaz Klijenta u panelu Obrisi Promeni
    public void prikaziKlijenta(Klijent model2) {
        
        podaci_jList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Ime i Prezime: "+model2.getIme()+" "+model2.getPrezime()+"" ,"Godine: "+model2.getBrojGodina()+" " ,"Pol: "+model2.getPol()+"", "Br.Mob: "+model2.getBrojMobilnog()+" ", 
                "Email: "+model2.getEmail()+"", "Tip treninga: "+model2.getTipTreninga()+"", "Personalni trener: "+model2.getTrener()+"", "Članarina vazi do: "+model2.getClanarina()+"" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
    }
    
}
