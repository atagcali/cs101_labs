package lab09a;
import java.util.ArrayList;
/*author : Alp tuðrul Aðçalý
 *section : 02
 */

public class Library {
  
  // properties
  private ArrayList<Librarybook>  book;
  
  // constructors
   public Library() {
     book = new ArrayList<Librarybook>(); 
   }
   
   // methods
   
   public boolean isEmpty() {   
     
        if( book.size() == 0)
        {
          return true;
        }
        else
           return false;       
   }
   
    
    public String toString() {
      String res;
      res="";
       if( book.size() == 0) {
           return "The library is empty";
         }
       else {
             for ( int n = 0 ; n < book.size() ; n++) {
                 res= res+ "Title: " + book.get(n).title + " - Author: " + book.get(n).author + "\n";
             }
       }
       return res;
    }
   
   public Librarybook add( String title, String author) {
      
      book.add(new Librarybook( title, author));
      System.out.println("Book with title " + title + " is added.");
      return book.get(book.size() - 1);
   }
   
   public boolean remove( Librarybook b) {
     for (int i = 0; i < book.size(); i++) {
       if (book.get(i).equals(b.title))
         book.set(i, null);
         return true;
     }
     return false;
    }
  
   
    public Librarybook findByTitle( String t) {
      for ( int n = 0 ; n < book.size() ; n++) {
          if ( book.get(n).title.equals(t))
             return book.get(n);
      }
      return null;
          
    }
    public ArrayList<Librarybook> getBook(){
      return book;
    }
}