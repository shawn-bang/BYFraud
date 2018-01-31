
package com.byit.fraud.cxf.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dataflux.xsd.archserver package. 
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

    private final static QName _DatasvcCcappRtMatchDdfIn_QNAME = new QName("archserver.xsd.dataflux.com", "datasvc_ccapp__rt__match.ddf_in");
    private final static QName _DatasvcCcappRtMatchDdfOut_QNAME = new QName("archserver.xsd.dataflux.com", "datasvc_ccapp__rt__match.ddf_out");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dataflux.xsd.archserver
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Request }
     * 
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link RowOut }
     * 
     */
    public RowOut createRowOut() {
        return new RowOut();
    }

    /**
     * Create an instance of {@link RowIn }
     * 
     */
    public RowIn createRowIn() {
        return new RowIn();
    }

    /**
     * Create an instance of {@link TableOut }
     * 
     */
    public TableOut createTableOut() {
        return new TableOut();
    }

    /**
     * Create an instance of {@link TableIn }
     * 
     */
    public TableIn createTableIn() {
        return new TableIn();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Request }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "archserver.xsd.dataflux.com", name = "datasvc_ccapp__rt__match.ddf_in")
    public JAXBElement<Request> createDatasvcCcappRtMatchDdfIn(Request value) {
        return new JAXBElement<Request>(_DatasvcCcappRtMatchDdfIn_QNAME, Request.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "archserver.xsd.dataflux.com", name = "datasvc_ccapp__rt__match.ddf_out")
    public JAXBElement<Response> createDatasvcCcappRtMatchDdfOut(Response value) {
        return new JAXBElement<Response>(_DatasvcCcappRtMatchDdfOut_QNAME, Response.class, null, value);
    }

}
