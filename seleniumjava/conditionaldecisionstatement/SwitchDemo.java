package conditionaldecisionstatement;

import java.util.Scanner;

public class SwitchDemo
{

  public static void main(String[] args)
  {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter the value of X");
    int x = reader.nextInt();
    reader.close();

    switch (x)
    {
      case 1:
        System.out.println("Performance is poor");

        break;

      case 2:
        System.out.println("Performance is still slow");

        break;

      case 3:
        System.out.println("Performance is just improve");

        break;

      case 4:
        System.out.println("Performance is meeting as expected");

        break;

      case 5:
        System.out.println("Emyloyee of the Year");

        break;
      default:
        System.out.println("You are fire");
        break;
    }

  }

}
