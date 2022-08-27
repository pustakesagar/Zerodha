package POM_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitepin {
	@FindBy(xpath="//input[@id='pin']")private WebElement Pin;
	@FindBy(xpath="//button[text()='Continue ']")private WebElement Button;
	
	public Kitepin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void Enterpin(String PN) {
		Pin.sendKeys(PN);
	}
	
	public void Continue() {
		Button.click();
}}

