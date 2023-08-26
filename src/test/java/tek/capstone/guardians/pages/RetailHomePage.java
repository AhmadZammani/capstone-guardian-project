package tek.capstone.guardians.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.guardians.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
 
	public RetailHomePage () {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(linkText="TEKSCHOOL")
	public WebElement tekSchoolLogo;
	 
	@FindBy(id="hamburgerBtn")
	public WebElement AllOptionBttn;
	
	@FindBy(xpath="//div[@class='sidebar__content']//span")
	public List <WebElement>optionContains;
	
	@FindBy(xpath = "//div[@class='sidebar_content-item']//span")
	public List<WebElement> sidebarAllOptions;
	
	
	
	
	
	
	
}
