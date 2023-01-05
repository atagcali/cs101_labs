/**
 * Dice Methods
 */
public class Dice 
{
   // properties
   Die die1;
   Die die2;
   int die1FaceValue;
   int die2FaceValue;

   // constructors
   
   public Dice( Die die1, Die die2)
   {
     this.die1 = die1;
     this.die2 = die2;
   }
   
   // methods
  
   //rolls two dies
  public int rollBoth()
  {
    die1 = new Die();
    die2 = new Die();
    
    die1FaceValue = die1.getFaceValue();
    die2FaceValue = die2.getFaceValue();
    
    return die1.getFaceValue() + die2.getFaceValue();
  }
  
  //returns first die's value
  public int getDie1FaceValue()
  {
    return die1FaceValue;
  }
  
  //returns second die's value
  public int getDie2FaceValue()
  {
    return die2FaceValue;
  }
  
  //returns sum of two die's values
  public int getDiceTotal()
  {
    return die1FaceValue + die2FaceValue;
  }
  
  //prints values of two dies
  public String toString()
  {
    return die1FaceValue + " - " + die2FaceValue;
  }
}