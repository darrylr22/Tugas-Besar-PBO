/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JFrame;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static tugasloginregister.Tugasloginregister.getConnection;
/**
 *
 * @author Darryl
 */
public class katwomens extends javax.swing.JFrame {

    /**
     * Creates new form katwomens
     */
    public katwomens() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jComboBox8 = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jComboBox9 = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 245, 220));
        jPanel1.setForeground(new java.awt.Color(0, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture7.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture8.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("H:\\Darryl\\Downloads\\Picture9.png")); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon("H:\\Darryl\\Downloads\\rsz_1rsz_home.jpg")); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon("H:\\Darryl\\Downloads\\Picture1 (1).png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 644, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(245, 245, 220));
        jPanel2.setPreferredSize(new java.awt.Dimension(856, 2000));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 3, 36)); // NOI18N
        jLabel7.setText("List Produk:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 400, 46));

        jLabel3.setIcon(new javax.swing.ImageIcon("H:\\Darryl\\Pictures\\pbo\\promo_2_400x345.jpeg")); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, -1, -1));

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Monospaced", 3, 70)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 51, 153));
        jLabel18.setIcon(new javax.swing.ImageIcon("H:\\Darryl\\Pictures\\pbo\\wmncat.jpeg")); // NOI18N
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 390, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("H:\\Darryl\\Pictures\\pbo\\berbatik_400x345.jpeg")); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel10.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel10.setText("Kemeja Batik Enzy");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 970, -1, -1));

        jLabel11.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel11.setText("Kemeja Batik Clara");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 970, 160, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 1000, -1, 20));

        jButton1.setBackground(new java.awt.Color(255, 153, 102));
        jButton1.setText("Add to Cart");
        jButton1.setPreferredSize(new java.awt.Dimension(89, 20));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 1000, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 153, 102));
        jButton2.setText("Add to Cart");
        jButton2.setPreferredSize(new java.awt.Dimension(89, 20));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1000, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 1000, -1, 20));

        jLabel12.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel12.setText("Rp 220.000,00");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 1000, -1, 20));

        jLabel13.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel13.setText("Rp 180.000,00");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 1000, -1, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon("H:\\Darryl\\Pictures\\pbo\\hot_w_800x345.jpeg")); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, 810, -1));

        jLabel15.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Batik Syavana Lengan Pendek ");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1390, -1, -1));

        jLabel16.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel16.setText("Rp 220.000,00");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1420, 90, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 1420, -1, 20));

        jButton3.setBackground(new java.awt.Color(255, 153, 102));
        jButton3.setText("Add to Cart");
        jButton3.setPreferredSize(new java.awt.Dimension(89, 20));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1420, -1, 20));

        jLabel17.setIcon(new javax.swing.ImageIcon("H:\\Darryl\\Pictures\\pbo\\w4_236x345.jpeg")); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1060, -1, 330));

        jButton4.setBackground(new java.awt.Color(255, 153, 102));
        jButton4.setText("Add to Cart");
        jButton4.setPreferredSize(new java.awt.Dimension(89, 20));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1320, -1, 20));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 1320, -1, 20));

        jLabel20.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel20.setText("Rp 220.000,00");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1320, 90, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon("H:\\Darryl\\Pictures\\pbo\\w1_1_236x345.jpeg")); // NOI18N
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 1060, -1, 330));

        jLabel22.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Dress Batik Mayra");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 1390, 260, -1));

        jButton5.setBackground(new java.awt.Color(255, 153, 102));
        jButton5.setText("Add to Cart");
        jButton5.setPreferredSize(new java.awt.Dimension(89, 20));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 1420, -1, 20));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 1420, -1, 20));

        jLabel23.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel23.setText("Rp 270.000,00");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 1420, 90, -1));

        jLabel24.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Batik Devina");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 1390, 260, -1));

        jButton6.setBackground(new java.awt.Color(255, 153, 102));
        jButton6.setText("Add to Cart");
        jButton6.setPreferredSize(new java.awt.Dimension(89, 20));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 1420, -1, 20));

        jLabel25.setIcon(new javax.swing.ImageIcon("H:\\Darryl\\Pictures\\pbo\\w2_1_236x345 (1).jpeg")); // NOI18N
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 1060, -1, 330));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 1420, -1, 20));

        jLabel26.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel26.setText("Rp 210.000,00");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 1420, 90, -1));

        jLabel27.setIcon(new javax.swing.ImageIcon("H:\\Darryl\\Pictures\\pbo\\w8_236x345.jpeg")); // NOI18N
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 1480, -1, 330));

        jLabel28.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Dress Batik Sayora");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 1810, 260, -1));

        jButton7.setBackground(new java.awt.Color(255, 153, 102));
        jButton7.setText("Add to Cart");
        jButton7.setPreferredSize(new java.awt.Dimension(89, 20));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 1840, -1, 20));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 1840, -1, 20));

        jLabel29.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel29.setText("Rp 270.000,00");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 1840, 90, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon("H:\\Darryl\\Pictures\\pbo\\w9_236x345.jpeg")); // NOI18N
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 1480, -1, 330));

        jLabel31.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Dress Batik Angela");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 1810, 260, -1));

        jButton8.setBackground(new java.awt.Color(255, 153, 102));
        jButton8.setText("Add to Cart");
        jButton8.setPreferredSize(new java.awt.Dimension(89, 20));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 1840, -1, 20));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jComboBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox8ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 1840, -1, 20));

        jLabel32.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel32.setText("Rp 235.000,00");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 1840, 90, -1));

        jLabel33.setIcon(new javax.swing.ImageIcon("H:\\Darryl\\Documents\\sm2\\PBO\\w10.jpeg")); // NOI18N
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1480, -1, 330));

        jLabel34.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Dress Batik Lalina");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1810, 280, -1));

        jButton9.setBackground(new java.awt.Color(255, 153, 102));
        jButton9.setText("Add to Cart");
        jButton9.setPreferredSize(new java.awt.Dimension(89, 20));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1840, -1, 20));

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jComboBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox9ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 1840, -1, 20));

        jLabel35.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel35.setText("Rp 250.000,00");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1840, 90, -1));

        jLabel36.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        jLabel36.setText("2021");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 1900, -1, 10));

        jLabel37.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        jLabel37.setText("Butik Store");
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 1900, -1, 10));

        jLabel14.setIcon(new javax.swing.ImageIcon("H:\\Darryl\\Pictures\\pbo\\bunga.png")); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon("H:\\Darryl\\Pictures\\pbo\\bamboo.png")); // NOI18N
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 150, 290));

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // berfungsi untuk mengarahkan user ke halaman cart
        cart crt = new cart();
        crt.setVisible(true);
        crt.pack();
        crt.setLocationRelativeTo(null);
        crt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // berfungsi untuk mengarahkan user ke halaman user
        tampilanuser usr = new tampilanuser();
        usr.setVisible(true);
        usr.pack();
        usr.setLocationRelativeTo(null);
        usr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // berfungsi untuk mengarahkan user ke halaman tampilan home
        TampilanHome th = new TampilanHome();
        th.setVisible(true);
        th.pack();
        th.setLocationRelativeTo(null);
        th.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nama = jLabel10.getText();
        final int harga = 180000;
        Object jumlah = jComboBox1.getSelectedItem();

        try{
            Connection con = getConnection();
            PreparedStatement insert= con.prepareStatement("INSERT INTO tb_cart (nama_barang,harga,jumlah)"
                + " VALUES ('"+nama+"','"+harga+"','"+jumlah+"')");

            insert.executeUpdate();
        } catch(Exception e){System.out.println(e);}
        finally{
            JOptionPane.showMessageDialog(null, "Barang telah dimasukkan ke keranjang");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String nama = jLabel11.getText();
        final int harga = 220000;
        Object jumlah = jComboBox2.getSelectedItem();

        try{
            Connection con = getConnection();
            PreparedStatement insert= con.prepareStatement("INSERT INTO tb_cart (nama_barang,harga,jumlah)"
                + " VALUES ('"+nama+"','"+harga+"','"+jumlah+"')");

            insert.executeUpdate();
        } catch(Exception e){System.out.println(e);}
        finally{
            JOptionPane.showMessageDialog(null, "Barang telah dimasukkan ke keranjang");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String nama = jLabel15.getText();
        final int harga = 220000;
        Object jumlah = jComboBox3.getSelectedItem();

        try{
            Connection con = getConnection();
            PreparedStatement insert= con.prepareStatement("INSERT INTO tb_cart (nama_barang,harga,jumlah)"
                + " VALUES ('"+nama+"','"+harga+"','"+jumlah+"')");

            insert.executeUpdate();
        } catch(Exception e){System.out.println(e);}
        finally{
            JOptionPane.showMessageDialog(null, "Barang telah dimasukkan ke keranjang");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String nama = jLabel22.getText();
        final int harga = 270000;
        Object jumlah = jComboBox5.getSelectedItem();

        try{
            Connection con = getConnection();
            PreparedStatement insert= con.prepareStatement("INSERT INTO tb_cart (nama_barang,harga,jumlah)"
                + " VALUES ('"+nama+"','"+harga+"','"+jumlah+"')");

            insert.executeUpdate();
        } catch(Exception e){System.out.println(e);}
        finally{
            JOptionPane.showMessageDialog(null, "Barang telah dimasukkan ke keranjang");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String nama = jLabel24.getText();
        final int harga = 210000;
        Object jumlah = jComboBox6.getSelectedItem();

        try{
            Connection con = getConnection();
            PreparedStatement insert= con.prepareStatement("INSERT INTO tb_cart (nama_barang,harga,jumlah)"
                + " VALUES ('"+nama+"','"+harga+"','"+jumlah+"')");

            insert.executeUpdate();
        } catch(Exception e){System.out.println(e);}
        finally{
            JOptionPane.showMessageDialog(null, "Barang telah dimasukkan ke keranjang");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String nama = jLabel28.getText();
        final int harga = 270000;
        Object jumlah = jComboBox7.getSelectedItem();

        try{
            Connection con = getConnection();
            PreparedStatement insert= con.prepareStatement("INSERT INTO tb_cart (nama_barang,harga,jumlah)"
                + " VALUES ('"+nama+"','"+harga+"','"+jumlah+"')");

            insert.executeUpdate();
        } catch(Exception e){System.out.println(e);}
        finally{
            JOptionPane.showMessageDialog(null, "Barang telah dimasukkan ke keranjang");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String nama = jLabel31.getText();
        final int harga = 235000;
        Object jumlah = jComboBox8.getSelectedItem();

        try{
            Connection con = getConnection();
            PreparedStatement insert= con.prepareStatement("INSERT INTO tb_cart (nama_barang,harga,jumlah)"
                + " VALUES ('"+nama+"','"+harga+"','"+jumlah+"')");

            insert.executeUpdate();
        } catch(Exception e){System.out.println(e);}
        finally{
            JOptionPane.showMessageDialog(null, "Barang telah dimasukkan ke keranjang");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jComboBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String nama = jLabel34.getText();
        final int harga = 250000;
        Object jumlah = jComboBox9.getSelectedItem();

        try{
            Connection con = getConnection();
            PreparedStatement insert= con.prepareStatement("INSERT INTO tb_cart (nama_barang,harga,jumlah)"
                + " VALUES ('"+nama+"','"+harga+"','"+jumlah+"')");

            insert.executeUpdate();
        } catch(Exception e){System.out.println(e);}
        finally{
            JOptionPane.showMessageDialog(null, "Barang telah dimasukkan ke keranjang");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jComboBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox9ActionPerformed

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
            java.util.logging.Logger.getLogger(katwomens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(katwomens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(katwomens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(katwomens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new katwomens().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
