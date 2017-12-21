package oop;

/**
 * 
 * If variable is private then it need to implement a method 
 * To set the value use setMethod() 
 * To get the value use getMethod()
 * @author 27708570
 *
 */
public class Encapsulation
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub

    A Obja = new A();
    Obja.setI(5);

  }

}


class A
{
  private int i; // In encapsulation variable should be private as declared

  public void setI(int j)
  {
    i = j;
  }

  // to get the value or print the value get Method needed
  public int getI()
  {
    return i;
  }
}
