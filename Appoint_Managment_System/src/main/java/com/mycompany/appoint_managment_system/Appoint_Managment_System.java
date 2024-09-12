/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.appoint_managment_system;
import java.util.*;
/**
 *
 * @author Kawser
 */
public class Appoint_Managment_System {

   
    public static void main(String[] args) {
        AppointmentManager appointmentManager = new AppointmentManager();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("------------------------------");
            System.out.println("Appointment Management System. |");
             System.out.println("------------------------------");
            System.out.println("1. Fix an appointment(AUTO REG)");
            System.out.println("2. Watch your previous appointments");
            System.out.println("3. Watch doctor's list and their details");
            System.out.println("4. Log in as a doctor(use doctor ID)");
            System.out.println("5. Exit");
            System.out.print("Choose -> ");
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                      System.out.println();
                    appointmentManager.fixAppointment();
                    System.out.println();
                    break;
                case 2:
                      System.out.println();
                    appointmentManager.viewPreviousAppointments();
                    System.out.println();
                    break;
                case 3:
                      System.out.println();
                    appointmentManager.viewDoctorDetails();
                    System.out.println();
                    break;
                case 4:
                      System.out.println();
                    appointmentManager.doctorLogin();
                    System.out.println();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}