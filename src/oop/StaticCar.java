package oop;

public class StaticCar 
{
	public String sModel;
	public int iHighestSpeed;
	public static int iSteering;
	public static int iWheel;

	public static void main(String[] args) 
	{
	  StaticCar cObj = new StaticCar();
	  cObj.iHighestSpeed =2;
	  cObj.sModel = "BMW";
	  cObj.DisplayCharacterstics();
      StaticCar.DisplayStaticCharacterstics();
	}
	public StaticCar()
	{
		iSteering =1;
		iWheel = 4;
	}

	public void DisplayCharacterstics()
	{
		System.out.println(sModel);
		System.out.println(iHighestSpeed);
	}

	public static void DisplayStaticCharacterstics()
	{
		System.out.println(iSteering);
		System.out.println(iWheel);

	}

}
