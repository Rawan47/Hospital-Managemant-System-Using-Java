/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DataManagement.*;
import MedicineManagement.*;
import TransactionsMangement.*;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fouad
 */
public class AdminActionPage extends javax.swing.JFrame {

    /**
     * Creates new form AdminActionPage
     */
    public AdminActionPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        DisplayAllData = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ComboBox1 = new javax.swing.JComboBox<>();
        HomeButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        RegisterButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ComboBox2 = new javax.swing.JComboBox<>();
        roomNo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();

        jMenu3.setText("jMenu3");

        jMenu1.setText("jMenu1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Admin Action Page");

        DisplayAllData.setText("Display All Data");
        DisplayAllData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayAllDataActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("Display Data of all:");

        ComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doctors", "Nurses", "Pharmacists", "Patients", "Rooms", "Appointments", "Medicine" }));
        ComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox1ActionPerformed(evt);
            }
        });

        HomeButton.setText("Home Page");
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });

        LogoutButton.setText("Log out");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        RegisterButton.setText("Create Room");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Room Type:");

        jLabel7.setText("Room Number:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("Create New Room");

        ComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cardiology", "Labour & Delivery", "Emergency", "Intensive Care" }));
        ComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox2ActionPerformed(evt);
            }
        });

        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data Displayed Here"
            }
        ));
        jScrollPane2.setViewportView(Table1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(DisplayAllData)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(roomNo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                                        .addComponent(HomeButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(LogoutButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(RegisterButton)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LogoutButton)
                            .addComponent(HomeButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)))
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(RegisterButton)
                    .addComponent(jLabel5)
                    .addComponent(ComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DisplayAllData))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DisplayAllDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayAllDataActionPerformed
        // TODO add your handling code here:
        String selectedRole = (String) ComboBox1.getSelectedItem();
        List<Person> loadedUsers = null;
        List<Room> loadedRooms = null;
        List<Appointment> loadedApps = null;
        List<Medicine> loadedMed = null;
        DefaultTableModel model = new DefaultTableModel(); 
        Table1.setModel(model); 
       
        
         if(null != selectedRole)switch (selectedRole) {
            case "Doctors":
                model.addColumn("Doctor ID");
                model.addColumn("Doctor Name");
                model.addColumn("Doctor Email");
                model.addColumn("Doctor Password");
                model.addColumn("Doctor Specialization");
                model.addColumn("Doctor Department");

                loadedUsers = Admin.loadPersons("doctors.dat", Person.class);

                for (Person person : loadedUsers) {
                    
                        Doctor doctor = (Doctor) person;
                        String doctorID = doctor.getID();
                        String doctorName = doctor.getName() != null ? doctor.getName() : "N/A";
                        String doctorEmail = doctor.getEmail() != null ? doctor.getEmail() : "N/A";
                        String doctorPassword = doctor.getPassword() != null ? doctor.getPassword() : "N/A";
                        String doctorSpecialization = doctor.specialization != null ? doctor.specialization : "N/A";
                        String doctorDepartment = doctor.department != null ? doctor.department : "N/A";

                        // Add doctor data to the table
                        model.addRow(new Object[]{doctorID, doctorName, doctorEmail, doctorPassword, doctorSpecialization, doctorDepartment});
                   
                }
                break;
            case "Nurses":
                model.addColumn("Nurse ID");
                model.addColumn("Nurse Name");
                model.addColumn("Nurse Email");
                model.addColumn("Nurse Password");
                model.addColumn("Nursing License Number");
                model.addColumn("Nurse Shift");

                loadedUsers = Admin.loadPersons("nurses.dat", Person.class);

                for (Person person : loadedUsers) {
                    Nurse nurse = (Nurse) person;
                    String nurseID = nurse.getID();
                    String nurseName = nurse.getName() != null ? nurse.getName() : "N/A";
                    String nurseEmail = nurse.getEmail() != null ? nurse.getEmail() : "N/A";
                    String nursePassword = nurse.getPassword() != null ? nurse.getPassword() : "N/A";
                    int nursingLicenseNumber = nurse.nursingLicenseNumber;
                    String nurseShift = nurse.shift != null ? nurse.shift : "N/A";

                    // Add data to the table
                    model.addRow(new Object[]{nurseID, nurseName, nurseEmail, nursePassword, nursingLicenseNumber, nurseShift});
                }
                break;

            case "Pharmacists":
                model.addColumn("Pharmacist ID");
                model.addColumn("Pharmacist Name");
                model.addColumn("Pharmacist Email");
                model.addColumn("Pharmacist Password");
                model.addColumn("Pharmacist License Number");

                loadedUsers = Admin.loadPersons("pharmacists.dat", Person.class);

                for (Person person: loadedUsers) {
                    Pharmacist pharmacist = (Pharmacist) person;
                    String pharmacistID = pharmacist.getID() != null ? pharmacist.getID() : "N/A";
                    String pharmacistName = pharmacist.getName() != null ? pharmacist.getName() : "N/A";
                    String pharmacistEmail = pharmacist.getEmail() != null ? pharmacist.getEmail() : "N/A";
                    String pharmacistPassword = pharmacist.getPassword() != null ? pharmacist.getPassword() : "N/A";
                    int pharmacistLicenseNumber = pharmacist.licenseNumber;

                    // Add data to the table
                    model.addRow(new Object[]{pharmacistID, pharmacistName, pharmacistEmail, pharmacistPassword, pharmacistLicenseNumber});
                }
                break;

            case "Patients":
                model.addColumn("Patient ID");
                model.addColumn("Patient Name");
                model.addColumn("Patient Email");
                model.addColumn("Patient Password");
                model.addColumn("Patient Age");
                model.addColumn("Patient Gender");

                loadedUsers = Admin.loadPersons("patients.dat", Person.class);

                for (Person person: loadedUsers) {
                    Patient patient = (Patient) person;
                    String patientID = patient.getID();
                    String patientName = patient.getName() != null ? patient.getName() : "N/A";
                    String patientEmail = patient.getEmail() != null ? patient.getEmail() : "N/A";
                    String patientPassword = patient.getPassword() != null ? patient.getPassword() : "N/A";
                    int patientAge = patient.age;
                    String patientGender = patient.gender != null ? patient.gender : "N/A";

                    // Add data to the table
                    model.addRow(new Object[]{patientID, patientName, patientEmail, patientPassword, patientAge, patientGender});
                }
                break;

            case "Rooms":
                model.addColumn("Room Number");
                model.addColumn("Room Type");
                model.addColumn("Assigned Appointment");

                loadedRooms = Admin.loadItems("rooms.dat", Room.class);

                for (Room room : loadedRooms) {
                    String roomNumber = room.getRoomNumber();
                    String roomType = room.getRoomType();
                    String assignedAppointment = room.getAssignedAppointment() != null ? room.getAssignedAppointment().toString() : "N/A";

                    // Add data to the table
                    model.addRow(new Object[]{
                        roomNumber != null ? roomNumber : "N/A",
                        roomType != null ? roomType : "N/A",
                        assignedAppointment != null ? assignedAppointment : "N/A"
                    });
                }
                break;

            case "Appointments":
                model.addColumn("Appointment ID");
                model.addColumn("Appointment Date");
                model.addColumn("Doctor Name");
                model.addColumn("Nurse Name");
                model.addColumn("Patient Name");
                model.addColumn("Patient Age");
                model.addColumn("Feedback List");

                loadedApps = Admin.loadItems("appointments.dat", Appointment.class);

                for (Appointment appointment : loadedApps) {
                    String appointmentID = appointment.getAppointmentID();
                    LocalDate appointmentDateTime = appointment.getAppointmentDateTime();
                    String doctorName = appointment.getDoctorID() != null ? appointment.getDoctorID().getName() : "N/A";
                    String nurseName = appointment.getNurse() != null ? appointment.getNurse().getName() : "N/A";
                    String patientName = appointment.getPatient() != null ? appointment.getPatient().getName() : "N/A";
                    int patientAge = appointment.getPatient() != null ? appointment.getPatient().age : 0;
                    List<Feedback> feedbackList = appointment.getFeedbackList();

                    // Add data to the table
                    model.addRow(new Object[]{appointmentID, appointmentDateTime, doctorName, nurseName, patientName, patientAge, feedbackList});
                    }
                break;
                
            case "Medicine":
                model.addColumn("Medicine Name");
                model.addColumn("Expiration Date");

                loadedMed = Admin.loadItems("medicine.dat", Medicine.class);

                for (Medicine medicine : loadedMed) {
                    String medicineName = medicine.getItemName() != null ? medicine.getItemName() : "N/A";
                    LocalDate expirationDate = medicine.getExpirationDate();

                    // Add data to the table
                    model.addRow(new Object[]{medicineName, expirationDate});
                }
                break;

            default:
                break;
        }
  
        
        
    }//GEN-LAST:event_DisplayAllDataActionPerformed

    private void ComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox1ActionPerformed

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

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        // TODO add your handling code here:
       Room room = new Room(roomNo.getText(), (String) ComboBox2.getSelectedItem());        
       Admin.storeInFile("rooms.dat",room);
        JOptionPane.showMessageDialog(this, room.getRoomNumber() + " created successfully");
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void ComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminActionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminActionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminActionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminActionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminActionPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox1;
    private javax.swing.JComboBox<String> ComboBox2;
    private javax.swing.JButton DisplayAllData;
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JTable Table1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField roomNo;
    // End of variables declaration//GEN-END:variables
}
