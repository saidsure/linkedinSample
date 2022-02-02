package linkedin.sample;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
 
public class Dashboard extends SetUp {
 
   public static WebElement pageId = driver.findElement(By.id("voyager-feed"));
   public static WebElement profileSettings = driver.findElement(By.cssSelector("button.global-nav__primary-link.artdeco-dropdown__trigger.artdeco-dropdown__trigger--placement-bottom"));
   public static By signout = By.partialLinkText("Sign Out");
   public static String dashboardUrl = "https://www.linkedin.com/feed/?trk=guest_homepage-basic_nav-header-signin";
    
 
   public static boolean isDashboardPage(){
	   try {
	   Thread.sleep(5000);
	   return profileSettings.isDisplayed();
        } catch(Exception e) {
		   
	   }
	   return false;
		  
   }
 
   public static void goToDashboardPage(){
       driver.get(dashboardUrl);
   }
 
   public static void logout(){
       profileSettings.click();
       @SuppressWarnings("deprecation")
       WebDriverWait wait = new WebDriverWait(driver, 2000);
       wait.until(ExpectedConditions.visibilityOfElementLocated(signout));
       driver.findElement(signout).click();
       
     try {
    	 Thread.sleep(1000);
    	 if(driver.findElement(By.cssSelector("section.p5")).isDisplayed()) {
    		WebElement span =  driver.findElement(By.cssSelector("span.artdeco-button__text"));
    		span.findElement(By.xpath("./..")).click();
    	 }
    	 SetUp.waitForPageLoad("www.linkedin.com/home");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
}
 


