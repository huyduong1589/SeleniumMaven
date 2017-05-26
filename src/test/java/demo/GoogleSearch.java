package demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automationCore.DriverFactory;

import org.testng.annotations.AfterTest;
import java.util.concurrent.TimeUnit;

public class GoogleSearch extends DriverFactory {

    @Test
    @Parameters("waitTime")
    public void googleCheeseExample(int waitTime) throws Exception {

        WebDriver driver = getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.google.com");
        //if (getProtocol().equals("selenium")) {
            driver.manage().window().maximize();
        //}
        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));

        // Enter something to search for
        element.clear();
        element.sendKeys("Cheese!");

        // Now submit the form. WebDriver will find the form for us from the element
        element.submit();

        // Check the title of the page
        logger.info("Page title is: " + driver.getTitle());

        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
        (new WebDriverWait(driver, waitTime)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("cheese!");
            }
        });

        // Should see: "cheese! - Google Search"
        logger.info("Page title is: " + driver.getTitle());
    }

}
