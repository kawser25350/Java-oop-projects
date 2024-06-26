/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.books;

/**
 *
 * @author kawser ahmmed
 */
public class Books {

   
    public static void main(String[] args) {
        Book.setGenre("Fictonal");
        Book b1=new Book("The Hell","riched thomas","2013");
        b1.display();
        out.showln("\n");
        Book b2=new Book("The sky","grace","2018");
        b2.display();
        
     Book.totalbooks();
    }
}
