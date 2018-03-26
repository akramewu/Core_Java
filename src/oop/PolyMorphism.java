package oop;

public class PolyMorphism
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    B Obj = new B();
    Obj.show(5);
  }


  public void show()
  {
    System.out.println("Show without parameter method");
  }

  // Method over loading
  public void show(int a)
  {
    System.out.println("Show with parameter method");
  }

}


class B extends PolyMorphism
{
  // Method overrding
  public void show()
  {
    System.out.println("Method overrding called");
  }
}
