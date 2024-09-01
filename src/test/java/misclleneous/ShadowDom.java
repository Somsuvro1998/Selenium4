package misclleneous;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDom {
	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://books-pwakit.appspot.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//This Element is inside single shadow DOM.

		SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
		Thread.sleep(1000);
		shadow.findElement(By.cssSelector("#input")).sendKeys("WELCOME");
	}

}
