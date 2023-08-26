package tek.capstone.guardians.pages;

import tek.capstone.guardians.base.BaseSetup;

public class POMFactory extends BaseSetup {
	private RetailHomePage homePage;
	private LoginPage loginPage;
	private RetailAcountpage retailacountpage;
	private RetailOrderPage retailOrderPage;
	private MultipleWindowsPage multipleWindowspage;

	public POMFactory() {
		this.homePage = new RetailHomePage();
		this.loginPage = new LoginPage();
		this.retailacountpage = new RetailAcountpage();
		this.retailOrderPage = new RetailOrderPage();
		this.multipleWindowspage=new MultipleWindowsPage();
	}

	public RetailHomePage homePage() {
		return this.homePage;
	}

	public LoginPage loginPage() {
		return this.loginPage;
	}

	public RetailAcountpage retailacountpage() {
		return this.retailacountpage;
	}

	public RetailOrderPage retailOrderPage() {
		return this.retailOrderPage;
	}
public MultipleWindowsPage multipleWindowspage() {
	return this.multipleWindowspage;
}
}

