/**
 * Die Methods
 */
public class Die 
{
   // properties
   int faceValue;

   // constructors
   public Die()
   {
     faceValue = roll();
   }
   
   // methods
   
   //rolls a die
   public int roll()
   {
      faceValue = (int) (( Math.random() * 6) + 1);
      return faceValue;
   }
   
   //returns the value of the die
   public int getFaceValue()
   {
      return faceValue;
   }
   
   //prints the value of the die
   public String toString()
   {
     return Integer.toString( faceValue);
   }

}