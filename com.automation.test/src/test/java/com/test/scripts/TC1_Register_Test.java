package com.test.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.server.HomeBaseWarning;

import com.test.pages.HomePage;
import com.test.utils.TestBase;
public class TC1_Register_Test extends TestBase{


	public void setup() throws InterruptedException {
		invokeBrowser();
	
		HomePage homePage = new HomePage(driver);
		System.out.println("Step2");
		driver.findElement(By.className("ico-register")).click();
		System.out.println("Step3");
	}
	
	public static void VerifyIfUserabletoRegisterToWebsiteWithValidData() {
		
		
	}
	
	
	public static void main(String[] args) {
		invokeBrowser();
		VerifyIfUserabletoRegisterToWebsiteWithValidData();
		
	}

}
