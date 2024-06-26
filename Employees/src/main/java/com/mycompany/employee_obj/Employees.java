/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employee_obj;

/**
 *
 * @author kawser ahmmed
 */
public class Employees {
    
    public static void show(Object obj)
    {
        System.out.println(obj);
        
    }

    public static void main(String[] args) {
        
        Employe.setCompanyname("Royal Plaza");
        Employe.setCompanyaddress("Dhaka metro city");
     
        Employe ep1=new Employe("kawser Ahmmed",23,"Manager",56500);
        
        ep1.display();
        show("\n");
        
        Employe ep2=new Employe("Ahmmed",24,"General manager",80900);
       
        ep2.display();
        
        Employe.totalemployee();
        
    }
}
