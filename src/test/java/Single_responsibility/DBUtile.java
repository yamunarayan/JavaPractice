package Single_responsibility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DBUtile {

    public void estabilishConnection(){

    }
    public void resetConnection(){

    }
    public void executeQuery(){

    }
    @Test
    public void initializeDriver(String driver){
        if(driver.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            ChromeDriver chromeDriver= new ChromeDriver();
        }
        else if (driver.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            FirefoxDriver firefoxDriver= new FirefoxDriver();

        }

    }
}
