package GpOne.ArtiFactMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
  WebDriver driver;
  public LoginPage(WebDriver driver) {
	  this.driver=driver;
  }
 //driver.findElement(By.id("login1"));
  By username=By.id("login1");
  By password=By.name("passwd");
  By signin=By.xpath("//input[@name='proceed']");
  By link=By.linkText("rediff.com");
  public WebElement UserNameM() {
	  return driver.findElement(username);
  }
  public WebElement PasswordN() {
	  return driver.findElement(password);
  }
  public WebElement signino() {
	  return driver.findElement(signin);
  }
  public WebElement linkp() {
	  return driver.findElement(link);
  }
}
