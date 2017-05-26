package automation.config;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.android.AndroidDriver;

public interface DriverSetup {

    WebDriver getWebDriverObject(DesiredCapabilities desiredCapabilities);
    
    //Huy - 7/3
    
    //AndroidDriver getAndroidDriverObject(DesiredCapabilities desiredCapabilities);
    //IOSDriver getIOSDriverObject(DesiredCapabilities desiredCapabilities);

    DesiredCapabilities getDesiredCapabilities(Proxy proxySettings);
}