package com.byit.fraud.webservice;

import com.byit.fraud.dto.Out;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Desc    : CXF Demo WebService
 * @author : shawn
 * @date   : 2018/4/13 17:21
 */
@WebService
public interface DemoWebservice {
	/**
	 * Desc    : checkRulesRealTime
	 * @author : shawn
	 * @date   : 2018/4/13 17:24
	 * @param AppId
	 * @param RequestTimeStamp
	 * @param EsbMsgID
	 * @return : Out
	 */
	Out checkRulesRealTime(@WebParam(name="AppId") String AppId, @WebParam(name="RequestTimeStamp") String RequestTimeStamp, @WebParam(name="EsbMsgID") String EsbMsgID);

}
