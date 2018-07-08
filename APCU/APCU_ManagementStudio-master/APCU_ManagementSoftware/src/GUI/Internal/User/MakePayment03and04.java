
package GUI.Internal.User;
import Class.Function;
import Class.MakePayment;
import Class.Match;
import Class.Scorer;
import Class.Umpire;
import GUI.Internal.User.MakeUpdateAssignments01and02;
import Validation.Validation;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class MakePayment03and04 extends javax.swing.JInternalFrame {
    
    
    
    public MakePayment03and04(JDesktopPane pDesktop, String pMatchID) {
        initComponents();
        nonMove();
        tableNonMove();
        this.Desktop = pDesktop;
        EMIDL.setText(pMatchID);
        SMIDL.setText(pMatchID);
        
        MakePayment mp = new MakePayment(PaidPaymentDetails);
        mp.MakePaymentTableLoad(Integer.parseInt(pMatchID));
    
        Umpire u = new Umpire(UmpireAllocationDetails);
        u.umpireMakePaymentTableLoad(Integer.parseInt(pMatchID));
    
        Scorer s = new Scorer(ScorerAllocationDetails);
        s.scorerMakePaymentTableLoad(Integer.parseInt(pMatchID));
    
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
        PaidPaymentDetails.getTableHeader().setReorderingAllowed(false);
        UmpireAllocationDetails.getTableHeader().setReorderingAllowed(false);
        ScorerAllocationDetails.getTableHeader().setReorderingAllowed(false);
    }

    //setters
    public void setPaymentIDLabel(String pPaymentIDLabel){
        PIDL.setText(pPaymentIDLabel);
    }
   
    public void setPositionTypeBox(String pPositionTypeBox){
        PositionTypeB.setSelectedItem(pPositionTypeBox);
    }
    
    public void setAmountBox(String pAmountBox){
        AmountB.setText(pAmountBox);
    }
    
    
    
    public void setIDLabel(String pIDLabel){
        IDL.setText(pIDLabel);
    }
    
    public void setIDNameLabel(String pIDNameLabel){
        IDNameL.setText(pIDNameLabel);
    }
    
    public void setNameLabel(String pNameLabel){
        NameL.setText(pNameLabel);
    }
    
    public void setPositionLabel(String pPositionLabel){
        PositionL.setText(pPositionLabel);
    }
   
    public void setPaymentLabel(String pPaymentLabel){
        PaymentL.setText(pPaymentLabel);
    }
    
    public void setPaymentStatusLabel(String pPaymentStatusLabel){
        PaymentStatusL.setText(pPaymentStatusLabel);
    }
    
    public void setDateBox(java.util.Date pDateBox){
        PaymentDateB.setDate(pDateBox);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        PaidPaymentDetails = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        EMIDL = new javax.swing.JLabel();
        PIDL = new javax.swing.JLabel();
        AmountV = new javax.swing.JLabel();
        PositionTypeB = new javax.swing.JComboBox<String>();
        AmountB = new javax.swing.JTextField();
        PositionTypeV = new javax.swing.JLabel();
        AddMakePayment = new javax.swing.JButton();
        UpdateMakePayment = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        BackL = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        UmpireAllocationDetails = new javax.swing.JTable();
        Settle = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        ScorerAllocationDetails = new javax.swing.JTable();
        UmpireDetailsV = new javax.swing.JLabel();
        ScorerDetailsV = new javax.swing.JLabel();
        DetailV = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        SMIDL = new javax.swing.JLabel();
        IDNameL = new javax.swing.JLabel();
        IDL = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NameL = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PositionL = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        PaymentDateB = new com.toedter.calendar.JDateChooser();
        PaymentDateV = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        PaymentL = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        PaymentStatusL = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setTitle("Make Payment");
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel11.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Manage Payments >");

        jLabel12.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Make Payment >");

        jLabel15.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Step 01 & 02 >");

        jLabel21.setFont(new java.awt.Font("Calibri Light", 0, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Step 03 & 04");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15)
                    .addComponent(jLabel21))
                .addContainerGap())
        );

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blue&yellow_bannerS.jpg"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)), "Step 03 - Enter make payment details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 153, 204))); // NOI18N

        jScrollPane3.setBackground(new java.awt.Color(0, 153, 204));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));
        jScrollPane3.setForeground(new java.awt.Color(51, 51, 51));

        PaidPaymentDetails.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PaidPaymentDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Payment ID", "Position", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PaidPaymentDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PaidPaymentDetails.setGridColor(new java.awt.Color(255, 255, 255));
        PaidPaymentDetails.setSelectionBackground(new java.awt.Color(0, 153, 204));
        PaidPaymentDetails.setShowHorizontalLines(false);
        PaidPaymentDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaidPaymentDetailsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(PaidPaymentDetails);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Match ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Payment ID");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Amount");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Position");

        EMIDL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        EMIDL.setForeground(new java.awt.Color(51, 51, 51));
        EMIDL.setText("Match ID will appear here");

        PIDL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PIDL.setForeground(new java.awt.Color(51, 51, 51));
        PIDL.setText("Payment ID will assign automatically");

        AmountV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        AmountV.setForeground(java.awt.Color.red);
        AmountV.setText(" ");

        PositionTypeB.setBackground(new java.awt.Color(0, 153, 204));
        PositionTypeB.setForeground(new java.awt.Color(255, 255, 255));
        PositionTypeB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select the position", "Umpire", "Third Umpire", "Standby Umpire", "Scorer" }));
        PositionTypeB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        AmountB.setForeground(new java.awt.Color(51, 51, 51));
        AmountB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AmountBMouseClicked(evt);
            }
        });

        PositionTypeV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        PositionTypeV.setForeground(java.awt.Color.red);
        PositionTypeV.setText(" ");

        AddMakePayment.setBackground(new java.awt.Color(0, 153, 204));
        AddMakePayment.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddMakePayment.setForeground(new java.awt.Color(255, 255, 255));
        AddMakePayment.setText("Add");
        AddMakePayment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddMakePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMakePaymentActionPerformed(evt);
            }
        });

        UpdateMakePayment.setBackground(new java.awt.Color(0, 153, 204));
        UpdateMakePayment.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UpdateMakePayment.setForeground(new java.awt.Color(255, 255, 255));
        UpdateMakePayment.setText("Update");
        UpdateMakePayment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UpdateMakePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateMakePaymentActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EMIDL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PIDL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PositionTypeB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AmountB)
                            .addComponent(AmountV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PositionTypeV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(AddMakePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(UpdateMakePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(EMIDL))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(PIDL))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(PositionTypeB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(PositionTypeV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(AmountB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(AmountV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddMakePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateMakePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        BackL.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BackL.setForeground(new java.awt.Color(0, 153, 204));
        BackL.setText("< Back");
        BackL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackLMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 204));
        jLabel7.setText("                  (Paid Payment Step 01 & 02)");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)), "Step 04 - Settle payment of a umpire / scorer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 153, 204))); // NOI18N

        jScrollPane6.setBackground(new java.awt.Color(0, 153, 204));
        jScrollPane6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));
        jScrollPane6.setForeground(new java.awt.Color(51, 51, 51));

        UmpireAllocationDetails.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        UmpireAllocationDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Umpire ID", "Payment Status", "Payment Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        UmpireAllocationDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UmpireAllocationDetails.setGridColor(new java.awt.Color(255, 255, 255));
        UmpireAllocationDetails.setSelectionBackground(new java.awt.Color(0, 153, 204));
        UmpireAllocationDetails.setShowHorizontalLines(false);
        UmpireAllocationDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UmpireAllocationDetailsMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(UmpireAllocationDetails);

        Settle.setBackground(new java.awt.Color(0, 153, 204));
        Settle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Settle.setForeground(new java.awt.Color(255, 255, 255));
        Settle.setText("Settle");
        Settle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Settle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettleActionPerformed(evt);
            }
        });

        jScrollPane5.setBackground(new java.awt.Color(0, 153, 204));
        jScrollPane5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));
        jScrollPane5.setForeground(new java.awt.Color(51, 51, 51));

        ScorerAllocationDetails.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ScorerAllocationDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Scorer ID", "Payment Status", "Payment Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScorerAllocationDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ScorerAllocationDetails.setGridColor(new java.awt.Color(255, 255, 255));
        ScorerAllocationDetails.setSelectionBackground(new java.awt.Color(0, 153, 204));
        ScorerAllocationDetails.setShowHorizontalLines(false);
        ScorerAllocationDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ScorerAllocationDetailsMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(ScorerAllocationDetails);

        UmpireDetailsV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        UmpireDetailsV.setForeground(new java.awt.Color(51, 51, 51));
        UmpireDetailsV.setText("Select an umpire to settle the payment.....");

        ScorerDetailsV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ScorerDetailsV.setForeground(new java.awt.Color(51, 51, 51));
        ScorerDetailsV.setText("Select a scorer to settle the payment.....");

        DetailV.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DetailV.setForeground(new java.awt.Color(0, 153, 204));
        DetailV.setText(" ");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Match ID");

        SMIDL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SMIDL.setForeground(new java.awt.Color(51, 51, 51));
        SMIDL.setText("Match ID will appear here");

        IDNameL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        IDNameL.setForeground(new java.awt.Color(51, 51, 51));
        IDNameL.setText("ID");

        IDL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        IDL.setForeground(new java.awt.Color(51, 51, 51));
        IDL.setText("ID will appear here");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Name");

        NameL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NameL.setForeground(new java.awt.Color(51, 51, 51));
        NameL.setText("Name will appear here");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Position");

        PositionL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PositionL.setForeground(new java.awt.Color(51, 51, 51));
        PositionL.setText("Position will appear here");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setText("Payment Date");

        PaymentDateV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        PaymentDateV.setForeground(java.awt.Color.red);
        PaymentDateV.setText(" ");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setText("Payment");

        PaymentL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PaymentL.setForeground(new java.awt.Color(51, 51, 51));
        PaymentL.setText("Payment will appear here");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Payment Status");

        PaymentStatusL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PaymentStatusL.setForeground(new java.awt.Color(51, 51, 51));
        PaymentStatusL.setText("Payment status will appear here");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(UmpireDetailsV, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(ScorerDetailsV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(DetailV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IDNameL, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SMIDL, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IDL, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PaymentL, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(25, 25, 25)
                                .addComponent(PaymentStatusL, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(25, 25, 25)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PaymentDateB, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(PaymentDateV, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PositionL, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(NameL, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(Settle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UmpireDetailsV)
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(ScorerDetailsV)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DetailV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(12, 12, 12)
                                .addComponent(IDNameL))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(SMIDL)
                                .addGap(12, 12, 12)
                                .addComponent(IDL))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NameL)
                            .addComponent(jLabel6))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(PositionL))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel27)
                            .addComponent(PaymentDateB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(PaymentDateV)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PaymentL)
                            .addComponent(jLabel26))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(PaymentStatusL))
                        .addGap(18, 18, 18)
                        .addComponent(Settle, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(BackL))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(BackL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Add / UpdateRetailer");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackLMouseClicked
        Match m1 = new Match();
        int TID = m1.getTournamentID(Integer.parseInt(EMIDL.getText()));
        int MID = Integer.parseInt(EMIDL.getText());
        MakePayment01and02 AUA = new MakePayment01and02(Desktop,TID, MID);
        Desktop.add(AUA);
        this.dispose();
        AUA.setVisible(true);
    }//GEN-LAST:event_BackLMouseClicked

    private void ScorerAllocationDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScorerAllocationDetailsMouseClicked
        PaymentDateB.setDate(null);
        settlePaymentDetailValidationReset();
        UmpireAllocationDetails.getSelectionModel().clearSelection();
        DetailV.setText("Scorer Payment Details");
        int row = ScorerAllocationDetails.getSelectedRow();
        
        setIDNameLabel("Scorer ID");
        setIDLabel(ScorerAllocationDetails.getValueAt(row, 0).toString());
        
        
        Scorer s1 = new Scorer();
        s1.getScorerNamePayment(Integer.parseInt(IDL.getText()), Integer.parseInt(SMIDL.getText()), NameL, PaymentL);
        
        setPositionLabel("Scorer");
        
        String ps = ScorerAllocationDetails.getValueAt(row, 1).toString();
        if(ps.equals("Not Settled")){
            PaymentStatusL.setForeground(Color.red);
        }else{
            PaymentStatusL.setForeground(Color.GREEN);
        }
        setPaymentStatusLabel(ScorerAllocationDetails.getValueAt(row, 1).toString());
        
        String d = ScorerAllocationDetails.getValueAt(row, 2).toString();
        if(d.equals("N/A")){
            
        }else{
            Function f = new Function();
            setDateBox(f.getDate(d)); 
        }
    }//GEN-LAST:event_ScorerAllocationDetailsMouseClicked

    private void PaidPaymentDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaidPaymentDetailsMouseClicked
        makePaymentDetailValidationReset();
        
        int row = PaidPaymentDetails.getSelectedRow();
        
        setPaymentIDLabel(PaidPaymentDetails.getValueAt(row, 0).toString());
        setPositionTypeBox(PaidPaymentDetails.getValueAt(row, 1).toString());
        setAmountBox(PaidPaymentDetails.getValueAt(row, 2).toString());
        
    }//GEN-LAST:event_PaidPaymentDetailsMouseClicked

    private void UmpireAllocationDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UmpireAllocationDetailsMouseClicked
        PaymentDateB.setDate(null);
        settlePaymentDetailValidationReset();
        ScorerAllocationDetails.getSelectionModel().clearSelection();
        DetailV.setText("Umpire Payment Details");
        int row = UmpireAllocationDetails.getSelectedRow();
        
        setIDNameLabel("Umpire ID");
        setIDLabel(UmpireAllocationDetails.getValueAt(row, 0).toString());
        
        Umpire u1 = new Umpire();
        u1.getUmpireNamePositionPayment(Integer.parseInt(IDL.getText()), Integer.parseInt(SMIDL.getText()), NameL, PositionL, PaymentL);
        
        String ps = UmpireAllocationDetails.getValueAt(row, 1).toString();
        if(ps.equals("Not Settled")){
            PaymentStatusL.setForeground(Color.red);
        }else{
            PaymentStatusL.setForeground(Color.GREEN);
        }
        setPaymentStatusLabel(UmpireAllocationDetails.getValueAt(row, 1).toString());
        
        String d = UmpireAllocationDetails.getValueAt(row, 2).toString();
        if(d.equals("N/A")){
            
        }else{
            Function f = new Function();
            setDateBox(f.getDate(UmpireAllocationDetails.getValueAt(row, 2).toString())); 
        }
            
    }//GEN-LAST:event_UmpireAllocationDetailsMouseClicked

    private void SettleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettleActionPerformed
        settlePaymentDetailValidationReset();
        
        if(IDL.getText().equals("ID will appear here")||PaymentDateB.getDate()==null){
            if(IDL.getText().equals("ID will appear here")){
                
                JOptionPane.showMessageDialog(null, "Select a umpire or a scorer first! ");
                
                UmpireDetailsV.setForeground(Color.red);
                ScorerDetailsV.setForeground(Color.red);
                UmpireDetailsV.setText("*Select an umpire for payment settlement");
                ScorerDetailsV.setText("*Select a scorer for payment settlement");
            
            }else{
                
                JOptionPane.showMessageDialog(null, "Incomplete details of a payment settlement exsist! ");
            
                if(PaymentDateB.getDate()==null){
                    PaymentDateV.setText("*Enter date");
                }
            }
            
        }else{
            SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
            MakePayment mp1 = new MakePayment();
            
            if(IDNameL.getText().equals("Umpire ID")){
                mp1.updateMakePaymentStatus(0 , formatDate.format(PaymentDateB.getDate()), Integer.parseInt(IDL.getText()), Integer.parseInt(SMIDL.getText()), PaymentStatusL);
                Umpire u = new Umpire(UmpireAllocationDetails);
                u.umpireMakePaymentTableLoad(Integer.parseInt(SMIDL.getText()));
            }else{
                mp1.updateMakePaymentStatus(1 , formatDate.format(PaymentDateB.getDate()), Integer.parseInt(IDL.getText()), Integer.parseInt(SMIDL.getText()), PaymentStatusL);
                Scorer s = new Scorer(ScorerAllocationDetails);
                s.scorerMakePaymentTableLoad(Integer.parseInt(SMIDL.getText()));
            }
            JOptionPane.showMessageDialog(null, "Payment settled successfully! ");
        }
        
    
        
    
    }//GEN-LAST:event_SettleActionPerformed

    private void AddMakePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMakePaymentActionPerformed
        makePaymentDetailValidationReset();
        boolean Amount;
        
        if(AmountB.getText().equals("")){
            Amount = true;
        }else{
            Validation v = new Validation();
            Amount = v.accountNoValidation(AmountB.getText());
        }
        
        if(PositionTypeB.getSelectedItem() == "Select the position" || AmountB.getText().equals("") || Amount == false){
            JOptionPane.showMessageDialog(null, "Incomplete or invalid make payment details exsist! ");
            
            if(PositionTypeB.getSelectedItem() == "Select the position" ){
                PositionTypeV.setText("*Enter position");
            }
            
            if(AmountB.getText().equals("")){
                AmountV.setText("*Enter Amount");
            }else if(Amount == false){
                AmountV.setText("*Invalid Amount");
            }
        }else{
            MakePayment mp1 = new MakePayment(Integer.parseInt(EMIDL.getText()), PositionTypeB.getSelectedItem().toString(), Integer.parseInt(AmountB.getText()));
            
            if(mp1.checkPosition()){
                 mp1.addMakePayment();
                setPaymentIDLabel(Integer.toString(mp1.getMakePaymentID()));
        
                MakePayment mp = new MakePayment(PaidPaymentDetails);
                mp.MakePaymentTableLoad(Integer.parseInt(EMIDL.getText()));
        
                JOptionPane.showMessageDialog(null, "Make payment details added successfully! ");
    
            }else{
                JOptionPane.showMessageDialog(null, "Already added make payment details for '"+PositionTypeB.getSelectedItem().toString()+"'");
            }
            
           
        }
        
    }//GEN-LAST:event_AddMakePaymentActionPerformed

    private void UpdateMakePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateMakePaymentActionPerformed
        makePaymentDetailValidationReset();
        boolean Amount;
        
        if(AmountB.getText().equals("")){
            Amount = true;
        }else{
            Validation v = new Validation();
            Amount = v.accountNoValidation(AmountB.getText());
        }
        
        if(PIDL.getText().equals("Payment ID will assign automatically") || PositionTypeB.getSelectedItem() == "Select the position" || AmountB.getText().equals("") || Amount == false){
            if(PIDL.getText().equals("Payment ID will assign automatically")){
                JOptionPane.showMessageDialog(null, "Select make payment details first! ");
            }else{
                JOptionPane.showMessageDialog(null, "Incomplete or invalid make payment details exsist! ");
            }
            
            if(PositionTypeB.getSelectedItem() == "Select the position" ){
                PositionTypeV.setText("*Enter position");
            }
            
            if(AmountB.getText().equals("")){
                AmountV.setText("*Enter Amount");
            }else if(Amount == false){
                AmountV.setText("*Invalid Amount");
            }
        }else{
            MakePayment mp1 = new MakePayment(Integer.parseInt(EMIDL.getText()), Integer.parseInt(PIDL.getText()), PositionTypeB.getSelectedItem().toString(), Integer.parseInt(AmountB.getText()));
            
            if(mp1.checkPosition()){
                mp1.updateMakePayment();
        
                MakePayment mp = new MakePayment(PaidPaymentDetails);
                mp.MakePaymentTableLoad(Integer.parseInt(EMIDL.getText()));
        
                JOptionPane.showMessageDialog(null, "Make payment details updated successfully! ");
            }else{
                JOptionPane.showMessageDialog(null, "Already added make payment details for '"+PositionTypeB.getSelectedItem().toString()+"'");
            }
            
    
        }
        

    }//GEN-LAST:event_UpdateMakePaymentActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        makePaymentDetailReset();
        makePaymentDetailValidationReset();
    }//GEN-LAST:event_ClearActionPerformed

    private void AmountBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AmountBMouseClicked
        setAmountBox(null);
    }//GEN-LAST:event_AmountBMouseClicked

    public void makePaymentDetailValidationReset(){
        PositionTypeV.setText(" ");
        AmountV.setText(" ");
    }
    
    public void makePaymentDetailReset(){
        setPaymentIDLabel("Payment ID will assign automatically");
        setPositionTypeBox("Select the position");
        setAmountBox("");
    }
    
    public void settlePaymentDetailValidationReset(){
        PaymentDateV.setText(" ");
        UmpireDetailsV.setForeground(Color.darkGray);
        UmpireDetailsV.setText("Select an umpire to settle the payment.....");
        ScorerDetailsV.setForeground(Color.darkGray);
        ScorerDetailsV.setText("Select a scorer to settle the payment.....");
        
    }
    
    String MatchID;  
    JDesktopPane Desktop;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddMakePayment;
    private javax.swing.JTextField AmountB;
    private javax.swing.JLabel AmountV;
    private javax.swing.JLabel BackL;
    private javax.swing.JButton Clear;
    private javax.swing.JLabel DetailV;
    private javax.swing.JLabel EMIDL;
    private javax.swing.JLabel IDL;
    private javax.swing.JLabel IDNameL;
    private javax.swing.JLabel NameL;
    private javax.swing.JLabel PIDL;
    private javax.swing.JTable PaidPaymentDetails;
    private com.toedter.calendar.JDateChooser PaymentDateB;
    private javax.swing.JLabel PaymentDateV;
    private javax.swing.JLabel PaymentL;
    private javax.swing.JLabel PaymentStatusL;
    private javax.swing.JLabel PositionL;
    private javax.swing.JComboBox<String> PositionTypeB;
    private javax.swing.JLabel PositionTypeV;
    private javax.swing.JLabel SMIDL;
    private javax.swing.JTable ScorerAllocationDetails;
    private javax.swing.JLabel ScorerDetailsV;
    private javax.swing.JButton Settle;
    private javax.swing.JTable UmpireAllocationDetails;
    private javax.swing.JLabel UmpireDetailsV;
    private javax.swing.JButton UpdateMakePayment;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    // End of variables declaration//GEN-END:variables
}
