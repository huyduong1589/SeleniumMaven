package bdd.steps.SeleniumDownload;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.Assert;

import automationCore.DriverFactory;

public class StepDefinitions_bk extends DriverFactory {
	WebDriver driver;
    @Before
    public void beforeScenario() throws Exception {
        driver = getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Given("^I navigate to page at \"(.*?)\" address$")
    public void i_am_on_the_Selenium_homepage(String url) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
        driver.get(url);
    }

    @When("^I click \"(.*?)\" link$")
    public void i_click_tab(String tab) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.linkText(tab)).click();
    }

    @Then("^I should see \"(.*?)\" appear on page$")
    public void i_should_see_download_link_on_Download_page(String text) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
        String bodyText = driver.findElement(By.tagName("body")).getText();
        Assert.assertTrue(bodyText.contains(text));
    }

    @When("^I enter \"(.*?)\" text into search field$")
    public void i_enter_text_into_search_field(String text) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("q")).sendKeys(text);
    } 

    @And("^click on search button")
    public void user_click_on_search_button() {
        driver.findElement(By.name("btnG")).click();
    }

    @And("click on advance search icon")
    public void click_on_advance_icon() {
        driver.findElement(By.id("abar_button_opt")).click();
    }
         
    @And("click on advance search link")
    public void click_on_advance_link() {
        driver.findElement(By.xpath("//div[text()=\"Advanced search\"]")).click();
    }
         
    @And("click on advance search button")
    public void click_on_advance_button() {
        driver.findElement(By.xpath("//input[@value='Advanced Search']")).click();
    }


    @Then("verify title is \"(.*?)\"")
    public void verify_first_link_text(final String msg) {
        (new WebDriverWait(driver, 5)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().contains(msg);
            }
        });
        Assert.assertTrue(driver.getTitle().contains(msg));
    } 
}

