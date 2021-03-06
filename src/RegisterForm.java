/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Darryl
 */

import javax.swing.JFrame;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class RegisterForm extends javax.swing.JFrame {

    /**
     * Creates new form RegisterForm
     */
    public RegisterForm() {
        initComponents();
        this.setLocationRelativeTo(null); //berfungsi untuk membuat aplikasi di tengah layar
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldUname = new javax.swing.JTextField();
        jPasswordpass = new javax.swing.JPasswordField();
        jButton_CANCEL = new javax.swing.JButton();
        jButton_Register_ = new javax.swing.JButton();
        jLabelLogin = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jPasswordpass2 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldName1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(828, 550));

        jPanel1.setBackground(new java.awt.Color(245, 245, 220));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelClose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 30, 30));

        jLabelMin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 20, 30));

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel2.setText("Register Page");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, -1));

        jPanel2.setBackground(new java.awt.Color(245, 245, 220));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldUname.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldUname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldUname.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldUname.setText("type your username");
        jTextFieldUname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUnameActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 320, 30));

        jPasswordpass.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordpass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordpass.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordpass.setText("..........");
        jPanel2.add(jPasswordpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 320, 30));

        jButton_CANCEL.setBackground(new java.awt.Color(0, 0, 0));
        jButton_CANCEL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_CANCEL.setText("Cancel");
        jButton_CANCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CANCELActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_CANCEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 120, 30));

        jButton_Register_.setBackground(new java.awt.Color(112, 128, 144));
        jButton_Register_.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Register_.setText("Register");
        jButton_Register_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Register_ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_Register_, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 120, 30));

        jLabelLogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelLogin.setText("Klik disini melakukan login");
        jLabelLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLoginMouseClicked(evt);
            }
        });
        jPanel2.add(jLabelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 470, 140, -1));

        jTextFieldEmail.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldEmail.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldEmail.setText("your email");
        jPanel2.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 320, 30));

        jPasswordpass2.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordpass2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordpass2.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordpass2.setText("...........");
        jPanel2.add(jPasswordpass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 320, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("H:\\Darryl\\Pictures\\pbo\\WhatsApp Image 2021-05-03 at 14.10.36 (1).jpeg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 430, 420));

        jTextFieldName1.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldName1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldName1.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldName1.setText("your name");
        jPanel2.add(jTextFieldName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 320, 30));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Re-type Password");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 150, 50));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("Name");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 110, 50));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("Email");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 110, 50));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setText("Username");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 110, 50));

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 102));
        jLabel15.setText("Password");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 110, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        // untuk close aplikasi
        System.exit(0);

    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        // untuk minimize aplikasi
        this.setState(JFrame.ICONIFIED);

    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jLabelLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLoginMouseClicked
        // berfungsi untuk mengarahkan user ke halaman login
        LoginForm lgf = new LoginForm();
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);
        lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabelLoginMouseClicked

    private void jButton_Register_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Register_ActionPerformed
        
        String name = jTextFieldName1.getText();
        String email = jTextFieldEmail.getText();
        String uname = jTextFieldUname.getText();
        String pass = String.valueOf(jPasswordpass.getPassword());
        String repass = String.valueOf(jPasswordpass2.getPassword());
        
        if(uname.equals("") || pass.equals("") || repass.equals("") || name.equals(""))
        {    
            // apabila ada data yang kosong
            JOptionPane.showMessageDialog(null, "Data tidak boleh kosong");
        }
        else if(checkUsername(uname))
        {
            //fungsi untuk mengecek username sudah digunakan atau tidak
            JOptionPane.showMessageDialog(null, "Username sudah digunakan!");
        }
        else{
            //apabila register berhasil
        
        PreparedStatement ps;
        String query = "INSERT INTO `tb_user` (`name`, `email`, `username`, `password`) VALUES (?,?,?,?)";
        
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, uname);
            ps.setString(4, pass);
            
            if(ps.executeUpdate() > 0)
            {
                JOptionPane.showMessageDialog(null, "Akun berhasil dibuat");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    }//GEN-LAST:event_jButton_Register_ActionPerformed

    //fungsi untuk validasi username
    public boolean checkUsername(String username)
    {
        PreparedStatement ps;
        ResultSet rs;
        boolean checkUser = false;
        String query = "SELECT * FROM `tb_user` WHERE `username` =?";
        
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, username);
            
            rs = ps.executeQuery();
            
            if(rs.next())
            {
                checkUser = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return checkUser;
    }
    
    
    private void jButton_CANCELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CANCELActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_CANCELActionPerformed

    private void jTextFieldUnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUnameActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_CANCEL;
    private javax.swing.JButton jButton_Register_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordpass;
    private javax.swing.JPasswordField jPasswordpass2;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldName1;
    private javax.swing.JTextField jTextFieldUname;
    // End of variables declaration//GEN-END:variables
}
