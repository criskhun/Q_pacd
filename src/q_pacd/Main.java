/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q_pacd;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Support
 */
public class Main extends javax.swing.JFrame {
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;

    public Main() {
        initComponents();
        conn = (Connection) MySqlConnect.ConnectDB();
        currentdate();
        all_ref();
        Alarmtest ac=new Alarmtest();
        ac.checkAlarm(00,00);
    }
    
    public void currentdate(){
    new Timer(0, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("HH:mm:ss");
                time.setText(s.format(d));

                SimpleDateFormat st = new SimpleDateFormat("MM/dd/yyyy");
                date.setText(st.format(d));
            }
        })
                .start();
    }
    
    public void all_ref(){
    asse_tref();
    enco_tref();
    cash_tref();
    marn_tref();
    term_tref();
    fd_tref();
    psd_tref();
    ppd_tref();
    ad_tref();
    opm_tref();
    esd_tref();
    }
    
    public void asse_tref(){
    try {
            String sql = "SELECT * FROM asse_ticket ORDER BY ID DESC";
            pst = (java.sql.PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();

            asse_tablecount.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void enco_tref(){
    try {
            String sql = "SELECT * FROM enco_ticket ORDER BY ID DESC";
            pst = (java.sql.PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();

            enco_tablecount.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void cash_tref(){
    try {
            String sql = "SELECT * FROM cash_ticket ORDER BY ID DESC";
            pst = (java.sql.PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();

            cash_tablecount.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void marn_tref(){
    try {
            String sql = "SELECT * FROM marn_ticket ORDER BY ID DESC";
            pst = (java.sql.PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();

            marn_tablecount.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void term_tref(){
    try {
            String sql = "SELECT * FROM term_ticket ORDER BY ID DESC";
            pst = (java.sql.PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();

            term_tablecount.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void fd_tref(){
    try {
            String sql = "SELECT * FROM fd_ticket ORDER BY ID DESC";
            pst = (java.sql.PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();

            fd_tablecount.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void psd_tref(){
    try {
            String sql = "SELECT * FROM psd_ticket ORDER BY ID DESC";
            pst = (java.sql.PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();

            psd_tablecount.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void ppd_tref(){
    try {
            String sql = "SELECT * FROM ppd_ticket ORDER BY ID DESC";
            pst = (java.sql.PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();

            ppd_tablecount.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void ad_tref(){
    try {
            String sql = "SELECT * FROM ad_ticket ORDER BY ID DESC";
            pst = (java.sql.PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();

            ad_tablecount.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void opm_tref(){
    try {
            String sql = "SELECT * FROM opm_ticket ORDER BY ID DESC";
            pst = (java.sql.PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();

            opm_tablecount.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void esd_tref(){
    try {
            String sql = "SELECT * FROM esd_ticket ORDER BY ID DESC";
            pst = (java.sql.PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();

            esd_tablecount.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void prio_tref(){
    try {
            String sql = "SELECT * FROM prio_ticket ORDER BY ID DESC";
            pst = (java.sql.PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();

            prio_tablecount.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        display = new javax.swing.JPanel();
        ASSESSMENT_btn = new javax.swing.JButton();
        ENCODING_btn = new javax.swing.JButton();
        CASHIER_btn = new javax.swing.JButton();
        MARINE_btn = new javax.swing.JButton();
        TERMINAL_btn = new javax.swing.JButton();
        FD_btn = new javax.swing.JButton();
        PSD_btn = new javax.swing.JButton();
        PPD_btn = new javax.swing.JButton();
        AD_tbl = new javax.swing.JButton();
        OPM_btn = new javax.swing.JButton();
        ESD_btn = new javax.swing.JButton();
        PRIORITY_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        table = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        clientname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        asse_tablecount = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        ticket_code = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        enco_tablecount = new javax.swing.JTable();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        cash_tablecount = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        marn_tablecount = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        term_tablecount = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        fd_tablecount = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        psd_tablecount = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        ppd_tablecount = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        ad_tablecount = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        opm_tablecount = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        esd_tablecount = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        prio_tablecount = new javax.swing.JTable();
        transaction = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        trans = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new java.awt.CardLayout());

        ASSESSMENT_btn.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        ASSESSMENT_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/assessment.png"))); // NOI18N
        ASSESSMENT_btn.setText("ASSESSMENT");
        ASSESSMENT_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ASSESSMENT_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ASSESSMENT_btnActionPerformed(evt);
            }
        });

        ENCODING_btn.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        ENCODING_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/encoding.png"))); // NOI18N
        ENCODING_btn.setText("ENCODING");
        ENCODING_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ENCODING_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENCODING_btnActionPerformed(evt);
            }
        });

        CASHIER_btn.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        CASHIER_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cashier.png"))); // NOI18N
        CASHIER_btn.setText("CASHIER");
        CASHIER_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CASHIER_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CASHIER_btnActionPerformed(evt);
            }
        });

        MARINE_btn.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        MARINE_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/marine.png"))); // NOI18N
        MARINE_btn.setText("MARINE");
        MARINE_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MARINE_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MARINE_btnActionPerformed(evt);
            }
        });

        TERMINAL_btn.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        TERMINAL_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/terminal.png"))); // NOI18N
        TERMINAL_btn.setText("Terminal");
        TERMINAL_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TERMINAL_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TERMINAL_btnActionPerformed(evt);
            }
        });

        FD_btn.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        FD_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/disbursement.png"))); // NOI18N
        FD_btn.setText("FD-DISBURSEMENT");
        FD_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FD_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FD_btnActionPerformed(evt);
            }
        });

        PSD_btn.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        PSD_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/safety.png"))); // NOI18N
        PSD_btn.setText("PSD-SAFETY");
        PSD_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PSD_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PSD_btnActionPerformed(evt);
            }
        });

        PPD_btn.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        PPD_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/policeman.png"))); // NOI18N
        PPD_btn.setText("PPD");
        PPD_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PPD_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PPD_btnActionPerformed(evt);
            }
        });

        AD_tbl.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        AD_tbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/records.png"))); // NOI18N
        AD_tbl.setText("AD-RECORDS");
        AD_tbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AD_tbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AD_tblActionPerformed(evt);
            }
        });

        OPM_btn.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        OPM_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/permits.png"))); // NOI18N
        OPM_btn.setText("OPM-PERMITS");
        OPM_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        OPM_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OPM_btnActionPerformed(evt);
            }
        });

        ESD_btn.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        ESD_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/engineer.png"))); // NOI18N
        ESD_btn.setText("ESD");
        ESD_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ESD_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ESD_btnActionPerformed(evt);
            }
        });

        PRIORITY_btn.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        PRIORITY_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/priority.png"))); // NOI18N
        PRIORITY_btn.setText("PRIORITY LANE");
        PRIORITY_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PRIORITY_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRIORITY_btnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Please Select Your Transaction");

        javax.swing.GroupLayout displayLayout = new javax.swing.GroupLayout(display);
        display.setLayout(displayLayout);
        displayLayout.setHorizontalGroup(
            displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 961, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(displayLayout.createSequentialGroup()
                        .addComponent(AD_tbl, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OPM_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ESD_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PRIORITY_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(displayLayout.createSequentialGroup()
                        .addComponent(ASSESSMENT_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ENCODING_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CASHIER_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MARINE_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(displayLayout.createSequentialGroup()
                        .addComponent(TERMINAL_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FD_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PSD_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PPD_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        displayLayout.setVerticalGroup(
            displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AD_tbl, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OPM_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ESD_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PRIORITY_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PSD_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PPD_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TERMINAL_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FD_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CASHIER_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MARINE_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ASSESSMENT_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ENCODING_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel2.add(display, "card2");

        jLabel2.setText("Name:");

        jLabel3.setText("assessment");

        asse_tablecount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(asse_tablecount);

        jLabel4.setText("Ticket Number:");

        jLabel5.setText("encoding");

        enco_tablecount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(enco_tablecount);

        date.setText("date");

        time.setText("time");

        jLabel7.setText("casheir");

        cash_tablecount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(cash_tablecount);

        jLabel8.setText("marine");

        marn_tablecount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(marn_tablecount);

        term_tablecount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(term_tablecount);

        jLabel9.setText("terminal");

        jLabel6.setText("fd");

        fd_tablecount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(fd_tablecount);

        jLabel10.setText("psd");

        psd_tablecount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(psd_tablecount);

        jLabel11.setText("ppd");

        ppd_tablecount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(ppd_tablecount);

        jLabel12.setText("ad");

        ad_tablecount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane9.setViewportView(ad_tablecount);

        opm_tablecount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane10.setViewportView(opm_tablecount);

        jLabel13.setText("opm");

        jLabel14.setText("esd");

        esd_tablecount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane11.setViewportView(esd_tablecount);

        jLabel15.setText("priority");

        prio_tablecount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane12.setViewportView(prio_tablecount);

        transaction.setText("trans");

        jLabel16.setText("jLabel16");

        javax.swing.GroupLayout tableLayout = new javax.swing.GroupLayout(table);
        table.setLayout(tableLayout);
        tableLayout.setHorizontalGroup(
            tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tableLayout.createSequentialGroup()
                        .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addGroup(tableLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ticket_code))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clientname))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(tableLayout.createSequentialGroup()
                                .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(tableLayout.createSequentialGroup()
                                        .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(date)
                                            .addComponent(jLabel5))
                                        .addGap(44, 44, 44)
                                        .addComponent(time)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(tableLayout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(transaction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(tableLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(trans)
                                .addGap(712, 712, 712))))
                    .addGroup(tableLayout.createSequentialGroup()
                        .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(295, Short.MAX_VALUE))
        );
        tableLayout.setVerticalGroup(
            tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tableLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tableLayout.createSequentialGroup()
                        .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(tableLayout.createSequentialGroup()
                                .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(date)
                                    .addComponent(time))
                                .addGap(18, 18, 18)
                                .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(tableLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(tableLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(tableLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(tableLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(tableLayout.createSequentialGroup()
                                        .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel15)
                                            .addComponent(transaction))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(38, 38, 38))
                            .addGroup(tableLayout.createSequentialGroup()
                                .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(clientname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(ticket_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)
                                    .addComponent(trans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(tableLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tableLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tableLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tableLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tableLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(157, Short.MAX_VALUE))
        );

        jPanel2.add(table, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ASSESSMENT_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ASSESSMENT_btnActionPerformed
        String res = JOptionPane.showInputDialog(this, "Client Name:");
        clientname.setText(res);
        trans.setText("ASSESSMENT");
        asse_tref();
        
        int rows = asse_tablecount.getRowCount();
        if(rows<=0){
            ticket_code.setText("A1001");
            try {
                    String sql = "Insert into asse_ticket (Ticket) values (?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.execute();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                }
        } else{
            int total;
            total = rows + 1001;
            ticket_code.setText("A"+Integer.toString(total));
            try {
                    String sql = "Insert into asse_ticket (Ticket) values (?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.execute();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                }
        }
        try{
        String sql = "Insert into assessment_tbl (Assessment_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.setString(2, clientname.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, "R"+time.getText());
                    pst.execute();
        } catch (Exception e){
        }
        print();
        asse_tref();
        ticket_code.setText("");
    }//GEN-LAST:event_ASSESSMENT_btnActionPerformed

    private void ENCODING_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENCODING_btnActionPerformed
        String res = JOptionPane.showInputDialog(this, "Client Name:");
        clientname.setText(res);
        trans.setText("ENCODING");
        enco_tref();
        
        int rows = enco_tablecount.getRowCount();
        if(rows<=0){
            ticket_code.setText("E2001");
            try {
                    String sql = "Insert into enco_ticket (Ticket) values (?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.execute();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                }
        } else{
            int total;
            total = rows + 2001;
            ticket_code.setText("E"+Integer.toString(total));
            try {
                    String sql = "Insert into enco_ticket (Ticket) values (?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.execute();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                }
        }
        try{
        String sql = "Insert into encoding_tbl (Encoding_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.setString(2, clientname.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, "R"+time.getText());
                    pst.execute();
        } catch (Exception e){
        }
        print();
        enco_tref();
        ticket_code.setText("");
    }//GEN-LAST:event_ENCODING_btnActionPerformed

    private void CASHIER_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CASHIER_btnActionPerformed
        String res = JOptionPane.showInputDialog(this, "Client Name:");
        clientname.setText(res);
        trans.setText("CASHIER");
        cash_tref();
        
        int rows = cash_tablecount.getRowCount();
        if(rows<=0){
            ticket_code.setText("C3001");
            try {
                    String sql = "Insert into cash_ticket (Ticket) values (?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.execute();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                }
        } else{
            int total;
            total = rows + 3001;
            ticket_code.setText("C"+Integer.toString(total));
            try {
                    String sql = "Insert into cash_ticket (Ticket) values (?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.execute();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                }
        }
        try{
        String sql = "Insert into cashier_tbl (Cashier_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.setString(2, clientname.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, "R"+time.getText());
                    pst.execute();
        } catch (Exception e){
        }
        print();
        cash_tref();
        ticket_code.setText("");
    }//GEN-LAST:event_CASHIER_btnActionPerformed

    private void MARINE_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MARINE_btnActionPerformed
        String res = JOptionPane.showInputDialog(this, "Client Name:");
        clientname.setText(res);
        trans.setText("MARINE");
        marn_tref();
        
        int rows = marn_tablecount.getRowCount();
        if(rows<=0){
            ticket_code.setText("M4001");
            try {
                    String sql = "Insert into marn_ticket (Ticket) values (?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.execute();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                }
        } else{
            int total;
            total = rows + 4001;
            ticket_code.setText("M"+Integer.toString(total));
            try {
                    String sql = "Insert into marn_ticket (Ticket) values (?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.execute();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                }
        }
        try{
        String sql = "Insert into marine_tbl (Marine_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.setString(2, clientname.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, "R"+time.getText());
                    pst.execute();
        } catch (Exception e){
        }
        print();
        marn_tref();
        ticket_code.setText("");
    }//GEN-LAST:event_MARINE_btnActionPerformed

    private void TERMINAL_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TERMINAL_btnActionPerformed
        String res = JOptionPane.showInputDialog(this, "Client Name:");
        clientname.setText(res);
        trans.setText("TERMINAL");
        term_tref();
        
        int rows = term_tablecount.getRowCount();
        if(rows<=0){
            ticket_code.setText("T5001");
            try {
                    String sql = "Insert into term_ticket (Ticket) values (?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.execute();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                }
        } else{
            int total;
            total = rows + 5001;
            ticket_code.setText("T"+Integer.toString(total));
            try {
                    String sql = "Insert into term_ticket (Ticket) values (?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.execute();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                }
        }
        try{
        String sql = "Insert into terminal_tbl (Terminal_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.setString(2, clientname.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, "R"+time.getText());
                    pst.execute();
        } catch (Exception e){
        }
        print();
        term_tref();
        ticket_code.setText("");
    }//GEN-LAST:event_TERMINAL_btnActionPerformed

    private void FD_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FD_btnActionPerformed
        String res = JOptionPane.showInputDialog(this, "Client Name:");
        clientname.setText(res);
        trans.setText("FD-Disbursement");
        fd_tref();
        
        int rows = fd_tablecount.getRowCount();
        if(rows<=0){
            ticket_code.setText("FD-1");
            try {
                    String sql = "Insert into fd_ticket (Ticket) values (?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.execute();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                }
        } else{
            int total;
            total = rows + 1;
            ticket_code.setText("FD-"+Integer.toString(total));
            try {
                    String sql = "Insert into fd_ticket (Ticket) values (?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.execute();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                }
        }
        try{
        String sql = "Insert into fd_tbl (Fd_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.setString(2, clientname.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, "R"+time.getText());
                    pst.execute();
        } catch (Exception e){
        }
        print();
        fd_tref();
        ticket_code.setText("");
    }//GEN-LAST:event_FD_btnActionPerformed

    private void PSD_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PSD_btnActionPerformed
        String res = JOptionPane.showInputDialog(this, "Client Name:");
        clientname.setText(res);
        trans.setText("PSD-Safety");
        psd_tref();
        
        int rows = psd_tablecount.getRowCount();
        if(rows<=0){
            ticket_code.setText("PSD-1");
            try {
                    String sql = "Insert into psd_ticket (Ticket) values (?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.execute();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                }
        } else{
            int total;
            total = rows + 1;
            ticket_code.setText("PSD-"+Integer.toString(total));
            try {
                    String sql = "Insert into psd_ticket (Ticket) values (?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.execute();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                }
        }
        try{
        String sql = "Insert into psd_tbl (Psd_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.setString(2, clientname.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, "R"+time.getText());
                    pst.execute();
        } catch (Exception e){
        }
        print();
        psd_tref();
        ticket_code.setText("");
    }//GEN-LAST:event_PSD_btnActionPerformed

    private void PPD_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PPD_btnActionPerformed
        String res = JOptionPane.showInputDialog(this, "Client Name:");
        clientname.setText(res);
        trans.setText("PPD");
        ppd_tref();
        
        int rows = ppd_tablecount.getRowCount();
        if(rows<=0){
            ticket_code.setText("PPD-1");
            try {
                    String sql = "Insert into ppd_ticket (Ticket) values (?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.execute();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                }
        } else{
            int total;
            total = rows + 1;
            ticket_code.setText("PPD-"+Integer.toString(total));
            try {
                    String sql = "Insert into ppd_ticket (Ticket) values (?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.execute();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                }
        }
        try{
        String sql = "Insert into ppd_tbl (Ppd_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.setString(2, clientname.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, "R"+time.getText());
                    pst.execute();
        } catch (Exception e){
        }
        print();
        ppd_tref();
        ticket_code.setText("");
    }//GEN-LAST:event_PPD_btnActionPerformed

    private void AD_tblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AD_tblActionPerformed
        String res = JOptionPane.showInputDialog(this, "Client Name:");
        clientname.setText(res);
        trans.setText("AD-Records");
        ad_tref();
        
        int rows = ad_tablecount.getRowCount();
        if(rows<=0){
            ticket_code.setText("AD-1");
            try {
                    String sql = "Insert into ad_ticket (Ticket) values (?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.execute();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                }
        } else{
            int total;
            total = rows + 1;
            ticket_code.setText("AD-"+Integer.toString(total));
            try {
                    String sql = "Insert into ad_ticket (Ticket) values (?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.execute();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                }
        }
        try{
        String sql = "Insert into ad_tbl (Ad_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.setString(2, clientname.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, "R"+time.getText());
                    pst.execute();
        } catch (Exception e){
        }
        print();
        ad_tref();
        ticket_code.setText("");
    }//GEN-LAST:event_AD_tblActionPerformed

    private void OPM_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OPM_btnActionPerformed
        String res = JOptionPane.showInputDialog(this, "Client Name:");
        clientname.setText(res);
        trans.setText("OPM-Permits");
        opm_tref();
        
        int rows = opm_tablecount.getRowCount();
        if(rows<=0){
            ticket_code.setText("OPM-1");
            try {
                    String sql = "Insert into opm_ticket (Ticket) values (?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.execute();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                }
        } else{
            int total;
            total = rows + 1;
            ticket_code.setText("OPM-"+Integer.toString(total));
            try {
                    String sql = "Insert into opm_ticket (Ticket) values (?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.execute();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                }
        }
        try{
        String sql = "Insert into opm_tbl (Opm_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.setString(2, clientname.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, "R"+time.getText());
                    pst.execute();
        } catch (Exception e){
        }
        print();
        opm_tref();
        ticket_code.setText("");
    }//GEN-LAST:event_OPM_btnActionPerformed

    private void ESD_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ESD_btnActionPerformed
        String res = JOptionPane.showInputDialog(this, "Client Name:");
        clientname.setText(res);
        trans.setText("ESD");
        esd_tref();
        
        int rows = esd_tablecount.getRowCount();
        if(rows<=0){
            ticket_code.setText("ESD-1");
            try {
                    String sql = "Insert into esd_ticket (Ticket) values (?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.execute();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                }
        } else{
            int total;
            total = rows + 1;
            ticket_code.setText("ESD-"+Integer.toString(total));
            try {
                    String sql = "Insert into esd_ticket (Ticket) values (?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.execute();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                }
        } 
        try{
        String sql = "Insert into esd_tbl (Esd_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.setString(2, clientname.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, "R"+time.getText());
                    pst.execute();
        } catch (Exception e){
        }
        print();
        esd_tref();
        ticket_code.setText("");
    }//GEN-LAST:event_ESD_btnActionPerformed

    private void PRIORITY_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRIORITY_btnActionPerformed
        String remarks[] = {"ASSESSMENT","ENCODING","PAYMENT","MARINE","TERMINAL","FD-Disbursement","PSD-Safety",""
                + "PPD","AD-Records","OPM-Permits","ESD"};
        JComboBox cb = new JComboBox(remarks);
        
        int input;
        input = JOptionPane.showConfirmDialog(this,cb, "Select Remarks",JOptionPane.DEFAULT_OPTION);
        
        if(input == JOptionPane.OK_OPTION){
        String str = (String) cb.getSelectedItem();
        transaction.setText(str);
        trans.setText(str);
        String res = JOptionPane.showInputDialog(this, "Client Name:");
        clientname.setText(res);
        
        prio_tref();
        
        int rows = prio_tablecount.getRowCount();
        if(rows<=0){
            ticket_code.setText("PRIORITY-1");
            try {
                    String sql = "Insert into prio_ticket (Ticket) values (?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.execute();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                }
                } else{ 
                    int total;
                    total = rows + 1;
                    ticket_code.setText("PRIORITY-"+Integer.toString(total));
                    try {
                    String sql = "Insert into prio_ticket (Ticket) values (?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.execute();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                }
                }
        if(transaction.getText().equals("ASSESSMENT")){
        try{
        String sql = "Insert into assessment_tbl (Assessment_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.setString(2, clientname.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, "P"+time.getText());
                    pst.execute();
        } catch (Exception e){
        }
        }
        else if(transaction.getText().equals("ENCODING")){
        try{
        String sql = "Insert into encoding_tbl (Encoding_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.setString(2, clientname.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, "P"+time.getText());
                    pst.execute();
        } catch (Exception e){
        }
        }
        else if(transaction.getText().equals("PAYMENT")){
        try{
        String sql = "Insert into cashier_tbl (Cashier_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.setString(2, clientname.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, "P"+time.getText());
                    pst.execute();
        } catch (Exception e){
        }
        }
        else if(transaction.getText().equals("MARINE")){
        try{
        String sql = "Insert into marine_tbl (Marine_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.setString(2, clientname.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, "P"+time.getText());
                    pst.execute();
        } catch (Exception e){
        }
        }
        else if(transaction.getText().equals("TERMINAL")){
        try{
        String sql = "Insert into terminal_tbl (Terminal_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.setString(2, clientname.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, "P"+time.getText());
                    pst.execute();
        } catch (Exception e){
        }
        }
        else if(transaction.getText().equals("FD-Disbursement")){
        try{
        String sql = "Insert into fd_tbl (Fd_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.setString(2, clientname.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, "P"+time.getText());
                    pst.execute();
        } catch (Exception e){
        }
        }
        else if(transaction.getText().equals("PSD-Safety")){
        try{
        String sql = "Insert into psd_tbl (Psd_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.setString(2, clientname.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, "P"+time.getText());
                    pst.execute();
        } catch (Exception e){
        }
        }
        else if(transaction.getText().equals("PPD")){
        try{
        String sql = "Insert into ppd_tbl (Ppd_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.setString(2, clientname.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, "P"+time.getText());
                    pst.execute();
        } catch (Exception e){
        }
        }
        else if(transaction.getText().equals("AD-Records")){
        try{
        String sql = "Insert into ad_tbl (Ad_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.setString(2, clientname.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, "P"+time.getText());
                    pst.execute();
        } catch (Exception e){
        }
        }
        else if(transaction.getText().equals("OPM-Permits")){
        try{
        String sql = "Insert into opm_tbl (Opm_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.setString(2, clientname.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, "P"+time.getText());
                    pst.execute();
        } catch (Exception e){
        }
        }
        else if(transaction.getText().equals("ESD")){
        try{
        String sql = "Insert into esd_tbl (Esd_num, Client, Date, Time) values (?,?,?,?)";
                    pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                    pst.setString(1, ticket_code.getText());
                    pst.setString(2, clientname.getText());
                    pst.setString(3, date.getText());
                    pst.setString(4, "P"+time.getText());
                    pst.execute();
        } catch (Exception e){
        }
        }
        }
        print();
        prio_tref();
        
    }//GEN-LAST:event_PRIORITY_btnActionPerformed

    public class Alarmtest {
    public void checkAlarm(final int a, final int b){
        Thread t=new Thread(){
            public void run(){
                int wl=0;
                while(wl==0){
                    Calendar c=new GregorianCalendar();
                    int hour=c.get(Calendar.HOUR_OF_DAY);
                    int mins=c.get(Calendar.MINUTE);
                    if(a==hour&&b==mins){
                        System.exit(0);
                        break;
                    }
                }
            }
        };
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();
    }
    }
    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    public PageFormat getPageFormat(PrinterJob pj)
{
    
    PageFormat pf = pj.defaultPage();
    Paper paper = pf.getPaper();    

    double middleHeight =8.0;  
    double headerHeight = 2.0;                  
    double footerHeight = 2.0;                  
    double width = convert_CM_To_PPI(8);      //printer know only point per inch.default value is 72ppi
    double height = convert_CM_To_PPI(headerHeight+middleHeight+footerHeight); 
    paper.setSize(width, height);
    paper.setImageableArea(                    
        0,
        10,
        width,            
        height - convert_CM_To_PPI(1)
    );   //define boarder size    after that print area width is about 180 points
            
    pf.setOrientation(PageFormat.PORTRAIT);           //select orientation portrait or landscape but for this time portrait
    pf.setPaper(paper);    

    return pf;
    }
    protected static double convert_CM_To_PPI(double cm) {            
	        return toPPI(cm * 0.393600787);            
    }
 
    protected static double toPPI(double inch) {            
	        return inch * 72d;            
    }
    
    public class BillPrintable implements Printable {
  public int print(Graphics graphics, PageFormat pageFormat,int pageIndex) 
  throws PrinterException 
  {    

      int result = NO_SUCH_PAGE;    
        if (pageIndex == 0) {                    
        
            Graphics2D g2d = (Graphics2D) graphics;                    

            double width = pageFormat.getImageableWidth();                    
           
            g2d.translate((int) pageFormat.getImageableX(),(int) pageFormat.getImageableY()); 

            ////////// code by alqama//////////////

            FontMetrics metrics=g2d.getFontMetrics(new Font("Arial",Font.BOLD,7));
        //    int idLength=metrics.stringWidth("000000");
            //int idLength=metrics.stringWidth("00");
            int idLength=metrics.stringWidth("000");
            int amtLength=metrics.stringWidth("000000");
            int qtyLength=metrics.stringWidth("00000");
            int priceLength=metrics.stringWidth("000000");
            int prodLength=(int)width - idLength - amtLength - qtyLength - priceLength-17;
            
            int productPosition = 0;
            int discountPosition= prodLength+5;
            int pricePosition = discountPosition +idLength+10;
            int qtyPosition=pricePosition + priceLength + 4;
            int amtPosition=qtyPosition + qtyLength;
     
        try{
            /*Draw Header*/
            int y=20;
            int yShift = 10;
            int headerRectHeight=15;
            int headerRectHeighta=40;
                
             g2d.setFont(new Font("Monospaced",Font.PLAIN,9));
            //g2d.drawString("      "+jLabel20.get+"            ",10,y);y+=yShift;
            g2d.drawString("-------------------------------------",12,y);y+=yShift;
            g2d.drawString("  Philippine Port Authority       ",12,y);y+=yShift;
            g2d.drawString("        PMO Socsargen            ",12,y);y+=yShift;
      
            g2d.drawString("-------------------------------------",10,y);y+=yShift;
            g2d.drawString("  Welcome, "+clientname.getText()+",          ",10,y);y+=yShift;
            g2d.drawString("  you are currently     ",10,y);y+=yShift;
            g2d.drawString("  in the queue.       ",10,y);y+=headerRectHeight;
            g2d.drawString("                                     ",10,y);
            //g2d.setFont(new Font("Monospaced",Font.BOLD,10));
           
            g2d.drawString("                                     ",10,y);y+=yShift;
            g2d.drawString("                                     ",10,y);y+=yShift;
            g2d.drawString("                                     ",10,y);
             g2d.setFont(new Font("Monospaced",Font.BOLD,16));
            g2d.drawString("  "+ticket_code.getText()+"            ",10,y);
            g2d.drawString("                                     ",10,y);y+=yShift;
            g2d.drawString("                                     ",10,y);y+=yShift;
            g2d.drawString("  "+trans.getText()+"           ",10,y);y+=headerRectHeight;
            g2d.drawString("                                ",10,y);y+=yShift;
            g2d.drawString("                                     ",10,y);y+=yShift;
            g2d.drawString("                                     ",10,y);y+=yShift;
            g2d.setFont(new Font("Monospaced",Font.PLAIN,9));
            g2d.drawString("   Your number will be called       ",10,y);y+=yShift;
            g2d.drawString(" shortly, Thank you for waiting     ",10,y);y+=yShift;
            g2d.drawString("  "+date.getText()+"             ",10,y);y+=yShift;
            g2d.drawString("  "+time.getText()+"             ",10,y);y+=yShift;
            g2d.drawString("                                     ",10,y);y+=yShift;        
//            g2d.setFont(new Font("Monospaced",Font.BOLD,10));
//            g2d.drawString("Customer Shopping Invoice", 30,y);y+=yShift; 
    }
    catch(Exception r){
    r.printStackTrace();
    }

              result = PAGE_EXISTS;    
          }    
          return result;    
      }
   }
    
    public void print(){
    PrinterJob pj = PrinterJob.getPrinterJob();        
        pj.setPrintable(new BillPrintable(),getPageFormat(pj));
        try {
             pj.print();
          
        }
         catch (PrinterException ex) {
                 ex.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AD_tbl;
    private javax.swing.JButton ASSESSMENT_btn;
    private javax.swing.JButton CASHIER_btn;
    private javax.swing.JButton ENCODING_btn;
    private javax.swing.JButton ESD_btn;
    private javax.swing.JButton FD_btn;
    private javax.swing.JButton MARINE_btn;
    private javax.swing.JButton OPM_btn;
    private javax.swing.JButton PPD_btn;
    private javax.swing.JButton PRIORITY_btn;
    private javax.swing.JButton PSD_btn;
    private javax.swing.JButton TERMINAL_btn;
    private javax.swing.JTable ad_tablecount;
    private javax.swing.JTable asse_tablecount;
    private javax.swing.JTable cash_tablecount;
    private javax.swing.JTextField clientname;
    private javax.swing.JLabel date;
    private javax.swing.JPanel display;
    private javax.swing.JTable enco_tablecount;
    private javax.swing.JTable esd_tablecount;
    private javax.swing.JTable fd_tablecount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable marn_tablecount;
    private javax.swing.JTable opm_tablecount;
    private javax.swing.JTable ppd_tablecount;
    private javax.swing.JTable prio_tablecount;
    private javax.swing.JTable psd_tablecount;
    private javax.swing.JPanel table;
    private javax.swing.JTable term_tablecount;
    private javax.swing.JTextField ticket_code;
    private javax.swing.JLabel time;
    private javax.swing.JTextField trans;
    private javax.swing.JLabel transaction;
    // End of variables declaration//GEN-END:variables
}
