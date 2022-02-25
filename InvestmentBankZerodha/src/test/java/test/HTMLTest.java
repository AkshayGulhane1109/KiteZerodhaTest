package test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.Htmlpom;

public class HTMLTest {

	private WebDriver driver; 
	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Automation Tool\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.w3schools.com/html/html_tables.asp");
	}
	@BeforeMethod
	public void launchApplication() {
		
		System.out.println("Before Test");
	}
	
	@Test
	public void getTexts(){
		Htmlpom texts=new Htmlpom(driver);
		String values=texts.cellvalues();
		System.out.println(values);
		//JavascriptExecutor js= (JavascriptExecutor)driver;
	}
	@BeforeMethod
	public void closeApplication() {
		driver.close();
	}
	
}
