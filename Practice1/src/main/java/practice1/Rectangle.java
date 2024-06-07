/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice1;


public class Rectangle {
    
   private double length,width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public Rectangle()
    {
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

   
    
    void perimeter()
    {
        System.out.println("Perimeter of Rectangle is: "+(2*(length+width)));
 
    }
    
    void area()
    {
         System.out.println("Area of Rectangle is: "+(length*width));
    }
 
    
}
