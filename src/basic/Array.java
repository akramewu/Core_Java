package basic;

public class Array {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      String [] aCarMake = new String[10] ;
      aCarMake [0] = "BMW";
      aCarMake [1] = "AUDI";
      aCarMake [2] = "TOYOTA";
      aCarMake [3] = "SUZUKI";
      aCarMake [4] = "HONDA";
      aCarMake [5] = "PORSCHE";
      Print_Array(aCarMake);
		/*
		 * for (int i = 0; i < aCarMake.length; i++) {
		 * System.out.println("All car names :"+ aCarMake[i]); }
		 * 
		 */
      
      
   
	}

	   //Passing an Array to Method
    public static void Print_Array(String[] array)
    {
  	  for (int i = 0; i < array.length; i++) 
  	  {
		System.out.println("All Cars Name "+ array[i]);
      }
    }
    

}
