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
