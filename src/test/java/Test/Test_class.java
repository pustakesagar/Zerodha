 package Test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base_class;
import POM_classes.Kitehome;
import POM_classes.Kitelogin;
import POM_classes.Kitepin;
import Utility.Utility_class;

public class Test_class extends Base_class {

		
	
	Kitelogin k;
	Kitepin p;
	Kitehome h;
	
	@BeforeClass
	public void Openbrowser() {
	
		initialisebrowser();
		k=new Kitelogin(driver);
		p=new Kitepin(driver);
		h=new Kitehome(driver);
	}
	
	@BeforeMethod
	
	public void loginapp() throws Throwable {
		
		k.Username(Utility_class.getData(0,0));	
		k.Password(Utility_class.getData(0,1));
		k.Click();
		
		p.Enterpin(Utility_class.getData(0,2));
		p.Continue();
		}
		
	
	@Test
	public void verifyuserid() throws Throwable {
	String act=h.Username();
	String exp = Utility_class.getData(0,3);
	Assert.assertEquals(act, exp,"if both same tc is passed");
		
	}
	
	@AfterMethod
	
	public void logoutapp() {
		Reporter.log("logout application",true);
	}
	
	@AfterClass
	public void closebrowser() {
		Reporter.log("close browser",true);
	}
}
	
	
	
