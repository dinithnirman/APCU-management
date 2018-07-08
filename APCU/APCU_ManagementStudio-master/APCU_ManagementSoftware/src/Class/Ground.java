
package Class;

import DB.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;

public class Ground {
    
    private int GroundID;
    private String Name;
    private String Address;
    private String TelephoneNo1;
    private javax.swing.JTable GroundDetails;
    
    Connection connection = null;
    PreparedStatement pst = null;
    ResultSet rs =null;
    
    
    //Constuctor for method calling
    public Ground( ){
       connection = DBconnect.connect();
    }
    
    //Constuctor for table load
    public Ground( javax.swing.JTable pUmpireDetails){
       connection = DBconnect.connect();
       GroundDetails = pUmpireDetails;
    }
    
    //Constuctor for add method 
    public Ground(String pName, String pAddress, String pTelephoneNo1){
        Name = pName;
        Address = pAddress;
        TelephoneNo1 = pTelephoneNo1;
        
        connection = DBconnect.connect();
    }
   
    
    //Constuctor for update method
    public Ground(int pGroundID, String pName, String pAddress, String pTelephoneNo1){
        GroundID = pGroundID;
        Name = pName;
        Address = pAddress;
        TelephoneNo1 = pTelephoneNo1;
        
        connection = DBconnect.connect();
    }
    
    
    //Add method
    public void addGround(){
        try
        {
            String q = "INSERT INTO ground(Name, Address, Telephone) VALUES ('"+ Name +"', '"+ Address +"', '"+ TelephoneNo1 +"')";
            pst = connection.prepareStatement(q);
            pst.execute();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        
    }
    
    
    //Update method
    public void updateGround(){
        try
        {
            String q = "UPDATE ground SET Name = '"+ Name +"', Address = '"+ Address +"', Telephone = '"+ TelephoneNo1 +"' WHERE GroundID = '"+ GroundID +"' ";
            pst = connection.prepareStatement(q);
            pst.execute();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    
    
    //Load data to the table
    public void groundTableLoad()
    {
        try
        {
            String q = "SELECT GroundID, Name, Address, Telephone FROM ground ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            GroundDetails.setModel(DbUtils.resultSetToTableModel(rs));
            //setTableHeader(0, RetailerDetails);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
   
    //Get availability of a ground
    public String getGroundAvailability(int pID){
        String Availability = null;
        try
        {
            String q = " SELECT Availability FROM ground WHERE GroundID = '"+pID+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                Availability = rs.getString("Availability");
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return Availability; 
    }
    
    
    //Set availability of a ground
    public void setGroundAvailability(String pAvailability, int pID){
        try
        {
            String q = "UPDATE ground SET Availability = '"+ pAvailability +"' WHERE GroundID = '"+ pID +"' ";
            pst = connection.prepareStatement(q);
            pst.execute();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    
}
