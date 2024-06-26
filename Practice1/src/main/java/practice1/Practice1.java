/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package practice1;

/**
 *
 * @author kawser ahmmed
 */
public class Practice1 {

    public static void main(String[] args) {
       
        // //creating Bankaccount classses object and operation of deposit,withdraw;
//       Bankaccount ba=new Bankaccount("kawser",2324,4534.0);
//         ba.display_account();
//       ba.setBalance(4500);
//       ba.withdraw(45.8);
//       ba.deposit(34.9);
//       

  //creating rectangle object
//        Rectangle r1=new Rectangle();
//        r1.setLength(45);
//        r1.setWidth(56);
//        r1.display();
//        r1.area();
//        r1.perimeter();
 //creating movie classes object's uinsg constructor and and setter();

              Movie m1=new Movie();

       m1.setTitle("One piece");
       m1.setDirector("eciro oda");
       m1.setGenre("Adventure");
       m1.setLeadactor("Luffy");
       m1.setRating(8.5);
       m1.setReleaseyear(1990);
  m1.display_movie();

       // creating another movie object 
       
       Movie m2=new Movie("Jhon wich","Action","keanu rives","stalen smith",4.5,2016);
       m2.display_movie();
        
    }
}



