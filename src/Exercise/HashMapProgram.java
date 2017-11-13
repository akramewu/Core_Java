package Exercise;

import java.util.HashMap;

public class HashMapProgram
{

  public static void main(String[] args)
  {
    HashMap<Integer, String> HMap = new HashMap<Integer, String>();
    HMap.put(1, "A");
    HMap.put(2, "B");
    HMap.put(3, "C");
    HMap.put(4, "D");

    /*
     * for (Entry<Integer, String> entry : HMap.entrySet()) { int key = entry.getKey(); String value
     * = entry.getValue(); System.out.println(key + " : " + value); }
     * 
     */
    System.out.println("Size of the hash map");


  }

}
