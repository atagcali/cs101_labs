import java.util.Scanner;


public class Lab04a{
  
  public static void main(String[]args){
    
    Scanner scanner = new Scanner(System.in);
    int i;
    int count;
    int print;
     int even;
    double result ;
     
    int n = scanner.nextInt();
    System.out.println("please enter a positive number");
    count = 0;
    i=0;
    if ( n < 0 ){
      System.out.println("the number is unvalid");
    }
    while (i<n){
      System.out.print(i + " ");
      i++;
    }
    i=0;
    while (  n > 0 && i < n){
      if( count%5 == 0 ) {
        System.out.println();
      }
      System.out.print( i + " " );
      i++;
      count++;
    }
    System.out.println();
    i=1;
    while ( i <= n ){
      print = n-i;
      System.out.print(print+ " " );
      i++;
    }
    i = 0 - n;
    even=0;
    System.out.println();
  
    while (i < n) {
      if(i%2==0){
       System.out.print( i + " ");
      }
      i++;
    }
    System.out.println();
    i = 1;
    while (i < n) {
       if( i % 2 == 0){
       System.out.print( i*i+ " ");
       if ( i%5 == 0) {
         System.out.println();
       }
      }
       i++;
       }   
    i = 0;
    while (i < n){
      if (( i % 3 == 0 || i % 4 == 0) && (i % 12 != 0)){
        System.out.print(i + " ");
      }

        if ( i % 12 == 0){  
        System.out.println();
      }
     i++;
     
        
  }
    i = 1;
      while(i <= n){
      if( n % i == 0){
        System.out.print(i + " ");
      }
       i++;                    
      
}  
      System.out.println();
      
      i=1;
        while ( i< n){
        result = 1.0/i;
        if (result > 0.01){
        System.out.print( result + " " );
        }
        i++;
          
}
}
}



            
         

       

    
    
 
