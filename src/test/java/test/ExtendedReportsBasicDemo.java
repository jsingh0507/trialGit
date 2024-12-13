package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendedReportsBasicDemo {
	
	private static WebDriver driver = null;
	public static void main(String[] args) {
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		
		// create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("Google Search Test One", "This is a test to validate google search functionality");
        
        driver = new ChromeDriver();	// using driver that we declared at class level 
        
     // log(Status, details)
        test.log(Status.INFO, "Starting Test Case");
		driver.get("https://google.com/");		// open browser
		test.pass("Navigated to google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		test.pass("Entered text in the search box");
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		test.pass("Pressed keyboard ENTER key");
		
		driver.close();
		driver.quit();
		test.pass("Closed the browser");
		
		test.info("Test completed");
		
		
		//Test 2
		
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test2 = extent.createTest("Google Search Test Two", "This is a test to validate google search functionality");
        
        driver = new ChromeDriver();	// using driver that we declared at class level 
        
     // log(Status, details)
        test2.log(Status.INFO, "Starting Test Case");
		driver.get("https://google.com/");		// open browser
		test2.pass("Navigated to google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		test2.pass("Entered text in the search box");
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		test2.fail("Pressed keyboard ENTER key");
		
		driver.close();
		driver.quit();
		test2.pass("Closed the browser");
		
		test2.info("Test completed");
		
		// calling flush writes everything to the log file
        extent.flush();
	}
}
