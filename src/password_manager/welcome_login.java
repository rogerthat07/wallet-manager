
package password_manager;

import java.awt.Color;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author sunnyladdy
 */
public class welcome_login extends javax.swing.JFrame implements mydbvariables {

    /**
     * Creates new form welcome_login
     */
    public welcome_login() {
        initComponents();
        passhash.setEchoChar((char)0);
        passhash.setCaretPosition(0);
        passhash.setForeground(new java.awt.Color(204, 204, 204));
        showpass.setVisible(false);
        hidepass.setVisible(false);
        confirmpasshash.setEchoChar((char)0);
        confirmpasshash.setCaretPosition(0);
        confirmpasshash.setForeground(new java.awt.Color(204, 204, 204));
        showpass1.setVisible(false);
        hidepass1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        hidepass = new javax.swing.JLabel();
        hidepass1 = new javax.swing.JLabel();
        showpass = new javax.swing.JLabel();
        showpass1 = new javax.swing.JLabel();
        txtemailbox = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        passhash = new javax.swing.JPasswordField();
        confirmpasshash = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome to Password Manager");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/password_manager/images/Anonymous2.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(280, 0, 38, 60);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Welcome To Password Manager");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(330, 10, 340, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/password_manager/images/maxresdefault (2).jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 897, 60);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Create Your Free Account");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(270, 90, 350, 20);

        jLabel5.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel5.setText("An Email and strong Password all you need to get Started.");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(270, 140, 470, 20);

        hidepass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/password_manager/images/hide_pass.png"))); // NOI18N
        hidepass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hidepassMouseClicked(evt);
            }
        });
        getContentPane().add(hidepass);
        hidepass.setBounds(560, 260, 90, 30);

        hidepass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/password_manager/images/hide_pass.png"))); // NOI18N
        hidepass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hidepass1MouseClicked(evt);
            }
        });
        getContentPane().add(hidepass1);
        hidepass1.setBounds(560, 330, 90, 30);

        showpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/password_manager/images/show_pass.png"))); // NOI18N
        showpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showpassMouseClicked(evt);
            }
        });
        getContentPane().add(showpass);
        showpass.setBounds(560, 260, 80, 26);

        showpass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/password_manager/images/show_pass.png"))); // NOI18N
        showpass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showpass1MouseClicked(evt);
            }
        });
        getContentPane().add(showpass1);
        showpass1.setBounds(560, 330, 80, 26);

        txtemailbox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtemailbox.setForeground(new java.awt.Color(204, 204, 204));
        txtemailbox.setText("Enter Your Email");
        txtemailbox.setToolTipText("");
        txtemailbox.setBorder(null);
        txtemailbox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtemailboxFocusGained(evt);
            }
        });
        txtemailbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtemailboxMouseClicked(evt);
            }
        });
        txtemailbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtemailboxKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtemailboxKeyReleased(evt);
            }
        });
        getContentPane().add(txtemailbox);
        txtemailbox.setBounds(270, 180, 360, 40);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(270, 230, 360, 10);

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(270, 370, 360, 20);

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(270, 300, 360, 10);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/password_manager/images/next_btn.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(770, 400, 80, 60);

        jButton1.setText("I already have an account");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(-20, 400, 230, 60);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 400, 900, 20);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/password_manager/images/maxresdefault (2).jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 400, 900, 90);

        passhash.setForeground(new java.awt.Color(204, 204, 204));
        passhash.setText("Enter Your Password");
        passhash.setBorder(null);
        passhash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passhashMouseClicked(evt);
            }
        });
        passhash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passhashKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passhashKeyReleased(evt);
            }
        });
        getContentPane().add(passhash);
        passhash.setBounds(270, 250, 360, 40);

        confirmpasshash.setForeground(new java.awt.Color(204, 204, 204));
        confirmpasshash.setText("Confirm Your Password");
        confirmpasshash.setBorder(null);
        confirmpasshash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmpasshashMouseClicked(evt);
            }
        });
        confirmpasshash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                confirmpasshashKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                confirmpasshashKeyReleased(evt);
            }
        });
        getContentPane().add(confirmpasshash);
        confirmpasshash.setBounds(270, 320, 360, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/password_manager/images/Background_Image.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 40, 900, 380);

        setSize(new java.awt.Dimension(893, 495));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtemailboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailboxFocusGained
        txtemailbox.setCaretPosition(0);
    }//GEN-LAST:event_txtemailboxFocusGained

    private void txtemailboxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailboxKeyPressed
        if(txtemailbox.getForeground()!=Color.BLACK)
        {
            if(txtemailbox.getText().equals("Enter Your Email"))
            {
                txtemailbox.setText("");
            }
        }
        txtemailbox.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtemailboxKeyPressed

    private void txtemailboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailboxKeyReleased
        if(txtemailbox.getText().isEmpty())
        {
            txtemailbox.setText("Enter Your Email");
            txtemailbox.setCaretPosition(0);
            txtemailbox.setForeground(new java.awt.Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtemailboxKeyReleased

    private void txtemailboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtemailboxMouseClicked
        if(txtemailbox.getForeground()!=Color.BLACK)
        {
            if(txtemailbox.getText().equals("Enter Your Email"))
            {
                txtemailbox.setCaretPosition(0);
            }
        }
    }//GEN-LAST:event_txtemailboxMouseClicked

    private void passhashKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passhashKeyPressed
        if(passhash.getForeground()!=Color.BLACK)
        {
            if(passhash.getText().equals("Enter Your Password"))
            {
                passhash.setText("");
                passhash.setEchoChar('*');
                showpass.setVisible(true);
            }
        }
        passhash.setForeground(Color.BLACK);
    }//GEN-LAST:event_passhashKeyPressed

    private void passhashKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passhashKeyReleased
        if(passhash.getText().isEmpty())
        {
            passhash.setEchoChar((char)0);
            passhash.setText("Enter Your Password");
            passhash.setCaretPosition(0);
            passhash.setForeground(new java.awt.Color(204, 204, 204));
            showpass.setVisible(false);
            hidepass.setVisible(false);
        }
    }//GEN-LAST:event_passhashKeyReleased

    private void passhashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passhashMouseClicked
        if(passhash.getForeground()!=Color.BLACK)
        {
            if(passhash.getText().equals("Enter Your Password"))
            {
                passhash.setCaretPosition(0);
            }
        }
    }//GEN-LAST:event_passhashMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Login obj = new Login();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void hidepassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidepassMouseClicked
        passhash.setEchoChar('*');
        showpass.setVisible(true);
        hidepass.setVisible(false);
    }//GEN-LAST:event_hidepassMouseClicked

    private void showpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showpassMouseClicked
        passhash.setEchoChar((char)0);
        showpass.setVisible(false);
        hidepass.setVisible(true);
    }//GEN-LAST:event_showpassMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Boolean flag = false;
        try
            {
                Connection myconnection = DriverManager.getConnection(PATH+PLACE, USERNAME, PASSWORD);
                try
                {
                    String qu = "select * from users where userEmail=?";
                    PreparedStatement mystatement = myconnection.prepareStatement(qu);
                    mystatement.setString(1, txtemailbox.getText());
                    ResultSet ob = mystatement.executeQuery();
                    if(ob.next())
                    {
                        flag = true;
                        Login object =new Login();
                        object.setVisible(true);
                        this.dispose();
                        JOptionPane.showMessageDialog(this, "The Account Allready Exists..\nYou have to Login in this Portal..");
                        object.txtemailbox.setText(txtemailbox.getText());
                        object.passhash.setText(passhash.getText());
                        object.passhash.setEchoChar('*');
                        object.passhash.setForeground(java.awt.Color.BLACK);
                        object.txtemailbox.setForeground(java.awt.Color.BLACK);
                        object.jButton2.doClick(600);
                    }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, "Error Due to : "+e.getMessage());
                }
                finally
                {
                    myconnection.close();
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error Due to : "+e.getMessage());
            }
        if(flag!=true)
        {
        if(passhash.getText().equals(confirmpasshash.getText()))
        {
            try
            {
                Connection myconnection = DriverManager.getConnection(PATH+PLACE, USERNAME, PASSWORD);
                try
                {
                    String query = "INSERT INTO `users`(`userEmail`, `userPass`) VALUES (?,?)";
                    PreparedStatement obj = myconnection.prepareStatement(query);
                    obj.setString(1, txtemailbox.getText());
                    obj.setString(2, passhash.getText());
                    if(obj.executeUpdate()>0)
                    {
                        JOptionPane.showMessageDialog(null, "Successfully Created a User with Email : "+txtemailbox.getText()+"\nYou can Login Now...");
                        Login on = new Login();
                        on.setVisible(true);
                        this.dispose();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Error In Creating the User...");
                        txtemailbox.setText("Enter Your Email");
                        txtemailbox.setCaretPosition(0);
                        txtemailbox.setForeground(new java.awt.Color(204, 204, 204));
                        passhash.setText("Enter Your Password");
                        passhash.setCaretPosition(0);
                        passhash.setEchoChar((char)0);
                        passhash.setForeground(new java.awt.Color(204, 204, 204));
                        confirmpasshash.setText("Confirm Your Password");
                        confirmpasshash.setCaretPosition(0);
                        confirmpasshash.setEchoChar((char)0);
                        confirmpasshash.setForeground(new java.awt.Color(204, 204, 204));
                        showpass.setVisible(false);
                        hidepass.setVisible(false);
                        showpass1.setVisible(false);
                        hidepass1.setVisible(false);
                    }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, "Error Due to : "+e.getMessage());
                }
                finally
                {
                    myconnection.close();
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error Due to : "+e.getMessage());
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Password Doesn't Match");
        }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void confirmpasshashKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmpasshashKeyPressed
        if(confirmpasshash.getForeground()!=Color.BLACK)
        {
            if(confirmpasshash.getText().equals("Confirm Your Password"))
            {
                confirmpasshash.setText("");
                confirmpasshash.setEchoChar('*');
                showpass1.setVisible(true);
            }
        }
        confirmpasshash.setForeground(Color.BLACK);
    }//GEN-LAST:event_confirmpasshashKeyPressed

    private void confirmpasshashKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmpasshashKeyReleased
        if(confirmpasshash.getText().isEmpty())
        {
            confirmpasshash.setEchoChar((char)0);
            confirmpasshash.setText("Confirm Your Password");
            confirmpasshash.setCaretPosition(0);
            confirmpasshash.setForeground(new java.awt.Color(204, 204, 204));
            showpass1.setVisible(false);
            hidepass1.setVisible(false);
        }
    }//GEN-LAST:event_confirmpasshashKeyReleased

    private void confirmpasshashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmpasshashMouseClicked
        if(confirmpasshash.getForeground()!=Color.BLACK)
        {
            if(confirmpasshash.getText().equals("Confirm Your Password"))
            {
                confirmpasshash.setCaretPosition(0);
            }
        }
    }//GEN-LAST:event_confirmpasshashMouseClicked

    private void hidepass1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidepass1MouseClicked
        confirmpasshash.setEchoChar('*');
        hidepass1.setVisible(false);
        showpass1.setVisible(true);
    }//GEN-LAST:event_hidepass1MouseClicked

    private void showpass1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showpass1MouseClicked
        confirmpasshash.setEchoChar((char)0);
        showpass1.setVisible(false);
        hidepass1.setVisible(true);
    }//GEN-LAST:event_showpass1MouseClicked

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
            java.util.logging.Logger.getLogger(welcome_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(welcome_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(welcome_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(welcome_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new welcome_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmpasshash;
    private javax.swing.JLabel hidepass;
    private javax.swing.JLabel hidepass1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPasswordField passhash;
    private javax.swing.JLabel showpass;
    private javax.swing.JLabel showpass1;
    private javax.swing.JTextField txtemailbox;
    // End of variables declaration//GEN-END:variables
}
