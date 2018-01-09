import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SLDnDDice
{
	Reroll reroll = new Reroll();
	public String choice;
	static String dieChoice;
	
	public static void main(String[] args)
	{
		new SLDnDDice().Play();
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
	
	public class Reroll 
	{
		public String rr;
		
		public void replayOrReroll()
		{
			SLDnDDice dice = new SLDnDDice();
			
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
				new SLDnDDice().Roll();
			}
			else if(again.equalsIgnoreCase("Rechoose"))
			{
				new SLDnDDice().Play();
			}
			else
			{
				System.out.println("Invalid choice.");
				replayOrReroll();
			}
		}
	}
	
	public class D4 
	{
		public void D4Roll()
		{
			String[] result = {"1", "2", "3", "4", 
							   "2", "1", "4", "3"};
			
			int dLength = result.length;
			int dResult = (int)(Math.random()* dLength);
			
			System.out.println("You D4 result is : " + result[dResult]);
		}
	}
	
	public class D6 
	{
		public void D6Roll()
		{
			String[] result = {"1", "2", "3", "4", "5", "6", 
							   "3", "2", "1", "6", "5", "4"};
			
			int dLength = result.length;
			int dResult = (int)(Math.random()* dLength);
			
			System.out.println("You D6 result is : " + result[dResult]);
		}
	}
	
	public class D8 
	{
		public void D8Roll()
		{
			String[] result = {"1", "2", "3", "4", "5", "6", "7", "8", 
							   "4", "3", "2", "1", "8", "7", "6", "5"};
			
			int dLength = result.length;
			int dResult = (int)(Math.random()* dLength);
			
			System.out.println("You D8 result is : " + result[dResult]);
		}
	}
	
	public class D10 
	{
		public void D10Roll()
		{
			String[] result = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", 
							   "5", "4", "3", "2", "1", "10", "9", "8", "7", "6"};
			
			int dLength = result.length;
			int dResult = (int)(Math.random()* dLength);
			
			System.out.println("You D10 result is : " + result[dResult]);
		}
	}
	
	public class D12 
	{
		public void D12Roll()
		{
			String[] result = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", 
							   "6", "5", "4", "3", "2", "1", "12", "11", "10", "9", "8", "7"};
			
			int dLength = result.length;
			int dResult = (int)(Math.random()* dLength);
			
			System.out.println("You D12 result is : " + result[dResult]);
		}
	}
	
	public class D20 
	{
		public void D20Roll()
		{
			String[] result = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", 
							   "10", "9", "8", "7", "6", "5", "4", "3", "2", "1", "20", "19", "18", "17", "16", "15", "14", "13", "12", "11"};
			
			int dLength = result.length;
			int dResult = (int)(Math.random()* dLength);
			
			System.out.println("You D20 result is : " + result[dResult]);
		}
	}
}
