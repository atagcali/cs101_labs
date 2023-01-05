
import java.util.Arrays;
/*author : Alp tuðrul Aðçalý
 *section : 02
 */


public class BigNum 
{
   // properties
   public static final int SIZE = 4;
   public static final int BASE = 10;
   int[] numbers = new int[SIZE];
   int number;
   int digit;

   // constructors
   public BigNum()
   {
      for( int i = 0; i < numbers.length; i++)
      {
         numbers[i] = 0;
      }
   }
   
   public BigNum( String num)
   {
      int count;
      count = 0;
      
      number = Integer.parseInt( num);
      
      for( int i = 0; i < numbers.length; i++)
      {
         numbers[i] = 0;
      }
      
      while( number > 0)
      {
         digit = number % 10;
         numbers[count] = digit;
         number = number / 10;
         count++;
      }
   }
   
   public BigNum( BigNum other)
   {
      numbers = other.numbers;
   }
   
   // methods
   public String toString()
   {
      String numberStr = "";
      String start = "[";
      String end = "]";

      for ( int i = 0; i <= numbers.length - 1; i++)
      {
         if ( i == 0)
         {
            numberStr = numberStr + numbers[i];
         }
         else
         {
            numberStr = numberStr + ", " + numbers[i];
         }
      }

      return start + numberStr + end;
   }
   
   public boolean equals( BigNum other)
   {
      boolean check;
      check = true;
      
      for( int i = 0; i < numbers.length; i++)
      {
         if( numbers[i] != other.numbers[i])
         {
            check = false;
         }
      }
      return check;
   }
   
   public boolean isZero()
   {
      boolean check;
      check = true;
      
      for( int i = 0; i < numbers.length; i++)
      {
         if( numbers[i] != 0)
         {
            check = false;
         }
      }
      return check;
   }
   
   public void shift( boolean left)
   {
      if( left)
      {
         for ( int i = SIZE - 1; i > 0; i--)
         {
            numbers[i] = numbers[i - 1];
         }
         numbers[0] = 0;
      }
      else
      {
         for ( int i = 0; i < SIZE - 1; i++)
         {
            numbers[i] = numbers[i + 1];
         }
         numbers[SIZE - 1] = 0;
      }
   }

   public int add( BigNum other)
   {
      int overflow;
      overflow = 0;
      
       for( int i = 0; i < SIZE; i++)
       {
          if( ( other.numbers[i] + numbers[i] + overflow) >= BASE)
          {
             numbers[i] = other.numbers[i] + numbers[i] + overflow - BASE;
             overflow = 1;
          }
          else 
          {
             numbers[i] = other.numbers[i] + numbers[i] + overflow;
          }
          System.out.println( "The result is " + Arrays.toString( numbers));
          System.out.println( "The overflow is " + overflow);
       }
       return overflow;
   }
   
    public boolean isLessThan( BigNum other)
   {
      for (int i = SIZE - 1; i >= 0; i--)
      {
         if ( other.numbers[ i] > numbers[ i])
         {
            return true;
         }
         else if ( other.numbers[ i] <= numbers[ i])
         {
            return false;
         }
       }
       return false;
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}