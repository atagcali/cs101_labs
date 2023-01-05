import java.util.Scanner;

public class lab07a
{
   public static void main( String[] args)
   {
     Scanner scan = new Scanner( System.in);

      // constants

      // variables
      int die1;
      int die2;
      int rolls;
      int count;
      int i;

      // program code
      
      rolls = 1;
      
      die1 = (int) (( Math.random() * 6 ) + 1);
      die2 = (int) (( Math.random() * 6 ) + 1);
      System.out.println( "die1: " + die1);
      System.out.println( "die2: " + die2);
      
      while( die1 != 6 || die2 != 6)
      {
         die1 = (int) (( Math.random() * 6 ) + 1);
         die2 = (int) (( Math.random() * 6 ) + 1);
         System.out.println( "die1: " + die1);
         System.out.println( "die2: " + die2);
         rolls++;
      }
      
      System.out.println( "Number of rolls made is " + rolls);
      System.out.println();
      System.out.println();
      
      //Extended Version
      
      System.out.println( "Enter number of rolls:");
      count = scan.nextInt();
      System.out.println();
      
      for( i = 1; i <= count; i++)
      {
         die1 = (int) (( Math.random() * 6 ) + 1);
         die2 = (int) (( Math.random() * 6 ) + 1);
         System.out.println( "die1: " + die1);
         System.out.println( "die2: " + die2);
         System.out.println();
      }  
   }
}