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
