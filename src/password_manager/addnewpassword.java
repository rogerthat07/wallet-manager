/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password_manager;

import java.sql.*;
import javax.swing.*;
import static password_manager.mydbvariables.PASSWORD;
import static password_manager.mydbvariables.PATH;
import static password_manager.mydbvariables.PLACE;
import static password_manager.mydbvariables.USERNAME;

/**
 *
 * @author sunnyladdy
 */
public class addnewpassword extends javax.swing.JInternalFrame {

    /**
     * Creates new form addnewpassword
     */
    public static String idnumber="";
    public addnewpassword() {
        initComponents();
        try
            {
                Connection myconnection = DriverManager.getConnection(PATH+PLACE,USERNAME,PASSWORD);
                try
                {
                    String query = "select * from category_table";
                    PreparedStatement mystatement = myconnection.prepareStatement(query);
                    ResultSet myresult= mystatement.executeQuery();
                    if(myresult.next())
                    {
                        categorybox.removeAllItems();
                        categorybox.addItem("Choose Category");
                        do
                        {   
                            categorybox.addItem(myresult.getString("category"));
                        }
                        while(myresult.next());
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "There is an Error in Getting all the Categories..");
                    }
                    query = "select * from addedpasscat";
                    mystatement = myconnection.prepareStatement(query);
                    myresult = mystatement.executeQuery();
                    if(myresult.next())
                    {
                        do
                        {
                            categorybox.addItem(myresult.getString("category"));
                        }
                        while(myresult.next());
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
        websitebox = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        loginbox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passbox = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        categorybox = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        id = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Add New Password");
        setMinimumSize(new java.awt.Dimension(380, 380));
        setPreferredSize(new java.awt.Dimension(380, 380));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(380, 380));
        jPanel1.setLayout(null);

        jLabel1.setText("Website");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 20, 60, 30);
        jPanel1.add(websitebox);
        websitebox.setBounds(160, 20, 180, 30);

        jLabel2.setText("Login");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 70, 50, 30);
        jPanel1.add(loginbox);
        loginbox.setBounds(160, 70, 180, 30);

        jLabel3.setText("Password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 120, 70, 30);

        passbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passboxActionPerformed(evt);
            }
        });
        jPanel1.add(passbox);
        passbox.setBounds(160, 120, 180, 30);

        jLabel4.setText("Category");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 180, 80, 30);

        categorybox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Your Category", "Business", "Career", "Entertainment", "Finance", "Health", "News", "Other", "RealEstate", "Shooping", "Social Media", "Tech", "Travel" }));
        jPanel1.add(categorybox);
        categorybox.setBounds(160, 180, 180, 30);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(556, 268, 1, 10);
        jPanel1.add(id);
        id.setBounds(230, 10, 0, 0);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 380, 240);

        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(177, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(-10, 240, 390, 50);

        setBounds(0, 0, 393, 317);
    }// </editor-fold>//GEN-END:initComponents

    private void passboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passboxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Boolean flag =false;
        if(idnumber==""||loginbox.getText().isEmpty()||passbox.getText().isEmpty()||categorybox.getSelectedIndex()==0)
        {
            flag = true;
        }
        if(flag!=true)
        {
            try
                {
                    Connection myconnection = DriverManager.getConnection(PATH+PLACE, USERNAME, PASSWORD);
                    try
                    {
                        String query = "INSERT INTO `details`(id,login,password,website,name,category) VALUES (?,?,?,?,?,?)";
                        String We = new String();
                        PreparedStatement obj = myconnection.prepareStatement(query);
                        obj.setString(1, idnumber);
                        obj.setString(2, loginbox.getText());
                        obj.setString(3, passbox.getText());
                        boolean startswithhttp = false,startswithhttps = false,nothing = false;
                        if(websitebox.getText().startsWith("http://"))
                        {
                            startswithhttp = true;
                            nothing = true;
                        }
                        else if(websitebox.getText().startsWith("https://"))
                        {
                            startswithhttps = true;
                            nothing = true;
                        }
                        else
                        {
                            nothing = false;
                        }
                        if(nothing!=true)
                        {
                            We = websitebox.getText();
                            StringBuffer ob = new StringBuffer("https://");
                            ob.append(We);
                            websitebox.setText(ob.toString());
                        }
                        obj.setString(4, websitebox.getText());
                        obj.setString(5, We);
                        obj.setString(6, String.valueOf(categorybox.getSelectedIndex()));
                        if(obj.executeUpdate()>0)
                        {
                            JOptionPane.showMessageDialog(this, "Success!!!");
                            this.dispose();
                            dashlane.passbox.doClick();
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(this, "Got Some Error!!!");
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
            JOptionPane.showMessageDialog(this,"There is an error in the values supplied please Check them again...");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> categorybox;
    public static javax.swing.JLabel id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTextField loginbox;
    public static javax.swing.JTextField passbox;
    public static javax.swing.JTextField websitebox;
    // End of variables declaration//GEN-END:variables
}
