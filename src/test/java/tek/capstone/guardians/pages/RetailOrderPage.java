package tek.capstone.guardians.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.guardians.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id = "search")
	public WebElement ApartmentsdropDown;

	@FindBy(xpath = "//input[@class='search__input']")
	public WebElement seachInputField;

	@FindBy(xpath = "//button[@class='search__btn']")
	public WebElement searchBattn;

	@FindBy(xpath = "//img[@alt='Kasa Outdoor Smart Plug']")
	public WebElement KasaOutdoorSmartPlug;

	@FindBy(xpath = "//select[starts-with(@class,'product__select')]")
	public WebElement ItemQtty;

	@FindBy(id = "addToCartBtn")
	public WebElement addToCartBttn;

	@FindBy(id = "cartQuantity")
	public WebElement CartItemQtty;

	@FindBy(id = "cartBtn")
	public WebElement cartbutton;

	@FindBy(id = "proceedBtn")
	public WebElement ProcessToCheckout;

	@FindBy(xpath = "//button[text()='Place Your Order']")
	public WebElement placeOrder;

	@FindBy(xpath = "//div[text()='Order Placed Successfully']")
	public WebElement OrderplacemetConfiredMssg;

	@FindBy(xpath = "//img[starts-with(@alt,'Apex Legends ')]")
	public WebElement ApexLegend;

	// Cancel order

	@FindBy(id = "orderLink")
	public WebElement OrderBattn;

	@FindBy(xpath = "//div[@class='order']//descendant::p[7]")
	public List<WebElement> ListOfOrders;

	@FindBy(xpath = "//button[text()='Cancel The Order']")
	public List<WebElement> OrderCancelBttn;

	@FindBy(id = "reasonInput")
	public WebElement CancelationReason;
	
	@FindBy(id="orderSubmitBtn")
	public WebElement CancellationBttn;
	
	@FindBy(xpath="//p[text()='Your Order Has Been Cancelled']")
	 public WebElement CancellConfrimationMssg;
	
	
	
	
	
	
	

}
