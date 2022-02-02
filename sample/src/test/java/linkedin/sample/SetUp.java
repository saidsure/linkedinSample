package linkedin.sample;

import java.io.File;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
 
public class SetUp implements ITestListener {
 
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
   
   public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
	 TakesScreenshot scrShot =((TakesScreenshot)webdriver);
	 File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	 File DestFile=new File(fileWithPath);
	 FileUtils.copyFile(SrcFile, DestFile);
	 }
   
   public void onTestFailedButWithinSuccessPercentage(ITestResult result) {   }

@Override
public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestFailure(ITestResult result) {
	//on test failure take screenshot
	try {
		takeSnapShot(driver,"/Users/skota/Downloads/Screenshot/Screenshot" + LocalDateTime.now()+".png");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

@Override
public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	
}

@Override
public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	
}

@Override
public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	
}

}
