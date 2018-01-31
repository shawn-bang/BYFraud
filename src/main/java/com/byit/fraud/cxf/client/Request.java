
package com.byit.fraud.cxf.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>request complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="table_" type="{archserver.xsd.dataflux.com}table__in" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "request", propOrder = {
    "table"
})
public class Request {

    @XmlElement(name = "table_")
    protected TableIn table;

    /**
     * 获取table属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TableIn }
     *     
     */
    public TableIn getTable() {
        return table;
    }

    /**
     * 设置table属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TableIn }
     *     
     */
    public void setTable(TableIn value) {
        this.table = value;
    }

}
