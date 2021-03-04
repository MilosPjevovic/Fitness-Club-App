
package view;

import java.awt.Font;
import javafx.scene.paint.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Pjevovic
 */
public class PrikaziSveKarticePanel extends JPanel {
    
    
                        
    
    private JLabel slika_lab;
    private JLabel naslov_lab;
    private JPanel glavni_panel;
    private JScrollPane tabela_ScrollPane1;
    private JTable tabela;
    private JButton ucitaj_btn;
   
    public PrikaziSveKarticePanel() {
        super();
        iscrtajPanel();
    }

  
                           
    private void iscrtajPanel() {

        glavni_panel = new JPanel();
        ucitaj_btn = new JButton();
        naslov_lab = new JLabel();
        tabela_ScrollPane1 = new JScrollPane();
        tabela = new JTable();
        slika_lab = new JLabel();

        setLayout(null);

        glavni_panel.setBackground(new java.awt.Color(102, 102, 102));
        glavni_panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        ucitaj_btn.setBackground(new java.awt.Color(0, 153, 51));
        ucitaj_btn.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        ucitaj_btn.setForeground(new java.awt.Color(0, 0, 0));
        ucitaj_btn.setText("UČITAJ");
        ucitaj_btn.setBorder(null);
        

        naslov_lab.setFont(new java.awt.Font("Felix Titling", Font.BOLD, 36)); // NOI18N
        naslov_lab.setForeground(new java.awt.Color(0, 0, 0));
        naslov_lab.setText("PRIKAŽI SVE ZAUZETE KARTICE");

        tabela.setBackground(new java.awt.Color(204, 204, 204));
        tabela.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        tabela.setFont(new java.awt.Font("Sitka Small", 1, 21)); // NOI18N
        tabela.setForeground(new java.awt.Color(0, 0, 0));
        JTableHeader header= tabela.getTableHeader();
       
        header.setBackground(java.awt.Color.ORANGE);
        header.setForeground(java.awt.Color.BLACK);
        header.setFont(new java.awt.Font("Sitka Small", 3, 24));
        
        tabela.setRowHeight(35);
        tabela.setShowGrid(true);
        tabela.setGridColor(java.awt.Color.black);
        tabela.setBackground(java.awt.Color.lightGray);
        tabela.setForeground(java.awt.Color.black);
        tabela.setSelectionBackground(java.awt.Color.GREEN);
        tabela.setSelectionForeground(java.awt.Color.black);
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
               
            },
            new String [] {
                "BR.KARTICE", "IME", "PREZIME", "GODINE", "POL", "BR.TEL.", "EMAIL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_ScrollPane1.setViewportView(tabela);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(glavni_panel);
        glavni_panel.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(naslov_lab)
                .addGap(405, 405, 405))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(613, 613, 613)
                        .addComponent(ucitaj_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(tabela_ScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(naslov_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(tabela_ScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(ucitaj_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        add(glavni_panel);
        glavni_panel.setBounds(110, 100, 1390, 820);

        slika_lab.setBackground(new java.awt.Color(204, 204, 204));
        slika_lab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/slika.jpg"))); // NOI18N
        add(slika_lab);
        slika_lab.setBounds(0, 0, 2600, 1390);
    }                       

                                  
    //Getteri/Setteri

    public JButton getUcitaj_btn() {
        return ucitaj_btn;
    }

    public JTable getTabela() {
        return tabela;
    }
    
    
    //Metoda za reset tabele
    
    public void resetujPanelPrikaziSveKartice(){
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
               
            },
            new String [] {
                "BR.KARTICE", "IME", "PREZIME", "GODINE", "POL", "BR.TEL.", "EMAIL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_ScrollPane1.setViewportView(tabela);
    }
                     
}
