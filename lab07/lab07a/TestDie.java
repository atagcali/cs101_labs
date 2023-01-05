
public class TestDie
{
   public static void main( String[] args)
   {
      // constants

      // variables
      Die die1;
      Die die2;

      // program code
      die1 = new Die();
      die2 = new Die();
      
      System.out.println( "die1 value is " + die1);
      System.out.println( "die2 value is " + die2);
      
      // roll and getFaceValue methods
      
      die1.roll();
      System.out.println( "New die1 value is " + die1.getFaceValue());
      
      die2.roll();
      System.out.println( "New die2 value is " + die2.getFaceValue());
   }
}