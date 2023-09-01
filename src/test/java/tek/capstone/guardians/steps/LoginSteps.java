package tek.capstone.guardians.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.guardians.pages.POMFactory;
import tek.capstone.guardians.utilities.CommonUtility;
import tek.capstone.guardians.utilities.DataGenerator;

public class LoginSteps extends CommonUtility {
	POMFactory factory = new POMFactory();
	private String randomEmail;

	@Given("User is on retail website homepage")
	public void userIsOnRetailWebsiteHomepage1() {
		Assert.assertTrue(factory.homePage().tekSchoolLogo.isDisplayed());
		logger.info("TekSchool  logo is dispalyed ");
	}

	@When("User click on Sign in option")
	public void userClickOnSignInOption1() {
		click(factory.loginPage().SigninLink);
		logger.info("User Click on sign bttn Successfully");
	}

	@When("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email, String password) {
		sendText(factory.loginPage().EmailFiled, email);
		sendText(factory.loginPage().PasswordField, password);
		logger.info("User Successfully entered email and password");
	}

	@When("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.loginPage().LoginField);
		logger.info(" User logged In successfully");
	}

	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(factory.loginPage().logoutField.isDisplayed());
		logger.info("user is logged in");

	}

	@When("User click on create new account link")
	public void userClickOnCreateNewAccountLink() {
		click(factory.loginPage().NewAccont);
		logger.info("User Click on new Account successfully");
	}

	@When("User enters the sign up information with below data")
	public void userEnterAndAndAnd(io.cucumber.datatable.DataTable dataTable) {
		randomEmail = DataGenerator.getEmail();
		List<Map<String, String>> signUp = dataTable.asMaps(String.class, String.class);
		
		Map<String, String> data =signUp.get(0);
		String name = data.get("name");
		String email =randomEmail;
		String password = data.get("password");
		String confPassword = data.get("confPassword");
		
		sendText(factory.loginPage().NameIn, name);
		sendText(factory.loginPage().EmailIn, email);
		sendText(factory.loginPage().PasswordIn, password);
		sendText(factory.loginPage().ConfirmPa, confPassword);
		logger.info("Basic Info entered Successfully");
	}

	@When("User click on singup button")
	public void userClickOnSingupButton() {
		click(factory.loginPage().SignUpp);
		logger.info("The sign up button was clicked succcessfully");
	}

	@Then("Verify user account is created")
	public void verifyUserAccountIsCreated() {
		Assert.assertTrue(factory.loginPage().logout.isDisplayed());
	}

}
