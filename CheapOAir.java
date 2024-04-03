package Automation1;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheapOAir {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.cheapoair.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		
		//1. Click one Way
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]")).click();
		
		//2.click close button in from destination
		
		driver.findElement(By.xpath("(//a[@role='button'])[5]")).click();
		
		//3.Enter from dest
		
		driver.findElement(By.xpath("(//input[@class='form-control pr-4'])[1]")).sendKeys("Chenani");
		
		//4.click close button in To destination
		
		driver.findElement(By.xpath("(//a[@role='button'])[6]")).click();
		
		//5.Enter to dest
		
		driver.findElement(By.xpath("(//input[@class='form-control pr-4'])[2]")).sendKeys("Singapore");
		
		//6.Enter depart date
		
		
		driver.findElement(By.xpath("//input[@class='form-control']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='4'])[1]")).click();
		
		//7.Select the passengers
		
		driver.findElement(By.xpath("//a[@id='travellerButton']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='addadults']")).click();
		Thread.sleep(3000);
		//8.Click Search flights
		
		driver.findElement(By.xpath("//input[@id='searchNow']")).click();
		Thread.sleep(3000);
		
		//9.Print the price from high to low
		
		List<WebElement> filght_charge = driver.findElements(By.xpath("//span[@class='currency text-nowrap']"));
		Thread.sleep(3000);
		for(int i=0;i<filght_charge.size();i++) {
			String text = filght_charge.get(i).getText().replaceAll("USD", "");
			System.out.println(text);
		}
			
			String[] flightprice= {" 688.80"," 773.70"," 683.99"," 771.90"," 820.99"," 688.80"," 829.90"," 773.70"," 771.90","608.82"};
					Arrays.sort(flightprice,Collections.reverseOrder());
					 System.out.println("Flight charges in descending order is:"+Arrays.toString(flightprice));
					 
		//10. Print the lowest price
	      String text = driver.findElement(By.xpath("(//span[@class='currency text-nowrap'])[1]")).getText();
	      System.out.println("The lowest flight charge is:"+text);
	}
			
		}
		
		
	


