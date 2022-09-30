package GpOne.ArtiFactMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

public class BrokenUrl {
    public static void main(String[] args) throws MalformedURLException, IOException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yamuna\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
        SoftAssert a = new SoftAssert();
        for (WebElement link : links) {
            String url = link.getAttribute("href");
 HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();
            int respCode = conn.getResponseCode();
             HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            System.out.println(respCode);
            a.assertTrue(respCode < 500, "The link with Text" + link.getText() + " is broken with code" + respCode);

            a.assertAll();
        }
    }
}

