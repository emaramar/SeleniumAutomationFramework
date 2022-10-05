package Exercises;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestJava {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\EdjelMaramara\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://dev1-snop.colibri-aps.com/");
		driver.findElement(By.id("usernameInput")).sendKeys("superadmin");
		driver.findElement(By.id("passwordInput")).sendKeys("DeVP@$$eW0rd2014!");
		driver.findElement(By.className("btn")).click();
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		driver.findElement(By.xpath("//a[@href='/Snop/Home']")).click();
		driver.findElement(By.linkText("Data management")).click();
		
		driver.findElement(By.xpath("//*[@id='page_header']/nav/div[2]/span[1]/span")).click();
		
		String Index = "5";
		String beforeXpath = "//*[@id='UserViewFiltersList_listbox']/li[@data-offset-index=";
		String afterXpath = "]";
		
		String actualXpath = beforeXpath+Index+afterXpath;
		driver.findElement(By.xpath(actualXpath)).click();
		
		//*[@id="UserViewFiltersList_listbox"]/li[3]
				
		/*driver.findElement(By.xpath("//*[@class='k-button k-button-icontext k-grid-Edit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='btnClose']/a/span")).click();
		// *[@id="resourcecalendar-grid"]/div[1]/a
		driver.findElement(By.linkText("Logout")).click();
		driver.close();*/
	}

}
