package bdd.runners;

import org.testng.annotations.Test;

import automationCore.DriverFactory;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
public class VNFM_add_and_remove_cloud extends DriverFactory {
	@CucumberOptions(features = "src/test/resources/Bdd/features/",
			glue = "bdd.steps.VNFM",
                        tags = {"@VNFM_Add_and_Remove_Cloud"},
			format = {"pretty:target/cucumber/vnfm-pretty.txt","html:target/cucumber/vnfm","json:target/cucumber/vnfm.json","junit:target/cucumber/vnfm-results.xml"})
	public class Test extends AbstractTestNGCucumberTests {
		
	}
}
