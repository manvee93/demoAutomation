package com.automation.demoAutomation.model;

import java.util.ArrayList;

public class TestCase {
	
	public String testCaseID="";
	public String testCaseDescription="";
	public String testCaseName="";
	public String jiraID="";
	public boolean smokeTest= false;
	public boolean sanityTest= false;
	public boolean regressionTest= false;
	
	public ArrayList<TestStep> testSteplist= new ArrayList<>();
	public TestResult testResult;
	public TestCase() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TestCase(String testCaseID, String testCaseDescription, String testCaseName, String jiraID,
			boolean smokeTest, boolean sanityTest, boolean regressionTest, ArrayList<TestStep> testSteplist,
			TestResult testResult) {
		super();
		this.testCaseID = testCaseID;
		this.testCaseDescription = testCaseDescription;
		this.testCaseName = testCaseName;
		this.jiraID = jiraID;
		this.smokeTest = smokeTest;
		this.sanityTest = sanityTest;
		this.regressionTest = regressionTest;
		this.testSteplist = testSteplist;
		this.testResult = testResult;
	}
	public String getTestCaseID() {
		return testCaseID;
	}
	public void setTestCaseID(String testCaseID) {
		this.testCaseID = testCaseID;
	}
	public String getTestCaseDescription() {
		return testCaseDescription;
	}
	public void setTestCaseDescription(String testCaseDescription) {
		this.testCaseDescription = testCaseDescription;
	}
	public String getTestCaseName() {
		return testCaseName;
	}
	public void setTestCaseName(String testCaseName) {
		this.testCaseName = testCaseName;
	}
	public String getJiraID() {
		return jiraID;
	}
	public void setJiraID(String jiraID) {
		this.jiraID = jiraID;
	}
	public boolean isSmokeTest() {
		return smokeTest;
	}
	public void setSmokeTest(boolean smokeTest) {
		this.smokeTest = smokeTest;
	}
	public boolean isSanityTest() {
		return sanityTest;
	}
	public void setSanityTest(boolean sanityTest) {
		this.sanityTest = sanityTest;
	}
	public boolean isRegressionTest() {
		return regressionTest;
	}
	public void setRegressionTest(boolean regressionTest) {
		this.regressionTest = regressionTest;
	}
	public ArrayList<TestStep> getTestSteplist() {
		return testSteplist;
	}
	public void setTestSteplist(ArrayList<TestStep> testSteplist) {
		this.testSteplist = testSteplist;
	}
	public TestResult getTestResult() {
		return testResult;
	}
	public void setTestResult(TestResult testResult) {
		this.testResult = testResult;
	}
	
	

}
