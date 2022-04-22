package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\win10\\\\eclipse-workspace\\\\Sample\\\\drivers\\\\chromedriver.exe" );
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	
	driver.manage().window().maximize();
	
	WebElement user = driver.findElement(By.id("email"));
	user.sendKeys("vijaybalaji");
	String attribute = user.getAttribute("value");
	System.out.println(attribute);
	WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
	String text = login.getText();
	System.out.println(text);
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
