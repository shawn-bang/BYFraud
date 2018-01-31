
package com.byit.fraud.cxf.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>row__out complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="row__out">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="APP_shenqingjian_no">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="APP_entity_type">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="APP_data_type">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="APP_data_value">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="APP_data_source">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXT_entity_type">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXT_data_type">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXT_data_value">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXT_data_source">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="simulation_parsing">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="simulation_char">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="simulation_cluster">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="APP_AddInfo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="256"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="APP_DistrictMC">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="892"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="APP_TownMC">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="892"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="APP_StreetMC">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="892"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="APP_BlockMC">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="892"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="APP_BuildingMC">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="892"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="APP_UnitMC">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="892"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="APP_FloorMC">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="892"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="APP_RoomMC">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="892"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXT_AddInfo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="256"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXT_DistrictMC">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="892"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXT_TownMC">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="892"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXT_StreetMC">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="892"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXT_BlockMC">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="892"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXT_BuildingMC">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="892"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXT_UnitMC">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="892"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXT_FloorMC">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="892"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXT_RoomMC">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="892"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="APP_NameMC">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="400"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="APP_LegalFormMC">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="400"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="APP_SiteMC">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="400"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="APP_AddMC">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="400"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXT_NameMC">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="400"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXT_LegalFormMC">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="400"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXT_SiteMC">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="400"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXT_AddMC">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="400"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row__out", propOrder = {
    "appShenqingjianNo",
    "appEntityType",
    "appDataType",
    "appDataValue",
    "appDataSource",
    "extEntityType",
    "extDataType",
    "extDataValue",
    "extDataSource",
    "simulationParsing",
    "simulationChar",
    "simulationCluster",
    "appAddInfo",
    "appDistrictMC",
    "appTownMC",
    "appStreetMC",
    "appBlockMC",
    "appBuildingMC",
    "appUnitMC",
    "appFloorMC",
    "appRoomMC",
    "extAddInfo",
    "extDistrictMC",
    "extTownMC",
    "extStreetMC",
    "extBlockMC",
    "extBuildingMC",
    "extUnitMC",
    "extFloorMC",
    "extRoomMC",
    "appNameMC",
    "appLegalFormMC",
    "appSiteMC",
    "appAddMC",
    "extNameMC",
    "extLegalFormMC",
    "extSiteMC",
    "extAddMC"
})
public class RowOut {

    @XmlElement(name = "APP_shenqingjian_no", required = true)
    protected String appShenqingjianNo;
    @XmlElement(name = "APP_entity_type", required = true)
    protected String appEntityType;
    @XmlElement(name = "APP_data_type", required = true)
    protected String appDataType;
    @XmlElement(name = "APP_data_value", required = true)
    protected String appDataValue;
    @XmlElement(name = "APP_data_source", required = true)
    protected String appDataSource;
    @XmlElement(name = "EXT_entity_type", required = true)
    protected String extEntityType;
    @XmlElement(name = "EXT_data_type", required = true)
    protected String extDataType;
    @XmlElement(name = "EXT_data_value", required = true)
    protected String extDataValue;
    @XmlElement(name = "EXT_data_source", required = true)
    protected String extDataSource;
    @XmlElement(name = "simulation_parsing", required = true)
    protected String simulationParsing;
    @XmlElement(name = "simulation_char", required = true)
    protected String simulationChar;
    @XmlElement(name = "simulation_cluster", required = true)
    protected String simulationCluster;
    @XmlElement(name = "APP_AddInfo", required = true)
    protected String appAddInfo;
    @XmlElement(name = "APP_DistrictMC", required = true)
    protected String appDistrictMC;
    @XmlElement(name = "APP_TownMC", required = true)
    protected String appTownMC;
    @XmlElement(name = "APP_StreetMC", required = true)
    protected String appStreetMC;
    @XmlElement(name = "APP_BlockMC", required = true)
    protected String appBlockMC;
    @XmlElement(name = "APP_BuildingMC", required = true)
    protected String appBuildingMC;
    @XmlElement(name = "APP_UnitMC", required = true)
    protected String appUnitMC;
    @XmlElement(name = "APP_FloorMC", required = true)
    protected String appFloorMC;
    @XmlElement(name = "APP_RoomMC", required = true)
    protected String appRoomMC;
    @XmlElement(name = "EXT_AddInfo", required = true)
    protected String extAddInfo;
    @XmlElement(name = "EXT_DistrictMC", required = true)
    protected String extDistrictMC;
    @XmlElement(name = "EXT_TownMC", required = true)
    protected String extTownMC;
    @XmlElement(name = "EXT_StreetMC", required = true)
    protected String extStreetMC;
    @XmlElement(name = "EXT_BlockMC", required = true)
    protected String extBlockMC;
    @XmlElement(name = "EXT_BuildingMC", required = true)
    protected String extBuildingMC;
    @XmlElement(name = "EXT_UnitMC", required = true)
    protected String extUnitMC;
    @XmlElement(name = "EXT_FloorMC", required = true)
    protected String extFloorMC;
    @XmlElement(name = "EXT_RoomMC", required = true)
    protected String extRoomMC;
    @XmlElement(name = "APP_NameMC", required = true)
    protected String appNameMC;
    @XmlElement(name = "APP_LegalFormMC", required = true)
    protected String appLegalFormMC;
    @XmlElement(name = "APP_SiteMC", required = true)
    protected String appSiteMC;
    @XmlElement(name = "APP_AddMC", required = true)
    protected String appAddMC;
    @XmlElement(name = "EXT_NameMC", required = true)
    protected String extNameMC;
    @XmlElement(name = "EXT_LegalFormMC", required = true)
    protected String extLegalFormMC;
    @XmlElement(name = "EXT_SiteMC", required = true)
    protected String extSiteMC;
    @XmlElement(name = "EXT_AddMC", required = true)
    protected String extAddMC;

    /**
     * 获取appShenqingjianNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPShenqingjianNo() {
        return appShenqingjianNo;
    }

    /**
     * 设置appShenqingjianNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPShenqingjianNo(String value) {
        this.appShenqingjianNo = value;
    }

    /**
     * 获取appEntityType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPEntityType() {
        return appEntityType;
    }

    /**
     * 设置appEntityType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPEntityType(String value) {
        this.appEntityType = value;
    }

    /**
     * 获取appDataType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPDataType() {
        return appDataType;
    }

    /**
     * 设置appDataType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPDataType(String value) {
        this.appDataType = value;
    }

    /**
     * 获取appDataValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPDataValue() {
        return appDataValue;
    }

    /**
     * 设置appDataValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPDataValue(String value) {
        this.appDataValue = value;
    }

    /**
     * 获取appDataSource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPDataSource() {
        return appDataSource;
    }

    /**
     * 设置appDataSource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPDataSource(String value) {
        this.appDataSource = value;
    }

    /**
     * 获取extEntityType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTEntityType() {
        return extEntityType;
    }

    /**
     * 设置extEntityType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTEntityType(String value) {
        this.extEntityType = value;
    }

    /**
     * 获取extDataType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTDataType() {
        return extDataType;
    }

    /**
     * 设置extDataType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTDataType(String value) {
        this.extDataType = value;
    }

    /**
     * 获取extDataValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTDataValue() {
        return extDataValue;
    }

    /**
     * 设置extDataValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTDataValue(String value) {
        this.extDataValue = value;
    }

    /**
     * 获取extDataSource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTDataSource() {
        return extDataSource;
    }

    /**
     * 设置extDataSource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTDataSource(String value) {
        this.extDataSource = value;
    }

    /**
     * 获取simulationParsing属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimulationParsing() {
        return simulationParsing;
    }

    /**
     * 设置simulationParsing属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimulationParsing(String value) {
        this.simulationParsing = value;
    }

    /**
     * 获取simulationChar属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimulationChar() {
        return simulationChar;
    }

    /**
     * 设置simulationChar属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimulationChar(String value) {
        this.simulationChar = value;
    }

    /**
     * 获取simulationCluster属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimulationCluster() {
        return simulationCluster;
    }

    /**
     * 设置simulationCluster属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimulationCluster(String value) {
        this.simulationCluster = value;
    }

    /**
     * 获取appAddInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPAddInfo() {
        return appAddInfo;
    }

    /**
     * 设置appAddInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPAddInfo(String value) {
        this.appAddInfo = value;
    }

    /**
     * 获取appDistrictMC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPDistrictMC() {
        return appDistrictMC;
    }

    /**
     * 设置appDistrictMC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPDistrictMC(String value) {
        this.appDistrictMC = value;
    }

    /**
     * 获取appTownMC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPTownMC() {
        return appTownMC;
    }

    /**
     * 设置appTownMC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPTownMC(String value) {
        this.appTownMC = value;
    }

    /**
     * 获取appStreetMC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPStreetMC() {
        return appStreetMC;
    }

    /**
     * 设置appStreetMC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPStreetMC(String value) {
        this.appStreetMC = value;
    }

    /**
     * 获取appBlockMC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPBlockMC() {
        return appBlockMC;
    }

    /**
     * 设置appBlockMC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPBlockMC(String value) {
        this.appBlockMC = value;
    }

    /**
     * 获取appBuildingMC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPBuildingMC() {
        return appBuildingMC;
    }

    /**
     * 设置appBuildingMC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPBuildingMC(String value) {
        this.appBuildingMC = value;
    }

    /**
     * 获取appUnitMC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPUnitMC() {
        return appUnitMC;
    }

    /**
     * 设置appUnitMC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPUnitMC(String value) {
        this.appUnitMC = value;
    }

    /**
     * 获取appFloorMC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPFloorMC() {
        return appFloorMC;
    }

    /**
     * 设置appFloorMC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPFloorMC(String value) {
        this.appFloorMC = value;
    }

    /**
     * 获取appRoomMC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPRoomMC() {
        return appRoomMC;
    }

    /**
     * 设置appRoomMC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPRoomMC(String value) {
        this.appRoomMC = value;
    }

    /**
     * 获取extAddInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTAddInfo() {
        return extAddInfo;
    }

    /**
     * 设置extAddInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTAddInfo(String value) {
        this.extAddInfo = value;
    }

    /**
     * 获取extDistrictMC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTDistrictMC() {
        return extDistrictMC;
    }

    /**
     * 设置extDistrictMC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTDistrictMC(String value) {
        this.extDistrictMC = value;
    }

    /**
     * 获取extTownMC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTTownMC() {
        return extTownMC;
    }

    /**
     * 设置extTownMC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTTownMC(String value) {
        this.extTownMC = value;
    }

    /**
     * 获取extStreetMC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTStreetMC() {
        return extStreetMC;
    }

    /**
     * 设置extStreetMC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTStreetMC(String value) {
        this.extStreetMC = value;
    }

    /**
     * 获取extBlockMC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTBlockMC() {
        return extBlockMC;
    }

    /**
     * 设置extBlockMC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTBlockMC(String value) {
        this.extBlockMC = value;
    }

    /**
     * 获取extBuildingMC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTBuildingMC() {
        return extBuildingMC;
    }

    /**
     * 设置extBuildingMC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTBuildingMC(String value) {
        this.extBuildingMC = value;
    }

    /**
     * 获取extUnitMC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTUnitMC() {
        return extUnitMC;
    }

    /**
     * 设置extUnitMC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTUnitMC(String value) {
        this.extUnitMC = value;
    }

    /**
     * 获取extFloorMC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTFloorMC() {
        return extFloorMC;
    }

    /**
     * 设置extFloorMC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTFloorMC(String value) {
        this.extFloorMC = value;
    }

    /**
     * 获取extRoomMC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTRoomMC() {
        return extRoomMC;
    }

    /**
     * 设置extRoomMC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTRoomMC(String value) {
        this.extRoomMC = value;
    }

    /**
     * 获取appNameMC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPNameMC() {
        return appNameMC;
    }

    /**
     * 设置appNameMC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPNameMC(String value) {
        this.appNameMC = value;
    }

    /**
     * 获取appLegalFormMC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPLegalFormMC() {
        return appLegalFormMC;
    }

    /**
     * 设置appLegalFormMC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPLegalFormMC(String value) {
        this.appLegalFormMC = value;
    }

    /**
     * 获取appSiteMC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPSiteMC() {
        return appSiteMC;
    }

    /**
     * 设置appSiteMC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPSiteMC(String value) {
        this.appSiteMC = value;
    }

    /**
     * 获取appAddMC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPAddMC() {
        return appAddMC;
    }

    /**
     * 设置appAddMC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPAddMC(String value) {
        this.appAddMC = value;
    }

    /**
     * 获取extNameMC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTNameMC() {
        return extNameMC;
    }

    /**
     * 设置extNameMC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTNameMC(String value) {
        this.extNameMC = value;
    }

    /**
     * 获取extLegalFormMC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTLegalFormMC() {
        return extLegalFormMC;
    }

    /**
     * 设置extLegalFormMC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTLegalFormMC(String value) {
        this.extLegalFormMC = value;
    }

    /**
     * 获取extSiteMC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTSiteMC() {
        return extSiteMC;
    }

    /**
     * 设置extSiteMC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTSiteMC(String value) {
        this.extSiteMC = value;
    }

    /**
     * 获取extAddMC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTAddMC() {
        return extAddMC;
    }

    /**
     * 设置extAddMC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTAddMC(String value) {
        this.extAddMC = value;
    }

}
