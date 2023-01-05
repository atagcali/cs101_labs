import java.util.Scanner;

public class Lab05c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

 

      // variables
      double result;
      String selection;
      char operator;
      double value;

      // program code
      System.out.println( "Welcome to \"SimpleCalc\"...");
      result = 0.00;
      value = 0.00;
      
      do
      {
        System.out.println( "------------------");
        System.out.println( "[ " + result + " ]");
        System.out.println( "------------------");
        System.out.println( "+,-,*,/ value");
        System.out.println( "Clear");
        System.out.println( "Quit");
        System.out.println( "------------------");
        System.out.println( "Select:");
        
        selection = scan.nextLine();
        selection.toLowerCase();
        operator = selection.charAt(0);    
        

        if ( operator == '+')
        {
          value = Double.parseDouble( selection.substring( 2, selection.length()));
          result = result + value;
        }
        else if ( operator == '-')
        {
          value = Double.parseDouble( selection.substring( 2, selection.length()));
          result = result - value;
        }
        else if ( operator == '*')
        {
          value = Double.parseDouble( selection.substring( 2, selection.length()));
          result = result * value;
        }
        else if ( operator == '/')
        {
          value = Double.parseDouble( selection.substring( 2, selection.length()));
          result = result / value;
        }
        else if ( selection.toLowerCase().equals("clear") || selection.toLowerCase().equals("c"))
        {
          result = 0.00;
        }  
 
      } while ( !(selection.toLowerCase().equals("quit") || selection.toLowerCase().equals("q")));
  
      System.out.println( "Thanks for using \"SimpleCalc\", goodbye.");


      
   }

}