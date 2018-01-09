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
