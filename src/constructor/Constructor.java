package constructor;

public class Constructor 
{
	private String name;
	private double price;
	private String unit;
	
	public Constructor(String Name, double Price, String Unit)
	{
	  this.name = Name;
	  this.price = Price;
	  this.unit = Unit;
		
	}
	
	public void Display()
	{
		System.out.println(name);
		System.out.println(price);
		System.out.println(unit);
	}
}
