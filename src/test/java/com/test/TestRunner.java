package com.test;

import org.apache.commons.lang.math.JVMRandom;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.json.Json;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, features = "src\\test\\resources\\Features", glue = "com.stepdef", plugin = {
		"pretty", "json:\\src\\test\\resources\\Features\\Reports\\reports.json",
		"junit:\\src\\test\\resources\\Features\\Reports\\report.xml" })
public class TestRunner {

	@AfterClass
	private static void afterClass() {
		
		 
		

	}

}
