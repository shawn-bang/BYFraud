package com.byit.fraud.dto;

import java.io.Serializable;

public class Out implements Serializable {

	private String apppId;
	private String checkResult;
	private String desc;
	private String responseTimeStamp;
	private String status;

	public String getApppId() {
		return apppId;
	}

	public void setApppId(String apppId) {
		this.apppId = apppId;
	}

	public String getCheckResult() {
		return checkResult;
	}

	public void setCheckResult(String checkResult) {
		this.checkResult = checkResult;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getResponseTimeStamp() {
		return responseTimeStamp;
	}

	public void setResponseTimeStamp(String responseTimeStamp) {
		this.responseTimeStamp = responseTimeStamp;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
