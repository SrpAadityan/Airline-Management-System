package GUI;

import Classes.SystemManager;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.imageio.ImageIO;
import javax.swing.*;

public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    
    public static SystemManager manager ;
    
    public MainForm() {

        initComponents();
        
        construct();
        
         manager = new SystemManager("flightinfo.txt");
    }
    
    public MainForm(String file) {

        initComponents();
        
        construct();
        
        manager = new SystemManager(file);
    }

    private void construct()
    {
        //DD::: setup the footer notification area with live date and time along with setting the window to maximized state

        this.setExtendedState( this.getExtendedState() | JFrame.MAXIMIZED_BOTH);

        //Start Timer
        final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        int interval = 1000; // 1000 ms

        new Timer(interval, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calendar now = Calendar.getInstance();
                lblNow.setText(dateFormat.format(now.getTime()));
            }
        }).start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new JMenuItem();
        dp = new JDesktopPane();
        panelStatus = new JPanel();
        lblNow = new JLabel();
        jMenuBar1 = new JMenuBar();
        jMenu1 = new JMenu();
        menuSave = new JMenuItem();
        jMenuItem2 = new JMenuItem();
        menuClose = new JMenuItem();
        jMenu4 = new JMenu();
        menuReserveSeat = new JMenuItem();
        menuCancelReservation = new JMenuItem();
        menuFlightPassengerList = new JMenuItem();
        menuPassengerReservations = new JMenuItem();
        jMenu2 = new JMenu();
        menuCloseAll = new JMenuItem();
        jMenu3 = new JMenu();
        menuAbout = new JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Airline Management System");


        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        dp.setBackground(new Color(204, 204, 204));

        GroupLayout dpLayout = new GroupLayout(dp);
        dp.setLayout(dpLayout);

        dpLayout.setHorizontalGroup(
            dpLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        dpLayout.setVerticalGroup(
            dpLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 212, Short.MAX_VALUE)
        );

        lblNow.setFont(new Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblNow.setText("Loading..");

        GroupLayout panelStatusLayout = new GroupLayout(panelStatus);
        panelStatus.setLayout(panelStatusLayout);

        panelStatusLayout.setHorizontalGroup(
            panelStatusLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNow)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelStatusLayout.setVerticalGroup(
            panelStatusLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, panelStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNow, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuBar1.setMinimumSize(new Dimension(66, 50));
        jMenuBar1.setPreferredSize(new Dimension(180, 50));

        jMenu1.setText("File");
        jMenu1.setFont(new Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jMenu1.setHorizontalAlignment(SwingConstants.CENTER);
        jMenu1.setHorizontalTextPosition(SwingConstants.CENTER);
        jMenu1.setPreferredSize(new Dimension(30, 25));

        menuSave.setText("Save");
        menuSave.setPreferredSize(new Dimension(49, 30));
        menuSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuSaveActionPerformed(evt);
            }
        });
        jMenu1.add(menuSave);

        jMenuItem2.setText("Log Out");
        jMenuItem2.setPreferredSize(new Dimension(65, 30));
        jMenuItem2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        menuClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_MASK));
        menuClose.setText("Close");
        menuClose.setPreferredSize(new Dimension(97, 30));
        menuClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuCloseActionPerformed(evt);
            }
        });
        jMenu1.add(menuClose);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Tools");
        jMenu4.setFont(new Font("Segoe UI Semibold", 0, 15)); // NOI18N

        menuReserveSeat.setText("Reserve a Seat");
        menuReserveSeat.setPreferredSize(new Dimension(107, 30));
        menuReserveSeat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuReserveSeatActionPerformed(evt);
            }
        });
        jMenu4.add(menuReserveSeat);

        menuCancelReservation.setText("Cancel Reservation");
        menuCancelReservation.setPreferredSize(new Dimension(131, 30));
        menuCancelReservation.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuCancelReservationActionPerformed(evt);
            }
        });
        jMenu4.add(menuCancelReservation);

        menuFlightPassengerList.setText("Flight Passenger List");
        menuFlightPassengerList.setPreferredSize(new Dimension(139, 30));
        menuFlightPassengerList.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuFlightPassengerListActionPerformed(evt);
            }
        });
        jMenu4.add(menuFlightPassengerList);

        menuPassengerReservations.setText("Passenger Reservations");
        menuPassengerReservations.setPreferredSize(new Dimension(161, 30));
        menuPassengerReservations.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuPassengerReservationsActionPerformed(evt);
            }
        });
        jMenu4.add(menuPassengerReservations);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Window");
        jMenu2.setFont(new Font("Segoe UI Semibold", 0, 15)); // NOI18N

        menuCloseAll.setText("Close All");
        menuCloseAll.setPreferredSize(new Dimension(69, 30));
        menuCloseAll.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuCloseAllActionPerformed(evt);
            }
        });
        jMenu2.add(menuCloseAll);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");
        jMenu3.setFont(new Font("Segoe UI Semibold", 0, 15)); // NOI18N

        menuAbout.setText("About");
        menuAbout.setPreferredSize(new Dimension(53, 30));
        menuAbout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuAboutActionPerformed(evt);
            }
        });
        jMenu3.add(menuAbout);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(panelStatus, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dp)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(dp)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelStatus, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        String ObjButtons[] = {"Yes","No"};
        int PromptResult = JOptionPane.showOptionDialog(null,"Are you sure you want to Log Out?","Airline Management System" +
                "",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,ObjButtons,ObjButtons[1]);
        if(PromptResult==JOptionPane.YES_OPTION)
        {
            this.setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void menuCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCloseActionPerformed
        String ObjButtons[] = {"Yes","No"};
        int PromptResult = JOptionPane.showOptionDialog(null,"Are you sure you want to exit?","Airline Management System",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,ObjButtons,ObjButtons[1]);
        if(PromptResult==JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_menuCloseActionPerformed

    private void menuCloseAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCloseAllActionPerformed
        JInternalFrame[] frames   = dp.getAllFrames();
        for (int i=0;i<frames.length;i++)
        {
            dp.getDesktopManager().closeFrame(frames[i]);
        }

    }//GEN-LAST:event_menuCloseAllActionPerformed

    private void menuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAboutActionPerformed
        About ab = new About();
        ab.pack();
        ab.setVisible(true);
        dp.add(ab);
    }//GEN-LAST:event_menuAboutActionPerformed

    private void menuReserveSeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReserveSeatActionPerformed
       FlightSearch interf = new FlightSearch();
       interf.pack();
       interf.setVisible(true);
       dp.add(interf);
    }//GEN-LAST:event_menuReserveSeatActionPerformed

    private void menuCancelReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCancelReservationActionPerformed
        Cancellation cancel = new Cancellation();
        cancel.pack();
        cancel.setVisible(true);
        dp.add(cancel);
    }//GEN-LAST:event_menuCancelReservationActionPerformed

    private void menuFlightPassengerListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFlightPassengerListActionPerformed
        GetPassengerList list = new GetPassengerList();
        list.pack();
        list.setVisible(true);
        dp.add(list);
    }//GEN-LAST:event_menuFlightPassengerListActionPerformed

    private void menuPassengerReservationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPassengerReservationsActionPerformed
        GetFlightList list = new GetFlightList();
        list.pack();
        list.setVisible(true);
        dp.add(list);
    }//GEN-LAST:event_menuPassengerReservationsActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        manager.saveReservations();;
        manager.saveFlightInfo();
    }//GEN-LAST:event_formWindowClosing

    private void menuSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSaveActionPerformed
        manager.saveReservations();;
        manager.saveFlightInfo();
    }//GEN-LAST:event_menuSaveActionPerformed


    // Variables declaration //GEN-BEGIN:variables
    private javax.swing.JDesktopPane dp;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel lblNow;
    private javax.swing.JMenuItem menuAbout;
    private javax.swing.JMenuItem menuCancelReservation;
    private javax.swing.JMenuItem menuClose;
    private javax.swing.JMenuItem menuCloseAll;
    private javax.swing.JMenuItem menuFlightPassengerList;
    private javax.swing.JMenuItem menuPassengerReservations;
    private javax.swing.JMenuItem menuReserveSeat;
    private javax.swing.JMenuItem menuSave;
    private javax.swing.JPanel panelStatus;
    // End of variables declaration//GEN-END:variables
}
