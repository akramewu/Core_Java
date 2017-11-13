package Exercise;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLoop {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ArrayList<Integer> values = new ArrayList<Integer>(10);
		
		while(values.size()<10)
		{
			values.add(-113);
		}
		
	     for (int i = 0; i < values.size(); i++) 
	     {
		   System.out.println("Slot" + i+ "contains a" +values.get(i));
	     }
	     
	}

}