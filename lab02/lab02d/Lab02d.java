import java.util.Scanner;

/**
 * __program description___ 
 * @author __your name___
 * @version __date__
 */ 
public class Lab02d
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
       // variables
      System.out.println("side a?");
      double a =scan.nextInt(); 
            System.out.println("side b?");
      double b = scan.nextInt(); 
            System.out.println("side c?");
      double c = scan.nextInt(); 
      // constants
      
      double s = a/2+b/2+c/2
   ;
      // program code
      double area =  Math.sqrt(s*(s-a)*(s-b)*(s-c));
     
        System.out.println("area is " + area);
        int flowerAmount = 17 *(int) area;
        System.out.println("amount of flower is " + flowerAmount);   
   }

} // end class
