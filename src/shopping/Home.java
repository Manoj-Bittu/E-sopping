package shopping;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Home {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.close();
	}

}
