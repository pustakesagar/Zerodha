package POM_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitehome {
@FindBy(xpath="//span[@class='user-id']")private WebElement Userid;
	
	
	public Kitehome(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public String Username() {
		
		String ActId = Userid.getText();
		return ActId;
		
		
		
}}
