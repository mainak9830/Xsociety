
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.basic.BasicButtonUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Deep Roy
 */
public class uploadUI extends javax.swing.JFrame {

    /**
     * Creates new form uploadUI
     */
    DisplayManager HeadMgr;
    NotesManager NM;
    private int count=0;
    public uploadUI(DisplayManager ob,NotesManager ob1) {
        HeadMgr = ob;
        NM = ob1;
        initComponents();
        this.setLocation(100,100);
        this.setTitle("uploadUI - Deep Roy 117");
        JButton [] btns = { HomeB5,HomeB6,HomeB7,HomeB8,HomeB9};
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

        options = new javax.swing.JPanel();
        HomeB = new javax.swing.JButton();
        HomeB1 = new javax.swing.JButton();
        HomeB2 = new javax.swing.JButton();
        HomeB3 = new javax.swing.JButton();
        HomeB4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        options1 = new javax.swing.JPanel();
        HomeB5 = new javax.swing.JButton();
        HomeB6 = new javax.swing.JButton();
        HomeB7 = new javax.swing.JButton();
        HomeB8 = new javax.swing.JButton();
        HomeB9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        authorTF = new javax.swing.JTextField();
        pathTF = new javax.swing.JTextField();
        fileChb = new javax.swing.JButton();
        uploadB = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Clipboardmsg = new javax.swing.JLabel();

        options.setBackground(new java.awt.Color(7, 95, 99));

        HomeB.setBackground(new java.awt.Color(7, 95, 99));
        HomeB.setForeground(new java.awt.Color(7, 95, 99));
        HomeB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/open-menu.png"))); // NOI18N
        HomeB.setBorder(null);
        HomeB.setPreferredSize(new java.awt.Dimension(50, 50));

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
        HomeB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeB1ActionPerformed(evt);
            }
        });

        HomeB2.setBackground(new java.awt.Color(7, 95, 99));
        HomeB2.setForeground(new java.awt.Color(7, 95, 99));
        HomeB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shop.png"))); // NOI18N
        HomeB2.setBorder(null);
        HomeB2.setPreferredSize(new java.awt.Dimension(90, 90));

        HomeB3.setBackground(new java.awt.Color(7, 95, 99));
        HomeB3.setForeground(new java.awt.Color(7, 95, 99));
        HomeB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cog.png"))); // NOI18N
        HomeB3.setBorder(null);
        HomeB3.setPreferredSize(new java.awt.Dimension(90, 90));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(250, 208, 90));

        options1.setBackground(new java.awt.Color(7, 95, 99));

        HomeB5.setBackground(new java.awt.Color(7, 95, 99));
        HomeB5.setForeground(new java.awt.Color(7, 95, 99));
        HomeB5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/open-menu.png"))); // NOI18N
        HomeB5.setPreferredSize(new java.awt.Dimension(50, 50));
        HomeB5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeB5MouseClicked(evt);
            }
        });

        HomeB6.setBackground(new java.awt.Color(7, 95, 99));
        HomeB6.setForeground(new java.awt.Color(7, 95, 99));
        HomeB6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/book.png"))); // NOI18N
        HomeB6.setPreferredSize(new java.awt.Dimension(90, 90));
        HomeB6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeB6MouseClicked(evt);
            }
        });

        HomeB7.setBackground(new java.awt.Color(7, 95, 99));
        HomeB7.setForeground(new java.awt.Color(7, 95, 99));
        HomeB7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shop.png"))); // NOI18N
        HomeB7.setPreferredSize(new java.awt.Dimension(90, 90));
        HomeB7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeB7MouseClicked(evt);
            }
        });

        HomeB8.setBackground(new java.awt.Color(7, 95, 99));
        HomeB8.setForeground(new java.awt.Color(7, 95, 99));
        HomeB8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cog.png"))); // NOI18N
        HomeB8.setPreferredSize(new java.awt.Dimension(90, 90));

        HomeB9.setBackground(new java.awt.Color(7, 95, 99));
        HomeB9.setForeground(new java.awt.Color(7, 95, 99));
        HomeB9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout.png"))); // NOI18N
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
                    .addComponent(HomeB6, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
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
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 50)); // NOI18N
        jLabel1.setText("UPLOAD SECTION");

        nameTF.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        nameTF.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nameTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameTFKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 28)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 28)); // NOI18N
        jLabel3.setText("Subject Code:");

        jComboBox1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 20)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Object Oriented Programming (PCC-CS503)", "Compiler Design (PCC-CS501)", "Operating System (PCC-CS502)", "Software Engg (PCC-ESC501)" }));
        jComboBox1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 28)); // NOI18N
        jLabel4.setText("Faculty/Author:");

        authorTF.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 22)); // NOI18N
        authorTF.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        authorTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                authorTFKeyReleased(evt);
            }
        });

        pathTF.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        pathTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pathTFKeyReleased(evt);
            }
        });

        fileChb.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 22)); // NOI18N
        fileChb.setText("Enter Link >");
        fileChb.setActionCommand("Enter Link");
        fileChb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileChbActionPerformed(evt);
            }
        });

        uploadB.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 22)); // NOI18N
        uploadB.setText("UPLOAD");
        uploadB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadBActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 102));

        Clipboardmsg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Clipboardmsg.setText("*Click button to paste from clipboard");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(options1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(fileChb)
                            .addComponent(Clipboardmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nameTF)
                                        .addComponent(jComboBox1, 0, 463, Short.MAX_VALUE)
                                        .addComponent(authorTF))
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pathTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uploadB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(96, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(options1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(105, 105, 105)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(authorTF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pathTF, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fileChb, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uploadB, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clipboardmsg))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HomeB1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeB1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_HomeB1MouseClicked

    private void HomeB4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeB4MouseClicked
        // TODO add your handling code here:
        HeadMgr.ExitApp();
    }//GEN-LAST:event_HomeB4MouseClicked

    private void HomeB6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeB6MouseClicked
        // TODO add your handling code here:
        this.dispose();
        HeadMgr.dispSearchUI();
    }//GEN-LAST:event_HomeB6MouseClicked

    private void HomeB9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeB9MouseClicked
        // TODO add your handling code here:
        HeadMgr.ExitApp();
    }//GEN-LAST:event_HomeB9MouseClicked

    private void HomeB5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeB5MouseClicked
        // TODO add your handling code here:
        this.dispose();
        HeadMgr.dispDashboardUI();
    }//GEN-LAST:event_HomeB5MouseClicked

    private void uploadBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadBActionPerformed
        // TODO add your handling code here:
        String sb[] = {"ESC501","CS501","CS502","CS503"};
        Pattern p = Pattern.compile("[^A-Za-z0-9]");
        Matcher m1 = p.matcher(nameTF.getText());
        Matcher m2 = p.matcher(authorTF.getText());
        Pattern p1 = Pattern.compile("((http|https)://)(www.)?"
              + "[a-zA-Z0-9@:%._\\+~#?&//=]"
              + "{2,256}\\.[a-z]"
              + "{2,6}\\b([-a-zA-Z0-9@:%"
              + "._\\+~#?&//=]*)");
        Matcher m3 = p1.matcher(pathTF.getText());
        
        boolean b = m1.find() && m2.find();
        boolean b1 = m3.find();
        if((nameTF.getText().equals(""))||authorTF.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Field(s) Empty","FAILED",JOptionPane.ERROR_MESSAGE);
        }
        else if(pathTF.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please choose file to upload","FAILED",JOptionPane.ERROR_MESSAGE);
        }
        else if(b){
            JOptionPane.showMessageDialog(null,"No Special characters allowed","FAILED",JOptionPane.ERROR_MESSAGE);
        }
        else if(!b1){
            JOptionPane.showMessageDialog(null,"Give proper url","FAILED",JOptionPane.ERROR_MESSAGE);
        }
        else if(count>0){
            JOptionPane.showMessageDialog(null,"Field(s) Value(s) Invalid","FAILED",JOptionPane.ERROR_MESSAGE);
        }
        else{
            String sbx = sb[jComboBox1.getSelectedIndex()];
            Resource ob = new Resource(sbx,nameTF.getText(),authorTF.getText(),pathTF.getText());
            //ob.display();
            NM.init();
            if(NM.uploadNotes(ob))
                JOptionPane.showMessageDialog(null,"UPLOAD SUCCESSFUL","Status",JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            this.dispose();
            HeadMgr.dispUploadUI();
        }
    }//GEN-LAST:event_uploadBActionPerformed

    private void fileChbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileChbActionPerformed
        // TODO add your handling code here:
        Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable t = c.getContents(this);
        if (t == null)
            return;
        try {
            pathTF.setText((String) t.getTransferData(DataFlavor.stringFlavor));
        } catch (Exception e){
            e.printStackTrace();
        }//try
    }//GEN-LAST:event_fileChbActionPerformed

    private void nameTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTFKeyReleased
        // TODO add your handling code here:
        
        //check for commas
        
        String patt="^[a-zA-Z ]{5,50}$";
        Pattern p = Pattern.compile(patt);
        Matcher m=p.matcher(nameTF.getText());
        if(!m.matches()){
            jLabel5.setText("Invalid name!");
            count++;
        }
        else{
            jLabel5.setText(null);
            if(count > 0)
                count--;
        }
    }//GEN-LAST:event_nameTFKeyReleased

    private void authorTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_authorTFKeyReleased
        // TODO add your handling code here:
        String patt1="^[a-zA-Z ]{5,30}$";
        Pattern p1 = Pattern.compile(patt1);
        Matcher m=p1.matcher(authorTF.getText());
        if(!m.matches()){
            jLabel6.setText("Invalid author name!");
            count++;
        }
        else{
            jLabel6.setText(null);
              if(count > 0)
                count--;
        } 
    }//GEN-LAST:event_authorTFKeyReleased

    private void HomeB7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeB7MouseClicked
        // TODO add your handling code here:
        this.dispose();
        HeadMgr.dispEStoreUI();
    }//GEN-LAST:event_HomeB7MouseClicked

    private void HomeB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeB1ActionPerformed

    private void pathTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pathTFKeyReleased
        // TODO add your handling code here:
        String patt1="^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
        Pattern p1 = Pattern.compile(patt1);
        Matcher m=p1.matcher(pathTF.getText());
        if(!m.matches()){
            count++;
        }
        else{
            if(count > 0)
                count--;
        }
    }//GEN-LAST:event_pathTFKeyReleased

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
            java.util.logging.Logger.getLogger(uploadUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(uploadUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(uploadUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(uploadUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new uploadUI(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Clipboardmsg;
    private javax.swing.JButton HomeB;
    private javax.swing.JButton HomeB1;
    private javax.swing.JButton HomeB2;
    private javax.swing.JButton HomeB3;
    private javax.swing.JButton HomeB4;
    private javax.swing.JButton HomeB5;
    private javax.swing.JButton HomeB6;
    private javax.swing.JButton HomeB7;
    private javax.swing.JButton HomeB8;
    private javax.swing.JButton HomeB9;
    private javax.swing.JTextField authorTF;
    private javax.swing.JButton fileChb;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameTF;
    private javax.swing.JPanel options;
    private javax.swing.JPanel options1;
    private javax.swing.JTextField pathTF;
    private javax.swing.JButton uploadB;
    // End of variables declaration//GEN-END:variables
}
