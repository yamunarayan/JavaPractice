package GpOne.ArtiFactMaven;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	WebDriver driver;
	//By SearchBox= By.name("srchword");
	public SearchPage(WebDriver driver) {
		  this.driver=driver;
		  PageFactory.initElements(driver,this);}
@FindBy(name = "srchword")
WebElement SearchBox;
@FindBy(xpath="//ul[@class='navbarul']/li")
List<WebElement> naveBar;
@FindBy(xpath="//input[@placeholder='Search for a product, category or brand']")
WebElement placeholder;
@FindBy(xpath="(//input[@class='newsrchbtn'])[1]")
WebElement SearchIcon;
public WebElement SB() {
	return SearchBox;
}
public WebElement PH() {
	return placeholder;
}
public WebElement SearchIconM() {
	return SearchIcon;
}
public List<WebElement> naveBarM() {
	return naveBar;
}
public void NaveBarText() {
	for(WebElement naveBarElement: naveBar) {
		System.out.println(naveBarElement.getText());
	}
}
}