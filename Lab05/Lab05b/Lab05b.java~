import java.util.Scanner;

public class Lab05b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      

      // variables
      int row;
      int col;
      String toPrint;
      String multiple;
      String cellNumber;
      String rowNumber;
      String line;
      // program code
      
      System.out.println("please enter row");
      row = scan.nextInt();
      System.out.println("please enter column");
      col = scan.nextInt();
      toPrint = "";
      for (int a = 1 ; a <= row ; a++){
        for (int  b = 1 ; b <= col ; b++) {
          
          toPrint = a + "," + b;
          while (toPrint.length() < 6) {
          toPrint = " " + toPrint ;
          }
          System.out.print(toPrint);
          
          }
        System.out.println(); 
      }
      
      System.out.println(" ");
        multiple = "";
      for (int a = 1 ; a <= row ; a++){
        for (int  b = 1 ; b <= col ; b++) {
          
          multiple = "" + a * b;
          while (multiple.length() < 6) {
          multiple = " " + multiple ;
          }
          System.out.print(multiple);
          
          }
        System.out.println(); 
      }
      
      System.out.println(" ");
      
      cellNumber = "";
    //  for (int a = 1 ; a <= row ; a++){
        for (int  b = 1 ; b <= col * row ; b++) {
          
          cellNumber = b -1  +"";
          while (cellNumber.length() < 6) {
            cellNumber = " " + cellNumber ;
          }
          System.out.print(cellNumber);
          if ( b % col == 0){
            System.out.println();
          }
          
          }
        System.out.println(); 
    //  }
      
      for (int a = 1 ; a <= row ; a++){
       // for (int  b = 1 ; b <= col ; b++) {
          line = "-";
          rowNumber = a + "";
         
          //int rowEnd = rowNumber.length();
          while (  rowNumber.length() < 6-1) {
            rowNumber = " " + rowNumber ;
            //rowEnd++;
          }
          System.out.print(rowNumber + ",");
          for ( int b = 1 ; b <= col ; b++){
             while ( line.length() < 6-1) {
                line = " " + line;
             }      
             
              System.out.print(line + ",");
          }
          
         
        System.out.println(); 
       }
     

   }

} // end class