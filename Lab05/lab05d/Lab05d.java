import java.util.Scanner;

public class lab05d
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      double piTwo;
      double piThree;
      int    x;
      int    r;
      int    repeat;
      double accuracy;
      double loopAccuracy;

      // program code
      
      //First Way
      System.out.println("The value of pi is " + Math.PI);
      
      //Second Way
      x = 0;
      piTwo = 0;
      System.out.println("Choose how many terms to calculate:");
      repeat = scan.nextInt();
      for( r = 1; r <= repeat; r++)
      {
        if ( x % 2 == 0)
        {
           piTwo = piTwo + (4 / (double)(2 * x + 1));
           x++;
        }
        else 
        {
          piTwo = piTwo - (4 / (double)(2 * x + 1));
          x++;
        }
      }
      System.out.println("The value of pi is " + piTwo);
      
      //Third Way
      System.out.println("Choose accuracy");
      accuracy = scan.nextDouble();
      loopAccuracy = 20000000;
      piThree = 0;
      x = 0;
      
      while ( loopAccuracy > accuracy)
      {
          if ( x % 2 == 0)
        {
          piThree = piThree + (4 / (double)(2 * x + 1));
          x++;
        }
        else 
        {
          piThree = piThree - (4 / (double)(2 * x + 1));
          x++;
        }
        
        if ( (Math.PI - piThree) >= 0)
        {
           loopAccuracy = Math.PI - piThree;
        }
        else 
        {
          loopAccuracy = -(Math.PI - piThree);
        }
      }
      System.out.println("The value of pi is " + piThree);
        
      }

   }

