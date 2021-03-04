package view;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Pjevovic
 */
public class LogovanjeOkvir extends JFrame {

    private JPanel glavni_panel;
    private JLabel sifra_lab;
    private JLabel korisnickoIme_lab;
    private JLabel naslov_lab;
    private JTextField korisnickoIme_tf;
    private JPasswordField sifra_tf;
    private JButton ulogujMe_btn;

    public LogovanjeOkvir() {
        super();
        iscrtajOkvir();

    }

    private void iscrtajOkvir() {

        glavni_panel = new JPanel();
        sifra_lab = new JLabel();
        naslov_lab = new JLabel();
        korisnickoIme_lab = new JLabel();
        korisnickoIme_tf = new JTextField();
        sifra_tf = new JPasswordField();
        ulogujMe_btn = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        getContentPane().setLayout(null);

        glavni_panel.setBackground(new java.awt.Color(102, 102, 102));
        glavni_panel.setLayout(null);

        glavni_panel.setBackground(new java.awt.Color(102, 102, 102));

        sifra_lab.setBackground(new java.awt.Color(255, 255, 255));
        sifra_lab.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        sifra_lab.setForeground(new java.awt.Color(0, 0, 0));
        sifra_lab.setText("ŠIFRA:");

        korisnickoIme_lab.setBackground(new java.awt.Color(255, 255, 255));
        korisnickoIme_lab.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        korisnickoIme_lab.setForeground(new java.awt.Color(0, 0, 0));
        korisnickoIme_lab.setText("KORISNIČKO IME:");

        korisnickoIme_tf.setBackground(new java.awt.Color(204, 204, 204));
        korisnickoIme_tf.setFont(new java.awt.Font("Sitka Small", 0, 20)); // NOI18N
        korisnickoIme_tf.setForeground(new java.awt.Color(0, 0, 0));

        sifra_tf.setBackground(new java.awt.Color(204, 204, 204));
        sifra_tf.setFont(new java.awt.Font("Sitka Small", 0, 20)); // NOI18N
        sifra_tf.setForeground(new java.awt.Color(0, 0, 0));

        ulogujMe_btn.setFont(new java.awt.Font("Sitka Small", 1, 20)); // NOI18N
        ulogujMe_btn.setBackground(new java.awt.Color(0, 153, 51));
        ulogujMe_btn.setForeground(new java.awt.Color(0, 0, 0));
        ulogujMe_btn.setText("ULOGUJ ME");
        ulogujMe_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));

        naslov_lab.setBackground(new java.awt.Color(255, 255, 255));
        naslov_lab.setFont(new java.awt.Font("Felix Titling", Font.BOLD, 28)); // NOI18N
        naslov_lab.setForeground(new java.awt.Color(0, 0, 0));
        naslov_lab.setText("ULOGUJ SE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(glavni_panel);
        glavni_panel.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(sifra_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(sifra_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(korisnickoIme_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(korisnickoIme_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(160, 160, 160)
                                                .addComponent(ulogujMe_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(146, 146, 146)
                                                .addComponent(naslov_lab)))
                                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(naslov_lab)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(korisnickoIme_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(korisnickoIme_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(72, 72, 72)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(sifra_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sifra_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(109, 109, 109)
                                .addComponent(ulogujMe_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(glavni_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(glavni_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    //Geteri/Seteri
    public JTextField getKorisnickoIme_tf() {
        return korisnickoIme_tf;
    }

    public JPasswordField getSifra_tf() {
        return sifra_tf;
    }

    public JButton getUlogujMe_btn() {
        return ulogujMe_btn;
    }

    //metode
    
    //Metoda za prikaz poruke kod logovanja Zaposlenog
    public void logovanjePoruka(String opcija) {

        if (opcija.equalsIgnoreCase("da")) {
            JOptionPane.showMessageDialog(this, "Uspesno ste se ulogovali");
        } else {
            JOptionPane.showMessageDialog(this, "Niste se uspesno ulogovali");
            this.korisnickoIme_tf.setText("");
            this.sifra_tf.setText("");
        }
    }
}
