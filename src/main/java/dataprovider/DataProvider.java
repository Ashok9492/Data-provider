package dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataProvider {

	public void login(String email,String Firstname,String lastname,String password) {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sky\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
	driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
	driver.get("http://automationpractice.com/");
	driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
	driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("rock9ashok@gmail.com");
	driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
	driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
	driver.findElement(By.xpath("//input[@name='customer_firstname']")).sendKeys("Ashok");
	driver.findElement(By.xpath("//input[@name='customer_lastname']")).sendKeys("Konda");
	driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("9492969271");
	
	}
	
	//hello this ashok
	
	
	
	
}
