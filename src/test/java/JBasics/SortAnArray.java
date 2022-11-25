package JBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortAnArray {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yamuna\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://shopping.rediff.com/product/tv?sc_cid=shopping_inhomesrch");
       List <WebElement> list= driver.findElements(By.xpath("//span[@class='f14 bold']/span[2]"));
       String text;
       int[] price = new int[list.size()];
       for(int i=0;i<list.size();i++) {
           text = list.get(i).getText();
          text= text.replace("," ,"");
           price[i] = Integer.parseInt(text);
                             }
       int temp;
       for(int i=0;i<price.length;i++){
           for(int j=i+1;j<price.length;j++){
               if(price[i]>price[j]){
                   temp = price[i];
                   price[i]=price[j];
                   price[j]=temp;
               }
           }
       }
       System.out.println(Arrays.toString(price));

    }
}