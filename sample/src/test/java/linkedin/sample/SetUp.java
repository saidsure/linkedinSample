package linkedin.sample;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class SetUp {
 
   public static WebDriver driver;
   public static void lauchBrowser(){
       System.setProperty("webdriver.chrome.driver","/Users/skota/Downloads/chromedriver"); 
       driver = new ChromeDriver();
       driver.get("https://www.linkedin.com/");
   }
   
   public static void closeBrowser() {
	   driver.close();
   }
   
   public static void waitForPageLoad(String expectedPageUrl) {
	   int count=0;
	   while(!driver.getCurrentUrl().contains(expectedPageUrl)&& count<5) {
		   try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   count++;
	   }
	   
   }
}
