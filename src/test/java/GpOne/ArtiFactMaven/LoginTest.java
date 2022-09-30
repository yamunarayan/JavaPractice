package GpOne.ArtiFactMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	static WebDriver driver;
	@Test
	public static void main() {
	BrowserInitialaization.LaunchBrowser();
		//testing new 
	WebDriver driver= new ChromeDriver();
WebDriver driver= new ChromeDriver();
WebDriver driver= new ChromeDriver();
WebDriver driver= new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.manage().window().maximize();
	LoginPage loginpageobj = new LoginPage(driver);
	SearchPage SearchPageObj = new SearchPage(driver);
	loginpageobj.UserNameM().sendKeys("RRR");
	loginpageobj.PasswordN().sendKeys("CJKP");
	loginpageobj.signino().click();
	loginpageobj.linkp().click();
	System.out.println(SearchPageObj.PH().getAttribute("placeholder"));
	SearchPageObj.NaveBarText();
	SearchPageObj.SB().sendKeys("fridge");
	SearchPageObj.SearchIconM().click();
}

	public void test() {
		System.out.println("XYZ");
	}
}
