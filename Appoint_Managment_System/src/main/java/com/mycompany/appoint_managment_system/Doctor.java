
package com.mycompany.appoint_managment_system;

/**
 *
 * @author Kawser
 */
import java.util.PriorityQueue;

public class Doctor extends Person {
    private String specialization;
    private PriorityQueue<Appointment> appointmentQueue;

    public Doctor(String name, int uniqueID, String specialization) {
        super(name, uniqueID);
        this.specialization = specialization;
        this.appointmentQueue = new PriorityQueue<>();
    }

    public boolean isAvailableAt(String dateTime) {
        for (Appointment appt : appointmentQueue) {
            if (appt.getDateTime().equals(dateTime)) {
                return false; 
            }
        }
        return true;
    }

    public void addAppointment(Appointment appt) {
        appointmentQueue.add(appt);
    }

    public void displayAppointments() {
        if (appointmentQueue.isEmpty()) {
            System.out.println("No appointments scheduled.");
        } else {
            for (Appointment appt : appointmentQueue) {
                appt.displayAppointmentDetails();
            }
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Doctor ID: " + uniqueID + " | Name: " + name + " | Specialization: " + specialization);
    }
}
