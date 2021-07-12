package GUI;
import Classes.*;
import javax.swing.JOptionPane;

public class PassengerDetails extends javax.swing.JInternalFrame {

    /**
     * Creates new form PassengerDeatails
     */
    public PassengerDetails() {
        initComponents();
    }
    
    String flightID;
    
    int count =1;
    int selection=0;
    
    Passenger[] pass;
    String[] st;
    
    
    public PassengerDetails(String flightID, String [] selectedSeats){
        initComponents();
        
        this.flightID = flightID;
        selection = selectedSeats.length;
        
        // JOptionPane.showMessageDialog(null, selection);
        
        this.st =selectedSeats;
        
        pass = new Passenger[selectedSeats.length];
        lblCounter.setText("Passenger " + count + " of " + selectedSeats.length);
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fNameText = new javax.swing.JTextField();
        lastNameText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        streetText = new javax.swing.JTextField();
        cityText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        contactText = new javax.swing.JTextField();
        reserveBtn = new javax.swing.JButton();
        lblCounter = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Enter Passenger Details");

        jLabel2.setText("First Name");

        jLabel3.setText("Last Name");

        fNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameTextActionPerformed(evt);
            }
        });

        lastNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTextActionPerformed(evt);
            }
        });

        jLabel4.setText("Address");

        jLabel5.setText("Street");

        jLabel6.setText("City");

        jLabel7.setText("Contact Number");

        reserveBtn.setText("Add Passenger");
        reserveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveBtnActionPerformed(evt);
            }
        });

        lblCounter.setText("Passenger 0 of 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(reserveBtn)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel7)
                                        .addComponent(lblCounter))
                                    .addGap(22, 22, 22)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(fNameText)
                                        .addComponent(lastNameText)
                                        .addComponent(streetText)
                                        .addComponent(cityText)
                                        .addComponent(contactText, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addComponent(lblCounter)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(fNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(streetText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contactText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(reserveBtn)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lastNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTextActionPerformed

    }//GEN-LAST:event_lastNameTextActionPerformed

    private void fNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameTextActionPerformed

    }//GEN-LAST:event_fNameTextActionPerformed

    private void reserveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveBtnActionPerformed
        
        
        
        if (selection==1)
        {
            //Print the passenger details
        String firstName = fNameText.getText();
        String lastName = lastNameText.getText();
        String street = streetText.getText();
        String city = cityText.getText();
        String contactNumber = contactText.getText();
        String departureDate = "";
        int resNumber = 0;
        
        
        Name name = new Name (firstName,lastName);
        
        Address add = new Address(street,city);
        
        Passenger passenger = new Passenger(name,add,contactNumber);
        pass[count-1] = passenger;
        
        Seat[] seatArray = new Seat[st.length];
            
            for (int i=0;i<st.length;i++)
            {
                Seat seat = new Seat(st[i],true);
                seatArray[i]=seat;
                
            }
       
            String departureDate1 = MainForm.manager.getDeparturedate(flightID);
            
            Reservation reservation = MainForm.manager.makeReservation(selection, pass, flightID, departureDate1, seatArray);
            
            ReservationSummary reserve = new ReservationSummary(reservation);
            reserve.setVisible(true);
            this.getDesktopPane().add(reserve);
            this.dispose();
        }
        else if (count< selection+1 )
        {

        //Print the passenger details
        String firstName = fNameText.getText();
        String lastName = lastNameText.getText();
        String street = streetText.getText();
        String city = cityText.getText();
        String contactNumber = contactText.getText();
        String departureDate = "";
        int resNumber = 0;
        
        
        Name name = new Name (firstName,lastName);
        
        Address add = new Address(street,city);
        
        Passenger passenger = new Passenger(name,add,contactNumber);
        pass[count-1] = passenger;
        
        count++;
        
            fNameText.setText("");
            lastNameText.setText("");
            streetText.setText("");
            cityText.setText("");
            contactText.setText("");
            
            lblCounter.setText("Passenger " + count + " of " + selection); 
        
        }
        else
        {
            Seat[] seatArray = new Seat[st.length];
            
            for (int i=0;i<st.length;i++)
            {
                Seat seat = new Seat(st[i],true);
                seatArray[i]=seat;
                
            }
       
            String departureDate = MainForm.manager.getDeparturedate(flightID);
            
            Reservation reservation = MainForm.manager.makeReservation(selection, pass, flightID, departureDate, seatArray);
            
            ReservationSummary reserve = new ReservationSummary(reservation);
            reserve.setVisible(true);
            this.getDesktopPane().add(reserve);
            this.dispose();
        
        }
        
        
    }//GEN-LAST:event_reserveBtnActionPerformed
    
    

    // Variables declaration //GEN-BEGIN:variables
    private javax.swing.JTextField cityText;
    private javax.swing.JTextField contactText;
    private javax.swing.JTextField fNameText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JLabel lblCounter;
    private javax.swing.JButton reserveBtn;
    private javax.swing.JTextField streetText;
    // End of variables declaration//GEN-END:variables
}
