package tek.capstone.guardians.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import tek.capstone.guardians.pages.POMFactory;
import tek.capstone.guardians.utilities.CommonUtility;

public class RetailHomePageSteps extends CommonUtility {
	POMFactory factory = new POMFactory();

	@Given("User is on the retail page")
	public void userIsOnTheRetailPage() {
		Assert.assertTrue(factory.homePage().tekSchoolLogo.isDisplayed());
	}

	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().AllOptionBttn);
		logger.info("User Click on AllOption");
	}

	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
		List<List<String>> Departments = dataTable.asLists(String.class);
		for (int i = 0; i < Departments.get(0).size(); i++) {
			Assert.assertTrue(isElementDisplayed(getDriver().findElement(
					By.xpath("//div[@class='sidebar__content']//span[text()='" + Departments.get(0).get(i) + "']"))));
			logger.info("All options " + Departments.get(0).get(i) + " are displayed");
		}

	}

	@When("User on {string}")
	public void userOn(String department) {
		List<WebElement> departments = factory.homePage().optionContains;
		for (int i = 0; i < departments.size(); i++) {
			if (departments.get(i).getText().equalsIgnoreCase(department)) {
				departments.get(i).click();
				break;
			}
		}
	}

	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {
		List<List<String>> departmentOptions = dataTable.asLists(String.class);
		List<WebElement> options = factory.homePage().sidebarAllOptions;

		for (int i = 0; i < departmentOptions.get(0).size(); i++) {
			for (WebElement elements : options) {
				if (elements.getText().equalsIgnoreCase(departmentOptions.get(0).get(i))) {
					Assert.assertTrue(elements.isDisplayed());
					logger.info("The option " + elements.getText() + " is present");
				}
			}
		}

	}

}
