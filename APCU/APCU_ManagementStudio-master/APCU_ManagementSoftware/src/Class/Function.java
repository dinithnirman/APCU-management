
package Class;

import GUI.Internal.User.PaymentHistory;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Function {
    
    public Function(){
        
    }
    
    public java.util.Date getDate(String pDate){
        java.util.Date date = null;
        try{
            date = new SimpleDateFormat("dd-MM-yyyy").parse(pDate);
        }catch(Exception e){
            System.out.print(e);
        }
        
        return date;
    }
    
    public void clearTable(javax.swing.JTable TableDetails){
        for(int i = 0 ; i<TableDetails.getRowCount() ; i++){
            for(int j = 0 ; j<TableDetails.getColumnCount(); j++){
                TableDetails.setValueAt("", i, j);
            }
        }
    }
    
    public double getPrecentage(String pTotalAmount,String pAmount){
        DecimalFormat df = new DecimalFormat("#.#");
        
        double TotalAmount = Double.parseDouble(pTotalAmount);
        double Amount = Double.parseDouble(pAmount);
        
        double result = (Amount/TotalAmount)*100.0;
        
        if(pTotalAmount.equals("0") && pAmount.equals("0")){
            result = Double.valueOf(df.format(0.0));
        }else{
            result = Double.valueOf(df.format(result));
        }
        return result;
        
    }
    
    public void progressBar(double pProgress,GUI.Internal.User.Report.CustomPanel DisplayProgress){
        
        
            new Thread(new Runnable() {

                @Override
                public void run() {
                    
                    DecimalFormat df = new DecimalFormat("#.#");
        
                    for(double i = 0 ; i<=pProgress ; ){
                        try 
                        {
                            DisplayProgress.updateProgress(i);
                            DisplayProgress.repaint();
                            
                            i = i + 0.1 ;
                            i = Double.valueOf(df.format(i));
                            
                            if(pProgress<=1){
                                Thread.sleep(40);
                            }else if(pProgress<10){
                                Thread.sleep(10);
                            }else{
                                Thread.sleep(1);
                            }
                            
                        }
                        catch (InterruptedException ex) 
                        {
                            Logger.getLogger(PaymentHistory.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                    }
                }
            }){
            
        }.start();
        
    }
    
}
