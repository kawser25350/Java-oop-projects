/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.students;

/**
 *
 * @author kawser ahmmed
 */
public class Student {
    private String id,name,department;
    private double cgpa;
    
    private static String university;
    private static int totalstudents;

    public Student(String id, String name, String department, double cgpa) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
        totalstudents++;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public static void setUniversity(String university) {
        Student.university = university;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getCgpa() {
        return cgpa;
    }

    public static String getUniversity() {
        return university;
    }

    public static int getTotalstudents() {
        return totalstudents;
    }

    public void display()
    {
        out.showln("University: "+university);
        out.showln(toString());
    }
    
    public static void totalstudents()
    {
        out.show("Total Students: ");
        out.showln(Student.totalstudents);
    }
    @Override
    public String toString() {
        return "Student:-" + "id=" + id + ", name=" + name + ", department=" + department + ", cgpa=" + cgpa;
    }
    
    
    
    
}
