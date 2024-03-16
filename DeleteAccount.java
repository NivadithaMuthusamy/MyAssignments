package salesforceapplication;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class DeleteAccount {

	public static void main(String[] args) throws IOException {
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
				
				//6.Click on the displayed Account Dropdown icon and select Delete
				driver.findElement(By.xpath("(//span[@class='slds-grid slds-grid--align-spread'])[3]")).click();
				driver.findElement(By.xpath("//div[text()='Delete']/parent::a")).click();
				driver.findElement(By.xpath("//button[@title='Delete']")).click();
				
				
				
				//7.Click on New button
				driver.findElement(By.xpath("//div[text()='New']/parent::a")).click();
				
				
				//8. Enter 'your name' as account name
				driver.findElement(By.xpath("(//input[@class='slds-input'])[5]")).sendKeys("Nivaditha");
				
				//9.verify whether the account is deleted
				
				 driver.findElement(By.xpath("(//button[@class='slds-button slds-button_brand'])[3]")).click();
				 String text = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
				 System.out.println(text);
				  
				 //10.close the browser
				 // driver.close();
	}

}
