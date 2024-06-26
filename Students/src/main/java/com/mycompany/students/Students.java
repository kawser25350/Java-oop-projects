/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.students;

/**
 *
 * @author kawser ahmmed
 */
public class Students {

    public static void main(String[] args) {
        Student.setUniversity("Ulab internation university");
      Student s1=new Student("231014036","kawser Ahmmed","CSE",3.50);
      s1.display();
      out.showln('\n');
       Student s2=new Student("231014033","Ahmmed","CSE",3.90);
      s2.display();
      
     Student.totalstudents();
    }
}
