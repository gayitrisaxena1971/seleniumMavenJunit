package seleniumMavenJunit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class mySeleniumTest {
	
	
	WebDriver driver;
	
	@Before
	public void testConnectionToSite()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	
		
	}
	
	@Test
	public void testStartingWebDriver()
	{

		
		
		driver.get("http://amazon.in");
		assertEquals("Hello","Hello");
		//assertEquals("Online Shopping",driver.getTitle().startsWith("Online Shopping"));
		
		/*
		driver.manage().window().maximize();
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("JBL earphones");
		WebElement searchButton = driver.findElement(By.className("nav-input"));
		searchButton.click();
		*/
		
		
		
	
		
		
	
	}
	
	@After
	public void testStopConnectionToSite()
	{
		driver.close();
		driver.quit();
	}

}
