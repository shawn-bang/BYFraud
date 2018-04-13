package com.byit.fraud.webservice.impl;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.byit.fraud.dto.Out;
import com.byit.fraud.webservice.DemoWebservice;

/**
 * Desc    : CXF Demo WebService Implement
 * @author : shawn
 * @date   : 2018/4/13 17:12
 */
@WebService(endpointInterface = "com.byit.fraud.webservice.DemoWebservice", serviceName = "DemoWebservice")
public class DemoWebserviceImpl implements DemoWebservice {

	@Override
	@WebMethod
	public Out checkRulesRealTime(String AppId, String RequestTimeStamp, String EsbMsgID) {
		Out out = new Out();
		out.setApppId("Br-A16433011111");
		out.setCheckResult("501");
		out.setDesc("BYFraud");
		out.setResponseTimeStamp("2018-03-30 10:45:27.616");
		out.setStatus("1");
		return out;
	}

}
