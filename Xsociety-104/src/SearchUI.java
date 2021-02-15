/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;
import java.net.URI;

/**
 *
 * @author Kaustav
 */
public class SearchUI extends javax.swing.JFrame {

    /**
     * Creates new form SearchUI
     */
    private DisplayManager HeadMgr;
    private NotesManager NM;
    public SearchUI(DisplayManager ob,NotesManager ob1) {
        HeadMgr = ob;
        NM = ob1;
        initComponents();
        this.setLocation(100,100);
        this.setTitle("EStoreUI - Kaustav Saha 104");
        HomeB6.setBackground(new Color(255,153,51));
        JButton [] btns = { HomeB5,HomeB7,HomeB8,HomeB9};
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
        
        SWEcb.setVisible(false);
        Compilercb.setVisible(false);
        OScb.setVisible(false);
        OOPcb.setVisible(false);
        msg.setBackground(new Color(250,208,90));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        options1 = new javax.swing.JPanel();
        HomeB5 = new javax.swing.JButton();
        HomeB6 = new javax.swing.JButton();
        HomeB7 = new javax.swing.JButton();
        HomeB8 = new javax.swing.JButton();
        HomeB9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        subjectComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jBsearch = new javax.swing.JButton();
        SWEcb = new javax.swing.JComboBox();
        Compilercb = new javax.swing.JComboBox();
        OScb = new javax.swing.JComboBox();
        OOPcb = new javax.swing.JComboBox();
        DownloadB = new javax.swing.JButton();
        msg = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(250, 208, 90));

        jPanel1.setBackground(new java.awt.Color(250, 208, 90));

        options1.setBackground(new java.awt.Color(7, 95, 99));

        HomeB5.setBackground(new java.awt.Color(7, 95, 99));
        HomeB5.setForeground(new java.awt.Color(7, 95, 99));
        HomeB5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/open-menu.png"))); // NOI18N
        HomeB5.setBorder(null);
        HomeB5.setPreferredSize(new java.awt.Dimension(50, 50));
        HomeB5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeB5MouseClicked(evt);
            }
        });

        HomeB6.setBackground(new java.awt.Color(7, 95, 99));
        HomeB6.setForeground(new java.awt.Color(7, 95, 99));
        HomeB6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/book.png"))); // NOI18N
        HomeB6.setBorder(null);
        HomeB6.setPreferredSize(new java.awt.Dimension(90, 90));

        HomeB7.setBackground(new java.awt.Color(7, 95, 99));
        HomeB7.setForeground(new java.awt.Color(7, 95, 99));
        HomeB7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shop.png"))); // NOI18N
        HomeB7.setBorder(null);
        HomeB7.setPreferredSize(new java.awt.Dimension(90, 90));
        HomeB7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeB7MouseClicked(evt);
            }
        });

        HomeB8.setBackground(new java.awt.Color(7, 95, 99));
        HomeB8.setForeground(new java.awt.Color(7, 95, 99));
        HomeB8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cog.png"))); // NOI18N
        HomeB8.setBorder(null);
        HomeB8.setPreferredSize(new java.awt.Dimension(90, 90));
        HomeB8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeB8MouseClicked(evt);
            }
        });

        HomeB9.setBackground(new java.awt.Color(7, 95, 99));
        HomeB9.setForeground(new java.awt.Color(7, 95, 99));
        HomeB9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout.png"))); // NOI18N
        HomeB9.setBorder(null);
        HomeB9.setPreferredSize(new java.awt.Dimension(90, 90));
        HomeB9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeB9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout options1Layout = new javax.swing.GroupLayout(options1);
        options1.setLayout(options1Layout);
        options1Layout.setHorizontalGroup(
            options1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(options1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(options1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(HomeB5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HomeB6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HomeB9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HomeB8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HomeB7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        options1Layout.setVerticalGroup(
            options1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(options1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(HomeB5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HomeB6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HomeB7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HomeB8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HomeB9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 50)); // NOI18N
        jLabel1.setText("E-NOTES AND BOOKS");

        subjectComboBox.setBackground(new java.awt.Color(255, 255, 153));
        subjectComboBox.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        subjectComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Software Engineering ESC501", "Compiler Design PCC CS501", "Operating Systems PCC CS502", "Object Oriented Programming PCC CS503" }));
        subjectComboBox.setPreferredSize(new java.awt.Dimension(42, 25));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 26)); // NOI18N
        jLabel2.setText("Choose subject:");

        jBsearch.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jBsearch.setText("Search");
        jBsearch.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBsearchMouseClicked(evt);
            }
        });

        SWEcb.setBackground(new java.awt.Color(255, 255, 153));
        SWEcb.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        SWEcb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1. Pressman, Software Engineering : A practitioner’s approach", "2. Pankaj Jalote, Software Engineering- (Wiley-India)", "3. N.S. Gill, Software Engineering – (Khanna Publishing House)", "4. Rajib Mall, Software Engineering- (PHI)", "5. Agarwal and Agarwal, Software Engineering – (PHI)", "6. Sommerville, Software Engineering – Pearson", "7. Martin L. Shooman, Software Engineering – TMH" }));

        Compilercb.setBackground(new java.awt.Color(255, 255, 153));
        Compilercb.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        Compilercb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1. Aho,Sethi,Ullman-“Compiler Principles, Techniques and Tools” ", "2. Holub - “Compiler Design in C” - PHI", "3. Compiler Design in C - Allen Holub" }));

        OScb.setBackground(new java.awt.Color(255, 255, 153));
        OScb.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        OScb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1. Operating System Concepts Essentials, 9th Edition, Wiley", "2. Operating Systems: Internals and Design Principles, 5th Ed.,Prentice Hall", "3. Operating System Concepts, Ekta Walia, Khanna Publishing House", "4. Operating System: A Design-oriented Approach, 1st ed. Irwin Publishing", "5. Operating Systems: A Modern Perspective, 2nd Edition, AddisonWesley", "6. Design of the Unix Operating Systems, 8th Edition,Prentice Hall ", "7. Understanding the Linux Kernel, 3rd Edition, O'Reilly and Associates" }));

        OOPcb.setBackground(new java.awt.Color(255, 255, 153));
        OOPcb.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        OOPcb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1. \"Object Oriented Modelling and Design\" – Prentice Hall", "2. \"Object Oriented System Development\" – Mc Graw Hill", "3. Patrick Naughton, Herbert Schildt – \"The complete reference-Java2\"", "4. R.K Das – \"Core Java For Beginners\" – VIKAS PUBLISHING", "5. Deitel and Deitel – \"Java How to Program\" – 6th Ed. – Pearson", "6. Ivor Horton's Beginning Java 2 SDK – Wrox", "7. E. Balagurusamy – \" Programming With Java: A Primer\" – 3rd Ed." }));

        DownloadB.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 26)); // NOI18N
        DownloadB.setText("Download");
        DownloadB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DownloadB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DownloadBMouseClicked(evt);
            }
        });

        msg.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 20)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(options1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(OOPcb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                            .addComponent(subjectComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(jBsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DownloadB, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(OScb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(SWEcb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Compilercb, 0, 550, Short.MAX_VALUE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(options1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(SWEcb, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Compilercb, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OScb, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OOPcb, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(msg)
                    .addComponent(DownloadB, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        
        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jBsearchMouseClicked(java.awt.event.MouseEvent evt) {                                      
        SWEcb.setVisible(false);
        Compilercb.setVisible(false);
        OScb.setVisible(false);
        OOPcb.setVisible(false);
        msg.setText("");
        String subj;
        subj = (String) subjectComboBox.getSelectedItem();
        String[] strArray = subj.split(" ");  
        subj=strArray[strArray.length -1];
        
        NM.init();
        //list=nmg.getList(subj);
       ArrayList<Resource> temp_list = new ArrayList<Resource>();
       temp_list = NM.searchNotes(subj);
       System.out.println(subj);
       if(subj.compareTo("ESC501")==0){
            SWEcb.removeAllItems();
            for(int i = 0;i<temp_list.size();i++){
                if(temp_list.get(i).getSubj().compareTo("ESC501")==0){
                    
                    SWEcb.addItem(temp_list.get(i).getName());
                }//end of inner if
            }//end of for loop
            SWEcb.setVisible(true);
       }//end of outer if
       
       if(subj.endsWith("CS501")){
            Compilercb.removeAllItems();
            for(int i = 0;i<temp_list.size();i++){
                if(temp_list.get(i).getSubj().compareTo("CS501")==0){
                    
                    Compilercb.addItem(temp_list.get(i).getName());
                }//end of inner if
            }//end of for loop
            Compilercb.setVisible(true);
       }//end of outer if
       
       if(subj.endsWith("CS502")){
            OScb.removeAllItems();
            for(int i = 0;i<temp_list.size();i++){
                if(temp_list.get(i).getSubj().compareTo("CS502")==0){
                    OScb.addItem(temp_list.get(i).getName());
                }//end of inner if
            }//end of for loop
            OScb.setVisible(true);
       }//end of outer if
       
       if(subj.endsWith("CS503")){
            OOPcb.removeAllItems();
            for(int i = 0;i<temp_list.size();i++){
                if(temp_list.get(i).getSubj().compareTo("CS503")==0){
                    OOPcb.addItem(temp_list.get(i).getName());
                }//end of inner if
            }//end of for loop
            OOPcb.setVisible(true);
       }//end of outer if
    }
    
    private void HomeB9MouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        System.exit(0);
    }                                   

    private void DownloadBMouseClicked(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
        
       
        try{
        if(SWEcb.isVisible()){
                    nurl = NM.getUrls().get(SWEcb.getSelectedIndex());
                    URI uri= new URI(nurl);
                    java.awt.Desktop.getDesktop().browse(uri);
                    msg.setText(nurl);
        }
        else if(OScb.isVisible()){
                    nurl = NM.getUrls().get(OScb.getSelectedIndex());
                    URI uri= new URI(nurl);
                    java.awt.Desktop.getDesktop().browse(uri);
                    msg.setText(nurl);
        }
        else if(OOPcb.isVisible()){
                    nurl = NM.getUrls().get(OOPcb.getSelectedIndex());
                    URI uri= new URI(nurl);
                    java.awt.Desktop.getDesktop().browse(uri);
                    msg.setText(nurl);
        }
        else if(Compilercb.isVisible()){
                    nurl = NM.getUrls().get(Compilercb.getSelectedIndex());
                    URI uri= new URI(nurl);
                    java.awt.Desktop.getDesktop().browse(uri);
                    msg.setText(nurl);
            msg.setText("Download successful!");
        }
        else{
            msg.setText("No book chosen.");
        }
        }catch(Exception e){
                
            }
    }                                      

    private void HomeB5MouseClicked(java.awt.event.MouseEvent evt) { //Dashboard button or home button                                   
        // TODO add your handling code here:
        this.dispose();
        //DashboardUI ob = new DashboardUI();
        HeadMgr.dispDashboardUI();
    }                                   
    private void HomeB7MouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        this.dispose();
        HeadMgr.dispEStoreUI();
        //new EStoreUI().setVisible(true);
    }     
    private void HomeB8MouseClicked(java.awt.event.MouseEvent evt) { 
        this.dispose();
        HeadMgr.dispSettingsUI();
    }
    
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
            java.util.logging.Logger.getLogger(SearchUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SearchUI(null,null).setVisible(true);
        });
    }

    // Variables declaration - do not modify
    private String nurl;
   
    private ArrayList<String> list;
    private javax.swing.JComboBox Compilercb;
    private javax.swing.JButton DownloadB;
    private javax.swing.JButton HomeB5;
    private javax.swing.JButton HomeB6;
    private javax.swing.JButton HomeB7;
    private javax.swing.JButton HomeB8;
    private javax.swing.JButton HomeB9;
    private javax.swing.JComboBox OOPcb;
    private javax.swing.JComboBox OScb;
    private javax.swing.JComboBox SWEcb;
    private javax.swing.JButton jBsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField msg;
    private javax.swing.JPanel options1;
    private javax.swing.JComboBox subjectComboBox;
    // End of variables declaration                   
}
