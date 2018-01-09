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
