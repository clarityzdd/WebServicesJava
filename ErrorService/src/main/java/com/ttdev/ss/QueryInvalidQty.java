
package com.ttdev.ss;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.0-milestone2
 * 2018-05-07T09:10:35.012+01:00
 * Generated source version: 3.0.0-milestone2
 */

@WebFault(name = "invalidQty", targetNamespace = "http://ttdev.com/ss")
public class QueryInvalidQty extends Exception {
    
    private java.lang.String invalidQty;

    public QueryInvalidQty() {
        super();
    }
    
    public QueryInvalidQty(String message) {
        super(message);
    }
    
    public QueryInvalidQty(String message, Throwable cause) {
        super(message, cause);
    }

    public QueryInvalidQty(String message, java.lang.String invalidQty) {
        super(message);
        this.invalidQty = invalidQty;
    }

    public QueryInvalidQty(String message, java.lang.String invalidQty, Throwable cause) {
        super(message, cause);
        this.invalidQty = invalidQty;
    }

    public java.lang.String getFaultInfo() {
        return this.invalidQty;
    }
}
