package com.byit.fraud.controller;

import com.byit.fraud.dto.*;
import com.byit.fraud.service.TestService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by shawn on 2018/01/24.
 */
@Controller
public class GeneralController {
    private final static Log logger = LogFactory.getLog(GeneralController.class);

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
}