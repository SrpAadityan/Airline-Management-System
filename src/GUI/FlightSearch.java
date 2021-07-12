package GUI;
import Classes.*;
import javax.swing.JOptionPane;

public class FlightSearch extends javax.swing.JInternalFrame {

    /**
     * Creates new form FlightSearch
     */
    public FlightSearch() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSpinDay = new javax.swing.JSpinner();
        jSpinMonth = new javax.swing.JSpinner();
        jSpinYear = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        comboDept = new javax.swing.JComboBox<String>();
        jLabel4 = new javax.swing.JLabel();
        comboArrival = new javax.swing.JComboBox<String>();
        btnCheck = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        comboAirline = new javax.swing.JComboBox<String>();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Flight Search");

        jLabel1.setText("Check for flight availability");

        jLabel2.setText("Date");

        jSpinDay.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        jSpinMonth.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        jSpinYear.setModel(new javax.swing.SpinnerListModel(new String[] {"2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"}));

        jLabel3.setText("From");

        comboDept.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CMB", "CUC", "LHR", "HND", "AKL", "JFK", "CDG" }));

        jLabel4.setText("To");

        comboArrival.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CMB", "CUC", "LHR", "HND", "AKL", "JFK", "CDG" }));

        btnCheck.setText("Check");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        jLabel5.setText("Airline");

        comboAirline.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "QR", "EK", "UL", "JL", "US" }));

        jLabel6.setText("DD               MM              YYYY");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCheck, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(comboAirline, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(comboArrival, javax.swing.GroupLayout.Alignment.LEADING, 0, 181, Short.MAX_VALUE)
                                            .addComponent(comboDept, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(33, 33, 33))))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(jSpinDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jSpinDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboArrival, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboAirline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCheck)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        
        int day = Integer.parseInt(jSpinDay.getValue().toString());    //Assigning the input day to the variable
        int month = Integer.parseInt(jSpinMonth.getValue().toString());
        int year = Integer.parseInt(jSpinYear.getValue().toString());
        
        //JOptionPane.showMessageDialog(null, day);
               
        //assign the departure and arrival details
        String depAirport = comboDept.getSelectedItem().toString();
        String arrAirport = comboArrival.getSelectedItem().toString();
        
        //assign the airline
        String airline = comboAirline.getSelectedItem().toString();
        
        String checkData = MainForm.manager.searchFlight(day, month, year, depAirport, arrAirport, airline);
        
        //DD::: if no flights available, display message, else show next window
        
        if (checkData.trim()!="")
        {
            FlightSearchResults select = new FlightSearchResults(checkData);

            select.setVisible(true);
            this.getDesktopPane().add(select);
            this.dispose();
            }
        else
        {
            JOptionPane.showMessageDialog(null, "Sorry but there are no flights for the provided details.");
        }
    }//GEN-LAST:event_btnCheckActionPerformed


    // Variables declaration //GEN-BEGIN:variables
    private javax.swing.JButton btnCheck;
    private javax.swing.JComboBox<String> comboAirline;
    private javax.swing.JComboBox<String> comboArrival;
    private javax.swing.JComboBox<String> comboDept;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSpinner jSpinDay;
    private javax.swing.JSpinner jSpinMonth;
    private javax.swing.JSpinner jSpinYear;
    // End of variables declaration//GEN-END:variables
}
