package Coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class FinalCoding {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=my-account");
             
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@class='login']")).click();
		
		String title = driver.getTitle();
		System.out.println("This is actual title:" +title);
		
		//String expectedtitle = "Website"; (this is the result to show)
		String expectedtitle = driver.getTitle();
		System.out.println("This is expected title: "+expectedtitle);
		
		Assert.assertEquals(expectedtitle, title);
		 
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0, 400)");
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("pankajmail12@yahoo.com");
		
		driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("housegroup123");
		
		driver.findElement(By.xpath("//*[@id='SubmitLogin']")).click();
		
		driver.findElement(By.xpath("(//*[@class='sf-with-ul'])[4]")).click();
		
		//JavascriptExecutor dress = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1200)");
		
		//System.out.println(driver.findElement(By.xpath("(//*[@class='price product-price'])[2]")).getText());
		
		WebElement price1 = driver.findElement(By.xpath("(//*[@class='price product-price'])[2]"));
		WebElement price2 = driver.findElement(By.xpath("(//*[@class='price product-price'])[4]"));
		WebElement price3 = driver.findElement(By.xpath("(//*[@class='price product-price'])[6]"));
		WebElement price4 = driver.findElement(By.xpath("(//*[@class='price product-price'])[8]"));
		WebElement price5 = driver.findElement(By.xpath("(//*[@class='price product-price'])[10]"));
		
		
		ArrayList<String> prices = new ArrayList<String>();
		prices.add(price1.getText());
		prices.add(price2.getText());
		prices.add(price3.getText());
		prices.add(price4.getText());
		prices.add(price5.getText());
		
		for(String pankaj: prices) {
			
			
			System.out.println(pankaj);
			
		}
		  
			Collections.sort(prices,Collections.reverseOrder());
			
			System.out.println("ArrayList in descending order:");
			for(String pankaj: prices) {
				System.out.println(pankaj);
				
			}
				
			WebElement rightblock = driver.findElement(By.xpath("(//*[@class='right-block'])[2]"));
			WebElement addtocart = driver.findElement(By.xpath("(//*[@title='Add to cart'])[2]"));
			WebElement proceedtocheckout = driver.findElement(By.xpath("(//*[@class='icon-chevron-right right'])[2]"));
			
			Actions mouseover = new Actions(driver);
			mouseover.moveToElement(rightblock).perform();
			addtocart.click();
			
			Thread.sleep(2000);
			proceedtocheckout.click();
			
			js.executeScript("window.scrollBy(0, 500)");
		
			//By using get text you get the value for the xpath
			String totalprice = driver.findElement(By.xpath("//*[@id='total_price']")).getText();
			
			
			System.out.println("Verifying total price: " + totalprice);
			
			//String totalexpectedprice = "$52.98";
			
			String totalexpectedprice = "$52.99";
			
			Assert.assertEquals(totalexpectedprice, totalprice);
			
			
			js.executeScript("window.scrollBy(0, -500)");	
			
			
			

			
			
			driver.findElement(By.xpath("//*[@title='Log me out']"));
			
			
			
			Thread.sleep(3000);
				
				driver.close();
				
			}
 

			
			
			
			
		}
		
		
	

