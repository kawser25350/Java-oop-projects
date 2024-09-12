package com.mycompany.appoint_managment_system;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kawser
 */
public class Appointment implements Comparable<Appointment> {
    private static int appointmentIDCounter = 1;
    private int appointmentID;
    private String dateTime;
    private Patient patient;
    private Doctor doctor;

    public Appointment(Patient patient, Doctor doctor, String dateTime) {
        this.appointmentID = appointmentIDCounter++;
        this.patient = patient;
        this.doctor = doctor;
        this.dateTime = dateTime;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void displayAppointmentDetails() {
        System.out.println("Appointment serial: " + appointmentID + " | Doctor: " + doctor.name + " | Time: " + dateTime);
    }

    @Override
    public int compareTo(Appointment other) {
        return this.dateTime.compareTo(other.dateTime);
    }
}
