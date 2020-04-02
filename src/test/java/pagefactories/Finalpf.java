package pagefactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Finalpf {
	
	WebDriver driver;
	
	 public Finalpf (WebDriver driver1) {
		  
		  this.driver = driver1;
		  
		  PageFactory.initElements(driver1, this);
		  
	 }
	 
	 
	@FindBy(how=How.XPATH, using="//*[@class='login']")
	private WebElement loginbutton;

	@FindBy(how=How.XPATH, using="//*[@id='email']")
	private WebElement email;
	
	@FindBy(how=How.XPATH, using="//*[@id='passwd']")
	private WebElement password;
	
	@FindBy(how=How.XPATH, using="//*[@id='SubmitLogin']")
	private WebElement signin;
	
	@FindBy(how=How.XPATH, using="(//*[@class='sf-with-ul'])[4]")
	private WebElement dressbutton;
	
	@FindBy(how=How.XPATH, using="//*[@itemprop='price'")
	private WebElement pricevalues;
	
	@FindBy(how=How.XPATH, using="(//*[@class='price product-price'])[2]")
	private WebElement price1;
	
	@FindBy(how=How.XPATH, using="(//*[@class='price product-price'])[4]")
	private WebElement price2;
	
	@FindBy(how=How.XPATH, using="(//*[@class='price product-price'])[6]")
	private WebElement price3;
	
	@FindBy(how=How.XPATH, using="(//*[@class='price product-price'])[8]")
	private WebElement price4;
	
	@FindBy(how=How.XPATH, using="(//*[@class='price product-price'])[10]")
	private WebElement price5;
	
	@FindBy(how=How.XPATH, using="(//*[@class='right-block'])[2]")
	private WebElement rightblock;
	
	@FindBy(how=How.XPATH, using="(//*[@title='Add to cart'])[2]")
	private WebElement addtocart;
	
	@FindBy(how=How.XPATH, using="(//*[@class='icon-chevron-right right'])[2]")
	private WebElement proceedtocheckout;
	
	@FindBy(how=How.XPATH, using="//*[@id='total_price']")
	private WebElement verifytotalprice;
	
	@FindBy(how=How.XPATH, using="//*[@title='Log me out']")
	private WebElement logout;

	
	
	
	
	
	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public void setLoginbutton(WebElement loginbutton) {
		this.loginbutton = loginbutton;
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getSignin() {
		return signin;
	}

	public void setSignin(WebElement signin) {
		this.signin = signin;
	}

	public WebElement getDressbutton() {
		return dressbutton;
	}

	public void setDressbutton(WebElement dressbutton) {
		this.dressbutton = dressbutton;
	}

	public WebElement getPricevalues() {
		return pricevalues;
	}

	public void setPricevalues(WebElement pricevalues) {
		this.pricevalues = pricevalues;
	}

	public WebElement getPrice1() {
		return price1;
	}

	public void setPrice1(WebElement price1) {
		this.price1 = price1;
	}

	public WebElement getPrice2() {
		return price2;
	}

	public void setPrice2(WebElement price2) {
		this.price2 = price2;
	}

	public WebElement getPrice3() {
		return price3;
	}

	public void setPrice3(WebElement price3) {
		this.price3 = price3;
	}

	public WebElement getPrice4() {
		return price4;
	}

	public void setPrice4(WebElement price4) {
		this.price4 = price4;
	}

	public WebElement getPrice5() {
		return price5;
	}

	public void setPrice5(WebElement price5) {
		this.price5 = price5;
	}

	

	public WebElement getRightblock() {
		return rightblock;
	}

	public void setRightblock(WebElement rightblock) {
		this.rightblock = rightblock;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public void setAddtocart(WebElement addtocart) {
		this.addtocart = addtocart;
	}

	public WebElement getProceedtocheckout() {
		return proceedtocheckout;
	}

	public void setProceedtocheckout(WebElement proceedtocheckout) {
		this.proceedtocheckout = proceedtocheckout;
	}

	public WebElement getVerifytotalprice() {
		return verifytotalprice;
	}

	public void setVerifytotalprice(WebElement verifytotalprice) {
		this.verifytotalprice = verifytotalprice;
	}

	public WebElement getLogout() {
		return logout;
	}

	public void setLogout(WebElement logout) {
		this.logout = logout;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
