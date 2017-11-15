package conditionaldecisionstatement;

import java.util.Scanner;

public class IfElseCondition
{

  public static void main(String[] args)
  {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter first value");
    int n = reader.nextInt();
    reader.close();

    if (n > 50)
    {
      System.out.println("True");

    }

    else
    {
      System.out.println("False");
    }

  }

}
