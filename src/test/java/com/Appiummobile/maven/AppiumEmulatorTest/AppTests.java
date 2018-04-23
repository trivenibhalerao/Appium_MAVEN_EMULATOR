package com.Appiummobile.maven.AppiumEmulatorTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppTests {
	AppiumDriver driver;
	
	@Test
	public void testFunction2() {
		String path="C:\\Users\\.....APKNAME.apk";
		File app=new File(path);
		System.out.println("testFunction2 Started...");
		DesiredCapabilities capabilities=new DesiredCapabilities();
		System.out.println("testFunction2 AFTER capabilities...");
		capabilities.setCapability("device", "Android");
        capabilities.setCapability("deviceName","3.7_WVGA_Nexus_One_API_22");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion", "5.1");
        capabilities.setCapability("app", app.getAbsolutePath());
               capabilities.setCapability("noReset", "true");
        
        System.out.println("testFunction2 AFTER platformVersion...");
                capabilities.setCapability("unicodeKeyboard", true);
        capabilities.setCapability("resetKeyboard", true);
        
        System.out.println("testFunction2 AFTER resetKeyboard...");

		
		try {
			URL url = new URL("http://localhost:4723/wd/hub");
			driver = new AndroidDriver(url, capabilities);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 System.out.println("testFunction2 AFTER timeouts...");
			 
			 //your Test Script goes here
			 
			 driver.quit();
		} catch (MalformedURLException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("testFunction2 ENDS");
	}
}
