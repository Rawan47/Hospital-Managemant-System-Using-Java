/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DataManagement;

import GUI.*;

/**
 *
 * @author Fouad
 */
public class HospitalManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new WelcomePage().setVisible(true);
//      new DoctorActionPage().setVisible(true);

//        System.out.println(Admin.readIdsFromFile("admins.dat"));
//        System.out.print(Person.getPersonByEmail("doctors.dat", "r@g.com", Person.class));
//        Admin admin = new Admin("A1", "Salma Mostafa", "98765423456", "salma@gmail.com", "123");        
//
//        Admin admin = new Admin("A2", "Fouad Hossam", "45678909876", "fouad@gmail.com", "345");        
//        Admin.storeInFile("admins.dat", admin);
//
//            List<Person> loadedUsers = Admin.loadPersons("admins.dat", Person.class);
//            System.out.println(loadedUsers);
//            List<Person> loadedUsers2 = Admin.loadPersons("patients.dat", Person.class);
//            System.out.println(loadedUsers2);
//            List<Person> loadedUsers3 = Admin.loadPersons("nurses.dat", Person.class);
//            System.out.println(loadedUsers3);
//            List<Person> loadedUsers4 = Admin.loadPersons("doctors.dat", Person.class);
//            System.out.println(loadedUsers4);
//            List<Person> loadedUsers5 = Admin.loadPersons("pharmacists.dat", Person.class);
//            System.out.println(loadedUsers5);
                        
//            List<Room> loadedUsers6 = Admin.loadItems("rooms.dat", Room.class);
//            System.out.println(loadedUsers6);
//            
//            System.out.println(Admin.loadItems("appointments.dat", Appointment.class));
//            List<Person> loadedUsers7 = Admin.loadPersons("nurses.dat", Person.class);
//            System.out.println(loadedUsers7);

//            Person.login(loadedUsers,"fouad@gmail.com", "345");
//        
//        Doctor doctor = new Doctor("D111", "Doctor Name", "2354334555", "doctor@example.com", "doctorPassword", "Cardiology", "Heart Department");
//        
//        Patient patient = new Patient("P500","Patient Name1", "3465462", "patient@example.com", "patientPassword1", 25, "Female","M123", "coma, heart attack","Peanuts, Shellfish, Pollen", "Flu Shot, Corona shot","PCR, Blood Type","Heart Surgery, Knee Surgery"); 
//
//        
//        Nurse nurse = new Nurse("N123","Nurse Name", "243523452", "nurese@gmail.com", "nursePassword", 76584, "Night");
//        
//        Pharmacist pharmacist = new Pharmacist("Ph444", "Pharmacist Name", "2345675", "pjarmacist@gmail.com", "pharmacistPassword", 23423);
//        
//        Room room = new Room("Room101", "Cardiology Department");
//        
//        Admin.storeInFile("rooms.dat",room);
//
//        Admin.storeInFile("doctors.dat",doctor);
//        Admin.storeInFile("patients.dat",patient);
//        Person.login("patients.dat", Patient.class, "patient@example.com", "patientPassword1");
//        admin.storeInFile("patients.dat",patient2);
//        System.out.println(Admin.loadAll("doctors.dat",doctor));
//        List<Person> loadedDoctors = Admin.loadPersons("doctors.dat", Person.class);
//        Person.login(loadedDoctors, "doctor@example.com", "doctorPassword");          
//        
//        Person.login("admins.dat", Admin.class, "s@g.com", "1");
//        admin.login("admins.dat", admin.getEmail(), admin.getPassword());
//
//        admin.storePatient(patient);
//        admin.login("patients.dat", patient, patient.getEmail(), patient.getPassword());
//        MedicalRecord medicalRecord = patient.medicalRecord;
//        patient.createMedicalRecord("M123", "coma, heart attack","Peanuts, Shellfish, Pollen", "Flu Shot, Corona shot","PCR, Blood Type","Heart Surgery, Knee Surgery");
//        System.out.print(patient.getMedicalRecord());
//        Admin.storeInFile("medicalRecord.dat",patient.getMedicalRecord());
//        System.out.println(Admin.loadAll("medicalRecord.dat",MedicalRecord.class));
//        
//        patient.storeMedicalRecord();
//        System.out.print(patient.getMedicalRecord().getAllergies());
//
//        Person.login("doctors.dat",Doctor.class, " r@g.com", "2");   
//        doctor.viewPatientRecord(patient);
//
//        admin.storeInFile("pharmacists.dat",pharmacist);
//        admin.login("pharmacists.dat", pharmacist, pharmacist.getEmail(), pharmacist.getPassword());
//
//       
//        LocalDate expirationDate1 = LocalDate.of(2023, 12, 31);
//        Medicine medicine = new Medicine( "Med1", "Medicine name", 100, 55.4, expirationDate1);
//        Medicine medicine2 = new Medicine( "Med2", "Medicine name2", 120, 60.4, expirationDate1);
//        
//
//        pharmacist.storeMedicine("medicine.dat",medicine);
//        pharmacist.storeMedicine("medicine.dat",medicine2);
//        System.out.print(pharmacist.getAllMedicine("medicine.dat", medicine));
//        
//        Doctor writes a prescription
//        HashMap<String, String> medicationsAndDurationsDoctor = new HashMap<>();
//        medicationsAndDurationsDoctor.put("jkb", "7 days");
//        medicationsAndDurationsDoctor.put("jbk", "10 days");
//        Prescription prescription = new Prescription("Presc123","uyvjh",medicationsAndDurationsDoctor);
////        
//        doctor.writePrescription(prescription, medicationsAndDurationsDoctor);
//        doctor.storePrescription(prescription); 
//        
//
//        System.out.print(prescription.calculateTotal());
//        
//       
//        admin.storeNurse(nurse);
//        admin.login("nurses.dat", nurse.getEmail(), nurse.getPassword());
//        HashMap<String, String> medicationsAndDurationsNurse = new HashMap<>();
//        medicationsAndDurationsNurse.put(medicine.getItemName(), "14 days");
//        nurse.writePrescription(prescription, medicationsAndDurationsNurse);
//        doctor.storePrescription(prescription);
//        patient.getPrescription();
//        
//        Payment payment = new Payment(2,16,new Date(),50);
//
//        Appointment appointment = new Appointment(125, new Date(), doctor, nurse, patient, payment, prescription);
//        room.setAssignedAppointment(appointment);
//        appointment.assignRoom(room);
//        Admin.storeInFile("appointments.dat", appointment);
//        
//        Date newAppointmentDateTime = new Date(System.currentTimeMillis() + 3600000);
//        appointment.reschedule(newAppointmentDateTime);
//
//        Feedback feedback = new Feedback(61, new Date(), "4 stars");
//        feedback.storeFeedback(appointment);
//        
//         List<Feedback> retrievedFeedbackList = Feedback.loadAllFeedbacks(appointment.getAppointmentID());
//        if (retrievedFeedbackList != null) {
//           System.out.println("All Feedback " + ":");
//            for (Feedback retrievedFeedback : retrievedFeedbackList) {
//               System.out.println(retrievedFeedback);
//            }
//        }
//        LocalDate carExpirationDate = LocalDate.of(2024, 6,1);
//        CreditCard creditCard = new CreditCard(1234567890, "John Doe", carExpirationDate, 123, payment.getPaymentId(), payment.getPatientId() , payment.getPaymentDate(), payment.getAmount());
//
//        // Process payment with CreditCard
//        payment.processPayment(appointment, creditCard);
//
//        // Process payment with Cash
//
//        Cash cash = new Cash(50.0, payment.getPaymentId(), payment.getPatientId() , payment.getPaymentDate(), payment.getAmount() );
//
//        // Process payment with Cash
//        payment.processPayment(appointment, cash);

    }
}