package tek.capstone.guardians.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.guardians.pages.POMFactory;
import tek.capstone.guardians.utilities.CommonUtility;
import tek.capstone.guardians.utilities.DataGenerator;

public class RetailAcountSteps extends CommonUtility {
	POMFactory factory = new POMFactory();
	private String randomInfo;

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.retailacountpage().AccountBtts);
		logger.info("User click on account button successfully");
	}

	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name, String phoneNumber) {
		randomInfo = DataGenerator.RandomPhoneNumber();
		clearTextUsingSendKeys(factory.retailacountpage().updateName);
		sendText(factory.retailacountpage().updateName, name);
		logger.info("Name entered successfully");

		clearTextUsingSendKeys(factory.retailacountpage().updatePhone);
		sendText(factory.retailacountpage().updatePhone, randomInfo);
		logger.info("phone number successfull udated");

	}

	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.retailacountpage().updateInfo);
		logger.info("The update button click succcessfully");
	}

	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.retailacountpage().PerSonalInfoUpdate);
		String ExpectedMssg = "Personal Information Updated Successfully";
		String AcutalMssg = factory.retailacountpage().PerSonalInfoUpdate.getText();
		Assert.assertEquals(ExpectedMssg, AcutalMssg);
		logger.info("Acount Information upadted");
	}

	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.retailacountpage().AddPaymentMethod);
		logger.info("The click on addPayment was  successful");
	}

	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
		List<Map<String, String>> paymentInfo = dataTable.asMaps(String.class, String.class);
		sendText(factory.retailacountpage().bankNumber, paymentInfo.get(0).get("cardNumber"));
		sendText(factory.retailacountpage().nameOnCard, paymentInfo.get(0).get("nameOnCard"));
		selectByVisibleText(factory.retailacountpage().cardMonthOfExpiry, paymentInfo.get(0).get("expirationMonth"));
		selectByVisibleText(factory.retailacountpage().cardYearExpiry, paymentInfo.get(0).get("expirationYear"));
		sendText(factory.retailacountpage().SecurityDigits, paymentInfo.get(0).get("securityCode"));
		logger.info("Payment informations were entered successfully");
	}

	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.retailacountpage().CreatNewBankCard);
		logger.info("User Click on Submit Button succefully");
	}

	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String expectedMssg) {
		if (expectedMssg.contains("Payment Method added successfully")) {
			waitTillPresence(factory.retailacountpage().PaymentMethodSuccessMss);
			Assert.assertEquals(expectedMssg, factory.retailacountpage().PaymentMethodSuccessMss.getText());
			logger.info("Expected message " + expectedMssg);
		} else if (expectedMssg.contains("Address Added Successfully")) {
			waitTillPresence(factory.retailacountpage().SuccessMSSG);
			Assert.assertEquals(expectedMssg, factory.retailacountpage().SuccessMSSG.getText());
			logger.info("Expected Message" + expectedMssg);
		} else if (expectedMssg.contains("Order Placed")) {
			waitTillPresence(factory.retailOrderPage().OrderplacemetConfiredMssg);
			Assert.assertEquals(expectedMssg, factory.retailOrderPage().OrderplacemetConfiredMssg.getText());
		}

	}
// Add address

	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.retailacountpage().addAdressBttn);
		logger.info("Add address button was click successfully");
	}

	@When("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
		List<Map<String, String>> AddressInfo = dataTable.asMaps(String.class, String.class);
		selectByVisibleText(factory.retailacountpage().countryName,
				DataGenerator.addressGenerator(AddressInfo.get(0).get("country")));
		sendText(factory.retailacountpage().fullName,
				DataGenerator.addressGenerator(AddressInfo.get(0).get("fullName")));
		sendText(factory.retailacountpage().phNumber,
				DataGenerator.addressGenerator(AddressInfo.get(0).get("phoneNumber")));
		sendText(factory.retailacountpage().addressStreetField,
				DataGenerator.addressGenerator(AddressInfo.get(0).get("streetAddress")));
		sendText(factory.retailacountpage().AptNumber, DataGenerator.addressGenerator(AddressInfo.get(0).get("apt")));
		sendText(factory.retailacountpage().CityName, AddressInfo.get(0).get("city"));
		sendText(factory.retailacountpage().State, DataGenerator.addressGenerator(AddressInfo.get(0).get("state")));
		sendText(factory.retailacountpage().AreaCode,
				DataGenerator.addressGenerator(AddressInfo.get(0).get("zipCode")));
		logger.info("The Address form has been filled out successfully");

	}

	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.retailacountpage().creattAdressBttn);
		logger.info("user click on create address successfully");

	}

	// below the edit address code flow
	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.retailacountpage().EditAdressBttn);
		logger.info("Edit address button was clicked successfully");
	}

	@When("user fill edit address form with below information")
	public void userFillEditAddressFormWithBelowInformation(DataTable dataTable) {
		List<Map<String, String>> updateAdress = dataTable.asMaps(String.class, String.class);
		selectByVisibleText(factory.retailacountpage().countryName, updateAdress.get(0).get("country"));

		clearTextUsingSendKeys(factory.retailacountpage().fullName);
		sendText(factory.retailacountpage().fullName, updateAdress.get(0).get("fullName"));

		clearTextUsingSendKeys(factory.retailacountpage().phNumber);
		sendText(factory.retailacountpage().phNumber, updateAdress.get(0).get("phoneNumber"));

		clearTextUsingSendKeys(factory.retailacountpage().addressStreetField);
		sendText(factory.retailacountpage().addressStreetField, updateAdress.get(0).get("streetAddress"));

		clearTextUsingSendKeys(factory.retailacountpage().AptNumber);
		sendText(factory.retailacountpage().AptNumber, updateAdress.get(0).get("apt"));

		clearTextUsingSendKeys(factory.retailacountpage().CityName);
		sendText(factory.retailacountpage().CityName, updateAdress.get(0).get("city"));

		clearTextUsingSendKeys(factory.retailacountpage().State);
		sendText(factory.retailacountpage().State, updateAdress.get(0).get("state"));

		clearTextUsingSendKeys(factory.retailacountpage().AreaCode);
		sendText(factory.retailacountpage().AreaCode, updateAdress.get(0).get("zipCode"));

		logger.info("the new address information filled out successfully");

	}

	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(factory.retailacountpage().updatAdressBttn);
		logger.info("The user clicked on address button");
	}

	@Then("a message should be displayed Address Updated Successfully")
	public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
		waitTillPresence(factory.retailacountpage().updateAdressSuccessMessg);
		Assert.assertTrue(isElementDisplayed(factory.retailacountpage().updateAdressSuccessMessg));
		logger.info("the address has chaged successfully");
	}

	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.retailacountpage().removeAddressBtn);
		logger.info("remove address button was clicked successfully");

	}

	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		if (!isElementDisplayed(factory.retailacountpage().removeAddressBar))
			;

		logger.info("Address has removed successfully");
	}

}
