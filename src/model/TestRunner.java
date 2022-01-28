package model;

import org.junit.runner.JUnitCore;

import org.junit.runner.JUnitCore;
import org.junit.Test;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runners.AllTests;

/**  
* Kai Mwirotsi-Shaw - kimwirotsishaw  
* CIS171 12601 WH1  
* Jan 25, 2022  
*/
public class TestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(AllTests.class);
		
		for (Failure failure : result.getFailures()) {
			 System.out.println(failure.toString());
		}
		
		System.out.println(result.wasSuccessful());
	}
}
