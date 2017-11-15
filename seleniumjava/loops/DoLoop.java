package loops;

public class DoLoop
{
  public static void main(String[] args)
  {
    /*
     * do { //at least execute once then go to while condition } while(condtion)
     * 
     */
    int count = 50;
    do
    {

      System.out.println("count here " + count);
      count++;

    } while (count < 80);
  }

}
