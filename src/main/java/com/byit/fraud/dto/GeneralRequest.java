package com.byit.fraud.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class GeneralRequest implements Serializable{

	private String reqAppNum;
	private String fromFlowPoint;
	private String trigMode;

	private List<Map<String, Object>> datas;

	public String getReqAppNum() {
		return reqAppNum;
	}

	public void setReqAppNum(String reqAppNum) {
		this.reqAppNum = reqAppNum;
	}

	public String getFromFlowPoint() {
		return fromFlowPoint;
	}

	public void setFromFlowPoint(String fromFlowPoint) {
		this.fromFlowPoint = fromFlowPoint;
	}

	public String getTrigMode() {
		return trigMode;
	}

	public void setTrigMode(String trigMode) {
		this.trigMode = trigMode;
	}

	public List<Map<String, Object>> getDatas() {
		return datas;
	}

	public void setDatas(List<Map<String, Object>> datas) {
		this.datas = datas;
	}
}
