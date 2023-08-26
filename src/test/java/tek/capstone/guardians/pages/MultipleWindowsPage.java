package tek.capstone.guardians.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.guardians.base.BaseSetup;

public class MultipleWindowsPage extends BaseSetup {
	public MultipleWindowsPage() {
		PageFactory.initElements(getDriver(), this);
	}

   @FindBy(linkText = "Test Selenium")
   public WebElement testSelenuim;
   
  @FindBy(xpath="//p[text()='Add or Remove Elements']")
  public  WebElement addOrRemoveElements;
   
   @FindBy(xpath = "//button[text()='Add New Element']")
    public WebElement addOrRemoveBttn;
   
   @FindBy(xpath="//button[text()='Remove']")
   public WebElement removeElement;
}
