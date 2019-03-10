package com.automation.demoAutomation.model;

public class TestResult {

	
	public String errorMessage="";
	public Result result;
	public TestResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TestResult(String errorMessage, Result result) {
		super();
		this.errorMessage = errorMessage;
		this.result = result;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
	}
	
	
}
