import java.util.Scanner;


public class Lab06{
   
   //This is a brief description of the method power

 
   public static double power( double x, int y)
   {  
      int i;
      double z;
      z = 1;
      for ( i = 0 ; i <y ; i++){
         z = z * x;
      }
      {
      return z;  
      }
    }
   //this is a brief description of the method  factorial
 
   public static int factorial ( int n ) {
      int a;
      int b;
      int c;
      b = 1;
      c = n;
      for ( a = 0 ; a < n ; a++){
         
         b = b * c;
         c--;
         
      }
      {
         return b;
      }      
   }
   //this is a brief description of method reverse
   
   public static String reverse( String s){
      int a;
      int b;
      char c;
      int d;
      String e;
      e = "";
      d = s.length() - 1;
      for ( a = 0 ; a < s.length() ; a++){
         c = s.charAt(d);
         e = e + String.valueOf(c);         
         d--;
      }
      {
      return e;
      }
   } 
   //this is a brief description of method base2
   
   public static int toDecimal( String base2){
     int a;
     int b;
     char c;
     int d;
     d = 0;
     int power;
     a  = base2.length() - 1;
     for ( b = 0 ; b < base2.length() ; b++ ){
        c = base2.charAt(a);
        power = 1;
        int x;
        for ( x = 0 ; x < b ; x++){
           power = power *2; 
        }      
        
        d = d + ((Character.getNumericValue(c)) * power);
        a--;
    }
    {
        return d;
     }
  }
   //this is a brief description of method base10
   
     public static String toBinary( int decimal)
   {
     int a;
     String b;
     b = "";
     while ( decimal != 1)
     {
       a = decimal % 2;
       b = b + String.valueOf( a);
       decimal = decimal / 2;
     }
     b = b + "1";
     b = reverse( b);
     
     return b;
   }
     //this is a brief description of method  Sin(x) 
   public static double sinx( double x)
   {
      x = Math.toRadians( x);
     int count;
     int denominator;
     double term;
     term = x;
     denominator = 1;
     for( count = 0; count <= 10; count++)
     {
       term = term + (term * -1 * power( x, 2) / (( denominator + 1) * ( denominator + 2)));
       denominator = denominator + 2;
     }
     return term;
   }
     
     
     
     
     
  public static void main(String[] args) {
     Scanner scan = new Scanner( System.in);
     int total;
     int n;
     String a;
     String b;
     String c;
     String d;
     int e;
     String f;
     String g;
     String h;
     String i;
     double j;
     double k;
     String l;
     int m;
     String o;
     int count2;
     double wha;
   //task1
     for ( n = -1 ; n <= 10 ; n++){
        
        
        a = Double.toString(power(n,1));  
        while ( a.length() < 8 ) {
          a = a + " ";
        }  
          System.out.print(a);
        
        b = Double.toString(power(n,2));  
        while ( b.length() < 8 ) {
          b = b + " ";
        } 
           System.out.print(b);
       
        c = Double.toString(power(n,3));  
        while ( c.length() < 8 ) {
          c = c + " ";
        }  
           System.out.print(c);
        
        d = Double.toString(power(n,4));
        while ( d.length() < 8 ) {
           d = d + " ";
        }  
         System.out.print(d);
        System.out.println();
        System.out.println();
        
        
     }
   // task 2
       for ( e = 1 ; e < 15 ; e++){
        System.out.println(factorial(e));
     }
   // task 3
       f = scan.next();
       g = scan.next();
       total = toDecimal(f) + toDecimal(g);
       System.out.println();
       System.out.println( "Sum = " + toBinary( total));
      
      System.out.println();
      System.out.println();
       
   // task 4
       System.out.println("please enter a sentence");
       scan.nextLine();
       i = scan.nextLine(); 
        
        String[] output = i.split(" ");
        String sonuc = "";
        for ( m = 0 ; m < output.length ; m++){
         //System.out.println(output[m]);
         sonuc += reverse(output[m] + " ");

        }
        System.out.println(sonuc);
        
    // Task 5 
       System.out.println( "Sin(x) Calculator");
      
      System.out.println( "Enter x:");
      j = scan.nextDouble();
      j = Math.toRadians( j);
      
      wha = 0;
      for( count2 = 0; count2 <= 10; count2++)
      {
         wha = wha + power( -1, count2) * power( j, ( 2 * count2 + 1)) / factorial( 2 * count2 + 1); 
         System.out.println( count2 + "   " + power( -1, count2) + "   " + power( j, ( 2 * count2 + 1)) + "   " + factorial( 2 * count2 + 1) + "   " + wha);
      }
      System.out.println();
      System.out.println();
      
      // Task 6
      System.out.println( "Sin(x) Comparison");
      
      System.out.println( "Enter x for sin(x) calculation");
      k = scan.nextDouble();
      System.out.println( "Sin(x) value with method is " + sinx( k));
      
      k = Math.toRadians( k);
      System.out.println( "Sin(x) value with java method is " + Math.sin(k));
       
       
         
       
   }  
    /*public static void main(String[] args) {
    System.out.println(reverse("abcd"));
  }*/
}   
  