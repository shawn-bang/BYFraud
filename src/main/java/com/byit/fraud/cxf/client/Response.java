
package com.byit.fraud.cxf.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>response complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="table_" type="{archserver.xsd.dataflux.com}table__out" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "response", propOrder = {
    "table"
})
public class Response {

    @XmlElement(name = "table_")
    protected TableOut table;

    /**
     * 获取table属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TableOut }
     *     
     */
    public TableOut getTable() {
        return table;
    }

    /**
     * 设置table属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TableOut }
     *     
     */
    public void setTable(TableOut value) {
        this.table = value;
    }

}
