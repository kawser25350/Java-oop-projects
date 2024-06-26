/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employee_obj;

/**
 *
 * @author kawser ahmmed
 */
public class Employe {
    private String name;
    private int age;
    private String designation;
    private double salary;
    
    private static String companyname;
    private static String companyaddress;
    private static int totalemplye;

    public Employe(String name, int age, String designation, double salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
        totalemplye++;
    }

     public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void setCompanyname(String companyname) {
        Employe.companyname = companyname;
    }

    public static void setCompanyaddress(String companyaddress) {
        Employe.companyaddress = companyaddress;
    }

    public static int getTotalemplye() {
        return totalemplye;
    }
   
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public static String getCompanyname() {
        return companyname;
    }

    public static String getCompanyaddress() {
        return companyaddress;
    }

  
   public void display()
    {
        out.showln("companyName: "+companyname);
        out.showln("companyAdress: "+companyaddress);
        out.showln(toString());
       
    }
    public static void totalemployee()
    {
        out.show("Total Employee: ");
        out.showln(Employe.totalemplye);
    }

    @Override
    public String toString() {
        return "Employe:- " + "name=" + name + ", age=" + age + ", designation=" + designation + ", salary=" + salary;
    }
    
    
   
    
    
}
