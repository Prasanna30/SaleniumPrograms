package AssignmentHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsHW2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver");
		WebDriver driver = new ChromeDriver();  
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/"); 
		driver.findElement(By.id("email")).sendKeys("prass.nikam@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("password");
		driver.findElement(By.linkText("Forgot Password?")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("identify_email")).sendKeys("4646066191");
		driver.findElement(By.name("did_submit")).click();

	}

}
