package com.common.cucumber.zoho.runners;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
		features="src/test/resources/features/validateCRM.feature",
		glue="com.common.cucumber.zoho.steps"
			
		)



public class ValidateCRMFeatureRunner {
	
	
	@Test
	public void runCukes() {
		
		new TestNGCucumberRunner(getClass()).runCukes();
		
	}

}
