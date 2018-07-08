
package Class;

import DB.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;
import Validation.Validation;
import static Validation.Validation.InternetConnection;
import java.util.Date;
import javax.swing.JOptionPane;

public class Umpire {
    
    private int UmpireID;
    private String UmpireType;
    private String Grade;
    private String Name;
    private String DOB;
    private String Address;
    private String Email;
    private String TelephoneNo1;
    private String TelephoneNo2;
    private String AccountNo;
    private String BankBranch;
    private javax.swing.JTable UmpireDetails;
    int TelephoneNoCount;
    
    Connection connection = null;
    PreparedStatement pst = null;
    ResultSet rs =null;
    
    
    //Constuctor for method calling
    public Umpire( ){
       connection = DBconnect.connect();
    }
    
    //Constuctor for table load
    public Umpire( javax.swing.JTable pUmpireDetails){
       connection = DBconnect.connect();
       UmpireDetails = pUmpireDetails;
    }
    
    //Constuctor for add method with two telephone numbers
    public Umpire(String pGrade, String pName, String pDOB, String pTelephoneNo1, String pTelephoneNo2, String pAddress, String pEmail, String pAccountNo, String pBankBranch){
        Grade = pGrade;
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
    public Umpire(String pGrade, String pName, String pDOB, String pTelephoneNo1, String pAddress, String pEmail, String pAccountNo, String pBankBranch){
        Grade = pGrade;
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
    public Umpire(int pUmpireID, String pGrade, String pName, String pDOB, String pTelephoneNo1, String pTelephoneNo2, String pAddress, String pEmail, String pAccountNo, String pBankBranch){
        UmpireID = pUmpireID;
        Grade = pGrade;
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
    public Umpire(int pUmpireID, String pGrade, String pName, String pDOB, String pTelephoneNo1, String pAddress, String pEmail, String pAccountNo, String pBankBranch){
        UmpireID = pUmpireID;
        Grade = pGrade;
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
    
    //Constuctor for allocation method
    public Umpire(int pUmpireID, String pUmpireType){
        UmpireID = pUmpireID;
        UmpireType = pUmpireType;
        
        connection = DBconnect.connect();
    }
    
    
    //Add method
    public void addUmpire(){
        try
        {
            String q = "INSERT INTO umpire(Grade, Name, DOB, Address, Email, AccountNo, BankBranch) VALUES ('"+ Grade +"', '"+ Name +"', '"+ DOB+"', '"+ Address +"', '"+ Email +"', '"+ AccountNo +"', '"+ BankBranch +"')";
            pst = connection.prepareStatement(q);
            pst.execute();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        
        UmpireID = getUmpireID();
        addUmpireTelephone();
        
    }
    
    //Add contact details method
    public void addUmpireTelephone(){
        if(TelephoneNoCount == 0){
            try
            {
                String q = "INSERT INTO umpiretelephone(UmpireID, Telephone, Count) values ('"+ UmpireID +"', '"+ TelephoneNo2 +"', '"+ 2 +"')";
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
                String q = "INSERT INTO umpiretelephone(UmpireID, Telephone, Count) values ('"+ UmpireID +"', '"+ TelephoneNo1 +"', '"+ 1 +"')";
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
                String q = "INSERT INTO umpiretelephone(UmpireID, Telephone, Count) values ('"+ UmpireID +"', '"+ TelephoneNo1 +"', '"+ 1 +"')";
                pst = connection.prepareStatement(q);
                pst.execute();
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            
            try
            {
                String q = "INSERT INTO umpiretelephone(UmpireID, Telephone, Count) values ('"+ UmpireID +"', '"+ TelephoneNo2 +"', '"+ 2 +"')";
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
    public int getUmpireID(){
        int ID = 0;
        try
        {
            String q = "SELECT UmpireID FROM umpire WHERE Name = '"+ Name +"' AND DOB = '"+ DOB +"' AND Address = '"+ Address +"' ";
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
    
    //Load data to the table
    public void umpireTableLoad()
    {
        try
        {
            String q = "SELECT UmpireID, Grade, Name, DOB, Address, Email, AccountNo, BankBranch FROM umpire ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            UmpireDetails.setModel(DbUtils.resultSetToTableModel(rs));
            //setTableHeader(0, RetailerDetails);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
     //Load data to the table assigment
    public void umpireAllocationTableLoad(int input)
    {
        if(input==0){
            try
            {
                String q = "SELECT UmpireID, Grade, Name FROM umpire WHERE Availability = 'Available'";
                pst = connection.prepareStatement(q);
                rs = pst.executeQuery(q);
                UmpireDetails.setModel(DbUtils.resultSetToTableModel(rs));
                //setTableHeader(0, RetailerDetails);
            }
            catch(SQLException e)
            {
                System.out.println(e);
            }
        } else{
            try
            {
                String q = "SELECT UmpireID, UmpireType, PPaymentStatus FROM umpireallocation WHERE CMatchID = '"+input+"'";
                pst = connection.prepareStatement(q);
                rs = pst.executeQuery(q);
                UmpireDetails.setModel(DbUtils.resultSetToTableModel(rs));
                //setTableHeader(0, RetailerDetails);
            }
            catch(SQLException e)
            {
                System.out.println(e);
            }
        }
        
    }
    
    //Load data to the table for make payment
    public void umpireMakePaymentTableLoad(int pMatchID)
    {
        try
        {
            String q = "SELECT UmpireID, PPaymentStatus, PPaymentDate FROM umpireallocation WHERE CMatchID = '"+pMatchID+"'  ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            UmpireDetails.setModel(DbUtils.resultSetToTableModel(rs));
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
            String q = " SELECT COUNT(*) FROM umpiretelephone WHERE UmpireID = '"+pID+"' ";
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
    
    //Get telephone number of an umpire
    public String getUmpireTelephone(int pID, int pCount){
        String TP = null;
        try
        {
            String q = " SELECT Telephone FROM umpiretelephone WHERE UmpireID = '"+pID+"' AND Count = '"+pCount+"' ";
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
    public void updateUmpire(){
        try
        {
            String q = "UPDATE umpire SET Grade = '"+ Grade +"', Name = '"+ Name +"', DOB = '"+ DOB +"', Address = '"+ Address +"', Email = '"+ Email +"', AccountNo = '"+ AccountNo +"', BankBranch = '"+ BankBranch +"' WHERE UmpireID = '"+ UmpireID +"' ";
            pst = connection.prepareStatement(q);
            pst.execute();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        
        
        if(getTPCount(UmpireID)==TelephoneNoCount){
            updateUmpireTelephone();
        }else if(getTPCount(UmpireID)<TelephoneNoCount){
            TelephoneNoCount=1;
            updateUmpireTelephone();
            TelephoneNoCount=0;
            addUmpireTelephone();
        }
        
    
        
    }
    
    //Update contact details method
    public void updateUmpireTelephone(){
        
        if(TelephoneNoCount == 1){
            try
            {
                String q = "UPDATE umpiretelephone SET  Telephone = '"+ TelephoneNo1 +"' WHERE UmpireID = '"+ UmpireID +"' AND Count = '"+ 1 +"' ";
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
                String q = "UPDATE umpiretelephone SET  Telephone = '"+ TelephoneNo1 +"' WHERE UmpireID = '"+ UmpireID +"' AND Count = '"+ 1 +"' ";
                pst = connection.prepareStatement(q);
                pst.execute();
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            
            try
            {
                String q = "UPDATE umpiretelephone SET Telephone = '"+ TelephoneNo2 +"' WHERE UmpireID = '"+ UmpireID +"' AND Count = '"+ 2 +"' ";
                pst = connection.prepareStatement(q);
                pst.execute();
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }   
    }
    
    //Get availability of an umpire
    public String getUmpireAvailability(int pID){
        String Availability = null;
        try
        {
            String q = " SELECT Availability FROM umpire WHERE UmpireID = '"+pID+"' ";
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
    
    
    //Set availability of an umpire
    public void setUmpireAvailability(String pAvailability, int pID){
        try
        {
            String q = "UPDATE umpire SET Availability = '"+ pAvailability +"' WHERE UmpireID = '"+ pID +"' ";
            pst = connection.prepareStatement(q);
            pst.execute();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    
    //Allocate umpire
    public void allocateUmpire(int pMatchID){
        try
        {
            String q = "INSERT INTO umpireallocation(UmpireID, UmpireType, CMatchID) VALUES ('"+ UmpireID +"', '"+ UmpireType +"', '"+ pMatchID +"')";
            pst = connection.prepareStatement(q);
            pst.execute();
            
             
        if( InternetConnection ())
        {
        
        sending_Email(pMatchID);
        JOptionPane.showMessageDialog(null,"Email sent Successful !");    
        
        }
            
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        
    }
    //Sending notification Email to the umpire
    public void sending_Email(int pmatchId){
        
          try{
           String sql="SELECT c.Date,c.Time,c.GroundID,g.Name,g.Address,u.Name,u.Email FROM cmatch c,umpire u,ground g WHERE c.CMatchID="+pmatchId+" AND u.UmpireID="+UmpireID+" AND g.GroundID=c.GroundID ";
           pst=connection.prepareStatement(sql);
           
           rs=pst.executeQuery();
           String  EMAILadd =null ;
           String EMAIL="";
           while(rs.next()){
            EMAIL="<caption><h1><u>APCU MANAGEMENT</u></h1></caption><h2 style=\"background-color:red;\">Name : " +rs.getString(6)+"</h2><table border=5 width=100% height=100% > <tr><th>Ground Name</th><th>Type</th><th>Address</th><th>Match Date</th> <th>Time</th></tr>" ;
            
               EMAIL +="<tr> <td>" + rs.getString(4) + "</td> <td>"+rs.getString(5)+ "</td> <td>"+rs.getString(1) +"</td> <td>" +rs.getString(2)+  "</td> <td>";
                                         EMAILadd=rs.getString(7) ;
               
              
           }
            EMAIL +="</table>" ;
            
             EmailSupplierInterface ee=new  EmailSupplierInterface();
                                          ee.generateAndSendEmail(EMAIL,EMAILadd);

          // else 
            //    JOptionPane.showMessageDialog(null, "no values");
           
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           
           
           
       }
        
    }
    //Get umpire grade
    public void getUmpireGradeName(int pID, javax.swing.JLabel GradeL, javax.swing.JLabel UNameL){
     
        try
        {
            String q = " SELECT Grade, Name FROM umpire WHERE UmpireID = '"+pID+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                GradeL.setText(rs.getString("Grade"));
                UNameL.setText(rs.getString("Name"));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
    }
    
    
    
    //Check an umpire for allocation
    public boolean cheackUmpireAllocation(int pUmpireID, int pMatchID){
        int UmpireID = 0;
        boolean result = true;
        try
        {
            String q = " SELECT UmpireID FROM umpireallocation WHERE UmpireID = '"+pUmpireID+"' AND CMatchID = '"+pMatchID+"'";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                UmpireID = rs.getInt("UmpireID");
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        if(UmpireID == pUmpireID){
            result = true;
        }else{
            result = false;
        } 
        return result;
    }
    
    //Check an umpire for allocation
    public boolean cheackUmpireAllocationDate(int pUmpireID, String pDate){
        String Date = null;
        boolean result = true;
        try
        {
            String q = " SELECT c.Date FROM cmatch c, umpireallocation u WHERE c.CMatchID = u.CMatchID AND u.UmpireID = '"+pUmpireID+"' AND c.Date = '"+pDate+"'";
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
    
    //Deallocate umpire
    public void deallocateUmpire(int pUmpireID, int pMatchID){
        try
        {
            String q = "DELETE FROM umpireallocation WHERE UmpireID = '"+ pUmpireID +"' AND CMatchID = '"+ pMatchID +"'";
            pst = connection.prepareStatement(q);
            pst.execute();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        
    }
    
    //Update umpire allocation
    public void updateUmpireAllocation(String pUmpireType, int pUmpireID, int pMatchID){
        try
        {
            String q = "UPDATE umpireallocation SET UmpireType = '"+ pUmpireType +"' WHERE UmpireID = '"+ pUmpireID +"' AND CMatchID = '"+ pMatchID +"'";
            pst = connection.prepareStatement(q);
            pst.execute();
        }
        catch (Exception e)
        {
            System.out.println(e);
        } 
    }
    
    
    //Get umpire details
    public void getUmpireNamePositionPayment(int pUmpireID, int pMatchID, javax.swing.JLabel NameL, javax.swing.JLabel PositionL, javax.swing.JLabel PaymentL){
        String UmpireType = null;
        String Amount = null;
        try
        {
            String q = " SELECT Name FROM umpire WHERE UmpireID = '"+pUmpireID+"' ";
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
            String q = " SELECT UmpireType FROM umpireallocation WHERE UmpireID = '"+pUmpireID+"' AND CMatchID = '"+pMatchID+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                UmpireType = rs.getString("UmpireType");
                PositionL.setText(rs.getString("UmpireType"));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        try
        {
            String q = " SELECT PAmount FROM ppayment WHERE Position = '"+UmpireType+"' AND CMatchID = '"+pMatchID+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            if(!rs.next()){
                PaymentL.setText("Payment for "+ UmpireType +" unassigned");
            }else{
                PaymentL.setText(rs.getString("PAmount"));
            }
            
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
    }
    
    //Get umpire payment details
    public void getPaymentStatusDate(int pUmpireID, int pMatchID, javax.swing.JLabel PPaymentStatusL, javax.swing.JLabel PPaymentDateL){
        
        try
        {
            String q = " SELECT PPaymentStatus, PPaymentDate FROM umpireallocation WHERE UmpireID = '"+pUmpireID+"' AND CMatchID = '"+pMatchID+"' ";
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
    public void umpireViewTableLoad()
    {
        try
        {
            String q = "SELECT UmpireID, Grade, Name FROM umpire ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            UmpireDetails.setModel(DbUtils.resultSetToTableModel(rs));
            //setTableHeader(0, RetailerDetails);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    //Get umpire details for view
    public void viewUmpireDetails(int pUmpireID, javax.swing.JLabel UIDL, javax.swing.JLabel GradeL, javax.swing.JLabel UNameL, javax.swing.JLabel DOBL, javax.swing.JLabel UTPL, javax.swing.JLabel UAddressL, javax.swing.JLabel UEmailL, javax.swing.JLabel AccountNoL, javax.swing.JLabel BankBranchL, javax.swing.JLabel AvailabilityL){
        int Count = 0;
        String TP1 = null, TP2 = null;
        try
        {
            String q = "SELECT UmpireID, Grade, Name, DOB, Address, Email, AccountNo, BankBranch, Availability FROM umpire WHERE UmpireID = '"+pUmpireID+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                UIDL.setText(Integer.toString(rs.getInt("UmpireID")));
                GradeL.setText(rs.getString("Grade"));
                UNameL.setText(rs.getString("Name"));
                DOBL.setText(rs.getString("DOB"));
                UAddressL.setText(rs.getString("Address"));
                UEmailL.setText(rs.getString("Email"));
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
            String q = "SELECT COUNT(UmpireID) FROM umpiretelephone WHERE UmpireID = '"+pUmpireID+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                Count = Integer.parseInt(rs.getString("COUNT(UmpireID)"));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        try
        {
            String q = "SELECT Telephone FROM umpiretelephone WHERE UmpireID = '"+pUmpireID+"' AND Count = '1' ";
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
                String q = "SELECT Telephone FROM umpiretelephone WHERE UmpireID = '"+pUmpireID+"' AND Count = '2' ";
                pst = connection.prepareStatement(q);
                rs = pst.executeQuery(q);
            
                while(rs.next()){
                    TP2 = rs.getString("Telephone");
                    UTPL.setText(TP1+"       "+TP2);
                }
            }
            catch(SQLException e)
            {
                System.out.println(e);
            }
        }else{
            UTPL.setText(TP1);
        }
   
    }
    
    public void reportUmpireTableload(int pTournamentID){
        try
        {
            String q = "SELECT U.CMatchID, U.UmpireID, U.PPaymentStatus FROM umpireallocation U, CMatch C WHERE U.CMatchID = C.CMatchID AND C.TournamentID = '"+pTournamentID+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            UmpireDetails.setModel(DbUtils.resultSetToTableModel(rs));
            //setTableHeader(0, RetailerDetails);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    
    }
    
    public void reportUmpireDetails(int pMatchID, javax.swing.JLabel MatchTypeL, javax.swing.JLabel NameL, javax.swing.JLabel PositionL, javax.swing.JLabel PAmountL, javax.swing.JLabel PPaymentStatusL, javax.swing.JLabel PPaymentDateL){
        try
        {
            String q = "SELECT C.MatchType, U.Name, A.UmpireType, A.PPaymentStatus, A.PPaymentDate FROM umpire U, cmatch C, umpireallocation A WHERE A.CMatchID = C.CMatchID AND A.UmpireID = U.UmpireID AND A.CMatchID = '"+pMatchID+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                MatchTypeL.setText(rs.getString("C.MatchType"));
                NameL.setText(rs.getString("U.Name"));
                PositionL.setText(rs.getString("A.UmpireType"));
                PPaymentStatusL.setText(rs.getString("A.PPaymentStatus"));
                PPaymentDateL.setText(rs.getString("A.PPaymentDate"));
                //PAmountL.setText(rs.getString("P.PAmount"));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    // Set umpire details for view tournament
    public void getIDAvailability(int pUmpireID, javax.swing.JLabel IDL, javax.swing.JLabel AvailabilityL){
        try
        {
            String q = " SELECT UmpireID, Availability FROM umpire WHERE UmpireID = '"+pUmpireID+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                IDL.setText(Integer.toString(rs.getInt("UmpireID")));
                AvailabilityL.setText(rs.getString("Availability"));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    //Search umpire 
    public void searchUmpire(int input, String pSearchKey)
    {
        String q = null;
        
        if(input==1){
            q = "SELECT UmpireID, Grade, Name, DOB, Address, Email, AccountNo, BankBranch FROM umpire WHERE UmpireID = '"+pSearchKey+"' ";
        }else if(input==2){
            q = "SELECT UmpireID, Grade, Name, DOB, Address, Email, AccountNo, BankBranch FROM umpire WHERE Name Like '"+pSearchKey+"' ";
        }else if(input==3){
            q = "SELECT UmpireID, Grade, Name, DOB, Address, Email, AccountNo, BankBranch FROM umpire WHERE Grade = '"+pSearchKey+"' ";
        }
        
        try
        {
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            UmpireDetails.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    //Search umpire for assigment
    public void searchUmpireAssignment(int input, String pSearchKey)
    {
        String q = null;
        
        if(input==1){
            q = "SELECT UmpireID, Grade, Name FROM umpire WHERE UmpireID = '"+pSearchKey+"' ";
        }else if(input==2){
            q = "SELECT UmpireID, Grade, Name FROM umpire WHERE Name Like '"+pSearchKey+"' ";
        }else if(input==3){
            q = "SELECT UmpireID, Grade, Name FROM umpire WHERE Grade = '"+pSearchKey+"' ";
        }
        
        try
        {
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            UmpireDetails.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
}
