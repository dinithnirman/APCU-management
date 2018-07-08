
package GUI.Internal.User;
import Class.Function;
import Class.Tournament;
import Validation.Validation;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class addUpdateTournament extends javax.swing.JInternalFrame {
    
    public addUpdateTournament(JDesktopPane pDesktop, int ID) {
    
        initComponents();
        nonMove();
        tableNonMove();
        this.Desktop = pDesktop;
        Tournament t = new Tournament(TournamentDetails);
        t.tournamentTableLoad();
        
        if(ID!=0){
            t.viewBackTournamentDetails(ID, IDL, NameB, StartDateB, EndDateB, ContactPersonB, TelephoneNo1B, TelephoneNo2B, AddressB, EmailB, PaymentStatusL, TotalAmountB);
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
        
    }
    //setters
    public void setIDLabel(String pidLabel){
        IDL.setText(pidLabel);
    }
    
    public void setNameBox(String pNameBox){
        NameB.setText(pNameBox);
    }
    
    public void setStartDateBox(java.util.Date pStartDateBox){
        StartDateB.setDate(pStartDateBox);
    }
    
    public void setEndDateBox(java.util.Date pEndDateBox){
        EndDateB.setDate(pEndDateBox);
    }
    
    public void setContactPersonBox(String pContactPersonBox){
        ContactPersonB.setText(pContactPersonBox);
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
    
    public void setPaymentStatusLabel(String pPaymentStatusLabel){
        PaymentStatusL.setText(pPaymentStatusLabel);
    }
    
    public void setTotalAmountBox(String pTotalAmountBox){
        TotalAmountB.setText(pTotalAmountBox);
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        NameB = new javax.swing.JTextField();
        TelephoneNo2B = new javax.swing.JTextField();
        AddressB = new javax.swing.JTextField();
        EmailB = new javax.swing.JTextField();
        AddUmpire = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        IDL = new javax.swing.JLabel();
        UpdateUmpire = new javax.swing.JButton();
        TelephoneNo1B = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        StartDateB = new com.toedter.calendar.JDateChooser();
        NameV = new javax.swing.JLabel();
        DurationV = new javax.swing.JLabel();
        TelephoneNoV = new javax.swing.JLabel();
        AddressV = new javax.swing.JLabel();
        EmailV = new javax.swing.JLabel();
        TotalAmountB = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TotalAmountV = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        EndDateB = new com.toedter.calendar.JDateChooser();
        PaymentStatusL = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ContactPersonB = new javax.swing.JTextField();
        ContactPersonV = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TournamentDetails = new javax.swing.JTable();
        NextL = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        SearchTypeV = new javax.swing.JLabel();
        Reset = new javax.swing.JButton();
        SearchTypeB = new javax.swing.JComboBox<String>();
        SearchKeyB = new javax.swing.JTextField();
        SearchKeyV = new javax.swing.JLabel();
        Search = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setTitle(" Add / Update Tournament & Match");
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel11.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Manage Tournament >");

        jLabel12.setFont(new java.awt.Font("Calibri Light", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Add / Update Tournament");

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
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Tournament Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 153, 204))); // NOI18N

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

        AddUmpire.setBackground(new java.awt.Color(0, 153, 204));
        AddUmpire.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddUmpire.setForeground(new java.awt.Color(255, 255, 255));
        AddUmpire.setText("Add");
        AddUmpire.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddUmpire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUmpireActionPerformed(evt);
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
        jLabel13.setText("Tournament ID");

        IDL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        IDL.setForeground(new java.awt.Color(51, 51, 51));
        IDL.setText("Tournament ID will assign automatically");

        UpdateUmpire.setBackground(new java.awt.Color(0, 153, 204));
        UpdateUmpire.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UpdateUmpire.setForeground(new java.awt.Color(255, 255, 255));
        UpdateUmpire.setText("Update");
        UpdateUmpire.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UpdateUmpire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateUmpireActionPerformed(evt);
            }
        });

        TelephoneNo1B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TelephoneNo1BMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Duration (From-To)");

        StartDateB.setBackground(new java.awt.Color(0, 153, 204));
        StartDateB.setForeground(new java.awt.Color(0, 153, 204));
        StartDateB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StartDateBMouseClicked(evt);
            }
        });

        NameV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        NameV.setText(" ");

        DurationV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        DurationV.setText(" ");

        TelephoneNoV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TelephoneNoV.setText(" ");

        AddressV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        AddressV.setText(" ");

        EmailV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        EmailV.setText(" ");

        TotalAmountB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TotalAmountBMouseClicked(evt);
            }
        });
        TotalAmountB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalAmountBActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Total Amount");

        TotalAmountV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TotalAmountV.setText(" ");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Payment Status");

        PaymentStatusL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PaymentStatusL.setForeground(new java.awt.Color(51, 51, 51));
        PaymentStatusL.setText("Payment status will appear automatically");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Contact Person");

        ContactPersonB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContactPersonBMouseClicked(evt);
            }
        });

        ContactPersonV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ContactPersonV.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PaymentStatusL, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(TotalAmountB)
                        .addComponent(EmailV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddressV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DurationV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NameV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(AddUmpire, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35)
                            .addComponent(UpdateUmpire, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                            .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(AddressB, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(TelephoneNo1B, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TelephoneNo2B, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(NameB, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TelephoneNoV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TotalAmountV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(StartDateB, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(44, 44, 44)
                            .addComponent(EndDateB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(IDL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ContactPersonB)
                        .addComponent(ContactPersonV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EmailB, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(0, 52, Short.MAX_VALUE))
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(StartDateB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(DurationV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ContactPersonB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(EndDateB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ContactPersonV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TelephoneNo1B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TelephoneNo2B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TelephoneNoV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddressB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
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
                    .addComponent(jLabel14)
                    .addComponent(PaymentStatusL))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TotalAmountB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(0, 0, 0)
                .addComponent(TotalAmountV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddUmpire, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateUmpire, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(468, 468, 468))
        );

        jScrollPane1.setBackground(new java.awt.Color(0, 153, 204));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));
        jScrollPane1.setForeground(new java.awt.Color(51, 51, 51));

        TournamentDetails.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TournamentDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Tournament ID", "Name", "Start Date", "End Date", "Contact Person", "Address", "E-mail", "Total Amount", "Payment Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
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
        jLabel7.setText("(Add / Update Match)");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)), "Search Tournament", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 153, 204))); // NOI18N

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
                    .addComponent(SearchTypeB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(13, 13, 13)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NextL, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1112, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NextL)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(317, 317, 317))
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

    private void AddUmpireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUmpireActionPerformed
        
        validationLableColorSet();
        validationLableReset();
        Validation v = new Validation();
        telephoneValidation(1);
              
        if(NameB.getText().equals("") || StartDateB.getDate() == null ||  EndDateB.getDate() == null || ContactPersonB.getText().equals("")  || AddressB.getText().equals("") || v.emailValidation(EmailB.getText())==false || v.accountNoValidation(TotalAmountB.getText())==false || TotalAmountB.getText().equals("") ||  (TP1=='E' && TP2=='E') || (TP1=='I' && TP2=='I') || (TP1=='I' && TP2=='E') || (TP1=='E' && TP2=='I') || (TP1=='V' && TP2=='I') || (TP1=='I' && TP2=='V')){
            JOptionPane.showMessageDialog(null, "Incomplete or invalid details of a tournament exsist! ");
            
            if(NameB.getText().equals("")){
                NameV.setText("*Enter name");
            }
            if(ContactPersonB.getText().equals("")){
                ContactPersonV.setText("*Enter contact person");
            }
            
            if(AddressB.getText().equals("")){
                AddressV.setText("*Enter address");
            }
            dateValidation();
            telephoneValidation(2);
            emailValidation();
            totalAmountValidation();
           
             
        }else{
            validationLableReset();
            String ID;
            SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
            Tournament t1;
           
            if(TP1 == 'V' && TP2 == 'E'){
                t1 = new Tournament(NameB.getText(), formatDate.format(StartDateB.getDate()), formatDate.format(EndDateB.getDate()), ContactPersonB.getText(), TelephoneNo1B.getText(), AddressB.getText(), EmailB.getText(), TotalAmountB.getText());
                t1.addTournament();
                ID = Integer.toString(t1.getTournamentID());
                setIDLabel(ID);
            }
            if(TP1 == 'E' && TP2 == 'V'){
                t1 = new Tournament(NameB.getText(), formatDate.format(StartDateB.getDate()), formatDate.format(EndDateB.getDate()), ContactPersonB.getText(), TelephoneNo2B.getText(), AddressB.getText(), EmailB.getText(), TotalAmountB.getText());
                t1.addTournament();
                ID = Integer.toString(t1.getTournamentID());
                setIDLabel(ID);
            }
            if(TP1 == 'V' && TP2 == 'V'){
                t1 = new Tournament(NameB.getText(), formatDate.format(StartDateB.getDate()), formatDate.format(EndDateB.getDate()), ContactPersonB.getText(), TelephoneNo1B.getText(), TelephoneNo2B.getText(), AddressB.getText(), EmailB.getText(), TotalAmountB.getText());
                t1.addTournament();
                ID = Integer.toString(t1.getTournamentID());
                setIDLabel(ID);
            }
            
            Tournament t = new Tournament(TournamentDetails);
            t.tournamentTableLoad();
            JOptionPane.showMessageDialog(null, "Tournament added successfully! ");
            
        }
    }//GEN-LAST:event_AddUmpireActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        validationLableReset();
        clearForm();
        
    }//GEN-LAST:event_ClearActionPerformed

    private void UpdateUmpireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateUmpireActionPerformed
        validationLableColorSet();
        validationLableReset();
        Validation v = new Validation();
        telephoneValidation(1);
              
        if(IDL.getText().equals("Tournament ID will assign automatically") || NameB.getText().equals("") || StartDateB.getDate() == null ||  EndDateB.getDate() == null || ContactPersonB.getText().equals("")  || AddressB.getText().equals("") || v.emailValidation(EmailB.getText())==false || v.accountNoValidation(TotalAmountB.getText())==false || TotalAmountB.getText().equals("") ||  (TP1=='E' && TP2=='E') || (TP1=='I' && TP2=='I') || (TP1=='I' && TP2=='E') || (TP1=='E' && TP2=='I') || (TP1=='V' && TP2=='I') || (TP1=='I' && TP2=='V')){
            if(IDL.getText() == "Tournament ID will assign automatically"){
                JOptionPane.showMessageDialog(null, "Select a tournament detail record first! ");
            }else{
                JOptionPane.showMessageDialog(null, "Incomplete or invalid details of a tournament exsist! ");
            }
            
            if(NameB.getText().equals("")){
                NameV.setText("*Enter name");
            }
            if(ContactPersonB.getText().equals("")){
                ContactPersonV.setText("*Enter contact person");
            }
            
            if(AddressB.getText().equals("")){
                AddressV.setText("*Enter address");
            }
            dateValidation();
            telephoneValidation(2);
            emailValidation();
            totalAmountValidation();
           
             
        }else{
           validationLableReset();
        
            SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
            Tournament t2;
           
            
            if(TP1 == 'V' && TP2 == 'V'){
                t2 = new Tournament(Integer.parseInt(IDL.getText()), NameB.getText(), formatDate.format(StartDateB.getDate()), formatDate.format(EndDateB.getDate()), ContactPersonB.getText(), TelephoneNo1B.getText(), TelephoneNo2B.getText(), AddressB.getText(), EmailB.getText(), TotalAmountB.getText());
                t2.updateTournament();
            }else{
                t2 = new Tournament(Integer.parseInt(IDL.getText()), NameB.getText(), formatDate.format(StartDateB.getDate()), formatDate.format(EndDateB.getDate()), ContactPersonB.getText(), TelephoneNo1B.getText(), AddressB.getText(), EmailB.getText(), TotalAmountB.getText());
                t2.updateTournament();
            }
            
            Tournament t = new Tournament(TournamentDetails);
            t.tournamentTableLoad();
            JOptionPane.showMessageDialog(null, "Tournament updated successfully! ");
            
        }  
    }//GEN-LAST:event_UpdateUmpireActionPerformed

    private void TelephoneNo1BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelephoneNo1BMouseClicked
        setTelephoneNo1Box(null);
    }//GEN-LAST:event_TelephoneNo1BMouseClicked

    private void TournamentDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TournamentDetailsMouseClicked
        validationLableReset();
        int row = TournamentDetails.getSelectedRow();
        int ID = Integer.parseInt(TournamentDetails.getValueAt(row, 0).toString());
        Tournament t3 = new Tournament();
        int Count = t3.getTPCount(ID);
        
        setTelephoneNo1Box(null);
        setTelephoneNo2Box(null);
        if(Count==2){
            setTelephoneNo1Box(t3.getContactPersonTelephone(ID, 1));
            setTelephoneNo2Box(t3.getContactPersonTelephone(ID, 2));
        }else{
            setTelephoneNo1Box(t3.getContactPersonTelephone(ID, 1));
        }
        
        setIDLabel(TournamentDetails.getValueAt(row, 0).toString());
        setNameBox(TournamentDetails.getValueAt(row, 1).toString());
        Function f = new Function();
        setStartDateBox(f.getDate(TournamentDetails.getValueAt(row, 2).toString()));
        setEndDateBox(f.getDate(TournamentDetails.getValueAt(row, 3).toString()));
        setContactPersonBox(TournamentDetails.getValueAt(row, 4).toString());
        setAddressBox(TournamentDetails.getValueAt(row, 5).toString());
        setEmailBox(TournamentDetails.getValueAt(row, 6).toString());
        setPaymentStatusLabel(t3.getRPaymentStatus(ID));
        setTotalAmountBox(TournamentDetails.getValueAt(row, 7).toString());
    }//GEN-LAST:event_TournamentDetailsMouseClicked

    private void StartDateBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartDateBMouseClicked
        //setDOB(null);
    }//GEN-LAST:event_StartDateBMouseClicked

    private void TotalAmountBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalAmountBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalAmountBActionPerformed

    private void TotalAmountBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TotalAmountBMouseClicked
        setTotalAmountBox("");
    }//GEN-LAST:event_TotalAmountBMouseClicked

    private void ContactPersonBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContactPersonBMouseClicked
        setContactPersonBox("");
    }//GEN-LAST:event_ContactPersonBMouseClicked

    private void NextLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextLMouseClicked
        if(IDL.getText()=="Tournament ID will assign automatically"){
            JOptionPane.showMessageDialog(null, "Select or add a tournament first! ");
        }else{
            int input = JOptionPane.showConfirmDialog(null, "Are you sure that you want to manage matches of Tourment ID = '"+IDL.getText()+"'");
            
            if(input==0){
                addUpdateMatch AUM = new addUpdateMatch(Desktop,IDL.getText());
                Desktop.add(AUM);
                this.dispose();
                AUM.setVisible(true);
            }
        }
        
        
    }//GEN-LAST:event_NextLMouseClicked

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        SearchTypeB.setSelectedItem("Select the search type");
        SearchKeyB.setText("");
        clearSearchValidation();

        Tournament t = new Tournament(TournamentDetails);
        t.tournamentTableLoad();
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
            Tournament t3 = new Tournament(TournamentDetails);
            if(SearchTypeB.getSelectedItem()== "Tournament ID"){
                t3.searchTournament(1, SearchKeyB.getText());
            }else if(SearchTypeB.getSelectedItem()== "Tournament Name"){
                t3.searchTournament(2, "%"+SearchKeyB.getText()+"%");
            }else if(SearchTypeB.getSelectedItem()== "Contact Person"){
                t3.searchTournament(3, "%"+SearchKeyB.getText()+"%");
            }

        }
    }//GEN-LAST:event_SearchActionPerformed
    
    //Clear all the error messages
    public void validationLableReset(){
        NameV.setText(" ");
        DurationV.setText(" ");
        ContactPersonV.setText(" ");
        TelephoneNoV.setText(" ");
        AddressV.setText(" ");
        EmailV.setText(" ");
        TotalAmountV.setText(" ");
    }
    
    //Set color red for all the validation label
    public void validationLableColorSet(){
        NameV.setForeground(Color.RED);
        DurationV.setForeground(Color.RED);
        ContactPersonV.setForeground(Color.RED);
        TelephoneNoV.setForeground(Color.RED);
        AddressV.setForeground(Color.RED);
        EmailV.setForeground(Color.RED);
        TotalAmountV.setForeground(Color.RED);
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
    
    //Validation to check(empty/invalid) total amount
    public void totalAmountValidation(){
        
        Validation v3 = new Validation();
        
        if(TotalAmountB.getText().equals("")){
            TotalAmountV.setText("*Enter total amount");
        }
        else if(v3.accountNoValidation(TotalAmountB.getText())==false){
            TotalAmountV.setText("*Invalid total amount");
        }
    }
    
    
    //Clear all the text boxes and selection boxes in the form
    public void clearForm(){
        
        setIDLabel("Tournament ID will assign automatically");
        setNameBox(null);
        setStartDateBox(null);
        setEndDateBox(null);
        setContactPersonBox(null);
        setTelephoneNo1Box(null);
        setTelephoneNo2Box(null);
        setAddressBox(null);
        setEmailBox(null);
        setPaymentStatusLabel("Payment status will appear automatically");
        setTotalAmountBox(null);
    }
    
    public void dateValidation(){
        if(StartDateB.getDate()!= null){
            StartDate = 'N';
        }else{
            StartDate = 'E';
        }
        
        if(EndDateB.getDate()!= null){
            EndDate = 'N';
        }else{
            EndDate = 'E';
        }
        
        if(StartDate == 'E' && EndDate == 'N'){
            DurationV.setText("*Enter start date");
        }else if(StartDate == 'E' && EndDate == 'E'){
            DurationV.setText("*Enter start date & end date");
        }else if(StartDate == 'N' && EndDate == 'N'){
            DurationV.setText(" ");
        }else if(StartDate == 'N' && EndDate == 'E'){
            DurationV.setText("*Enter end date");
        }
            
   
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
    private javax.swing.JButton AddUmpire;
    private javax.swing.JTextField AddressB;
    private javax.swing.JLabel AddressV;
    private javax.swing.JButton Clear;
    private javax.swing.JTextField ContactPersonB;
    private javax.swing.JLabel ContactPersonV;
    private javax.swing.JLabel DurationV;
    private javax.swing.JTextField EmailB;
    private javax.swing.JLabel EmailV;
    private com.toedter.calendar.JDateChooser EndDateB;
    private javax.swing.JLabel IDL;
    private javax.swing.JTextField NameB;
    private javax.swing.JLabel NameV;
    private javax.swing.JLabel NextL;
    private javax.swing.JLabel PaymentStatusL;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Search;
    private javax.swing.JTextField SearchKeyB;
    private javax.swing.JLabel SearchKeyV;
    private javax.swing.JComboBox<String> SearchTypeB;
    private javax.swing.JLabel SearchTypeV;
    private com.toedter.calendar.JDateChooser StartDateB;
    private javax.swing.JTextField TelephoneNo1B;
    private javax.swing.JTextField TelephoneNo2B;
    private javax.swing.JLabel TelephoneNoV;
    private javax.swing.JTextField TotalAmountB;
    private javax.swing.JLabel TotalAmountV;
    private javax.swing.JTable TournamentDetails;
    private javax.swing.JButton UpdateUmpire;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
