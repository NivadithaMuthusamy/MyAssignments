package Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		//search 1 plus 9 pro
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
		//click search button
		driver.findElement(By.id("nav-search-submit-button")).click();
		//get the price of the first product
		WebElement price = driver.findElement(By.xpath("//span[text()='31,990']"));
		System.out.println("price ="+price.getText());
		WebElement ratings = driver.findElement(By.xpath("//span[@class='a-icon-alt']/parent::i"));
		System.out.println(ratings);
		
		//click on the first text link of first image
		driver.findElement(By.xpath("//span[text()='(Refurbished) OnePlus 9 Pro 5G (Morning Mist, 8GB RAM, 128GB Storage)']")).click();
		
		//click on add to cart
		Set<String> newWindow = driver.getWindowHandles();
		List<String> childWindow=new ArrayList<String>(newWindow);
		driver.switchTo().window(childWindow.get(1));
		 driver.findElement(By.id("add-to-cart-button")).click();
		 
		//get the cart subtotal
		// Thread.sleep(3000);
		 WebElement cartTotal = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']"));
		System.out.println(cartTotal);
		//close the browser
		driver.quit();
		
		
	}

}
