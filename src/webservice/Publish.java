package webservice;

import javax.xml.ws.Endpoint;

public class Publish
{
  public static void main(String[] args)
  {
    Endpoint endpointObj = Endpoint.publish("http://localhost:8080/cal", new CalWebServiceImpl());
    System.out.println(endpointObj.isPublished());
  }
}
