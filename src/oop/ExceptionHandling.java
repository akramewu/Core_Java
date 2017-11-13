package oop;

public class ExceptionHandling {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int i, j, k =0;
		int a[] = new int [4];
		i=8;
		j=2;
		
		try 
		{
			k=i/j;
			for (int l = 0; l <=4; l++) 
			{
				a[l]= l+1;
			}
			
			for (int value : a) 
			{
				System.out.println(value);
			}
		} 
		catch (ArithmeticException e) 
		{
			System.out.println(e);
			// TODO: handle exception
		}
		
		catch (ArrayIndexOutOfBoundsException e) 
		{
			// TODO: handle exception
			System.out.println("Maximum number of values is 4");
		}
		
		System.out.println("Division is :"+" "+k);
          
	}

}
