package GpOne.ArtiFactMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Calender {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cleartrip.com/do/search/flights/");
        driver.findElement(By.name("depart_date")).click();
        WebElement month =driver.findElement(By.className("ui-datepicker-month"));
        WebElement next=driver.findElement(By.xpath("//div[contains(@class,'ui-datepicker-group-last')]/div/a/span"));
        while(!driver.findElement(By.className("ui-datepicker-month")).getText().equalsIgnoreCase("January")){
            for(int i=0; i<=40;i++) {
                try {
                    driver.findElement(By.xpath("//a[@title='Next']/span")).click();
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        List<WebElement> days =driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
        for(WebElement day:days){
            if(day.getText().equalsIgnoreCase("12")){
                day.click();
                break;
            }
        }
    }

}
