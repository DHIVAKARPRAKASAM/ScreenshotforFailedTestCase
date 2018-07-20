package com.qa.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestScreenShot {
public static WebDriver driver;
	
	public static void Initialize() {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://www.google.com");
		
	}
	public static void FailedScreenShot(String MethodName) throws IOException {
	
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("C:\\Users\\dhiva\\eclipse-workspace\\"
				+ "ScreenShotForFailedCase\\ScreenShot\\"+MethodName+"fail_.png"));	

		
	}
	
}
