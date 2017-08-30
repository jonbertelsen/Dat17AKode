import java.util.Random;

public class DiceGame
{
   public static void main(String[] args)
   {
         int weWin = 0;
         int systemWin = 0;
   
         // Slå 50 gange med terningerne og se fordelingen
         
         for (int i=0;i<50;i++)
         {
   
            if (playDiceGame() == 7)
               weWin++;
            else 
               systemWin++;
         }
            
         System.out.println("We win: " + weWin);
         System.out.println("System win: " + systemWin);
                  
   } // main
   
   public static int playDiceGame()
   {
      int die1;
      int die2;
      int sum;
      Random r = new Random();
      
      die1 = r.nextInt(6) + 1;
      die2 = r.nextInt(6) + 1;
      
      sum = die1 + die2;
         
      return sum;
   
   } // playDiceGame


} // DiceGame