package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNG_Demo {
	
	WebDriver driver = null;

	// I DO NOT NEED PUBLIC MAIN METHOD WHILE USING TESTNG
	
	@BeforeTest
	public void setUpTest() {
		driver = new ChromeDriver();	// using Webdriver interface to create driver for Chrome
	}
	
	
	@Test
	public void googleSearch() {   // I DO NOT NEED THE STATIC KEYWORD HERE
		
		driver.get("https://google.com/");		// open browser
		
		//Enter text in the search box of google
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		
		//click the search button
		//driver.findElement(By.name("btnK")).click(); // This one is not working beacause when we type suggestion open making difficult to find click the search button
		
		
		//thats why we can just press the enter button
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		//Thread.sleep(5000);
		
	}
	
	
	@AfterTest
	public void tearDownTest() {
		//close the browser
		driver.close();		
		
		driver.quit();
		
		//Successfull message in the console
		System.out.println("Test Completed Successfully");
		
	}

}
