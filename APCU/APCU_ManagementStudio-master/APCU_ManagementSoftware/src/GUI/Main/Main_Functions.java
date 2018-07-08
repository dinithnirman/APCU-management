/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Main;

import Class.Login;
import GUI.Internal.Admin.addUpdateAdmin;
import GUI.Internal.Admin.addUpdateUser;
import GUI.Internal.Admin.deactivateUser;
import GUI.Internal.Admin.loginHistory;
import GUI.Internal.Admin.userList;
import GUI.Internal.User.MakePayment01and02;
import GUI.Internal.User.MakeUpdateAssignments01and02;
import GUI.Internal.User.PaymentHistory;
import GUI.Internal.User.ReceivedPayment;
import GUI.Internal.User.ViewScorer;
import GUI.Internal.User.ViewTournament;
import GUI.Internal.User.ViewUmpire;
import GUI.Internal.User.addUpdateGround;
import GUI.Internal.User.addUpdateScorer;
import GUI.Internal.User.addUpdateTournament;
import GUI.Internal.User.addUpdateUmpire;
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class Main_Functions extends javax.swing.JFrame {

    DateFormat df = new SimpleDateFormat("dd/MM/yy");
    Date sysDate = new Date();
    
    public Main_Functions() {
        initComponents();
        showDate();
    }
    
    public void showDate(){
        ActionListener actiondate= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 java.util.Date mydate = new Date();
                 timelbl.setText(df.format(sysDate)+" "+mydate.getHours()+":"+mydate.getMinutes()+":"+mydate.getSeconds());
            }
        };
        new javax.swing.Timer(1000,actiondate).start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        Login_panel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usernametxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        signIn = new javax.swing.JButton();
        passwordtxt = new javax.swing.JPasswordField();
        typeCombo = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        timelbl = new javax.swing.JLabel();
        user_panel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        AddUpdateUmpire = new javax.swing.JButton();
        AddUpdateTournament = new javax.swing.JButton();
        AddUpdateGround = new javax.swing.JButton();
        MakePayment = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        PaymentHistorySummery = new javax.swing.JButton();
        ViewUmpire = new javax.swing.JButton();
        ViewTournament = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        MakeUpdateAssignments = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        AddUpdateScorer = new javax.swing.JButton();
        ViewScorer = new javax.swing.JButton();
        RecievedPayment = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel13 = new javax.swing.JLabel();
        Admin_tasks = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        addUpdateUser = new javax.swing.JButton();
        addupdateAdmin = new javax.swing.JButton();
        actDeactUser = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jButton13 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel15 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new java.awt.CardLayout());

        Login_panel.setBackground(new java.awt.Color(0, 51, 102));
        Login_panel.setMaximumSize(new java.awt.Dimension(1280, 720));
        Login_panel.setMinimumSize(new java.awt.Dimension(1280, 720));
        Login_panel.setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login_icon.png"))); // NOI18N

        usernametxt.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        usernametxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernametxt.setText("Username");
        usernametxt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 153, 255))); // NOI18N
        usernametxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernametxtMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("NEOTERIC", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LOGIN");

        signIn.setBackground(new java.awt.Color(0, 153, 255));
        signIn.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        signIn.setForeground(new java.awt.Color(255, 255, 255));
        signIn.setText("Sign In");
        signIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInActionPerformed(evt);
            }
        });

        passwordtxt.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        passwordtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordtxt.setText("password");
        passwordtxt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 153, 255))); // NOI18N
        passwordtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordtxtMouseClicked(evt);
            }
        });
        passwordtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordtxtKeyPressed(evt);
            }
        });

        typeCombo.setBackground(new java.awt.Color(0, 153, 255));
        typeCombo.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        typeCombo.setForeground(new java.awt.Color(255, 255, 255));
        typeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Login option", "User", "Administrator", " " }));
        typeCombo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        typeCombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        typeCombo.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(112, 112, 112))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(signIn, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(passwordtxt)
                        .addComponent(usernametxt, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                        .addComponent(typeCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {passwordtxt, usernametxt});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(typeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(signIn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {passwordtxt, usernametxt});

        jPanel4.setBackground(new java.awt.Color(0, 153, 255));

        jLabel11.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("We help you to assign Umpires Efficiently");

        jLabel12.setFont(new java.awt.Font("Calibri Light", 0, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Let's begin");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addGap(164, 164, 164))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(166, 166, 166))
        );

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blue&yellow_bannerS.jpg"))); // NOI18N

        timelbl.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        timelbl.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Login_panelLayout = new javax.swing.GroupLayout(Login_panel);
        Login_panel.setLayout(Login_panelLayout);
        Login_panelLayout.setHorizontalGroup(
            Login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Login_panelLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(Login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Login_panelLayout.createSequentialGroup()
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1026, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(timelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        Login_panelLayout.setVerticalGroup(
            Login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Login_panelLayout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addGroup(Login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jPanel1.add(Login_panel, "card2");

        user_panel.setBackground(new java.awt.Color(0, 51, 102));
        user_panel.setMaximumSize(new java.awt.Dimension(1280, 720));
        user_panel.setMinimumSize(new java.awt.Dimension(1280, 720));

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));

        AddUpdateUmpire.setBackground(new java.awt.Color(0, 204, 255));
        AddUpdateUmpire.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AddUpdateUmpire.setForeground(new java.awt.Color(255, 255, 255));
        AddUpdateUmpire.setText("Add / Update Umpire");
        AddUpdateUmpire.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddUpdateUmpire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUpdateUmpireActionPerformed(evt);
            }
        });

        AddUpdateTournament.setBackground(new java.awt.Color(0, 204, 255));
        AddUpdateTournament.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AddUpdateTournament.setForeground(new java.awt.Color(255, 255, 255));
        AddUpdateTournament.setText("Add / Update Tournament & Match");
        AddUpdateTournament.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddUpdateTournament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUpdateTournamentActionPerformed(evt);
            }
        });

        AddUpdateGround.setBackground(new java.awt.Color(0, 204, 255));
        AddUpdateGround.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AddUpdateGround.setForeground(new java.awt.Color(255, 255, 255));
        AddUpdateGround.setText("Add / Update Ground");
        AddUpdateGround.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddUpdateGround.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUpdateGroundActionPerformed(evt);
            }
        });

        MakePayment.setBackground(new java.awt.Color(0, 204, 255));
        MakePayment.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        MakePayment.setForeground(new java.awt.Color(255, 255, 255));
        MakePayment.setText("Make Payment");
        MakePayment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MakePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MakePaymentActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Manage Umpire");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Manage Tournament");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Manage Ground");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Manage Payments");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Reports");

        PaymentHistorySummery.setBackground(new java.awt.Color(0, 204, 255));
        PaymentHistorySummery.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        PaymentHistorySummery.setForeground(new java.awt.Color(255, 255, 255));
        PaymentHistorySummery.setText("Payment History & Summery");
        PaymentHistorySummery.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PaymentHistorySummery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentHistorySummeryActionPerformed(evt);
            }
        });

        ViewUmpire.setBackground(new java.awt.Color(0, 204, 255));
        ViewUmpire.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ViewUmpire.setForeground(new java.awt.Color(255, 255, 255));
        ViewUmpire.setText("View Umpire");
        ViewUmpire.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewUmpire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewUmpireActionPerformed(evt);
            }
        });

        ViewTournament.setBackground(new java.awt.Color(0, 204, 255));
        ViewTournament.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ViewTournament.setForeground(new java.awt.Color(255, 255, 255));
        ViewTournament.setText("View Tournament");
        ViewTournament.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewTournament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewTournamentActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Go Back");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Manage Assignments");

        MakeUpdateAssignments.setBackground(new java.awt.Color(0, 204, 255));
        MakeUpdateAssignments.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        MakeUpdateAssignments.setForeground(new java.awt.Color(255, 255, 255));
        MakeUpdateAssignments.setText("Make / Update Assignments");
        MakeUpdateAssignments.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MakeUpdateAssignments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MakeUpdateAssignmentsActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Manage Scorer");

        AddUpdateScorer.setBackground(new java.awt.Color(0, 204, 255));
        AddUpdateScorer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AddUpdateScorer.setForeground(new java.awt.Color(255, 255, 255));
        AddUpdateScorer.setText("Add / Update Scorer");
        AddUpdateScorer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddUpdateScorer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUpdateScorerActionPerformed(evt);
            }
        });

        ViewScorer.setBackground(new java.awt.Color(0, 204, 255));
        ViewScorer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ViewScorer.setForeground(new java.awt.Color(255, 255, 255));
        ViewScorer.setText("View Scorer");
        ViewScorer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewScorer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewScorerActionPerformed(evt);
            }
        });

        RecievedPayment.setBackground(new java.awt.Color(0, 204, 255));
        RecievedPayment.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RecievedPayment.setForeground(new java.awt.Color(255, 255, 255));
        RecievedPayment.setText("Recieved Payment");
        RecievedPayment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RecievedPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecievedPaymentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(AddUpdateUmpire, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ViewUmpire, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ViewTournament, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AddUpdateGround, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MakePayment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PaymentHistorySummery, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AddUpdateTournament, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(MakeUpdateAssignments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(AddUpdateScorer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ViewScorer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel14)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(RecievedPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(AddUpdateUmpire)
                .addGap(0, 0, 0)
                .addComponent(ViewUmpire)
                .addGap(20, 20, 20)
                .addComponent(jLabel10)
                .addGap(1, 1, 1)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(AddUpdateScorer)
                .addGap(0, 0, 0)
                .addComponent(ViewScorer)
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(1, 1, 1)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddUpdateTournament)
                .addGap(0, 0, 0)
                .addComponent(ViewTournament)
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addGap(1, 1, 1)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddUpdateGround)
                .addGap(20, 20, 20)
                .addComponent(jLabel14)
                .addGap(1, 1, 1)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MakeUpdateAssignments)
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addGap(1, 1, 1)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RecievedPayment)
                .addGap(0, 0, 0)
                .addComponent(MakePayment)
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addGap(1, 1, 1)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PaymentHistorySummery)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(20, 20, 20))
        );

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N

        jDesktopPane1.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout user_panelLayout = new javax.swing.GroupLayout(user_panel);
        user_panel.setLayout(user_panelLayout);
        user_panelLayout.setHorizontalGroup(
            user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_panelLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1))
        );
        user_panelLayout.setVerticalGroup(
            user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jDesktopPane1)
        );

        jPanel1.add(user_panel, "card3");

        Admin_tasks.setBackground(new java.awt.Color(0, 51, 102));

        jPanel5.setBackground(new java.awt.Color(255, 204, 0));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Manage Users");

        addUpdateUser.setBackground(new java.awt.Color(255, 153, 51));
        addUpdateUser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addUpdateUser.setForeground(new java.awt.Color(255, 255, 255));
        addUpdateUser.setText("Add/Update User account");
        addUpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUpdateUserActionPerformed(evt);
            }
        });

        addupdateAdmin.setBackground(new java.awt.Color(255, 153, 51));
        addupdateAdmin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addupdateAdmin.setForeground(new java.awt.Color(255, 255, 255));
        addupdateAdmin.setText("Add/Update Admin account");
        addupdateAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addupdateAdminActionPerformed(evt);
            }
        });

        actDeactUser.setBackground(new java.awt.Color(255, 153, 51));
        actDeactUser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        actDeactUser.setForeground(new java.awt.Color(255, 255, 255));
        actDeactUser.setText("Activate/Deactivate user account");
        actDeactUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actDeactUserActionPerformed(evt);
            }
        });

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Reports");

        jButton13.setBackground(new java.awt.Color(255, 153, 51));
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("View login history");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Go Back");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(255, 153, 51));
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("List of users");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator7)
                    .addComponent(addUpdateUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addupdateAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(actDeactUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addUpdateUser)
                .addGap(3, 3, 3)
                .addComponent(addupdateAdmin)
                .addGap(3, 3, 3)
                .addComponent(actDeactUser)
                .addGap(30, 30, 30)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton13)
                .addGap(3, 3, 3)
                .addComponent(jButton14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(28, 28, 28))
        );

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N

        jDesktopPane2.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Admin_tasksLayout = new javax.swing.GroupLayout(Admin_tasks);
        Admin_tasks.setLayout(Admin_tasksLayout);
        Admin_tasksLayout.setHorizontalGroup(
            Admin_tasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Admin_tasksLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane2))
        );
        Admin_tasksLayout.setVerticalGroup(
            Admin_tasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jDesktopPane2)
        );

        jPanel1.add(Admin_tasks, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernametxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernametxtMouseClicked
        usernametxt.setForeground(Color.black);
        usernametxt.setText("");
        
    }//GEN-LAST:event_usernametxtMouseClicked

    private void passwordtxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordtxtMouseClicked
        passwordtxt.setForeground(Color.black);
        passwordtxt.setText("");
    }//GEN-LAST:event_passwordtxtMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        Main_Functions mf = new Main_Functions();
        mf.setExtendedState(Main_Functions.MAXIMIZED_BOTH);
        mf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void signInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInActionPerformed
        /*String selection = typeCombo.getSelectedItem().toString();
        
        if(selection.equals("User")){
            user_panel.setVisible(true);
            Login_panel.setVisible(false);
        }
        else if(selection.equals("Administrator")){
            Admin_tasks.setVisible(true);
            Login_panel.setVisible(false);
        }*/
        int selection = typeCombo.getSelectedIndex();
        String username,password,time;
        username = usernametxt.getText().toString();
        password = passwordtxt.getText().toString();
        time = timelbl.getText();
        
        if(selection==0 || username.equals("") || password.equals("")){
            JOptionPane.showMessageDialog(null, "Invalid Login attempt!", "Error", JOptionPane.ERROR_MESSAGE);
            
            if(selection==0){
                JOptionPane.showMessageDialog(null, "Select login opion!", "Invalid option", JOptionPane.ERROR_MESSAGE);    
            }
            if(username.equals("")){
                usernametxt.setForeground(Color.red);
                usernametxt.setText("username cannot be empty!");
            }
            if(password.equals("")){
                passwordtxt.setForeground(Color.red);
                JOptionPane.showMessageDialog(null, "Password cannot be empty!", "Invalid data", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(selection!=0 && username.equals("test") && password.equals("test")){
            
                if(selection==1){
                    user_panel.setVisible(true);
                    Login_panel.setVisible(false);  
                }
                else if(selection==2){
                    Admin_tasks.setVisible(true);
                    Login_panel.setVisible(false);
                }
            
        }
        else{
            Login lg = new Login(username,password,time,selection);
            int result = lg.LoginAttempt();
            
            if(result==1){
                if(selection==1){
                    user_panel.setVisible(true);
                    Login_panel.setVisible(false);  
                }
                else if(selection==2){
                    Admin_tasks.setVisible(true);
                    Login_panel.setVisible(false);
                }
            }
            else if(result==-1){
                usernametxt.setForeground(Color.red);
                passwordtxt.setForeground(Color.red);
                usernametxt.setText("Incorrect username/password!");
                
            }
        }
        
        
        
    }//GEN-LAST:event_signInActionPerformed

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        Login_panel.setVisible(true);
        Admin_tasks.setVisible(false);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void AddUpdateUmpireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUpdateUmpireActionPerformed
        jDesktopPane1.removeAll();
        addUpdateUmpire AUR = new addUpdateUmpire();
        jDesktopPane1.add(AUR).setVisible(true);
    }//GEN-LAST:event_AddUpdateUmpireActionPerformed

    private void AddUpdateScorerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUpdateScorerActionPerformed
        jDesktopPane1.removeAll();
        addUpdateScorer AUS = new addUpdateScorer();
        jDesktopPane1.add(AUS).setVisible(true);
    }//GEN-LAST:event_AddUpdateScorerActionPerformed

    private void addUpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUpdateUserActionPerformed
        jDesktopPane2.removeAll();
        addUpdateUser auu = new addUpdateUser();
        jDesktopPane2.add(auu).setVisible(true);
        
    }//GEN-LAST:event_addUpdateUserActionPerformed

    private void AddUpdateGroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUpdateGroundActionPerformed
        jDesktopPane1.removeAll();
        addUpdateGround AUG = new addUpdateGround();
        jDesktopPane1.add(AUG).setVisible(true);
    }//GEN-LAST:event_AddUpdateGroundActionPerformed

    private void addupdateAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addupdateAdminActionPerformed
        jDesktopPane2.removeAll();
        addUpdateAdmin aua = new addUpdateAdmin();
        jDesktopPane2.add(aua).setVisible(true);
    }//GEN-LAST:event_addupdateAdminActionPerformed

    private void AddUpdateTournamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUpdateTournamentActionPerformed
        jDesktopPane1.removeAll();
        addUpdateTournament AUT = new addUpdateTournament(jDesktopPane1,0);
        jDesktopPane1.add(AUT).setVisible(true);
    }//GEN-LAST:event_AddUpdateTournamentActionPerformed

    private void actDeactUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actDeactUserActionPerformed
        jDesktopPane2.removeAll();
        deactivateUser du = new deactivateUser();
        jDesktopPane2.add(du).setVisible(true);
    }//GEN-LAST:event_actDeactUserActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        jDesktopPane2.removeAll();
        userList ul = new userList();
        jDesktopPane2.add(ul).setVisible(true);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void MakeUpdateAssignmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MakeUpdateAssignmentsActionPerformed
        jDesktopPane1.removeAll();
        MakeUpdateAssignments01and02 MUA = new MakeUpdateAssignments01and02(jDesktopPane1,0,0);
        jDesktopPane1.add(MUA).setVisible(true);
    }//GEN-LAST:event_MakeUpdateAssignmentsActionPerformed

    private void passwordtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordtxtKeyPressed
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
         
            int selection = typeCombo.getSelectedIndex();
            String username,password,time;
            username = usernametxt.getText().toString();
            password = passwordtxt.getText().toString();
            time = timelbl.getText();

            if(selection==0 || username.equals("") || password.equals("")){
                JOptionPane.showMessageDialog(null, "Invalid Login attempt!", "Error", JOptionPane.ERROR_MESSAGE);

                if(selection==0){
                    JOptionPane.showMessageDialog(null, "Select login opion!", "Invalid option", JOptionPane.ERROR_MESSAGE);    
                }
                if(username.equals("")){
                    usernametxt.setForeground(Color.red);
                    usernametxt.setText("username cannot be empty!");
                }
                if(password.equals("")){
                    passwordtxt.setForeground(Color.red);
                    JOptionPane.showMessageDialog(null, "Password cannot be empty!", "Invalid data", JOptionPane.ERROR_MESSAGE);
                }
            }
            else if(selection!=0 && username.equals("test") && password.equals("test")){

                    if(selection==1){
                        user_panel.setVisible(true);
                        Login_panel.setVisible(false);  
                    }
                    else if(selection==2){
                        Admin_tasks.setVisible(true);
                        Login_panel.setVisible(false);
                    }

            }
            else{
                Login lg = new Login(username,password,time,selection);
                int result = lg.LoginAttempt();

                if(result==1){
                    if(selection==1){
                        user_panel.setVisible(true);
                        Login_panel.setVisible(false);  
                    }
                    else if(selection==2){
                        Admin_tasks.setVisible(true);
                        Login_panel.setVisible(false);
                    }
                }
                else if(result==-1){
                    usernametxt.setForeground(Color.red);
                    passwordtxt.setForeground(Color.red);
                    usernametxt.setText("Incorrect username/password!");

                }
            }
             
         }
    }//GEN-LAST:event_passwordtxtKeyPressed

    private void RecievedPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecievedPaymentActionPerformed
        jDesktopPane1.removeAll();
        ReceivedPayment RP = new ReceivedPayment();
        jDesktopPane1.add(RP).setVisible(true);
    }//GEN-LAST:event_RecievedPaymentActionPerformed

    private void MakePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MakePaymentActionPerformed
        jDesktopPane1.removeAll();
        MakePayment01and02 PP = new MakePayment01and02(jDesktopPane1,0,0);
        jDesktopPane1.add(PP).setVisible(true);
    }//GEN-LAST:event_MakePaymentActionPerformed

    private void ViewUmpireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewUmpireActionPerformed
        jDesktopPane1.removeAll();
        ViewUmpire VU = new ViewUmpire();
        jDesktopPane1.add(VU).setVisible(true);
    }//GEN-LAST:event_ViewUmpireActionPerformed

    private void ViewScorerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewScorerActionPerformed
        jDesktopPane1.removeAll();
        ViewScorer VS = new ViewScorer();
        jDesktopPane1.add(VS).setVisible(true);
    }//GEN-LAST:event_ViewScorerActionPerformed

    private void ViewTournamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewTournamentActionPerformed
        jDesktopPane1.removeAll();
        ViewTournament VT = new ViewTournament();
        jDesktopPane1.add(VT).setVisible(true);
    }//GEN-LAST:event_ViewTournamentActionPerformed

    private void PaymentHistorySummeryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentHistorySummeryActionPerformed
        jDesktopPane1.removeAll();
        PaymentHistory PH = new PaymentHistory();
        jDesktopPane1.add(PH).setVisible(true);
    }//GEN-LAST:event_PaymentHistorySummeryActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        jDesktopPane2.removeAll();
        loginHistory LH = new loginHistory();
        jDesktopPane2.add(LH).setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_Functions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Functions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Functions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Functions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Functions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddUpdateGround;
    private javax.swing.JButton AddUpdateScorer;
    private javax.swing.JButton AddUpdateTournament;
    private javax.swing.JButton AddUpdateUmpire;
    private javax.swing.JPanel Admin_tasks;
    private javax.swing.JPanel Login_panel;
    private javax.swing.JButton MakePayment;
    private javax.swing.JButton MakeUpdateAssignments;
    private javax.swing.JButton PaymentHistorySummery;
    private javax.swing.JButton RecievedPayment;
    private javax.swing.JButton ViewScorer;
    private javax.swing.JButton ViewTournament;
    private javax.swing.JButton ViewUmpire;
    private javax.swing.JButton actDeactUser;
    private javax.swing.JButton addUpdateUser;
    private javax.swing.JButton addupdateAdmin;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPasswordField passwordtxt;
    private javax.swing.JButton signIn;
    private javax.swing.JLabel timelbl;
    private javax.swing.JComboBox<String> typeCombo;
    private javax.swing.JPanel user_panel;
    private javax.swing.JTextField usernametxt;
    // End of variables declaration//GEN-END:variables
}
