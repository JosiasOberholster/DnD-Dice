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
