package com.test.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestBase {

	 public static  WebDriver driver;
	 public static ExtentTest test;
	 public static ExtentReports extent;
	public  static ExtentHtmlReporter htmlReporter ;
	public static  void invokeBrowser() {
		// Create a Webdriver Instance
		 htmlReporter = new ExtentHtmlReporter("extent.html");
		 
		// create ExtentReports and attach reporter(s)
		 extent = new ExtentReports();
		
		extent.attachReporter(htmlReporter);
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rkautomationlab\\eclipse-workspace\\com.automation.test\\src\\test\\resources\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		// Navigate to Site Url .
		driver.get("https://demowebshop.tricentis.com/");
		// Maximize the Browser
		driver.manage().window().maximize();
	
	}
}
