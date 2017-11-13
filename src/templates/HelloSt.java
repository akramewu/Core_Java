package templates;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupDir;
import org.stringtemplate.v4.STGroupFile;


public class HelloSt
{
  public static void main(String[] args)
  {

    STGroupDir g = new STGroupDir("src/templates/homepage.st");
    final STGroup stGroup = new STGroupFile("src/templates/homepage.st");
    final ST templateExample = stGroup.getInstanceOf("templateExample");
    templateExample.add("param", "Hello World");
    final String render = templateExample.render();
    System.out.println(render);
  }

  // private static String templateDir = "";
  // public String packageName, imports;

}

