/*author: Alp Tuðrul Aðçalý
 * section:02
 */
import lab08.*;
import java.util.Scanner;
public class LibraryTest {
  public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      int choice;
      int selection;
      Librarybook b1;
      String title;
      String author;
      Library library; 
      //program code
        library = new Library();
      
      System.out.println( "Welcome to the library!");
      
      do
      {
         System.out.println( "Please select!");
         System.out.println( "1. Show");
         System.out.println( "2. Find");
         System.out.println( "3. Add");
         System.out.println( "4. Exit");
         
         choice = scan.nextInt();
         
         if( choice == 1)
         {
             System.out.println( library.toString());
         }
         else if( choice == 2)
         {
            if( library.isEmpty())
            { 
               System.out.println( "Library is empty!");
            }
            else
            {
               System.out.println( "Enter book title:");
               scan = new Scanner( System.in);
               title = scan.nextLine();
               b1 = library.findByTitle( title);
               System.out.println( b1);
               do
               {
                  System.out.println( "Please select!");
                  System.out.println( "1. Loan");
                  System.out.println( "2. Return");
                  System.out.println( "3. Remove");
                  System.out.println( "4. Return to the main menu");
                  selection = scan.nextInt();
               
                  if( selection == 1)
                  {
                     b1.loan( "23.04.2020");
                  }
                  else if( selection == 2)
                  {
                     b1.returnBook();
                  }
                  else if( selection == 3)
                  {
                    if ( library.remove( b1) )
                      System.out.println( b1 + " is removed!");
                  }
              }   
              while( selection != 4);
           }
        }
        else if( choice == 3)
        {
            System.out.println( "Enter book title:");
            scan = new Scanner( System.in);
            title = scan.nextLine();
            System.out.println( "Enter book author:");
            author = scan.nextLine();
            b1 = library.add( title, author);
         }
      }
      while( choice != 4);
         
      System.out.println( "Have a nice day!");
   }
}         
  
