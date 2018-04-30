
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
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.ttdev.ss.ProductQueryComplexType.QueryItem;

/**
 * This class was generated by Apache CXF 3.0.0-milestone2
 * 2018-04-30T09:57:56.549+01:00
 * Generated source version: 3.0.0-milestone2
 * 
 */
public final class SimpleService_P1_Client {

    private static final QName SERVICE_NAME = new QName("http://ttdev.com/ss", "SimpleService");

    private SimpleService_P1_Client() {
    }

    @SuppressWarnings("null")
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
        System.out.println("Invoking query...");
        com.ttdev.ss.ProductQueryComplexType _query_parameters =  new ProductQueryComplexType();

        QueryItem item = new QueryItem();
        item.setProductId("p01");
        item.setQty(100);
        _query_parameters.getQueryItem().add(item);
        
        item = new QueryItem();
        item.setProductId("p02");
        item.setQty(200);
        _query_parameters.getQueryItem().add(item);
        
        item = new QueryItem();
        item.setProductId("p03");
        item.setQty(300);
        _query_parameters.getQueryItem().add(item);
        }
//        {
//        System.out.println("Invoking concat...");
//        java.lang.String _concat_s1 = "";
//        java.lang.String _concat_s2 = "";
//        java.lang.String _concat__return = port.concat(_concat_s1, _concat_s2);
//        System.out.println("concat.result=" + _concat__return);
//
//
//        }

        System.exit(0);
    }

}
