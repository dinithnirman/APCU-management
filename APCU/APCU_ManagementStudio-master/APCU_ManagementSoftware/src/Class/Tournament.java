
package Class;

import DB.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;

public class Tournament {
    
    private int TournamentID;
    private String Name;
    private String StartDate;
    private String EndDate;
    private String ContactPerson;
    private String TelephoneNo1;
    private String TelephoneNo2;
    private String Address;
    private String Email;
    private String RPaymentStatus;
    private String TotalAmount;
    private javax.swing.JTable TournamentDetails;
    int TelephoneNoCount;
    
    Connection connection = null;
    PreparedStatement pst = null;
    ResultSet rs =null;
    
    
    //Constuctor for method calling
    public Tournament( ){
       connection = DBconnect.connect();
    }
    
    //Constuctor for tableload
    public Tournament( javax.swing.JTable pTournamentDetails){
       connection = DBconnect.connect();
       TournamentDetails = pTournamentDetails;
    }
    
    //Constuctor for add method with two telephone numbers
    public Tournament(String pName, String pStartDate, String pEndDate, String pContactPerson, String pTelephoneNo1, String pTelephoneNo2, String pAddress, String pEmail, String pTotalAmount){
        Name = pName;
        StartDate = pStartDate;
        EndDate = pEndDate;
        ContactPerson = pContactPerson;
        TelephoneNo1 = pTelephoneNo1;
        TelephoneNo2 = pTelephoneNo2;
        Address = pAddress;
        Email = pEmail;
        TotalAmount = pTotalAmount;
        TelephoneNoCount = 2;
        
        connection = DBconnect.connect();
    }
    
    //Constuctor for add method with one telephone numbers
    public Tournament(String pName, String pStartDate, String pEndDate, String pContactPerson, String pTelephoneNo1, String pAddress, String pEmail, String pTotalAmount){
        Name = pName;
        StartDate = pStartDate;
        EndDate = pEndDate;
        ContactPerson = pContactPerson;
        TelephoneNo1 = pTelephoneNo1;
        Address = pAddress;
        Email = pEmail;
        TotalAmount = pTotalAmount;
        TelephoneNoCount = 1;
        
        connection = DBconnect.connect();
    }
    
    //Constuctor for update method with two telephone numbers
    public Tournament(int pTournamentID, String pName, String pStartDate, String pEndDate, String pContactPerson, String pTelephoneNo1, String pTelephoneNo2, String pAddress, String pEmail, String pTotalAmount){
        TournamentID = pTournamentID;
        Name = pName;
        StartDate = pStartDate;
        EndDate = pEndDate;
        ContactPerson = pContactPerson;
        TelephoneNo1 = pTelephoneNo1;
        TelephoneNo2 = pTelephoneNo2;
        Address = pAddress;
        Email = pEmail;
        TotalAmount = pTotalAmount;
        TelephoneNoCount = 2;
        
        connection = DBconnect.connect();
    }
    
    //Constuctor for update method with one telephone numbers
    public Tournament(int pTournamentID, String pName, String pStartDate, String pEndDate, String pContactPerson, String pTelephoneNo1, String pAddress, String pEmail, String pTotalAmount){
        TournamentID = pTournamentID;
        Name = pName;
        StartDate = pStartDate;
        EndDate = pEndDate;
        ContactPerson = pContactPerson;
        TelephoneNo1 = pTelephoneNo1;
        Address = pAddress;
        Email = pEmail;
        TotalAmount = pTotalAmount;
        TelephoneNoCount = 1;
        
        connection = DBconnect.connect();
    }
    
    //Add method
    public void addTournament(){
        try
        {
            String q = "INSERT INTO tournament (Name, StartDate, EndDate, ContactPerson, Address, Email, TotalAmount) VALUES ('"+Name+"', '"+StartDate+"', '"+EndDate+"', '"+ContactPerson+"', '"+Address+"', '"+Email+"', '"+TotalAmount+"')";
            pst = connection.prepareStatement(q);
            pst.execute();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        
        TournamentID = getTournamentID();
        addContactPersonTelephone();
        
    }
    
    //Add contact details method
    public void addContactPersonTelephone(){
        if(TelephoneNoCount == 0){
            try
            {
                String q = "INSERT INTO contactpersontelephone(TournamentID, Telephone, Count) VALUES ('"+ TournamentID +"', '"+ TelephoneNo2 +"', '"+ 2 +"')";
                pst = connection.prepareStatement(q);
                pst.execute();
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
        
        if(TelephoneNoCount == 1){
            try
            {
                String q = "INSERT INTO contactpersontelephone(TournamentID, Telephone, Count) VALUES ('"+ TournamentID +"', '"+ TelephoneNo1 +"', '"+ 1 +"')";
                pst = connection.prepareStatement(q);
                pst.execute();
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
        
        if(TelephoneNoCount == 2){
            try
            {
                String q = "INSERT INTO contactpersontelephone(TournamentID, Telephone, Count) VALUES ('"+ TournamentID +"', '"+ TelephoneNo1 +"', '"+ 1 +"')";
                pst = connection.prepareStatement(q);
                pst.execute();
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            
            try
            {
                String q = "INSERT INTO contactpersontelephone(TournamentID, Telephone, Count) VALUES ('"+ TournamentID +"', '"+ TelephoneNo2 +"', '"+ 2 +"')";
                pst = connection.prepareStatement(q);
                pst.execute();
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
        
    }
    
    //Returns Tournament ID
    public int getTournamentID(){
        int ID = 0;
        try
        {
            String q = "SELECT TournamentID FROM tournament WHERE Name = '"+ Name +"' AND StartDate = '"+ StartDate +"' AND EndDate = '"+ EndDate +"' AND ContactPerson = '"+ ContactPerson +"' AND Address = '"+ Address +"' AND TotalAmount = '"+ TotalAmount +"'";
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
    
    //Load data to the table
    public void tournamentTableLoad()
    {
        try
        {
            String q = "SELECT TournamentID, Name, StartDate, EndDate, ContactPerson, Address, Email, TotalAmount FROM tournament ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            TournamentDetails.setModel(DbUtils.resultSetToTableModel(rs));
            //setTableHeader(0, RetailerDetails);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    //Load data to the table
    public void tournamentTableLoadAssignment()
    {
        try
        {
            String q = "SELECT TournamentID, Name, StartDate, EndDate, ContactPerson, TotalAmount, RPaymentStatus FROM tournament ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            TournamentDetails.setModel(DbUtils.resultSetToTableModel(rs));
            //setTableHeader(0, RetailerDetails);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    //Returns telephone count
    public int getTPCount(int pID){
        int Count = 0;
        try
        {
            String q = " SELECT COUNT(*) FROM contactpersontelephone WHERE TournamentID = '"+pID+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                Count = rs.getInt("COUNT(*)");
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return Count; 
    }
    
    //Get telephone number of a tournament
    public String getContactPersonTelephone(int pID, int pCount){
        String TP = null;
        try
        {
            String q = " SELECT Telephone FROM contactpersontelephone WHERE TournamentID = '"+pID+"' AND Count = '"+pCount+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                TP = rs.getString("Telephone");
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return TP; 
    }
    
    //Get telephone number of an umpire
    public String getRPaymentStatus(int pID){
        String RPaymentStatus = null;
        try
        {
            String q = " SELECT RPaymentStatus FROM tournament WHERE TournamentID = '"+pID+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                RPaymentStatus = rs.getString("RPaymentStatus");
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return RPaymentStatus; 
    }
    
    //Returns Tournament ID
    public int xgetTournamentID(){
        int ID = 0;
        try
        {
            String q = "SELECT TournamentID FROM tournament WHERE Name = '"+ Name +"' AND StartDate = '"+ StartDate+"' AND EndDate = '"+ EndDate+"' AND ContactPerson = '"+ ContactPerson +"' AND Address = '"+ Address +"' AND Email = '"+ Email +"' AND RPaymentStatus = '"+ RPaymentStatus +"' AND TotalAmount = '"+ TotalAmount +"'";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                ID = Integer.parseInt(rs.getString("UmpireID"));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return ID; 
    }
    
    //Update method
    public void updateTournament(){
        try
        {
            String q = "UPDATE tournament SET Name = '"+ Name +"', StartDate = '"+ StartDate +"', EndDate = '"+ EndDate +"', ContactPerson = '"+ ContactPerson +"', Address = '"+ Address +"', Email = '"+ Email +"', TotalAmount = '"+ TotalAmount +"' WHERE TournamentID = '"+ TournamentID +"' ";
            pst = connection.prepareStatement(q);
            pst.execute();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        
        
        if(getTPCount(TournamentID)==TelephoneNoCount){
            updateContactPersonTelephone();
        }else if(getTPCount(TournamentID)<TelephoneNoCount){
            TelephoneNoCount=1;
            updateContactPersonTelephone();
            TelephoneNoCount=0;
            addContactPersonTelephone();
        }
        
    
        
    }
    
    //Update contact details method
    public void updateContactPersonTelephone(){
        
        if(TelephoneNoCount == 1){
            try
            {
                String q = "UPDATE contactpersontelephone SET  Telephone = '"+ TelephoneNo1 +"' WHERE TournamentID = '"+ TournamentID +"' AND Count = '"+ 1 +"' ";
                pst = connection.prepareStatement(q);
                pst.execute();
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
        
        if(TelephoneNoCount == 2){
            try
            {
                String q = "UPDATE contactpersontelephone SET  Telephone = '"+ TelephoneNo1 +"' WHERE TournamentID = '"+ TournamentID +"' AND Count = '"+ 1 +"' ";
                pst = connection.prepareStatement(q);
                pst.execute();
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            
            try
            {
                String q = "UPDATE contactpersontelephone SET Telephone = '"+ TelephoneNo2 +"' WHERE TournamentID = '"+ TournamentID +"' AND Count = '"+ 2 +"' ";
                pst = connection.prepareStatement(q);
                pst.execute();
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }   
    }
    
    //Update to settled
    public void updatePaymentStatus(int pTournamentID){
        try
        {
            String q = "UPDATE tournament SET RPaymentStatus = 'Settled' WHERE TournamentID = '"+ pTournamentID +"' ";
            pst = connection.prepareStatement(q);
            pst.execute();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    
    //Load data to the view table
    public void viewTournamentTableLoad(int pUmpireID)
    {
        try
        {
            String q = "SELECT T.TournamentID, T.Name, T.ContactPerson, C.CMatchID, C.MatchType, C.Description FROM tournament T, cmatch C, umpireallocation U WHERE C.TournamentID = T.TournamentID AND U.CMatchID = C.CMatchID AND U.UmpireID = '"+pUmpireID+"' ORDER BY T.TournamentID";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            TournamentDetails.setModel(DbUtils.resultSetToTableModel(rs));
            //setTableHeader(0, RetailerDetails);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    //Load data to the view table
    public void reportTournamentTableLoad()
    {
        try
        {
            String q = "SELECT TournamentID, Name, ContactPerson FROM tournament";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            TournamentDetails.setModel(DbUtils.resultSetToTableModel(rs));
            //setTableHeader(0, RetailerDetails);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    //Load data to the view table
    public void sViewTournamentTableLoad(int pScorerID)
    {
        try
        {
            String q = "SELECT T.TournamentID, T.Name, T.ContactPerson, C.CMatchID, C.MatchType, C.Description FROM tournament T, cmatch C, scorerallocation S WHERE C.TournamentID = T.TournamentID AND S.CMatchID = C.CMatchID AND S.ScorerID = '"+pScorerID+"' ORDER BY T.TournamentID";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            TournamentDetails.setModel(DbUtils.resultSetToTableModel(rs));
            //setTableHeader(0, RetailerDetails);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    //Get tournament details for view
    public void viewTournamentDetails(int pTournamentID, javax.swing.JLabel TIDL, javax.swing.JLabel TNameL, javax.swing.JLabel DurationL, javax.swing.JLabel ContactPesonL, javax.swing.JLabel TTPL, javax.swing.JLabel TAddressL, javax.swing.JLabel TEmailL, javax.swing.JLabel TPaymentStatusL, javax.swing.JLabel TotalAmountL){
        int Count = 0;
        String TP1 = null, TP2 = null;
        try
        {
            String q = "SELECT TournamentID, Name, StartDate, EndDate, ContactPerson, Address, Email, RPaymentStatus, TotalAmount FROM tournament WHERE TournamentID = '"+pTournamentID+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                TIDL.setText(Integer.toString(rs.getInt("TournamentID")));
                TNameL.setText(rs.getString("Name"));
                DurationL.setText(rs.getString("StartDate")+"   to   "+rs.getString("EndDate"));
                ContactPesonL.setText(rs.getString("ContactPerson"));
                TAddressL.setText(rs.getString("Address"));
                TEmailL.setText(rs.getString("Email"));
                TPaymentStatusL.setText(rs.getString("RPaymentStatus"));
                TotalAmountL.setText(rs.getString("TotalAmount"));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    
        
        try
        {
            String q = "SELECT COUNT(TournamentID) FROM contactpersontelephone WHERE TournamentID = '"+pTournamentID+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                Count = Integer.parseInt(rs.getString("COUNT(TournamentID)"));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        try
        {
            String q = "SELECT Telephone FROM contactpersontelephone WHERE TournamentID = '"+pTournamentID+"' AND Count = '1' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                TP1 = rs.getString("Telephone");
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        if(Count==2){
            try
            {
                String q = "SELECT Telephone FROM contactpersontelephone WHERE TournamentID = '"+pTournamentID+"' AND Count = '2' ";
                pst = connection.prepareStatement(q);
                rs = pst.executeQuery(q);
            
                while(rs.next()){
                    TP2 = rs.getString("Telephone");
                    TTPL.setText(TP1+"       "+TP2);
                }
            }
            catch(SQLException e)
            {
                System.out.println(e);
            }
        }else{
            TTPL.setText(TP1);
        }
            
    }
    
    //Get tournament details for back button
    public void viewBackTournamentDetails(int pTournamentID, javax.swing.JLabel IDL, javax.swing.JTextField NameB, com.toedter.calendar.JDateChooser StartDateB, com.toedter.calendar.JDateChooser EndDateB, javax.swing.JTextField ContactPersonB, javax.swing.JTextField TelephoneNo1B, javax.swing.JTextField TelephoneNo2B, javax.swing.JTextField AddressB, javax.swing.JTextField EmailB, javax.swing.JLabel PaymentStatusL, javax.swing.JTextField TotalAmountB){
        int Count = 0;
        String TP1 = null, TP2 = null;
        try
        {
            String q = "SELECT TournamentID, Name, StartDate, EndDate, ContactPerson, Address, Email, RPaymentStatus, TotalAmount FROM tournament WHERE TournamentID = '"+pTournamentID+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                IDL.setText(Integer.toString(rs.getInt("TournamentID")));
                NameB.setText(rs.getString("Name"));
                Function f = new Function();
                StartDateB.setDate(f.getDate(rs.getString("StartDate")));
                EndDateB.setDate(f.getDate(rs.getString("EndDate")));
                ContactPersonB.setText(rs.getString("ContactPerson"));
                AddressB.setText(rs.getString("Address"));
                EmailB.setText(rs.getString("Email"));
                PaymentStatusL.setText(rs.getString("RPaymentStatus"));
                TotalAmountB.setText(rs.getString("TotalAmount"));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    
        
        try
        {
            String q = "SELECT COUNT(TournamentID) FROM contactpersontelephone WHERE TournamentID = '"+pTournamentID+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                Count = Integer.parseInt(rs.getString("COUNT(TournamentID)"));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        try
        {
            String q = "SELECT Telephone FROM contactpersontelephone WHERE TournamentID = '"+pTournamentID+"' AND Count = '1' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                TelephoneNo1B.setText(rs.getString("Telephone"));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        if(Count==2){
            try
            {
                String q = "SELECT Telephone FROM contactpersontelephone WHERE TournamentID = '"+pTournamentID+"' AND Count = '2' ";
                pst = connection.prepareStatement(q);
                rs = pst.executeQuery(q);
            
                while(rs.next()){
                    TelephoneNo2B.setText(rs.getString("Telephone"));
                }
            }
            catch(SQLException e)
            {
                System.out.println(e);
            }
        }
            
    }
    
    //Get tournament details for back button for assigment and make payment
    public void viewAMBackTournamentDetails(int pTournamentID, javax.swing.JLabel TIDL, javax.swing.JLabel NameL, javax.swing.JLabel StartDateL, javax.swing.JLabel EndDateL, javax.swing.JLabel ContactPersonL, javax.swing.JLabel AddressL, javax.swing.JLabel EmailL, javax.swing.JLabel PaymentStatusL, javax.swing.JLabel TotalAmountL){
        
        try
        {
            String q = "SELECT TournamentID, Name, StartDate, EndDate, ContactPerson, RPaymentStatus, TotalAmount FROM tournament WHERE TournamentID = '"+pTournamentID+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                TIDL.setText(Integer.toString(rs.getInt("TournamentID")));
                NameL.setText(rs.getString("Name"));
                StartDateL.setText(rs.getString("StartDate"));
                EndDateL.setText(rs.getString("EndDate"));
                ContactPersonL.setText(rs.getString("ContactPerson"));
                PaymentStatusL.setText(rs.getString("RPaymentStatus"));
                TotalAmountL.setText(rs.getString("TotalAmount"));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    
    }
    
    //Search tournament 
    public void searchTournament(int input, String pSearchKey)
    {
        String q = null;
        
        if(input==1){
            q = "SELECT TournamentID, Name, StartDate, EndDate, ContactPerson, Address, Email, TotalAmount FROM tournament WHERE TournamentID = '"+pSearchKey+"' ";
        }else if(input==2){
            q = "SELECT TournamentID, Name, StartDate, EndDate, ContactPerson, Address, Email, TotalAmount FROM tournament WHERE Name Like '"+pSearchKey+"' ";
        }else if(input==3){
            q = "SELECT TournamentID, Name, StartDate, EndDate, ContactPerson, Address, Email, TotalAmount FROM tournament WHERE ContactPerson Like '"+pSearchKey+"' ";
        }
        
        try
        {
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            TournamentDetails.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    //Search tournament for assigment
    public void searchTournamentAssignment(int input, String pSearchKey)
    {
        String q = null;
        
        if(input==1){
            q = "SELECT TournamentID, Name, StartDate, EndDate, ContactPerson, TotalAmount, RPaymentStatus FROM tournament WHERE TournamentID = '"+pSearchKey+"' ";
        }else if(input==2){
            q = "SELECT TournamentID, Name, StartDate, EndDate, ContactPerson, TotalAmount, RPaymentStatus FROM tournament WHERE Name Like '"+pSearchKey+"' ";
        }else if(input==3){
            q = "SELECT TournamentID, Name, StartDate, EndDate, ContactPerson, TotalAmount, RPaymentStatus FROM tournament WHERE ContactPerson Like '"+pSearchKey+"' ";
        }
        
        try
        {
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            TournamentDetails.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    //Search tournament for view
    public void searchTournamentView(int input, String pSearchKey)
    {
        String q = null;
        
        if(input==1){
            q = "SELECT TournamentID, Name, ContactPerson FROM tournament WHERE TournamentID = '"+pSearchKey+"' ";
        }else if(input==2){
            q = "SELECT TournamentID, Name, ContactPerson FROM tournament WHERE Name Like '"+pSearchKey+"' ";
        }else if(input==3){
            q = "SELECT TournamentID, Name, ContactPerson FROM tournament WHERE ContactPerson Like '"+pSearchKey+"' ";
        }
        
        try
        {
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            TournamentDetails.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    
}
