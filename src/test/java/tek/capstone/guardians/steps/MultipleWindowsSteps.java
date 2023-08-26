package tek.capstone.guardians.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import tek.capstone.guardians.pages.POMFactory;
import tek.capstone.guardians.utilities.CommonUtility;

public class MultipleWindowsSteps extends CommonUtility {

	POMFactory factory = new POMFactory();
	public static String parentWindow;

	@Then("User click on Test Selenium link")
	public void userClickOnTestSeleniumLink() {
		parentWindow = getDriver().getWindowHandle();
		click(factory.multipleWindowspage().testSelenuim);
		logger.info("The test Selenium option was clicked");
	}

	@Then("User verify {string} page")
	public void userVerifyPage(String string) {
		switchToNewWindow(parentWindow);
		logger.info("Switched to new window successfully");
		Assert.assertEquals(string, factory.multipleWindowspage().addOrRemoveElements.getText());
		logger.info(" add or remove element text has been verifed");
	}

	@Then("User click on the Add Element button")
	public void userClickOnTheAddElementButton() {
		click(factory.multipleWindowspage().addOrRemoveBttn);
		logger.info("User Clicked on add button successfully");
	}

	@Then("User verify Remove element is added to the page")
	public void userVerifyRemoveElementIsAddedToThePage() {
    
		String expected="Remove";
		String actual=factory.multipleWindowspage().removeElement.getText();
		Assert.assertEquals(expected, actual);
		logger.info("remove element is verified successfull");
		
	}

}
