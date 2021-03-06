package com.ttdev.ss;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.0-milestone2
 * 2018-04-30T09:55:21.149+01:00
 * Generated source version: 3.0.0-milestone2
 * 
 */
@WebServiceClient(name = "SimpleService", 
                  wsdlLocation = "src/main/resources/SimpleService.wsdl",
                  targetNamespace = "http://ttdev.com/ss") 
public class SimpleService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ttdev.com/ss", "SimpleService");
    public final static QName P1 = new QName("http://ttdev.com/ss", "p1");
    static {
        URL url = SimpleService_Service.class.getResource("src/main/resources/SimpleService.wsdl");
        if (url == null) {
            url = SimpleService_Service.class.getClassLoader().getResource("src/main/resources/SimpleService.wsdl");
        } 
        if (url == null) {
            java.util.logging.Logger.getLogger(SimpleService_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "src/main/resources/SimpleService.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public SimpleService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SimpleService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SimpleService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SimpleService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SimpleService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SimpleService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns SimpleService
     */
    @WebEndpoint(name = "p1")
    public SimpleService getP1() {
        return super.getPort(P1, SimpleService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SimpleService
     */
    @WebEndpoint(name = "p1")
    public SimpleService getP1(WebServiceFeature... features) {
        return super.getPort(P1, SimpleService.class, features);
    }

}
