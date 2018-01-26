package com.byit.fraud.service;

import com.byit.fraud.dto.GeneralRequest;
import com.byit.fraud.dto.Summary;
import java.util.List;

public interface TestService {

	public List<Summary> querySummaryList(GeneralRequest generalRequest);

}
