/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password_manager;


import java.sql.*;
import javax.swing.*;
/**
 *
 * @author sunnyladdy
 */
public class showbankcard1 extends javax.swing.JInternalFrame implements mydbvariables{

    /**
     * Creates new form showbankcard
     */
    public static boolean flag = false,securitypass = false;
    public static String idnumber="";
    public showbankcard1() {
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

        showingDetailss = new javax.swing.JPanel();
        topcardname = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cardname = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        usernote = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        sno = new javax.swing.JTextField();
        passwordprotected = new javax.swing.JCheckBox();
        flagvar = new javax.swing.JLabel();
        get = new javax.swing.JButton();
        accountholdername = new javax.swing.JPasswordField();
        routingnumber = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        accountnumber = new javax.swing.JPasswordField();
        Delete_btn = new javax.swing.JButton();
        ok = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Bank Card");

        showingDetailss.setBackground(new java.awt.Color(255, 255, 255));
        showingDetailss.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                showingDetailssMouseMoved(evt);
            }
        });
        showingDetailss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                showingDetailssMouseEntered(evt);
            }
        });

        topcardname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        topcardname.setForeground(new java.awt.Color(255, 255, 255));
        topcardname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/password_manager/images/bankcardicon.png"))); // NOI18N
        topcardname.setText("dsdasdsds");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Account Holder");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Routing Number");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Name this Card");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Note");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/password_manager/images/bankcardbackground.png"))); // NOI18N

        jLabel19.setText("sno");

        passwordprotected.setText("Password Protected");

        flagvar.setForeground(new java.awt.Color(255, 255, 255));
        flagvar.setText("false");

        get.setForeground(new java.awt.Color(255, 255, 255));
        get.setText("get");
        get.setBorder(null);
        get.setContentAreaFilled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Account Number");

        javax.swing.GroupLayout showingDetailssLayout = new javax.swing.GroupLayout(showingDetailss);
        showingDetailss.setLayout(showingDetailssLayout);
        showingDetailssLayout.setHorizontalGroup(
            showingDetailssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showingDetailssLayout.createSequentialGroup()
                .addGroup(showingDetailssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(showingDetailssLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(topcardname, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(showingDetailssLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(showingDetailssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(flagvar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(get))
                        .addGap(60, 60, 60)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(sno, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(showingDetailssLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(showingDetailssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passwordprotected, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, showingDetailssLayout.createSequentialGroup()
                                .addGroup(showingDetailssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                                .addGroup(showingDetailssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(showingDetailssLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(routingnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(showingDetailssLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(showingDetailssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(usernote, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cardname, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(showingDetailssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(showingDetailssLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(accountnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, showingDetailssLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(accountholdername, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );
        showingDetailssLayout.setVerticalGroup(
            showingDetailssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showingDetailssLayout.createSequentialGroup()
                .addGroup(showingDetailssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(showingDetailssLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(topcardname, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(showingDetailssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(showingDetailssLayout.createSequentialGroup()
                        .addComponent(flagvar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(get))
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(showingDetailssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountholdername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(showingDetailssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(showingDetailssLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showingDetailssLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(routingnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(showingDetailssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(accountnumber, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(showingDetailssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(showingDetailssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernote, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(passwordprotected)
                .addContainerGap())
        );

        Delete_btn.setText("Delete");
        Delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_btnActionPerformed(evt);
            }
        });

        ok.setText("Update");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        jButton5.setText("Cancel");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(showingDetailss, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(showingDetailss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showingDetailssMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showingDetailssMouseMoved

    }//GEN-LAST:event_showingDetailssMouseMoved

    private void showingDetailssMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showingDetailssMouseEntered

    }//GEN-LAST:event_showingDetailssMouseEntered

    private void Delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_btnActionPerformed
        //DELETE FROM `details` WHERE 1
        if(securitypass != false)
        {
            try
            {
                Connection myconnection = DriverManager.getConnection(PATH+PLACE,USERNAME,PASSWORD);
                try
                {
                    String query = "DELETE FROM `bankcards` WHERE sno=?";
                    PreparedStatement mystatement = myconnection.prepareStatement(query);
                    mystatement.setString(1, sno.getText());
                    if(mystatement.executeUpdate()>0)
                    {
                        JOptionPane.showMessageDialog(this, "Deleted Successfully..");
                        dashlane.paymentsbox.doClick();
                        this.dispose();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "There is an Error in Deleting the Details Successfully..");
                    }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this, "Error Due to : "+e.getMessage());
                }
                finally
                {
                    myconnection.close();
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, "Error Due to : "+e.getMessage());
            }
            dashlane.securitypass = false;
            securitypass = false;
            dashlane.flag = false;
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Verify Your Password Then Click on Delete...");
            flag = true;
            verifypasswordframe obj = new verifypasswordframe();
            obj.idnumber=dashlane.idnumber;
            obj.call(evt.getActionCommand());
            obj.actions = evt.getActionCommand();
            System.out.println("Action Performing : "+evt.getActionCommand());
            //jDesktopPane1.add(obj);
            obj.setVisible(true);
        }
    }//GEN-LAST:event_Delete_btnActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        if(securitypass != false)
        {
            try
            {
                Connection myconnection = DriverManager.getConnection(PATH+PLACE, USERNAME, PASSWORD);
                try
                {
                    String query = "UPDATE `bankcards` SET `accountholdername`=?,`routingnumber`=?,`accountnumber`=?,`cardname`=?,`passwordprotected`=?,`note`=? WHERE sno=?";
                    //query = "UPDATE `creditcards` SET `cardnumber`=?,`securitycode`=?,`expirydate`=?,`password`=?,`website`=?,`name`=?,`category`=?,`note`=?,`passwordprotected`=? WHERE sno=?";
                    PreparedStatement obj = myconnection.prepareStatement(query);
                    obj.setString(1,accountholdername.getText());
                    obj.setString(2,routingnumber.getText());
                    obj.setString(3,accountnumber.getText());
                    obj.setString(4,cardname.getText());
                    obj.setString(6,usernote.getText());
                    if(passwordprotected.isSelected())
                    {
                        obj.setString(5, "true");
                    }
                    else
                    {
                        obj.setString(5, "false");
                    }
                    obj.setString(7,sno.getText());
                    System.out.println("Query : "+obj.toString());
                    if(obj.executeUpdate()>0)
                    {
                        JOptionPane.showMessageDialog(this,"Changes Has Been Saved..");
                        this.dispose();
                        dashlane.paymentsbox.doClick();
                        showpass.showpassin.setVisible(false);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this,"Error in Saving the Details..");
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
            showbankcard1.securitypass = false;
            dashlane.securitypass = false;
            securitypass = false;
            dashlane.flag = false;
            showbankcard1.flag = false;
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Verify Your Password");
            flag = true;
            verifypasswordframe.bankcard = true;
            verifypasswordframe obj = new verifypasswordframe();
            obj.idnumber=dashlane.idnumber;
            //jDesktopPane1.add(obj);
            obj.setVisible(true);
            securitypass = false;
            dashlane.securitypass = false;
            dashlane.flag = false;
            verifypasswordframe.actions=evt.getActionCommand();
            flag = false;
        }
    }//GEN-LAST:event_okActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
        dashlane.securitypass = false;
        securitypass = false;
        dashlane.flag = false;
        flag = false;
        verifypasswordframe.bankcard = false;
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton Delete_btn;
    public static javax.swing.JPasswordField accountholdername;
    public static javax.swing.JPasswordField accountnumber;
    public static javax.swing.JTextField cardname;
    public static javax.swing.JLabel flagvar;
    private javax.swing.JButton get;
    public static javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    public static javax.swing.JButton ok;
    public static javax.swing.JCheckBox passwordprotected;
    public static javax.swing.JPasswordField routingnumber;
    public static javax.swing.JPanel showingDetailss;
    public static javax.swing.JTextField sno;
    public static javax.swing.JLabel topcardname;
    public static javax.swing.JTextField usernote;
    // End of variables declaration//GEN-END:variables
}
