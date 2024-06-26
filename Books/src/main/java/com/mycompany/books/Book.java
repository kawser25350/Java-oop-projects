/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.books;

/**
 *
 * @author kawser ahmmed
 */
public class Book {
    private String title,author,year;
    private static String genre;
    private static int totalbooks;

    public Book(String title, String author, String year) {
        this.title = title;
        this.author = author;
        this.year = year;
        totalbooks++;
    }
     public Book() {
       totalbooks++;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public static void setGenre(String genre) {
        Book.genre = genre;
    }

    public static int getTotalbooks() {
        return totalbooks;
    }

    

    

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

  

    void show(Object obj)
    {
        System.out.println(obj);
    }
    
    public static void totalbooks()
    {
        out.show("Total Books: ");
        out.showln(Book.totalbooks);
    }
  void display()
  {
      show(toString());
  }

    @Override
    public String toString() {
        return "Book:- " + "title=" + title + ", author=" + author + ", year=" + year + ", genre=" + genre ;
    }
  
    
    
    
}
