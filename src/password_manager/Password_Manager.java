
package password_manager;

import java.sql.*;
import javax.swing.*;

import java.util.Scanner;
import java.util.*;

import javax.swing.JOptionPane;

public class Password_Manager implements mydbvariables {
    
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    //JOptionPane.showMessageDialog(null, "Done");
                    break;
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error in Applying The Theme.");
        }
        try
        {
            Connection myconnection = DriverManager.getConnection(PATH+PLACE, USERNAME, PASSWORD);
            try
            {
                String query = "select * from users";
                PreparedStatement obj = myconnection.prepareStatement(query);
                ResultSet obj1 = obj.executeQuery();
                if(obj1.next())
                {
                    Login o = new Login();
                    o.setVisible(true);
                }
                else
                {
                    welcome_login o = new welcome_login();
                    o.setVisible(true);
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Inner Error Due to : "+e.getMessage());
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Outter Error Due to : "+e.getMessage());
        }
    }
    
}
