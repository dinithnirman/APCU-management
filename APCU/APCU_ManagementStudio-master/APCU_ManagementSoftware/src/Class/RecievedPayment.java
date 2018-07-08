
package Class;

import DB.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;

public class RecievedPayment {
    private int TournamentID;
    private int PaymentID;
    private String PaymentDate;
    private int Amount;
    private String PaymentMethod;
    private javax.swing.JTable RecievedPaymentDetails;
    
    Connection connection = null;
    PreparedStatement pst = null;
    ResultSet rs =null;
    
    //Constuctor for method calling
    public RecievedPayment( ){
       connection = DBconnect.connect();
    }
    
    //Constuctor for table load
    public RecievedPayment( javax.swing.JTable pRecievedPaymentDetails){
       connection = DBconnect.connect();
       RecievedPaymentDetails = pRecievedPaymentDetails;
    }
    
    //Constuctor for add method 
    public RecievedPayment( int pTournamentID, String pPaymentDate, int pRAmount, String pPaymentMethod){
        TournamentID = pTournamentID;
        PaymentDate = pPaymentDate;
        Amount = pRAmount;
        PaymentMethod = pPaymentMethod;
        
        connection = DBconnect.connect();
    }
    
    //Constuctor for update method 
    public RecievedPayment( int pPaymentID, int pTournamentID, String pPaymentDate, int pRAmount, String pPaymentMethod){
        PaymentID = pPaymentID;
        TournamentID = pTournamentID;
        PaymentDate = pPaymentDate;
        Amount = pRAmount;
        PaymentMethod = pPaymentMethod;
        
        connection = DBconnect.connect();
    }
    
    //Add method
    public void addRecievedPayment(){
        try
        {
            String q = "INSERT INTO rpayment (TournamentID, RPaymentDate, RAmount, PaymentMethod) VALUES ('"+TournamentID+"', '"+PaymentDate+"', '"+Amount+"', '"+PaymentMethod+"')";
            pst = connection.prepareStatement(q);
            pst.execute();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    
    //Update method
    public void updateRecievedPayment(){
        try
        {
            String q = "UPDATE rpayment SET RPaymentDate = '"+ PaymentDate +"', RAmount = '"+ Amount +"', PaymentMethod = '"+ PaymentMethod +"' WHERE RPaymentID = '"+ PaymentID +"' ";
            pst = connection.prepareStatement(q);
            pst.execute();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    
    //Load data to the table
    public void recievedPaymentTableLoad(int pTournamentID)
    {
        try
        {
            String q = "SELECT RPaymentID, RPaymentDate, RAmount, PaymentMethod FROM rpayment WHERE TournamentID = '"+pTournamentID+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            RecievedPaymentDetails.setModel(DbUtils.resultSetToTableModel(rs));
            //setTableHeader(0, RetailerDetails);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    //Load data to the table
    public void reportRecievedPaymentTableLoad(int pTournamentID)
    {
        try
        {
            String q = "SELECT RPaymentID, RPaymentDate FROM rpayment WHERE TournamentID = '"+pTournamentID+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            RecievedPaymentDetails.setModel(DbUtils.resultSetToTableModel(rs));
            //setTableHeader(0, RetailerDetails);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    // check wether amount exceed for add method
    public int checkAmount(int pTournamentID, int pTotalAmount, int pAmount){
        String SAmount = null;
        int IAmount = 0;
        int Result = 0;
        try{
            String q = "SELECT SUM(RAmount)FROM rpayment WHERE TournamentID = '"+ pTournamentID +"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                SAmount = rs.getString("SUM(RAmount)");
            }
                
        }catch(SQLException e){
            System.out.println(e);
        }
        
        if(SAmount==null){
            IAmount = pAmount;
        }else{
            IAmount = Integer.parseInt(SAmount)+ pAmount;
        }
        
        if(IAmount<pTotalAmount){
            Result = pTotalAmount-IAmount;
        }else if (IAmount==pTotalAmount){
            Result = 000;
        }else if (IAmount>pTotalAmount){
            Result = 001;
        }
        
        return Result;
    }
    
    // check wether amount exceed for update method
    public int checkUpdateAmount(int pTournamentID, int pTotalAmount, int pAmount, int pPaymentID){
        String SAmount = null;
        String RAmount = null;
        int IAmount = 0;
        int Result = 0;
        try{
            String q = "SELECT SUM(RAmount)FROM rpayment WHERE TournamentID = '"+ pTournamentID +"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                SAmount = rs.getString("SUM(RAmount)");
            }
                
        }catch(SQLException e){
            System.out.println(e);
        }
        
        try{
            String q = "SELECT RAmount FROM rpayment WHERE RPaymentID = '"+ pPaymentID +"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                RAmount = rs.getString("RAmount");
            }
                
        }catch(SQLException e){
            System.out.println(e);
        }
        
        IAmount = (Integer.parseInt(SAmount)+ pAmount)-Integer.parseInt(RAmount);
        
        if(IAmount<pTotalAmount){
            Result = pTotalAmount-IAmount;
        }else if (IAmount==pTotalAmount){
            Result = 000;
        }else if (IAmount>pTotalAmount){
            Result = 001;
        }
        
        return Result;
    }
    
    
    //Returns Recieved Payment ID
    public int getRecievedPaymentID(){
        int ID = 0;
        try
        {
            String q = "SELECT RPaymentID FROM rpayment WHERE TournamentID = '"+ TournamentID +"' AND RPaymentDate = '"+ PaymentDate +"' AND RAmount = '"+ Amount +"' AND PaymentMethod = '"+ PaymentMethod +"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                ID = Integer.parseInt(rs.getString("RPaymentID"));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return ID; 
    }
    
    //Get tournament details for view
    public void viewRecievedPaymentDetails(int pRecievedPaymentID, javax.swing.JLabel PIDL, javax.swing.JLabel RPaymentDateL, javax.swing.JLabel RAmountL, javax.swing.JLabel RPaymentMethodL){
        
        try
        {
            String q = "SELECT RPaymentID, RPaymentDate, RAmount, PaymentMethod FROM rpayment WHERE RPaymentID = '"+pRecievedPaymentID+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                PIDL.setText(Integer.toString(rs.getInt("RPaymentID")));
                RPaymentDateL.setText(rs.getString("RPaymentDate"));
                RAmountL.setText(Integer.toString(rs.getInt("RAmount")));
                RPaymentMethodL.setText(rs.getString("PaymentMethod"));
                
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    public void reportRecievedPaymentTableload(int pTournamentID){
        try
        {
            String q = "SELECT RPaymentID, RPaymentDate FROM rpayment WHERE TournamentID = '"+pTournamentID+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            RecievedPaymentDetails.setModel(DbUtils.resultSetToTableModel(rs));
            //setTableHeader(0, RetailerDetails);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    //Get amount to be payment
    public void getAmount(int pTournamentID, int pTotalAmount, javax.swing.JLabel AmountPaidL, javax.swing.JLabel AmountToPayL, GUI.Internal.User.Report.CustomPanel RecievedPaymentProgress){
        String AmountPaid = null;
        String TotalAmount = Integer.toString(pTotalAmount);
        try{
            String q = "SELECT SUM(RAmount)FROM rpayment WHERE TournamentID = '"+ pTournamentID +"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
  
            while(rs.next()){
                
                if(rs.getString("SUM(RAmount)")==null){
                    AmountPaidL.setText("0");
                    AmountToPayL.setText(Integer.toString(pTotalAmount)); 
                    AmountPaid = "0";
                }else{
                    AmountPaidL.setText(rs.getString("SUM(RAmount)"));
                    AmountToPayL.setText(Integer.toString(pTotalAmount - Integer.parseInt(rs.getString("SUM(RAmount)"))));
                    AmountPaid = rs.getString("SUM(RAmount)");
                }
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        
        Function f = new Function();
        double Progress = f.getPrecentage(TotalAmount, AmountPaid);
        f.progressBar(Progress, RecievedPaymentProgress);
        
    }
}
