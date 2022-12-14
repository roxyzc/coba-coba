/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package applibrary;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
/**
 *
 * @author Asus
 */
public class Auth extends javax.swing.JFrame {
    /**
     * Creates new form Auth
     */
     private static Connection connect;
     public static Connection ConnectDB() throws SQLException{
        try {
            String DB = "jdbc:mysql://localhost/tb_library";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            connect = DriverManager.getConnection(DB, user, pass);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No Database Connection", "Error", JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
            System.exit(0);
        }
        return connect;
    }
    
    
    public Auth() {
        initComponents();
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
        LoginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LBtnLogin = new javax.swing.JButton();
        LBtnRegister = new javax.swing.JButton();
        LPassword = new javax.swing.JPasswordField();
        LUsername = new javax.swing.JTextField();
        RegisterPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        RUsername = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        RPassword = new javax.swing.JTextField();
        RBtnRegister = new javax.swing.JButton();
        RNIM = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(100, 100, 100));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Auth"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(131, 149, 167));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));

        LoginPanel.setBackground(new java.awt.Color(200, 214, 229));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setText("LOGIN");

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel3.setText("Password");

        LBtnLogin.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        LBtnLogin.setText("Login");
        LBtnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBtnLoginMouseClicked(evt);
            }
        });
        LBtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LBtnLoginActionPerformed(evt);
            }
        });

        LBtnRegister.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        LBtnRegister.setText("Register");
        LBtnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBtnRegisterMouseClicked(evt);
            }
        });
        LBtnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LBtnRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel1))
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(LoginPanelLayout.createSequentialGroup()
                                .addComponent(LBtnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addComponent(LBtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LPassword)
                            .addComponent(LUsername))))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(LPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBtnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(170, Short.MAX_VALUE))
        );

        RegisterPanel.setBackground(new java.awt.Color(200, 210, 220));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel4.setText("REGISTER");

        jLabel5.setText("NIM");

        jLabel6.setText("Username");

        RUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RUsernameActionPerformed(evt);
            }
        });

        jLabel7.setText("Password");

        RBtnRegister.setText("Register");
        RBtnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RBtnRegisterMouseClicked(evt);
            }
        });
        RBtnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBtnRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegisterPanelLayout = new javax.swing.GroupLayout(RegisterPanel);
        RegisterPanel.setLayout(RegisterPanelLayout);
        RegisterPanelLayout.setHorizontalGroup(
            RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterPanelLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RNIM)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RUsername)
                    .addComponent(RPassword)
                    .addGroup(RegisterPanelLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(RBtnRegister)))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        RegisterPanelLayout.setVerticalGroup(
            RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel4)
                .addGap(35, 35, 35)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(RBtnRegister)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(RegisterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(RegisterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LBtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LBtnLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LBtnLoginActionPerformed

    private void LBtnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LBtnRegisterActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_LBtnRegisterActionPerformed

    private void LBtnRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBtnRegisterMouseClicked
        // TODO add your handling code here:
        LoginPanel.removeAll();
        LoginPanel.repaint();
        LoginPanel.revalidate();
        
        LoginPanel.add(RegisterPanel);
        LoginPanel.repaint();
        LoginPanel.revalidate();
    }//GEN-LAST:event_LBtnRegisterMouseClicked

    private void LBtnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBtnLoginMouseClicked
        // TODO add your handling code here:
        try{
            String username = LUsername.getText();
            String password = LPassword.getText();
            ConnectDB();
                Connection connection = connect;
                String query = "SELECT * FROM tb_users where username='"+username+"'";
                Statement st = connection.createStatement();
                ResultSet rs = st.executeQuery(query);
                String AUser = null;
                String Apassword = null;
                String AID = null;
                while(rs.next()){
                    AUser = rs.getString("username");
                    Apassword = rs.getString("password");
                    AID = rs.getString("userID");
                }
                st.close();
      
            if(username.isEmpty() && password.isEmpty()){
                JOptionPane.showMessageDialog(this, "Username dan Password kosong", "Gagal Login", JOptionPane.ERROR_MESSAGE);
            }else if(username != null && password.isEmpty()){
                JOptionPane.showMessageDialog(this, "Password anda kosong", "Gagal",JOptionPane.ERROR_MESSAGE);
                LUsername.setText("");
            }else if(username.isEmpty() && password != null){
                JOptionPane.showMessageDialog(this, "Username anda kosong", "Gagal",JOptionPane.ERROR_MESSAGE);
                LPassword.setText("");
            }else if((username.equals(AUser) == false) && password.equals(Apassword) == false){
                JOptionPane.showMessageDialog(this, "User tidak ditemukan", "Gagal",JOptionPane.ERROR_MESSAGE);
                LUsername.setText("");
                LPassword.setText("");
            }else if((password.equals(Apassword) == false) && username.equals(AUser) == true){
                JOptionPane.showMessageDialog(this, "Passowrd salah", "Gagal",JOptionPane.ERROR_MESSAGE);
                LPassword.setText("");
            }else{
                Menu n = new Menu();
                this.setVisible(false);
                Menu.session.setUserId(AID);
                n.setVisible(true);
        }
        } catch (SQLException ex) {
            Logger.getLogger(Auth.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_LBtnLoginMouseClicked

    private void RBtnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBtnRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBtnRegisterActionPerformed

    private void RBtnRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBtnRegisterMouseClicked
        try {
            // TODO add your handling code here:
            if(RUsername.getText().isEmpty() && RNIM.getText().isEmpty() && RPassword.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Nim, Username, dan Password kosong", "Gagal Login", JOptionPane.ERROR_MESSAGE);
            }else if(RUsername.getText() != null && RNIM.getText().isEmpty() && RPassword.getText().isEmpty()){
                RUsername.setText("");
                JOptionPane.showMessageDialog(this, "Nim, dan Password kosong", "Gagal Login", JOptionPane.ERROR_MESSAGE);
            }else if(RUsername.getText() != null && RNIM.getText() != null && RPassword.getText().isEmpty()){
                RUsername.setText("");
                RNIM.setText("");
                JOptionPane.showMessageDialog(this, "Password kosong", "Gagal Login", JOptionPane.ERROR_MESSAGE);
            }else if(RUsername.getText().isEmpty() && RNIM.getText() != null && RPassword.getText().isEmpty()){
                RNIM.setText("");
                RPassword.setText("");
                JOptionPane.showMessageDialog(this, "Nim, dan Password kosong", "Gagal Login", JOptionPane.ERROR_MESSAGE);
            }else if(RUsername.getText().isEmpty() && RNIM.getText() != null && RPassword.getText() != null){
                RNIM.setText("");
                RPassword.setText("");
                JOptionPane.showMessageDialog(this, "Username kosong", "Gagal Login", JOptionPane.ERROR_MESSAGE);
            }else{
                ConnectDB();
                String sql = "INSERT INTO tb_users (nama,nim,kelas,username,password) VALUES ('"+RUsername.getText()+"','"+RNIM.getText()+"','TI.21.A.3','"+RUsername.getText()+"','"+RPassword.getText()+"')";
                var preparedStmt = ConnectDB().prepareStatement(sql);
                preparedStmt.execute();
                ConnectDB().close();
                Menu n = new Menu();
                this.setVisible(false);
                n.setVisible(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Auth.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RBtnRegisterMouseClicked

    private void RUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RUsernameActionPerformed

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
            java.util.logging.Logger.getLogger(Auth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Auth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Auth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Auth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Auth().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LBtnLogin;
    private javax.swing.JButton LBtnRegister;
    private javax.swing.JPasswordField LPassword;
    private javax.swing.JTextField LUsername;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JButton RBtnRegister;
    private javax.swing.JTextField RNIM;
    private javax.swing.JTextField RPassword;
    private javax.swing.JTextField RUsername;
    private javax.swing.JPanel RegisterPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
