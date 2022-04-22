import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pokkavaibalaji {
 public static void main(String[] args) throws Exception{
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\win10\\eclipse-workspace\\computer\\driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.instagram.com/accounts/login/");
	 Thread.sleep(7000);
	 WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
     user.sendKeys("kube_justin");	 
     WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
     pass.sendKeys("9087961759Kk");
     Thread.sleep(5000);
     WebElement show = driver.findElement(By.xpath("//button[@class='sqdOP yWX7d     _8A5w5    ']"));
     show.click();
   //  Thread.sleep(5000);
     WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
     login.click();
     Thread.sleep(3000);
     WebElement pop = driver.findElement(By.xpath("//button[@class='aOOlW   HoLwm ']"));
     pop.click();
     Thread.sleep(2000);
    // Alert block = driver.switchTo().alert();
     //block.dismiss();
     WebElement s1 = driver.findElement(By.xpath("//input[@placeholder='Search']"));
     s1.sendKeys("kendralust");
     
     
	 
	 
	
}
}
