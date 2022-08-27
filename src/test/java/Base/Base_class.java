package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_class {
	public WebDriver driver;
	
	public void initialisebrowser() {
		
	
	System.setProperty("webdriver.chrome.driver","D:\\\\SP Eclipse\\\\Selenium and chromedriver\\\\chromedriver103\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
}
}