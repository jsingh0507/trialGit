package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test1_GoogleSearch {
	
	public static void main(String[] args) throws InterruptedException {
		googleSearch();
	}
	
	public static void googleSearch() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();	// using Webdriver interface to create driver for Chrome
		driver.get("https://google.com/");		// open browser
		
		//Enter text in the search box of google
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		
		//click the search button
		//driver.findElement(By.name("btnK")).click(); // This one is not working beacause when we type suggestion open making difficult to find click the search button
		
		
		//thats why we can just press the enter button
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		Thread.sleep(5000);
		
		//close the browser
		driver.close();
		
		
		//Successfull message in the console
		System.out.println("Test Completed Successfully");
	}

}
