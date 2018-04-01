package com.byit.fraud.webservice;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface DemoWebservice {

	String helloWorld(@WebParam(name="app_id") String app_id);

}
