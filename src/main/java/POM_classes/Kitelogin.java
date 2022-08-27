package POM_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitelogin {
	@FindBy(xpath="//input[@id='userid']")private WebElement UN;
	@FindBy(xpath="//input[@id='password']")private WebElement PWD;
	@FindBy(xpath="//button[text()='Login ']")private WebElement Button;
	
	public Kitelogin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void Username(String data) {
		UN.sendKeys(data);
	}
	
	public void Password(String Password) {
		PWD.sendKeys(Password);
}
	
	public void Click() {
		Button.click();
}
}

