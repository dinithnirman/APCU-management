
package GUI.Internal.User;
import Class.Function;
import Class.Match;
import Class.Tournament;
import Validation.Validation;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class addUpdateMatch extends javax.swing.JInternalFrame {
    
    public addUpdateMatch(JDesktopPane pDesktop, String pTournamentID) {
        initComponents();
        nonMove();
        tableNonMove();
        this.Desktop = pDesktop;
        TIDL.setText(pTournamentID);
        
        Match m0 = new Match();
        m0.setGroundDetails(GroundB);
        
        
        Match m = new Match(MatchDetails);
        m.matchTableLoad(Integer.parseInt(pTournamentID));
        
        
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
        MatchDetails.getTableHeader().setReorderingAllowed(false);
                
    }
    //setters
    public void setTournamentIDLabel(String pTournamentIDLabel){
        TIDL.setText(pTournamentIDLabel);
    }
    
    public void setMatchIDLabel(String pMatchIDLabel){
        MIDL.setText(pMatchIDLabel);
    }
    
    public void setMatchTypeBox(String pMatchTypeBox){
        MatchTypeB.setSelectedItem(pMatchTypeBox);
    }
    
    public void setBallTypeBox(String pBallTypeBox){
        BallTypeB.setSelectedItem(pBallTypeBox);
    }
    
    public void setDateBox(java.util.Date pDateBox){
        DateB.setDate(pDateBox);
    }
    
    public void setHourBox(String pHourBox){
        HourB.setValue(pHourBox);
    }
    
    public void setMinutesBox(String pMinutesBox){
        MinutesB.setValue(pMinutesBox);
    }
    
    public void setDayBox(String pDayBox){
        DayB.setValue(pDayBox);
    }
    
    public void setLocationTypeBox(String pLocationTypeBox){
        LocationTypeB.setSelectedItem(pLocationTypeBox);
    }
    
    public void setGroundBox(String pGroundBox){
        GroundB.setSelectedItem(pGroundBox);
    }
    
    public void setDescriptionBox(String pDescriptionBox){
        DescriptionB.setText(pDescriptionBox);
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
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        DescriptionB = new javax.swing.JTextField();
        AddUmpire = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        TIDL = new javax.swing.JLabel();
        UpdateUmpire = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        DateB = new com.toedter.calendar.JDateChooser();
        DateV = new javax.swing.JLabel();
        LocationTypeV = new javax.swing.JLabel();
        DescriptionV = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TimeV = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        MIDL = new javax.swing.JLabel();
        HourB = new javax.swing.JSpinner();
        MinutesB = new javax.swing.JSpinner();
        DayB = new javax.swing.JSpinner();
        jLabel17 = new javax.swing.JLabel();
        MatchTypeV = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        BallTypeB = new javax.swing.JComboBox();
        BallTypeV = new javax.swing.JLabel();
        LocationTypeB = new javax.swing.JComboBox();
        MatchTypeB = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        GroundB = new javax.swing.JComboBox();
        GroundV = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MatchDetails = new javax.swing.JTable();
        BackL = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

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

        jLabel12.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Add / Update Tournament>");

        jLabel15.setFont(new java.awt.Font("Calibri Light", 0, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Add / Update Match");

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
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Match Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 153, 204))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Location Type");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Description");

        DescriptionB.setText("N/A");
        DescriptionB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DescriptionBMouseClicked(evt);
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

        TIDL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TIDL.setForeground(new java.awt.Color(51, 51, 51));
        TIDL.setText("Tournament ID will appear automatically");

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Date");

        DateB.setBackground(new java.awt.Color(0, 153, 204));
        DateB.setForeground(new java.awt.Color(0, 153, 204));
        DateB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DateBMouseClicked(evt);
            }
        });

        DateV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        DateV.setText(" ");

        LocationTypeV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        LocationTypeV.setText(" ");

        DescriptionV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        DescriptionV.setText(" ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Time");

        TimeV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TimeV.setText(" ");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Match ID");

        MIDL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MIDL.setForeground(new java.awt.Color(51, 51, 51));
        MIDL.setText("Match ID will assign automatically");

        HourB.setModel(new javax.swing.SpinnerListModel(new String[] {"Hrs", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));

        MinutesB.setModel(new javax.swing.SpinnerListModel(new String[] {"Min", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));

        DayB.setModel(new javax.swing.SpinnerListModel(new String[] {"AM", "PM"}));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Match Type");

        MatchTypeV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        MatchTypeV.setText(" ");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Ball Type");

        BallTypeB.setBackground(new java.awt.Color(0, 153, 204));
        BallTypeB.setForeground(new java.awt.Color(255, 255, 255));
        BallTypeB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select the ball type", "Red", "White" }));

        BallTypeV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        BallTypeV.setText(" ");

        LocationTypeB.setBackground(new java.awt.Color(0, 153, 204));
        LocationTypeB.setForeground(new java.awt.Color(255, 255, 255));
        LocationTypeB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select the location type", "Colombo", "Out Station" }));

        MatchTypeB.setBackground(new java.awt.Color(0, 153, 204));
        MatchTypeB.setForeground(new java.awt.Color(255, 255, 255));
        MatchTypeB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select the match type", "Test", "One Day", "Twenty Twenty" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Ground");

        GroundB.setBackground(new java.awt.Color(0, 153, 204));
        GroundB.setForeground(new java.awt.Color(255, 255, 255));
        GroundB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select the ground" }));

        GroundV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        GroundV.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(MatchTypeV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(HourB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MinutesB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(DayB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DescriptionV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DateV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(AddUmpire, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(UpdateUmpire, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DescriptionB, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LocationTypeV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TIDL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TimeV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MIDL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BallTypeB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BallTypeV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LocationTypeB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MatchTypeB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DateB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GroundB, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GroundV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(TIDL))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(MIDL))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(MatchTypeB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(MatchTypeV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(BallTypeB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(BallTypeV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(DateB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(DateV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HourB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(MinutesB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DayB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(TimeV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(LocationTypeB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LocationTypeV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(GroundB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(GroundV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DescriptionB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(0, 0, 0)
                .addComponent(DescriptionV)
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

        MatchDetails.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        MatchDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Tournament ID", "Match ID", "Match Type", "Ball Type", "Date", "Time", "Location Type", "Ground ID", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
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
        jScrollPane1.setViewportView(MatchDetails);

        BackL.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BackL.setForeground(new java.awt.Color(0, 153, 204));
        BackL.setText("<Back");
        BackL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackLMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 204));
        jLabel7.setText("(Add / Update Tournament)");

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
                            .addComponent(BackL, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BackL)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(317, 317, 317))
        );

        getAccessibleContext().setAccessibleName("Add / UpdateRetailer");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DescriptionBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DescriptionBMouseClicked
        setDescriptionBox("");
    }//GEN-LAST:event_DescriptionBMouseClicked

    private void AddUmpireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUmpireActionPerformed
        validationLableColorSet();
        validationLableReset();
        
        boolean Date = true;
        if(DateB.getDate()!=null){
            Match m0 = new Match();
            Date = m0.getValidDateRange(Integer.parseInt(TIDL.getText()), DateB.getDate());
        }
        
        if(MatchTypeB.getSelectedItem() == "Select the match type" || BallTypeB.getSelectedItem() == "Select the ball type" || DateB.getDate() == null || Date == false || HourB.getValue().equals("Hrs") || MinutesB.getValue().equals("Min") || LocationTypeB.getSelectedItem() == "Select the location type" || GroundB.getSelectedItem() == "Select the ground" || GroundB.getSelectedItem().toString().endsWith("(Not Available)") || DescriptionB.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Incomplete or invalid details of a match exsist! ");
            
            if(MatchTypeB.getSelectedItem() == "Select the match type" ){
                MatchTypeV.setText("*Enter match type");
            }
            if(BallTypeB.getSelectedItem() == "Select the ball type"){
                BallTypeV.setText("*Enter ball type");
            }
            
            if(DateB.getDate() == null){
                DateV.setText("*Enter date");
            }else if(Date ==false){
                DateV.setText("*Match date is out of tournament duration");
            }
         
            validateTime();
            
            if(LocationTypeB.getSelectedItem() == "Select the location type"){
                LocationTypeV.setText("*Enter location type");
            }
            
            validateGround();
            
            if(DescriptionB.getText().equals("")){
                DescriptionV.setText("*Enter Description");
            }
            
        }else{
            validationLableReset();
            String ID;
            SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
            Match m1;
            m1 = new Match();
            String Time = HourB.getValue()+":"+MinutesB.getValue()+" "+DayB.getValue();
      
            int GroundID = m1.filterGroundID(GroundB.getSelectedItem().toString());     
            Match m2;
            m2 = new Match(Integer.parseInt(TIDL.getText()), MatchTypeB.getSelectedItem().toString(), BallTypeB.getSelectedItem().toString(),formatDate.format(DateB.getDate()), Time, LocationTypeB.getSelectedItem().toString(), GroundID, DescriptionB.getText());
            m2.addMatch();
            ID = Integer.toString(m2.getMatchID());
            setMatchIDLabel(ID);
   
            Match m = new Match(MatchDetails);
            m.matchTableLoad(Integer.parseInt(TIDL.getText()));
            JOptionPane.showMessageDialog(null, "Match added successfully! ");
            
        }
    }//GEN-LAST:event_AddUmpireActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        validationLableReset();
        clearForm();
        
    }//GEN-LAST:event_ClearActionPerformed

    private void UpdateUmpireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateUmpireActionPerformed
        validationLableColorSet();
        validationLableReset();
        
        boolean Date = true;
        if(DateB.getDate()!=null){
            Match m0 = new Match();
            Date = m0.getValidDateRange(Integer.parseInt(TIDL.getText()), DateB.getDate());
        }
        
        if(MIDL.getText() == "Match ID will assign automatically" || MatchTypeB.getSelectedItem() == "Select the match type" || BallTypeB.getSelectedItem() == "Select the ball type" || DateB.getDate() == null || Date == false || HourB.getValue().equals("Hrs") || MinutesB.getValue().equals("Min") || LocationTypeB.getSelectedItem() == "Select the location type" || GroundB.getSelectedItem() == "Select the ground" || GroundB.getSelectedItem().toString().endsWith("(Not Available)") || DescriptionB.getText().equals("")){
            if(MIDL.getText() == "Match ID will assign automatically"){
                JOptionPane.showMessageDialog(null, "Select a match detail record first! ");
            }else{
                JOptionPane.showMessageDialog(null, "Incomplete or invalid details of a match exsist! ");
            }
            
            if(MatchTypeB.getSelectedItem() == "Select the match type" ){
                MatchTypeV.setText("*Enter match type");
            }
            if(BallTypeB.getSelectedItem() == "Select the ball type"){
                BallTypeV.setText("*Enter ball type");
            }
            
            if(DateB.getDate() == null){
                DateV.setText("*Enter date");
            }else if(Date ==false){
                DateV.setText("*Match date is out of tournament duration");
            }
         
            validateTime();
            
            if(LocationTypeB.getSelectedItem() == "Select the location type"){
                LocationTypeV.setText("*Enter location type");
            }
            
            validateGround();
            
            if(DescriptionB.getText().equals("")){
                DescriptionV.setText("*Enter Description");
            }
            
        }else{
            validationLableReset();
            SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
            
            Match m1;
            m1 = new Match();
            String Time = HourB.getValue()+":"+MinutesB.getValue()+" "+DayB.getValue();
      
            int GroundID = m1.filterGroundID(GroundB.getSelectedItem().toString());     
            
            Match m2;
            m2 = new Match(Integer.parseInt(TIDL.getText()),Integer.parseInt(MIDL.getText()), MatchTypeB.getSelectedItem().toString(), BallTypeB.getSelectedItem().toString(),formatDate.format(DateB.getDate()), Time, LocationTypeB.getSelectedItem().toString(), GroundID, DescriptionB.getText());
            m2.updateMatch();
   
            Match m = new Match(MatchDetails);
            m.matchTableLoad(Integer.parseInt(TIDL.getText()));
            
            JOptionPane.showMessageDialog(null, "Match updated successfully! ");
            
        }
    }//GEN-LAST:event_UpdateUmpireActionPerformed

    private void MatchDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MatchDetailsMouseClicked
        validationLableReset();
        int row = MatchDetails.getSelectedRow();
        setMatchIDLabel(MatchDetails.getValueAt(row, 1).toString());
        setMatchTypeBox(MatchDetails.getValueAt(row, 2).toString());
        setBallTypeBox(MatchDetails.getValueAt(row, 3).toString());
        Function f = new Function();
        setDateBox(f.getDate(MatchDetails.getValueAt(row, 4).toString()));
        String Time = MatchDetails.getValueAt(row, 5).toString();
        setHourBox(Time.substring(0, 2));
        setMinutesBox(Time.substring(3,5));
        setDayBox(Time.substring(6, 8));
        setLocationTypeBox(MatchDetails.getValueAt(row, 6).toString());
        int GroundID =Integer.parseInt(MatchDetails.getValueAt(row, 7).toString());
        Match match1 = new Match();
        setGroundBox(match1.getGroundDetails(GroundID));
        setDescriptionBox(MatchDetails.getValueAt(row, 8).toString());
    
    }//GEN-LAST:event_MatchDetailsMouseClicked

    private void DateBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DateBMouseClicked
        //setDOB(null);
    }//GEN-LAST:event_DateBMouseClicked

    private void BackLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackLMouseClicked
        addUpdateTournament AUT = new addUpdateTournament(Desktop, Integer.parseInt(TIDL.getText()));
        Desktop.add(AUT);
        this.dispose();
        AUT.setVisible(true);
    }//GEN-LAST:event_BackLMouseClicked
    
    //Clear all the error messages
    public void validationLableReset(){
        
        MatchTypeV.setText(" ");
        BallTypeV.setText(" ");
        DateV.setText(" ");
        TimeV.setText(" ");
        LocationTypeV.setText(" ");
        GroundV.setText(" ");
        DescriptionV.setText(" ");
        
    }
    
    //Set color red for all the validation label
    public void validationLableColorSet(){
        
        
        MatchTypeV.setForeground(Color.RED);
        BallTypeV.setForeground(Color.RED);
        DateV.setForeground(Color.RED);
        TimeV.setForeground(Color.RED);
        LocationTypeV.setForeground(Color.RED);
        GroundV.setForeground(Color.RED);
        DescriptionV.setForeground(Color.RED);
        
    }
    
    
    //Clear all the text boxes and selection boxes in the form
    public void clearForm(){
        
        setMatchIDLabel("Match ID will assign automatically");
        setMatchTypeBox("Select the match type");
        setBallTypeBox("Select the ball type");
        setDateBox(null);
        setHourBox("Hrs");
        setMinutesBox("Min");
        setDayBox("AM");
        setLocationTypeBox("Select the location type");
        setGroundBox("Select the ground");
        setDescriptionBox("N/A");
    
    }
    
    public void validateGround(){
        if(GroundB.getSelectedItem() == "Select the ground"||GroundB.getSelectedItem().toString().endsWith("(Not Available)")){
            if(GroundB.getSelectedItem() == "Select the ground"){
                GroundV.setText("*Enter ground");
            }
            if(GroundB.getSelectedItem().toString().endsWith("(Not Available)")){
                    GroundV.setText("*Ground is not available");
            }
        }
    }
    
    public void validateTime(){
        if(HourB.getValue().equals("Hrs") || MinutesB.getValue().equals("Min")){
            char Hrs, Min;
                        
            if(HourB.getValue().equals("Hrs")){
                Hrs = 'E';
            }else{
                Hrs = 'N';
            }
                
            if(MinutesB.getValue().equals("Min")){
                Min = 'E';
            }else{
                Min = 'N';
            }
                
            switch(Hrs){
                case 'E':
                    if(Min=='E'){
                        TimeV.setText("*Enter time");
                    }else if(Min=='N'){
                        TimeV.setText("*Enter hrs");
                    }
                    break;
                case 'N':  
                    if(Min=='E'){
                        TimeV.setText("*Enter min");
                    }else if(Min=='N'){
                     
                    }
                    break;
            }
        }
    }
    
    String Result;  
    JDesktopPane Desktop;
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddUmpire;
    private javax.swing.JLabel BackL;
    private javax.swing.JComboBox BallTypeB;
    private javax.swing.JLabel BallTypeV;
    private javax.swing.JButton Clear;
    private com.toedter.calendar.JDateChooser DateB;
    private javax.swing.JLabel DateV;
    private javax.swing.JSpinner DayB;
    private javax.swing.JTextField DescriptionB;
    private javax.swing.JLabel DescriptionV;
    private javax.swing.JComboBox GroundB;
    private javax.swing.JLabel GroundV;
    private javax.swing.JSpinner HourB;
    private javax.swing.JComboBox LocationTypeB;
    private javax.swing.JLabel LocationTypeV;
    private javax.swing.JLabel MIDL;
    private javax.swing.JTable MatchDetails;
    private javax.swing.JComboBox MatchTypeB;
    private javax.swing.JLabel MatchTypeV;
    private javax.swing.JSpinner MinutesB;
    private javax.swing.JLabel TIDL;
    private javax.swing.JLabel TimeV;
    private javax.swing.JButton UpdateUmpire;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
