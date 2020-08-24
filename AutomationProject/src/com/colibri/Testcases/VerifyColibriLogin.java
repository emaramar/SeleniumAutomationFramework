/**
 * 
 */
package com.colibri.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.colibri.Pages.HomePage;
import com.colibri.Pages.ImportPage;
import com.colibri.Pages.LoginPage;

/**
 * @author EdjelMaramara
 * 
 *         This class will launch browser and perform the LogIn and then close
 *         the browser.
 * 
 *
 */
public class VerifyColibriLogin {

	@Test
	public void VerifyValidLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\EdjelMaramara\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://dev5-snop.colibri-aps.com/");

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		//ImportPage imporT = PageFactory.initElements(driver, ImportPage.class);

		login.LoginSnOP("superadmin", "DeVP@$$eW0rd2014!");
		
		String mystr = driver.findElement(By.xpath("//div[@class='c-welcome-txt']")).getText();
		Assert.assertTrue(mystr.contains("Welcome to Colibri!"), "Actual message match the expected message.");
		System.out.println("System displays the message: " + mystr);

		login.LogoutSnOP();
		driver.quit();

	}

}
