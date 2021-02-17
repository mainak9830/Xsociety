/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mainak
 * Name-Mainak Adak
 * Roll-97
 * sec-A
 * Team-Xsociety
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;
public class SellBookUI extends javax.swing.JFrame {

    /**
     * Creates new form SellBookUI
     */
    private DisplayManager HeadMgr;
    private StoreManager SM;
    public SellBookUI(DisplayManager ob,StoreManager ob1) {
        HeadMgr = ob;
        SM = ob1;
        initComponents();
        this.setTitle("SellBookUI - Mainak Adak 97");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        this.setSize(width/2, 700);
        JButton [] btns = { HomeB,HomeB1,HomeB2,HomeB3,HomeB4};
        for (JButton btn : btns){
            btn.setBackground(new Color(7,95,99));
            btn.setUI(new BasicButtonUI());
            btn.addMouseListener(new MouseListener() {

                @Override
                public void mouseClicked(MouseEvent me) {
                    }

                @Override
                public void mousePressed(MouseEvent me) {
                   }

                @Override
                public void mouseReleased(MouseEvent me) {
                    }

                @Override
                public void mouseEntered(MouseEvent me) {
                    btn.setBackground(new Color(255,137,137));
                    }

                @Override
                public void mouseExited(MouseEvent me) {
                    btn.setBackground(new Color(7,95,99));
                   }
            } );
        }
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BaseUI = new javax.swing.JPanel();
        options = new javax.swing.JPanel();
        HomeB = new javax.swing.JButton();
        HomeB1 = new javax.swing.JButton();
        HomeB2 = new javax.swing.JButton();
        HomeB3 = new javax.swing.JButton();
        HomeB4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Xsociety_97");
        setPreferredSize(new java.awt.Dimension(1000, 600));

        BaseUI.setBackground(new java.awt.Color(250, 208, 90));
        BaseUI.setPreferredSize(new java.awt.Dimension(1000, 600));

        options.setBackground(new java.awt.Color(7, 95, 99));

        HomeB.setBackground(new java.awt.Color(7, 95, 99));
        HomeB.setForeground(new java.awt.Color(7, 95, 99));
        HomeB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/open-menu.png"))); // NOI18N
        HomeB.setBorder(null);
        HomeB.setPreferredSize(new java.awt.Dimension(50, 50));
        HomeB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeBMouseClicked(evt);
            }           
        });

        HomeB1.setBackground(new java.awt.Color(7, 95, 99));
        HomeB1.setForeground(new java.awt.Color(7, 95, 99));
        HomeB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/book.png"))); // NOI18N
        HomeB1.setBorder(null);
        HomeB1.setPreferredSize(new java.awt.Dimension(90, 90));
        HomeB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeB1MouseClicked(evt);
            }           
        });

        HomeB2.setBackground(new java.awt.Color(7, 95, 99));
        HomeB2.setForeground(new java.awt.Color(7, 95, 99));
        HomeB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shop.png"))); // NOI18N
        HomeB2.setBorder(null);
        HomeB2.setPreferredSize(new java.awt.Dimension(90, 90));
        HomeB2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeB2MouseClicked(evt);
            }           
        });

        HomeB3.setBackground(new java.awt.Color(7, 95, 99));
        HomeB3.setForeground(new java.awt.Color(7, 95, 99));
        HomeB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cog.png"))); // NOI18N
        HomeB3.setBorder(null);
        HomeB3.setPreferredSize(new java.awt.Dimension(90, 90));
        HomeB3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeB3MouseClicked(evt);
            }           
        });

        HomeB4.setBackground(new java.awt.Color(7, 95, 99));
        HomeB4.setForeground(new java.awt.Color(7, 95, 99));
        HomeB4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout.png"))); // NOI18N
        HomeB4.setBorder(null);
        HomeB4.setPreferredSize(new java.awt.Dimension(90, 90));
        HomeB4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeB4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout optionsLayout = new javax.swing.GroupLayout(options);
        options.setLayout(optionsLayout);
        optionsLayout.setHorizontalGroup(
            optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(HomeB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HomeB1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HomeB4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HomeB3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HomeB2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        optionsLayout.setVerticalGroup(
            optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(HomeB, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HomeB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HomeB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HomeB3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HomeB4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 50)); // NOI18N
        jLabel1.setText("Sell Books");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("BOOK Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Subject Code");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Author");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Set Price");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField2.setText("Enter Your Book");
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESC501", "CS501", "CS502", "CS503" }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField3.setText("Enter Author");
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField1.setText("Enter the price");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jToggleButton1.setBackground(new java.awt.Color(240, 40, 20));
        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jToggleButton1.setText("Confirm");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 255));
        jButton5.setText("Reset");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BaseUILayout = new javax.swing.GroupLayout(BaseUI);
        BaseUI.setLayout(BaseUILayout);
        BaseUILayout.setHorizontalGroup(
            BaseUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BaseUILayout.createSequentialGroup()
                .addComponent(options, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BaseUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BaseUILayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(BaseUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BaseUILayout.createSequentialGroup()
                                .addGroup(BaseUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(BaseUILayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(BaseUILayout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(BaseUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, 0, 232, Short.MAX_VALUE)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField1))
                                .addGap(373, 373, 373))
                            .addGroup(BaseUILayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(231, 231, 231))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BaseUILayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(BaseUILayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))))
        );
        BaseUILayout.setVerticalGroup(
            BaseUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(options, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BaseUILayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BaseUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(BaseUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(BaseUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(BaseUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(BaseUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BaseUI, javax.swing.GroupLayout.DEFAULT_SIZE, 973, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BaseUI, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeB4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeB4MouseClicked
        // TODO add your handling code here:
        HeadMgr.ExitApp();
    }//GEN-LAST:event_HomeB4MouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        String text=jTextField2.getText();
        
        if(checkNameOrBook(text)){
            jTextField2.setBackground(Color.white);
        }
        else
        {
            jTextField2.setText("Wrong Input! Try Again");
            jTextField2.setBackground(Color.red);
        }

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        String text=jTextField3.getText();
        if(checkNameOrBook(text)){
            jTextField3.setBackground(Color.white);
        }
        else
        {
            jTextField3.setText("Wrong Input! Try Again");
            jTextField3.setBackground(Color.red);
        }
    }//GEN-LAST:event_jTextField3ActionPerformed
    private Boolean checkNameOrBook(String text){
        return Pattern.matches("[a-zA-Z][a-zA-Z ]*",text);
    }
    private Boolean checkPrice(String text){
        return Pattern.matches("\\d+(\\.\\d+)?",text);
    }
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        jLabel6.setText("");
        String text=jTextField1.getText();

        if(checkPrice(text)){
            jTextField1.setBackground(Color.white);
        }
        else
        {
            jTextField1.setText("Wrong Input! Try Again");
            jTextField1.setBackground(Color.red);
        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

        if(checkNameOrBook(jTextField3.getText()) && checkNameOrBook(jTextField2.getText()) && checkPrice(jTextField1.getText())){
            jLabel6.setVisible(true);
            jLabel6.setText("Seller Details Added to the Database");
            String subjCode[]={ "ESC501", "CS501", "CS502", "CS503" };
            //System.out.println(subjCode[jComboBox1.getSelectedIndex()]);
            //System.out.println(jTextField1.getText());
            //System.out.println(jTextField2.getText());
            //System.out.println(jTextField3.getText());
            //System.out.println(HeadMgr.getUser().toString());
            SM.addItem(new Book(subjCode[jComboBox1.getSelectedIndex()],jTextField2.getText(),Float.parseFloat(jTextField1.getText()),jTextField3.getText(),Integer.parseInt(HeadMgr.getUser().getUniqueid())));
        }
        else{
            jLabel6.setVisible(true);
            jLabel6.setText("Wrong Input...Try Again");
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jComboBox1.setSelectedIndex(0);
        jTextField1.setBackground(Color.white);
        jTextField2.setBackground(Color.white);
        jTextField3.setBackground(Color.white);
        jTextField2.setText("Enter Your Book");
        jTextField1.setText("Enter the price");
        jTextField3.setText("Enter Author");
        jLabel6.setText("");

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        String text=jTextField2.getText();
        
        if(!checkNameOrBook(text) || text.equals("Enter Your Book")){
        jLabel6.setText("");
        jTextField2.setBackground(Color.white);
        jTextField2.setText(""); 
        }
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
        
        String text=jTextField3.getText();
        if(!checkNameOrBook(text) || text.equals("Enter Author")){
        jLabel6.setText("");
        jTextField3.setBackground(Color.white);
        jTextField3.setText(""); 
        }
    }//GEN-LAST:event_jTextField3MouseClicked
    
    private void HomeBMouseClicked(java.awt.event.MouseEvent evt) {                                   
        // TODO add your handling code here:
        this.dispose();
        HeadMgr.dispDashboardUI();
    }
    private void HomeB1MouseClicked(java.awt.event.MouseEvent evt) { 
        this.dispose();
        HeadMgr.dispSearchUI();
    }
    private void HomeB2MouseClicked(java.awt.event.MouseEvent evt) { 
        this.dispose();
        HeadMgr.dispEStoreUI();
    }
    private void HomeB3MouseClicked(java.awt.event.MouseEvent evt) { 
        this.dispose();
        HeadMgr.dispSettingsUI();
    }
    
    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        String text=jTextField1.getText();
        if(!checkPrice(text)){
        jLabel6.setText("");
        jTextField1.setBackground(Color.white);
        jTextField1.setText("");// TODO add your handling code here:
        }
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
      jLabel6.setText(""); // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SellBookUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellBookUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellBookUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellBookUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellBookUI(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BaseUI;
    private javax.swing.JButton HomeB;//Dashboard
    private javax.swing.JButton HomeB1;//SearchUI
    private javax.swing.JButton HomeB2;//Store
    private javax.swing.JButton HomeB3;//Settings
    private javax.swing.JButton HomeB4;//Exit
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;//price
    private javax.swing.JTextField jTextField2;//item name
    private javax.swing.JTextField jTextField3;//author name
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPanel options;
    // End of variables declaration//GEN-END:variables
}
