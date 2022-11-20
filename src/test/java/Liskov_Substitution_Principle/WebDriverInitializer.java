package Liskov_Substitution_Principle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverInitializer {

    public void loadDriver(){
        WebDriver driver= new ChromeDriver();
    }

}
