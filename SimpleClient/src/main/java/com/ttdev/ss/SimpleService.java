package com.ttdev.ss;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.0-milestone2
 * 2018-04-24T09:52:26.260+01:00
 * Generated source version: 3.0.0-milestone2
 * 
 */
@WebService(targetNamespace = "http://ttdev.com/ss", name = "SimpleService")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SimpleService {

    @WebMethod(action = "http://ttdev.com/ss/NewOperation")
    @WebResult(name = "concatResponse", targetNamespace = "http://ttdev.com/ss", partName = "parameters")
    public java.lang.String concat(
        @WebParam(partName = "parameters", name = "concatRequest", targetNamespace = "http://ttdev.com/ss")
        ConcatRequest parameters
    );
}
