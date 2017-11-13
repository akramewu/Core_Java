package webservice;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(endpointInterface = "webservice")
@SOAPBinding(style = Style.RPC)
public class CalWebServiceImpl implements CalWebservice
{

  @Override
  public int add(int x, int y)
  {
    // TODO Auto-generated method stub
    return 0;
  }

}
