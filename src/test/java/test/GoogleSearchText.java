package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;


public class GoogleSearchText {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		googleSearch();
	}
	
	public static void googleSearch() throws InterruptedException {
		
		driver = new ChromeDriver();	// using driver that we declared at class level 
		driver.get("https://google.com/");		// open browser
	
		//using the obect from the page object model that we created
		GoogleSearchPage.textbox_search(driver).sendKeys("AUtomation Step by Step");
		
		//using pom to get the element and the send keys enter to search
		GoogleSearchPage.textbox_search(driver).sendKeys(Keys.RETURN);
		
		Thread.sleep(5000);
		
		//close the browser
		driver.close();
		
		
		//Successfull message in the console
		System.out.println("Test Completed Successfully");
	}
}

