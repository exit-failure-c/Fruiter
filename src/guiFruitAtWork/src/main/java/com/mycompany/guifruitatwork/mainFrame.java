/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.guifruitatwork;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mhsaf
 */
public class mainFrame extends javax.swing.JFrame {

    private ArrayList <JComboBox> comboboxes;
    DefaultComboBoxModel dm = new DefaultComboBoxModel();

    public mainFrame() throws SQLException {
        initComponents();
        comboboxes = new ArrayList<>();
        comboboxes.add(kunde_name_kunde_andern);
        comboboxes.add(kunde_name_kunde_loschen);
        comboboxes.add(kunde_name_bestellung_erstellen);
        comboboxes.add(kunde_name_bestellung_andern);
        comboboxes.add(kunde_name_bestellung_loschen);
        comboboxes.add(kunde_name_korb_erstellen);
        update_combobox();



    }
    public void switchmainpanel(JPanel panel){
        LayeredPane.removeAll();
        LayeredPane.add(panel);
        LayeredPane.repaint();
        LayeredPane.revalidate();
    }
    public void switchkundenpanel(JPanel panel){
        kunde_Layeredpane.removeAll();
        kunde_Layeredpane.add(panel);
        kunde_Layeredpane.repaint();
        kunde_Layeredpane.revalidate();
    }

public void switchbestellpanel(JPanel panel){
        bestell_LayeredPane.removeAll();
        bestell_LayeredPane.add(panel);
        bestell_LayeredPane.repaint();
        bestell_LayeredPane.revalidate();
    }
public void switchlistepanel(JPanel panel){
        liste_LayeredPane.removeAll();
        liste_LayeredPane.add(panel);
        liste_LayeredPane.repaint();
        liste_LayeredPane.revalidate();
    }
public void switchlistetab(JTabbedPane tab){
        liste_LayeredPane.removeAll();
        liste_LayeredPane.add(tab);
        liste_LayeredPane.repaint();
        liste_LayeredPane.revalidate();
    }

    /**
     * thuis method will updata a given ComboBox from DB
     * 
     * @throws java.sql.SQLException
     */
    public final void update_combobox_db() throws SQLException{
        String sql = "select name FROM customers;";
        DB database = new DB();
        try{
            Statement stm = database.make_connection();
            var rs = stm.executeQuery(sql);
            while (rs.next()){
                String name = rs.getString("name");
                dm.addElement(name);
            }
            database.close_connection(stm);}
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
                    }
    }
    
    /**
     *
     * @throws SQLException
     */
    private void update_combobox() throws SQLException{
        dm.removeAllElements();
        update_combobox_db();
        for (JComboBox cb: comboboxes){
            cb.setModel(dm);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton8 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        seidpanel = new javax.swing.JPanel();
        kunde_btn = new javax.swing.JButton();
        betellung_btn = new javax.swing.JButton();
        korb_btn = new javax.swing.JButton();
        list_btn = new javax.swing.JButton();
        rechnung_btn = new javax.swing.JButton();
        einstellung_btn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        LayeredPane = new javax.swing.JLayeredPane();
        kunden_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        kunden_seidpanel = new javax.swing.JPanel();
        kunde_erstellen_btn = new javax.swing.JButton();
        kunde_andern_btn = new javax.swing.JButton();
        kunde_loschen_btn = new javax.swing.JButton();
        kunde_Layeredpane = new javax.swing.JLayeredPane();
        kunde_erstellen = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        kunde_name_feld = new javax.swing.JTextField();
        kunde_addr_feld = new javax.swing.JTextField();
        kunde_tel_feld = new javax.swing.JTextField();
        k_erstellen_save = new javax.swing.JButton();
        kunde_andern = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        kunde_name_kunde_andern = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        kunde_andern_table = new javax.swing.JTable();
        K_anderungen_save = new javax.swing.JButton();
        kunde_andern_search_ = new javax.swing.JButton();
        kunde_loschen = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        kunde_name_kunde_loschen = new javax.swing.JComboBox<>();
        k_loschen_save = new javax.swing.JButton();
        bestellung_panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        bestell_seidpanel = new javax.swing.JPanel();
        bestell_erstellen_btn = new javax.swing.JButton();
        bestell_andern_btn = new javax.swing.JButton();
        bestell_loschen_btn = new javax.swing.JButton();
        bestell_LayeredPane = new javax.swing.JLayeredPane();
        bestell_erstellen = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        kunde_name_bestellung_erstellen = new javax.swing.JComboBox<>();
        periodisch_CheckBox = new javax.swing.JCheckBox();
        einmalig_CheckBox = new javax.swing.JCheckBox();
        Mo_CheckBox = new javax.swing.JCheckBox();
        Di_CheckBox = new javax.swing.JCheckBox();
        Mi_CheckBox = new javax.swing.JCheckBox();
        Do_CheckBox = new javax.swing.JCheckBox();
        Fr_CheckBox = new javax.swing.JCheckBox();
        bestellung_save_btn_ = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        bestellung_erstellen_DateChooser_ = new com.toedter.calendar.JDateChooser();
        bestell_andern = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        kunde_name_bestellung_andern = new javax.swing.JComboBox<>();
        bestellung_ander_save_btn_ = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        bestellung_andern_Table = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        bestellung_andern_DateChooser = new com.toedter.calendar.JDateChooser();
        bestellung_andern_dbsuchen_btn_ = new javax.swing.JButton();
        bestell_loschen = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        kunde_name_bestellung_loschen = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        korb_panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        korb_seidpanel = new javax.swing.JPanel();
        korb_LayeredPane = new javax.swing.JLayeredPane();
        korb_erstellen = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        kunde_name_korb_erstellen = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        korb_model_ComboBox = new javax.swing.JComboBox<>();
        anzahl_Spinner = new javax.swing.JSpinner();
        Gewicht_Spinner = new javax.swing.JSpinner();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        korb_erstellen_asve_ = new javax.swing.JButton();
        korb_erstellen_DateChooser = new com.toedter.calendar.JDateChooser();
        listen_panel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        liste_seidpanel = new javax.swing.JPanel();
        packliste_btn = new javax.swing.JButton();
        bestandliste_btn = new javax.swing.JButton();
        liste_LayeredPane = new javax.swing.JLayeredPane();
        packliste = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        bestandliste = new javax.swing.JTabbedPane();
        bestandliste_erstellen = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jTextField29 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jTextField39 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jTextField40 = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jTextField41 = new javax.swing.JTextField();
        jTextField42 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jTextField45 = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jTextField46 = new javax.swing.JTextField();
        jTextField47 = new javax.swing.JTextField();
        jTextField48 = new javax.swing.JTextField();
        jTextField49 = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        jTextField50 = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        bestandliste_drucken = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        rechnung_panel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        einstellung_panel = new javax.swing.JPanel();

        jButton8.setText("jButton8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1300, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        seidpanel.setBackground(new java.awt.Color(153, 153, 153));

        kunde_btn.setBackground(new java.awt.Color(51, 51, 51));
        kunde_btn.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        kunde_btn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mhsaf\\OneDrive\\Desktop\\Fruit@work\\src\\images\\icons8-add-user-group-man-man-40.png")); // NOI18N
        kunde_btn.setText("Kunden");
        kunde_btn.setBorder(null);
        kunde_btn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kunde_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kunde_btnActionPerformed(evt);
            }
        });

        betellung_btn.setBackground(new java.awt.Color(51, 51, 51));
        betellung_btn.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        betellung_btn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mhsaf\\OneDrive\\Desktop\\Fruit@work\\src\\images\\icons8-file-invoice-40.png")); // NOI18N
        betellung_btn.setText("Bestellungen");
        betellung_btn.setBorder(null);
        betellung_btn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        betellung_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                betellung_btnActionPerformed(evt);
            }
        });

        korb_btn.setBackground(new java.awt.Color(51, 51, 51));
        korb_btn.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        korb_btn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mhsaf\\OneDrive\\Desktop\\Fruit@work\\src\\images\\icons8-basket-40.png")); // NOI18N
        korb_btn.setText("Körbe");
        korb_btn.setBorder(null);
        korb_btn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        korb_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                korb_btnActionPerformed(evt);
            }
        });

        list_btn.setBackground(new java.awt.Color(51, 51, 51));
        list_btn.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        list_btn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mhsaf\\OneDrive\\Desktop\\Fruit@work\\src\\images\\icons8-list-40.png")); // NOI18N
        list_btn.setText("Listen");
        list_btn.setBorder(null);
        list_btn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        list_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_btnActionPerformed(evt);
            }
        });

        rechnung_btn.setBackground(new java.awt.Color(51, 51, 51));
        rechnung_btn.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        rechnung_btn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mhsaf\\OneDrive\\Desktop\\Fruit@work\\src\\images\\icons8-create-order-40.png")); // NOI18N
        rechnung_btn.setText("Rechnungen");
        rechnung_btn.setBorder(null);
        rechnung_btn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rechnung_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechnung_btnActionPerformed(evt);
            }
        });

        einstellung_btn.setBackground(new java.awt.Color(51, 51, 51));
        einstellung_btn.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        einstellung_btn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mhsaf\\OneDrive\\Desktop\\Fruit@work\\src\\images\\icons8-gear-40.png")); // NOI18N
        einstellung_btn.setText("Einstellungen");
        einstellung_btn.setBorder(null);
        einstellung_btn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        einstellung_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                einstellung_btnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 0));
        jLabel6.setText("Fruiter");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout seidpanelLayout = new javax.swing.GroupLayout(seidpanel);
        seidpanel.setLayout(seidpanelLayout);
        seidpanelLayout.setHorizontalGroup(
            seidpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seidpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(seidpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kunde_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(betellung_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(korb_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(list_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(rechnung_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(einstellung_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(seidpanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        seidpanelLayout.setVerticalGroup(
            seidpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seidpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(kunde_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(betellung_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(korb_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(list_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rechnung_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                .addComponent(einstellung_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        getContentPane().add(seidpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 750));

        LayeredPane.setLayout(new java.awt.CardLayout());

        kunden_panel.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Kunden Verwaltung");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        kunden_seidpanel.setBackground(new java.awt.Color(153, 153, 153));

        kunde_erstellen_btn.setBackground(new java.awt.Color(51, 51, 51));
        kunde_erstellen_btn.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        kunde_erstellen_btn.setText("Erstellen");
        kunde_erstellen_btn.setBorder(null);
        kunde_erstellen_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kunde_erstellen_btnActionPerformed(evt);
            }
        });

        kunde_andern_btn.setBackground(new java.awt.Color(51, 51, 51));
        kunde_andern_btn.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        kunde_andern_btn.setText("Ändern");
        kunde_andern_btn.setBorder(null);
        kunde_andern_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kunde_andern_btnActionPerformed(evt);
            }
        });

        kunde_loschen_btn.setBackground(new java.awt.Color(51, 51, 51));
        kunde_loschen_btn.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        kunde_loschen_btn.setText("Löschen");
        kunde_loschen_btn.setBorder(null);
        kunde_loschen_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kunde_loschen_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kunden_seidpanelLayout = new javax.swing.GroupLayout(kunden_seidpanel);
        kunden_seidpanel.setLayout(kunden_seidpanelLayout);
        kunden_seidpanelLayout.setHorizontalGroup(
            kunden_seidpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kunden_seidpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kunden_seidpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kunde_erstellen_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(kunde_andern_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kunde_loschen_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        kunden_seidpanelLayout.setVerticalGroup(
            kunden_seidpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kunden_seidpanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(kunde_erstellen_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kunde_andern_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kunde_loschen_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(429, Short.MAX_VALUE))
        );

        kunde_Layeredpane.setLayout(new java.awt.CardLayout());

        kunde_erstellen.setBackground(new java.awt.Color(102, 102, 102));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Einen Kunde erstellen");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel10.setText("Name:");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel11.setText("Adresse:");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel12.setText("Telefon:");

        k_erstellen_save.setBackground(new java.awt.Color(153, 153, 153));
        k_erstellen_save.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        k_erstellen_save.setText("speichern");
        k_erstellen_save.setBorder(null);
        k_erstellen_save.setPreferredSize(new java.awt.Dimension(120, 35));
        k_erstellen_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k_erstellen_saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kunde_erstellenLayout = new javax.swing.GroupLayout(kunde_erstellen);
        kunde_erstellen.setLayout(kunde_erstellenLayout);
        kunde_erstellenLayout.setHorizontalGroup(
            kunde_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kunde_erstellenLayout.createSequentialGroup()
                .addGroup(kunde_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kunde_erstellenLayout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kunde_erstellenLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(kunde_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kunde_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kunde_erstellenLayout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(51, 51, 51))
                                .addGroup(kunde_erstellenLayout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(32, 32, 32)))
                            .addGroup(kunde_erstellenLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(39, 39, 39)))
                        .addGroup(kunde_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kunde_name_feld)
                            .addComponent(kunde_addr_feld)
                            .addComponent(kunde_tel_feld, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))))
                .addContainerGap(435, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kunde_erstellenLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(k_erstellen_save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );
        kunde_erstellenLayout.setVerticalGroup(
            kunde_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kunde_erstellenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(kunde_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(kunde_name_feld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kunde_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(kunde_addr_feld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kunde_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(kunde_tel_feld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(k_erstellen_save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(369, Short.MAX_VALUE))
        );

        kunde_Layeredpane.add(kunde_erstellen, "card2");

        kunde_andern.setBackground(new java.awt.Color(102, 102, 102));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Einen Kunde ändern");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel13.setText("Name:");

        kunde_name_kunde_andern.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kunde_name_kunde_andernMouseClicked(evt);
            }
        });
        kunde_name_kunde_andern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kunde_name_kunde_andernActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));

        kunde_andern_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Adresse", "Tel"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        kunde_andern_table.setShowGrid(true);
        jScrollPane1.setViewportView(kunde_andern_table);

        K_anderungen_save.setBackground(new java.awt.Color(153, 153, 153));
        K_anderungen_save.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        K_anderungen_save.setText("Speichern");
        K_anderungen_save.setBorder(null);
        K_anderungen_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                K_anderungen_saveActionPerformed(evt);
            }
        });

        kunde_andern_search_.setBackground(new java.awt.Color(153, 153, 153));
        kunde_andern_search_.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        kunde_andern_search_.setText("DB suchen");
        kunde_andern_search_.setBorder(null);
        kunde_andern_search_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kunde_andern_search_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kunde_andernLayout = new javax.swing.GroupLayout(kunde_andern);
        kunde_andern.setLayout(kunde_andernLayout);
        kunde_andernLayout.setHorizontalGroup(
            kunde_andernLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kunde_andernLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(K_anderungen_save, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(kunde_andernLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(kunde_andernLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 854, Short.MAX_VALUE)
                    .addGroup(kunde_andernLayout.createSequentialGroup()
                        .addGroup(kunde_andernLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addGroup(kunde_andernLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(kunde_name_kunde_andern, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(kunde_andern_search_, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        kunde_andernLayout.setVerticalGroup(
            kunde_andernLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kunde_andernLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(kunde_andernLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(kunde_name_kunde_andern, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kunde_andern_search_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(K_anderungen_save, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(382, Short.MAX_VALUE))
        );

        kunde_Layeredpane.add(kunde_andern, "card3");

        kunde_loschen.setBackground(new java.awt.Color(102, 102, 102));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Einen Kunde löschen");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel14.setText("Name:");

        kunde_name_kunde_loschen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kunde_name_kunde_loschenActionPerformed(evt);
            }
        });

        k_loschen_save.setBackground(new java.awt.Color(153, 153, 153));
        k_loschen_save.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        k_loschen_save.setText("Löschen");
        k_loschen_save.setBorder(null);
        k_loschen_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k_loschen_saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kunde_loschenLayout = new javax.swing.GroupLayout(kunde_loschen);
        kunde_loschen.setLayout(kunde_loschenLayout);
        kunde_loschenLayout.setHorizontalGroup(
            kunde_loschenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kunde_loschenLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(kunde_loschenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addGroup(kunde_loschenLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(kunde_name_kunde_loschen, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(444, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kunde_loschenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(k_loschen_save, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );
        kunde_loschenLayout.setVerticalGroup(
            kunde_loschenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kunde_loschenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(kunde_loschenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(kunde_name_kunde_loschen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addComponent(k_loschen_save, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(428, Short.MAX_VALUE))
        );

        kunde_Layeredpane.add(kunde_loschen, "card4");

        javax.swing.GroupLayout kunden_panelLayout = new javax.swing.GroupLayout(kunden_panel);
        kunden_panel.setLayout(kunden_panelLayout);
        kunden_panelLayout.setHorizontalGroup(
            kunden_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kunden_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kunden_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kunden_panelLayout.createSequentialGroup()
                        .addComponent(kunden_seidpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kunde_Layeredpane))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        kunden_panelLayout.setVerticalGroup(
            kunden_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kunden_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(kunden_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(kunde_Layeredpane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(kunden_seidpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        LayeredPane.add(kunden_panel, "card2");

        bestellung_panel.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bestellung");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        bestell_seidpanel.setBackground(new java.awt.Color(153, 153, 153));

        bestell_erstellen_btn.setBackground(new java.awt.Color(51, 51, 51));
        bestell_erstellen_btn.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        bestell_erstellen_btn.setText("Erstellen");
        bestell_erstellen_btn.setBorder(null);
        bestell_erstellen_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bestell_erstellen_btnActionPerformed(evt);
            }
        });

        bestell_andern_btn.setBackground(new java.awt.Color(51, 51, 51));
        bestell_andern_btn.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        bestell_andern_btn.setText("Ändern");
        bestell_andern_btn.setBorder(null);
        bestell_andern_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bestell_andern_btnActionPerformed(evt);
            }
        });

        bestell_loschen_btn.setBackground(new java.awt.Color(51, 51, 51));
        bestell_loschen_btn.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        bestell_loschen_btn.setText("Löschen");
        bestell_loschen_btn.setBorder(null);
        bestell_loschen_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bestell_loschen_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bestell_seidpanelLayout = new javax.swing.GroupLayout(bestell_seidpanel);
        bestell_seidpanel.setLayout(bestell_seidpanelLayout);
        bestell_seidpanelLayout.setHorizontalGroup(
            bestell_seidpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bestell_seidpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bestell_seidpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bestell_erstellen_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(bestell_andern_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bestell_loschen_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        bestell_seidpanelLayout.setVerticalGroup(
            bestell_seidpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bestell_seidpanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(bestell_erstellen_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bestell_andern_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bestell_loschen_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bestell_LayeredPane.setLayout(new java.awt.CardLayout());

        bestell_erstellen.setBackground(new java.awt.Color(102, 102, 102));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel15.setText("Eine Bestellung erstellen");

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel18.setText("Name des Kunden:");

        periodisch_CheckBox.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        periodisch_CheckBox.setText("periodisch");
        periodisch_CheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                periodisch_CheckBoxItemStateChanged(evt);
            }
        });
        periodisch_CheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                periodisch_CheckBoxActionPerformed(evt);
            }
        });

        einmalig_CheckBox.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        einmalig_CheckBox.setText("einmalig");
        einmalig_CheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                einmalig_CheckBoxActionPerformed(evt);
            }
        });

        Mo_CheckBox.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Mo_CheckBox.setText("Mo");
        Mo_CheckBox.setEnabled(false);

        Di_CheckBox.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Di_CheckBox.setText("Di");
        Di_CheckBox.setEnabled(false);

        Mi_CheckBox.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Mi_CheckBox.setText("Mi");
        Mi_CheckBox.setEnabled(false);

        Do_CheckBox.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Do_CheckBox.setText("Do");
        Do_CheckBox.setEnabled(false);

        Fr_CheckBox.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Fr_CheckBox.setText("Fr");
        Fr_CheckBox.setEnabled(false);

        bestellung_save_btn_.setBackground(new java.awt.Color(153, 153, 153));
        bestellung_save_btn_.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        bestellung_save_btn_.setText("Speichern");
        bestellung_save_btn_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bestellung_save_btn_ActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel25.setText("Für das Datum:");

        javax.swing.GroupLayout bestell_erstellenLayout = new javax.swing.GroupLayout(bestell_erstellen);
        bestell_erstellen.setLayout(bestell_erstellenLayout);
        bestell_erstellenLayout.setHorizontalGroup(
            bestell_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bestell_erstellenLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(bestell_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bestellung_save_btn_, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bestell_erstellenLayout.createSequentialGroup()
                        .addGroup(bestell_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addGroup(bestell_erstellenLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addGroup(bestell_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kunde_name_bestellung_erstellen, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(bestell_erstellenLayout.createSequentialGroup()
                                        .addComponent(Mo_CheckBox)
                                        .addGap(18, 18, 18)
                                        .addComponent(Di_CheckBox)
                                        .addGap(18, 18, 18)
                                        .addComponent(Mi_CheckBox)
                                        .addGap(18, 18, 18)
                                        .addComponent(Do_CheckBox)
                                        .addGap(18, 18, 18)
                                        .addComponent(Fr_CheckBox))
                                    .addGroup(bestell_erstellenLayout.createSequentialGroup()
                                        .addComponent(einmalig_CheckBox)
                                        .addGap(41, 41, 41)
                                        .addComponent(periodisch_CheckBox)))))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(bestellung_erstellen_DateChooser_, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        bestell_erstellenLayout.setVerticalGroup(
            bestell_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bestell_erstellenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(61, 61, 61)
                .addGroup(bestell_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bestell_erstellenLayout.createSequentialGroup()
                        .addGroup(bestell_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(kunde_name_bestellung_erstellen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addGap(18, 18, 18)
                        .addGroup(bestell_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(periodisch_CheckBox)
                            .addComponent(einmalig_CheckBox))
                        .addGap(18, 18, 18)
                        .addGroup(bestell_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Mo_CheckBox)
                            .addComponent(Di_CheckBox)
                            .addComponent(Mi_CheckBox)
                            .addComponent(Do_CheckBox)
                            .addComponent(Fr_CheckBox)))
                    .addComponent(bestellung_erstellen_DateChooser_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addComponent(bestellung_save_btn_)
                .addContainerGap(344, Short.MAX_VALUE))
        );

        bestell_LayeredPane.add(bestell_erstellen, "card2");

        bestell_andern.setBackground(new java.awt.Color(102, 102, 102));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel16.setText("Eine Bestellung ändern");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel21.setText("Name des Kunden:");

        bestellung_ander_save_btn_.setBackground(new java.awt.Color(153, 153, 153));
        bestellung_ander_save_btn_.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        bestellung_ander_save_btn_.setText("Speichern");
        bestellung_ander_save_btn_.setBorder(null);
        bestellung_ander_save_btn_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bestellung_ander_save_btn_ActionPerformed(evt);
            }
        });

        bestellung_andern_Table.setBackground(new java.awt.Color(204, 204, 204));
        bestellung_andern_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
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
                "ID", "Kunde", "Datum", "eimalig", "periode", "Korb", "Gewicht", "Anzahl"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bestellung_andern_Table.setShowGrid(true);
        jScrollPane2.setViewportView(bestellung_andern_Table);

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel24.setText("für das Datum:");

        bestellung_andern_dbsuchen_btn_.setBackground(new java.awt.Color(153, 153, 153));
        bestellung_andern_dbsuchen_btn_.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        bestellung_andern_dbsuchen_btn_.setText("DB suchen");
        bestellung_andern_dbsuchen_btn_.setBorder(null);
        bestellung_andern_dbsuchen_btn_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bestellung_andern_dbsuchen_btn_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bestell_andernLayout = new javax.swing.GroupLayout(bestell_andern);
        bestell_andern.setLayout(bestell_andernLayout);
        bestell_andernLayout.setHorizontalGroup(
            bestell_andernLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bestell_andernLayout.createSequentialGroup()
                .addGroup(bestell_andernLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bestell_andernLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(bestell_andernLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bestell_andernLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kunde_name_bestellung_andern, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bestellung_andern_DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(bestellung_andern_dbsuchen_btn_, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bestell_andernLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bestellung_ander_save_btn_, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(bestell_andernLayout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bestell_andernLayout.setVerticalGroup(
            bestell_andernLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bestell_andernLayout.createSequentialGroup()
                .addGroup(bestell_andernLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bestell_andernLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(67, 67, 67)
                        .addGroup(bestell_andernLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bestellung_andern_DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bestell_andernLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(kunde_name_bestellung_andern, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel24)
                                .addComponent(jLabel21)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bestell_andernLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bestellung_andern_dbsuchen_btn_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(bestellung_ander_save_btn_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        bestell_LayeredPane.add(bestell_andern, "card3");

        bestell_loschen.setBackground(new java.awt.Color(102, 102, 102));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel17.setText("Eine Bestellung löschen");

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel23.setText("Name des Kunden:");

        jTable3.setBackground(new java.awt.Color(204, 204, 204));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Kunde", "Anzahl", "Gewicht", "Datum", "Löschen"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setShowGrid(true);
        jScrollPane3.setViewportView(jTable3);

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setText("Speichern");
        jButton3.setBorder(null);

        javax.swing.GroupLayout bestell_loschenLayout = new javax.swing.GroupLayout(bestell_loschen);
        bestell_loschen.setLayout(bestell_loschenLayout);
        bestell_loschenLayout.setHorizontalGroup(
            bestell_loschenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bestell_loschenLayout.createSequentialGroup()
                .addGroup(bestell_loschenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bestell_loschenLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bestell_loschenLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(bestell_loschenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bestell_loschenLayout.createSequentialGroup()
                                .addGroup(bestell_loschenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel17)
                                    .addGroup(bestell_loschenLayout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addGap(18, 18, 18)
                                        .addComponent(kunde_name_bestellung_loschen, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 414, Short.MAX_VALUE))
                            .addComponent(jScrollPane3))))
                .addContainerGap())
        );
        bestell_loschenLayout.setVerticalGroup(
            bestell_loschenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bestell_loschenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(42, 42, 42)
                .addGroup(bestell_loschenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(kunde_name_bestellung_loschen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        bestell_LayeredPane.add(bestell_loschen, "card4");

        javax.swing.GroupLayout bestellung_panelLayout = new javax.swing.GroupLayout(bestellung_panel);
        bestellung_panel.setLayout(bestellung_panelLayout);
        bestellung_panelLayout.setHorizontalGroup(
            bestellung_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bestellung_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bestellung_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bestellung_panelLayout.createSequentialGroup()
                        .addComponent(bestell_seidpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bestell_LayeredPane)))
                .addContainerGap())
        );
        bestellung_panelLayout.setVerticalGroup(
            bestellung_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bestellung_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bestellung_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bestellung_panelLayout.createSequentialGroup()
                        .addComponent(bestell_LayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(bestell_seidpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        LayeredPane.add(bestellung_panel, "card3");

        korb_panel.setBackground(new java.awt.Color(102, 102, 102));

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Körbe");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        korb_seidpanel.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout korb_seidpanelLayout = new javax.swing.GroupLayout(korb_seidpanel);
        korb_seidpanel.setLayout(korb_seidpanelLayout);
        korb_seidpanelLayout.setHorizontalGroup(
            korb_seidpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
        );
        korb_seidpanelLayout.setVerticalGroup(
            korb_seidpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        korb_LayeredPane.setLayout(new java.awt.CardLayout());

        korb_erstellen.setBackground(new java.awt.Color(102, 102, 102));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel19.setText("Name des Kunden:");

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel20.setText("für das Datum:");

        kunde_name_korb_erstellen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kunde_name_korb_erstellenActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel22.setText("Korb:");

        korb_model_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(---)", "Basic", "Duo", "Busi" }));

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel26.setText("Anzahl:");

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel27.setText("Gewicht:");

        korb_erstellen_asve_.setBackground(new java.awt.Color(153, 153, 153));
        korb_erstellen_asve_.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        korb_erstellen_asve_.setText("Speichern");
        korb_erstellen_asve_.setBorder(null);
        korb_erstellen_asve_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                korb_erstellen_asve_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout korb_erstellenLayout = new javax.swing.GroupLayout(korb_erstellen);
        korb_erstellen.setLayout(korb_erstellenLayout);
        korb_erstellenLayout.setHorizontalGroup(
            korb_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, korb_erstellenLayout.createSequentialGroup()
                .addGroup(korb_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(korb_erstellenLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(korb_erstellen_asve_, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(korb_erstellenLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(korb_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(korb_erstellenLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addComponent(kunde_name_korb_erstellen, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(korb_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, korb_erstellenLayout.createSequentialGroup()
                                    .addComponent(jLabel27)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(korb_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Gewicht_Spinner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(anzahl_Spinner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, korb_erstellenLayout.createSequentialGroup()
                                    .addGroup(korb_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel22)
                                        .addComponent(jLabel26))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(korb_model_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 40, Short.MAX_VALUE)
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(korb_erstellen_DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(73, 73, 73))
        );
        korb_erstellenLayout.setVerticalGroup(
            korb_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(korb_erstellenLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(korb_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(korb_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(jLabel20)
                        .addComponent(kunde_name_korb_erstellen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(korb_erstellen_DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(korb_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(korb_model_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(korb_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(anzahl_Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(korb_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Gewicht_Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addGap(33, 33, 33)
                .addComponent(korb_erstellen_asve_, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(320, Short.MAX_VALUE))
        );

        korb_LayeredPane.add(korb_erstellen, "card2");

        javax.swing.GroupLayout korb_panelLayout = new javax.swing.GroupLayout(korb_panel);
        korb_panel.setLayout(korb_panelLayout);
        korb_panelLayout.setHorizontalGroup(
            korb_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(korb_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(korb_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(korb_panelLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(korb_panelLayout.createSequentialGroup()
                        .addComponent(korb_seidpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(korb_LayeredPane))))
        );
        korb_panelLayout.setVerticalGroup(
            korb_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(korb_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(korb_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(korb_seidpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(korb_panelLayout.createSequentialGroup()
                        .addComponent(korb_LayeredPane)
                        .addContainerGap())))
        );

        LayeredPane.add(korb_panel, "card4");

        listen_panel.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Listen");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        liste_seidpanel.setBackground(new java.awt.Color(153, 153, 153));

        packliste_btn.setBackground(new java.awt.Color(51, 51, 51));
        packliste_btn.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        packliste_btn.setText("Packliste ");
        packliste_btn.setBorder(null);
        packliste_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packliste_btnActionPerformed(evt);
            }
        });

        bestandliste_btn.setBackground(new java.awt.Color(51, 51, 51));
        bestandliste_btn.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        bestandliste_btn.setText("Bestandsliste ");
        bestandliste_btn.setBorder(null);
        bestandliste_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bestandliste_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout liste_seidpanelLayout = new javax.swing.GroupLayout(liste_seidpanel);
        liste_seidpanel.setLayout(liste_seidpanelLayout);
        liste_seidpanelLayout.setHorizontalGroup(
            liste_seidpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, liste_seidpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(liste_seidpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bestandliste_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(packliste_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        liste_seidpanelLayout.setVerticalGroup(
            liste_seidpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(liste_seidpanelLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(packliste_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bestandliste_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        liste_LayeredPane.setLayout(new java.awt.CardLayout());

        packliste.setBackground(new java.awt.Color(102, 102, 102));

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel30.setText("Für das Datum:");

        jButton5.setBackground(new java.awt.Color(153, 153, 153));
        jButton5.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButton5.setText("Speichern");
        jButton5.setBorder(null);

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel28.setText("Du bist dabei, um eine Packliste für einen bestimmten Tag fertig zu drucken.");

        javax.swing.GroupLayout packlisteLayout = new javax.swing.GroupLayout(packliste);
        packliste.setLayout(packlisteLayout);
        packlisteLayout.setHorizontalGroup(
            packlisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, packlisteLayout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addGroup(packlisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addGroup(packlisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(packlisteLayout.createSequentialGroup()
                            .addComponent(jLabel30)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, packlisteLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(91, 91, 91))
        );
        packlisteLayout.setVerticalGroup(
            packlisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(packlisteLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel28)
                .addGap(44, 44, 44)
                .addGroup(packlisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(409, Short.MAX_VALUE))
        );

        liste_LayeredPane.add(packliste, "card2");

        bestandliste.setBackground(new java.awt.Color(102, 102, 102));
        bestandliste.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bestandliste.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        bestandliste_erstellen.setBackground(new java.awt.Color(102, 102, 102));

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel31.setText("Datum:");

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel32.setText("Banane:");

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel33.setText("Obst:");

        jButton7.setBackground(new java.awt.Color(153, 153, 153));
        jButton7.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButton7.setText("Erstellen");
        jButton7.setBorder(null);

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel34.setText("Aprikose:");

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel35.setText("Zwetschge:");

        jLabel36.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel36.setText("Kaktusfeige:");

        jLabel37.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel37.setText("Melone:");

        jLabel38.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel38.setText("Zitrone:");

        jLabel39.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel39.setText("Weintraube:");

        jLabel40.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel40.setText("Kirschen :");

        jLabel41.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel41.setText("Zwiebel:");

        jLabel42.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel42.setText("Möhren:");

        jLabel43.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel43.setText("Radieschen:");

        jLabel44.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel44.setText(" R-Apfel:");

        jLabel45.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel45.setText("Nektarine:");

        jLabel46.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel46.setText("Ananas:");

        jLabel47.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel47.setText("Wassermelone:");

        jLabel48.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel48.setText("Mandarine:");

        jLabel49.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel49.setText("Kiwi:");

        jLabel50.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel50.setText("Blaubeere:");

        jLabel51.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel51.setText("Banane:");

        jLabel52.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel52.setText("Tomate:");

        jLabel53.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel53.setText("Kartoffeln:");

        jLabel54.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel54.setText("Sellerie:");

        jLabel55.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel55.setText("Erdbeere");

        jLabel56.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel56.setText("Grapefruit:");

        jLabel57.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel57.setText("Banane:");

        jLabel58.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel58.setText("Litschi:");

        jLabel59.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel59.setText("Gurke:");

        jLabel60.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel60.setText(" G-Apfel:");

        jLabel61.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel61.setText("cherry Tomaten:");

        jLabel62.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel62.setText("Blutorange:");

        jLabel63.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel63.setText("Salat:");

        jLabel64.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel64.setText("Pfirsich:");

        jLabel65.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel65.setText("Orange:");

        jLabel66.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel66.setText("Limone:");

        jLabel67.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel67.setText("ingwer:");

        jLabel68.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel68.setText("Birne:");

        jLabel69.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel69.setText("Johannisbeere:");

        jLabel70.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel70.setText("Avocado:");

        jLabel71.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel71.setText("Mango:");

        jLabel72.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel72.setText("Granatapfel:");

        jLabel73.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel73.setText("Banane:");

        jLabel74.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel74.setText("Spinat:");

        jLabel75.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel75.setText("Pflaume:");

        jLabel76.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel76.setText("Paprika:");

        jLabel77.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel77.setText("Gemüse:");

        javax.swing.GroupLayout bestandliste_erstellenLayout = new javax.swing.GroupLayout(bestandliste_erstellen);
        bestandliste_erstellen.setLayout(bestandliste_erstellenLayout);
        bestandliste_erstellenLayout.setHorizontalGroup(
            bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel33))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bestandliste_erstellenLayout.createSequentialGroup()
                .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel77)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                                    .addComponent(jLabel32)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                                    .addComponent(jLabel34)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                                    .addComponent(jLabel35)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                                    .addComponent(jLabel36)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                                    .addComponent(jLabel40)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                                    .addComponent(jLabel41)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                                    .addComponent(jLabel42)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                                    .addComponent(jLabel43)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addGap(48, 48, 48)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addGap(50, 50, 50)
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bestandliste_erstellenLayout.createSequentialGroup()
                                .addComponent(jLabel39)
                                .addGap(21, 21, 21)
                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                                .addComponent(jLabel50)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                                .addComponent(jLabel51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                                .addComponent(jLabel52)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                                .addComponent(jLabel53)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                                .addComponent(jLabel54)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                                .addComponent(jLabel48)
                                .addGap(46, 46, 46)
                                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                                .addComponent(jLabel49)
                                .addGap(88, 88, 88)
                                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38)
                        .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                                    .addComponent(jLabel56)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel57)
                                .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                                    .addComponent(jLabel58)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                                    .addComponent(jLabel61)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                                    .addComponent(jLabel59)
                                    .addGap(84, 84, 84)
                                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                                    .addComponent(jLabel62)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                                    .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel60)
                                        .addComponent(jLabel64))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                                    .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel65)
                                        .addComponent(jLabel55))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                                .addComponent(jLabel63)
                                .addGap(91, 91, 91)
                                .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(38, 38, 38)
                        .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                                .addComponent(jLabel67)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bestandliste_erstellenLayout.createSequentialGroup()
                                    .addComponent(jLabel74)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bestandliste_erstellenLayout.createSequentialGroup()
                                    .addComponent(jLabel76)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bestandliste_erstellenLayout.createSequentialGroup()
                                    .addComponent(jLabel73)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bestandliste_erstellenLayout.createSequentialGroup()
                                    .addComponent(jLabel68)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bestandliste_erstellenLayout.createSequentialGroup()
                                    .addComponent(jLabel75)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bestandliste_erstellenLayout.createSequentialGroup()
                                    .addComponent(jLabel72)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bestandliste_erstellenLayout.createSequentialGroup()
                                    .addComponent(jLabel70)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bestandliste_erstellenLayout.createSequentialGroup()
                                    .addComponent(jLabel66)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bestandliste_erstellenLayout.createSequentialGroup()
                                    .addComponent(jLabel71)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bestandliste_erstellenLayout.createSequentialGroup()
                                    .addComponent(jLabel69)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(89, 89, 89))
        );
        bestandliste_erstellenLayout.setVerticalGroup(
            bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jLabel33)
                .addGap(10, 10, 10)
                .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(13, 13, 13)
                        .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addGap(15, 15, 15)
                                .addComponent(jLabel38))
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel77))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel42)
                        .addGap(13, 13, 13)
                        .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel43)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                        .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel45)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel46)
                        .addGap(13, 13, 13)
                        .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47)
                            .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel48)
                            .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel49)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel50)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel51)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel52)
                        .addGap(13, 13, 13)
                        .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel53)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel54))
                    .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                        .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                                .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel60)
                                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bestandliste_erstellenLayout.createSequentialGroup()
                                .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel64)
                                .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel65)
                                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bestandliste_erstellenLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel55)
                            .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel58)
                                .addGap(13, 13, 13)
                                .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel56)
                                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel62)
                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel57)
                                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel63)
                                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel59)
                                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8)
                        .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel61)
                            .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bestandliste_erstellenLayout.createSequentialGroup()
                        .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel68)
                            .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel75)
                            .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel72)
                            .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel69)
                            .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel71)
                            .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel66)
                            .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel70)
                            .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel73)
                            .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel76)
                            .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel74)
                            .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(bestandliste_erstellenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel67)
                            .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        bestandliste.addTab("Erstellen", bestandliste_erstellen);

        bestandliste_drucken.setBackground(new java.awt.Color(102, 102, 102));

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel29.setText("Für das Datum:");

        jButton6.setBackground(new java.awt.Color(153, 153, 153));
        jButton6.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButton6.setText("Speichern");
        jButton6.setBorder(null);

        javax.swing.GroupLayout bestandliste_druckenLayout = new javax.swing.GroupLayout(bestandliste_drucken);
        bestandliste_drucken.setLayout(bestandliste_druckenLayout);
        bestandliste_druckenLayout.setHorizontalGroup(
            bestandliste_druckenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bestandliste_druckenLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel29)
                .addGap(18, 18, 18)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(542, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bestandliste_druckenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );
        bestandliste_druckenLayout.setVerticalGroup(
            bestandliste_druckenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bestandliste_druckenLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(bestandliste_druckenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(464, Short.MAX_VALUE))
        );

        bestandliste.addTab("Drucken", bestandliste_drucken);

        liste_LayeredPane.add(bestandliste, "card3");

        javax.swing.GroupLayout listen_panelLayout = new javax.swing.GroupLayout(listen_panel);
        listen_panel.setLayout(listen_panelLayout);
        listen_panelLayout.setHorizontalGroup(
            listen_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listen_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listen_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listen_panelLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(listen_panelLayout.createSequentialGroup()
                        .addComponent(liste_seidpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(liste_LayeredPane))))
        );
        listen_panelLayout.setVerticalGroup(
            listen_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listen_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(listen_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(liste_seidpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(listen_panelLayout.createSequentialGroup()
                        .addComponent(liste_LayeredPane)
                        .addContainerGap())))
        );

        LayeredPane.add(listen_panel, "card5");

        rechnung_panel.setBackground(new java.awt.Color(102, 102, 102));

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Rechnungen");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout rechnung_panelLayout = new javax.swing.GroupLayout(rechnung_panel);
        rechnung_panel.setLayout(rechnung_panelLayout);
        rechnung_panelLayout.setHorizontalGroup(
            rechnung_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rechnung_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1118, Short.MAX_VALUE)
                .addContainerGap())
        );
        rechnung_panelLayout.setVerticalGroup(
            rechnung_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rechnung_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(682, Short.MAX_VALUE))
        );

        LayeredPane.add(rechnung_panel, "card6");

        einstellung_panel.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout einstellung_panelLayout = new javax.swing.GroupLayout(einstellung_panel);
        einstellung_panel.setLayout(einstellung_panelLayout);
        einstellung_panelLayout.setHorizontalGroup(
            einstellung_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1130, Short.MAX_VALUE)
        );
        einstellung_panelLayout.setVerticalGroup(
            einstellung_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        LayeredPane.add(einstellung_panel, "card7");

        getContentPane().add(LayeredPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 1130, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kunde_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kunde_btnActionPerformed
        switchmainpanel(kunden_panel);
    }//GEN-LAST:event_kunde_btnActionPerformed

    private void betellung_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_betellung_btnActionPerformed
        switchmainpanel(bestellung_panel);
    }//GEN-LAST:event_betellung_btnActionPerformed

    private void korb_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_korb_btnActionPerformed
        switchmainpanel(korb_panel);
    }//GEN-LAST:event_korb_btnActionPerformed

    private void list_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_btnActionPerformed
        switchmainpanel(listen_panel);
    }//GEN-LAST:event_list_btnActionPerformed

    private void rechnung_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechnung_btnActionPerformed
        switchmainpanel(rechnung_panel);
    }//GEN-LAST:event_rechnung_btnActionPerformed

    private void einstellung_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_einstellung_btnActionPerformed
        switchmainpanel(einstellung_panel);
    }//GEN-LAST:event_einstellung_btnActionPerformed

    private void kunde_loschen_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kunde_loschen_btnActionPerformed
        switchkundenpanel(kunde_loschen);
    }//GEN-LAST:event_kunde_loschen_btnActionPerformed

    private void kunde_erstellen_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kunde_erstellen_btnActionPerformed
        switchkundenpanel(kunde_erstellen);
    }//GEN-LAST:event_kunde_erstellen_btnActionPerformed

    private void kunde_andern_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kunde_andern_btnActionPerformed
        switchkundenpanel(kunde_andern);
    }//GEN-LAST:event_kunde_andern_btnActionPerformed

    private void k_erstellen_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k_erstellen_saveActionPerformed
        String kunde_name = kunde_name_feld.getText();
        String kunde_addr = kunde_addr_feld.getText();
        String kunde_tel = kunde_tel_feld.getText(); 
        customer cus = new customer (kunde_name,kunde_addr,kunde_tel);
        try {
            cus.addtoDB();
            JOptionPane.showMessageDialog(null, "Der Kunde wurde erfolgreich erstellt");
            update_combobox();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problem with Database");
        }
        kunde_name_feld.setText("");
        kunde_addr_feld.setText("");
        kunde_tel_feld.setText("");
        kunde_name_feld.requestFocus();
    }//GEN-LAST:event_k_erstellen_saveActionPerformed

    private void bestell_erstellen_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bestell_erstellen_btnActionPerformed
        switchbestellpanel(bestell_erstellen);
    }//GEN-LAST:event_bestell_erstellen_btnActionPerformed

    private void bestell_andern_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bestell_andern_btnActionPerformed
        switchbestellpanel(bestell_andern);
    }//GEN-LAST:event_bestell_andern_btnActionPerformed

    private void bestell_loschen_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bestell_loschen_btnActionPerformed
        switchbestellpanel(bestell_loschen);
    }//GEN-LAST:event_bestell_loschen_btnActionPerformed

    private void packliste_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packliste_btnActionPerformed
        switchlistepanel(packliste);
    }//GEN-LAST:event_packliste_btnActionPerformed

    private void bestandliste_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bestandliste_btnActionPerformed
        switchlistetab(bestandliste);
    }//GEN-LAST:event_bestandliste_btnActionPerformed

    private void kunde_name_kunde_andernActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kunde_name_kunde_andernActionPerformed
    }//GEN-LAST:event_kunde_name_kunde_andernActionPerformed

    private void kunde_name_kunde_loschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kunde_name_kunde_loschenActionPerformed
    }//GEN-LAST:event_kunde_name_kunde_loschenActionPerformed

    private void kunde_name_korb_erstellenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kunde_name_korb_erstellenActionPerformed
    }//GEN-LAST:event_kunde_name_korb_erstellenActionPerformed

    private void k_loschen_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k_loschen_saveActionPerformed
        String kunden_name = (String)kunde_name_kunde_loschen.getSelectedItem();
        customer customer = new customer();
        try {
            customer.remove(kunden_name);
            JOptionPane.showMessageDialog(null,"Der Kunde wurde erfolgreich gelöscht");
            update_combobox();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_k_loschen_saveActionPerformed

    private void kunde_name_kunde_andernMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kunde_name_kunde_andernMouseClicked

    }//GEN-LAST:event_kunde_name_kunde_andernMouseClicked

    private void kunde_andern_search_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kunde_andern_search_ActionPerformed
        String[] customer_data = new String[4];
        customer cus = new customer();
        String kunde_name = kunde_name_kunde_andern.getSelectedItem().toString();
        try {
            customer_data = cus.search(kunde_name);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        kunde_andern_table.setValueAt(customer_data[0], 0, 0);
        kunde_andern_table.setValueAt(customer_data[1], 0, 1);
        kunde_andern_table.setValueAt(customer_data[2], 0, 2);
        kunde_andern_table.setValueAt(customer_data[3], 0, 3);

    }//GEN-LAST:event_kunde_andern_search_ActionPerformed

    private void K_anderungen_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_K_anderungen_saveActionPerformed
        String id = kunde_andern_table.getValueAt(0,0).toString();
        String name = kunde_andern_table.getValueAt(0,1).toString();
        String address = kunde_andern_table.getValueAt(0,2).toString();
        String tel = kunde_andern_table.getValueAt(0,3).toString();
        customer cus = new customer();
        try {
            cus.modify(id, name, address, tel);
            update_combobox();
            JOptionPane.showMessageDialog(null, "Der kunde wurde erfolgreich modifiziert");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        kunde_andern_table.setValueAt(null, 0, 0);
        kunde_andern_table.setValueAt(null, 0, 1);
        kunde_andern_table.setValueAt(null, 0, 2);
        kunde_andern_table.setValueAt(null, 0, 3);
        kunde_name_kunde_andern.setSelectedItem(ABORT);


    }//GEN-LAST:event_K_anderungen_saveActionPerformed

    private void periodisch_CheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_periodisch_CheckBoxActionPerformed
        if (periodisch_CheckBox.isSelected()) {
            Mo_CheckBox.setEnabled(true);
            Di_CheckBox.setEnabled(true);
            Mi_CheckBox.setEnabled(true);
            Do_CheckBox.setEnabled(true);
            Fr_CheckBox.setEnabled(true);
            einmalig_CheckBox.setEnabled(false);}
        else{
            Mo_CheckBox.setEnabled(false);
            Di_CheckBox.setEnabled(false);
            Mi_CheckBox.setEnabled(false);
            Do_CheckBox.setEnabled(false);
            Fr_CheckBox.setEnabled(false);
            einmalig_CheckBox.setEnabled(true);
        }
    }//GEN-LAST:event_periodisch_CheckBoxActionPerformed

    private void periodisch_CheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_periodisch_CheckBoxItemStateChanged

    }//GEN-LAST:event_periodisch_CheckBoxItemStateChanged

    private void einmalig_CheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_einmalig_CheckBoxActionPerformed
        if (einmalig_CheckBox.isSelected()){
            periodisch_CheckBox.setEnabled(false);
        }
        else{
            periodisch_CheckBox.setEnabled(true);

        }
    }//GEN-LAST:event_einmalig_CheckBoxActionPerformed

    private void bestellung_save_btn_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bestellung_save_btn_ActionPerformed
        customer cus = new customer();
        String customer_id = cus.search_id(kunde_name_bestellung_erstellen.getSelectedItem().toString());
        String basket_id = "";
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy",Locale.getDefault());
        String date = df.format(bestellung_erstellen_DateChooser_.getDate()); 
        String einmalig = "";
        if (einmalig_CheckBox.isSelected()){
            einmalig = "Y";
        }
        String periode = "";
        if (periodisch_CheckBox.isSelected()){
            if (Mo_CheckBox.isSelected()){
                periode = "mo ";
            }        
            if (Di_CheckBox.isSelected()){
                periode = periode + "di ";
            }            
            if (Mi_CheckBox.isSelected()){
                periode = periode + "mi ";
            }            
            if (Do_CheckBox.isSelected()){
                periode = periode + "do ";
            }
            if (Fr_CheckBox.isSelected()){
                periode = periode + "fr ";
            }
        }
        order ord = new order(customer_id,basket_id,date,einmalig,periode);
        try {
            ord.addToDB();
            JOptionPane.showMessageDialog(null, "bestellung wurde erfolgreich aufgegeben");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }//GEN-LAST:event_bestellung_save_btn_ActionPerformed

    private void korb_erstellen_asve_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_korb_erstellen_asve_ActionPerformed
        customer cus = new customer ();
        String customer_id = cus.search_id(kunde_name_korb_erstellen.getSelectedItem().toString());
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy",Locale.getDefault());
        String date = df.format(korb_erstellen_DateChooser.getDate());
        int weight = (int) Gewicht_Spinner.getValue();
        int number = (int) anzahl_Spinner.getValue();
        String modle = korb_model_ComboBox.getSelectedItem().toString();
        basket bsk = new basket(customer_id,weight,modle,number);
        try {
            if(bsk.addtoDB(date)==1){
                JOptionPane.showMessageDialog(null, "Der Korb wurde erfolgreich erstellt und mit Berücksichtigung des Datums entsprechender Bestellung zugeordnet");}
            else{
                JOptionPane.showMessageDialog(null, "Es existiert keine Bestellung für´s Datum "+date+ " mit dem Name \""+
                        kunde_name_korb_erstellen.getSelectedItem().toString() +"\". Bitte erst eine Bestellung erstellen ");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dieser Korb kann keiner Bestellung zugeordnet werden");
        }
    }//GEN-LAST:event_korb_erstellen_asve_ActionPerformed

    private void bestellung_ander_save_btn_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bestellung_ander_save_btn_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bestellung_ander_save_btn_ActionPerformed

    private void bestellung_andern_dbsuchen_btn_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bestellung_andern_dbsuchen_btn_ActionPerformed
        String [] order_result = new String[6];
        String customer_id = kunde_name_bestellung_andern.getSelectedItem().toString();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy",Locale.getDefault());
        String date = df.format(bestellung_andern_DateChooser.getDate());
        order ord = new order();
        try {
            order_result = ord.search(customer_id, date);
        } catch (SQLException ex) {
            Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(order_result != null){
            for(int i=0;i<5;i++){
                if(i==3){
                    if(order_result[i] == "Y"){
                        bestellung_andern_Table.set                    
                    }else{
                        bestellung_andern_Table.setValueAt(false,0,i);                                            
                    }
                }else{
                bestellung_andern_Table.setValueAt(order_result[i],0,i);                    
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Es existiert keine Bestellung für´s Datum "+date+ " mit dem Name \""+
                    kunde_name_bestellung_andern.getSelectedItem().toString() +"\". Bitte erst eine Bestellung erstellen ");
        }
    }//GEN-LAST:event_bestellung_andern_dbsuchen_btn_ActionPerformed

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
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new mainFrame().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Di_CheckBox;
    private javax.swing.JCheckBox Do_CheckBox;
    private javax.swing.JCheckBox Fr_CheckBox;
    private javax.swing.JSpinner Gewicht_Spinner;
    private javax.swing.JButton K_anderungen_save;
    private javax.swing.JLayeredPane LayeredPane;
    private javax.swing.JCheckBox Mi_CheckBox;
    private javax.swing.JCheckBox Mo_CheckBox;
    private javax.swing.JSpinner anzahl_Spinner;
    private javax.swing.JTabbedPane bestandliste;
    private javax.swing.JButton bestandliste_btn;
    private javax.swing.JPanel bestandliste_drucken;
    private javax.swing.JPanel bestandliste_erstellen;
    private javax.swing.JLayeredPane bestell_LayeredPane;
    private javax.swing.JPanel bestell_andern;
    private javax.swing.JButton bestell_andern_btn;
    private javax.swing.JPanel bestell_erstellen;
    private javax.swing.JButton bestell_erstellen_btn;
    private javax.swing.JPanel bestell_loschen;
    private javax.swing.JButton bestell_loschen_btn;
    private javax.swing.JPanel bestell_seidpanel;
    private javax.swing.JButton bestellung_ander_save_btn_;
    private com.toedter.calendar.JDateChooser bestellung_andern_DateChooser;
    private javax.swing.JTable bestellung_andern_Table;
    private javax.swing.JButton bestellung_andern_dbsuchen_btn_;
    private com.toedter.calendar.JDateChooser bestellung_erstellen_DateChooser_;
    private javax.swing.JPanel bestellung_panel;
    private javax.swing.JButton bestellung_save_btn_;
    private javax.swing.JButton betellung_btn;
    private javax.swing.JCheckBox einmalig_CheckBox;
    private javax.swing.JButton einstellung_btn;
    private javax.swing.JPanel einstellung_panel;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton k_erstellen_save;
    private javax.swing.JButton k_loschen_save;
    private javax.swing.JLayeredPane korb_LayeredPane;
    private javax.swing.JButton korb_btn;
    private javax.swing.JPanel korb_erstellen;
    private com.toedter.calendar.JDateChooser korb_erstellen_DateChooser;
    private javax.swing.JButton korb_erstellen_asve_;
    private javax.swing.JComboBox<String> korb_model_ComboBox;
    private javax.swing.JPanel korb_panel;
    private javax.swing.JPanel korb_seidpanel;
    private javax.swing.JLayeredPane kunde_Layeredpane;
    private javax.swing.JTextField kunde_addr_feld;
    private javax.swing.JPanel kunde_andern;
    private javax.swing.JButton kunde_andern_btn;
    private javax.swing.JButton kunde_andern_search_;
    private javax.swing.JTable kunde_andern_table;
    private javax.swing.JButton kunde_btn;
    private javax.swing.JPanel kunde_erstellen;
    private javax.swing.JButton kunde_erstellen_btn;
    private javax.swing.JPanel kunde_loschen;
    private javax.swing.JButton kunde_loschen_btn;
    private javax.swing.JComboBox<String> kunde_name_bestellung_andern;
    private javax.swing.JComboBox<String> kunde_name_bestellung_erstellen;
    private javax.swing.JComboBox<String> kunde_name_bestellung_loschen;
    private javax.swing.JTextField kunde_name_feld;
    private javax.swing.JComboBox<String> kunde_name_korb_erstellen;
    private javax.swing.JComboBox<String> kunde_name_kunde_andern;
    private javax.swing.JComboBox<String> kunde_name_kunde_loschen;
    private javax.swing.JTextField kunde_tel_feld;
    private javax.swing.JPanel kunden_panel;
    private javax.swing.JPanel kunden_seidpanel;
    private javax.swing.JButton list_btn;
    private javax.swing.JLayeredPane liste_LayeredPane;
    private javax.swing.JPanel liste_seidpanel;
    private javax.swing.JPanel listen_panel;
    private javax.swing.JPanel packliste;
    private javax.swing.JButton packliste_btn;
    private javax.swing.JCheckBox periodisch_CheckBox;
    private javax.swing.JButton rechnung_btn;
    private javax.swing.JPanel rechnung_panel;
    private javax.swing.JPanel seidpanel;
    // End of variables declaration//GEN-END:variables
}
