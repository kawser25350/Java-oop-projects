/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appoint_managment_system;

/**
 *
 * @author Kawser
 */
import java.util.ArrayList;
import java.util.Scanner;

public class AppointmentManager {
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;
    private int patientCounter;

    public AppointmentManager() {
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
        this.patientCounter = 0;
        
       
       addDoctor(new Doctor("Dr. Jihad", 1, "Cardiology"));
    addDoctor(new Doctor("Dr. Sanaullah", 2, "Dermatology"));
    addDoctor(new Doctor("Dr. Thompson", 3, "Neurology"));
    addDoctor(new Doctor("Dr. Fernandez", 4, "Pediatrics"));
    addDoctor(new Doctor("Dr. O'Neil", 5, "Orthopedics"));
    addDoctor(new Doctor("Dr. Gupta", 6, "Ophthalmology"));
    addDoctor(new Doctor("Dr. Chang", 7, "Gastroenterology"));
    addDoctor(new Doctor("Dr. Rivera", 8, "Psychiatry"));
    addDoctor(new Doctor("Dr. Park", 9, "Endocrinology"));
    addDoctor(new Doctor("Dr. Murthy", 10, "Oncology"));
    addDoctor(new Doctor("Dr. Bianchi", 11, "Pulmonology"));
    addDoctor(new Doctor("Dr. Schneider", 12, "Rheumatology"));
    addDoctor(new Doctor("Dr. Dubois", 13, "Nephrology"));
    addDoctor(new Doctor("Dr. Okafor", 14, "Urology"));
    addDoctor(new Doctor("Dr. Mäkinen", 15, "Geriatrics"));
    addDoctor(new Doctor("Dr. Kovács", 16, "Anesthesiology"));
    addDoctor(new Doctor("Dr. Silva", 17, "Radiology"));
    addDoctor(new Doctor("Dr. Rossi", 18, "Dermatology"));
    addDoctor(new Doctor("Dr. Singh", 19, "Plastic Surgery"));
    addDoctor(new Doctor("Dr. Yamamoto", 20, "Emergency Medicine"));
      
    }

    public void addDoctor(Doctor doc) {
        doctors.add(doc);
    }

    public void fixAppointment() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter patient name: ");
        String name = scanner.nextLine();
        int patientID = ++patientCounter;
        Patient patient = new Patient(name, patientID);
        patients.add(patient);
        System.out.println();
        System.out.println("All Doctor's list from diffrent  specializations:");

        System.out.println("Doctor List:");
        for (Doctor doc : doctors) {
            doc.displayDetails();
        }
         System.out.println("--------------------------------------------------------------------------------------");

        System.out.print("Enter Doctor ID: ");
        int doctorID = scanner.nextInt();
        Doctor selectedDoctor = doctors.get(doctorID - 1);

        System.out.print("Enter appointment date and time (e.g., 2024-09-10 12:00): ");
        String dateTime = scanner.next();

        patient.fixAppointment(selectedDoctor, dateTime);
        System.out.println();
        
        System.out.println("*********Your paitent ID: "+patientID+" (remember your paitient ID to see appointment list ******"); 
        
    }

   public void viewPreviousAppointments() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your patient ID: ");
    int patientID = scanner.nextInt();

    // Check if the patientID is within the valid range of indices for the patients list
    if (patientID > 0 && patientID <= patients.size()) {
        // Adjust index to be zero-based
        Patient patient = patients.get(patientID - 1);
        patient.viewAppointments();
    } else {
        System.out.println("Invalid patient ID.");
    }
}


    public void viewDoctorDetails() {
        for (Doctor doc : doctors) {
            doc.displayDetails();
        }
    }

    public void doctorLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Doctor ID: ");
        int doctorID = scanner.nextInt();
        Doctor doctor = doctors.get(doctorID - 1);
        doctor.displayAppointments();
    }
}
