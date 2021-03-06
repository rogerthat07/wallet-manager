/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password_manager;

import javax.swing.*;
import java.awt.*;

import java.sql.*;

/**
 *
 * @author sunnyladdy
 */
public class Login extends javax.swing.JFrame implements mydbvariables {

    /**
     * Creates new form Login
     */
    
    public Login() {
        initComponents();
        passhash.setEchoChar((char)0);
        //passhash.setText("Enter Your Password");
        passhash.setCaretPosition(0);
        passhash.setForeground(new java.awt.Color(204, 204, 204));
        showpass.setVisible(false);
        hidepass.setVisible(false);
    }
    
    public Login(String er,String ef) {
        if(!er.isEmpty())
        {
            passhash.setText(ef);
            txtemailbox.setText(er);
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtemailbox = new javax.swing.JTextField();
        hidepass = new javax.swing.JLabel();
        showpass = new javax.swing.JLabel();
        passhash = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/password_manager/images/Anonymous2.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 20, 40, 60);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dashlane");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 20, 130, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/password_manager/images/maxresdefault (2).jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1280, 100);

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
        txtemailbox.setBounds(30, 120, 280, 40);

        hidepass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/password_manager/images/hide_pass.png"))); // NOI18N
        hidepass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hidepassMouseClicked(evt);
            }
        });
        getContentPane().add(hidepass);
        hidepass.setBounds(240, 200, 90, 30);

        showpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/password_manager/images/show_pass.png"))); // NOI18N
        showpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showpassMouseClicked(evt);
            }
        });
        getContentPane().add(showpass);
        showpass.setBounds(240, 200, 80, 26);

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
        passhash.setBounds(30, 190, 280, 40);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(30, 170, 270, 10);

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(30, 240, 270, 10);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/password_manager/images/Login_button.png"))); // NOI18N
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
        jButton2.setBounds(30, 270, 270, 70);

        jLabel6.setText("Create an Account");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(120, 350, 130, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/password_manager/images/Background_Image.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 94, 480, 380);

        setSize(new java.awt.Dimension(337, 459));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passhashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passhashMouseClicked
        if(passhash.getForeground()!=Color.BLACK)
        {
            if(passhash.getText().equals("Enter Your Password"))
            {
                passhash.setCaretPosition(0);
            }
        }
    }//GEN-LAST:event_passhashMouseClicked

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

    private void showpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showpassMouseClicked
        passhash.setEchoChar((char)0);
        showpass.setVisible(false);
        hidepass.setVisible(true);
    }//GEN-LAST:event_showpassMouseClicked

    private void hidepassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidepassMouseClicked
        passhash.setEchoChar('*');
        showpass.setVisible(true);
        hidepass.setVisible(false);
    }//GEN-LAST:event_hidepassMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        welcome_login obj = new welcome_login();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try
        {
            Connection myconnection = DriverManager.getConnection(PATH+PLACE, USERNAME, PASSWORD);
            try
            {
                String query = "select * from users where userEmail=? and userPass=?";
                PreparedStatement obj = myconnection.prepareStatement(query);
                obj.setString(1, txtemailbox.getText());
                obj.setString(2, passhash.getText());
                ResultSet obj1 = obj.executeQuery();
                if(obj1.next())
                {
                    JOptionPane.showMessageDialog(null, "Successfully Logged In...");
                    this.dispose();
                    dashlane home = new dashlane();
                    home.setVisible(true);
                    home.idnumber = obj1.getString("id");
                    System.out.println("Id Number : "+home.idnumber);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Username/Password Error...");
                    txtemailbox.setText("Enter Your Email");
                    txtemailbox.setCaretPosition(0);
                    txtemailbox.setForeground(new java.awt.Color(204, 204, 204));
                    passhash.setEchoChar((char)0);
                    passhash.setText("Enter Your Password");
                    passhash.setCaretPosition(0);
                    passhash.setForeground(new java.awt.Color(204, 204, 204));
                    showpass.setVisible(false);
                    hidepass.setVisible(false);
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
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtemailboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailboxKeyReleased
        if(txtemailbox.getText().isEmpty())
        {
            txtemailbox.setText("Enter Your Email");
            txtemailbox.setCaretPosition(0);
            txtemailbox.setForeground(new java.awt.Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtemailboxKeyReleased

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

    private void txtemailboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtemailboxMouseClicked
        if(txtemailbox.getForeground()!=Color.BLACK)
        {
            if(txtemailbox.getText().equals("Enter Your Email"))
            {
                txtemailbox.setCaretPosition(0);
            }
        }
    }//GEN-LAST:event_txtemailboxMouseClicked

    private void txtemailboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailboxFocusGained
        txtemailbox.setCaretPosition(0);
    }//GEN-LAST:event_txtemailboxFocusGained

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hidepass;
    public static javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    public static javax.swing.JPasswordField passhash;
    private javax.swing.JLabel showpass;
    public static javax.swing.JTextField txtemailbox;
    // End of variables declaration//GEN-END:variables
}
