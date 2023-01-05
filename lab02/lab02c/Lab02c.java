import java.util.Scanner;

/**
 * __program description___ 
 * @author __your name___
 * @version __date__
 */ 
public class Lab02c
{
   
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      
      // variables
      System.out.println("variable a?");
      int a = scan.nextInt(); 
      System.out.println("variable b?");
      int b = scan.nextInt();
      // program code
     System.out.println("sum=" + (a+b));
     System.out.println( "difference=" +  (a-b));
     System.out.println("product=" + (a*b));
     System.out.println( "division=" + (a/b));                   

   }

} // end class