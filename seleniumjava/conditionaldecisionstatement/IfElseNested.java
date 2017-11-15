package conditionaldecisionstatement;

public class IfElseNested
{

  public static void main(String[] args)
  {

    System.out.println("Test Started");
    String browser = "IE";

    if (browser.equalsIgnoreCase("FireFox"))
    {
      System.out.println("TC executed on FireFox");

    }

    else if (browser.equalsIgnoreCase("Chrome"))
    {
      System.out.println("TC executed on Chrome");
    }

    else if (browser.equalsIgnoreCase("ie"))
    {
      System.out.println("TC executed on IE");
    }

    else
    {
      System.out.println("Kindly provide valid browser info");
    }

    System.out.println("Test End");


  }

}
