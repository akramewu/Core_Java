package loop;

public class EnhancedLoop {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       double [] dPrices = {12, 15, 100, 45, 35 };
       print_all(dPrices);
       
	}
	
	//used with method
	private static void print_all(double[] dPrices) 
	{
		// TODO Auto-generated method stub
		
		for (double nPrices : dPrices) 
	       {
			  System.out.println("All new prices is here :" + nPrices);
		   }
	}

}
