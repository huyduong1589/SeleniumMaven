package bdd.runners;

import org.testng.annotations.Test;

import automationCore.DriverFactory;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
public class SeleRunner extends DriverFactory {
	@CucumberOptions(features = "src/test/resources/Bdd/features/",
			glue = "bdd.steps",
                        tags = {"@selenium"},
			format = {"pretty:target/cucumber/selenium-pretty.txt","html:target/cucumber/selenium","json:target/cucumber/selenium.json","junit:target/cucumber/selenium-results.xml"})
	public class Test extends AbstractTestNGCucumberTests {
		
	}
}
