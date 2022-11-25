package Interface_Segregation_Principle;

import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class WebElementActions implements WebDriverActions, WebDrivermethods, WebElementsInf{
    @Override
    public void click() {

    }

    @Override
    public void click(WebElement element) {

    }

    @Override
    public void sendKeys(WebElement element, String data) {

    }

    @Override
    public void sendKeys(String data) {

    }

    @Override
    public void selectDropDown(WebElement element, String type, String option) {

    }

    @Override
    public void switchWindow(Set<String> windowHandle) {

    }

    @Override
    public void getText(WebElement element) {

    }

    @Override
    public void getTitle() {

    }

    @Override
    public void startDriver() {

    }

    @Override
    public void quit() {

    }

    @Override
    public void close() {

    }

    @Override
    public WebElement locateElement(String locator) {
        return null;
    }

    @Override
    public List<WebElement> locateElements(String locator) {
        return null;
    }
}
