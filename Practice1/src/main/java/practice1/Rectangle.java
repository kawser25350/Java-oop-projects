
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
    void display()
    {
        System.out.println("length :"+length);
        System.out.println("width :"+width);
        
    }
 
}
