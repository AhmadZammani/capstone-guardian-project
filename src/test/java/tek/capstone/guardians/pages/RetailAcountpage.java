package tek.capstone.guardians.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.guardians.base.BaseSetup;

public class RetailAcountpage extends BaseSetup {
	public RetailAcountpage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//a[text()='Account']")
	public WebElement AccountBtts;

	@FindBy(id = "nameInput")
	public WebElement updateName;

	@FindBy(id = "personalPhoneInput")
	public WebElement updatePhone;

	@FindBy(id = "personalUpdateBtn")
	public WebElement updateInfo;

	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement PerSonalInfoUpdate;
//Add Payment Methos
	@FindBy(xpath = "//p[text()='Add a payment method']")
	public WebElement AddPaymentMethod;

	@FindBy(id = "cardNumberInput")
	public WebElement bankNumber;

	@FindBy(id = "nameOnCardInput")
	public WebElement nameOnCard;

	@FindBy(id = "expirationMonthInput")
	public WebElement cardMonthOfExpiry;

	@FindBy(id = "expirationYearInput")
	public WebElement cardYearExpiry;

	@FindBy(id = "securityCodeInput")
	public WebElement SecurityDigits;

	@FindBy(xpath = "//button[text()='Add Your card']")
	public WebElement CreatNewBankCard;

	@FindBy(xpath = "//div[text()='Payment Method added sucessfully']")
	public WebElement PaymentMethodSuccessMss;
// Add New Adress
	@FindBy(xpath = "//div[@class='account__address-new']")
	public WebElement addAdressBttn;

	@FindBy(id = "countryDropdown")
	public WebElement countryName;

	@FindBy(xpath = "//input[@name='fullName']")
	public WebElement fullName;

	@FindBy(id = "phoneNumberInput")
	public WebElement phNumber;

	@FindBy(id = "streetInput")
	public WebElement addressStreetField;

	@FindBy(id = "apartmentInput")
	public WebElement AptNumber;

	@FindBy(id = "cityInput")
	public WebElement CityName;

	@FindBy(xpath = "//select[@name='state']")
	public WebElement State;

	@FindBy(id = "zipCodeInput")
	public WebElement AreaCode;

	@FindBy(id = "addressBtn")
	public WebElement creattAdressBttn;

	@FindBy(id = "addressBtn")
	public WebElement newAddressButtn;

	@FindBy(xpath = "//div[text()='Address Added Successfully']")
	public WebElement SuccessMSSG;

	@FindBy(xpath = "//button[text()='Edit'] ")
	public WebElement EditAdressBttn;
    
	@FindBy(id= "addressBtn")
	public WebElement updatAdressBttn;

	@FindBy(xpath = "//div[text()='Address Updated Successfully']")
	public WebElement updateAdressSuccessMessg;
    
	@FindBy(xpath="//button[text()='Remove']")
	public WebElement removeAddressBtn;
	
	@FindBy(css="div.account__address-single")
	public WebElement removeAddressBar;
}
