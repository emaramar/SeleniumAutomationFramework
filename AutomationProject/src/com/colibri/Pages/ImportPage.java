package com.colibri.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ImportPage {

	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//input[@id='FileName']")
	WebElement uploadBtn;
	@FindBy(how = How.ID, using = "validation-upload-snop-btn")
	WebElement startImportBtn;
	@FindBy(how = How.LINK_TEXT, using = "Run SnOP Upload")
	WebElement runSnopUploadLnk;
	@FindBy(how = How.LINK_TEXT, using = "Upload History")
	WebElement uploadHistoryLnk;
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-default']")
	WebElement closeBtn;

	// Constructor
	public ImportPage(WebDriver driver) { // The Constructor will just
											// initialize the WebDriver driver.
		this.driver = driver;
	}

	public void clickUploadBtn() {
		uploadBtn.sendKeys("C:\\Users\\EdjelMaramara\\Documents\\Colibri docu\\SnOPImportTemplateProtoJUS - Copy.xlsx");
		startImportBtn.click();
	}

	public void clickRunSnOpUploadLnk() {
		runSnopUploadLnk.click();
	}

	public void clickUploadHistoryLink() {
		uploadHistoryLnk.click();
	}

	public void clickCloseBtn() {
		closeBtn.click();
	}

}
