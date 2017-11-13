package oop;

public class ProtectedModifier 
{
	protected String sModel;
	protected int iGear;
	public int iHighestSpeed;

}

class Calculation extends ProtectedModifier
{
	public static void main(String[] args)
	{
		ProtectedModifier Obj = new ProtectedModifier();
		Obj.sModel ="Nikon";
		Obj.iGear = 7200;
	}
}

