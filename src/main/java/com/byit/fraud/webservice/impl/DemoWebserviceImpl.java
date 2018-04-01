package com.byit.fraud.webservice.impl;

import javax.jws.WebService;
import com.byit.fraud.webservice.DemoWebservice;

@WebService(endpointInterface = "com.byit.fraud.webservice.DemoWebservice", serviceName = "DemoWebservice")
public class DemoWebserviceImpl implements DemoWebservice {

	public String helloWorld(String app_id) {
		return "Hello World!";
	}

}
