package pages;

import locators.FastSearchLocators;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static helpers.SeleniumMethods.*;

public class FastSearchPage {

    WebDriver driver;
    WebDriverWait wait;
    FastSearchLocators fastSearchLocators;

    public FastSearchPage(WebDriver driver) {
        this.driver = driver;
        fastSearchLocators = new FastSearchLocators();
        PageFactory.initElements(driver, fastSearchLocators);
        wait = new WebDriverWait(driver, 10);
    }

    public void selectMark(String mark) {
        selectByTextFromDropdown(fastSearchLocators.getMark(), mark);
    }

    public void selectModel(String model) {
        selectByTextFromDropdown(fastSearchLocators.getModel(), model);
    }

    public void selectKilometer(String kilometer) {
        selectByTextFromDropdown(fastSearchLocators.getKilometer(), kilometer);
    }

    public void selectCity(String city) {
        sendKeysToElementAndLoseFocus(fastSearchLocators.getCity(), city);
    }

    public void search() {
        clickElement(fastSearchLocators.getSearchButton());
    }
}
