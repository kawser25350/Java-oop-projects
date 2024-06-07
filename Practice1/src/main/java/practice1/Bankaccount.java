/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice1;

import java.awt.BorderLayout;

/**
 *
 * @author kawser ahmmed
 */
public class Bankaccount {
    
   private String name;
   private int accnumber;
   private double balance;
    
   public Bankaccount(String x,int y,double z)
    {
        name=x;
        accnumber=y;
       balance=z;
   }
   
   public Bankaccount()
   {
       
   }
   public void setName(String name)
   {
       this.name=name;
   }
   
   public String getName()
   {
       return name;
   }
   
   public void setAccnumber(int accnumber)
   {
       this.accnumber=accnumber;
   }
   
   public int getAccnumber()
   {
       return accnumber;
       
   }
   
   public void setBalance(double blnc)
   {
    balance=blnc;
   }
   
   public double getBalance()
   {
       return balance;
   }
   
    
    
   public void deposit(double bl)
    {
        balance+=bl;
        System.out.println("Deposit "+bl+" Done.");
        System.out.println("Main Balance is "+balance);
    }
    
   public void withdraw(double bl)
    {
        balance-=bl;
           System.out.println("Withdraw "+bl+" Done.");
           System.out.println("Main Balance is "+balance);
        
    }
   public void display_account()
   {
       System.out.println("\nBankaccount Details: ");
       System.out.println("Name: "+name+"\n"+"account_number: "+accnumber+"\n"+"Balance: "+balance);
   }
    
    
    
}
