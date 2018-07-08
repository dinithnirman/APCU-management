
package GUI.Internal.User;
import Class.Function;
import Class.Match;
import Class.Tournament;
import java.awt.event.MouseListener;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class MakeUpdateAssignments01and02 extends javax.swing.JInternalFrame {
    
    
    
    public MakeUpdateAssignments01and02(JDesktopPane pDesktop,int TID, int MID) {
        initComponents();
        nonMove();
        tableNonMove();
        this.Desktop = pDesktop;
        Tournament t = new Tournament(TournamentDetails);
        t.tournamentTableLoadAssignment();
        
        if(TID!=0){
            t.viewAMBackTournamentDetails(TID, TIDL, NameL, StartDateL, EndDateL, ContactPersonL, DateL, DateL, PaymentStatusL, TotalAmountL);
        }
        if(MID!=0){
            Match m1 = new Match();
            m1.viewAMMatchDetails(TID, MIDL, MatchTypeL, BallTypeL, DateL, TimeL, LocationTypeL, GroundL);
            DescriptionL.setText(m1.getDescription(MID));
        }
        
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
        TournamentDetails.getTableHeader().setReorderingAllowed(false);
        MatchDetails.getTableHeader().setReorderingAllowed(false);
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
        PaymentStatusL.setText(pPaymentStatusLabel);
    }
    
    public void setTotalAmountLabel(String pTotalAmountLabel){
        TotalAmountL.setText(pTotalAmountLabel);
    }
    
    public void setMatchIDLabel(String pMatchIDLabel){
        MIDL.setText(pMatchIDLabel);
    }
    
    public void setMatchTypeLabel(String pMatchTypeLabel){
        MatchTypeL.setText(pMatchTypeLabel);
    }
    
    public void setBallTypeLabel(String pBallTypeLabel){
        BallTypeL.setText(pBallTypeLabel);
    }
    
    public void setDateLabel(String pDateLabel){
        DateL.setText(pDateLabel);
    }
    
    public void setTimeLabel(String pTimeLabel){
        TimeL.setText(pTimeLabel);
    }
    
    public void setLocationTypeLabel(String pLocationTypeLabel){
        LocationTypeL.setText(pLocationTypeLabel);
    }
    
    public void setGroundLabel(String pGroundLabel){
        GroundL.setText(pGroundLabel);
    }
    
    public void setDescriptionLabel(String pDescriptionLabel){
        DescriptionL.setText(pDescriptionLabel);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
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
        NextL = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        MIDL = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        MatchTypeL = new javax.swing.JLabel();
        BallTypeL = new javax.swing.JLabel();
        DateL = new javax.swing.JLabel();
        TimeL = new javax.swing.JLabel();
        LocationTypeL = new javax.swing.JLabel();
        GroundL = new javax.swing.JLabel();
        DescriptionL = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        MatchDetails = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        SearchTypeV = new javax.swing.JLabel();
        Reset = new javax.swing.JButton();
        SearchTypeB = new javax.swing.JComboBox<String>();
        SearchKeyB = new javax.swing.JTextField();
        SearchKeyV = new javax.swing.JLabel();
        Search = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setTitle(" Make / Update Assignments");
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel11.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Manage Assignments >");

        jLabel12.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Make / Update Assignments >");

        jLabel15.setFont(new java.awt.Font("Calibri Light", 0, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Step 01 & 02");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15))
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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ContactPersonL, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(StartDateL, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TIDL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TotalAmountL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(EndDateL, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NameL, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PaymentStatusL, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(20, Short.MAX_VALUE))
        );

        NextL.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        NextL.setForeground(new java.awt.Color(0, 153, 204));
        NextL.setText("Next >");
        NextL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NextL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NextLMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 204));
        jLabel7.setText("(Make / Update Assignments Step 03)");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)), "Step 02 - Select a match", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 153, 204))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Location Type");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Description");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Date");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Time");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Match ID");

        MIDL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MIDL.setForeground(new java.awt.Color(51, 51, 51));
        MIDL.setText("Match ID will appear here");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Match Type");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Ball Type");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Ground");

        MatchTypeL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MatchTypeL.setForeground(new java.awt.Color(51, 51, 51));
        MatchTypeL.setText("Match type will appear here");

        BallTypeL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BallTypeL.setForeground(new java.awt.Color(51, 51, 51));
        BallTypeL.setText("Ball type will appear here");

        DateL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DateL.setForeground(new java.awt.Color(51, 51, 51));
        DateL.setText("Date will appear here");

        TimeL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TimeL.setForeground(new java.awt.Color(51, 51, 51));
        TimeL.setText("Time will appear here");

        LocationTypeL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LocationTypeL.setForeground(new java.awt.Color(51, 51, 51));
        LocationTypeL.setText("Location type will appear here");

        GroundL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        GroundL.setForeground(new java.awt.Color(51, 51, 51));
        GroundL.setText("Ground will appear here");

        DescriptionL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DescriptionL.setForeground(new java.awt.Color(51, 51, 51));
        DescriptionL.setText("Description will appear here");

        jScrollPane2.setBackground(new java.awt.Color(0, 153, 204));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));
        jScrollPane2.setForeground(new java.awt.Color(51, 51, 51));

        MatchDetails.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        MatchDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Match ID", "Match Type", "Ball Type", "Date", "Time", "Location Type", "Ground ID", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        MatchDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MatchDetails.setGridColor(new java.awt.Color(255, 255, 255));
        MatchDetails.setSelectionBackground(new java.awt.Color(0, 153, 204));
        MatchDetails.setShowHorizontalLines(false);
        MatchDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MatchDetailsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(MatchDetails);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(DescriptionL, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(BallTypeL, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(DateL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LocationTypeL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(MIDL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GroundL, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(MatchTypeL, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                .addComponent(TimeL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(MIDL)
                    .addComponent(jLabel18)
                    .addComponent(MatchTypeL))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(DateL)
                    .addComponent(jLabel16)
                    .addComponent(TimeL))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(LocationTypeL)
                    .addComponent(jLabel20)
                    .addComponent(GroundL))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 20, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(DescriptionL))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(BallTypeL))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)), "Search Tournament", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 153, 204))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("Search by");

        SearchTypeV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        SearchTypeV.setForeground(new java.awt.Color(255, 0, 0));
        SearchTypeV.setText(" ");

        Reset.setBackground(new java.awt.Color(0, 153, 204));
        Reset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Reset.setForeground(new java.awt.Color(255, 255, 255));
        Reset.setText("Reset");
        Reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(SearchKeyV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SearchTypeV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SearchKeyB)
                    .addComponent(SearchTypeB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(SearchTypeB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(SearchTypeV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchKeyB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(SearchKeyV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NextL)
                    .addComponent(jLabel7)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
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
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(NextL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Add / UpdateRetailer");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TournamentDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TournamentDetailsMouseClicked
        clearFormMatch();
        
        Function f = new Function();
        f.clearTable(MatchDetails);
        
        int row = TournamentDetails.getSelectedRow();
        
        setTournamentIDLabel(TournamentDetails.getValueAt(row, 0).toString());
        setNameLabel(TournamentDetails.getValueAt(row, 1).toString());
        setStartDateLabel(TournamentDetails.getValueAt(row, 2).toString());
        setEndDateLabel(TournamentDetails.getValueAt(row, 3).toString());
        setContactPersonLabel(TournamentDetails.getValueAt(row, 4).toString());
        setTotalAmountLabel(TournamentDetails.getValueAt(row, 5).toString()); 
        setPaymentStatusLabel(TournamentDetails.getValueAt(row, 6).toString());
        
        Match m = new Match(MatchDetails);
        m.matchTableLoadAssigment(Integer.parseInt(TournamentDetails.getValueAt(row, 0).toString()));
      
    }//GEN-LAST:event_TournamentDetailsMouseClicked

    private void NextLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextLMouseClicked
        if(TIDL.getText()=="Tournament ID will appear here" || MIDL.getText()=="Match ID will appear here"){
            if(TIDL.getText()=="Tournament ID will appear here" && MIDL.getText()=="Match ID will appear here"){
                JOptionPane.showMessageDialog(null, "Select a tournament first and then a match detail record!");
            }else{
                JOptionPane.showMessageDialog(null, "Select a match detail record!");
            }
        }else{
            int input = JOptionPane.showConfirmDialog(null, "Are you sure that you want to manage allocation of Match ID = '"+MIDL.getText()+"'");
            
            if(input==0){
                MakeUpdateAssignments03 MUA = new MakeUpdateAssignments03(Desktop,MIDL.getText(), DateL.getText());
                Desktop.add(MUA);
                this.dispose();
                MUA.setVisible(true);
            }
        }
        
        
    }//GEN-LAST:event_NextLMouseClicked

    private void MatchDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MatchDetailsMouseClicked
        int row = MatchDetails.getSelectedRow();
        
        setMatchIDLabel(MatchDetails.getValueAt(row, 0).toString());
        setMatchTypeLabel(MatchDetails.getValueAt(row, 1).toString());
        setBallTypeLabel(MatchDetails.getValueAt(row, 2).toString());
        setDateLabel(MatchDetails.getValueAt(row, 3).toString());
        setTimeLabel(MatchDetails.getValueAt(row, 4).toString());
        setLocationTypeLabel(MatchDetails.getValueAt(row, 5).toString());
        
        int GroundID =Integer.parseInt(MatchDetails.getValueAt(row, 6).toString());
        Match match1 = new Match();
        setGroundLabel(match1.getGroundName(GroundID));
        
        setDescriptionLabel(MatchDetails.getValueAt(row, 7).toString());
    
    }//GEN-LAST:event_MatchDetailsMouseClicked

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        SearchTypeB.setSelectedItem("Select the search type");
        SearchKeyB.setText("");
        clearSearchValidation();

        Tournament t = new Tournament(TournamentDetails);
        t.tournamentTableLoadAssignment();
        
        clearForm();
        clearFormMatch();
            
        MatchDetails.getSelectionModel().clearSelection();
            
        Function f = new Function();
        f.clearTable(MatchDetails);

    }//GEN-LAST:event_ResetActionPerformed

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
            clearForm();
            clearFormMatch();
            
            MatchDetails.getSelectionModel().clearSelection();
            
            Function f = new Function();
            f.clearTable(MatchDetails);

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
    public void clearForm(){
        
        setTournamentIDLabel("Tournament ID will appear here");
        setNameLabel("Name will appear here");
        setStartDateLabel("Start date will appear here");
        setEndDateLabel("End date will appear here");
        setContactPersonLabel("Contact person will appear here");
        setTotalAmountLabel("Total amount will appear here"); 
        setPaymentStatusLabel("Payment status will appear here");
    }
   
    public void clearFormMatch(){
        
        setMatchIDLabel("Match ID will appear here");
        setMatchTypeLabel("Match type will appear here");
        setBallTypeLabel("Ball type will appear here");
        setDateLabel("Date will appear here");
        setTimeLabel("Time will appear here");
        setLocationTypeLabel("Location type will appear here");
        setGroundLabel("Ground will appear here");
        setDescriptionLabel("Description will appear here");
    }
   
    //Clear validation in search form
    public void clearSearchValidation(){
            SearchTypeV.setText(" ");
            SearchKeyV.setText(" ");
    }
    
    char TP1, TP2, EndDate, StartDate;
    String Result;  
    JDesktopPane Desktop;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BallTypeL;
    private javax.swing.JLabel ContactPersonL;
    private javax.swing.JLabel DateL;
    private javax.swing.JLabel DescriptionL;
    private javax.swing.JLabel EndDateL;
    private javax.swing.JLabel GroundL;
    private javax.swing.JLabel LocationTypeL;
    private javax.swing.JLabel MIDL;
    private javax.swing.JTable MatchDetails;
    private javax.swing.JLabel MatchTypeL;
    private javax.swing.JLabel NameL;
    private javax.swing.JLabel NextL;
    private javax.swing.JLabel PaymentStatusL;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Search;
    private javax.swing.JTextField SearchKeyB;
    private javax.swing.JLabel SearchKeyV;
    private javax.swing.JComboBox<String> SearchTypeB;
    private javax.swing.JLabel SearchTypeV;
    private javax.swing.JLabel StartDateL;
    private javax.swing.JLabel TIDL;
    private javax.swing.JLabel TimeL;
    private javax.swing.JLabel TotalAmountL;
    private javax.swing.JTable TournamentDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
