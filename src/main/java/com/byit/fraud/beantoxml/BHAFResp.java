package com.byit.fraud.beantoxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "BHAFResp")
@XmlAccessorType(XmlAccessType.NONE)
public class BHAFResp {

    @XmlElement(name = "CommonHeader")
    private CommonHeader commonHeader;
    @XmlElement(name = "BizBody")
    private BizBody bizBody;

    public BHAFResp() {
    }

    public BHAFResp(CommonHeader commonHeader, BizBody bizBody) {
        this.commonHeader = commonHeader;
        this.bizBody = bizBody;
    }

    public CommonHeader getCommonHeader() {
        return commonHeader;
    }

    public void setCommonHeader(CommonHeader commonHeader) {
        this.commonHeader = commonHeader;
    }

    public BizBody getBizBody() {
        return bizBody;
    }

    public void setBizBody(BizBody bizBody) {
        this.bizBody = bizBody;
    }
}
