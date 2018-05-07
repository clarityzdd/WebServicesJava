
package com.ttdev.ss;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ttdev.ss package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InvalidQty_QNAME = new QName("http://ttdev.com/ss", "invalidQty");
    private final static QName _ProductQuery_QNAME = new QName("http://ttdev.com/ss", "productQuery");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ttdev.ss
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProductQueryResult }
     * 
     */
    public ProductQueryResult createProductQueryResult() {
        return new ProductQueryResult();
    }

    /**
     * Create an instance of {@link Concat }
     * 
     */
    public Concat createConcat() {
        return new Concat();
    }

    /**
     * Create an instance of {@link ProductQueryComplexType.QueryItem }
     * 
     */
    public ProductQueryComplexType.QueryItem createProductQueryComplexTypeQueryItem() {
        return new ProductQueryComplexType.QueryItem();
    }

    /**
     * Create an instance of {@link InvalidProductId }
     * 
     */
    public InvalidProductId createInvalidProductId() {
        return new InvalidProductId();
    }

    /**
     * Create an instance of {@link ProductQueryResult.ResultItem }
     * 
     */
    public ProductQueryResult.ResultItem createProductQueryResultResultItem() {
        return new ProductQueryResult.ResultItem();
    }

    /**
     * Create an instance of {@link ProductQueryComplexType }
     * 
     */
    public ProductQueryComplexType createProductQueryComplexType() {
        return new ProductQueryComplexType();
    }

    /**
     * Create an instance of {@link ConcatResponse }
     * 
     */
    public ConcatResponse createConcatResponse() {
        return new ConcatResponse();
    }

    /**
     * Create an instance of {@link QueryFault }
     * 
     */
    public QueryFault createQueryFault() {
        return new QueryFault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ttdev.com/ss", name = "invalidQty")
    public JAXBElement<String> createInvalidQty(String value) {
        return new JAXBElement<String>(_InvalidQty_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductQueryComplexType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ttdev.com/ss", name = "productQuery")
    public JAXBElement<ProductQueryComplexType> createProductQuery(ProductQueryComplexType value) {
        return new JAXBElement<ProductQueryComplexType>(_ProductQuery_QNAME, ProductQueryComplexType.class, null, value);
    }

}
