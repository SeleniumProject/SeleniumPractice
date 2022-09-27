package com.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

	WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public RegisterPage(WebDriver driver) {
          this.driver = driver;
	}
	
	//Locator for username field
	By gender = By.id("gender-male");
	
	// Name
	By fname = By.name("FirstName");
	
	// LastName
	
	By lname = By.id("LastName");
	//Locator for password field
	By pswd = By.name("Password");
	
	//Locator for login button
	By email = By.id("Email");
	// confirm pass
	 By confirmpass = By.name("ConfirmPassword");
	
	// Register
	 
	 By Registerbtn = By.id("register-button");
	//Method to enter password
	public void enterPassword(String pass) {
	
		driver.findElement(pswd).sendKeys(pass);
	}
	

	public void clickGender() {

	driver.findElement(gender).click();
	}

	public void enterFirstName(String value) {

		driver.findElement(fname).sendKeys(value);
		
	}

	public void enterLastName(String value) {

		driver.findElement(lname).sendKeys(value);
		
	}

	public void enterEmailAddress(String string) {
	
		driver.findElement(email).sendKeys(string);
		
	}

	public void enterConfirmPassword(String string) {

	driver.findElement(confirmpass).sendKeys(string);
		
	}

	public void clickRegisterButton() {
	
	driver.findElement(Registerbtn).click();
		
	}




}