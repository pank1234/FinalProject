package stepdefinitions;

import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pagefactories.Finalpf;



public class FinalStep {
	static JavascriptExecutor js;
	static WebDriver driver1;
	static Finalpf pf;// have to create in order to call from PageFactory page
	ArrayList tabs;
	static Actions mouseover;
	static WebDriverWait explicit;
	
	
	
	
	@Given("^User go to the website$")
	public void user_go_to_the_website() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver1 = new ChromeDriver();
		driver1.get("http://automationpractice.com/index.php?controller=my-account");
		driver1.manage().window().maximize();
		js = (JavascriptExecutor) driver1;
	 mouseover = new Actions(driver1);
	 pf = PageFactory.initElements(driver1, Finalpf.class);
	 explicit = new WebDriverWait(driver1, 20);
	}
	
	@When("^User click on the log in button$")
	public void user_click_on_the_log_in_button() throws Throwable {
		explicit.until(ExpectedConditions.elementToBeClickable(pf.getLoginbutton()));
	    pf.getLoginbutton().click();
	}

	@When("^User enter valid email address and password$")
	public void user_enter_valid_email_address_and_password() throws Throwable {
	    pf.getEmail().sendKeys("pankajmail12@yahoo.com");
	    pf.getPassword().sendKeys("housegroup123");
	}

	@When("^User click on the submit button$")
	public void user_click_on_the_submit_button() throws Throwable {
	   pf.getSignin().click();
	   
	}
	
	
	@When("^User verify the  website title$")
	public void user_verify_the_website_title() throws Throwable {
		explicit.until(ExpectedConditions.titleIs(driver1.getTitle()));
		String title = driver1.getTitle();
		System.out.println("This is actual title:" +title);
		
		//String expectedtitle = "Website"; (this is the result to show)
		String expectedtitle = driver1.getTitle();
		System.out.println("This is expected title: "+expectedtitle);
		
		Assert.assertEquals(expectedtitle, title);
	   
	}

	@Then("^User click on the dress button$")
	public void user_click_on_the_dress_button() throws Throwable {
		explicit.until(ExpectedConditions.elementToBeClickable(pf.getDressbutton()));
	   pf.getDressbutton().click();
	}

	@Then("^User print all the prices values in decending order$")
	public void user_print_all_the_prices_values_in_decending_order() throws Throwable {
		ArrayList<String> prices = new ArrayList<String>();
		explicit.until(ExpectedConditions.visibilityOf(pf.getPrice1()));
		prices.add(pf.getPrice1().getText());
		prices.add(pf.getPrice2().getText());
		prices.add(pf.getPrice3().getText());
		prices.add(pf.getPrice4().getText());
		prices.add(pf.getPrice5().getText());
		
		for(String pankaj: prices) {
			
			
			System.out.println(pankaj);
			
		}
		  
			Collections.sort(prices,Collections.reverseOrder());
			
			System.out.println("ArrayList in descending order:");
			for(String pankaj: prices) {
				System.out.println(pankaj);
			}
				
			
	}

	@Then("^User select the second dress on that list$")
	public void user_select_the_second_dress_on_that_list() throws Throwable {
		mouseover.moveToElement(pf.getRightblock()).perform();
		
		
	}

	@Then("^User click on add to cart$")
	public void user_click_on_add_to_cart() throws Throwable {
	  pf.getAddtocart().click();
	    
	}

	@Then("^User click on proceed to checkout$")
	public void user_click_on_proceed_to_checkout() throws Throwable {
    explicit.until(ExpectedConditions.elementToBeClickable(pf.getProceedtocheckout()));
    pf.getProceedtocheckout().click();
	    
	}

	@Then("^User verify the total price with shipping$")
	public void user_verify_the_total_price_with_shipping() throws Throwable {
		js.executeScript("window.scrollBy(0, 500)");
		
	explicit.until(ExpectedConditions.visibilityOf(pf.getVerifytotalprice()));
		String totalprice = pf.getVerifytotalprice().getText();
		
		
		System.out.println("Verifying total price: " + totalprice);
		
		//String totalexpectedprice = "$52.98";
		
		String totalexpectedprice = "$52.99";
		
		Assert.assertEquals(totalexpectedprice, totalprice);
		
	}

	@Then("^User logout from the website$")
	public void user_logout_from_the_website() throws Throwable {
		js.executeScript("window.scrollTo(0, 0)");	
		
	
		
		explicit.until(ExpectedConditions.elementToBeClickable(pf.getLogout()));
		pf.getLogout().click();
		
		
	}

	@Then("^User close the window$")
	public void user_close_the_window() throws Throwable {
			driver1.close();
	  
	  
	}


	
	

}
