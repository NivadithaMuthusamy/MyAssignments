package salesforceapplication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VerifySorting {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		
		//1.Enter user name
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		
		//2.Enter password
		driver.findElement(By.id("password")).sendKeys("Qeagle@123");
		
		//3.Click login
		driver.findElement(By.id("Login")).click();
		
		//4.Click on the toggle menu button
		driver.findElement(By.className("slds-icon-waffle")).click();
		
		//5.click on viewAll button,click sales option and accounts tab
		driver.findElement(By.xpath("//button[@class='slds-button']")).click();
		driver.findElement(By.xpath("(//div[@class='slds-app-launcher__tile-body slds-truncate'])[2]")).click();
		
		WebElement accounts = driver.findElement(By.xpath("//span[@class='slds-truncate']/parent::a[@title='Accounts']"));
		driver.executeScript("arguments[0].click();",accounts);
		
		
		//6. Click sort arrow in the Account Name to sort in ascending order
		driver.findElement(By.xpath("(//a[@class='toggle slds-th__action slds-text-link--reset '])[1]")).click();
	}

}
