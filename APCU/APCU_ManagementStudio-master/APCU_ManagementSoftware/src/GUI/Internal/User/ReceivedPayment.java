
package GUI.Internal.User;
import Class.Function;
import Class.Match;
import Class.RecievedPayment;
import Class.Tournament;
import Validation.Validation;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class ReceivedPayment extends javax.swing.JInternalFrame {
    
    
    public ReceivedPayment() {
        initComponents();
        nonMove();
        tableNonMove();
        Tournament t = new Tournament(TournamentDetails);
        t.tournamentTableLoadAssignment();
        
    }
    public final void nonMove(){
            //make the jframe non-movable
        BasicInternalFrameUI frame = ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI());
        for(MouseListener listener: frame.getNorthPane().getMouseListeners())
        {
            frame.getNorthPane().removeMouseListener(listener);
        }
      }
    public final void tableNonMove(){
        //To make tables fixed
        RecievedPaymentDetails.getTableHeader().setReorderingAllowed(false);
        TournamentDetails.getTableHeader().setReorderingAllowed(false);
        
    }
    //setters
    public void setTournamentIDLabel(String pTournamentIDLabel){
        TIDL.setText(pTournamentIDLabel);
    }
    
    public void setNameLabel(String pNameLabel){
        NameL.setText(pNameLabel);
    }
    
    public void setStartDateLabel(String pStartDateLabel){
        StartDateL.setText(pStartDateLabel);
    }
    
    public void setEndDateLabel(String pEndDateLabel){
        EndDateL.setText(pEndDateLabel);
    }
    
    public void setContactPersonLabel(String pContactPersonLabel){
        ContactPersonL.setText(pContactPersonLabel);
    }
    
    public void setPaymentStatusLabel(String pPaymentStatusLabel){
        if(pPaymentStatusLabel.equals("Settled")){
            PaymentStatusL.setForeground(Color.GREEN);
        }else{
            PaymentStatusL.setForeground(Color.RED);
        }
        PaymentStatusL.setText(pPaymentStatusLabel);
    }
    
    public void setTotalAmountLabel(String pTotalAmountLabel){
        TotalAmountL.setText(pTotalAmountLabel);
    }
    
    public void setPaymentIDLabel(String pPaymentIDLabel){
        PIDL.setText(pPaymentIDLabel);
    }
    
    public void setDateBox(java.util.Date pPaymentDateBox){
        PaymentDateB.setDate(pPaymentDateBox);
    }
    
    public void setAmountBox(String pAmountBox){
        AmountB.setText(pAmountBox);
    }
    
    public void setPaymentMethodBox(String pPaymentMethodBox){
        PaymentMethodB.setSelectedItem(pPaymentMethodBox);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        TIDL = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        PaymentStatusL = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        StartDateL = new javax.swing.JLabel();
        NameL = new javax.swing.JLabel();
        EndDateL = new javax.swing.JLabel();
        ContactPersonL = new javax.swing.JLabel();
        TotalAmountL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TournamentDetails = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        PIDL = new javax.swing.JLabel();
        PaymentDateV = new javax.swing.JLabel();
        PaymentMethodV = new javax.swing.JLabel();
        AmountV = new javax.swing.JLabel();
        AmountB = new javax.swing.JTextField();
        PaymentDateB = new com.toedter.calendar.JDateChooser();
        PaymentMethodB = new javax.swing.JComboBox<String>();
        Clear = new javax.swing.JButton();
        AddRecievedPayment = new javax.swing.JButton();
        UpdateRecievedPayment = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        RecievedPaymentDetails = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        SearchTypeV = new javax.swing.JLabel();
        Reset2 = new javax.swing.JButton();
        SearchTypeB = new javax.swing.JComboBox<String>();
        SearchKeyB = new javax.swing.JTextField();
        SearchKeyV = new javax.swing.JLabel();
        Search = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setTitle("Recieved Payments ");
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel11.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Manage Payments >");

        jLabel12.setFont(new java.awt.Font("Calibri Light", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Recieved Payments ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addContainerGap())
        );

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blue&yellow_bannerS.jpg"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)), "Step 01 - Select a tournament ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 153, 204))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Name");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Tournament ID");

        TIDL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TIDL.setForeground(new java.awt.Color(51, 51, 51));
        TIDL.setText("Tournament ID will appear here");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Start Date");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Total Amount");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Payment Status");

        PaymentStatusL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PaymentStatusL.setForeground(new java.awt.Color(51, 51, 51));
        PaymentStatusL.setText("Payment status will appear here");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Contact Person");

        StartDateL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        StartDateL.setForeground(new java.awt.Color(51, 51, 51));
        StartDateL.setText("Start date will appear here");

        NameL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NameL.setForeground(new java.awt.Color(51, 51, 51));
        NameL.setText("Name will appear here");

        EndDateL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        EndDateL.setForeground(new java.awt.Color(51, 51, 51));
        EndDateL.setText("End date will appear here");

        ContactPersonL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ContactPersonL.setForeground(new java.awt.Color(51, 51, 51));
        ContactPersonL.setText("Contact person will appear here");

        TotalAmountL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TotalAmountL.setForeground(new java.awt.Color(51, 51, 51));
        TotalAmountL.setText("Total amount will appear here");

        jScrollPane1.setBackground(new java.awt.Color(0, 153, 204));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));
        jScrollPane1.setForeground(new java.awt.Color(51, 51, 51));

        TournamentDetails.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TournamentDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Tournament ID", "Name", "Start Date", "End Date", "Contact Person", "Total Amount", "Payment Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TournamentDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TournamentDetails.setGridColor(new java.awt.Color(255, 255, 255));
        TournamentDetails.setSelectionBackground(new java.awt.Color(0, 153, 204));
        TournamentDetails.setShowHorizontalLines(false);
        TournamentDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TournamentDetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TournamentDetails);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("End Date");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(StartDateL, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(TIDL, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(TotalAmountL, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(ContactPersonL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EndDateL, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameL, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PaymentStatusL, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TIDL)
                            .addComponent(NameL))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EndDateL)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(StartDateL)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PaymentStatusL)
                    .addComponent(TotalAmountL)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContactPersonL)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)), "Step 02 - Enter received payment details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 153, 204))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Amount");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Payment Method");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Payment Date");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Payment ID");

        PIDL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PIDL.setForeground(new java.awt.Color(51, 51, 51));
        PIDL.setText("Payment ID will assign automatically");

        PaymentDateV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        PaymentDateV.setForeground(new java.awt.Color(51, 51, 51));
        PaymentDateV.setText(" ");

        PaymentMethodV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        PaymentMethodV.setForeground(new java.awt.Color(51, 51, 51));
        PaymentMethodV.setText(" ");

        AmountV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        AmountV.setForeground(new java.awt.Color(51, 51, 51));
        AmountV.setText(" ");

        AmountB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AmountBMouseClicked(evt);
            }
        });
        AmountB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmountBActionPerformed(evt);
            }
        });

        PaymentMethodB.setBackground(new java.awt.Color(0, 153, 204));
        PaymentMethodB.setForeground(new java.awt.Color(255, 255, 255));
        PaymentMethodB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select the payment method", "Cash", "Cheque" }));
        PaymentMethodB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PaymentMethodB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentMethodBActionPerformed(evt);
            }
        });

        Clear.setBackground(new java.awt.Color(0, 153, 204));
        Clear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Clear.setForeground(new java.awt.Color(255, 255, 255));
        Clear.setText("Clear");
        Clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        AddRecievedPayment.setBackground(new java.awt.Color(0, 153, 204));
        AddRecievedPayment.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddRecievedPayment.setForeground(new java.awt.Color(255, 255, 255));
        AddRecievedPayment.setText("Add");
        AddRecievedPayment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddRecievedPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddRecievedPaymentActionPerformed(evt);
            }
        });

        UpdateRecievedPayment.setBackground(new java.awt.Color(0, 153, 204));
        UpdateRecievedPayment.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UpdateRecievedPayment.setForeground(new java.awt.Color(255, 255, 255));
        UpdateRecievedPayment.setText("Update");
        UpdateRecievedPayment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UpdateRecievedPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateRecievedPaymentActionPerformed(evt);
            }
        });

        jScrollPane3.setBackground(new java.awt.Color(0, 153, 204));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));
        jScrollPane3.setForeground(new java.awt.Color(51, 51, 51));

        RecievedPaymentDetails.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        RecievedPaymentDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Payment ID", "Payment Date", "Amount", "Payment Method"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        RecievedPaymentDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RecievedPaymentDetails.setGridColor(new java.awt.Color(255, 255, 255));
        RecievedPaymentDetails.setSelectionBackground(new java.awt.Color(0, 153, 204));
        RecievedPaymentDetails.setShowHorizontalLines(false);
        RecievedPaymentDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RecievedPaymentDetailsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(RecievedPaymentDetails);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PaymentMethodV, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(PaymentMethodB, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PaymentDateV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(AddRecievedPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(UpdateRecievedPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(PIDL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PaymentDateB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AmountB, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AmountV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(PIDL))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(PaymentDateB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(PaymentDateV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(AmountB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(AmountV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(PaymentMethodB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(PaymentMethodV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddRecievedPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateRecievedPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 269, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 151, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)), "Search Tournament", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 153, 204))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("Search by");

        SearchTypeV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        SearchTypeV.setForeground(new java.awt.Color(255, 0, 0));
        SearchTypeV.setText(" ");

        Reset2.setBackground(new java.awt.Color(0, 153, 204));
        Reset2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Reset2.setForeground(new java.awt.Color(255, 255, 255));
        Reset2.setText("Reset");
        Reset2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Reset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset2ActionPerformed(evt);
            }
        });

        SearchTypeB.setBackground(new java.awt.Color(0, 153, 204));
        SearchTypeB.setForeground(new java.awt.Color(255, 255, 255));
        SearchTypeB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select the search type", "Tournament ID", "Tournament Name", "Contact Person" }));
        SearchTypeB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        SearchKeyB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchKeyBMouseClicked(evt);
            }
        });

        SearchKeyV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        SearchKeyV.setForeground(new java.awt.Color(255, 0, 0));
        SearchKeyV.setText(" ");

        Search.setBackground(new java.awt.Color(0, 153, 204));
        Search.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Search.setForeground(new java.awt.Color(255, 255, 255));
        Search.setText("Search");
        Search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(Reset2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(SearchKeyV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SearchTypeV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SearchKeyB)
                    .addComponent(SearchTypeB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(SearchTypeB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(SearchTypeV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchKeyB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(SearchKeyV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reset2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(365, 365, 365)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(373, 373, 373))
        );

        getAccessibleContext().setAccessibleName("Add / UpdateRetailer");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TournamentDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TournamentDetailsMouseClicked
        clearForm();
        validationLableReset();
        
        Function f = new Function();
        f.clearTable(RecievedPaymentDetails);
        
        int row = TournamentDetails.getSelectedRow();
        
        setTournamentIDLabel(TournamentDetails.getValueAt(row, 0).toString());
        setNameLabel(TournamentDetails.getValueAt(row, 1).toString());
        setStartDateLabel(TournamentDetails.getValueAt(row, 2).toString());
        setEndDateLabel(TournamentDetails.getValueAt(row, 3).toString());
        setContactPersonLabel(TournamentDetails.getValueAt(row, 4).toString());
        setTotalAmountLabel(TournamentDetails.getValueAt(row, 5).toString()); 
        setPaymentStatusLabel(TournamentDetails.getValueAt(row, 6).toString());
        
        RecievedPayment RP = new RecievedPayment(RecievedPaymentDetails);
        RP.recievedPaymentTableLoad(Integer.parseInt(TournamentDetails.getValueAt(row, 0).toString()));
      
    }//GEN-LAST:event_TournamentDetailsMouseClicked

    private void AmountBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmountBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmountBActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        clearForm();
        validationLableReset();
    }//GEN-LAST:event_ClearActionPerformed

    private void AddRecievedPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddRecievedPaymentActionPerformed
        validationLableColorSet();
        validationLableReset();
        
        Validation v = new Validation();
        boolean Amount = v.accountNoValidation(AmountB.getText());
        
        if( PaymentStatusL.getText().equals("Settled")){
            JOptionPane.showMessageDialog(null, "Payment completely settled! ");
        }else{
            if( TIDL.getText().equals("Tournament ID will appear here") || PaymentDateB.getDate() == null || AmountB.getText().equals("") || Amount == false || PaymentMethodB.getSelectedItem() == "Select the payment method" ){
                if( TIDL.getText().equals("Tournament ID will appear here")){
                    JOptionPane.showMessageDialog(null, "Select a tournament detail first! ");
                }else{
                    JOptionPane.showMessageDialog(null, "Incomplete or invalid details of a recieved payment exsist! ");
                
                    if(PaymentDateB.getDate() == null){
                        PaymentDateV.setText("*Enter date");
                    }
                
                    if(AmountB.getText().equals("")){
                        AmountV.setText("*Enter Amount");
                    }else if(Amount == false){
                        AmountV.setText("*Invalid Amount");
                    }
                
                    if(PaymentMethodB.getSelectedItem() == "Select the payment method" ){
                        PaymentMethodV.setText("*Enter payment method");
                    }
            
                } 
            }else{
                RecievedPayment RP0 = new RecievedPayment();
                int AmountCheck = RP0.checkAmount(Integer.parseInt(TIDL.getText()), Integer.parseInt(TotalAmountL.getText()), Integer.parseInt(AmountB.getText()));
                SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
            
                if(AmountCheck==001){
                    JOptionPane.showMessageDialog(null, "Amount enterd exceed the total amount in the a tournament details! ");
                }else{

                    RecievedPayment RP1 = new RecievedPayment(Integer.parseInt(TIDL.getText()), formatDate.format(PaymentDateB.getDate()), Integer.parseInt(AmountB.getText()), PaymentMethodB.getSelectedItem().toString());
                    RP1.addRecievedPayment();
                    setPaymentIDLabel(Integer.toString(RP1.getRecievedPaymentID()));
                    RecievedPayment RP = new RecievedPayment(RecievedPaymentDetails);
                    RP.recievedPaymentTableLoad(Integer.parseInt(TIDL.getText()));

                    if(AmountCheck==000){
                        Tournament t1 = new Tournament();
                        t1.updatePaymentStatus(Integer.parseInt(TIDL.getText()));
                        Tournament t2 = new Tournament(TournamentDetails);
                        t2.tournamentTableLoadAssignment();
                        setPaymentStatusLabel("Settled");

                        JOptionPane.showMessageDialog(null, "Recieved payment details added sucessfully! \nPayment completely settled");
                    }else{
                        JOptionPane.showMessageDialog(null, "Recieved payment details added sucessfully! \nRs. '"+AmountCheck+"' to be payed");
                    }
                }
            }        
        }
        
        
    }//GEN-LAST:event_AddRecievedPaymentActionPerformed

    private void UpdateRecievedPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateRecievedPaymentActionPerformed
        
        validationLableColorSet();
        validationLableReset();
        
        Validation v = new Validation();
        boolean Amount = v.accountNoValidation(AmountB.getText());
        
        if( PaymentStatusL.getText().equals("Settled")){
            JOptionPane.showMessageDialog(null, "Payment completely settled! ");
        }else{
            if( TIDL.getText().equals("Tournament ID will appear here") || PIDL.getText().equals("Payment ID will assign automatically") || PaymentDateB.getDate() == null || AmountB.getText().equals("") || Amount == false || PaymentMethodB.getSelectedItem() == "Select the payment method" ){
                if( TIDL.getText().equals("Tournament ID will appear here")){
                    JOptionPane.showMessageDialog(null, "Select a tournament detail first! ");
                }else{
                    
                    if( PIDL.getText().equals("Payment ID will assign automatically")){
                        JOptionPane.showMessageDialog(null, "Select a recieved payment detail first! ");
                    }else{
                        JOptionPane.showMessageDialog(null, "Incomplete or invalid details of a recieved payment exsist! ");
                    }
                    
                    if(PaymentDateB.getDate() == null){
                        PaymentDateV.setText("*Enter date");
                    }
                
                    if(AmountB.getText().equals("")){
                        AmountV.setText("*Enter Amount");
                    }else if(Amount == false){
                        AmountV.setText("*Invalid Amount");
                    }
                
                    if(PaymentMethodB.getSelectedItem() == "Select the payment method" ){
                        PaymentMethodV.setText("*Enter payment method");
                    }
            
                } 
            }else{
                RecievedPayment RP0 = new RecievedPayment();
                int AmountCheck = RP0.checkUpdateAmount(Integer.parseInt(TIDL.getText()), Integer.parseInt(TotalAmountL.getText()), Integer.parseInt(AmountB.getText()), Integer.parseInt(PIDL.getText()));
                SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
            
                if(AmountCheck==001){
                    JOptionPane.showMessageDialog(null, "Amount enterd exceed the total amount in the a tournament details! ");
                }else{

                    RecievedPayment RP1 = new RecievedPayment(Integer.parseInt(PIDL.getText()),Integer.parseInt(TIDL.getText()), formatDate.format(PaymentDateB.getDate()), Integer.parseInt(AmountB.getText()), PaymentMethodB.getSelectedItem().toString());
                    RP1.updateRecievedPayment();
                    RecievedPayment RP = new RecievedPayment(RecievedPaymentDetails);
                    RP.recievedPaymentTableLoad(Integer.parseInt(TIDL.getText()));

                    if(AmountCheck==000){
                        Tournament t1 = new Tournament();
                        t1.updatePaymentStatus(Integer.parseInt(TIDL.getText()));
                        Tournament t2 = new Tournament(TournamentDetails);
                        t2.tournamentTableLoadAssignment();
                        setPaymentStatusLabel("Settled");

                        JOptionPane.showMessageDialog(null, "Recieved payment details added sucessfully! \nPayment completely settled");
                    }else{
                        JOptionPane.showMessageDialog(null, "Recieved payment details added sucessfully! \nRs. '"+AmountCheck+"' to be payed");
                    }
                }
            }        
        }
            
    }//GEN-LAST:event_UpdateRecievedPaymentActionPerformed

    private void PaymentMethodBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentMethodBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PaymentMethodBActionPerformed

    private void RecievedPaymentDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecievedPaymentDetailsMouseClicked
        validationLableReset();
        
        int row = RecievedPaymentDetails.getSelectedRow();
        
        setPaymentIDLabel(RecievedPaymentDetails.getValueAt(row, 0).toString());
        Function f = new Function();
        setDateBox(f.getDate(RecievedPaymentDetails.getValueAt(row, 1).toString()));
        setAmountBox(RecievedPaymentDetails.getValueAt(row, 2).toString());
        setPaymentMethodBox(RecievedPaymentDetails.getValueAt(row, 3).toString());
        
    }//GEN-LAST:event_RecievedPaymentDetailsMouseClicked

    private void AmountBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AmountBMouseClicked
        setAmountBox("");
    }//GEN-LAST:event_AmountBMouseClicked

    private void Reset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset2ActionPerformed
        SearchTypeB.setSelectedItem("Select the search type");
        SearchKeyB.setText("");
        clearSearchValidation();

        Tournament t = new Tournament(TournamentDetails);
        t.tournamentTableLoadAssignment();
        
        validationLableReset();
        clearForm();
        clearTournamentForm();
            
        RecievedPaymentDetails.getSelectionModel().clearSelection();
            
        Function f = new Function();
        f.clearTable(RecievedPaymentDetails);


    }//GEN-LAST:event_Reset2ActionPerformed

    private void SearchKeyBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchKeyBMouseClicked
        SearchKeyB.setText("");
    }//GEN-LAST:event_SearchKeyBMouseClicked

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        clearSearchValidation();

        if(SearchTypeB.getSelectedItem() == "Select the search type" || SearchKeyB.getText().equals("") ){
            if(SearchTypeB.getSelectedItem() == "Select the search type"){
                SearchTypeV.setText("*Enter serach type");
            }
            if(SearchKeyB.getText().equals("") ){
                SearchKeyV.setText("*Enter serach key");
            }
        }else{
            validationLableReset();
            clearForm();
            clearTournamentForm();
            
            RecievedPaymentDetails.getSelectionModel().clearSelection();
            
            Function f = new Function();
            f.clearTable(RecievedPaymentDetails);


            Tournament t3 = new Tournament(TournamentDetails);
            if(SearchTypeB.getSelectedItem()== "Tournament ID"){
                t3.searchTournamentAssignment(1, SearchKeyB.getText());
            }else if(SearchTypeB.getSelectedItem()== "Tournament Name"){
                t3.searchTournamentAssignment(2, "%"+SearchKeyB.getText()+"%");
            }else if(SearchTypeB.getSelectedItem()== "Contact Person"){
                t3.searchTournamentAssignment(3, "%"+SearchKeyB.getText()+"%");
            }

        }
    }//GEN-LAST:event_SearchActionPerformed
    
    //Clear all the text in the form
    public void clearTournamentForm(){
        
        setTournamentIDLabel("Tournament ID will appear here");
        setNameLabel("Name will appear here");
        setStartDateLabel("Start date will appear here");
        setEndDateLabel("End date will appear here");
        setContactPersonLabel("Contact person will appear here");
        setTotalAmountLabel("Total amount will appear here"); 
        Color Grey = new Color(51,51,51);
        PaymentStatusL.setForeground(Grey);
        setPaymentStatusLabel("Payment status will appear here");
    }
    
    //Clear all the text in the form
    public void clearForm(){
        setPaymentIDLabel("Payment ID will assign automatically");
        setDateBox(null);
        setAmountBox(null);
        setPaymentMethodBox("Select the payment method");
    }
   
    //Clear all the error messages
    public void validationLableReset(){
        PaymentDateV.setText(" ");
        AmountV.setText(" ");
        PaymentMethodV.setText(" ");
    }
    
    //Set color red for all the validation label
    public void validationLableColorSet(){
        PaymentDateV.setForeground(Color.RED);
        AmountV.setForeground(Color.RED);
        PaymentMethodV.setForeground(Color.RED);
    }
   
    //Clear validation in search form
    public void clearSearchValidation(){
            SearchTypeV.setText(" ");
            SearchKeyV.setText(" ");
    }    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddRecievedPayment;
    private javax.swing.JTextField AmountB;
    private javax.swing.JLabel AmountV;
    private javax.swing.JButton Clear;
    private javax.swing.JLabel ContactPersonL;
    private javax.swing.JLabel EndDateL;
    private javax.swing.JLabel NameL;
    private javax.swing.JLabel PIDL;
    private com.toedter.calendar.JDateChooser PaymentDateB;
    private javax.swing.JLabel PaymentDateV;
    private javax.swing.JComboBox<String> PaymentMethodB;
    private javax.swing.JLabel PaymentMethodV;
    private javax.swing.JLabel PaymentStatusL;
    private javax.swing.JTable RecievedPaymentDetails;
    private javax.swing.JButton Reset2;
    private javax.swing.JButton Search;
    private javax.swing.JTextField SearchKeyB;
    private javax.swing.JLabel SearchKeyV;
    private javax.swing.JComboBox<String> SearchTypeB;
    private javax.swing.JLabel SearchTypeV;
    private javax.swing.JLabel StartDateL;
    private javax.swing.JLabel TIDL;
    private javax.swing.JLabel TotalAmountL;
    private javax.swing.JTable TournamentDetails;
    private javax.swing.JButton UpdateRecievedPayment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
