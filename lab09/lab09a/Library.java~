/*author : Alp tuðrul Aðçalý
 *section : 02
 */
package lab08;
public class Library {
  
   // properties
   Librarybook b1;
   Librarybook b2;
   Librarybook b3;
   Librarybook b4;

   // constructors
   public Library()
   {
      b1 = null;
      b2 = null;
      b3 = null;
      b4 = null;
   }
   // methods
      public boolean isEmpty()
   {
      if( b1 == null && b2 == null &&  b3 == null && b4 == null)
      {
        return true;
      }
      else 
         return false;
   }
 
    public String toString()
   {
     if( b1 == null && b2 == null && b3 == null && b4 == null)
     {
       return "The library is empty";
     }
     else
     {
      if( b1 != null)
         return "Title: " + b1.title + " - Author: " + b1.author;
      if( b2 != null)
         return "Title: " + b2.title + " - Author: " + b2.author;
      if( b3 != null)
         return "Title: " + b3.title + " - Author: " + b3.author;
      else
         return "Title: " + b4.title + " - Author: " + b4.author;
     }
   }
    public Librarybook add( String title, String author)
   {
      if( b1 == null)
      {
         b1 = new Librarybook( title, author);
         System.out.println( b1 + " is added.");
         return b1;
      }
      else if( b2 != null)
      {
         b2 = new Librarybook( title, author);
         System.out.println( b2 + " is added.");
         return b2;
      }
      else if( b3 != null)
      {
         b3 = new Librarybook( title, author);
         System.out.println( b3 + " is added.");
         return b3;
      }
      else if( b4 != null)
      {
         b4 = new Librarybook( title, author);
         System.out.println( b4 + " is added.");
         return b4;
      }
      return null;
   }
    public boolean remove( Librarybook book)
   {
      if( book != null)
      {
        if( book.equals( b1))
        {
         b1 = null;
         return true;
        }
        else if( book.equals( b2))
        {
         b2 = null;
         return true;
        }
        else if( book.equals( b3))
        {
         b3 = null;
         return true;
        }
        else
        {
         b4 = null;
         return true;
        }
      }
      else
        return false;
   }
    public Librarybook findByTitle( String title)
   {
     if( b1 == null && b2 == null && b3 == null && b4 == null)
     {
       System.out.println( "The library is empty!");
       return null;
     }
     else
     {
       if ( b1.title.equals(title))
         return b1;
       else if ( b2.title.equals(title))
         return b2;
       else if ( b3.title == title)
         return b3;
       else if ( b4.title == title)
         return b4;
       else 
         return null;
    }   
   }
    
}

