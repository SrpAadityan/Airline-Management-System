package GUI;
import Classes.*;
import javax.swing.table.DefaultTableModel;

public class FlightSearchResults extends javax.swing.JInternalFrame {

    /**
     * Creates new form SelectAFlight
     */
    public FlightSearchResults() {
        initComponents();
    }
    
    public FlightSearchResults(String data){
        initComponents();
        String [] check = data.split("@");
        
        DefaultTableModel model = (DefaultTableModel)tableList.getModel();
        //model.addRow(check);  //Madhushi
        model.addRow(new Object[]{check[0],check[1],check[2],check[3]});
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableList = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        flightIDText = new javax.swing.JTextField();
        checkFlightsBtn = new javax.swing.JButton();

        setClosable(true);
        setTitle("Flight Search Results: Found");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Available Flights");

        tableList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight ID", "Departure Time (h)", "Arrival Time (h)", "Available Seat Count"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableList);

        jLabel1.setText("Selected Flight (ID)");

        checkFlightsBtn.setText("Proceed");
        checkFlightsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkFlightsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(34, 34, 34)
                            .addComponent(flightIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(checkFlightsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(flightIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkFlightsBtn))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkFlightsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkFlightsBtnActionPerformed
                   
            String flightID = flightIDText.getText();
            String seatAvailability =  MainForm.manager.searchFlightSeatAvailability(flightID);
            
            ReserveSeats reserve = new ReserveSeats(flightID,seatAvailability);
            reserve.setVisible(true);
            this.getDesktopPane().add(reserve);
            this.dispose();
    }//GEN-LAST:event_checkFlightsBtnActionPerformed

    private void tableListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableListMouseClicked
        flightIDText.setText(tableList.getValueAt(tableList.getSelectedRow(), tableList.getSelectedColumn()).toString());
    }//GEN-LAST:event_tableListMouseClicked


    // Variables declaration //GEN-BEGIN:variables
    private javax.swing.JButton checkFlightsBtn;
    private javax.swing.JTextField flightIDText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableList;
    // End of variables declaration//GEN-END:variables
}
