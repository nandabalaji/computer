import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;

public class windowshandle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\win10\\eclipse-workspace\\computer\\driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 Thread.sleep(2000);
		 WebElement s = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		 s.click();
		 WebElement s1 = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		 s1.sendKeys("samsung mobiles");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 Thread.sleep(3000);
		 WebElement pg = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
		 pg.click();
		 String pw = driver.getWindowHandle();
		 Set<String> child = driver.getWindowHandles();
		 for (String xxn : child) {
			 if (!pw.equals(xxn)) {
				 driver.switchTo().window(xxn);
				
			}
			
		}
		 driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2U9uOA _3v1-ww')]")).click();
		 driver.switchTo().window(pw);
		 Actions acc= new Actions(driver);
		 WebElement f1 = driver.findElement(By.xpath("//span[text()='Women']"));
		acc.moveToElement(f1).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='_3QN6WI'])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='IRpwTa _2-ICcC'])[1]")).click();
		Set<String> child2 = driver.getWindowHandles();
		for (String xx2 : child2) {
			if (!pw.equals(xx2)) {
				driver.switchTo().window(xx2);
			}
			
		}
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		
		
		
		
	}

}
