package oop;

public class InnerClass
{

  public static void main(String[] args)
  {
    Outer_Demo outerdemoObj = new Outer_Demo();
    outerdemoObj.display_Inner();
  }

}


class Outer_Demo
{
  int num;

  // innner class

  private class Inner_Demo
  {

    public void print()
    {
      System.out.println("This is inner class");
    }
  }

  void display_Inner()
  {
    Inner_Demo innerObj = new Inner_Demo();
    innerObj.print();
  }
}
