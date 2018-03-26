package com.java.bangla;

public class Bicyle 
{ 
    public static void main(String[] args)
	{
    	
		BicyleDemo bike1 = new BicyleDemo();
		//BicyleDemo bike2 = new BicyleDemo();
		
		bike1.changeCadence(50);
		bike1.changeSpeed(10);
		bike1.changeGear(2);
		bike1.printStates();
		
	}
}

 class BicyleDemo
{
	    int cadence = 0;
	    int speed = 0;
	    int gear = 1;
	    
	    void changeCadence(int newValue)
	    {
	    	cadence = newValue;
	    }
	    
	    void changeSpeed(int increment )
	    {
	    	speed = speed + increment;
	    }
	    
	    void applyBreaks(int decrement)
	    {
	       speed = speed - decrement;
	    }
	    
	    void changeGear(int newValue)
	    {
	    	gear = newValue;
	    }
	    
	    void printStates()
	    {
	    	System.out.println("cadence:" + cadence + "speed:" + speed + "gear:" + gear);
	    }
}
