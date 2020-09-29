package AssignmentHomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework3 {

	public static void main(String[] args) throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver", "./Software/chromedriver");
		   WebDriver driver = new ChromeDriver();
		   //driver.get(" https://www.dealnews.com/");
		   driver.navigate().to("https://www.dealnews.com/");
		   driver.navigate().back();
		   Thread.sleep(3000);
		   driver.navigate().forward();
		   driver.navigate().refresh();
		   driver.close();

	}

}
