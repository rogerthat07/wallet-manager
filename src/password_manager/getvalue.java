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

public class getvalue {
    public static int get(String s,String y)
    {
        boolean flag = false;
        int sno=1;
            try
            {
                Connection myconnection = DriverManager.getConnection(PATH+PLACE, USERNAME, PASSWORD);
                try
                {
                    String query = "SELECT MAX(`"+s+"`) FROM `"+y+"` WHERE 1";
                    PreparedStatement obj = myconnection.prepareStatement(query);
                    //System.out.println(obj.toString());
                    ResultSet result = obj.executeQuery();
                    flag = true;
                    if(result.next())
                    {
                        sno=result.getInt(1)+1;
                    }
                    else
                    {
                        sno=1;
                    }
                }
                catch(Exception e)
                {
                    flag = false;
                    JOptionPane.showMessageDialog(null, "Error Due to : "+e.getMessage());
                    e.printStackTrace();
                }
                finally
                {
                    myconnection.close();
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error Due to : "+e.getMessage());
                e.printStackTrace();
            }
            if(flag == false)
            {
                return 0;
            }
            else
            {
                return sno;
            }
    }
    public static boolean exists(int a)
    {
        boolean flag = false;
        int sno=1;
            try
            {
                Connection myconnection = DriverManager.getConnection(PATH+PLACE, USERNAME, PASSWORD);
                try
                {
                    String query = "SELECT * from items where sno=?";
                    PreparedStatement obj = myconnection.prepareStatement(query);
                    obj.setString(1, String.valueOf(a));    
                    //System.out.println(obj.toString());
                    ResultSet result = obj.executeQuery();
                    flag = true;
                    if(result.next())
                    {
                        return true;
                    }
                    else
                    {
                        return false;
                    }
                }
                catch(Exception e)
                {
                    flag = false;
                    JOptionPane.showMessageDialog(null, "Error Due to : "+e.getMessage());
                    e.printStackTrace();
                }
                finally
                {
                    myconnection.close();
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error Due to : "+e.getMessage());
                e.printStackTrace();
            }
            if(flag == false)
            {
                return false;
            }
            else
            {
                return true;
            }
    }
}
