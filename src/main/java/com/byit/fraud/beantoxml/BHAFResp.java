package com.byit.fraud.beantoxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="BHAFResp")
@XmlAccessorType(XmlAccessType.NONE)
public class BHAFResp {
    @XmlElement
    private CommonHeader CommonHeader;
    @XmlElement
    private BizBody BizBody;

    public BHAFResp(CommonHeader commonHeader, BizBody bizBody) {
        CommonHeader = commonHeader;
        BizBody = bizBody;
    }

    public BHAFResp() {
    }

    public com.byit.fraud.beantoxml.CommonHeader getCommonHeader() {
        return CommonHeader;
    }

    public void setCommonHeader(com.byit.fraud.beantoxml.CommonHeader commonHeader) {
        CommonHeader = commonHeader;
    }

    public com.byit.fraud.beantoxml.BizBody getBizBody() {
        return BizBody;
    }

    public void setBizBody(com.byit.fraud.beantoxml.BizBody bizBody) {
        BizBody = bizBody;
    }
}
