import java.util.Scanner;
import java.nio.file.*;  
import java.io.*;


/**
 * __program description___ 
 * @author __your name___
 * @version __date__
 */ 
public class Lab03c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants
    final String Doctype = "<!DOCTYPE html>";
    final String  Html =  "<html>";
    final String  Title =  "<title>";
    final String  HomePage = "'s Home Page</title>";
    final String Head =  "/head";
    final String  Body = "body";
    final String  Hr = "<hr>";
    final String  Hl = "<h1>";
    final String  Page =  "<p>Age: ";
    final String P =  "</p>";  
    final String Psalary = "<p>Salary: ";
    final String Pcomment = "<p>Comments: ";
    final String pp = "!</p>";
    final String img = "<img src=\"";
    final String jpg = ".jpg\""  ;
  
    final String Body2 =  "</body>";
    final String html2 = "</html>";
       
      // variables
       double netSalary1 ;
       double netSalary ;
       int taxRate ;
       String name = scan.nextLine();
       int age = scan.nextInt();
       double salary = scan.nextInt();
       scan.nextLine(); // to read the new line end of the integer
       String comment = scan.nextLine();  
      
      // program code
       netSalary1 = salary-100;
       netSalary = 0;
       taxRate = 0;
      if (salary > 1000 && salary < 5000)
      {
         taxRate = 15;
         netSalary = netSalary1 * 0.85 ;
      }
      else if ( salary < 10000)
      {   
         taxRate = 5;
         netSalary= netSalary1 * 0.95;
      }  
      else if ( salary > 5000)
      {
         taxRate = 25;
         netSalary= netSalary1 * 0.75;
      }    
           
      if ( salary <0 || age < 0 )
      {
         System.out.println("please enter positive numbers");
      }
      else
      {  
     System.out.println(Doctype);
     System.out.println();
     System.out.println(Html);
     System.out.println();
     System.out.println(Title+name+HomePage);
     System.out.println(Head);
     System.out.println();
     System.out.println(Body);
     System.out.println();
     System.out.println( Hr);
     if (Files.exists( Paths.get( name + ".jpg" ) ) )
     { 
     System.out.println( img + name + jpg);
     }
     System.out.println( Hl+ name + Hl);
     System.out.println( Page+ age +P);
     System.out.println(Psalary+ netSalary + " " + "( %" + taxRate + ")" + P);
     System.out.println(Pcomment+ comment + pp);
     System.out.println(pp);
     System.out.println();
     System.out.println(Body2);
     System.out.println();
     System.out.println(html2);
      }


      
   }

} // end class
