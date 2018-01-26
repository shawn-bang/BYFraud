package com.byit.fraud.service.impl;

import com.byit.fraud.dao.TestDao;
import com.byit.fraud.dto.GeneralRequest;
import com.byit.fraud.dto.Summary;
import com.byit.fraud.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestDao testDao;

	public List<Summary> querySummaryList(GeneralRequest generalRequest) {
		return testDao.selectAfsummary((String) generalRequest.getDatas().get(0).get("id"));
	}

}
