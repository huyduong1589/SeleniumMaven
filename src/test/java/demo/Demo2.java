package demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.utils.web.WebElementSupport2;
import automationCore.DriverFactory;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import java.util.concurrent.TimeUnit;

public class Demo2 extends DriverFactory {

    @Test
    @Parameters("waitTime")
    public void googleCheeseExample(int waitTime) throws Exception {
    	System.out.println("Report is stored under: " + System.getProperty("reportDir"));
        WebDriver driver = getDriver();
    	//FirefoxDriver driver = new FirefoxDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://webmail.tma.com.vn/");
        WebElementSupport2.findElementSupport(driver, new By.ById("username"), 10).sendKeys("dmhuy1234");
        //WebElement userName = driver.findElement(By.id("username"));
        //userName.sendKeys("dmhuy");
        
        //automation.utils.web.WebElementSupport2.clickSupport(userName, 20, 1000);
        
        driver.findElement(By.id("password")).sendKeys("     ");
        driver.findElement(By.id("password")).submit();
        Thread.sleep(10000);
        String currnetURL = driver.getCurrentUrl();
        System.out.println("Current URL: " + currnetURL);
        Assert.assertTrue(currnetURL.matches("https://webmail.tma.com.vn/#1"));
        Thread.sleep(20000);
        WebElementSupport2.findElementSupport(driver, new By.ByXPath("q"), 10);
    }

}
