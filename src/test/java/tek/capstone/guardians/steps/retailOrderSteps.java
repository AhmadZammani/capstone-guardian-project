package tek.capstone.guardians.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import tek.capstone.guardians.pages.POMFactory;
import tek.capstone.guardians.utilities.CommonUtility;

public class retailOrderSteps extends CommonUtility {
	POMFactory factory = new POMFactory();

	@Then("User change the category to {string}")
	public void userChangeTheCategoryTo(String category) {
		selectByVisibleText(factory.retailOrderPage().ApartmentsdropDown, category);
		logger.info("Catagory was selected from dropDown Successfully");
	}

	@Then("User search for an item {string}")
	public void userSearchForAnItem(String kasaOutdoorSmartPlug) {
		sendText(factory.retailOrderPage().seachInputField, kasaOutdoorSmartPlug);
		logger.info("Item name entered successfully");
	}

	@Then("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.retailOrderPage().searchBattn);
		logger.info("search button click successfully");
	}

	@Then("User click on item")
	public void userClickOnItem() {
		click(factory.retailOrderPage().KasaOutdoorSmartPlug);
		logger.info("item has clicked successfully");
	}

	@Then("User select quantity {string}")
	public void userSelectQuantity(String Qtty) {
		selectByVisibleText(factory.retailOrderPage().ItemQtty, Qtty);
		logger.info("item has chosen successfully");
	}

	@Then("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.retailOrderPage().addToCartBttn);
		logger.info("Item quantity added to cart successfully");

	}

	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String itemQtyInTheCart) {
		Assert.assertEquals(itemQtyInTheCart, factory.retailOrderPage().CartItemQtty.getText());
		logger.info("the quantity of the item has validated successfully");
		// the below is addind item in the cart
	}

// the extra step
	@Then("user cleans the cart before moving on")
	public void userCleansTheCartBeforeMovingOn() throws InterruptedException {
		click(factory.retailOrderPage().cart);
		List<WebElement> empty = factory.retailOrderPage().emptycart;
		for (WebElement emp : empty) {
			click(emp);
		}
		Thread.sleep(2000);
	}

	@Then("User change the category to {string} Apex Legends")
	public void userChangeTheCategoryToApexLegends(String Electronics) {
		selectByVisibleText(factory.retailOrderPage().ApartmentsdropDown, Electronics);
		logger.info("Department catagory has changed to Electronics");
	}

	@Then("User search for an item {string} Apex Legends")
	public void userSearchForAnItemApexLegends(String ApexLegends) {
		sendText(factory.retailOrderPage().seachInputField, ApexLegends);
		logger.info("Item name has entered successfully");
	}

	@Then("User click on item Apex Legends")
	public void userClickOnItemApexLegends() {
		click(factory.retailOrderPage().ApexLegend);
		logger.info("The item was click Successfully");
	}

	@Then("User select quantity {string} for Apex Legends")
	public void userSelectQuantityForApexLegends(String ApexLegendsQty) {
		selectByVisibleText(factory.retailOrderPage().ItemQtty, ApexLegendsQty);
		logger.info("The item Quantity has changed successfully");
	}

	@Then("the cart icon quantity should change to {string} Apex Legends")
	public void theCartIconQuantityShouldChangeToApexLegends(String itemQtyInTheCart) {
		Assert.assertEquals(itemQtyInTheCart, factory.retailOrderPage().CartItemQtty.getText());
		logger.info("the quantity of the item has validated successfully");
	}

	@Then("User click on Cart option")
	public void userClickOnCartOption() {
		click(factory.retailOrderPage().cartbutton);
		logger.info("Cart button clicked successfully");
	}

	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		click(factory.retailOrderPage().ProcessToCheckout);
		logger.info("Item is ready to be ordered");
	}

	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(factory.retailOrderPage().placeOrder);
		logger.info("you successfully placed your order");
// cancel order
	}

	@Then("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.retailOrderPage().OrderBattn);
		logger.info("the order button was click Successfully");
	}

	@Then("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		List<WebElement> listOfOdwer = factory.retailOrderPage().ListOfOrders;
		for (int i = 0; i < listOfOdwer.size(); i++) {
			if (listOfOdwer.get(i).getText().equalsIgnoreCase("Hide Details")) {
			} else if (listOfOdwer.get(i).getText().equalsIgnoreCase("Show Details")) {
				click(factory.retailOrderPage().ListOfOrders.get(i));
			}
		}
		logger.info("First order on the list clicked");
	}

	@Then("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		List<WebElement> CancelOrder = factory.retailOrderPage().OrderCancelBttn;
		click(CancelOrder.get(0));// this only cancell one itmem in the order list
		// for(int i=0; i<CancelOrder.size(); i++) {
		// click(CancelOrder.get(i)); // this loop cancell all orders
		// }
		logger.info("Order button was clicked");
	}

	@Then("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String Cancelation) {
		selectByVisibleText(factory.retailOrderPage().CancelationReason, Cancelation);
		logger.info("cancelation reasson was selected");
	}

	@Then("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.retailOrderPage().CancellationBttn);
		logger.info("The order has been cancelled ");
	}

	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String CancelationMssg) {
		Assert.assertEquals(CancelationMssg, factory.retailOrderPage().CancellConfrimationMssg.getText());
		logger.info("Cancelation message verified succeesfully");
	}

}
