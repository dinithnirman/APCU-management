
package GUI.Internal.User;
import Class.Ground;
import Validation.Validation;
import java.awt.Color;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class addUpdateGround extends javax.swing.JInternalFrame {
    
    public addUpdateGround() {
        initComponents();
        nonMove();
        tableNonMove();
        Ground g = new Ground(GroundDetails);
        g.groundTableLoad();
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
        GroundDetails.getTableHeader().setReorderingAllowed(false);
                
    }
    
    //setters
    public void setIDLabel(String pidLabel){
        IDL.setText(pidLabel);
    }
     
    public void setNameBox(String pNameBox){
        NameB.setText(pNameBox);
    }
    
    public void setTelephoneNo1Box(String pTelephoneNo1Box){
        TelephoneNo1B.setText(pTelephoneNo1Box);
    }
    
    public void setAddressBox(String pAddressBox){
        AddressB.setText(pAddressBox);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        NameB = new javax.swing.JTextField();
        AddressB = new javax.swing.JTextField();
        AddGround = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        IDL = new javax.swing.JLabel();
        UpdateGround = new javax.swing.JButton();
        TelephoneNo1B = new javax.swing.JTextField();
        NameV = new javax.swing.JLabel();
        TelephoneNoV = new javax.swing.JLabel();
        AddressV = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        GroundDetails = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        AvailabilityL = new javax.swing.JLabel();
        ChangeL = new javax.swing.JLabel();
        Change = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setTitle(" Add / Update Scorer");
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel11.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Manage Ground >");

        jLabel12.setFont(new java.awt.Font("Calibri Light", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Add / Update Ground");

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
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Ground Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 153, 204))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Telephone Number");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Address");

        NameB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NameBMouseClicked(evt);
            }
        });

        AddressB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddressBMouseClicked(evt);
            }
        });

        AddGround.setBackground(new java.awt.Color(0, 153, 204));
        AddGround.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddGround.setForeground(new java.awt.Color(255, 255, 255));
        AddGround.setText("Add");
        AddGround.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddGround.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddGroundActionPerformed(evt);
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
        jLabel13.setText("Ground ID");

        IDL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        IDL.setForeground(new java.awt.Color(51, 51, 51));
        IDL.setText("Ground ID will assign automatically");

        UpdateGround.setBackground(new java.awt.Color(0, 153, 204));
        UpdateGround.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UpdateGround.setForeground(new java.awt.Color(255, 255, 255));
        UpdateGround.setText("Update");
        UpdateGround.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UpdateGround.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateGroundActionPerformed(evt);
            }
        });

        TelephoneNo1B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TelephoneNo1BMouseClicked(evt);
            }
        });

        NameV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        NameV.setText(" ");

        TelephoneNoV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TelephoneNoV.setText(" ");

        AddressV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        AddressV.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(AddressV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NameV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(AddGround, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(UpdateGround, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AddressB, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NameB, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TelephoneNoV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TelephoneNo1B, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IDL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(52, Short.MAX_VALUE))
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(AddressB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(AddressV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TelephoneNo1B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TelephoneNoV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddGround, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateGround, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(468, 468, 468))
        );

        jScrollPane1.setBackground(new java.awt.Color(0, 153, 204));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 204)));
        jScrollPane1.setForeground(new java.awt.Color(51, 51, 51));

        GroundDetails.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        GroundDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Ground ID", "Name", "Address", "TelephoneNo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        GroundDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GroundDetails.setGridColor(new java.awt.Color(255, 255, 255));
        GroundDetails.setSelectionBackground(new java.awt.Color(0, 153, 204));
        GroundDetails.setShowHorizontalLines(false);
        GroundDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GroundDetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(GroundDetails);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)), "Change Availability", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 153, 204))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Availability");

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
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AvailabilityL, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(ChangeL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Change, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(AvailabilityL))
                .addGap(18, 18, 18)
                .addComponent(ChangeL)
                .addGap(18, 18, 18)
                .addComponent(Change, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
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
                        .addGap(72, 72, 72)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Add / UpdateRetailer");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NameBMouseClicked
        setNameBox(null);
    }//GEN-LAST:event_NameBMouseClicked

    private void AddressBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddressBMouseClicked
        setAddressBox(null);
    }//GEN-LAST:event_AddressBMouseClicked

    private void AddGroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddGroundActionPerformed
        setIDLabel("Ground ID will assign automatically");
        validationLableColorSet();
        validationLableReset();
        Validation v = new Validation();
        telephoneValidation(1);
              
        if(NameB.getText().equals("") || AddressB.getText().equals("") || TP1=='E' || TP1=='I'){
            JOptionPane.showMessageDialog(null, "Incomplete or invalid details of a ground exsist! ");
            
            if(NameB.getText().equals("")){
                NameV.setText("*Enter name");
            }
            if(AddressB.getText().equals("")){
                AddressV.setText("*Enter address");
            }
            telephoneValidation(2);
             
        }else{
            validationLableReset();
        
            Ground g1 = new Ground(NameB.getText(), AddressB.getText(), TelephoneNo1B.getText());
            g1.addGround();
            
            Ground g = new Ground(GroundDetails);
            g.groundTableLoad();
            JOptionPane.showMessageDialog(null, "Ground added successfully! ");
            
        }
    }//GEN-LAST:event_AddGroundActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        validationLableReset();
        clearForm();
        
    }//GEN-LAST:event_ClearActionPerformed

    private void UpdateGroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateGroundActionPerformed
        validationLableColorSet();
        validationLableReset();
        Validation v = new Validation();
        telephoneValidation(1);
              
        if(IDL.getText().equals("Ground ID will assign automatically") || NameB.getText().equals("") || AddressB.getText().equals("") || TP1=='E'  || TP1=='I'){
            if(IDL.getText() == "Ground ID will assign automatically"){
                JOptionPane.showMessageDialog(null, "Select a ground detail record first! ");
            }else{
                JOptionPane.showMessageDialog(null, "Incomplete or invalid details of a ground exsist! ");
            }
            if(NameB.getText().equals("")){
                NameV.setText("*Enter name");
            }
            if(AddressB.getText().equals("")){
                AddressV.setText("*Enter address");
            }
            telephoneValidation(2);
            
             
        }else{
            validationLableReset();
        
            Ground g2 = new Ground(Integer.parseInt(IDL.getText()),NameB.getText(), AddressB.getText(), TelephoneNo1B.getText());
            g2.updateGround();
            
            Ground g = new Ground(GroundDetails);
            g.groundTableLoad();
            JOptionPane.showMessageDialog(null, "Ground updated successfully! ");
            
        }
    }//GEN-LAST:event_UpdateGroundActionPerformed

    private void TelephoneNo1BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelephoneNo1BMouseClicked
        setTelephoneNo1Box(null);
    }//GEN-LAST:event_TelephoneNo1BMouseClicked

    private void GroundDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GroundDetailsMouseClicked
        int row = GroundDetails.getSelectedRow();
        int ID = Integer.parseInt(GroundDetails.getValueAt(row, 0).toString());
        setIDLabel(GroundDetails.getValueAt(row, 0).toString());
        setNameBox(GroundDetails.getValueAt(row, 1).toString());
        setAddressBox(GroundDetails.getValueAt(row, 2).toString());
        setTelephoneNo1Box(GroundDetails.getValueAt(row, 3).toString());
        Ground g3 = new Ground();
        String Availability = g3.getGroundAvailability(ID);
        if(Availability.equals("Not Available")){
            AvailabilityL.setForeground(Color.RED);
            setChangeLabel("Change into available");
        }else{
            AvailabilityL.setForeground(Color.GREEN);
            setChangeLabel("Change into not available");
        }
        setAvailabilityLabel(Availability);
       
    }//GEN-LAST:event_GroundDetailsMouseClicked

    private void ChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeActionPerformed

        Ground g5 = new Ground();
        String Availability = AvailabilityL.getText();

        if(Availability.equals("Availability will appear here")){
            JOptionPane.showMessageDialog(null, "Select a ground detail record first! ");
        }else{

            int ID =Integer.parseInt(IDL.getText());
            if(Availability.equals("Not Available")){
                g5.setGroundAvailability("Available", ID);
            }else{
                g5.setGroundAvailability("Not Available", ID);
            }

            Availability = g5.getGroundAvailability(ID);

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
    
    //Clear all the error messages
    public void validationLableReset(){
        NameV.setText(" ");
        TelephoneNoV.setText(" ");
        AddressV.setText(" ");
    }
    
    //Set color red for all the validation label
    public void validationLableColorSet(){
        NameV.setForeground(Color.RED);
        TelephoneNoV.setForeground(Color.RED);
        AddressV.setForeground(Color.RED);
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
        
           
        }else{
            switch(TP1){
                case 'E':
                    TelephoneNoV.setText("*Enter telephone no");
                    break;
                case 'V':
                    TelephoneNoV.setText(" ");
                    break;
                case 'I':
                    TelephoneNoV.setText("*Invalid telephone no");
                    break;
            }
            
        } 
    
    }
    
    
    //Clear all the text boxes and selection boxes in the form
    public void clearForm(){
        
        setIDLabel("Ground ID will assign automatically");
        setNameBox("");
        setTelephoneNo1Box(null);
        setAddressBox("");
        setAvailabilityLabel("Availability will appear here");
        AvailabilityL.setForeground(Color.DARK_GRAY);
        setChangeLabel("Change into ...");
    }
    
    char TP1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddGround;
    private javax.swing.JTextField AddressB;
    private javax.swing.JLabel AddressV;
    private javax.swing.JLabel AvailabilityL;
    private javax.swing.JButton Change;
    private javax.swing.JLabel ChangeL;
    private javax.swing.JButton Clear;
    private javax.swing.JTable GroundDetails;
    private javax.swing.JLabel IDL;
    private javax.swing.JTextField NameB;
    private javax.swing.JLabel NameV;
    private javax.swing.JTextField TelephoneNo1B;
    private javax.swing.JLabel TelephoneNoV;
    private javax.swing.JButton UpdateGround;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
