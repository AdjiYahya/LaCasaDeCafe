/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programdata;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Owner
 */
public class LoginForm extends javax.swing.JFrame {
    Connection conn =null;
    Statement st = null;
    
    

    /**
     * Creates new form LoginForm
     */
    public LoginForm(java.awt.Frame parent, boolean modal) { 
        initComponents();
        try {
 Class.forName("com.mysql.jdbc.Driver");

conn=DriverManager.getConnection("jdbc:mysql://localhost/dbroastery","root","");
 st=conn.createStatement();
 JOptionPane.showMessageDialog(null, "Connected");
 }
 catch(Exception ex){
 JOptionPane.showMessageDialog(null,"Failed Connection: " + ex);
 } }

    LoginForm() {
 //To change body of generated methods, choose Tools | Templates.
    }
 
    private void HapusLayar(){
 Textusername.setText("");
 Fieldpassword.setText("");
 Textusername.setEnabled(true);
 Fieldpassword.setEnabled(true);
 }

private void CekLogin(){
    try{
if(Textusername.getText().equals("") || Fieldpassword.getPassword().equals("")){
        JOptionPane.showMessageDialog(rootPane, "Data cannot be empty", "message", JOptionPane.ERROR_MESSAGE);
        Textusername.requestFocus();
           HapusLayar();
        }else{
st = conn.createStatement();
String sql = ("SELECT * FROM login WHERE username ='"+Textusername.getText()+"' AND password ='"+String.valueOf(Fieldpassword.getPassword())+"'");
ResultSet rs = st.executeQuery(sql);
if(rs.next()){
this.dispose();

}else{
JOptionPane.showMessageDialog(rootPane, "UserName and/or Password Incorrect or Unregistered", "Message",
JOptionPane.ERROR_MESSAGE);
HapusLayar();
}
}
}catch(Exception e){
e.printStackTrace();

}
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
        Username = new javax.swing.JLabel();
        Textusername = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        RegisterButton = new javax.swing.JButton();
        Fieldpassword = new javax.swing.JPasswordField();
        Cashier = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.BorderLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(640, 400));
        jPanel1.setLayout(null);

        Username.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 153, 102));
        Username.setText("Username");
        jPanel1.add(Username);
        Username.setBounds(140, 70, 131, 30);

        Textusername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Textusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextusernameActionPerformed(evt);
            }
        });
        jPanel1.add(Textusername);
        Textusername.setBounds(60, 100, 240, 40);

        Password.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 153, 102));
        Password.setText("Password");
        jPanel1.add(Password);
        Password.setBounds(400, 70, 131, 30);

        LoginButton.setBackground(new java.awt.Color(102, 51, 0));
        LoginButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(255, 204, 153));
        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(LoginButton);
        LoginButton.setBounds(320, 190, 110, 31);

        RegisterButton.setBackground(new java.awt.Color(102, 51, 0));
        RegisterButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RegisterButton.setForeground(new java.awt.Color(255, 204, 153));
        RegisterButton.setText("Register");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });
        jPanel1.add(RegisterButton);
        RegisterButton.setBounds(180, 190, 120, 31);
        jPanel1.add(Fieldpassword);
        Fieldpassword.setBounds(320, 100, 240, 40);

        Cashier.setBackground(new java.awt.Color(102, 51, 0));
        Cashier.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Cashier.setForeground(new java.awt.Color(255, 204, 153));
        Cashier.setText("Cashier");
        Cashier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashierActionPerformed(evt);
            }
        });
        jPanel1.add(Cashier);
        Cashier.setBounds(320, 260, 110, 30);

        jLabel1.setFont(new java.awt.Font("Rockwell", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 102));
        jLabel1.setText("LA CASA DE CAFE ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 20, 318, 47);

        jLabel2.setBackground(new java.awt.Color(153, 51, 0));
        jLabel2.setForeground(new java.awt.Color(102, 51, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_e807579edb93300913645941f251c97d.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 640, 400);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
    CekLogin();
   
    Order x = new Order();
    Order.UsernameOrder.setText(LoginForm.Textusername.getText());
    x.setVisible(true);
  
    
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        this.setVisible(false);
        new RegisterForm().setVisible(true);
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void TextusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextusernameActionPerformed

    private void CashierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashierActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new LoginCashier().setVisible(true);
    }//GEN-LAST:event_CashierActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              LoginForm dialog = new LoginForm(new javax.swing.JFrame(),
            true);
 
              dialog.addWindowListener(new
java.awt.event.WindowAdapter() {
 @Override
public void
windowClosing(java.awt.event.WindowEvent e) {
 System.exit(0);
 }
 });
 dialog.setVisible(true);

 }
 });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cashier;
    private javax.swing.JPasswordField Fieldpassword;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel Password;
    private javax.swing.JButton RegisterButton;
    public static javax.swing.JTextField Textusername;
    private javax.swing.JLabel Username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
