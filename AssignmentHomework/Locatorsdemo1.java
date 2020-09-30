package AssignmentHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsdemo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver");
		WebDriver driver = new ChromeDriver();  
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/"); 
		driver.findElement(By.id("email")).sendKeys("prass.nikam@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("password");
		//driver.findElement(By.linkText("Forgot Password?")).click();
		//driver.findElement(By.partialLinkText(" Password?")).click();
		driver.findElement(By.name("login")).click();
	}

}
