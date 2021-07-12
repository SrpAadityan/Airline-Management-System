package GUI;
import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    String username = "";
    String passWord = "";
    
    public Login() {
        initComponents();

         this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        passwordText = new javax.swing.JPasswordField();
        btnCancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Airline Management System");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(780, 569));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabel1.setText("Username");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 415, 130, 20);

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 455, 100, 19);

        usernameText.setText("admin");
        usernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextActionPerformed(evt);
            }
        });
        getContentPane().add(usernameText);
        usernameText.setBounds(280, 410, 123, 30);

        passwordText.setText("root");
        passwordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextActionPerformed(evt);
            }
        });
        getContentPane().add(passwordText);
        passwordText.setBounds(280, 450, 123, 30);

        btnCancel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(430, 450, 90, 32);

        jLabel3.setFont(new java.awt.Font("Monospaced Bold", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Airline Management System");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 20, 700, 56);

        btnLogin.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(430, 410, 90, 32);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/flight2.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 800, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        System.exit(0);
        
        
    }//GEN-LAST:event_btnCancelActionPerformed

    private void passwordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextActionPerformed

    }//GEN-LAST:event_passwordTextActionPerformed

    private void usernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextActionPerformed

    }//GEN-LAST:event_usernameTextActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
      username = usernameText.getText();
      passWord = passwordText.getText();
      
      String[] loginDetails = new String[2];
	String userName = "";
	String password = "";
	
	try(Scanner read = new Scanner(new FileInputStream("loginDetails.txt"))){
	
		boolean end = false;
		
		while(read.hasNextLine()&& !end){

			loginDetails = read.nextLine().split(",");
			userName = loginDetails[0];
			password = loginDetails[1];
                        
                        if(userName.compareTo(username)==0 && password.compareTo(passWord)==0){
                            LoadFile lf = new LoadFile();
                           lf.setVisible(true);
                            lf.pack();
                            this.dispose();
                        }else{
                            JOptionPane.showMessageDialog(null, "Invalid login credentials. Please try again.");
                        }
		}
	}
	catch(FileNotFoundException ex){
		 JOptionPane.showMessageDialog(null,"File Not Found");
	}
	catch(Exception ex){
		 JOptionPane.showMessageDialog(null,ex.getMessage());
	}
        
        
      
    }//GEN-LAST:event_btnLoginActionPerformed

   /* public void login(){

	String[] loginDetails = new String[2];
	String userName = "";
	String password = "";
	
	try(Scanner read = new Scanner(new FileInputStream("loginDetails.txt"))){
		//PrintWriter pw = new PrintWriter(new FileOutputStream(outputFile))){
	
		boolean end = false;
		
		while(read.hasNextLine()&& !end){

			loginDetails = read.nextLine().split(",");
			userName = loginDetails[0];
			password = loginDetails[1];
			
			if(userName.compareTo(username)==0 && password.compareTo(passWord)==0){
				System.out.println("Login Successful");
			}

			
		}
	}
	catch(FileNotFoundException ex){
		System.out.println("File Not Found");
	}
	catch(Exception ex){
		System.out.println("Exception");
	}
}  */                      

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables
}
