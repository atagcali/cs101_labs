import java.util.Scanner;
import java.util.Arrays;

/**
 * name: Alp Tu�rul A��al� 
 * section : 2
 */ 
public class lab10a
{
   public static void main(String[] args)
   {
      // variables
      BigNum b1;
      BigNum b2;
      BigNum b3;
      BigNum b4;
      BigNum b5;


      // program code
      
      // create bignums
      b1 = new BigNum();
      b2 = new BigNum( "110");
      b3 = new BigNum( b2);
      b4 = new BigNum( "10");
      b5 = new BigNum( b2);

      //print bignums
      System.out.println( b1);
      System.out.println( b2);
      System.out.println( b3);
      System.out.println();

      //compare bignnums
      System.out.println( "b2.equals(b3): " + b2.equals(b3));
      System.out.println();
     
      System.out.println( "b1.isZero(): " + b1.isZero());
      System.out.println();
     
      System.out.println( "b2.isZero(): " + b2.isZero());
      System.out.println();
     
      System.out.println( "Shifting: ");
      b2.shift( true);
      System.out.println( "while left is true, b2: " + b2);
      b3.shift( false);
      System.out.println( "while left is false, b3: " + b3);
      System.out.println();


      System.out.println(b5.add(b4));
   }
}
