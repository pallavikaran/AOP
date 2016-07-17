/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Administrator
 */
@WebService(serviceName = "Calculator")
public class Calculator {

   
    @WebMethod(operationName="add")
            public Integer add(@WebParam(name="no1") Integer x, @WebParam(name="no2") Integer y)
    {
        return (x+y);
    }
     @WebMethod(operationName="sub")
            public Integer sub(@WebParam(name="no1") Integer x, @WebParam(name="no2") Integer y)
    {
        return (x-y);
    }
      @WebMethod(operationName="mul")
            public Integer mul(@WebParam(name="no1") Integer x, @WebParam(name="no2") Integer y)
    {
        return (x*y);
    }
       @WebMethod(operationName="div")
            public Integer div(@WebParam(name="no1") Integer x, @WebParam(name="no2") Integer y)
    {
        return (x/y);
    }
}
