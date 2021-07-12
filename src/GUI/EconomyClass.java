package GUI;

import Classes.*;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class EconomyClass extends javax.swing.JInternalFrame {

    /**
     * Creates new form EconomyClass
     */
   String flightID = "";
    
    String seatAvailability;

    public EconomyClass(String flightID){
        initComponents();
        
        flightIDText.setText(flightID);
        this.flightID = flightID;
        
        
        //DD::: from here below; all reserved first class seats will be identified and relavant buttons will be disabled
        
        seatAvailability = MainForm.manager.searchFlightSeatAvailability(flightID);
        
        Seat[] seats =  MainForm.manager.getSeatDetails(flightID);
        
        for (int i=13; i<61;i++)
        {
                if (seats[i].isStatus()==true)
                {
                    JInternalFrame frame = this;
                    Component[] comps = frame.getComponents();
                    
                    for (Component component : comps) {
                        if (component instanceof JButton) {
                            if (((JButton)component).getText().contains(seats[i].getSeatID()))
                            {
                                ((JButton)component).setEnabled(false);
                            }
                        }
                    }
                }
            
        }
        
        //set action listener to buttons
        
        JPanel panel = this.jPanel1;
        
        Component[] comps =  panel.getComponents();
        
        for (Component component : comps )
        {
            if (component instanceof JButton) {
                JButton btn = (JButton)component;
                btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                   ButtonActionPerformed(evt);
                 }
             });
            }
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton137 = new javax.swing.JButton();
        jButton131 = new javax.swing.JButton();
        jButton133 = new javax.swing.JButton();
        jButton135 = new javax.swing.JButton();
        jButton136 = new javax.swing.JButton();
        jButton134 = new javax.swing.JButton();
        jButton132 = new javax.swing.JButton();
        jButton130 = new javax.swing.JButton();
        jButton190 = new javax.swing.JButton();
        jButton193 = new javax.swing.JButton();
        jButton189 = new javax.swing.JButton();
        jButton192 = new javax.swing.JButton();
        jButton187 = new javax.swing.JButton();
        jButton191 = new javax.swing.JButton();
        jButton188 = new javax.swing.JButton();
        jButton186 = new javax.swing.JButton();
        scrollPanel = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        A13 = new javax.swing.JButton();
        B13 = new javax.swing.JButton();
        C13 = new javax.swing.JButton();
        D13 = new javax.swing.JButton();
        E13 = new javax.swing.JButton();
        F13 = new javax.swing.JButton();
        G13 = new javax.swing.JButton();
        H13 = new javax.swing.JButton();
        C14 = new javax.swing.JButton();
        D14 = new javax.swing.JButton();
        E14 = new javax.swing.JButton();
        F14 = new javax.swing.JButton();
        G14 = new javax.swing.JButton();
        H14 = new javax.swing.JButton();
        A14 = new javax.swing.JButton();
        B14 = new javax.swing.JButton();
        C15 = new javax.swing.JButton();
        D15 = new javax.swing.JButton();
        E15 = new javax.swing.JButton();
        F15 = new javax.swing.JButton();
        G15 = new javax.swing.JButton();
        H15 = new javax.swing.JButton();
        A15 = new javax.swing.JButton();
        B15 = new javax.swing.JButton();
        C16 = new javax.swing.JButton();
        D16 = new javax.swing.JButton();
        E16 = new javax.swing.JButton();
        F16 = new javax.swing.JButton();
        G16 = new javax.swing.JButton();
        H16 = new javax.swing.JButton();
        A16 = new javax.swing.JButton();
        B16 = new javax.swing.JButton();
        C17 = new javax.swing.JButton();
        D17 = new javax.swing.JButton();
        E17 = new javax.swing.JButton();
        F17 = new javax.swing.JButton();
        G17 = new javax.swing.JButton();
        H17 = new javax.swing.JButton();
        A17 = new javax.swing.JButton();
        B17 = new javax.swing.JButton();
        C18 = new javax.swing.JButton();
        D18 = new javax.swing.JButton();
        E18 = new javax.swing.JButton();
        F18 = new javax.swing.JButton();
        G18 = new javax.swing.JButton();
        H18 = new javax.swing.JButton();
        A18 = new javax.swing.JButton();
        B18 = new javax.swing.JButton();
        C19 = new javax.swing.JButton();
        D19 = new javax.swing.JButton();
        E19 = new javax.swing.JButton();
        F19 = new javax.swing.JButton();
        G19 = new javax.swing.JButton();
        H19 = new javax.swing.JButton();
        A19 = new javax.swing.JButton();
        B19 = new javax.swing.JButton();
        C20 = new javax.swing.JButton();
        D20 = new javax.swing.JButton();
        E20 = new javax.swing.JButton();
        F20 = new javax.swing.JButton();
        G20 = new javax.swing.JButton();
        H20 = new javax.swing.JButton();
        A20 = new javax.swing.JButton();
        B20 = new javax.swing.JButton();
        C21 = new javax.swing.JButton();
        D21 = new javax.swing.JButton();
        E21 = new javax.swing.JButton();
        F21 = new javax.swing.JButton();
        G21 = new javax.swing.JButton();
        H21 = new javax.swing.JButton();
        A21 = new javax.swing.JButton();
        B21 = new javax.swing.JButton();
        C22 = new javax.swing.JButton();
        D22 = new javax.swing.JButton();
        E22 = new javax.swing.JButton();
        F22 = new javax.swing.JButton();
        G22 = new javax.swing.JButton();
        H22 = new javax.swing.JButton();
        A22 = new javax.swing.JButton();
        B22 = new javax.swing.JButton();
        C23 = new javax.swing.JButton();
        D23 = new javax.swing.JButton();
        E23 = new javax.swing.JButton();
        F23 = new javax.swing.JButton();
        G23 = new javax.swing.JButton();
        H23 = new javax.swing.JButton();
        A23 = new javax.swing.JButton();
        B23 = new javax.swing.JButton();
        C24 = new javax.swing.JButton();
        D24 = new javax.swing.JButton();
        E24 = new javax.swing.JButton();
        F24 = new javax.swing.JButton();
        G24 = new javax.swing.JButton();
        H24 = new javax.swing.JButton();
        A24 = new javax.swing.JButton();
        B24 = new javax.swing.JButton();
        C25 = new javax.swing.JButton();
        D25 = new javax.swing.JButton();
        E25 = new javax.swing.JButton();
        F25 = new javax.swing.JButton();
        G25 = new javax.swing.JButton();
        H25 = new javax.swing.JButton();
        A25 = new javax.swing.JButton();
        B25 = new javax.swing.JButton();
        C26 = new javax.swing.JButton();
        D26 = new javax.swing.JButton();
        E26 = new javax.swing.JButton();
        F26 = new javax.swing.JButton();
        G26 = new javax.swing.JButton();
        H26 = new javax.swing.JButton();
        A26 = new javax.swing.JButton();
        B26 = new javax.swing.JButton();
        C27 = new javax.swing.JButton();
        D27 = new javax.swing.JButton();
        E27 = new javax.swing.JButton();
        F27 = new javax.swing.JButton();
        G27 = new javax.swing.JButton();
        H27 = new javax.swing.JButton();
        A27 = new javax.swing.JButton();
        B27 = new javax.swing.JButton();
        C28 = new javax.swing.JButton();
        D28 = new javax.swing.JButton();
        E28 = new javax.swing.JButton();
        F28 = new javax.swing.JButton();
        G28 = new javax.swing.JButton();
        H28 = new javax.swing.JButton();
        A28 = new javax.swing.JButton();
        B28 = new javax.swing.JButton();
        A29 = new javax.swing.JButton();
        B29 = new javax.swing.JButton();
        C29 = new javax.swing.JButton();
        D29 = new javax.swing.JButton();
        E29 = new javax.swing.JButton();
        F29 = new javax.swing.JButton();
        G29 = new javax.swing.JButton();
        H29 = new javax.swing.JButton();
        A30 = new javax.swing.JButton();
        B30 = new javax.swing.JButton();
        C30 = new javax.swing.JButton();
        D30 = new javax.swing.JButton();
        E30 = new javax.swing.JButton();
        F30 = new javax.swing.JButton();
        G30 = new javax.swing.JButton();
        H30 = new javax.swing.JButton();
        A31 = new javax.swing.JButton();
        B31 = new javax.swing.JButton();
        C31 = new javax.swing.JButton();
        D31 = new javax.swing.JButton();
        E31 = new javax.swing.JButton();
        F31 = new javax.swing.JButton();
        G31 = new javax.swing.JButton();
        H31 = new javax.swing.JButton();
        A32 = new javax.swing.JButton();
        B32 = new javax.swing.JButton();
        C32 = new javax.swing.JButton();
        D32 = new javax.swing.JButton();
        E32 = new javax.swing.JButton();
        F32 = new javax.swing.JButton();
        G32 = new javax.swing.JButton();
        H32 = new javax.swing.JButton();
        A33 = new javax.swing.JButton();
        B33 = new javax.swing.JButton();
        C33 = new javax.swing.JButton();
        D33 = new javax.swing.JButton();
        E33 = new javax.swing.JButton();
        F33 = new javax.swing.JButton();
        G33 = new javax.swing.JButton();
        H33 = new javax.swing.JButton();
        A34 = new javax.swing.JButton();
        B34 = new javax.swing.JButton();
        C34 = new javax.swing.JButton();
        D34 = new javax.swing.JButton();
        E34 = new javax.swing.JButton();
        F34 = new javax.swing.JButton();
        G34 = new javax.swing.JButton();
        H34 = new javax.swing.JButton();
        A35 = new javax.swing.JButton();
        B35 = new javax.swing.JButton();
        C35 = new javax.swing.JButton();
        D35 = new javax.swing.JButton();
        E35 = new javax.swing.JButton();
        F35 = new javax.swing.JButton();
        G35 = new javax.swing.JButton();
        H35 = new javax.swing.JButton();
        A36 = new javax.swing.JButton();
        B36 = new javax.swing.JButton();
        C36 = new javax.swing.JButton();
        D36 = new javax.swing.JButton();
        E36 = new javax.swing.JButton();
        F36 = new javax.swing.JButton();
        G36 = new javax.swing.JButton();
        H36 = new javax.swing.JButton();
        A37 = new javax.swing.JButton();
        B37 = new javax.swing.JButton();
        C37 = new javax.swing.JButton();
        D37 = new javax.swing.JButton();
        E37 = new javax.swing.JButton();
        F37 = new javax.swing.JButton();
        G37 = new javax.swing.JButton();
        H37 = new javax.swing.JButton();
        A38 = new javax.swing.JButton();
        B38 = new javax.swing.JButton();
        C38 = new javax.swing.JButton();
        D38 = new javax.swing.JButton();
        E38 = new javax.swing.JButton();
        F38 = new javax.swing.JButton();
        G38 = new javax.swing.JButton();
        H38 = new javax.swing.JButton();
        A39 = new javax.swing.JButton();
        B39 = new javax.swing.JButton();
        C39 = new javax.swing.JButton();
        D39 = new javax.swing.JButton();
        E39 = new javax.swing.JButton();
        F39 = new javax.swing.JButton();
        G39 = new javax.swing.JButton();
        H39 = new javax.swing.JButton();
        A40 = new javax.swing.JButton();
        B40 = new javax.swing.JButton();
        C40 = new javax.swing.JButton();
        D40 = new javax.swing.JButton();
        E40 = new javax.swing.JButton();
        F40 = new javax.swing.JButton();
        G40 = new javax.swing.JButton();
        H40 = new javax.swing.JButton();
        A41 = new javax.swing.JButton();
        B41 = new javax.swing.JButton();
        C41 = new javax.swing.JButton();
        D41 = new javax.swing.JButton();
        E41 = new javax.swing.JButton();
        F41 = new javax.swing.JButton();
        G41 = new javax.swing.JButton();
        H41 = new javax.swing.JButton();
        A42 = new javax.swing.JButton();
        B42 = new javax.swing.JButton();
        C42 = new javax.swing.JButton();
        D42 = new javax.swing.JButton();
        E42 = new javax.swing.JButton();
        F42 = new javax.swing.JButton();
        G42 = new javax.swing.JButton();
        H42 = new javax.swing.JButton();
        A43 = new javax.swing.JButton();
        B43 = new javax.swing.JButton();
        C43 = new javax.swing.JButton();
        D43 = new javax.swing.JButton();
        jButton262 = new javax.swing.JButton();
        F43 = new javax.swing.JButton();
        G43 = new javax.swing.JButton();
        H43 = new javax.swing.JButton();
        A44 = new javax.swing.JButton();
        B44 = new javax.swing.JButton();
        C44 = new javax.swing.JButton();
        D44 = new javax.swing.JButton();
        E44 = new javax.swing.JButton();
        F44 = new javax.swing.JButton();
        G44 = new javax.swing.JButton();
        H44 = new javax.swing.JButton();
        A45 = new javax.swing.JButton();
        B45 = new javax.swing.JButton();
        C45 = new javax.swing.JButton();
        D45 = new javax.swing.JButton();
        E45 = new javax.swing.JButton();
        F45 = new javax.swing.JButton();
        G45 = new javax.swing.JButton();
        H45 = new javax.swing.JButton();
        A46 = new javax.swing.JButton();
        B46 = new javax.swing.JButton();
        C46 = new javax.swing.JButton();
        D46 = new javax.swing.JButton();
        E46 = new javax.swing.JButton();
        F46 = new javax.swing.JButton();
        G46 = new javax.swing.JButton();
        H46 = new javax.swing.JButton();
        A47 = new javax.swing.JButton();
        B47 = new javax.swing.JButton();
        C47 = new javax.swing.JButton();
        D47 = new javax.swing.JButton();
        E47 = new javax.swing.JButton();
        F47 = new javax.swing.JButton();
        G47 = new javax.swing.JButton();
        H47 = new javax.swing.JButton();
        A48 = new javax.swing.JButton();
        B48 = new javax.swing.JButton();
        C48 = new javax.swing.JButton();
        D48 = new javax.swing.JButton();
        E48 = new javax.swing.JButton();
        F48 = new javax.swing.JButton();
        G48 = new javax.swing.JButton();
        H48 = new javax.swing.JButton();
        A49 = new javax.swing.JButton();
        B49 = new javax.swing.JButton();
        C49 = new javax.swing.JButton();
        D49 = new javax.swing.JButton();
        E49 = new javax.swing.JButton();
        F49 = new javax.swing.JButton();
        G49 = new javax.swing.JButton();
        H49 = new javax.swing.JButton();
        A50 = new javax.swing.JButton();
        B50 = new javax.swing.JButton();
        C50 = new javax.swing.JButton();
        D50 = new javax.swing.JButton();
        E50 = new javax.swing.JButton();
        F50 = new javax.swing.JButton();
        G50 = new javax.swing.JButton();
        H50 = new javax.swing.JButton();
        A51 = new javax.swing.JButton();
        B51 = new javax.swing.JButton();
        C51 = new javax.swing.JButton();
        D51 = new javax.swing.JButton();
        E51 = new javax.swing.JButton();
        F51 = new javax.swing.JButton();
        G51 = new javax.swing.JButton();
        H51 = new javax.swing.JButton();
        A52 = new javax.swing.JButton();
        B52 = new javax.swing.JButton();
        C52 = new javax.swing.JButton();
        D52 = new javax.swing.JButton();
        E52 = new javax.swing.JButton();
        F52 = new javax.swing.JButton();
        G52 = new javax.swing.JButton();
        H52 = new javax.swing.JButton();
        A53 = new javax.swing.JButton();
        B53 = new javax.swing.JButton();
        C53 = new javax.swing.JButton();
        D53 = new javax.swing.JButton();
        E53 = new javax.swing.JButton();
        F53 = new javax.swing.JButton();
        G53 = new javax.swing.JButton();
        H53 = new javax.swing.JButton();
        A54 = new javax.swing.JButton();
        B54 = new javax.swing.JButton();
        C54 = new javax.swing.JButton();
        D54 = new javax.swing.JButton();
        E54 = new javax.swing.JButton();
        F54 = new javax.swing.JButton();
        G54 = new javax.swing.JButton();
        H54 = new javax.swing.JButton();
        A55 = new javax.swing.JButton();
        B55 = new javax.swing.JButton();
        C55 = new javax.swing.JButton();
        D55 = new javax.swing.JButton();
        E55 = new javax.swing.JButton();
        F55 = new javax.swing.JButton();
        G55 = new javax.swing.JButton();
        H55 = new javax.swing.JButton();
        A56 = new javax.swing.JButton();
        B56 = new javax.swing.JButton();
        C56 = new javax.swing.JButton();
        D56 = new javax.swing.JButton();
        E56 = new javax.swing.JButton();
        F56 = new javax.swing.JButton();
        G56 = new javax.swing.JButton();
        H56 = new javax.swing.JButton();
        A57 = new javax.swing.JButton();
        B57 = new javax.swing.JButton();
        C57 = new javax.swing.JButton();
        D57 = new javax.swing.JButton();
        E57 = new javax.swing.JButton();
        F57 = new javax.swing.JButton();
        G57 = new javax.swing.JButton();
        H57 = new javax.swing.JButton();
        A58 = new javax.swing.JButton();
        B58 = new javax.swing.JButton();
        C58 = new javax.swing.JButton();
        D58 = new javax.swing.JButton();
        E58 = new javax.swing.JButton();
        F58 = new javax.swing.JButton();
        G58 = new javax.swing.JButton();
        H58 = new javax.swing.JButton();
        A59 = new javax.swing.JButton();
        B59 = new javax.swing.JButton();
        C59 = new javax.swing.JButton();
        D59 = new javax.swing.JButton();
        E59 = new javax.swing.JButton();
        F59 = new javax.swing.JButton();
        G59 = new javax.swing.JButton();
        H59 = new javax.swing.JButton();
        A60 = new javax.swing.JButton();
        B60 = new javax.swing.JButton();
        C60 = new javax.swing.JButton();
        D60 = new javax.swing.JButton();
        E60 = new javax.swing.JButton();
        F60 = new javax.swing.JButton();
        G60 = new javax.swing.JButton();
        H60 = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        flightIDText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        seatIDText = new javax.swing.JTextField();
        btnProceed = new javax.swing.JButton();

        jButton137.setText("B13");

        jButton131.setText("D13");

        jButton133.setText("F13");

        jButton135.setText("H13");

        jButton136.setText("A13");

        jButton134.setText("G13");

        jButton132.setText("E13");

        jButton130.setText("C13");

        jButton190.setText("E13");

        jButton193.setText("H13");

        jButton189.setText("D13");

        jButton192.setText("G13");

        jButton187.setText("B13");

        jButton191.setText("F13");

        jButton188.setText("C13");

        jButton186.setText("A13");

        setClosable(true);
        setTitle("Economy Class");

        A13.setText("A13");

        B13.setText("B13");

        C13.setText("C13");

        D13.setText("D13");

        E13.setText("E13");

        F13.setText("F13");

        G13.setText("G13");

        H13.setText("H13");

        C14.setText("C14");

        D14.setText("D14");

        E14.setText("E14");

        F14.setText("F14");

        G14.setText("G14");

        H14.setText("H14");

        A14.setText("A14");

        B14.setText("B14");

        C15.setText("C15");

        D15.setText("D15");

        E15.setText("E15");

        F15.setText("F15");

        G15.setText("G15");

        H15.setText("H15");

        A15.setText("A15");

        B15.setText("B15");

        C16.setText("C16");

        D16.setText("D16");

        E16.setText("E16");

        F16.setText("F16");

        G16.setText("G16");

        H16.setText("H16");

        A16.setText("A16");

        B16.setText("B16");

        C17.setText("C17");

        D17.setText("D17");

        E17.setText("E17");

        F17.setText("F17");

        G17.setText("G17");

        H17.setText("H17");

        A17.setText("A17");

        B17.setText("B17");

        C18.setText("C18");

        D18.setText("D18");

        E18.setText("E18");

        F18.setText("F18");

        G18.setText("G18");

        H18.setText("H18");

        A18.setText("A18");

        B18.setText("B18");

        C19.setText("C19");

        D19.setText("D19");

        E19.setText("E19");

        F19.setText("F19");

        G19.setText("G19");

        H19.setText("H19");

        A19.setText("A19");

        B19.setText("B19");

        C20.setText("C20");

        D20.setText("D20");

        E20.setText("E20");

        F20.setText("F20");

        G20.setText("G20");

        H20.setText("H20");

        A20.setText("A20");

        B20.setText("B20");

        C21.setText("C21");

        D21.setText("D21");

        E21.setText("E21");

        F21.setText("F21");

        G21.setText("G21");

        H21.setText("H21");

        A21.setText("A21");

        B21.setText("B21");

        C22.setText("C22");

        D22.setText("D22");

        E22.setText("E22");

        F22.setText("F22");

        G22.setText("G22");

        H22.setText("H22");

        A22.setText("A22");

        B22.setText("B22");

        C23.setText("C23");

        D23.setText("D23");

        E23.setText("E23");

        F23.setText("F23");

        G23.setText("G23");

        H23.setText("H23");

        A23.setText("A23");

        B23.setText("B23");

        C24.setText("C24");

        D24.setText("D24");

        E24.setText("E24");

        F24.setText("F24");

        G24.setText("G24");

        H24.setText("H24");

        A24.setText("A24");

        B24.setText("B24");

        C25.setText("C25");

        D25.setText("D25");

        E25.setText("E25");

        F25.setText("F25");

        G25.setText("G25");

        H25.setText("H25");

        A25.setText("A25");

        B25.setText("B25");

        C26.setText("C26");

        D26.setText("D26");

        E26.setText("E26");

        F26.setText("F26");

        G26.setText("G26");

        H26.setText("H26");

        A26.setText("A26");

        B26.setText("B26");

        C27.setText("C27");

        D27.setText("D27");

        E27.setText("E27");

        F27.setText("F27");

        G27.setText("G27");

        H27.setText("H27");

        A27.setText("A27");

        B27.setText("B27");

        C28.setText("C28");

        D28.setText("D28");

        E28.setText("E28");

        F28.setText("F28");

        G28.setText("G28");

        H28.setText("H28");

        A28.setText("A28");

        B28.setText("B28");

        A29.setText("A29");

        B29.setText("B29");

        C29.setText("C29");

        D29.setText("D29");

        E29.setText("E29");

        F29.setText("F29");

        G29.setText("G29");

        H29.setText("H29");

        A30.setText("A30");

        B30.setText("B30");

        C30.setText("C30");

        D30.setText("D30");

        E30.setText("E30");

        F30.setText("F30");

        G30.setText("G30");

        H30.setText("H30");

        A31.setText("A31");

        B31.setText("B31");

        C31.setText("C31");

        D31.setText("D31");

        E31.setText("E31");

        F31.setText("F31");

        G31.setText("G31");

        H31.setText("H31");

        A32.setText("A32");

        B32.setText("B32");

        C32.setText("C32");

        D32.setText("D32");

        E32.setText("E32");

        F32.setText("F32");

        G32.setText("G32");

        H32.setText("H32");

        A33.setText("A33");

        B33.setText("B33");

        C33.setText("C33");

        D33.setText("D33");

        E33.setText("E33");

        F33.setText("F33");

        G33.setText("G33");

        H33.setText("H33");

        A34.setText("A34");

        B34.setText("B34");

        C34.setText("C34");

        D34.setText("D34");

        E34.setText("E34");

        F34.setText("F34");

        G34.setText("G34");

        H34.setText("H34");

        A35.setText("A35");

        B35.setText("B35");

        C35.setText("C35");

        D35.setText("D35");

        E35.setText("E35");

        F35.setText("F35");

        G35.setText("G35");

        H35.setText("H35");

        A36.setText("A36");

        B36.setText("B36");

        C36.setText("C36");

        D36.setText("D36");

        E36.setText("E36");

        F36.setText("F36");

        G36.setText("G36");

        H36.setText("H36");

        A37.setText("A37");

        B37.setText("B37");

        C37.setText("C37");

        D37.setText("D37");

        E37.setText("E37");

        F37.setText("F37");

        G37.setText("G37");

        H37.setText("H37");

        A38.setText("A38");

        B38.setText("B38");

        C38.setText("C38");

        D38.setText("D38");

        E38.setText("E38");

        F38.setText("F38");

        G38.setText("G38");

        H38.setText("H38");

        A39.setText("A39");

        B39.setText("B39");

        C39.setText("C39");

        D39.setText("D39");

        E39.setText("E39");

        F39.setText("F39");

        G39.setText("G39");

        H39.setText("H39");

        A40.setText("A40");

        B40.setText("B40");

        C40.setText("C40");

        D40.setText("D40");

        E40.setText("E40");

        F40.setText("F40");

        G40.setText("G40");

        H40.setText("H40");

        A41.setText("A41");

        B41.setText("B41");

        C41.setText("C41");

        D41.setText("D41");

        E41.setText("E41");

        F41.setText("F41");

        G41.setText("G41");

        H41.setText("H41");

        A42.setText("A42");

        B42.setText("B42");

        C42.setText("C42");

        D42.setText("D42");

        E42.setText("E42");

        F42.setText("F42");

        G42.setText("G42");

        H42.setText("H42");

        A43.setText("A43");

        B43.setText("B43");

        C43.setText("C43");

        D43.setText("D43");

        jButton262.setText("E43");

        F43.setText("F43");

        G43.setText("G43");

        H43.setText("H43");

        A44.setText("A44");

        B44.setText("B44");

        C44.setText("C44");

        D44.setText("D44");

        E44.setText("E44");

        F44.setText("F44");

        G44.setText("G44");

        H44.setText("H44");

        A45.setText("A45");

        B45.setText("B45");

        C45.setText("C45");

        D45.setText("D45");

        E45.setText("E45");

        F45.setText("F45");

        G45.setText("G45");

        H45.setText("H45");

        A46.setText("A46");

        B46.setText("B46");

        C46.setText("C46");

        D46.setText("D46");

        E46.setText("E46");

        F46.setText("F46");

        G46.setText("G46");

        H46.setText("H46");

        A47.setText("A47");

        B47.setText("B47");

        C47.setText("C47");

        D47.setText("D47");

        E47.setText("E47");

        F47.setText("F47");

        G47.setText("G47");

        H47.setText("H47");

        A48.setText("A48");

        B48.setText("B48");

        C48.setText("C48");

        D48.setText("D48");

        E48.setText("E48");

        F48.setText("F48");

        G48.setText("G48");

        H48.setText("H48");

        A49.setText("A49");

        B49.setText("B49");

        C49.setText("C49");

        D49.setText("D49");

        E49.setText("E49");

        F49.setText("F49");

        G49.setText("G49");

        H49.setText("H49");

        A50.setText("A50");

        B50.setText("B50");

        C50.setText("C50");

        D50.setText("D50");

        E50.setText("E50");

        F50.setText("F50");

        G50.setText("G50");

        H50.setText("H50");

        A51.setText("A51");

        B51.setText("B51");

        C51.setText("C51");

        D51.setText("D51");

        E51.setText("E51");

        F51.setText("F51");

        G51.setText("G51");

        H51.setText("H51");

        A52.setText("A52");

        B52.setText("B52");

        C52.setText("C52");

        D52.setText("D52");

        E52.setText("E52");

        F52.setText("F52");

        G52.setText("G52");

        H52.setText("H52");

        A53.setText("A53");

        B53.setText("B53");

        C53.setText("C53");

        D53.setText("D53");

        E53.setText("E53");

        F53.setText("F53");

        G53.setText("G53");

        H53.setText("H53");

        A54.setText("A54");

        B54.setText("B54");

        C54.setText("C54");

        D54.setText("D54");

        E54.setText("E54");

        F54.setText("F54");

        G54.setText("G54");

        H54.setText("H54");

        A55.setText("A55");

        B55.setText("B55");

        C55.setText("C55");

        D55.setText("D55");

        E55.setText("E55");

        F55.setText("F55");

        G55.setText("G55");

        H55.setText("H55");

        A56.setText("A56");

        B56.setText("B56");

        C56.setText("C56");

        D56.setText("D56");

        E56.setText("E56");

        F56.setText("F56");

        G56.setText("G56");

        H56.setText("H56");

        A57.setText("A57");

        B57.setText("B57");

        C57.setText("C57");

        D57.setText("D57");

        E57.setText("E57");

        F57.setText("F57");

        G57.setText("G57");

        H57.setText("H57");

        A58.setText("A58");

        B58.setText("B58");

        C58.setText("C58");

        D58.setText("D58");

        E58.setText("E58");

        F58.setText("F58");

        G58.setText("G58");

        H58.setText("H58");

        A59.setText("A59");

        B59.setText("B59");

        C59.setText("C59");

        D59.setText("D59");

        E59.setText("E59");

        F59.setText("F59");

        G59.setText("G59");

        H59.setText("H59");

        A60.setText("A60");

        B60.setText("B60");

        C60.setText("C60");

        D60.setText("D60");

        E60.setText("E60");

        F60.setText("F60");

        G60.setText("G60");

        H60.setText("H60");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(A60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(G60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H60))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(A59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(G59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H59))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(A58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(G58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H58))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(A57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(G57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H57))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(A56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(G56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H56))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(A55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(G55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H55))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(A54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(G54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H54))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(A53)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(B53)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(C53)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(D53)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(E53)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(F53)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(G53)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(H53))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(A52)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(B52)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(C52)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(D52)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(E52)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(F52)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(G52)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(H52))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(A51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(D51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(E51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(F51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(H51))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(A50)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(B50)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(C50)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(D50)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(E50)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(F50)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(G50)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(H50))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(A49)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B49)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C49)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D49)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(E49)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(F49)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(G49)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(H49))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(A48)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B48)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C48)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D48)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(E48)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(F48)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(G48)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(H48))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(A47)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B47)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C47)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D47)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(E47)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(F47)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(G47)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(H47))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(A46)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B46)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C46)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D46)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(E46)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(F46)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(G46)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(H46))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(A45)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B45)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C45)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D45)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(E45)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(F45)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(G45)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(H45))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(A44)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B44)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C44)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D44)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(E44)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(F44)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(G44)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(H44))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(A43)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B43)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C43)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D43)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton262)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(F43)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(G43)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(H43))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(A42)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B42)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C42)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D42)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(E42)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(F42)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(G42)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(H42))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(A41)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B41)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C41)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D41)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(E41)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(F41)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(G41)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(H41))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(A40)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B40)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C40)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D40)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(E40)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(F40)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(G40)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(H40))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(A39)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B39)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C39)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D39)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(E39)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(F39)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(G39)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(H39))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(A38)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B38)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C38)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D38)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(E38)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(F38)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(G38)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(H38))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(A37)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B37)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C37)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D37)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(E37)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(F37)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(G37)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(H37))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(A36)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B36)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C36)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D36)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(E36)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(F36)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(G36)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(H36))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(A35)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B35)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C35)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D35)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(E35)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(F35)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(G35)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(H35))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(A34)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B34)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C34)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D34)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(E34)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(F34)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(G34)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(H34))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(A33)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B33)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C33)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D33)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(E33)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(F33)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(G33)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(H33))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(A32)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(B32)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(C32)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(D32)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(E32)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(F32)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(G32)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(H32))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(A31)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(B31)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(C31)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(D31)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(E31)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(F31)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(G31)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(H31))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(A30)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(B30)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(C30)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(D30)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(E30)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(F30)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(G30)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(H30))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(A29)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(B29)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(C29)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(D29)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(E29)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(F29)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(G29)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(H29))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(A28)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(B28)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(C28)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(D28)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(E28)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(F28)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(G28)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(H28))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(A27)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(B27)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(C27)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(D27)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(E27)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(F27)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(G27)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(H27))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(A26)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(B26)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(C26)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(D26)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(E26)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(F26)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(G26)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(H26))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(A25)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(B25)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(C25)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(D25)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(E25)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(F25)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(G25)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(H25))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(A24)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(B24)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(C24)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(D24)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(E24)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(F24)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(G24)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(H24))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(A23)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(B23)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(C23)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(D23)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(E23)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(F23)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(G23)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(H23))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(A22)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(B22)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(C22)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(D22)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(E22)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(F22)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(G22)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(H22))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(A21)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(B21)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(C21)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(D21)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(E21)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(F21)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(G21)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(H21))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(A20)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(B20)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(C20)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(D20)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(E20)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(F20)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(G20)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(H20))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(A19)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(B19)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(C19)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(D19)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(E19)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(F19)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(G19)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(H19))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(A18)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(B18)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(C18)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(D18)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(E18)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(F18)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(G18)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(H18))
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(A17)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(B17)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(C17)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(D17)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(E17)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(F17)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(G17)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(H17))
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(A16)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(B16)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(C16)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(D16)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(E16)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(F16)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(G16)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(H16))
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(A15)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(B15)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(C15)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(D15)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(E15)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(F15)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(G15)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(H15))
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(A14)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(B14)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(C14)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(D14)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(E14)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(F14)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(G14)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(H14))
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(A13)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(B13)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(C13)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(D13)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(E13)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(F13)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(G13)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(H13)))))))))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A13)
                    .addComponent(B13)
                    .addComponent(C13)
                    .addComponent(D13)
                    .addComponent(E13)
                    .addComponent(F13)
                    .addComponent(G13)
                    .addComponent(H13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A14)
                    .addComponent(B14)
                    .addComponent(C14)
                    .addComponent(D14)
                    .addComponent(E14)
                    .addComponent(F14)
                    .addComponent(G14)
                    .addComponent(H14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A15)
                    .addComponent(B15)
                    .addComponent(C15)
                    .addComponent(D15)
                    .addComponent(E15)
                    .addComponent(F15)
                    .addComponent(G15)
                    .addComponent(H15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A16)
                    .addComponent(B16)
                    .addComponent(C16)
                    .addComponent(D16)
                    .addComponent(E16)
                    .addComponent(F16)
                    .addComponent(G16)
                    .addComponent(H16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A17)
                    .addComponent(B17)
                    .addComponent(C17)
                    .addComponent(D17)
                    .addComponent(E17)
                    .addComponent(F17)
                    .addComponent(G17)
                    .addComponent(H17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A18)
                    .addComponent(B18)
                    .addComponent(C18)
                    .addComponent(D18)
                    .addComponent(E18)
                    .addComponent(F18)
                    .addComponent(G18)
                    .addComponent(H18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A19)
                    .addComponent(B19)
                    .addComponent(C19)
                    .addComponent(D19)
                    .addComponent(E19)
                    .addComponent(F19)
                    .addComponent(G19)
                    .addComponent(H19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A20)
                    .addComponent(B20)
                    .addComponent(C20)
                    .addComponent(D20)
                    .addComponent(E20)
                    .addComponent(F20)
                    .addComponent(G20)
                    .addComponent(H20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A21)
                    .addComponent(B21)
                    .addComponent(C21)
                    .addComponent(D21)
                    .addComponent(E21)
                    .addComponent(F21)
                    .addComponent(G21)
                    .addComponent(H21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A22)
                    .addComponent(B22)
                    .addComponent(C22)
                    .addComponent(D22)
                    .addComponent(E22)
                    .addComponent(F22)
                    .addComponent(G22)
                    .addComponent(H22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A23)
                    .addComponent(B23)
                    .addComponent(C23)
                    .addComponent(D23)
                    .addComponent(E23)
                    .addComponent(F23)
                    .addComponent(G23)
                    .addComponent(H23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A24)
                    .addComponent(B24)
                    .addComponent(C24)
                    .addComponent(D24)
                    .addComponent(E24)
                    .addComponent(F24)
                    .addComponent(G24)
                    .addComponent(H24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A25)
                    .addComponent(B25)
                    .addComponent(C25)
                    .addComponent(D25)
                    .addComponent(E25)
                    .addComponent(F25)
                    .addComponent(G25)
                    .addComponent(H25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A26)
                    .addComponent(B26)
                    .addComponent(C26)
                    .addComponent(D26)
                    .addComponent(E26)
                    .addComponent(F26)
                    .addComponent(G26)
                    .addComponent(H26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A27)
                    .addComponent(B27)
                    .addComponent(C27)
                    .addComponent(D27)
                    .addComponent(E27)
                    .addComponent(F27)
                    .addComponent(G27)
                    .addComponent(H27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A28)
                    .addComponent(B28)
                    .addComponent(C28)
                    .addComponent(D28)
                    .addComponent(E28)
                    .addComponent(F28)
                    .addComponent(G28)
                    .addComponent(H28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A29)
                    .addComponent(B29)
                    .addComponent(C29)
                    .addComponent(D29)
                    .addComponent(E29)
                    .addComponent(F29)
                    .addComponent(G29)
                    .addComponent(H29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A30)
                    .addComponent(B30)
                    .addComponent(C30)
                    .addComponent(D30)
                    .addComponent(E30)
                    .addComponent(F30)
                    .addComponent(G30)
                    .addComponent(H30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A31)
                    .addComponent(B31)
                    .addComponent(C31)
                    .addComponent(D31)
                    .addComponent(E31)
                    .addComponent(F31)
                    .addComponent(G31)
                    .addComponent(H31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A32)
                    .addComponent(B32)
                    .addComponent(C32)
                    .addComponent(D32)
                    .addComponent(E32)
                    .addComponent(F32)
                    .addComponent(G32)
                    .addComponent(H32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A33)
                    .addComponent(B33)
                    .addComponent(C33)
                    .addComponent(D33)
                    .addComponent(E33)
                    .addComponent(F33)
                    .addComponent(G33)
                    .addComponent(H33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A34)
                    .addComponent(B34)
                    .addComponent(C34)
                    .addComponent(D34)
                    .addComponent(E34)
                    .addComponent(F34)
                    .addComponent(G34)
                    .addComponent(H34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A35)
                    .addComponent(B35)
                    .addComponent(C35)
                    .addComponent(D35)
                    .addComponent(E35)
                    .addComponent(F35)
                    .addComponent(G35)
                    .addComponent(H35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A36)
                    .addComponent(B36)
                    .addComponent(C36)
                    .addComponent(D36)
                    .addComponent(E36)
                    .addComponent(F36)
                    .addComponent(G36)
                    .addComponent(H36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A37)
                    .addComponent(B37)
                    .addComponent(C37)
                    .addComponent(D37)
                    .addComponent(E37)
                    .addComponent(F37)
                    .addComponent(G37)
                    .addComponent(H37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A38)
                    .addComponent(B38)
                    .addComponent(C38)
                    .addComponent(D38)
                    .addComponent(E38)
                    .addComponent(F38)
                    .addComponent(G38)
                    .addComponent(H38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A39)
                    .addComponent(B39)
                    .addComponent(C39)
                    .addComponent(D39)
                    .addComponent(E39)
                    .addComponent(F39)
                    .addComponent(G39)
                    .addComponent(H39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A40)
                    .addComponent(B40)
                    .addComponent(C40)
                    .addComponent(D40)
                    .addComponent(E40)
                    .addComponent(F40)
                    .addComponent(G40)
                    .addComponent(H40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A41)
                    .addComponent(B41)
                    .addComponent(C41)
                    .addComponent(D41)
                    .addComponent(E41)
                    .addComponent(F41)
                    .addComponent(G41)
                    .addComponent(H41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A42)
                    .addComponent(B42)
                    .addComponent(C42)
                    .addComponent(D42)
                    .addComponent(E42)
                    .addComponent(F42)
                    .addComponent(G42)
                    .addComponent(H42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A43)
                    .addComponent(B43)
                    .addComponent(C43)
                    .addComponent(D43)
                    .addComponent(jButton262)
                    .addComponent(F43)
                    .addComponent(G43)
                    .addComponent(H43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A44)
                    .addComponent(B44)
                    .addComponent(C44)
                    .addComponent(D44)
                    .addComponent(E44)
                    .addComponent(F44)
                    .addComponent(G44)
                    .addComponent(H44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A45)
                    .addComponent(B45)
                    .addComponent(C45)
                    .addComponent(D45)
                    .addComponent(E45)
                    .addComponent(F45)
                    .addComponent(G45)
                    .addComponent(H45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A46)
                    .addComponent(B46)
                    .addComponent(C46)
                    .addComponent(D46)
                    .addComponent(E46)
                    .addComponent(F46)
                    .addComponent(G46)
                    .addComponent(H46))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A47)
                    .addComponent(B47)
                    .addComponent(C47)
                    .addComponent(D47)
                    .addComponent(E47)
                    .addComponent(F47)
                    .addComponent(G47)
                    .addComponent(H47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A48)
                    .addComponent(B48)
                    .addComponent(C48)
                    .addComponent(D48)
                    .addComponent(E48)
                    .addComponent(F48)
                    .addComponent(G48)
                    .addComponent(H48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A49)
                    .addComponent(B49)
                    .addComponent(C49)
                    .addComponent(D49)
                    .addComponent(E49)
                    .addComponent(F49)
                    .addComponent(G49)
                    .addComponent(H49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A50)
                    .addComponent(B50)
                    .addComponent(C50)
                    .addComponent(D50)
                    .addComponent(E50)
                    .addComponent(F50)
                    .addComponent(G50)
                    .addComponent(H50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A51)
                    .addComponent(B51)
                    .addComponent(C51)
                    .addComponent(D51)
                    .addComponent(E51)
                    .addComponent(F51)
                    .addComponent(G51)
                    .addComponent(H51))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A52)
                    .addComponent(B52)
                    .addComponent(C52)
                    .addComponent(D52)
                    .addComponent(E52)
                    .addComponent(F52)
                    .addComponent(G52)
                    .addComponent(H52))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A53)
                    .addComponent(B53)
                    .addComponent(C53)
                    .addComponent(D53)
                    .addComponent(E53)
                    .addComponent(F53)
                    .addComponent(G53)
                    .addComponent(H53))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A54)
                    .addComponent(B54)
                    .addComponent(C54)
                    .addComponent(D54)
                    .addComponent(E54)
                    .addComponent(F54)
                    .addComponent(G54)
                    .addComponent(H54))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A55)
                    .addComponent(B55)
                    .addComponent(C55)
                    .addComponent(D55)
                    .addComponent(E55)
                    .addComponent(F55)
                    .addComponent(G55)
                    .addComponent(H55))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A56)
                    .addComponent(B56)
                    .addComponent(C56)
                    .addComponent(D56)
                    .addComponent(E56)
                    .addComponent(F56)
                    .addComponent(G56)
                    .addComponent(H56))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A57)
                    .addComponent(B57)
                    .addComponent(C57)
                    .addComponent(D57)
                    .addComponent(E57)
                    .addComponent(F57)
                    .addComponent(G57)
                    .addComponent(H57))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A58)
                    .addComponent(B58)
                    .addComponent(C58)
                    .addComponent(D58)
                    .addComponent(E58)
                    .addComponent(F58)
                    .addComponent(G58)
                    .addComponent(H58))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A59)
                    .addComponent(B59)
                    .addComponent(C59)
                    .addComponent(D59)
                    .addComponent(E59)
                    .addComponent(F59)
                    .addComponent(G59)
                    .addComponent(H59))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A60)
                    .addComponent(B60)
                    .addComponent(C60)
                    .addComponent(D60)
                    .addComponent(E60)
                    .addComponent(F60)
                    .addComponent(G60)
                    .addComponent(H60))
                .addContainerGap())
        );

        scrollPanel.setViewportView(jPanel1);

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Flight ID");

        flightIDText.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Selected seat ID");

        seatIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatIDTextActionPerformed(evt);
            }
        });

        btnProceed.setText("Proceed");
        btnProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProceedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(34, 34, 34)
                        .addComponent(seatIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addComponent(flightIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnProceed, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(scrollPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(flightIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seatIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(btnProceed))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    JButton clickedButton ;
    String selectedSeats = "";
    int count = 0;
    
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        ReserveSeats search = new ReserveSeats(flightIDText.getText(),seatAvailability);
        search.setVisible(true);
        this.getDesktopPane().add(search);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void seatIDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatIDTextActionPerformed

    }//GEN-LAST:event_seatIDTextActionPerformed

    private void btnProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProceedActionPerformed
        String [] seatIDArray = new String[--count];
        seatIDArray = selectedSeats.split(",");          
        
  
        //DD
        PassengerDetails details = new PassengerDetails(flightID, seatIDArray);
        details.setVisible(true);
        this.getDesktopPane().add(details);
        this.dispose();
    }//GEN-LAST:event_btnProceedActionPerformed

    private void ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                       
        count++;
        selectedSeats += ((javax.swing.JButton)evt.getSource()).getText() + ",";
        seatIDText.setText(selectedSeats);
        
        clickedButton = (JButton)evt.getSource();
        clickedButton.setEnabled(false);
    }

    // Variables declaration //GEN-BEGIN:variables
    private javax.swing.JButton A13;
    private javax.swing.JButton A14;
    private javax.swing.JButton A15;
    private javax.swing.JButton A16;
    private javax.swing.JButton A17;
    private javax.swing.JButton A18;
    private javax.swing.JButton A19;
    private javax.swing.JButton A20;
    private javax.swing.JButton A21;
    private javax.swing.JButton A22;
    private javax.swing.JButton A23;
    private javax.swing.JButton A24;
    private javax.swing.JButton A25;
    private javax.swing.JButton A26;
    private javax.swing.JButton A27;
    private javax.swing.JButton A28;
    private javax.swing.JButton A29;
    private javax.swing.JButton A30;
    private javax.swing.JButton A31;
    private javax.swing.JButton A32;
    private javax.swing.JButton A33;
    private javax.swing.JButton A34;
    private javax.swing.JButton A35;
    private javax.swing.JButton A36;
    private javax.swing.JButton A37;
    private javax.swing.JButton A38;
    private javax.swing.JButton A39;
    private javax.swing.JButton A40;
    private javax.swing.JButton A41;
    private javax.swing.JButton A42;
    private javax.swing.JButton A43;
    private javax.swing.JButton A44;
    private javax.swing.JButton A45;
    private javax.swing.JButton A46;
    private javax.swing.JButton A47;
    private javax.swing.JButton A48;
    private javax.swing.JButton A49;
    private javax.swing.JButton A50;
    private javax.swing.JButton A51;
    private javax.swing.JButton A52;
    private javax.swing.JButton A53;
    private javax.swing.JButton A54;
    private javax.swing.JButton A55;
    private javax.swing.JButton A56;
    private javax.swing.JButton A57;
    private javax.swing.JButton A58;
    private javax.swing.JButton A59;
    private javax.swing.JButton A60;
    private javax.swing.JButton B13;
    private javax.swing.JButton B14;
    private javax.swing.JButton B15;
    private javax.swing.JButton B16;
    private javax.swing.JButton B17;
    private javax.swing.JButton B18;
    private javax.swing.JButton B19;
    private javax.swing.JButton B20;
    private javax.swing.JButton B21;
    private javax.swing.JButton B22;
    private javax.swing.JButton B23;
    private javax.swing.JButton B24;
    private javax.swing.JButton B25;
    private javax.swing.JButton B26;
    private javax.swing.JButton B27;
    private javax.swing.JButton B28;
    private javax.swing.JButton B29;
    private javax.swing.JButton B30;
    private javax.swing.JButton B31;
    private javax.swing.JButton B32;
    private javax.swing.JButton B33;
    private javax.swing.JButton B34;
    private javax.swing.JButton B35;
    private javax.swing.JButton B36;
    private javax.swing.JButton B37;
    private javax.swing.JButton B38;
    private javax.swing.JButton B39;
    private javax.swing.JButton B40;
    private javax.swing.JButton B41;
    private javax.swing.JButton B42;
    private javax.swing.JButton B43;
    private javax.swing.JButton B44;
    private javax.swing.JButton B45;
    private javax.swing.JButton B46;
    private javax.swing.JButton B47;
    private javax.swing.JButton B48;
    private javax.swing.JButton B49;
    private javax.swing.JButton B50;
    private javax.swing.JButton B51;
    private javax.swing.JButton B52;
    private javax.swing.JButton B53;
    private javax.swing.JButton B54;
    private javax.swing.JButton B55;
    private javax.swing.JButton B56;
    private javax.swing.JButton B57;
    private javax.swing.JButton B58;
    private javax.swing.JButton B59;
    private javax.swing.JButton B60;
    private javax.swing.JButton C13;
    private javax.swing.JButton C14;
    private javax.swing.JButton C15;
    private javax.swing.JButton C16;
    private javax.swing.JButton C17;
    private javax.swing.JButton C18;
    private javax.swing.JButton C19;
    private javax.swing.JButton C20;
    private javax.swing.JButton C21;
    private javax.swing.JButton C22;
    private javax.swing.JButton C23;
    private javax.swing.JButton C24;
    private javax.swing.JButton C25;
    private javax.swing.JButton C26;
    private javax.swing.JButton C27;
    private javax.swing.JButton C28;
    private javax.swing.JButton C29;
    private javax.swing.JButton C30;
    private javax.swing.JButton C31;
    private javax.swing.JButton C32;
    private javax.swing.JButton C33;
    private javax.swing.JButton C34;
    private javax.swing.JButton C35;
    private javax.swing.JButton C36;
    private javax.swing.JButton C37;
    private javax.swing.JButton C38;
    private javax.swing.JButton C39;
    private javax.swing.JButton C40;
    private javax.swing.JButton C41;
    private javax.swing.JButton C42;
    private javax.swing.JButton C43;
    private javax.swing.JButton C44;
    private javax.swing.JButton C45;
    private javax.swing.JButton C46;
    private javax.swing.JButton C47;
    private javax.swing.JButton C48;
    private javax.swing.JButton C49;
    private javax.swing.JButton C50;
    private javax.swing.JButton C51;
    private javax.swing.JButton C52;
    private javax.swing.JButton C53;
    private javax.swing.JButton C54;
    private javax.swing.JButton C55;
    private javax.swing.JButton C56;
    private javax.swing.JButton C57;
    private javax.swing.JButton C58;
    private javax.swing.JButton C59;
    private javax.swing.JButton C60;
    private javax.swing.JButton D13;
    private javax.swing.JButton D14;
    private javax.swing.JButton D15;
    private javax.swing.JButton D16;
    private javax.swing.JButton D17;
    private javax.swing.JButton D18;
    private javax.swing.JButton D19;
    private javax.swing.JButton D20;
    private javax.swing.JButton D21;
    private javax.swing.JButton D22;
    private javax.swing.JButton D23;
    private javax.swing.JButton D24;
    private javax.swing.JButton D25;
    private javax.swing.JButton D26;
    private javax.swing.JButton D27;
    private javax.swing.JButton D28;
    private javax.swing.JButton D29;
    private javax.swing.JButton D30;
    private javax.swing.JButton D31;
    private javax.swing.JButton D32;
    private javax.swing.JButton D33;
    private javax.swing.JButton D34;
    private javax.swing.JButton D35;
    private javax.swing.JButton D36;
    private javax.swing.JButton D37;
    private javax.swing.JButton D38;
    private javax.swing.JButton D39;
    private javax.swing.JButton D40;
    private javax.swing.JButton D41;
    private javax.swing.JButton D42;
    private javax.swing.JButton D43;
    private javax.swing.JButton D44;
    private javax.swing.JButton D45;
    private javax.swing.JButton D46;
    private javax.swing.JButton D47;
    private javax.swing.JButton D48;
    private javax.swing.JButton D49;
    private javax.swing.JButton D50;
    private javax.swing.JButton D51;
    private javax.swing.JButton D52;
    private javax.swing.JButton D53;
    private javax.swing.JButton D54;
    private javax.swing.JButton D55;
    private javax.swing.JButton D56;
    private javax.swing.JButton D57;
    private javax.swing.JButton D58;
    private javax.swing.JButton D59;
    private javax.swing.JButton D60;
    private javax.swing.JButton E13;
    private javax.swing.JButton E14;
    private javax.swing.JButton E15;
    private javax.swing.JButton E16;
    private javax.swing.JButton E17;
    private javax.swing.JButton E18;
    private javax.swing.JButton E19;
    private javax.swing.JButton E20;
    private javax.swing.JButton E21;
    private javax.swing.JButton E22;
    private javax.swing.JButton E23;
    private javax.swing.JButton E24;
    private javax.swing.JButton E25;
    private javax.swing.JButton E26;
    private javax.swing.JButton E27;
    private javax.swing.JButton E28;
    private javax.swing.JButton E29;
    private javax.swing.JButton E30;
    private javax.swing.JButton E31;
    private javax.swing.JButton E32;
    private javax.swing.JButton E33;
    private javax.swing.JButton E34;
    private javax.swing.JButton E35;
    private javax.swing.JButton E36;
    private javax.swing.JButton E37;
    private javax.swing.JButton E38;
    private javax.swing.JButton E39;
    private javax.swing.JButton E40;
    private javax.swing.JButton E41;
    private javax.swing.JButton E42;
    private javax.swing.JButton E44;
    private javax.swing.JButton E45;
    private javax.swing.JButton E46;
    private javax.swing.JButton E47;
    private javax.swing.JButton E48;
    private javax.swing.JButton E49;
    private javax.swing.JButton E50;
    private javax.swing.JButton E51;
    private javax.swing.JButton E52;
    private javax.swing.JButton E53;
    private javax.swing.JButton E54;
    private javax.swing.JButton E55;
    private javax.swing.JButton E56;
    private javax.swing.JButton E57;
    private javax.swing.JButton E58;
    private javax.swing.JButton E59;
    private javax.swing.JButton E60;
    private javax.swing.JButton F13;
    private javax.swing.JButton F14;
    private javax.swing.JButton F15;
    private javax.swing.JButton F16;
    private javax.swing.JButton F17;
    private javax.swing.JButton F18;
    private javax.swing.JButton F19;
    private javax.swing.JButton F20;
    private javax.swing.JButton F21;
    private javax.swing.JButton F22;
    private javax.swing.JButton F23;
    private javax.swing.JButton F24;
    private javax.swing.JButton F25;
    private javax.swing.JButton F26;
    private javax.swing.JButton F27;
    private javax.swing.JButton F28;
    private javax.swing.JButton F29;
    private javax.swing.JButton F30;
    private javax.swing.JButton F31;
    private javax.swing.JButton F32;
    private javax.swing.JButton F33;
    private javax.swing.JButton F34;
    private javax.swing.JButton F35;
    private javax.swing.JButton F36;
    private javax.swing.JButton F37;
    private javax.swing.JButton F38;
    private javax.swing.JButton F39;
    private javax.swing.JButton F40;
    private javax.swing.JButton F41;
    private javax.swing.JButton F42;
    private javax.swing.JButton F43;
    private javax.swing.JButton F44;
    private javax.swing.JButton F45;
    private javax.swing.JButton F46;
    private javax.swing.JButton F47;
    private javax.swing.JButton F48;
    private javax.swing.JButton F49;
    private javax.swing.JButton F50;
    private javax.swing.JButton F51;
    private javax.swing.JButton F52;
    private javax.swing.JButton F53;
    private javax.swing.JButton F54;
    private javax.swing.JButton F55;
    private javax.swing.JButton F56;
    private javax.swing.JButton F57;
    private javax.swing.JButton F58;
    private javax.swing.JButton F59;
    private javax.swing.JButton F60;
    private javax.swing.JButton G13;
    private javax.swing.JButton G14;
    private javax.swing.JButton G15;
    private javax.swing.JButton G16;
    private javax.swing.JButton G17;
    private javax.swing.JButton G18;
    private javax.swing.JButton G19;
    private javax.swing.JButton G20;
    private javax.swing.JButton G21;
    private javax.swing.JButton G22;
    private javax.swing.JButton G23;
    private javax.swing.JButton G24;
    private javax.swing.JButton G25;
    private javax.swing.JButton G26;
    private javax.swing.JButton G27;
    private javax.swing.JButton G28;
    private javax.swing.JButton G29;
    private javax.swing.JButton G30;
    private javax.swing.JButton G31;
    private javax.swing.JButton G32;
    private javax.swing.JButton G33;
    private javax.swing.JButton G34;
    private javax.swing.JButton G35;
    private javax.swing.JButton G36;
    private javax.swing.JButton G37;
    private javax.swing.JButton G38;
    private javax.swing.JButton G39;
    private javax.swing.JButton G40;
    private javax.swing.JButton G41;
    private javax.swing.JButton G42;
    private javax.swing.JButton G43;
    private javax.swing.JButton G44;
    private javax.swing.JButton G45;
    private javax.swing.JButton G46;
    private javax.swing.JButton G47;
    private javax.swing.JButton G48;
    private javax.swing.JButton G49;
    private javax.swing.JButton G50;
    private javax.swing.JButton G51;
    private javax.swing.JButton G52;
    private javax.swing.JButton G53;
    private javax.swing.JButton G54;
    private javax.swing.JButton G55;
    private javax.swing.JButton G56;
    private javax.swing.JButton G57;
    private javax.swing.JButton G58;
    private javax.swing.JButton G59;
    private javax.swing.JButton G60;
    private javax.swing.JButton H13;
    private javax.swing.JButton H14;
    private javax.swing.JButton H15;
    private javax.swing.JButton H16;
    private javax.swing.JButton H17;
    private javax.swing.JButton H18;
    private javax.swing.JButton H19;
    private javax.swing.JButton H20;
    private javax.swing.JButton H21;
    private javax.swing.JButton H22;
    private javax.swing.JButton H23;
    private javax.swing.JButton H24;
    private javax.swing.JButton H25;
    private javax.swing.JButton H26;
    private javax.swing.JButton H27;
    private javax.swing.JButton H28;
    private javax.swing.JButton H29;
    private javax.swing.JButton H30;
    private javax.swing.JButton H31;
    private javax.swing.JButton H32;
    private javax.swing.JButton H33;
    private javax.swing.JButton H34;
    private javax.swing.JButton H35;
    private javax.swing.JButton H36;
    private javax.swing.JButton H37;
    private javax.swing.JButton H38;
    private javax.swing.JButton H39;
    private javax.swing.JButton H40;
    private javax.swing.JButton H41;
    private javax.swing.JButton H42;
    private javax.swing.JButton H43;
    private javax.swing.JButton H44;
    private javax.swing.JButton H45;
    private javax.swing.JButton H46;
    private javax.swing.JButton H47;
    private javax.swing.JButton H48;
    private javax.swing.JButton H49;
    private javax.swing.JButton H50;
    private javax.swing.JButton H51;
    private javax.swing.JButton H52;
    private javax.swing.JButton H53;
    private javax.swing.JButton H54;
    private javax.swing.JButton H55;
    private javax.swing.JButton H56;
    private javax.swing.JButton H57;
    private javax.swing.JButton H58;
    private javax.swing.JButton H59;
    private javax.swing.JButton H60;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnProceed;
    private javax.swing.JTextField flightIDText;
    private javax.swing.JButton jButton130;
    private javax.swing.JButton jButton131;
    private javax.swing.JButton jButton132;
    private javax.swing.JButton jButton133;
    private javax.swing.JButton jButton134;
    private javax.swing.JButton jButton135;
    private javax.swing.JButton jButton136;
    private javax.swing.JButton jButton137;
    private javax.swing.JButton jButton186;
    private javax.swing.JButton jButton187;
    private javax.swing.JButton jButton188;
    private javax.swing.JButton jButton189;
    private javax.swing.JButton jButton190;
    private javax.swing.JButton jButton191;
    private javax.swing.JButton jButton192;
    private javax.swing.JButton jButton193;
    private javax.swing.JButton jButton262;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JTextField seatIDText;
    // End of variables declaration//GEN-END:variables
}
