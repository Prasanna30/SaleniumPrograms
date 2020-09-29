package AssignmentHomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.macys.com/");
		   String t = driver.getTitle();
		   System.out.println(t);
		   String url = driver.getCurrentUrl();
		   System.out.println(url);
		   driver.close();
	}

}
