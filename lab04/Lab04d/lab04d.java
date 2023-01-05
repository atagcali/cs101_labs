import java.util.Scanner;


public class lab04d
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      
      char ch;
      int width;
      int chPrinted;
      String output;

     
      output = "";
      System.out.println( "Enter a character:");
      ch = scan.next().charAt(0);
      
      System.out.println( "Enter a number:");
      width = scan.nextInt();
      
      chPrinted = 0;
      while ( chPrinted < width) {
        output = output + ch;
        System.out.println(output);
        chPrinted++;
      }
      
      double d;
      d = 0.1;
      while ( d < 1.0 )
      {
        System.out.println( d);
        d = d + 0.1;
      }
      System.out.println( d + " <- final value after loop!");
      
   }
}

