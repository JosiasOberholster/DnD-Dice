import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Reroll 
{
	public String rr;
	
	public void replayOrReroll()
	{
		Dice dice = new Dice();
		
		String again = null;
		rr = dice.choice;
		
		BufferedReader playAgain = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("\nReroll dice again or choose diffent dice?");
		System.out.println("[Reroll / Rechoose]");
		
		try
		{
			again = playAgain.readLine();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		if(again.equalsIgnoreCase("Reroll"))
		{
			new Dice().Roll();
		}
		else if(again.equalsIgnoreCase("Rechoose"))
		{
			new Dice().Play();
		}
		else
		{
			System.out.println("Invalid choice.");
			replayOrReroll();
		}
	}
}
