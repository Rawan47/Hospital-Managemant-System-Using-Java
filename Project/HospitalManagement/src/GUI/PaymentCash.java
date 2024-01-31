/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DataManagement.Admin;
import DataManagement.Person;
import static TransactionsMangement.Appointment.readAppIdsFromFile;
import TransactionsMangement.Cash;
import TransactionsMangement.Prescription;
import static TransactionsMangement.Prescription.readPrescIdsFromFile;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


/**
 *
 * @author Fouad
 */
public class PaymentCash extends javax.swing.JFrame {

    /**
     * Creates new form PaymentCash
     */
    public PaymentCash() {
        initComponents();
        List<String> Ids12 = readPrescIdsFromFile();
        DefaultComboBoxModel<String> comboBoxMode2 = new DefaultComboBoxModel<>(Ids12.toArray(new String[0]));
        prescriptionID.setModel(comboBoxMode2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        recievedAmount = new javax.swing.JPasswordField();
        RegisterButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        HomeButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        paymentID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        LogoutButton = new javax.swing.JButton();
        prescriptionID = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RegisterButton.setText("Pay");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Prescription ID");

        HomeButton.setText("Home Page");
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Payment ID:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setText("Prescription Cash Payment");

        jLabel8.setText("RecievedAmount:");

        LogoutButton.setText("Log out");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(HomeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogoutButton)
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel4)
                .addGap(0, 77, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(recievedAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(paymentID, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                .addComponent(prescriptionID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(RegisterButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HomeButton)
                    .addComponent(LogoutButton))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paymentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(prescriptionID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(recievedAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(RegisterButton)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        // TODO add your handling code here:
        Prescription prescription = Prescription.getPrescriptionById((String)prescriptionID.getSelectedItem());
        Cash cash = new Cash(Double.parseDouble(recievedAmount.getText()),paymentID.getText(), (String)prescriptionID.getSelectedItem(),new Date(), prescription.getAmount());        
        Admin.storeInFile("cash.dat", cash);
        String r = cash.processPayment(prescription.getAmount(),Double.parseDouble(recievedAmount.getText()));
        JOptionPane.showMessageDialog(this, r);
        new PatientActionPage().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        // TODO add your handling code here:
        new WelcomePage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        // TODO add your handling code here:
        Person.logout();
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PaymentCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentCash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField paymentID;
    private javax.swing.JComboBox<String> prescriptionID;
    private javax.swing.JPasswordField recievedAmount;
    // End of variables declaration//GEN-END:variables
}
