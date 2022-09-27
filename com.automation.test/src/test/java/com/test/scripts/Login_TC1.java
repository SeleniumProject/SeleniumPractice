package com.test.scripts;

import com.aventstack.extentreports.Status;
import com.test.pages.HomePage;
import com.test.pages.RegisterPage;
import com.test.utils.TestBase;

public class Login_TC1 extends TestBase {

	public static void verifyRegisterPage(String fname, String lname, String email, String pass, String confpass) {
		invokeBrowser();
		// Creating object of home page
		HomePage home = new HomePage(driver);

		// Creating object of Login page
		RegisterPage registerPage = new RegisterPage(driver);

		// Click on Register link
		test = extent.createTest("Verify Register functionality", "checking register with valid data");

		home.clickRegisterLink();
		test.log(Status.PASS, "Clicked on Register link successfully");
		// Select the Gender
		registerPage.clickGender();
		test.log(Status.PASS, "Clicked on Gender male radio successfully");
		// Enter FirstName
		registerPage.enterFirstName(fname);
		test.log(Status.PASS, "Entered FirstName successfully "+ fname);
		//Enter LastName
		registerPage.enterLastName(lname);
		test.log(Status.PASS, "Entered LastName successfully "+ lname);
		//Enter Email
		registerPage.enterEmailAddress(email);
		test.log(Status.PASS, "Entered email successfully "+ email);
		//Enter Passsword
		registerPage.enterPassword(pass);
		test.log(Status.PASS, "Entered password successfully "+ pass);
		//Enter Confirm Password
		registerPage.enterConfirmPassword(confpass);
		test.log(Status.PASS, "Entered confirmpass successfully "+ confpass);
		//Click on Register button
		registerPage.clickRegisterButton();
		test.log(Status.PASS, "Clicked Register button successfully");
		extent.flush();
			// Close browser instance
		driver.quit();
	}
	public static void main(String[] args) throws InterruptedException {

		verifyRegisterPage("Raki","Savan","1rakitestjjkh@gmail.com","Gmail@112","Gmail@112");
		verifyRegisterPage("Sravan","kumar","2sravanjj@gmail.com","Gmail@112","Gmail@112");
		verifyRegisterPage("sai","krishna","3saikkjdd@gmail.com","Gmail@112","Gmail@112");
		
	}

}