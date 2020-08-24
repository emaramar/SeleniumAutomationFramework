package com.colibri.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.colibri.Pages.HomePage;
import com.colibri.Pages.ImportPage;
import com.colibri.Pages.LoginPage;

public class VerifyUpload {

	@Test
	public void VerifyUploadFile() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\EdjelMaramara\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://dev5-snop.colibri-aps.com/");

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		ImportPage imporT = PageFactory.initElements(driver, ImportPage.class);

		login.LoginSnOP("superadmin", "DeVP@$$eW0rd2014!");
		home.clickHomePageTab("import");
		imporT.clickUploadBtn();
		
		try {
			String mystr = driver.findElement(By.xpath("//*[contains(text(),'Import completed successfully!')]")).getText();
			Assert.assertTrue(mystr.contains("Import completed successfully!"), "Actual message match the expected message.");
			System.out.println("System displays the message: " + mystr);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		imporT.clickCloseBtn();
		login.LogoutSnOP();
		driver.quit();
	}

}
