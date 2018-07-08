
package GUI.Internal.User;
import Class.Match;
import Class.Scorer;
import Class.Tournament;
import Class.Umpire;
import GUI.Internal.User.MakeUpdateAssignments01and02;
import java.awt.Color;
import java.awt.event.MouseListener;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class MakeUpdateAssignments03 extends javax.swing.JInternalFrame {
    
    
    
    public MakeUpdateAssignments03(JDesktopPane pDesktop, String pMatchID, String pDate) {
        initComponents();
        nonMove();
        tableNonMove();
        Umpire u = new Umpire(UmpireDetails);
        u.umpireAllocationTableLoad(0);
       
        Scorer s = new Scorer(ScorerDetails);
        s.scorerAllocationTableLoad(0);
        
        this.Desktop = pDesktop;
        this.Date = pDate;
        UMIDL.setText(pMatchID);
        SMIDL.setText(pMatchID);
        
        Umpire u1 = new Umpire(UmpireAllocationDetails);
        u1.umpireAllocationTableLoad(Integer.parseInt(UMIDL.getText()));
        
        Scorer s1 = new Scorer(ScorerAllocationDetails);
        s1.scorerAllocationTableLoad(Integer.parseInt(SMIDL.getText()));

        
        
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
        UmpireDetails.getTableHeader().setReorderingAllowed(false);
        UmpireAllocationDetails.getTableHeader().setReorderingAllowed(false);
        ScorerAllocationDetails.getTableHeader().setReorderingAllowed(false);
        ScorerDetails.getTableHeader().setReorderingAllowed(false);
    }
    //setters
    public void setUmpireMatchIDLabel(String pUmpireMatchIDLabel){
        UMIDL.setText(pUmpireMatchIDLabel);
    }
    
    public void setUmpireIDLabel(String pUmpireIDLabel){
        UmpireIDL.setText(pUmpireIDLabel);
    }
    
    public void setUmpireNameLabel(String pUmpireNameLabel){
        UNameL.setText(pUmpireNameLabel);
    }
    
    public void setGradeLabel(String pGradeLabel){
        GradeL.setText(pGradeLabel);
    }
    
    public void setUmpireTypeBox(String pUmpireTypeBox){
        UmpireTypeB.setSelectedItem(pUmpireTypeBox);
    }
    
    public void setScorerMatchIDLabel(String pUmpireMatchIDLabel){
        SMIDL.setText(pUmpireMatchIDLabel);
    }
    
    public void setScorerIDLabel(String pScorerIDLabel){
        ScorerIDL.setText(pScorerIDLabel);
    }
    
    public void setScorerNameLabel(String pScorerNameLabel){
        SNameL.setText(pScorerNameLabel);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        UmpireDetails = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        UmpireAllocationDetails = new javax.swing.JTable();
        Allocate = new javax.swing.JButton();
        Deallocate = new javax.swing.JButton();
        UDetails = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        UMIDL = new javax.swing.JLabel();
        UmpireIDL = new javax.swing.JLabel();
        GradeL = new javax.swing.JLabel();
        UNameL = new javax.swing.JLabel();
        UmpireTypeB = new javax.swing.JComboBox<String>();
        UmpireTypeV = new javax.swing.JLabel();
        Update = new javax.swing.JButton();
        UmpireDetailV = new javax.swing.JLabel();
        UmpireAllocateV = new javax.swing.JLabel();
        BackL = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ScorerDetails = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        ScorerAllocationDetails = new javax.swing.JTable();
        Allocate1 = new javax.swing.JButton();
        Deallocate1 = new javax.swing.JButton();
        SDetails = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        SMIDL = new javax.swing.JLabel();
        ScorerIDL = new javax.swing.JLabel();
        SNameL = new javax.swing.JLabel();
        ScorerDetailV = new javax.swing.JLabel();
        ScorerAllocateV = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        SearchTypeV = new javax.swing.JLabel();
        Reset = new javax.swing.JButton();
        SearchTypeB = new javax.swing.JComboBox<String>();
        SearchKeyB = new javax.swing.JTextField();
        SearchKeyV = new javax.swing.JLabel();
        Search = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        TableTypeB = new javax.swing.JComboBox<String>();
        TableTypeV = new javax.swing.JLabel();

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

        jLabel15.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Step 01 & 02 >");

        jLabel21.setFont(new java.awt.Font("Calibri Light", 0, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Step 03");

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
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)), "Step 03 - Allocate or Deallocate umpire / update umpire allocation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 153, 204))); // NOI18N

        jScrollPane1.setBackground(new java.awt.Color(0, 153, 204));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));
        jScrollPane1.setForeground(new java.awt.Color(51, 51, 51));

        UmpireDetails.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        UmpireDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Umpire ID", "Grade", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        UmpireDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UmpireDetails.setGridColor(new java.awt.Color(255, 255, 255));
        UmpireDetails.setSelectionBackground(new java.awt.Color(0, 153, 204));
        UmpireDetails.setShowHorizontalLines(false);
        UmpireDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UmpireDetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(UmpireDetails);

        jScrollPane3.setBackground(new java.awt.Color(0, 153, 204));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));
        jScrollPane3.setForeground(new java.awt.Color(51, 51, 51));

        UmpireAllocationDetails.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        UmpireAllocationDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Umpire ID", "UmpireType", "PaymentStatus"
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
        jScrollPane3.setViewportView(UmpireAllocationDetails);

        Allocate.setBackground(new java.awt.Color(0, 153, 204));
        Allocate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Allocate.setForeground(new java.awt.Color(255, 255, 255));
        Allocate.setText("Allocate");
        Allocate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Allocate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllocateActionPerformed(evt);
            }
        });

        Deallocate.setBackground(new java.awt.Color(0, 153, 204));
        Deallocate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Deallocate.setForeground(new java.awt.Color(255, 255, 255));
        Deallocate.setText("Deallocate");
        Deallocate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Deallocate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeallocateActionPerformed(evt);
            }
        });

        UDetails.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        UDetails.setForeground(new java.awt.Color(0, 153, 204));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Match ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Umpire ID");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Grade");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Umpire Type");

        UMIDL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        UMIDL.setForeground(new java.awt.Color(51, 51, 51));
        UMIDL.setText("Match ID will appear here");

        UmpireIDL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        UmpireIDL.setForeground(new java.awt.Color(51, 51, 51));
        UmpireIDL.setText("Umpire ID will appear here");

        GradeL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        GradeL.setForeground(new java.awt.Color(51, 51, 51));
        GradeL.setText("Grade will appear here");

        UNameL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        UNameL.setForeground(new java.awt.Color(51, 51, 51));
        UNameL.setText("Name will appear here");

        UmpireTypeB.setBackground(new java.awt.Color(0, 153, 204));
        UmpireTypeB.setForeground(new java.awt.Color(255, 255, 255));
        UmpireTypeB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select the umpire type", "Umpire", "Third Umpire", "Standby Umpire" }));
        UmpireTypeB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        UmpireTypeV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        UmpireTypeV.setText(" ");

        Update.setBackground(new java.awt.Color(0, 153, 204));
        Update.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Update.setForeground(new java.awt.Color(255, 255, 255));
        Update.setText("Update");
        Update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        UmpireDetailV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        UmpireDetailV.setForeground(new java.awt.Color(51, 51, 51));
        UmpireDetailV.setText("Select for an umpire allocation....");

        UmpireAllocateV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        UmpireAllocateV.setForeground(new java.awt.Color(51, 51, 51));
        UmpireAllocateV.setText("Select for an umpire deallocation or update.....");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(UmpireIDL, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addComponent(UMIDL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(GradeL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(UmpireTypeV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(UNameL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(UmpireTypeB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(UDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UmpireDetailV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UmpireAllocateV, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(Allocate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(Deallocate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(UmpireDetailV)
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(UmpireAllocateV)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Deallocate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Allocate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(UDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(UMIDL))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(UmpireIDL))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GradeL)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UNameL)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(UmpireTypeB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(UmpireTypeV)
                        .addGap(0, 0, Short.MAX_VALUE))))
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
        jLabel7.setText("(Make payment Step 01 & 02)");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)), "Step 03 - Allocate or deallocate scorer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 153, 204))); // NOI18N

        jScrollPane4.setBackground(new java.awt.Color(0, 153, 204));
        jScrollPane4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));
        jScrollPane4.setForeground(new java.awt.Color(51, 51, 51));

        ScorerDetails.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ScorerDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Scorer ID", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScorerDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ScorerDetails.setGridColor(new java.awt.Color(255, 255, 255));
        ScorerDetails.setSelectionBackground(new java.awt.Color(0, 153, 204));
        ScorerDetails.setShowHorizontalLines(false);
        ScorerDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ScorerDetailsMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(ScorerDetails);

        jScrollPane5.setBackground(new java.awt.Color(0, 153, 204));
        jScrollPane5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));
        jScrollPane5.setForeground(new java.awt.Color(51, 51, 51));

        ScorerAllocationDetails.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ScorerAllocationDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Scorer ID", "PaymentStatus"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
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

        Allocate1.setBackground(new java.awt.Color(0, 153, 204));
        Allocate1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Allocate1.setForeground(new java.awt.Color(255, 255, 255));
        Allocate1.setText("Allocate");
        Allocate1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Allocate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Allocate1ActionPerformed(evt);
            }
        });

        Deallocate1.setBackground(new java.awt.Color(0, 153, 204));
        Deallocate1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Deallocate1.setForeground(new java.awt.Color(255, 255, 255));
        Deallocate1.setText("Deallocate");
        Deallocate1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Deallocate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Deallocate1ActionPerformed(evt);
            }
        });

        SDetails.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SDetails.setForeground(new java.awt.Color(0, 153, 204));
        SDetails.setText(" ");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Match ID");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("Scorer ID");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("Name");

        SMIDL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SMIDL.setForeground(new java.awt.Color(51, 51, 51));
        SMIDL.setText("Match ID will appear here");

        ScorerIDL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ScorerIDL.setForeground(new java.awt.Color(51, 51, 51));
        ScorerIDL.setText("Scorer ID will appear here");

        SNameL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SNameL.setForeground(new java.awt.Color(51, 51, 51));
        SNameL.setText("Name will appear here");

        ScorerDetailV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ScorerDetailV.setForeground(new java.awt.Color(51, 51, 51));
        ScorerDetailV.setText("Select scorer for allocation.....");

        ScorerAllocateV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ScorerAllocateV.setForeground(new java.awt.Color(51, 51, 51));
        ScorerAllocateV.setText("Select scorer for deallocation.....");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SDetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(SNameL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ScorerIDL, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                            .addComponent(SMIDL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Allocate1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(Deallocate1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScorerAllocateV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ScorerDetailV, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(SDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(SMIDL))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(ScorerIDL))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(SNameL))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Deallocate1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Allocate1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(ScorerDetailV)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ScorerAllocateV)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)), "Search Umpire / Scorer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 153, 204))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Search by");

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
        SearchTypeB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select the search type", "Umpire ID", "Umpire Name", "Grade", "Scorer ID", "Scorer Name" }));
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

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Table type");

        TableTypeB.setBackground(new java.awt.Color(0, 153, 204));
        TableTypeB.setForeground(new java.awt.Color(255, 255, 255));
        TableTypeB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select the table type", "Umpire", "Scorer" }));
        TableTypeB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        TableTypeV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TableTypeV.setForeground(new java.awt.Color(255, 0, 0));
        TableTypeV.setText(" ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TableTypeV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TableTypeB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(SearchTypeB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(TableTypeB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(TableTypeV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
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
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 690, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 690, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BackL, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(157, 157, 157))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BackL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );

        getAccessibleContext().setAccessibleName("Add / UpdateRetailer");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackLMouseClicked
        Match m1 = new Match();
        int TID = m1.getTournamentID(Integer.parseInt(UMIDL.getText()));
        int MID = Integer.parseInt(UMIDL.getText());
        MakeUpdateAssignments01and02 AUA = new MakeUpdateAssignments01and02(Desktop,TID, MID);
        Desktop.add(AUA);
        this.dispose();
        AUA.setVisible(true);
    }//GEN-LAST:event_BackLMouseClicked

    private void ScorerDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScorerDetailsMouseClicked
        scorerDetailValidationReset();
        int row = ScorerDetails.getSelectedRow();
        ScorerAllocationDetails.getSelectionModel().clearSelection();
        SDetails.setText("Scorer Details");
        setScorerIDLabel(ScorerDetails.getValueAt(row, 0).toString());
        setScorerNameLabel(ScorerDetails.getValueAt(row, 1).toString());
        
    }//GEN-LAST:event_ScorerDetailsMouseClicked

    private void ScorerAllocationDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScorerAllocationDetailsMouseClicked
        scorerDetailValidationReset();
        int row = ScorerAllocationDetails.getSelectedRow();
        ScorerDetails.getSelectionModel().clearSelection();
        SDetails.setText("Scorer Allocation Details");
        setScorerIDLabel(ScorerAllocationDetails.getValueAt(row, 0).toString());
        Scorer s = new Scorer();
        s.getScorerName(Integer.parseInt(ScorerAllocationDetails.getValueAt(row, 0).toString()), SNameL);
    }//GEN-LAST:event_ScorerAllocationDetailsMouseClicked

    private void Allocate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Allocate1ActionPerformed
        scorerDetailValidationReset();
        Scorer s2 = new Scorer();
        boolean checkScorer = false, checkDate = false;
        
        if(SDetails.getText().equals("Scorer Details")){
            checkScorer = s2.cheackScorerAllocation(Integer.parseInt(ScorerIDL.getText()), Integer.parseInt(SMIDL.getText()));
            checkDate = s2.cheackScorerAllocationDate(Integer.parseInt(ScorerIDL.getText()), Date);
         
        }
        
        if(SDetails.getText().equals(" ")||SDetails.getText().equals("Scorer Allocation Details")||checkScorer==true||checkDate==true){
            
            if( checkScorer==true ){
                JOptionPane.showMessageDialog(null, "Scorer already allocated to this match! ");
            }else if( checkDate==true ){
                JOptionPane.showMessageDialog(null, "Scorer already allocated to another match on this match's  date! ");
            }else{
                JOptionPane.showMessageDialog(null, "Incomplete or invalid details of an scorer allocation exsist! ");
                
                if(SDetails.getText().equals(" ")){
                    ScorerDetailV.setForeground(Color.red);
                    ScorerDetailV.setText("*Select for a scorer allocation");
                }
                if(SDetails.getText().equals("Scorer Allocation Details")){
                    ScorerDetailV.setForeground(Color.red);
                    ScorerDetailV.setText("*Select for a scorer allocation");
                }
            }
            
        }else{
            scorerDetailValidationReset();

            Scorer s = new Scorer(Integer.parseInt(ScorerIDL.getText()));
            s.allocateScorer(Integer.parseInt(SMIDL.getText()));

            Scorer s1 = new Scorer(ScorerAllocationDetails);
            s1.scorerAllocationTableLoad(Integer.parseInt(SMIDL.getText()));
            JOptionPane.showMessageDialog(null, "Scorer allocated successfully! ");
        }
    }//GEN-LAST:event_Allocate1ActionPerformed

    private void Deallocate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Deallocate1ActionPerformed
        scorerDetailValidationReset();
        
        if(SDetails.getText().equals(" ")||SDetails.getText().equals("Scorer Details")){
            
            JOptionPane.showMessageDialog(null, "Incomplete or invalid details of an scorer allocation exsist! ");
                
            if(SDetails.getText().equals(" ")){
                ScorerAllocateV.setForeground(Color.red);
                ScorerAllocateV.setText("*Select for a scorer deallocation");
            }
            if(SDetails.getText().equals("Scorer Details")){
                ScorerAllocateV.setForeground(Color.red);
                ScorerAllocateV.setText("*Select for a scorer deallocation");
            }
            
        }else{
            scorerDetailValidationReset();
            
            int input = JOptionPane.showConfirmDialog(null, "Are you sure that you want to deallocate Scorer ID = '"+ScorerIDL.getText()+"'?");
            
            if(input==0){
                Scorer s2 = new Scorer(Integer.parseInt(ScorerIDL.getText()));
                s2.deallocateScorer(Integer.parseInt(SMIDL.getText()));

                Scorer s1 = new Scorer(ScorerAllocationDetails);
                s1.scorerAllocationTableLoad(Integer.parseInt(SMIDL.getText()));
                JOptionPane.showMessageDialog(null, "Scorer deallocated successfully! ");
        
            }

        }
    }//GEN-LAST:event_Deallocate1ActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        umpireDetailValidationReset();
        if(UmpireTypeB.getSelectedItem() == "Select the umpire type" ||UDetails.getText().equals("")||UDetails.getText().equals("Umpire Details")){
            
            JOptionPane.showMessageDialog(null, "Incomplete or invalid details of an umpire allocation exsist! ");
            if(UmpireTypeB.getSelectedItem() == "Select the umpire type" ){
                UmpireTypeV.setForeground(Color.red);
                UmpireTypeV.setText("*Enter umpire type");
            }
            if(UDetails.getText().equals("")){
                UmpireAllocateV.setForeground(Color.red);
                UmpireAllocateV.setText("*Select for an umpire deallocation ");
            }
            if(UDetails.getText().equals("Umpire Details")){
                UmpireAllocateV.setForeground(Color.red);
                UmpireAllocateV.setText("*Select for an umpire deallocation ");
            }
            
        }else{
           
            umpireDetailValidationReset();
            
            int input = JOptionPane.showConfirmDialog(null, "Are you sure that you want to update allocation in Umpire ID = '"+UmpireIDL.getText()+"'?");
            
            if(input==0){
                
                Umpire u = new Umpire();
                u.updateUmpireAllocation(UmpireTypeB.getSelectedItem().toString(), Integer.parseInt(UmpireIDL.getText()), Integer.parseInt(UMIDL.getText()));
                
                Umpire u1 = new Umpire(UmpireAllocationDetails);
                u1.umpireAllocationTableLoad(Integer.parseInt(UMIDL.getText()));
                JOptionPane.showMessageDialog(null, "Umpire updated successfully! ");
                
            }
            
        }  
    }//GEN-LAST:event_UpdateActionPerformed

    private void DeallocateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeallocateActionPerformed
        umpireDetailValidationReset();
        if(UmpireTypeB.getSelectedItem() == "Select the umpire type" ||UDetails.getText().equals("")||UDetails.getText().equals("Umpire Details")){
            
            JOptionPane.showMessageDialog(null, "Incomplete or invalid details of an umpire allocation exsist! ");
                if(UmpireTypeB.getSelectedItem() == "Select the umpire type" ){
                    UmpireAllocateV.setForeground(Color.red);
                    UmpireAllocateV.setText("*Select for an umpire deallocation ");
                }
                if(UDetails.getText().equals("")){
                    UmpireAllocateV.setForeground(Color.red);
                    UmpireAllocateV.setText("*Select for an umpire deallocation ");
                }
                if(UDetails.getText().equals("Umpire Details")){
                    UmpireAllocateV.setForeground(Color.red);
                    UmpireAllocateV.setText("*Select for an umpire deallocation ");
                }
            
        }else{
            umpireDetailValidationReset();
            
            int input = JOptionPane.showConfirmDialog(null, "Are you sure that you want to deallocate Umpire ID = '"+UmpireIDL.getText()+"'?");
            
            if(input==0){
                Umpire u = new Umpire();
                u.deallocateUmpire(Integer.parseInt(UmpireIDL.getText()), Integer.parseInt(UMIDL.getText()));

                Umpire u1 = new Umpire(UmpireAllocationDetails);
                u1.umpireAllocationTableLoad(Integer.parseInt(UMIDL.getText()));
                JOptionPane.showMessageDialog(null, "Umpire deallocated successfully! ");
            }
            
            
        }  
    }//GEN-LAST:event_DeallocateActionPerformed

    private void AllocateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllocateActionPerformed
        umpireDetailValidationReset();
        Umpire u2 = new Umpire();
        boolean checkUmpire = false, checkDate = false;
        
        if(UDetails.getText().equals("Umpire Details")){
            checkUmpire = u2.cheackUmpireAllocation(Integer.parseInt(UmpireIDL.getText()), Integer.parseInt(UMIDL.getText()));
            checkDate = u2.cheackUmpireAllocationDate(Integer.parseInt(UmpireIDL.getText()), Date);
         
        }
        
        if(UmpireTypeB.getSelectedItem() == "Select the umpire type" ||UDetails.getText().equals("")||UDetails.getText().equals("Umpire Allocation Details")||checkUmpire==true||checkDate==true){
            
            if( checkUmpire==true ){
                JOptionPane.showMessageDialog(null, "Umpire already allocated to this match! ");
            }else if( checkDate==true ){
                JOptionPane.showMessageDialog(null, "Umpire already allocated to another match on this match's  date! ");
            }else{
                JOptionPane.showMessageDialog(null, "Incomplete or invalid details of an umpire allocation exsist! ");
                if(UmpireTypeB.getSelectedItem() == "Select the umpire type" ){
                    UmpireTypeV.setForeground(Color.red);
                    UmpireTypeV.setText("*Enter umpire type");
                }
                if(UDetails.getText().equals("")){
                    UmpireDetailV.setForeground(Color.red);
                    UmpireDetailV.setText("*Select for an umpire allocation");
                }
                if(UDetails.getText().equals("Umpire Allocation Details")){
                    UmpireDetailV.setForeground(Color.red);
                    UmpireDetailV.setText("*Select for an umpire allocation");
                }
            }
            
        }else{
            umpireDetailValidationReset();

            Umpire u = new Umpire(Integer.parseInt(UmpireIDL.getText()), UmpireTypeB.getSelectedItem().toString());
            u.allocateUmpire(Integer.parseInt(UMIDL.getText()));

            Umpire u1 = new Umpire(UmpireAllocationDetails);
            u1.umpireAllocationTableLoad(Integer.parseInt(UMIDL.getText()));
            JOptionPane.showMessageDialog(null, "Umpire allocated successfully! ");
        }

    }//GEN-LAST:event_AllocateActionPerformed

    private void UmpireAllocationDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UmpireAllocationDetailsMouseClicked
        umpireDetailValidationReset();
        int row = UmpireAllocationDetails.getSelectedRow();
        UmpireDetails.getSelectionModel().clearSelection();

        UDetails.setText("Umpire Allocation Details");
        setUmpireIDLabel(UmpireAllocationDetails.getValueAt(row, 0).toString());
        Umpire u = new Umpire();
        u.getUmpireGradeName(Integer.parseInt(UmpireAllocationDetails.getValueAt(row, 0).toString()), GradeL, UNameL);
        setUmpireTypeBox(UmpireAllocationDetails.getValueAt(row, 1).toString());
    }//GEN-LAST:event_UmpireAllocationDetailsMouseClicked

    private void UmpireDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UmpireDetailsMouseClicked
        umpireDetailValidationReset();
        setUmpireTypeBox("Select the umpire type");
        UmpireAllocationDetails.getSelectionModel().clearSelection();
  
        int row = UmpireDetails.getSelectedRow();

        UDetails.setText("Umpire Details");
        setUmpireIDLabel(UmpireDetails.getValueAt(row, 0).toString());
        setGradeLabel(UmpireDetails.getValueAt(row, 1).toString());
        setUmpireNameLabel(UmpireDetails.getValueAt(row, 2).toString());
        
    }//GEN-LAST:event_UmpireDetailsMouseClicked

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        TableTypeB.setSelectedItem("Select the table type");
        SearchTypeB.setSelectedItem("Select the search type");
        SearchKeyB.setText("");
        clearSearchValidation();

        Umpire u = new Umpire(UmpireDetails);
        u.umpireAllocationTableLoad(0);
       
        Scorer s = new Scorer(ScorerDetails);
        s.scorerAllocationTableLoad(0);
        
        if(TableTypeB.getSelectedItem() == "Umpire" ){
            clearUmpireForm();
            UmpireAllocationDetails.getSelectionModel().clearSelection();
            UmpireDetails.getSelectionModel().clearSelection();
        }
        
        if(TableTypeB.getSelectedItem() == "Scorer" ){
            clearScorerForm();
            ScorerAllocationDetails.getSelectionModel().clearSelection();
            ScorerDetails.getSelectionModel().clearSelection();
        }
    }//GEN-LAST:event_ResetActionPerformed

    private void SearchKeyBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchKeyBMouseClicked
        SearchKeyB.setText("");
    }//GEN-LAST:event_SearchKeyBMouseClicked

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        clearSearchValidation();

        if(TableTypeB.getSelectedItem() == "Select the table type" || SearchTypeB.getSelectedItem() == "Select the search type" || SearchKeyB.getText().equals("") ){
            if(TableTypeB.getSelectedItem() == "Select the table type"){
                TableTypeV.setText("*Enter table type");
            }
            if(SearchTypeB.getSelectedItem() == "Select the search type"){
                SearchTypeV.setText("*Enter serach type");
            }
            if(SearchKeyB.getText().equals("") ){
                SearchKeyV.setText("*Enter serach key");
            }
        }else{
            if(TableTypeB.getSelectedItem() == "Umpire"){
                
  
                Umpire u3 = new Umpire(UmpireDetails);
                
                if(SearchTypeB.getSelectedItem() == "Umpire ID"){
                   u3.searchUmpireAssignment(1, SearchKeyB.getText());
                   UmpireAllocationDetails.getSelectionModel().clearSelection();
                   clearUmpireForm();
                }else if(SearchTypeB.getSelectedItem() == "Umpire Name"){
                   u3.searchUmpireAssignment(2, "%"+SearchKeyB.getText()+"%");
                   UmpireAllocationDetails.getSelectionModel().clearSelection();
                   clearUmpireForm();
                }else if(SearchTypeB.getSelectedItem() == "Grade"){
                   u3.searchUmpireAssignment(3, SearchKeyB.getText());
                   UmpireAllocationDetails.getSelectionModel().clearSelection();
                   clearUmpireForm();
                }else{
                    SearchTypeV.setText("*Invalid serach type");
                }
            }else if(TableTypeB.getSelectedItem() == "Scorer"){
                
                
                Scorer s3 = new Scorer(ScorerDetails);
                if(SearchTypeB.getSelectedItem() == "Scorer ID"){
                   s3.searchScorerAssignment(1, SearchKeyB.getText());
                   ScorerAllocationDetails.getSelectionModel().clearSelection();
                   clearScorerForm();
                }else if(SearchTypeB.getSelectedItem() == "Scorer Name"){
                   s3.searchScorerAssignment(2, "%"+SearchKeyB.getText()+"%");
                   ScorerAllocationDetails.getSelectionModel().clearSelection();
                   clearScorerForm();
                }else{
                    SearchTypeV.setText("*Invalid serach type");
                }
            }
            
        }
    }//GEN-LAST:event_SearchActionPerformed

    //Clear form details
    public void clearUmpireForm(){
        UmpireIDL.setText("Umpire ID will appear here");
        GradeL.setText("Grade will appear here");
        UNameL.setText("Name will appear here");
        UmpireTypeB.setSelectedItem("Select the umpire type");
        umpireDetailValidationReset();
    }
    
    //Clear form details
    public void clearScorerForm(){
        ScorerIDL.setText("Scorer ID will appear here");
        SNameL.setText("Name will appear here");
        scorerDetailValidationReset();
    }
    
    //Clear all the validation errors
    public void umpireDetailValidationReset(){
        UmpireTypeV.setText("");
        UmpireDetailV.setForeground(Color.darkGray);
        UmpireDetailV.setText("Select for an umpire allocation....");
        UmpireAllocateV.setForeground(Color.darkGray);
        UmpireAllocateV.setText("Select for an umpire deallocation or update.....");
        
    }
    
    //Clear all the validation errors of scorer
    public void scorerDetailValidationReset(){
        ScorerDetailV.setForeground(Color.darkGray);
        ScorerDetailV.setText("Select scorer for allocation.....");
        ScorerAllocateV.setForeground(Color.darkGray);
        ScorerAllocateV.setText("Select scorer for deallocation.....");
        
    }
    
    //Clear validation in search form
    public void clearSearchValidation(){
        TableTypeV.setText(" ");
        SearchTypeV.setText(" ");
        SearchKeyV.setText(" ");
    }
    
    String MatchID, Date;  
    JDesktopPane Desktop;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Allocate;
    private javax.swing.JButton Allocate1;
    private javax.swing.JLabel BackL;
    private javax.swing.JButton Deallocate;
    private javax.swing.JButton Deallocate1;
    private javax.swing.JLabel GradeL;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel SDetails;
    private javax.swing.JLabel SMIDL;
    private javax.swing.JLabel SNameL;
    private javax.swing.JLabel ScorerAllocateV;
    private javax.swing.JTable ScorerAllocationDetails;
    private javax.swing.JLabel ScorerDetailV;
    private javax.swing.JTable ScorerDetails;
    private javax.swing.JLabel ScorerIDL;
    private javax.swing.JButton Search;
    private javax.swing.JTextField SearchKeyB;
    private javax.swing.JLabel SearchKeyV;
    private javax.swing.JComboBox<String> SearchTypeB;
    private javax.swing.JLabel SearchTypeV;
    private javax.swing.JComboBox<String> TableTypeB;
    private javax.swing.JLabel TableTypeV;
    private javax.swing.JLabel UDetails;
    private javax.swing.JLabel UMIDL;
    private javax.swing.JLabel UNameL;
    private javax.swing.JLabel UmpireAllocateV;
    private javax.swing.JTable UmpireAllocationDetails;
    private javax.swing.JLabel UmpireDetailV;
    private javax.swing.JTable UmpireDetails;
    private javax.swing.JLabel UmpireIDL;
    private javax.swing.JComboBox<String> UmpireTypeB;
    private javax.swing.JLabel UmpireTypeV;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
