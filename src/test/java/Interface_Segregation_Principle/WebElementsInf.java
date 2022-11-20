package Interface_Segregation_Principle;

import org.openqa.selenium.WebElement;

import java.util.List;

public interface WebElementsInf {

    WebElement locateElement(String locator);
    List<WebElement> locateElements(String locator);
}
