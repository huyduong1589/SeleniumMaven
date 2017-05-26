package demodataprovider;


import automation.utils.data.CommonData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.interactions.HasTouchScreen;
import org.openqa.selenium.interactions.TouchScreen;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;
import java.io.File;
import io.appium.java_client.*;
import automation.utils.web.*;
import automationCore.DriverFactory;

public class NewTourRegister extends DriverFactory {

    @Test(dataProvider="userData")
    public void NewTourRegister(String username, String password, String firstname, String lastname, String addr, String city, String country, String email) throws Exception {

        WebDriver driver = getDriver();
        StringBuffer verificationErrors = new StringBuffer();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        driver.get("http://newtours.demoaut.com/");
        //driver.manage().window().maximize();
        //driver.findElement(By.linkText("REGISTER")).click();
        WebUtil.findElementText(driver,"REGISTER").click();
        driver.findElement(By.name("firstName")).sendKeys(firstname);
        driver.findElement(By.name("lastName")).sendKeys(lastname);
        driver.findElement(By.name("phone")).sendKeys("123456789");
        driver.findElement(By.name("userName")).sendKeys(username);
        driver.findElement(By.name("address1")).sendKeys(addr);
        driver.findElement(By.name("city")).sendKeys(city);
        Select select = new Select(driver.findElement(By.name("country")));
        select.selectByVisibleText(country);
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("confirmPassword")).sendKeys(password);
        WebUtil.click(driver, By.name("register"));
        logger.info("Page title is: " + driver.getTitle() + " " + firstname);
        // Body should contain "Thank you for registering"
        final String expectstring = "Dear " + firstname + " " + lastname;
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.findElement(By.tagName("body")).getText().contains(expectstring);
            }
        });
        int deadlink = UrlUtil.validateInvalidLinks(driver);
    }

    @DataProvider(name="userData", parallel = false)
    public Object[][] loginData() {
        String workingDir = System.getProperty("user.dir");
        Object[][] arrayObject = CommonData.getExcelData(workingDir + File.separator + "data" + File.separator + "user.xls","Sheet1");
        return arrayObject;
    }

}
