package linkedin.sample;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestScenarioClass {

	 @Test
	   @Parameters({"username", "password"})
	   public void verifyLinkenInLoginLogout(String username, String password)
	   {
	       SetUp.lauchBrowser();
	       Login.loginToUsername(username,password);
	       Assert.assertTrue(Dashboard.isDashboardPage(),"Dashboard page not loaded or user landed on wrong page");
	       Dashboard.logout();
	       Assert.assertTrue(LogoutPage.isLogoutPage(),"Logout page failed or user landed on different page");
	       Dashboard.goToDashboardPage();
	       Assert.assertFalse(Dashboard.isDashboardPage(),"user logged in and landed on dashboard page");
	      //uncomment the code below to check the screenshot 
	       //Assert.assertTrue(false);
	      
	   }
	 
	 @AfterTest
	 public void quitTest() {
		 SetUp.closeBrowser();
	 }
}
