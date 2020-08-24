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
 */
public class HomePage {

	WebDriver driver;

	// WebElement Locators
	@FindBy(how = How.LINK_TEXT, using = "Import")
	WebElement importLink;
	@FindBy(how = How.LINK_TEXT, using = "Data management")
	WebElement dataManLink;
	@FindBy(how = How.LINK_TEXT, using = "Demand Split")
	WebElement demSplitLink;
	@FindBy(how = How.LINK_TEXT, using = "Simulation")
	WebElement SimLink;
	@FindBy(how = How.LINK_TEXT, using = "Demand Planning")
	WebElement demPlanLink;
	@FindBy(how = How.LINK_TEXT, using = "Inventory Plan")
	WebElement invPlanLink;
	@FindBy(how = How.LINK_TEXT, using = "Resource Plan")
	WebElement resPlanLink;
	@FindBy(how = How.LINK_TEXT, using = "Export")
	WebElement exportLink;

	// Constructor
	public HomePage(WebDriver driver) { // The Constructor will just initialize
										// the WebDriver driver.
		this.driver = driver;
	}

	public void clickHomePageTab(String tabName) {
		if (tabName.equalsIgnoreCase("Import")) {
			importLink.click();
		} else if (tabName.equalsIgnoreCase("Data Management")) {
			dataManLink.click();
		} else if (tabName.equalsIgnoreCase("Demand Split")) {
			demSplitLink.click();
		} else if (tabName.equalsIgnoreCase("Simulation")) {
			SimLink.click();
		} else if (tabName.equalsIgnoreCase("Demand Planning")) {
			demPlanLink.click();
		} else if (tabName.equalsIgnoreCase("Inventory Plan")) {
			invPlanLink.click();
		} else if (tabName.equalsIgnoreCase("Resource Plan")) {
			resPlanLink.click();
		} else if (tabName.equalsIgnoreCase("Export")) {
			exportLink.click();
		}
	}

}
