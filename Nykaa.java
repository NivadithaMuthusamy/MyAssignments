package Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		//mouse hover on the brands and search for l'oreal paris
		WebElement brands = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions builder=new Actions(driver);
		builder.moveToElement(brands).perform();
		Thread.sleep(2000);
		//click on L
		driver.findElement(By.xpath("//a[text()='L']")).click();
		//click on l'oreal paris
		driver.findElement(By.linkText("L'Oréal Paris")).click();
		//get title l'oreal paris
		String title = driver.getTitle();
		System.out.println(title);
		//click on sort by and click on top rated
		driver.findElement(By.xpath("//span[@class='sort-name']")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		//click on catogory
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		//click on hair
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		//click on haircare
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		//click on shampoo
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		//click concern
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		//click colour protection
		driver.findElement(By.xpath("//span[text()='Colour Protection']")).click();
		//click on colour protection shampoo
        driver.findElement(By.xpath("//div[contains(text(),'Colour Protect Shampoo')]")).click();
		
      // GO to the new window and select size as 175ml
		Set<String> newWindow = driver.getWindowHandles();
		List<String> productWindow = new ArrayList<String>(newWindow);
		driver.switchTo().window(productWindow.get(1));
		driver.findElement(By.xpath("//span[text()='180ml']")).click();
		
    // Print the MRP of the product
		System.out.println("MRP: "+driver.findElement(By.xpath("//span[text()='MRP:']/following::span")).getText());
		
      // Click on ADD to BAG
		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		
     // Go to Shopping Bag 
		driver.findElement(By.xpath("//button[@class='css-aesrxy']")).click();
		
      // Print the Grand Total amount
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		String price = driver.findElement(By.xpath("//div[@class='css-15py5ir e25lf6d2']/span")).getText();
		int grandTotal = convertToInt(price);
		System.out.println("Grand Total: "+grandTotal);
		
      //Click Proceed
        Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		
      // Click on Continue as Guest
		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		
       // Check if this grand total is the same in step 14
		driver.findElement(By.xpath("//div[@data-testid='back_button']")).click();
		driver.findElement(By.xpath("(//span[@data-testid='end-icon'])[2]")).click();
		String price2= driver.findElement(By.xpath("(//div[@class='css-vlqrtx e1d9ugpt3'])[3]")).getText();
		int finalPrice = convertToInt(price2);
		System.out.println("Final price: "+finalPrice);
		
		if(grandTotal==finalPrice) {
			System.out.println("Price is validated");
		}else {
			System.out.println("Price is mismatching");
		}
		// Close all windows
		driver.quit();
	}
	
	public static int convertToInt(String a) {
		String replaceAll = a.replaceAll("\\D", "");
		int parseInt = Integer.parseInt(replaceAll);
		
		return parseInt ;
	}

		
		
		
	}


