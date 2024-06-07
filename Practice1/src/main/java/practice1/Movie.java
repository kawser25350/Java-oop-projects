/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice1;

/**
 *
 * @author kawser ahmmed
 */

public class Movie {
    private String title,genre,leadactor,director,review="GOOD";
    private double rating;
    private int releaseyear;

    public Movie(String title, String genre, String leadactor, String director, double rating, int releaseyear) {
        this.title = title;
        this.genre = genre;
        this.leadactor = leadactor;
        this.director = director;
        this.rating = rating;
        this.releaseyear = releaseyear;
        if(rating<5)
        {
            review="Not Good";
            
        }
    }
    public Movie()
    {
        
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLeadactor() {
        return leadactor;
    }

    public void setLeadactor(String leadactor) {
        this.leadactor = leadactor;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getReview() {
        return review;
    }


    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
        if(rating < 5)
        {
            review="NOT GOOD";
        }
    }

    public int getReleaseyear() {
        return releaseyear;
    }

    public void setReleaseyear(int releaseyear) {
        this.releaseyear = releaseyear;
    }
    
    void display_movie()
    {
        System.out.println("\n\tMovie Details: ");
        System.out.println("Title: "+title+"\nGenre: "+genre+"\nLead Actor: "+leadactor+"\nDirector: "+director+"\nRating: "+rating+"\nReview: "+review);
        
        
    }
   
    
    
}
