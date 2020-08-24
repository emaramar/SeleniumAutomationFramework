package com.colibri.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.colibri.Pages.DataManagementPage;
import com.colibri.Pages.HomePage;
import com.colibri.Pages.LoginPage;

public class VerifyDataManagement {

	@Test
	public void VerifyResource() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\EdjelMaramara\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://dev1-snop.colibri-aps.com/");

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		DataManagementPage dataMng = PageFactory.initElements(driver, DataManagementPage.class);

		login.LoginSnOP("superadmin", "DeVP@$$eW0rd2014!");
		home.clickHomePageTab("data management");
		dataMng.ClickResourceCalendar();
		dataMng.TickResourceCheckbox("domestic production barc");
		dataMng.ClickEditResourceBtn();
		Thread.sleep(3000);
		dataMng.CloseResourceBtn();
		//dataMng.ClickSplitStrategy();

		//login.LogoutSnOP();
		//driver.quit();

	}

}
