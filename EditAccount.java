package salesforceapplication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class EditAccount {

	public static void main(String[] args) throws InterruptedException {
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
				
				
				//7) Click on the displayed Account Dropdown icon and select Edit
				driver.findElement(By.xpath("(//span[@class='slds-grid slds-grid--align-spread'])[3]")).click();
				driver.findElement(By.xpath("//a[@title='Edit']")).click();
				
				 WebElement element = driver.findElement(By.xpath("//label[text()='SIC Code']"));
				 Actions builder=new Actions(driver);
				 builder.scrollToElement(element).perform();
				 
				 
				//8) Select Type as Technology Partner
				 driver.findElement(By.xpath("(//label[text()='Type']/following::div)[1]")).click();
				 driver.findElement(By.xpath("//span[text()='Technology Partner']")).click();
				 
				 //scroll till shipping street to click industry
				
				 WebElement element2 = driver.findElement(By.xpath("//label[text()='Shipping Street']"));
				 Actions builder1=new Actions(driver);
				 builder1.scrollToElement(element2).perform();
				 
				 
				 //9) Select Industry as Healthcare 
				 driver.findElement(By.xpath("(//label[text()='Industry']/following::div)[1]")).click();
				 
				 //scroll till insurance to select Healthcare
				 
				 WebElement element3 = driver.findElement(By.xpath("//span[text()='Insurance']"));
				 Actions builder2=new Actions(driver);
				 builder2.scrollToElement(element3).perform();
				 
				 driver.findElement(By.xpath("//span[text()='Healthcare']")).click();
				 
				 
				//10)Enter Billing Address
				 
				 //scroll till SLA to enter billing address and shipping address
				 
				 WebElement element4 = driver.findElement(By.xpath("//label[text()='SLA']"));
				 Actions builder3=new Actions(driver);
				 builder3.scrollToElement(element4).perform();
				 
				 driver.findElement(By.xpath("(//textarea[@name='street'])[1]")).sendKeys("Erikkarai street,East tambaram,Galaxy Homes,BlockA,First Floor,FlatNo:A3");
				//11)Enter Shipping Address
				 
				 driver.findElement(By.xpath("(//textarea[@name='street'])[2]")).sendKeys("Meenakshi sundaram street,Ayyappa nagar,kk nagar,plotNo:42B");
				 
				 //scroll untill upsell oppurtunity to select customer priority as low
				 
				 WebElement element5 = driver.findElement(By.xpath("//label[text()='Upsell Opportunity']"));
				 Actions builder4=new Actions(driver);
				 builder4.scrollToElement(element5).perform();
				//12)Select Customer Priority as Low
				 
				 driver.findElement(By.xpath("(//label[text()='Customer Priority']/following::button)[1]")).click();
				 driver.findElement(By.xpath("//span[text()='Low']/parent::span")).click();
				 
				 
				//13)Select SLA as Silver
				 
				 driver.findElement(By.xpath("(//label[text()='SLA']/following::button)[1]")).click();
				 driver.findElement(By.xpath("//span[text()='Silver']")).click();
				 
				//14) Select Active as NO 
				 
				 //scroll untill description to enter active no
				 
				 WebElement element6 = driver.findElement(By.xpath("//label[text()='Description']"));
				 Actions builder5=new Actions(driver);
				 builder5.scrollToElement(element6).perform();
				 
				 driver.findElement(By.xpath("(//label[text()='Active']/following::button)[1]")).click();
				 driver.findElement(By.xpath("//span[text()='No']")).click();
				 
				 
				 //16)Select Upsell Oppurtunity as No
				 
				 driver.findElement(By.xpath("(//label[text()='Upsell Opportunity']/following::button)[1]")).click();
				 driver.findElement(By.xpath("(//span[text()='No'])[1]")).click();
				 
				//15) Enter Unique Number in Phone Field
				 
				 //scroll upto rating to enter phone no
				 
				 WebElement element7 = driver.findElement(By.xpath("//label[text()='Rating']"));
				 Actions builder6=new Actions(driver);
				 builder6.scrollToElement(element7).perform();
				 
				 Thread.sleep(3000);
				 driver.findElement(By.xpath("//input[@name='Phone']")).clear();
				 driver.findElement(By.xpath("//input[@name='Phone']")).sendKeys("7904664489");
				 
				 
				 
				//17)Click on save and verfiy Phone number
				 
				 driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
				 String text = driver.findElement(By.xpath("//span[text()='(790) 466-4489']")).getText();
				 System.out.println("The phone No is:"+text);
	}			

}
