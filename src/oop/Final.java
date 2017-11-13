package oop;

public class Final {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		final int i ; //once it is declare as final it won't be possible to change 
		i = 6;
		System.out.println(i);

	}
	
	////if I use final keyword before class A then in the Inheritance class B should be complier error	
	class A
	{
	  //if I use final then in the Inheritance class method should be complier error	
	   public void show()
	   {
		   System.out.println("Print Class A method");
	   }
	}
	
	class B extends A
	{
		public void show() 
		{
			System.out.println("Print class B from A extension");
		}
	}

}
