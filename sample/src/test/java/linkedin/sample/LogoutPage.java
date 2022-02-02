package linkedin.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
 
public class LogoutPage extends SetUp {
 
   public static WebElement searchJobElement = driver.findElement(By.partialLinkText("Search for a job"));
   public static String expectedUrl = "https://www.linkedin.com/home";
   public static WebElement findPerson = driver.findElement(By.partialLinkText("Find a person you know"));
  
   public static boolean isLogoutPage() {
       try {
	   //Thread.sleep(5000);
       if(driver.getCurrentUrl().equals(expectedUrl)){
           return searchJobElement.isDisplayed() && findPerson.isDisplayed();
       }
   }
   catch(Exception e) {
	   
   }
	return false;
   }
  
}
