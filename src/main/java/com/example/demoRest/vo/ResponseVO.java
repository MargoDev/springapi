package com.example.demoRest.vo;

public class ResponseVO {

	private int status;
	private String message;
	
	public ResponseVO(int status, String msg) {
		this.setStatus(status);
		this.setMessage(msg);
	}
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
