import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Dice
{
	Reroll reroll = new Reroll();
	public String choice;
	static String dieChoice;
	
	public static void main(String[] args)
	{
		new Dice().Play();
	}
	
	public void Play()
	{
		String choice = null;
		
		BufferedReader diceReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("\nChoose a dice: ");
		System.out.println("D4, D6, D8, D10, D12 or D20");
		
		try
		{
			choice = diceReader.readLine();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		dieChoice = choice;
		Roll();
	}
	
	public void Roll()
	{
		
		if(dieChoice.equalsIgnoreCase("D4"))
		{
			new D4().D4Roll();
		}
		else if(dieChoice.equalsIgnoreCase("D6"))
		{
			new D6().D6Roll();
		}
		else if(dieChoice.equalsIgnoreCase("D8"))
		{
			new D8().D8Roll();
		}
		else if(dieChoice.equalsIgnoreCase("D10"))
		{
			new D10().D10Roll();
		}
		else if(dieChoice.equalsIgnoreCase("D12"))
		{
			new D12().D12Roll();
		}
		else if(dieChoice.equalsIgnoreCase("D20"))
		{
			new D20().D20Roll();
		}
		else
		{
			System.out.println("Invalid choice.");
			Play();
		}
		
		reroll.replayOrReroll();
	}
}
