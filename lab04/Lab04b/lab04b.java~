import java.util.Scanner;
public class lab04b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      
      final int n = 100;

      
      int valuesRead;
      int inputValue;
      int sum;
      int min;
      int max;

      System.out.println( "Enter 100 values:");
      
      valuesRead = 1;
      sum = 0;
      min = 2000000000;
      max = -2000000000;
      
      while ( valuesRead <= n) {
        inputValue = scan.nextInt();
        
        if (inputValue < min) {
          min = inputValue;
        }
        
        if (inputValue > max) {
          max = inputValue;
        }
        
        sum = sum + inputValue;
        valuesRead++;
      }
      
      System.out.println( "Final sum is " + sum);
      System.out.println( "Final average is " + (sum / n));
      System.out.println( "Maximum of the given values is  " + max);
      System.out.println( "Minimum of the given values is  " + min);
      
        
      

   }

}