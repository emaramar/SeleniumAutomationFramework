package com.colibri.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DataManagementPage {

	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-calendar-check-o']")
	WebElement resourceCalendar;
	@FindBy(how = How.XPATH, using = "//a[@href='/Snop/FamilyLocationHead']")
	WebElement familyLocationHead;
	@FindBy(how = How.XPATH, using = "//a[@href='/Snop/SplitStrategy']")
	WebElement splitStrategy;
	@FindBy(how = How.XPATH, using = "//*[@class='k-button k-button-icontext k-grid-Edit']")
    WebElement editResource; 
	@FindBy(how = How.XPATH, using = "//*[@id='btnClose']/a/span")
	WebElement closeResource;
	
	
	// Constructor will initializes instances (objects) of that class.
	public DataManagementPage(WebDriver driver) { 
													
		this.driver = driver;
	}

	public void ClickResourceCalendar() {
		resourceCalendar.click();
	}
	
	public void TickResourceCheckbox(String resourceName) {
		List<WebElement> rows_table = driver.findElements(By.xpath("//*[@role='grid']/tbody/tr"));
		// To calculate no of rows In table.
		int rows_count = rows_table.size();
		//System.out.println("Rows count:" + rows_count);

		// *[@role='grid']/tbody/tr[1]/td[1]
		//String resourceName = "Domestic Production MELB";
		String beforeXpath = "//*[@role='grid']/tbody/tr[";
		String afterXpath = "]/td[2]";
		String checkboxAfterXpath = "]/td[1]";

		for (int i = 1; i <= rows_count; i++) {
			String actualXpath = beforeXpath + i + afterXpath;
			String actualcheckboxXpath = beforeXpath + i + checkboxAfterXpath;
			WebElement elemVal = driver.findElement(By.xpath(actualXpath));
			//System.out.println("Name of Resource: " + elemVal.getText() + " at position : " + i);
			if (elemVal.getText().equalsIgnoreCase(resourceName)) {
				driver.findElement(By.xpath(actualcheckboxXpath)).click();
				System.out.println("Resource is found :" + elemVal.getText() + " at position : " + i);
			}
		}
			
	}
	
	public void ClickEditResourceBtn(){
		editResource.click();
	}
	
	public void CloseResourceBtn(){
		closeResource.click();
	}

	public void ClickFamilyLocationHead() {
		familyLocationHead.click();
	}

	public void ClickSplitStrategy() {
		splitStrategy.click();
	}
}
