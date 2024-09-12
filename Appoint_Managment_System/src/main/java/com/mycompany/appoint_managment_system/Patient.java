package com.mycompany.appoint_managment_system;


/**
 *
 * @author Kawser
 */
import java.util.ArrayList;

public class Patient extends Person {
    private ArrayList<Appointment> appointments;

    public Patient(String name, int uniqueID) {
        super(name, uniqueID);
        this.appointments = new ArrayList<>();
    }

    public void fixAppointment(Doctor doc, String dateTime) {
        if (doc.isAvailableAt(dateTime)) {
            Appointment appointment = new Appointment(this, doc, dateTime);
            doc.addAppointment(appointment);
            appointments.add(appointment);
            System.out.println("Appointment fixed with Doctor " + doc.name + " at " + dateTime);
        } else {
            System.out.println("This time slot is already taken.");
        }
    }

    public void viewAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments.");
        } else {
            for (Appointment appt : appointments) {
                appt.displayAppointmentDetails();
            }
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("Patient ID: " + uniqueID + " | Name: " + name);
    }
}
