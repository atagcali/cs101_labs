import java.util.Scanner;

/**
 * __program description___ 
 * @author __your name___
 * @version __date__
 */ 
public class Lab03b
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
      if ( (a + b < c) || (b+c < a) || (a+c < b))
      {
        System.out.println("everything is invalid");   
      }  
      else  
      {
        System.out.println(" everything is valid"); 
        double area =  Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("area is " + area);
        int flowerAmount = (int) (17 *area);
        System.out.println("amount of flower is " + flowerAmount);
           
      } 
   }

} // end class