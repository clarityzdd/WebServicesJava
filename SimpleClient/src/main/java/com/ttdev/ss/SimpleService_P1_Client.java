
package com.ttdev.ss;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.0-milestone2
 * 2018-04-24T09:52:26.211+01:00
 * Generated source version: 3.0.0-milestone2
 * 
 */
public final class SimpleService_P1_Client {

    private static final QName SERVICE_NAME = new QName("http://ttdev.com/ss", "SimpleService");

    private SimpleService_P1_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = SimpleService_Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        SimpleService_Service ss = new SimpleService_Service(wsdlURL, SERVICE_NAME);
        SimpleService port = ss.getP1();  
        
        {
        System.out.println("Invoking concat...");
        com.ttdev.ss.ConcatRequest _concat_parameters = new ConcatRequest();
        _concat_parameters.setS1("abc");
        _concat_parameters.setS2("123");
        java.lang.String _concat__return = port.concat(_concat_parameters);
        System.out.println("concat.result=" + _concat__return);


        }

        System.exit(0);
    }

}
