package Interface_Segregation_Principle;

import org.openqa.selenium.WebElement;

import java.util.Set;

public interface WebDriverActions {
    void click();
    void click(WebElement element);

    void sendKeys(WebElement element, String data);
    void sendKeys(String data);

    void selectDropDown(WebElement element,String type,String option );
    void switchWindow(Set<String> windowHandle);
    void getText(WebElement element);
    void getTitle();
}
