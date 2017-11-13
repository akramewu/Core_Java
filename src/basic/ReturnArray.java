package basic;

public class ReturnArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      String[] aMake = Return();
      
      for (int i = 0; i < aMake.length; i++) 
      {
		System.out.println(aMake[i]);
	  }
	}
	
	public static String[] Return()
	{
		String[] aCarMake = {"BMW", "Audi", "Mercedez"};
		return aCarMake;
	}

}
