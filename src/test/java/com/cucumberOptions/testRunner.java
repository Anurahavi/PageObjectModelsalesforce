package com.cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="Features",
		glue= {"com.stepDefintions"}
		)
public class testRunner {

}
