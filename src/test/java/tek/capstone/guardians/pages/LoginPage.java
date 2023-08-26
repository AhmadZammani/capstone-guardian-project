package tek.capstone.guardians.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.guardians.base.BaseSetup;

public class LoginPage extends BaseSetup {

	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id="signinLink")
	public WebElement SigninLink;

	@FindBy(id="email")
	public WebElement EmailFiled;
	
	@FindBy(id="password")
	public WebElement PasswordField;
	
	@FindBy(id="loginBtn")
	public WebElement LoginField;
	 
	@FindBy(id="logoutBtn")
	public WebElement logoutField;
	 //Create New Account
	
	@FindBy(id="newAccountBtn")
	public WebElement NewAccont;
	
	@FindBy(id="nameInput")
	public WebElement NameIn;
	
	@FindBy(id="emailInput")
	public WebElement EmailIn;
	
	@FindBy(id="passwordInput")
	public WebElement PasswordIn;
	
	@FindBy(name="confirmPassword")
	public WebElement ConfirmPa;
	
	@FindBy(id="signupBtn")
	public WebElement SignUpp;
	
	@FindBy(xpath="//h1[text()='Amir']")
	public WebElement Myprofile;
	
	
	
	
	
}
