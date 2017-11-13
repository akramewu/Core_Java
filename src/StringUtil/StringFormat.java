package StringUtil;

public class StringFormat
{
  public static void main(String[] args)
  {
    System.out.println(stringFormat());
  }

  public static String stringFormat()
  {
    String firstName = "Akramul";
    String lastName = "Islam";
    return String.format("%2$s %1$s", firstName, lastName);

  }

}
