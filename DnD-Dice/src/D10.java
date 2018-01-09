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
