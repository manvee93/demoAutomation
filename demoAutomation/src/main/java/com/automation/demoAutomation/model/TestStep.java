package com.automation.demoAutomation.model;

public class TestStep {
	
	public String endPoint="";
	public String stepDescription="";
	public String request="";
	public String response=""; 
	public TestResult testResult;
	public TestStep(String endPoint, String stepDescription, String request, String response, TestResult testResult,
			String expectedBehaviour) {
		super();
		this.endPoint = endPoint;
		this.stepDescription = stepDescription;
		this.request = request;
		this.response = response;
		this.testResult = testResult;
		this.expectedBehaviour = expectedBehaviour;
	}
	public String expectedBehaviour="";
	public TestResult getTestResult() {
		return testResult;
	}
	public void setTestResult(TestResult testResult) {
		this.testResult = testResult;
	}
	public TestStep() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}
	public String getStepDescription() {
		return stepDescription;
	}
	public void setStepDescription(String stepDescription) {
		this.stepDescription = stepDescription;
	}
	public String getRequest() {
		return request;
	}
	public void setRequest(String request) {
		this.request = request;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public String getExpectedBehaviour() {
		return expectedBehaviour;
	}
	public void setExpectedBehaviour(String expectedBehaviour) {
		this.expectedBehaviour = expectedBehaviour;
	}


}
