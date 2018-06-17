package org.calculatorimc.webservice;

public class CalculatorIMCWebServiceProxy implements org.calculatorimc.webservice.CalculatorIMCWebService {
  private String _endpoint = null;
  private org.calculatorimc.webservice.CalculatorIMCWebService calculatorIMCWebService = null;
  
  public CalculatorIMCWebServiceProxy() {
    _initCalculatorIMCWebServiceProxy();
  }
  
  public CalculatorIMCWebServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalculatorIMCWebServiceProxy();
  }
  
  private void _initCalculatorIMCWebServiceProxy() {
    try {
      calculatorIMCWebService = (new org.calculatorimc.webservice.CalculatorCalculatorwebserviceLocator()).getCalculatorIMCEndPointPort();
      if (calculatorIMCWebService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calculatorIMCWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calculatorIMCWebService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calculatorIMCWebService != null)
      ((javax.xml.rpc.Stub)calculatorIMCWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.calculatorimc.webservice.CalculatorIMCWebService getCalculatorIMCWebService() {
    if (calculatorIMCWebService == null)
      _initCalculatorIMCWebServiceProxy();
    return calculatorIMCWebService;
  }
  
  public java.lang.String calculateIMC(double weight, double height) throws java.rmi.RemoteException{
    if (calculatorIMCWebService == null)
      _initCalculatorIMCWebServiceProxy();
    return calculatorIMCWebService.calculateIMC(weight, height);
  }
  
  
}