package tek.capstone.guardians.base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import tek.capstone.guardians.utilities.CommonUtility;

public class BaseUITest  extends CommonUtility{
 @Before
 public void setupTests() {
	 super.setUpBrowser();
 }
	
 @After
 public void closeTestests(Scenario scenario) {
	 if( scenario.isFailed()) {
		 byte[] screenShot=takeScreenShotAsBytes();
		 scenario.attach(screenShot, "imag/png", scenario.getName()+"scenario Failed");
	 }
 super.quitBrowser();
 }
	
	
}
