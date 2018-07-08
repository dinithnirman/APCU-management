
package Class;

import DB.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import net.proteanit.sql.DbUtils;

public class Match {
    
    private int TournamentID;
    private int MatchID;
    private String MatchType;
    private String BallType;
    private String Date;
    private String Time;
    private String LocationType;
    private int GroundID;
    private String Description;
    private javax.swing.JTable MatchDetails;
    
    Connection connection = null;
    PreparedStatement pst = null;
    ResultSet rs =null;
    
    
    //Constuctor for method calling
    public Match( ){
       connection = DBconnect.connect();
    }
    
    //Constuctor for table load
    public Match( javax.swing.JTable pMatchDetails){
       connection = DBconnect.connect();
       MatchDetails = pMatchDetails;
    }
    
    //Constuctor for table load
    public Match( javax.swing.JTable pMatchDetails, int pMatchID){
       connection = DBconnect.connect();
       MatchDetails = pMatchDetails;
       MatchID = pMatchID;
    }
    
    //Constuctor for add method 
    public Match( int pTournamentID, String pMatchType, String pBallType, String pDate, String pTime, String pLocationType, int pGroundID, String pDescription){
        TournamentID = pTournamentID;
        MatchType = pMatchType;
        BallType = pBallType;
        Date = pDate;
        Time = pTime;
        LocationType = pLocationType;
        GroundID = pGroundID;
        Description = pDescription;
        
        connection = DBconnect.connect();
    }
    
    //Constuctor for update method 
    public Match( int pTournamentID, int pMatchID, String pMatchType, String pBallType, String pDate, String pTime, String pLocationType, int pGroundID, String pDescription){
        TournamentID = pTournamentID;
        MatchID = pMatchID;
        MatchType = pMatchType;
        BallType = pBallType;
        Date = pDate;
        Time = pTime;
        LocationType = pLocationType;
        GroundID = pGroundID;
        Description = pDescription;
        
        connection = DBconnect.connect();
    }
    
    //Add method
    public void addMatch(){
        try
        {
            String q = "INSERT INTO cmatch (TournamentID, MatchType, BallType, Date, Time, LocationType, GroundID, Description) VALUES ('"+TournamentID+"', '"+MatchType+"', '"+BallType+"', '"+Date+"', '"+Time+"', '"+LocationType+"', '"+GroundID+"', '"+Description+"')";
            pst = connection.prepareStatement(q);
            pst.execute();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        
    }
    
    
    //Returns Match ID
    public int getMatchID(){
        int ID = 0;
        try
        {
            String q = "SELECT CMatchID FROM cmatch WHERE TournamentID = '"+ TournamentID +"' AND MatchType = '"+ MatchType +"' AND BallType = '"+ BallType +"' AND Date = '"+ Date +"' AND Time = '"+ Time +"' AND LocationType = '"+ LocationType +"' AND GroundID = '"+ GroundID +"' AND Description = '"+ Description +"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                ID = Integer.parseInt(rs.getString("CMatchID"));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return ID; 
    }
    
    //Load data to the table
    public void matchTableLoad(int pID)
    {
        try
        {
            String q = "SELECT TournamentID, CMatchID, MatchType, BallType, Date, Time, LocationType, GroundID, Description FROM cmatch WHERE TournamentID = '"+pID+"'";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            MatchDetails.setModel(DbUtils.resultSetToTableModel(rs));
            //setTableHeader(0, RetailerDetails);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    //Load data to the table
    public void matchViewTableLoad(int pID)
    {
        try
        {
            String q = "SELECT CMatchID, MatchType, Description FROM cmatch WHERE TournamentID = '"+pID+"'";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            MatchDetails.setModel(DbUtils.resultSetToTableModel(rs));
            //setTableHeader(0, RetailerDetails);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    //Load data to the table
    public void matchTableLoadAssigment(int pID)
    {
        try
        {
            String q = "SELECT CMatchID, MatchType, BallType, Date, Time, LocationType, GroundID, Description FROM cmatch WHERE TournamentID = '"+pID+"'";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            MatchDetails.setModel(DbUtils.resultSetToTableModel(rs));
            //setTableHeader(0, RetailerDetails);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    //Update method
    public void updateMatch(){
        try
        {
            String q = "UPDATE cmatch SET MatchType = '"+ MatchType +"', BallType = '"+ BallType +"', Date = '"+ Date +"', Time = '"+ Time +"', LocationType = '"+ LocationType +"', GroundID = '"+ GroundID +"', Description = '"+ Description +"' WHERE TournamentID = '"+ TournamentID +"' AND CMatchID = '"+ MatchID +"'";
            pst = connection.prepareStatement(q);
            pst.execute();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    
    public void setGroundDetails(JComboBox GroundB){
        try {
            String q = "SELECT GroundID, Name, Address, Availability FROM ground";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while (rs.next()) {
                String GroundID = Integer.toString(rs.getInt("GroundID"));
                String Name = rs.getString("Name");
                String Address = rs.getString("Address");
                String Availability = rs.getString("Availability");
                
                String Result = GroundID+"   "+Name+",   "+Address+"   ("+Availability+")";
                GroundB.addItem(Result);
            }
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
    
    public String getGroundDetails(int pGroundID){
        String Result = null;
        
        try 
        {
            String q = "SELECT GroundID, Name, Address, Availability FROM ground WHERE GroundID = '"+pGroundID+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while (rs.next()) {
                String GroundID = Integer.toString(rs.getInt("GroundID"));
                String Name = rs.getString("Name");
                String Address = rs.getString("Address");
                String Availability = rs.getString("Availability");
                Result = GroundID+"   "+Name+",   "+Address+"   ("+Availability+")";
            }
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
        
        return Result;
    }
    
    //Filter out Ground ID out of tuple include all details
    public int filterGroundID(String pInput){
        int Count = 0 ;
        char ch = pInput.charAt(Count);
        
        while(Character.isDigit(ch)){
            Count++;
            ch = pInput.charAt(Count);
        }
        
        int result = Integer.parseInt(pInput.substring(0, Count));
        return result;
    }
    
    
    public boolean getValidDateRange(int pTournamentID, java.util.Date CDate){
        String StartDate, EndDate;
        java.util.Date SDate, EDate;
        boolean Result = true;
                
        try {
            String q = "SELECT StartDate, EndDate FROM tournament WHERE TournamentID = '"+pTournamentID+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while (rs.next()) {
                StartDate = rs.getString("StartDate");
                EndDate = rs.getString("EndDate");
                
                Function f1 = new Function();
                SDate = f1.getDate(StartDate);
                EDate = f1.getDate(EndDate);
                

                if((CDate.after(SDate)||CDate.equals(SDate))&&(CDate.before(EDate)||CDate.equals(EDate))){
                    Result = true;
                }else{
                    Result = false;
                }

            }
            
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
        
        return Result;
    }
    
    //Returns name of the ground
    public String getGroundName(int pGroundID){
        String Name = null;
        try
        {
            String q = "SELECT Name FROM ground WHERE GroundID = '"+ pGroundID +"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                Name = rs.getString("Name");
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return Name; 
    }
    
    //Get match details for view
    public void viewMatchDetails(int pMatchID, javax.swing.JLabel MIDL, javax.swing.JLabel MatchTypeL, javax.swing.JLabel BallTypeL, javax.swing.JLabel DateL, javax.swing.JLabel TimeL, javax.swing.JLabel LocationTypeL, javax.swing.JLabel GroundL){
        try
        {
            String q = "SELECT CMatchID, MatchType, BallType, Date, Time, LocationType, GroundID FROM cmatch WHERE CMatchID = '"+pMatchID+"'";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                MIDL.setText(Integer.toString(rs.getInt("CMatchID")));
                MatchTypeL.setText(rs.getString("MatchType"));
                BallTypeL.setText(rs.getString("BallType"));
                DateL.setText(rs.getString("Date"));
                TimeL.setText(rs.getString("Time"));
                LocationTypeL.setText(rs.getString("LocationType"));
                GroundL.setText(getGroundName(Integer.parseInt(rs.getString("GroundID"))));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    //Returns tournamentID of the match
    public int getTournamentID(int pMatchID){
        int ID = 0;
        try
        {
            String q = "SELECT TournamentID FROM cmatch WHERE CMatchID = '"+ pMatchID +"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                ID = Integer.parseInt(rs.getString("TournamentID"));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return ID; 
    }
    
    //Get match details for view assigment and make payment
    public void viewAMMatchDetails(int pTournamentID, javax.swing.JLabel MIDL, javax.swing.JLabel MatchTypeL, javax.swing.JLabel BallTypeL, javax.swing.JLabel DateL, javax.swing.JLabel TimeL, javax.swing.JLabel LocationTypeL, javax.swing.JLabel GroundL){
        try
        {
            String q = "SELECT CMatchID, MatchType, BallType, Date, Time, LocationType, GroundID FROM cmatch WHERE TournamentID = '"+pTournamentID+"'";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                MIDL.setText(Integer.toString(rs.getInt("CMatchID")));
                MatchTypeL.setText(rs.getString("MatchType"));
                BallTypeL.setText(rs.getString("BallType"));
                DateL.setText(rs.getString("Date"));
                TimeL.setText(rs.getString("Time"));
                LocationTypeL.setText(rs.getString("LocationType"));
                GroundL.setText(getGroundName(Integer.parseInt(rs.getString("GroundID"))));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    //Returns Description of the match
    public String getDescription(int pMatchID){
        String Description = null;
        try
        {
            String q = "SELECT Description FROM cmatch WHERE CMatchID = '"+ pMatchID +"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                Description = rs.getString("Description");
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return Description; 
    }
    
    
    //Get match type
    public void getMatchName(int pMatchID, javax.swing.JLabel MatchTypeL){
      
        try
        {
            String q = "SELECT MatchType FROM cmatch WHERE CMatchID = '"+ pMatchID +"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                MatchTypeL.setText(rs.getString("MatchType"));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
  
    }
}
