package com.byit.fraud.controller;

import com.byit.fraud.dto.*;
import com.byit.fraud.beantoxml.*;
import com.byit.fraud.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * Created by shawn on 2018/01/24.
 */
@Controller
public class GeneralController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/FraudEntrance", method = RequestMethod.POST)
    @ResponseBody
    public GeneralResponse entrance(@RequestBody GeneralRequest request) {

        List<Summary> summaries = testService.querySummaryList(request);
        GeneralResponse response = new GeneralResponse();
        response.setCode("200");
        response.setMessage("success");
        response.setBody(summaries);
        return response;
    }


    /**
     * chenzht
     *响应报文返回xml格式
     */
    @RequestMapping(value = "/javaToXml",method = RequestMethod.POST)
    @ResponseBody
    public BHAFResp XmlToJavaBean(){
        System.out.println("测试来了");
        CommonHeader header = new CommonHeader("747474747","asdfsd","hello msg","a32423423","2321123","ewr324234","213234234","234234234","234234");
        ApplicationInfos applicationInfos = new ApplicationInfos("wq32ed","23dddd","234fdfdfd","23fdd",new Date(),"45fd","sdf23223","2134dsfsd","12dsfsd","123ds","123dsfr3","123er213");
        BizBody body = new BizBody(applicationInfos);
        BHAFResp bhafResp = new BHAFResp(header,body);
        return bhafResp;
    }
}