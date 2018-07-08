
package Class;

import DB.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Login {
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    String username,password,time,type;
    int selection,result,userID;
    
   public Login(){
       //Default constructor
   } 
   
   public Login(String pusername,String ppassword,String ptime,int pselection){
       //Constructor for Login attempt
       con = DBconnect.connect();
       
       username = pusername;
       password = ppassword;
       time = ptime;
       selection = pselection;
   }
   
   public int LoginAttempt(){
       if(selection==1 || selection==2){
           if(selection==1){
               type = "User";
           }
           else if(selection ==2){
               type = "Admin";
           }
           
           try{
               String sql = "SELECT UserID FROM users WHERE Username = '"+username+"' AND Password = '"+password+"' AND Type = '"+type+"' AND status = 'Active'";
               pst = con.prepareStatement(sql);
               rs = pst.executeQuery();
               if(rs.next()){
                   userID = Integer.parseInt(rs.getString(1));
                   try{
                       String sql1 = "INSERT INTO loginhistory (UserID,Username,Type,DateTime) VALUES ('"+userID+"','"+username+"','"+type+"','"+time+"')";
                       pst = con.prepareStatement(sql1);
                       pst.execute();
                   }
                   catch(Exception e){
                       e.printStackTrace();
                   }
                   result = 1;
               }
               else{
                   result = -1;
               }
           }
           catch(Exception e){
               e.printStackTrace();
                }
       }
       return result;
   }
}
