package bdd.runners;

import org.testng.annotations.Test;

import automationCore.DriverFactory;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
public class GoogleRunner extends DriverFactory {
	@CucumberOptions(features = "src/test/resources/Bdd/features/",
			glue = "bdd.steps.SeleniumDownload",
                        tags = {"@google"},
			format = {"pretty:target/cucumber/google-pretty.txt","html:target/cucumber/google","json:target/cucumber/google.json","junit:target/cucumber/google-results.xml"})
	public class Test extends AbstractTestNGCucumberTests {
		
	}
}
