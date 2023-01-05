/*author : Alp tuðrul Aðçalý
 *section : 02
 */
import lab08.*;
public class LibrarybookTest{
  public static void main (String[]args){
     //Variables
    Librarybook book1;
    Librarybook book2;
    Librarybook book3;
    Librarybook book4;
    boolean a;
    
     //Program code
    book1 = new Librarybook("a","b","",0);
    book2 = new Librarybook("a","b","",0);
    book3 = book1;
    book1.loan("11.11.2121");
    book1.returnBook();
    book1.loan("11.11.2221");
    book1.loan("11.11.2223");
    
    System.out.println( book1 );
    System.out.println( book1.onLoan() );
    System.out.println( book1.getTimesLoaned() );
    a = book1==book2;
    System.out.println( a );
    a = book1.equals(book2);
    System.out.println( a );
    a = book1==book3;
    System.out.println( a );
    a = book1.equals(book3);
    System.out.println( a );
     a = book2==book3;
    System.out.println( a );
    a = book2.equals(book3);
    System.out.println( a ); 
    System.out.println( "book1.hasSameTitle( book2): " + book1.hasSameTitle( book2));
    System.out.println( "book1.hasSameTitle( book3): " + book1.hasSameTitle( book3));  
    System.out.println( "book1.hasSameAuthor( book2): " + book1.hasSameTitle( book2));
    System.out.println( "book1.hasSameAuthor( book3): " + book1.hasSameTitle( book3));
        
  }
}