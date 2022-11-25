package GpOne.ArtiFactMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Wait;

import java.io.IOException;
import java.net.MalformedURLException;

public class BrowserTest {
    static WebDriver driver;
    static Wait<WebDriver> wait;
    public static void main(String[] args) throws MalformedURLException, IOException, IOException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Yamuna\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");

        driver = new FirefoxDriver();

        driver.get("https://www.google.com/");


    }
}