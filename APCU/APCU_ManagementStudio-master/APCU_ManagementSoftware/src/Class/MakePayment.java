
package Class;

import DB.DBconnect;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;

public class MakePayment {
    private int MatchID;
    private int PaymentID;
    private int Amount;
    private String Position;
    private javax.swing.JTable MakePaymentDetails;
    
    Connection connection = null;
    PreparedStatement pst = null;
    ResultSet rs =null;
    
    //Constuctor for method calling
    public MakePayment( ){
       connection = DBconnect.connect();
    }
    
    //Constuctor for table load
    public MakePayment( javax.swing.JTable pMakePaymentDetails){
       connection = DBconnect.connect();
       MakePaymentDetails = pMakePaymentDetails;
    }
    
    //Constuctor for add method
    public MakePayment( int pMatchID, String pPosition, int pAmount){
       MatchID = pMatchID;
       Position = pPosition;
       Amount = pAmount;
        
       connection = DBconnect.connect();
    }
    
    //Constuctor for update method
    public MakePayment( int pMatchID, int pPaymentID, String pPosition, int pAmount){
       MatchID = pMatchID;
       PaymentID = pPaymentID;
       Position = pPosition;
       Amount = pAmount;
        
       connection = DBconnect.connect();
    }
    
    //Load data to the table
    public void MakePaymentTableLoad(int pMatchID)
    {
        try
        {
            String q = "SELECT PPaymentID, Position, PAmount FROM ppayment WHERE CMatchID = '"+pMatchID+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            MakePaymentDetails.setModel(DbUtils.resultSetToTableModel(rs));
            //setTableHeader(0, RetailerDetails);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    //Add method
    public void addMakePayment(){
        try
        {
            String q = "INSERT INTO ppayment(Position, PAmount, CMatchID) VALUES ('"+ Position +"', '"+ Amount +"', '"+ MatchID +"')";
            pst = connection.prepareStatement(q);
            pst.execute();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        
    }
    
    //Returns Make Payment ID
    public int getMakePaymentID(){
        int ID = 0;
        try
        {
            String q = "SELECT PPaymentID FROM ppayment WHERE Position = '"+ Position +"' AND PAmount = '"+ Amount +"' AND CMatchID = '"+ MatchID +"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                ID = Integer.parseInt(rs.getString("PPaymentID"));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return ID; 
    }
    
    //Update method
    public void updateMakePayment(){
        try
        {
            String q = "UPDATE ppayment SET Position  = '"+ Position +"', PAmount = '"+ Amount +"' WHERE PPaymentID = '"+ PaymentID +"' AND CMatchID = '"+ MatchID +"'";
            pst = connection.prepareStatement(q);
            pst.execute();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    
    //Check make payment details for a position exsisit
    public boolean checkPosition(){
        int Count = 0;
        boolean Result = false;
        
        try
        {
            String q = "SELECT COUNT(PPaymentID) FROM ppayment WHERE Position = '"+ Position +"' AND CMatchID = '"+ MatchID +"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                Count = Integer.parseInt(rs.getString("COUNT(PPaymentID)"));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        if(Count==0){
            Result = true;
        }
        return Result; 
    }
    
    //Update method
    public void updateMakePaymentStatus(int input, String pDate, int pUmpireID, int pMatchID, javax.swing.JLabel PaymentStatusL){
        if(input==0){
            try
            {
                String q = "UPDATE umpireallocation SET PPaymentStatus  = 'Settled',  PPaymentDate = '"+ pDate +"' WHERE UmpireID = '"+ pUmpireID +"' AND CMatchID = '"+ pMatchID +"' ";
                pst = connection.prepareStatement(q);
                pst.execute();
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            
            try
            {
                String q = "SELECT PPaymentStatus FROM umpireallocation WHERE UmpireID = '"+ pUmpireID +"' AND CMatchID = '"+ pMatchID +"' ";
                pst = connection.prepareStatement(q);
                rs = pst.executeQuery(q);
            
                while(rs.next()){
                    PaymentStatusL.setForeground(Color.GREEN);
                    PaymentStatusL.setText(rs.getString("PPaymentStatus"));
                }
            }
            catch(SQLException e)
            {
                System.out.println(e);
            }
        }else{
            try
            {
                String q = "UPDATE scorerallocation SET PPaymentStatus  = 'Settled',  PPaymentDate = '"+ pDate +"' WHERE ScorerID = '"+ pUmpireID +"' AND CMatchID = '"+ pMatchID +"' ";
                pst = connection.prepareStatement(q);
                pst.execute();
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            
            try
            {
                String q = "SELECT PPaymentStatus FROM scorerallocation WHERE ScorerID = '"+ pUmpireID +"' AND CMatchID = '"+ pMatchID +"' ";
                pst = connection.prepareStatement(q);
                rs = pst.executeQuery(q);
            
                while(rs.next()){
                    PaymentStatusL.setForeground(Color.GREEN);
                    PaymentStatusL.setText(rs.getString("PPaymentStatus"));
                }
            }
            catch(SQLException e)
            {
                System.out.println(e);
            }
        }
    }
    
    //Get payment details for view
    public void viewPaymentDetails(int pUmpireID, int pMatchID, javax.swing.JLabel PositionL, javax.swing.JLabel PaymentL, javax.swing.JLabel PPaymentStatusL, javax.swing.JLabel PaymentDateL){
        String Position=null;
        try
        {
            String q = "SELECT UmpireType, PPaymentStatus, PPaymentDate FROM umpireallocation  WHERE CMatchID = '"+pMatchID+"' AND UmpireID = '"+pUmpireID+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                Position = rs.getString("UmpireType");
                PositionL.setText(rs.getString("UmpireType"));
                PPaymentStatusL.setText(rs.getString("PPaymentStatus"));
                PaymentDateL.setText(rs.getString("PPaymentDate"));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        try
        {
            String q = "SELECT PAmount FROM ppayment WHERE CMatchID = '"+pMatchID+"' AND Position = '"+Position+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            PaymentL.setText("Payment not assigned");
            
            while(rs.next()){
                PaymentL.setText(rs.getString("PAmount"));
            }  
            
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    
    //Get payment details for view scorer
    public void sViewPaymentDetails(int pScorerID, int pMatchID, javax.swing.JLabel PositionL, javax.swing.JLabel PaymentL, javax.swing.JLabel PPaymentStatusL, javax.swing.JLabel PaymentDateL){
        String Position=null;
        try
        {
            String q = "SELECT PPaymentStatus, PPaymentDate FROM scorerallocation  WHERE CMatchID = '"+pMatchID+"' AND ScorerID = '"+pScorerID+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            while(rs.next()){
                Position = "Scorer";
                PositionL.setText(Position);
                PPaymentStatusL.setText(rs.getString("PPaymentStatus"));
                PaymentDateL.setText(rs.getString("PPaymentDate"));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        try
        {
            String q = "SELECT PAmount FROM ppayment WHERE CMatchID = '"+pMatchID+"' AND Position = '"+Position+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);
            
            PaymentL.setText("Payment not assigned");
            
            while(rs.next()){
                PaymentL.setText(rs.getString("PAmount"));
            }
            
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    public void getAmountPaid(int pTournamentID, javax.swing.JLabel PTotatlAmountL, javax.swing.JLabel PAmountPaidL, javax.swing.JLabel PAmountToPayL, GUI.Internal.User.Report.CustomPanel PaidPaymentProgress){
        int TotalUmpireAmount = 0, TotalScorerAmount = 0, UmpireAmount = 0, ScorerAmount = 0;
        try
        {
            String q = "SELECT SUM(P.PAmount) FROM umpireallocation U, ppayment P, cmatch C WHERE C.CMatchID = U.CMatchID AND U.CMatchID = P.CMatchID AND U.UmpireType = P.Position AND U.PPaymentStatus = 'Settled' AND C.TournamentID = '"+pTournamentID+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);

            while(rs.next()){
                UmpireAmount = rs.getInt("SUM(P.PAmount)");
            }

        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        try
        {
            String q = "SELECT SUM(P.PAmount) FROM scorerallocation S, ppayment P, cmatch C WHERE C.CMatchID = S.CMatchID AND S.CMatchID = P.CMatchID AND P.Position = 'Scorer' AND S.PPaymentStatus = 'Settled' AND C.TournamentID = '"+pTournamentID+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);

            while(rs.next()){
                ScorerAmount = rs.getInt("SUM(P.PAmount)");
            }

        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        PAmountPaidL.setText(Integer.toString(UmpireAmount+ScorerAmount));
        
        try
        {
            String q = "SELECT SUM(P.PAmount) FROM umpireallocation U, ppayment P, cmatch C WHERE C.CMatchID = U.CMatchID AND U.CMatchID = P.CMatchID AND U.UmpireType = P.Position AND C.TournamentID = '"+pTournamentID+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);

            while(rs.next()){
                TotalUmpireAmount = rs.getInt("SUM(P.PAmount)");
            }

        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        try
        {
            String q = "SELECT SUM(P.PAmount) FROM scorerallocation S, ppayment P, cmatch C WHERE C.CMatchID = S.CMatchID AND S.CMatchID = P.CMatchID AND P.Position = 'Scorer' AND C.TournamentID = '"+pTournamentID+"' ";
            pst = connection.prepareStatement(q);
            rs = pst.executeQuery(q);

            while(rs.next()){
                TotalScorerAmount = rs.getInt("SUM(P.PAmount)");
            }

        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        PTotatlAmountL.setText(Integer.toString(TotalUmpireAmount+TotalScorerAmount));
        int PaymentToPay = (TotalUmpireAmount+TotalScorerAmount)-(UmpireAmount+ScorerAmount);
        PAmountToPayL.setText(Integer.toString(PaymentToPay));
        
        Function f = new Function();
        double Progress = f.getPrecentage((Integer.toString(TotalUmpireAmount+TotalScorerAmount)), (Integer.toString(UmpireAmount+ScorerAmount)));
        f.progressBar(Progress, PaidPaymentProgress);
    }
}
