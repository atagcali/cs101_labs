public class LibrarybookTest{
  public static void main (String[]args){
     //Variables
    Librarybook book1;
    //Librarybook book2;
     //Program code
    book1 = new Librarybook("a","b","",0);
    
    book1.loan("11.11.2121");
    book1.returnBook();
    book1.loan("11.11.2221");
    book1.loan("11.11.2223");
    
    System.out.println( book1 );
    System.out.println( book1.onLoan() );
    System.out.println( book1.getTimesLoaned() );
    
  }
}