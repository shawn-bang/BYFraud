package com.byit.fraud.webservice;

import com.byit.fraud.dto.Out;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface DemoWebservice {

	Out checkRulesRealTime(@WebParam(name="AppId") String AppId, @WebParam(name="RequestTimeStamp") String RequestTimeStamp, @WebParam(name="EsbMsgID") String EsbMsgID);

}
