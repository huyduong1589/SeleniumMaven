package automation.utils.android;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class UiAutomatorSupport {
    public static final Logger logger = LogManager.getLogger("UiAutomatorSupport");
    
    // Find Android Element by Text
    public static WebElement findByText(AndroidDriver driver, String text) {
        WebElement El = driver.findElementByAndroidUIAutomator("new UiSelector().text(" + "\"" + text + "\"" +")");
        logger.info("new UiSelector().text(" + text +")");
        return El;
    }
    
    // Find Android Element by Index
    public static WebElement findByIndex(AndroidDriver driver, String index) {
        WebElement El = driver.findElementByAndroidUIAutomator("new UiSelector().index(" + "\"" + index + "\"" +")");
        return El;
    }
    
    // Find Android Element by Text Contain
    public static WebElement findByTextContains(AndroidDriver driver, String text) {
        WebElement El = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(" + "\"" + text + "\"" +")");
        return El;
    }
    
    // Find Android Element by Description
    public static WebElement findByTextDescription(AndroidDriver driver, String text) {
        WebElement El = driver.findElementByAndroidUIAutomator("new UiSelector().description(" + "\"" + text + "\"" +")");
        return El;
    }
}
