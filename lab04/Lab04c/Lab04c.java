import java.util.Scanner;
public class Lab04c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);


      int valuesRead;
      int inputValue;
      int sum;
      int min;
      int max;
      

      System.out.println( "Enter the values:");
      
      valuesRead = 0;
      sum = 0;
      min = 2000000000;
      max = -2000000000;
      
      while ( valuesRead < 2000000) {
        inputValue = scan.nextInt();
        
        if ( inputValue >= 0) {
        
        
          if (inputValue < min) {
          min = inputValue;
          }
        
          if (inputValue > max) {
          max = inputValue;
          }
        sum = sum + inputValue;
        valuesRead++;
        }
        else {
          break;
        }

      }
      
      System.out.println( "Final average is " + (sum / valuesRead));
      System.out.println( "Maximum of the given values is  " + max);
      System.out.println( "Minimum of the given values is  " + min);
      
        
      

   }

}