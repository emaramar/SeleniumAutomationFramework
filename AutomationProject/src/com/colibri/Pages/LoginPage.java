/**
 * 
 */
package com.colibri.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author EdjelMaramara
 * 
 * 
 *         This class will store all the locators and methods of login page.
 *
 */
public class LoginPage {

	WebDriver driver;
	// WebElement Locators using page factory

	@FindBy(how = How.ID, using = "usernameInput")
	WebElement username;
	@FindBy(how = How.ID, using = "passwordInput")
	WebElement password;
	@FindBy(how = How.CLASS_NAME, using = "btn")
	WebElement signIn;
	@FindBy(how = How.LINK_TEXT, using = "Logout")
	WebElement logOut;
	@FindBy(how = How.XPATH, using = "//a[@class='dropdown-toggle']")
	WebElement toggle;
	@FindBy(how = How.XPATH, using = "//a[@href='/Snop/Home']")
	WebElement clickSnop;

	// Constructor
	public LoginPage(WebDriver driver) { // The Constructor will just initialize
											// the WebDriver.
		this.driver = driver;
	}

	// Method
	public void LoginSnOP(String uid, String pwd) throws InterruptedException {
		username.sendKeys(uid);
		password.sendKeys(pwd);
		signIn.click();
		Thread.sleep(3000);
		toggle.click();
		clickSnop.click();

	}

	public void LogoutSnOP() {
		logOut.click();
	}

}
