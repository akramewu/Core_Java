package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects
{

  public static void main(String[] args)
  {
    System.out.println("Writing Objects...");

    Person personObj1 = new Person(555, "Mike");
    Person personObj2 = new Person(444, "Sue");

    System.out.println(personObj1);
    System.out.println(personObj2);

    try
      {
        FileOutputStream fs = new FileOutputStream("people.bin");
        ObjectOutputStream os = new ObjectOutputStream(fs);

        os.writeObject(personObj1);
        os.writeObject(personObj2);
        os.close();
      } catch (FileNotFoundException e)
      {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } catch (IOException e)
      {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
  }

}
