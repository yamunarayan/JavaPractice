package GpOne.ArtiFactMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

public class LaunchingNaukri {
    public static void main(String[] args){
        int[] arr =  {8,4,6,7};
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                   temp=arr[i] ;
                   arr[i]=arr[j];
                   arr[j]=temp;
                }
            }
// Linux, framework explaination,
            
            //
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-2]);

        /*System.setProperty("webdriver.chrome.driver","C:\\Users\\Yamuna\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.naukri.com/");
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        String parentWindow=iterator.next();
        boolean b = iterator.hasNext();*/

        //driver.switchTo().window("childwindow").close();

    }
}
