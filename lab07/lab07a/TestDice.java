
public class TestDice
{
   public static void main( String[] args)
   {
      // constants

      // variables
      Dice myDice;
      Die die1;
      Die die2;

      // program code
      die1 = new Die();
      die2 = new Die();
      
      myDice = new Dice( die1, die2);
      
      System.out.println( myDice.rollBoth());
      System.out.println( myDice.getDie1FaceValue());
      System.out.println( myDice.getDie2FaceValue());
      System.out.println( myDice.getDiceTotal());    
      System.out.println( myDice.toString());  
   }
}
