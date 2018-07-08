
package Validation;

import DB.DBconnect;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Validation {
    Connection connection = null;
    PreparedStatement pst = null;
    ResultSet rs =null;
    
    public Validation(){
        connection = DBconnect.connect();
    }
    
    
    public boolean emailValidation(String email){
        boolean result;
        char emailArray[] = email.toCharArray();
        int letter = 0, whiteSpace=0, atSign=0, test;
        
        for(char ch:emailArray){
             test = (Character.isWhitespace(ch)? whiteSpace++: (ch=='@')?atSign++ : letter++);
        }
        
        
        result = (whiteSpace==0 && atSign==1)? true: false;
        return result;
    }
    
    
    public boolean telephoneValidation(String telephone, int input){
        boolean result;
        char telephoneArray[] = telephone.toCharArray();
        int number = 0, letter=0, test=0;
        
        for(char ch:telephoneArray){
            test = (Character.isDigit(ch))? number++ : letter++ ;
        }
        
        if(input==1){
            result = (number == 10)? true : false ;   
        }else{
            result = (number == 0 && letter == 0)? true : false ;
        }
        
        return result; 
    }
    
    
    public boolean accountNoValidation(String pAccountNo){
        boolean result;
        char accountNoArray[] = pAccountNo.toCharArray();
        int number = 0, letter=0, test=0;
        
        for(char ch:accountNoArray){
            test = (Character.isDigit(ch))? number++ : letter++ ;
        }
        
        result = (accountNoArray.length == number)? true : false ;
        
        return result; 
    }
    
 //Internet connection validatiom
     public static boolean InternetConnection ()
    {
        Socket sock = new Socket();
        InetSocketAddress addr = new InetSocketAddress("www.google.com",80); 

        try
        {
            sock.connect(addr,3000);
            //JOptionPane.showMessageDialog(null,"You are connected!");
            
            return true;
        }
        catch (IOException e)
        {
            JOptionPane.showMessageDialog(null,"Please check your Internet Connection!","Error",JOptionPane.ERROR_MESSAGE);

            return false;
        }
        finally
        {
            
            
            try {
                sock.close();
            } catch (IOException ex) {
                      
                    JOptionPane.showMessageDialog(null,"Please check your Internet Connection!", "Error", JOptionPane.ERROR_MESSAGE);

                     return false;            }
            
            
        }
    }
        
}
