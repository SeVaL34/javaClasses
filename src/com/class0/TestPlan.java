package com.class0;

import java.util.Scanner;

public class TestPlan {

	/*Test Plan:
		Test plan is a technical document describing the scope and activities involved in the testing. It outlines the strategy that will be used to test an application.
		A good test plan contains the following:
		•    What to test?
		•    How to test?
		•    Why to test?
		•    Who will perform the testing?
		•    Where testing will be performed?
		•    When testing will take place?
		Test Scenario Vs Test Case
		What is a Test Scenario?
		Test Scenario is a high-level classification of tests which provides one-line information about what we have to test. Or a Test Scenario is any functionality that can be tested.
		Test Scenario answers “What is to be tested”
		Test Scenario Example: Verify the login functionality
		What is a Test Case?
		Test cases are the set of positive and negative executable steps of a test scenario which has a set of pre-conditions, test data, expected result, post-conditions and actual results.
		Test Case answers “How to be tested”
		Test Case 1: Enter valid User Name and valid Password
		Test Case 2: Enter valid User Name and invalid Password
		And so on….
		What is RTM (Requirement Traceability Matrix)?
		RTM is a document which maps the Requirements with Test cases and Test cases with Defect.
		These are hot topics when it come to Interviews. So please make sure you know the above Artifacts…*/

	 public static void main(String[] args){ 

		 Scanner scan=new Scanner(System.in);
		 String gender=scan.nextLine();
		 int age=scan.nextInt();

		 String F="Women";
		 String M="Man";
		 String G="Girl";
		 String B="Boy";

		 if (age>25 && gender.equals("Women")) {
		    System.out.println("Women");
		 }else if (age>25 && gender.equals(M)) {
		     System.out.println("Man");
		 }else if (age<25 && gender.equals(G)){
		    System.out.println("Girl");
		 }else if(age>25 && gender.equals(B)){
		  System.out.println("Boy");
		 }  
		  }}


