package ebaysearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ebay {

	public static void main(String[] args) throws InterruptedException {
		
		//Browser launcher
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hamza  Sultani\\Desktop\\Selenium\\chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ebay.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//Product Search
		driver.findElement(By.id("gh-ac")).sendKeys("JBL Speakers");
		Thread.sleep(2000);
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("gh-p")).click();
		//Navigate
		Thread.sleep(2000);
		driver.navigate().to("https://www.simplilearn.com/");
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.quit();
	}

}
