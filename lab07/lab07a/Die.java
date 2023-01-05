
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
   public int roll()
   {
      faceValue = (int) (( Math.random() * 6) + 1);
      return faceValue;
   }
   
   public int getFaceValue()
   {
      return faceValue;
   }
   
   public String toString()
   {
     return Integer.toString( faceValue);
   }

}