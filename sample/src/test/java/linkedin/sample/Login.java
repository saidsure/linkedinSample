package linkedin.sample;

import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.*;


public class Login extends SetUp {
   public static WebElement txtUsername = driver.findElement(By.id("session_key"));
   public static WebElement txtPassword = driver.findElement(By.id("session_password"));
   public static WebElement btnSignIn = driver.findElement(By.cssSelector("button.sign-in-form__submit-button"));
 
   public static void loginToUsername(String username, String password){
       txtUsername.sendKeys(username);
       txtPassword.sendKeys(password);
       btnSignIn.click();
   }
}
