package com.helpinghand.bean;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.helpinghand.constant.IConstants;

/**
 * This is the Result POJO Class.
 *
 * @author Gourav
 */
@Component
public class ResultBean {
	
	private int statusCode;
	private String statusMessage;
	private Map<String, Object> resultData;
	
	public ResultBean() {
		this.statusCode = IConstants.DEFAULT_STATUS_CODE;
		this.statusMessage = IConstants.DEFAULT_STATUS_MESSAGE;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public Map<String, Object> getResultData() {
		return resultData;
	}

	public void setResultData(Map<String, Object> resultData) {
		this.resultData = resultData;
	}
}
