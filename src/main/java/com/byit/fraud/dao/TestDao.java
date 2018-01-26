package com.byit.fraud.dao;

import com.byit.fraud.dto.Summary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestDao {

	int isExistsRequest(String appId);
	List<Summary> selectAfsummary(String appId);
	
}
