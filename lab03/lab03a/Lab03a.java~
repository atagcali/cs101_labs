import java.util.Scanner;
public class Lab03a {
  public static void main(String[] args) {
     Scanner scan = new Scanner( System.in);
    int n ;
    int sum;
    sum = 0;
    int sum2 = 0;
    int  countEven = 0;
    int  countOdd = 0;
      System.out.println(" enter a n value");
           n = scan.nextInt();
      for ( int x = 0; x <= 50; x++ )
{          System.out.println(" x= " + x ); 
      // your code goes here
      if ( x >= 25 || x <= 12)
      {
          System.out.println(" out of range 12-25 ");  
      }
      if ( x % 2 ==0)
      {
         countEven = countEven + 1; 
         
      }
      else
      {
          countOdd = countOdd + 1; 
          ;
      }
      if ( x % 5 == 0)
      {
          System.out.println( " Hi Five " );
      }   
      else if ( x % 2 == 0) 
      {
          System.out.println( "Hi Two ");
      }   
      else if ( x % 3 == 0 || x % 7 == 0)
      {
          System.out.println(" Hi ThreeOrSeven ");
      }
      else  
      {
          System.out.println(" Hi Others! ");
      } 
      if (x <= n)
      {
         sum= sum + x;
        
      }
      
               
}
     sum2 = n*(n+1)/2; 
     System.out.println(" sum2 = " + sum2);
     if (sum == sum2)
     {  
        System.out.println(" sum2 = " + sum2);   
        System.out.println(" sum = " + sum);   
        System.out.println("they are same");
        System.out.println(" number of the even number " +countEven);
        System.out.println(" number of the odd number " +countOdd);  
     }   
       
  }
}