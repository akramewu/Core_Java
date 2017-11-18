package stringclass;

public class StringDemo2
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub

    String actuals = "Welcome to Selenium Webdriver world";
    String expected = "welcome to Selenium Webdriver world";
    boolean status2 = actuals.equalsIgnoreCase(expected);


    System.out.println("Status is " + status2);


  }

}
