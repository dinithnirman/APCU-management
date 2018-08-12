
package GUI.Internal.User;
import Class.Function;
import Class.Scorer;
import Validation.Validation;
import static Validation.Validation.Namevalidation;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class addUpdateScorer extends javax.swing.JInternalFrame {
    
    public addUpdateScorer() {
        initComponents();
        nonMove();
        tableNonMove();
        Scorer s = new Scorer(ScorerDetails);
        s.scorerTableLoad();
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
        ScorerDetails.getTableHeader().setReorderingAllowed(false);
                
    }
    //setters
    public void setIDLabel(String pidLabel){
        IDL.setText(pidLabel);
    }
     
    public void setNameBox(String pNameBox){
        NameB.setText(pNameBox);
    }
    
    public void setDOB(java.util.Date pDOB){
        DOBB.setDate(pDOB);
    }
    
    public void setTelephoneNo1Box(String pTelephoneNo1Box){
        TelephoneNo1B.setText(pTelephoneNo1Box);
    }
    
    public void setTelephoneNo2Box(String pTelephoneNo2Box){
        TelephoneNo2B.setText(pTelephoneNo2Box);
    }
    
    public void setAddressBox(String pAddressBox){
        AddressB.setText(pAddressBox);
    }
    
    public void setEmailBox(String pEmailBox){
        EmailB.setText(pEmailBox);
    }
    
    public void setAccountNoBox(String pAccountNoBox){
        AccountNoB.setText(pAccountNoBox);
    }
    
    public void setBankBranchBox(String pBankBranchBox){
        BankBranchB.setText(pBankBranchBox);
    }
    
    public void setAvailabilityLabel(String pAvailabilityLabel){
        AvailabilityL.setText(pAvailabilityLabel);
    }
    
    public void setChangeLabel(String pChangeLabel){
        ChangeL.setText(pChangeLabel);
    }
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        NameB = new javax.swing.JTextField();
        TelephoneNo2B = new javax.swing.JTextField();
        AddressB = new javax.swing.JTextField();
        EmailB = new javax.swing.JTextField();
        AddScorer = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        IDL = new javax.swing.JLabel();
        UpdateScorer = new javax.swing.JButton();
        TelephoneNo1B = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        DOBB = new com.toedter.calendar.JDateChooser();
        NameV = new javax.swing.JLabel();
        DOBV = new javax.swing.JLabel();
        TelephoneNoV = new javax.swing.JLabel();
        AddressV = new javax.swing.JLabel();
        EmailV = new javax.swing.JLabel();
        AccountNoB = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        AccountNoV = new javax.swing.JLabel();
        BankBranchB = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        BankBranchV = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ScorerDetails = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        AvailabilityL = new javax.swing.JLabel();
        ChangeL = new javax.swing.JLabel();
        Change = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        SearchTypeV = new javax.swing.JLabel();
        Reset = new javax.swing.JButton();
        SearchTypeB = new javax.swing.JComboBox<String>();
        SearchKeyB = new javax.swing.JTextField();
        SearchKeyV = new javax.swing.JLabel();
        Search = new javax.swing.JButton();

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Account Number");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Bank & Branch");

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setTitle(" Add / Update Scorer");
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel11.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Manage Scorer >");

        jLabel12.setFont(new java.awt.Font("Calibri Light", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Add / Update Scorer");

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
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Scorer Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 153, 204))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Telephone Number");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("E-mail Address");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Address");

        NameB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NameBMouseClicked(evt);
            }
        });

        TelephoneNo2B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TelephoneNo2BMouseClicked(evt);
            }
        });

        AddressB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddressBMouseClicked(evt);
            }
        });

        EmailB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmailBMouseClicked(evt);
            }
        });

        AddScorer.setBackground(new java.awt.Color(0, 153, 204));
        AddScorer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddScorer.setForeground(new java.awt.Color(255, 255, 255));
        AddScorer.setText("Add");
        AddScorer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddScorer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddScorerActionPerformed(evt);
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

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Scorer ID");

        IDL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        IDL.setForeground(new java.awt.Color(51, 51, 51));
        IDL.setText("Scorer ID will assign automatically");

        UpdateScorer.setBackground(new java.awt.Color(0, 153, 204));
        UpdateScorer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UpdateScorer.setForeground(new java.awt.Color(255, 255, 255));
        UpdateScorer.setText("Update");
        UpdateScorer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UpdateScorer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateScorerActionPerformed(evt);
            }
        });

        TelephoneNo1B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TelephoneNo1BMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Date of Birth");

        DOBB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DOBBMouseClicked(evt);
            }
        });

        NameV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        NameV.setText(" ");

        DOBV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        DOBV.setText(" ");

        TelephoneNoV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TelephoneNoV.setText(" ");

        AddressV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        AddressV.setText(" ");

        EmailV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        EmailV.setText(" ");

        AccountNoB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountNoBMouseClicked(evt);
            }
        });
        AccountNoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountNoBActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Account Number");

        AccountNoV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        AccountNoV.setText(" ");

        BankBranchB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BankBranchBMouseClicked(evt);
            }
        });
        BankBranchB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BankBranchBActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Bank & Branch");

        BankBranchV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        BankBranchV.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(IDL, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BankBranchB)
                            .addComponent(AccountNoB)
                            .addComponent(EmailV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddressV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DOBV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NameV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(AddScorer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(UpdateScorer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(EmailB, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddressB, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(TelephoneNo1B, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TelephoneNo2B, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(NameB, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DOBB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TelephoneNoV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AccountNoV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BankBranchV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(52, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(IDL))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(0, 0, 0)
                .addComponent(NameV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(DOBB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(DOBV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TelephoneNo1B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TelephoneNo2B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TelephoneNoV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel8))
                    .addComponent(AddressB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(AddressV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(EmailB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(EmailV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccountNoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(0, 0, 0)
                .addComponent(AccountNoV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BankBranchB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(0, 0, 0)
                .addComponent(BankBranchV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddScorer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateScorer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(468, 468, 468))
        );

        jScrollPane1.setBackground(new java.awt.Color(0, 153, 204));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));
        jScrollPane1.setForeground(new java.awt.Color(51, 51, 51));

        ScorerDetails.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ScorerDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Scorer ID", "Name", "Date of Birth", "Address", "E-mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
        jScrollPane1.setViewportView(ScorerDetails);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)), "Change Availability", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 153, 204))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Availability");

        AvailabilityL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AvailabilityL.setForeground(new java.awt.Color(51, 51, 51));
        AvailabilityL.setText("Availability will appear here");

        ChangeL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ChangeL.setForeground(new java.awt.Color(51, 51, 51));
        ChangeL.setText("Change into ...");

        Change.setBackground(new java.awt.Color(0, 153, 204));
        Change.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Change.setForeground(new java.awt.Color(255, 255, 255));
        Change.setText("Change");
        Change.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Change, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ChangeL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AvailabilityL, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AvailabilityL)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addComponent(ChangeL)
                .addGap(18, 18, 18)
                .addComponent(Change, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)), "Search Scorer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 153, 204))); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Search by");

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
        SearchTypeB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select the search type", "Scorer ID", "Scorer Name" }));
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
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jLabel17)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Add / UpdateRetailer");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NameBMouseClicked
        setNameBox(null);
    }//GEN-LAST:event_NameBMouseClicked

    private void TelephoneNo2BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelephoneNo2BMouseClicked
        setTelephoneNo2Box(null);
    }//GEN-LAST:event_TelephoneNo2BMouseClicked

    private void AddressBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddressBMouseClicked
        setAddressBox(null);
    }//GEN-LAST:event_AddressBMouseClicked

    private void EmailBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmailBMouseClicked
        setEmailBox(null);
    }//GEN-LAST:event_EmailBMouseClicked

    private void AddScorerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddScorerActionPerformed
        setIDLabel("Scorer ID will assign automatically");
        validationLableColorSet();
        validationLableReset();
        Validation v = new Validation();
        telephoneValidation(1);
              
        if(NameB.getText().equals("") || DOBB.getDate() == null || AddressB.getText().equals("") || v.emailValidation(EmailB.getText())==false || v.accountNoValidation(AccountNoB.getText())==false || AccountNoB.getText().equals("") ||BankBranchB.getText().equals("") || (TP1=='E' && TP2=='E') || (TP1=='I' && TP2=='I') || (TP1=='I' && TP2=='E') || (TP1=='E' && TP2=='I') || (TP1=='V' && TP2=='I') || (TP1=='I' && TP2=='V')){
            JOptionPane.showMessageDialog(null, "Incomplete or invalid details of an scorer exsist! ");
            
            if(NameB.getText().equals("")){
                NameV.setText("*Enter name");
            }
            if( DOBB.getDate() == null ){
                DOBV.setText("*Enter date of birth");
            }
            if(AddressB.getText().equals("")){
                AddressV.setText("*Enter address");
            }
            telephoneValidation(2);
            emailValidation();
            accountNoValidation();
            if(BankBranchB.getText().equals("")){
                BankBranchV.setText("*Enter bank & brach");
            }
             
        }else if(Namevalidation(NameB.getText())){
            validationLableReset();
            String ID;
            SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
            Scorer s1;
           
            if(TP1 == 'V' && TP2 == 'E'){
                s1 = new Scorer(NameB.getText(), formatDate.format(DOBB.getDate()), TelephoneNo1B.getText(), AddressB.getText(), EmailB.getText(), AccountNoB.getText(), BankBranchB.getText());
                s1.addScorer();
                ID = Integer.toString(s1.getScorerID());
                setIDLabel(ID);
            }
            if(TP1 == 'E' && TP2 == 'V'){
                s1 = new Scorer(NameB.getText(), formatDate.format(DOBB.getDate()), TelephoneNo2B.getText(), AddressB.getText(), EmailB.getText(), AccountNoB.getText(), BankBranchB.getText());
                s1.addScorer();
                ID = Integer.toString(s1.getScorerID());
                setIDLabel(ID);
            }
            if(TP1 == 'V' && TP2 == 'V'){
                s1 = new Scorer(NameB.getText(), formatDate.format(DOBB.getDate()), TelephoneNo1B.getText(), TelephoneNo2B.getText(), AddressB.getText(), EmailB.getText(), AccountNoB.getText(), BankBranchB.getText());
                s1.addScorer();
                ID = Integer.toString(s1.getScorerID());
                setIDLabel(ID);
            }
           
            Scorer s = new Scorer(ScorerDetails);
            s.scorerTableLoad();
            JOptionPane.showMessageDialog(null, "Scorer added successfully! ");
            
        }
    }//GEN-LAST:event_AddScorerActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        validationLableReset();
        clearForm();
        
    }//GEN-LAST:event_ClearActionPerformed

    private void UpdateScorerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateScorerActionPerformed
        validationLableColorSet();
        validationLableReset();
        Validation v = new Validation();
        telephoneValidation(1);
              
        if(IDL.getText().equals("Scorer ID will assign automatically") || NameB.getText().equals("") || DOBB.getDate() == null || AddressB.getText().equals("") || v.emailValidation(EmailB.getText())==false || v.accountNoValidation(AccountNoB.getText())==false || AccountNoB.getText().equals("") ||BankBranchB.getText().equals("") || (TP1=='E' && TP2=='E') || (TP1=='I' && TP2=='I') || (TP1=='I' && TP2=='E') || (TP1=='E' && TP2=='I') || (TP1=='V' && TP2=='I') || (TP1=='I' && TP2=='V')){
            if(IDL.getText() == "Scorer ID will assign automatically"){
                JOptionPane.showMessageDialog(null, "Select a scorer detail record first! ");
            }else{
                JOptionPane.showMessageDialog(null, "Incomplete or invalid details of an scorer exsist! ");
            }
            
            if(NameB.getText().equals("")){
                NameV.setText("*Enter name");
            }
            if( DOBB.getDate() == null ){
                DOBV.setText("*Enter date of birth");
            }
            if(AddressB.getText().equals("")){
                AddressV.setText("*Enter address");
            }
            telephoneValidation(2);
            emailValidation();
            accountNoValidation();
            if(BankBranchB.getText().equals("")){
                BankBranchV.setText("*Enter bank & brach");
            }
             
        }else if(Namevalidation(NameB.getText())){
            validationLableReset();
        
            SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
            Scorer s2;
           
            if(TP1 == 'V' && TP2 == 'E'){
                s2 = new Scorer(Integer.parseInt(IDL.getText()),NameB.getText(), formatDate.format(DOBB.getDate()), TelephoneNo1B.getText(), AddressB.getText(), EmailB.getText(), AccountNoB.getText(), BankBranchB.getText());
                s2.updateScorer();
            }
            if(TP1 == 'E' && TP2 == 'V'){
                s2 = new Scorer(Integer.parseInt(IDL.getText()),NameB.getText(), formatDate.format(DOBB.getDate()), TelephoneNo2B.getText(), AddressB.getText(), EmailB.getText(), AccountNoB.getText(), BankBranchB.getText());
                s2.updateScorer();
            }
            if(TP1 == 'V' && TP2 == 'V'){
                s2 = new Scorer(Integer.parseInt(IDL.getText()),NameB.getText(), formatDate.format(DOBB.getDate()), TelephoneNo1B.getText(), TelephoneNo2B.getText(), AddressB.getText(), EmailB.getText(), AccountNoB.getText(), BankBranchB.getText());
                s2.updateScorer();
            }
           
            Scorer s = new Scorer(ScorerDetails);
            s.scorerTableLoad();
            JOptionPane.showMessageDialog(null, "Scorer updated successfully! ");
            
        }
    }//GEN-LAST:event_UpdateScorerActionPerformed

    private void TelephoneNo1BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelephoneNo1BMouseClicked
        setTelephoneNo1Box(null);
    }//GEN-LAST:event_TelephoneNo1BMouseClicked

    private void ScorerDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScorerDetailsMouseClicked
        validationLableReset();
        int row = ScorerDetails.getSelectedRow();
        int ID = Integer.parseInt(ScorerDetails.getValueAt(row, 0).toString());
        Scorer s3 = new Scorer();
        int Count = s3.getTPCount(ID);
        
        setTelephoneNo1Box("");
        setTelephoneNo2Box("");
        if(Count==2){
            setTelephoneNo1Box(s3.getScorerTelephone(ID, 1));
            setTelephoneNo2Box(s3.getScorerTelephone(ID, 2));
        }else{
            setTelephoneNo1Box(s3.getScorerTelephone(ID, 1));
        }
        
        setIDLabel(ScorerDetails.getValueAt(row, 0).toString());
        setNameBox(ScorerDetails.getValueAt(row, 1).toString());
        Function f = new Function();
        setDOB(f.getDate(ScorerDetails.getValueAt(row, 2).toString()));
        setAddressBox(ScorerDetails.getValueAt(row, 3).toString());
        setEmailBox(ScorerDetails.getValueAt(row, 4).toString());
        setAccountNoBox(ScorerDetails.getValueAt(row, 5).toString());
        setBankBranchBox(ScorerDetails.getValueAt(row, 6).toString());
        String Availability = s3.getScorerAvailability(ID);
        if(Availability.equals("Not Available")){
            AvailabilityL.setForeground(Color.RED);
            setChangeLabel("Change into available");
        }else{
            AvailabilityL.setForeground(Color.GREEN);
            setChangeLabel("Change into not available");
        }
        setAvailabilityLabel(Availability);
       
    }//GEN-LAST:event_ScorerDetailsMouseClicked

    private void DOBBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DOBBMouseClicked
        setDOB(null);
    }//GEN-LAST:event_DOBBMouseClicked

    private void AccountNoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountNoBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccountNoBActionPerformed

    private void BankBranchBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BankBranchBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BankBranchBActionPerformed

    private void ChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeActionPerformed

        Scorer s5 = new Scorer();
        String Availability = AvailabilityL.getText();

        if(Availability.equals("Availability will appear here")){
            JOptionPane.showMessageDialog(null, "Select a scorer detail record first! ");
        }else{

            int ID =Integer.parseInt(IDL.getText());
            if(Availability.equals("Not Available")){
                s5.setScorerAvailability("Available", ID);
            }else{
                s5.setScorerAvailability("Not Available", ID);
            }

            Availability = s5.getScorerAvailability(ID);

            if(Availability.equals("Not Available")){
                AvailabilityL.setForeground(Color.RED);
                setChangeLabel("Change into available");
            }else{
                AvailabilityL.setForeground(Color.GREEN);
                setChangeLabel("Change into not available");
            }
            setAvailabilityLabel(Availability);
            JOptionPane.showMessageDialog(null, "Availability changed successfully! ");
        }

    }//GEN-LAST:event_ChangeActionPerformed

    private void AccountNoBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountNoBMouseClicked
        setAccountNoBox(null);
    }//GEN-LAST:event_AccountNoBMouseClicked

    private void BankBranchBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BankBranchBMouseClicked
        setBankBranchBox(null);
    }//GEN-LAST:event_BankBranchBMouseClicked

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        SearchTypeB.setSelectedItem("Select the search type");
        SearchKeyB.setText("");
        clearSearchValidation();

        Scorer s = new Scorer(ScorerDetails);
        s.scorerTableLoad();
        clearForm();
        validationLableReset();
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
            validationLableReset();
            Scorer s3 = new Scorer(ScorerDetails);
            if(SearchTypeB.getSelectedItem()== "Scorer ID"){
                s3.searchScorer(1, SearchKeyB.getText());
            }else if(SearchTypeB.getSelectedItem()== "Scorer Name"){
                s3.searchScorer(2, "%"+SearchKeyB.getText()+"%");
            }

        }
    }//GEN-LAST:event_SearchActionPerformed
    
    //Clear all the error messages
    public void validationLableReset(){
        NameV.setText(" ");
        DOBV.setText(" ");
        TelephoneNoV.setText(" ");
        AddressV.setText(" ");
        EmailV.setText(" ");
        AccountNoV.setText(" ");
        BankBranchV.setText(" ");
    }
    
    //Set color red for all the validation label
    public void validationLableColorSet(){
        NameV.setForeground(Color.RED);
        DOBV.setForeground(Color.RED);
        TelephoneNoV.setForeground(Color.RED);
        AddressV.setForeground(Color.RED);
        EmailV.setForeground(Color.RED);
        AccountNoV.setForeground(Color.RED);
        BankBranchV.setForeground(Color.RED);
    }
    
    //Validation to check(not avilaible/invalid) telephone numbers
    public void telephoneValidation(int input){
        
        Validation v1 = new Validation();
        
        if(input==1){
            if (v1.telephoneValidation(TelephoneNo1B.getText(),2)){
                TP1 = 'E';
            }else{
                if(v1.telephoneValidation(TelephoneNo1B.getText(),1)){
                    TP1 = 'V';
                }else{
                    TP1 = 'I';
                }
            }
        
            if (v1.telephoneValidation(TelephoneNo2B.getText(),2)){
                TP2 = 'E';
            }else{
                if(v1.telephoneValidation(TelephoneNo2B.getText(),1)){
                    TP2 = 'V';
                }else{
                    TP2 = 'I';
                }
            }
        }else{
            switch(TP1){
                case 'E':
                    if(TP2=='E'){
                        TelephoneNoV.setText("*Enter least one telephone no");
                    }else if(TP2=='V'){
                        TelephoneNoV.setText(" ");
                    }else if(TP2=='I'){
                        TelephoneNoV.setText("*Invalid telephone no in box 2");
                    }
                    break;
                case 'V':
                    if(TP2=='E'){
                        TelephoneNoV.setText(" ");
                    }else if(TP2=='V'){
                        TelephoneNoV.setText(" ");
                    }else if(TP2=='I'){
                        TelephoneNoV.setText("*Invalid telephone no in box 2");
                    }
                    break;
                case 'I':
                    if(TP2=='E'){
                        TelephoneNoV.setText("*Invalid telephone no in box 1");
                    }else if(TP2=='V'){
                        TelephoneNoV.setText("*Invalid telephone no in box 1");
                    }else if(TP2=='I'){
                        TelephoneNoV.setText("*Invalid telephone no in box 1 & 2");
                    }
                    break;
            }
            
        } 
    
    }
    
    //Validation to check(empty/invalid) email
    public void emailValidation(){
        
        Validation v2 = new Validation();
        
        if(EmailB.getText().equals("")){
            EmailV.setText("*Enter email");
        }else if(v2.emailValidation(EmailB.getText()) == false){
            EmailV.setText("*Invalid email");  
        }
    }
    
    //Validation to check(empty/invalid) account no
    public void accountNoValidation(){
        
        Validation v3 = new Validation();
        
        if(AccountNoB.getText().equals("")){
            AccountNoV.setText("*Enter account no");
        }
        else if(v3.accountNoValidation(AccountNoB.getText())==false){
            AccountNoV.setText("*Invalid account no");
        }
    }
    
    //Clear all the text boxes and selection boxes in the form
    public void clearForm(){
        
        setIDLabel("Scorer ID will assign automatically");
        setNameBox("");
        setDOB(null);
        setTelephoneNo1Box(null);
        setTelephoneNo2Box(null);
        setAddressBox("");
        setEmailBox("");
        setAccountNoBox("");
        setBankBranchBox("");
        setAvailabilityLabel("Availability will appear here");
        AvailabilityL.setForeground(Color.DARK_GRAY);
        setChangeLabel("Change into ...");
    }
    
    public void clearSearchValidation(){
            SearchTypeV.setText(" ");
            SearchKeyV.setText(" ");
    }
    
    char TP1, TP2;
    String Result;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccountNoB;
    private javax.swing.JLabel AccountNoV;
    private javax.swing.JButton AddScorer;
    private javax.swing.JTextField AddressB;
    private javax.swing.JLabel AddressV;
    private javax.swing.JLabel AvailabilityL;
    private javax.swing.JTextField BankBranchB;
    private javax.swing.JLabel BankBranchV;
    private javax.swing.JButton Change;
    private javax.swing.JLabel ChangeL;
    private javax.swing.JButton Clear;
    private com.toedter.calendar.JDateChooser DOBB;
    private javax.swing.JLabel DOBV;
    private javax.swing.JTextField EmailB;
    private javax.swing.JLabel EmailV;
    private javax.swing.JLabel IDL;
    private javax.swing.JTextField NameB;
    private javax.swing.JLabel NameV;
    private javax.swing.JButton Reset;
    private javax.swing.JTable ScorerDetails;
    private javax.swing.JButton Search;
    private javax.swing.JTextField SearchKeyB;
    private javax.swing.JLabel SearchKeyV;
    private javax.swing.JComboBox<String> SearchTypeB;
    private javax.swing.JLabel SearchTypeV;
    private javax.swing.JTextField TelephoneNo1B;
    private javax.swing.JTextField TelephoneNo2B;
    private javax.swing.JLabel TelephoneNoV;
    private javax.swing.JButton UpdateScorer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
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
    // End of variables declaration//GEN-END:variables
}
