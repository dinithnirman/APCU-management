
package Class;

import DB.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;

public class Scorer {
    
    private int ScorerID;
    private String Name;
    private String DOB;
    private String Address;
    private String Email;
    private String TelephoneNo1;
    private String TelephoneNo2;
    private String AccountNo;
    private String BankBranch;
    private javax.swing.JTable ScorerDetails;
    int TelephoneNoCount;
    
    Connection connection = null;
    PreparedStatement pst = null;
    ResultSet rs =null;
    
    
    //Constuctor for method calling
    public Scorer( ){
       connection = DBconnect.connect();
    }
    
    //Constuctor for table load
    public Scorer( javax.swing.JTable pUmpireDetails){
       connection = DBconnect.connect();
       ScorerDetails = pUmpireDetails;
    }
    
    //Constuctor for add method with two telephone numbers
    public Scorer(String pName, String pDOB, String pTelephoneNo1, String pTelephoneNo2, String pAddress, String pEmail, String pAccountNo, String pBankBranch){
        Name = pName;
        DOB = pDOB;
        TelephoneNo1 = pTelephoneNo1;
        TelephoneNo2 = pTelephoneNo2;
        Address = pAddress;
        Email = pEmail;
        AccountNo = pAccountNo;
        BankBranch = pBankBranch;
        TelephoneNoCount = 2;
        
        connection = DBconnect.connect();
    }
    
    //Constuctor for add method with one telephone numbers
    public Scorer(String pName, String pDOB, String pTelephoneNo1, String pAddress, String pEmail, String pAccountNo, String pBankBranch){
        Name = pName;
        DOB = pDOB;
        TelephoneNo1 = pTelephoneNo1;
        Address = pAddress;
        Email = pEmail;
        AccountNo = pAccountNo;
        BankBranch = pBankBranch;
        TelephoneNoCount = 1;
        
        connection = DBconnect.connect();
    }
    
    
    //Constuctor for update method with two telephone numbers
    public Scorer(int pScorerID, String pName, String pDOB, String pTelephoneNo1, String pTelephoneNo2, String pAddress, String pEmail, String pAccountNo, String pBankBranch){
        ScorerID = pScorerID;
        Name = pName;
        DOB = pDOB;
        TelephoneNo1 = pTelephoneNo1;
        TelephoneNo2 = pTelephoneNo2;
        Address = pAddress;
        Email = pEmail;
        AccountNo = pAccountNo;
        BankBranch = pBankBranch;
        TelephoneNoCount = 2;
        
        connection = DBconnect.connect();
    }
    
    //Constuctor for update method with one telephone numbers
    public Scorer(int pScorerID, String pName, String pDOB, String pTelephoneNo1, String pAddress, String pEmail, String pAccountNo, String pBankBranch){
        ScorerID = pScorerID;
        Name = pName;
        DOB = pDOB;
        TelephoneNo1 = pTelephoneNo1;
        Address = pAddress;
        Email = pEmail;
        AccountNo = pAccountNo;
        BankBranch = pBankBranch;
        TelephoneNoCount = 1;
        
        connection = DBconnect.connect();
    }
    
    //Constuctor for allocation method with two telephone numbers
    public Scorer(int pScorerID){
        ScorerID = pScorerID;
        
        connection = DBconnect.connect();
    }
    
    //Add method
    public void addScorer(){
        try
        {
            String q = "INSERT INTO scorer(Name, DOB, Address, Email, AccountNo, BankBranch) VALUES ('"+ Name +"', '"+ DOB+"', '"+ Address +"', '"+ Email +"', '"+ AccountNo +"', '"+ BankBranch +"')";
            pst = connection.prepareStatement(q);
            pst.execute();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        
        ScorerID = getScorerID();
        addScorerTelephone();
        
    }
    
    //Add contact details method
    public void addScorerTelephone(){
        if(TelephoneNoCount == 0){
            try
            {
                String q = "INSERT INTO scorertelephone(ScorerID, Telephone, Count) values ('"+ ScorerID +"', '"+ TelephoneNo2 +"', '"+ 2 +"')";
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
                String q = "INSERT INTO scorertelephone(ScorerID, Telephone, Count) values ('"+ ScorerID +"', '"+ TelephoneNo1 +"', '"+ 1 +"')";
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
                String q = "INSERT INTO scorertelephone(ScorerID, Telephone, Count) values ('"+ ScorerID +"', '"+ TelephoneNo1 +"', '"+ 1 +"')";
                pst = connection.prepareStatement(q);
                pst.execute();
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            
            try
            {
                String q = "INSERT INTO scorertelephone(ScorerID, Telephone, Count) values ('"+ ScorerID +"', '"+ TelephoneNo2 +"', '"+ 2 +"')";
                pst = connection.prepareStatement(q);
                pst.execute();
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
        
    }
    
    //Returns Umpire ID
    public int getScorerID(){
        int ID = 0;
        try
        {
            String q = "SELECT ScorerID FROM scorer WHERE Name = '"+ Name +"' AND DOB = '"+ DOB +"' AND Address = '"+ Address +"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                ID = Integer.parseInt(rs.getString("ScorerID"));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return ID; 
    }
    
    //Load data to the table
    public void scorerTableLoad()
    {
        try
        {
            String q = "SELECT ScorerID, Name, DOB, Address, Email, AccountNo, BankBranch FROM scorer ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            ScorerDetails.setModel(DbUtils.resultSetToTableModel(rs));
            //setTableHeader(0, RetailerDetails);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    //Load data to the table
    public void scorerAllocationTableLoad(int input)
    {
        if(input==0){
            try
            {
                String q = "SELECT ScorerID, Name FROM scorer WHERE Availability = 'Available' ";
                pst = connection.prepareStatement(q);
                rs = pst.executeQuery(q);
                ScorerDetails.setModel(DbUtils.resultSetToTableModel(rs));
                //setTableHeader(0, RetailerDetails);
            }
            catch(SQLException e)
            {
                System.out.println(e);
            }
        }else{
            try
            {
                String q = "SELECT ScorerID, PPaymentStatus FROM scorerallocation WHERE CMatchID = '"+input+"'";
                pst = connection.prepareStatement(q);
                rs = pst.executeQuery(q);
                ScorerDetails.setModel(DbUtils.resultSetToTableModel(rs));
                //setTableHeader(0, RetailerDetails);
            }
            catch(SQLException e)
            {
                System.out.println(e);
            }
        }
        
    }
    
    //Load data to the table for make payment
    public void scorerMakePaymentTableLoad(int pMatchID)
    {
        try
        {
            String q = "SELECT ScorerID, PPaymentStatus, PPaymentDate FROM scorerallocation  WHERE CMatchID = '"+pMatchID+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            ScorerDetails.setModel(DbUtils.resultSetToTableModel(rs));
            //setTableHeader(0, RetailerDetails);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    //Returns Umpire ID
    public int getTPCount(int pID){
        int Count = 0;
        try
        {
            String q = " SELECT COUNT(*) FROM scorertelephone WHERE ScorerID = '"+pID+"' ";
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
    
    
    public String getScorerTelephone(int pID, int pCount){
        String TP = null;
        try
        {
            String q = " SELECT Telephone FROM scorertelephone WHERE ScorerID = '"+pID+"' AND Count = '"+pCount+"' ";
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
    
    //Update method
    public void updateScorer(){
        try
        {
            String q = "UPDATE scorer SET Name = '"+ Name +"', DOB = '"+ DOB +"', Address = '"+ Address +"', Email = '"+ Email +"', AccountNo = '"+ AccountNo +"', BankBranch = '"+ BankBranch +"' WHERE ScorerID = '"+ ScorerID +"' ";
            pst = connection.prepareStatement(q);
            pst.execute();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        
        
        if(getTPCount(ScorerID)==TelephoneNoCount){
            updateScorerTelephone();
        }else if(getTPCount(ScorerID)<TelephoneNoCount){
            TelephoneNoCount=1;
            updateScorerTelephone();
            TelephoneNoCount=0;
            addScorerTelephone();
        }
        
    
        
    }
    
    //Update contact details method
    public void updateScorerTelephone(){
        
        if(TelephoneNoCount == 1){
            try
            {
                String q = "UPDATE scorertelephone SET  Telephone = '"+ TelephoneNo1 +"' WHERE ScorerID = '"+ ScorerID +"' AND Count = '"+ 1 +"' ";
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
                String q = "UPDATE scorertelephone SET  Telephone = '"+ TelephoneNo1 +"' WHERE ScorerID = '"+ ScorerID +"' AND Count = '"+ 1 +"' ";
                pst = connection.prepareStatement(q);
                pst.execute();
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            
            try
            {
                String q = "UPDATE scorertelephone SET Telephone = '"+ TelephoneNo2 +"' WHERE ScorerID = '"+ ScorerID +"' AND Count = '"+ 2 +"' ";
                pst = connection.prepareStatement(q);
                pst.execute();
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
        
    }
    
    //Get availability of a scorer
    public String getScorerAvailability(int pID){
        String Availability = null;
        try
        {
            String q = " SELECT Availability FROM scorer WHERE ScorerID = '"+pID+"' ";
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
    
    
    //Set availability of a scorer
    public void setScorerAvailability(String pAvailability, int pID){
        try
        {
            String q = "UPDATE scorer SET Availability = '"+ pAvailability +"' WHERE ScorerID = '"+ pID +"' ";
            pst = connection.prepareStatement(q);
            pst.execute();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    
    //Allocate scorer
    public void allocateScorer(int pMatchID){
        try
        {
            String q = "INSERT INTO scorerallocation(ScorerID, CMatchID) VALUES ('"+ ScorerID +"', '"+ pMatchID +"')";
            pst = connection.prepareStatement(q);
            pst.execute();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        
    }
    
    //Check an scorer for allocation
    public boolean cheackScorerAllocation(int pScorerID, int pMatchID){
        int ScorerID = 0;
        boolean result = true;
        try
        {
            String q = " SELECT ScorerID FROM scorerallocation WHERE ScorerID = '"+pScorerID+"' AND CMatchID = '"+pMatchID+"'";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                ScorerID = rs.getInt("ScorerID");
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        if(ScorerID == pScorerID){
            result = true;
        }else{
            result = false;
        } 
        return result;
    }
    
    //Check an scorer for allocation
    public boolean cheackScorerAllocationDate(int pScorerID, String pDate){
        String Date = null;
        boolean result = true;
        try
        {
            String q = " SELECT c.Date FROM cmatch c, scorerallocation s WHERE c.CMatchID = s.CMatchID AND s.ScorerID = '"+pScorerID+"' AND c.Date = '"+pDate+"'";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                Date = rs.getString("Date");
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        if(Date != null){
            result = true;
        }else{
            result = false;
        } 
        return result;
    }
    
    //Get scorer name
    public void getScorerName(int pID, javax.swing.JLabel SNameL){
     
        try
        {
            String q = " SELECT Name FROM scorer WHERE ScorerID = '"+pID+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                SNameL.setText(rs.getString("Name"));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
    }
    
    //Deallocate scorer
    public void deallocateScorer(int pMatchID){
        try
        {
            String q = "DELETE FROM scorerallocation WHERE ScorerID = '"+ ScorerID +"' AND CMatchID = '"+ pMatchID +"'";
            pst = connection.prepareStatement(q);
            pst.execute();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        
    }
    
    //Get scorer details
    public void getScorerNamePayment(int pScorerID, int pMatchID, javax.swing.JLabel NameL, javax.swing.JLabel PaymentL){
        String UmpireType = null;
        String Amount = null;
        try
        {
            String q = " SELECT Name FROM scorer WHERE ScorerID = '"+pScorerID+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                NameL.setText(rs.getString("Name"));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        try
        {
            String q = " SELECT PAmount FROM ppayment WHERE Position = 'Scorer' AND CMatchID = '"+pMatchID+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            if(!rs.next()){
                PaymentL.setText("Payment for Scorer unassigned");
            }else{
                PaymentL.setText(rs.getString("PAmount"));
            }
        
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
    }
    
    //Get scorer payment details
    public void getPaymentStatusDate(int pScorerID, int pMatchID, javax.swing.JLabel PPaymentStatusL, javax.swing.JLabel PPaymentDateL){
        
        try
        {
            String q = " SELECT PPaymentStatus, PPaymentDate FROM scorerallocation WHERE ScorerID = '"+pScorerID+"' AND CMatchID = '"+pMatchID+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                PPaymentStatusL.setText(rs.getString("PPaymentStatus"));
                PPaymentDateL.setText(rs.getString("PPaymentDate"));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    //Load data to the table view
    public void scorerViewTableLoad()
    {
        try
        {
            String q = "SELECT ScorerID, Name FROM scorer ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            ScorerDetails.setModel(DbUtils.resultSetToTableModel(rs));
            //setTableHeader(0, RetailerDetails);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    //Get scorer details for view
    public void viewScorerDetails(int pScorerID, javax.swing.JLabel SIDL, javax.swing.JLabel SNameL, javax.swing.JLabel DOBL, javax.swing.JLabel STPL, javax.swing.JLabel SAddressL, javax.swing.JLabel SEmailL, javax.swing.JLabel AccountNoL, javax.swing.JLabel BankBranchL, javax.swing.JLabel AvailabilityL){
        int Count = 0;
        String TP1 = null, TP2 = null;
        try
        {
            String q = "SELECT ScorerID, Name, DOB, Address, Email, AccountNo, BankBranch, Availability FROM scorer WHERE ScorerID = '"+pScorerID+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                SIDL.setText(Integer.toString(rs.getInt("ScorerID")));
                SNameL.setText(rs.getString("Name"));
                DOBL.setText(rs.getString("DOB"));
                SAddressL.setText(rs.getString("Address"));
                SEmailL.setText(rs.getString("Email"));
                AccountNoL.setText(rs.getString("AccountNo"));
                BankBranchL.setText(rs.getString("BankBranch"));
                AvailabilityL.setText(rs.getString("Availability"));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    
        
        
        try
        {
            String q = "SELECT COUNT(ScorerID) FROM scorertelephone WHERE ScorerID = '"+pScorerID+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                Count = Integer.parseInt(rs.getString("COUNT(ScorerID)"));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        try
        {
            String q = "SELECT Telephone FROM scorertelephone WHERE ScorerID = '"+pScorerID+"' AND Count = '1' ";
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
                String q = "SELECT Telephone FROM scorertelephone WHERE ScorerID = '"+pScorerID+"' AND Count = '2' ";
                pst = connection.prepareStatement(q);
                rs = pst.executeQuery(q);
            
                while(rs.next()){
                    TP2 = rs.getString("Telephone");
                    STPL.setText(TP1+"       "+TP2);
                }
            }
            catch(SQLException e)
            {
                System.out.println(e);
            }
        }else{
            STPL.setText(TP1);
        }
            
    }
    
    public void reportScorerTableload(int pTournamentID){
        try
        {
            String q = "SELECT S.CMatchID, S.ScorerID, S.PPaymentStatus FROM scorerallocation S, CMatch C WHERE S.CMatchID = C.CMatchID AND C.TournamentID = '"+pTournamentID+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            ScorerDetails.setModel(DbUtils.resultSetToTableModel(rs));
            //setTableHeader(0, RetailerDetails);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    // Set scorer details for view tournament
    public void viewTScorerDetails(int pMatchID, int pScorerID, javax.swing.JLabel IDL, javax.swing.JLabel NameL, javax.swing.JLabel PositionL, javax.swing.JLabel AvailabilityL, javax.swing.JLabel PAmountL, javax.swing.JLabel PPaymentStatusL, javax.swing.JLabel PPaymentDateL){
        try
        {
            String q = "SELECT S.ScorerID, S.Name, S.Availability, P.PAmount, A.PPaymentStatus, A.PPaymentDate FROM scorer S, scorerallocation A, ppayment P WHERE A.CMatchID = '"+pMatchID+"' AND A.ScorerID = '"+pScorerID+"' AND A.ScorerID = S.ScorerID AND A.CMatchID = P.CMatchID AND P.Position = 'Scorer' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                IDL.setText(Integer.toString(rs.getInt("S.ScorerID")));
                NameL.setText(rs.getString("S.Name"));
                PositionL.setText("Scorer");
                AvailabilityL.setText(rs.getString("S.Availability"));
                PAmountL.setText(Integer.toString(rs.getInt("P.PAmount")));
                PPaymentStatusL.setText(rs.getString("A.PPaymentStatus"));
                PPaymentDateL.setText(rs.getString("A.PPaymentDate"));
                
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    //Search scorer
    public void searchScorer(int input, String pSearchKey)
    {
        String q = null;
        
        if(input==1){
            q = "SELECT ScorerID, Name, DOB, Address, Email, AccountNo, BankBranch FROM scorer WHERE ScorerID = '"+pSearchKey+"' ";
        }else if(input==2){
            q = "SELECT ScorerID, Name, DOB, Address, Email, AccountNo, BankBranch FROM scorer WHERE Name Like '"+pSearchKey+"' ";
        }
        
        try
        {
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            ScorerDetails.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    //Search scorer for assignment
    public void searchScorerAssignment(int input, String pSearchKey)
    {
        String q = null;
        
        if(input==1){
            q = "SELECT ScorerID, Name FROM scorer WHERE ScorerID = '"+pSearchKey+"' ";
        }else if(input==2){
            q = "SELECT ScorerID, Name FROM scorer WHERE Name Like '"+pSearchKey+"' ";
        }
        
        try
        {
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            ScorerDetails.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
}
