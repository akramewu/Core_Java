package stringclass;

public class StringDemo3
{
  /**
   * startsWith() and endsWith() method Spilt(expression)- will return array of String trim()-
   * eliminates white spaces before and after string equals()- will compare and will return true and
   * false EqualsIgnoreCase- will compare the content only and will return true and false charAt() -
   * returns character at specified index
   * 
   */
  public static void main(String[] args)
  {
    // TODO Auto-generated method stub

    String fullname = "Welcome-to-Selenium-Webdriver-world";
    String[] toolname = fullname.split("-");

    for (int i = 0; i < toolname.length; i++)
    {
      System.out.println("Value " + i + "is " + toolname[i]);

      if (toolname[i].equalsIgnoreCase("selenium"))
      {
        System.out.println("Test passed");
      }
    }



  }

}
