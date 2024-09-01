package javascript_executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZoomInZoomOut {
public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(5000);
		driver.manage().window().minimize();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='50%'"); //set zoom level to 50%
		Thread.sleep(5000);
		//js.executeScript("document.boby.style.zoom='100%'");
		
		
	}

}
