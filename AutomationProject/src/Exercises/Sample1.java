package Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample1 {

	public static void main(String[] args) throws InterruptedException {
				
		System.setProperty("webdriver.gecko.driver","C:\\Users\\EdjelMaramara\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://dev5-snop.colibri-aps.com/");
		driver.findElement(By.id("usernameInput")).sendKeys("superadmin");
		driver.findElement(By.id("passwordInput")).sendKeys("DeVP@$$eW0rd2014!");
		driver.findElement(By.className("btn")).click();
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		driver.findElement(By.xpath("//a[@href='/Snop/Home']")).click();
		driver.findElement(By.linkText("Data management")).click();
		driver.findElement(By.xpath("//a[@href='/Snop/SplitStrategy']")).click();
				
		Thread.sleep(3000);
		try {
			WebElement firstInput = driver.findElement(By.xpath("//div[@class='k-grid-content k-auto-scrollable']/table[1]/tbody/tr/td[1]")); 
			firstInput.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
		// driver.findElement(By.linkText("Logout")).click();
		// driver.close();

		}

	}

