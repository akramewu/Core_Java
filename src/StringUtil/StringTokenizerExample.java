package StringUtil;

import java.util.StringTokenizer;

public class StringTokenizerExample
{
  public static void main(String[] args)
  {
    StringTokenizerExample.tokenSpilt();

  }

  public static void tokenSpilt()
  {
    String s = "Hello World";
    StringTokenizer st = new StringTokenizer(s);

    while (st.hasMoreElements())
      {
        System.out.println(st.nextToken());

      }

  }
}
