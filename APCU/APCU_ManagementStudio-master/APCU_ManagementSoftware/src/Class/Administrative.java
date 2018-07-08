
package Class;

import DB.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Administrative {
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    String username,password,type;
    int userID,option;
    
    public Administrative(){
        //Default constructor
    }
    public Administrative(String pusername, String ppassword, String ptype){
        //Constructor for add users/admins
        con = DBconnect.connect();
        
        username = pusername;
        password = ppassword;
        type = ptype;
        
    }
    
    public Administrative (int puserID, String pusername, String ppassword, String ptype){
        //Constructor for update users/admins
        
        con = DBconnect.connect();
        
        userID = puserID;
        username = pusername;
        password = ppassword;
        type = ptype;
    }
    
    public Administrative(int puserID,int poption){
        //Constructor for activate/deactivate user account
        
        con = DBconnect.connect();
        
        userID = puserID;
        option = poption;
    }
    
    public void addUser(){
        if(type.equals("User")){
        try{
            String sql = "INSERT INTO users (Username,Password,Type) VALUES ('"+username+"','"+password+"','"+type+"')";
            pst = con.prepareStatement(sql);
            pst.execute();
            
            String sql1 = "SELECT UserID FROM users WHERE Username = '"+username+"'";
            pst = con.prepareStatement(sql1);
            rs = pst.executeQuery();
            while(rs.next()){
                userID = Integer.parseInt(rs.getString(1));
            }
            JOptionPane.showMessageDialog(null, "User account added successfully!\nUserID : "+userID);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    }
    
    public void addAdmin(){
        if(type.equals("Admin")){
        try{
            String sql = "INSERT INTO users (Username,Password,Type) VALUES ('"+username+"','"+password+"','"+type+"')";
            pst = con.prepareStatement(sql);
            pst.execute();
            
            String sql1 = "SELECT UserID FROM users WHERE Username = '"+username+"'";
            pst = con.prepareStatement(sql1);
            rs = pst.executeQuery();
            while(rs.next()){
                userID = Integer.parseInt(rs.getString(1));
            }
            JOptionPane.showMessageDialog(null, "Admin account added successfully!\nUserID : "+userID);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
       
    }
    
    public void updateUser(){
        if(type.equals("User")){
        
            try{
                String sql = "UPDATE users SET username = '"+username+"', password = '"+password+"' WHERE UserID = '"+userID+"'";
                pst = con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "User account updated successfully!\nUserID : "+userID);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    
    }
    
    public void updateAdmin(){
        if(type.equals("Admin")){
            try{
                String sql = "UPDATE users SET username = '"+username+"', password = '"+password+"' WHERE UserID = '"+userID+"'";
                pst = con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Admin account updated successfully!\nUserID : "+userID);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        
        }
    }
    
    public void activateDeactivateUser(){
        if(option==1){
            try{
                String sql = "UPDATE users SET status = 'Active' WHERE UserID = '"+userID+"'";
                pst = con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "User account Activated successfully!\nUserID : "+userID);
            }
            catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        if(option==2){
            try{
                String sql1 = "UPDATE users SET status = 'Inactive' WHERE UserID = '"+userID+"'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                JOptionPane.showMessageDialog(null, "User account Deactivated successfully!\nUserID : "+userID);
            }
            catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    
    }
}
