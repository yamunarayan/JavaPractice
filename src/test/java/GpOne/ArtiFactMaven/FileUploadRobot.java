package GpOne.ArtiFactMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class FileUploadRobot {
    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Yamuna\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-6'][2]")).click();

        robot.setAutoDelay(2000);

        StringSelection selection = new StringSelection("E:\\up.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);

        robot.setAutoDelay(1000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        robot.setAutoDelay(1000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }
    }

