package pages;

import locators.SearchMarkDetailsLocators;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static helpers.SeleniumMethods.*;

public class SearchMarkDetailsPage {
    WebDriver driver;
    WebDriverWait wait;
    SearchMarkDetailsLocators locators;

    public SearchMarkDetailsPage(WebDriver driver) {
        this.driver = driver;
        locators = new SearchMarkDetailsLocators();
        PageFactory.initElements(driver, locators);
        wait = new WebDriverWait(driver, 10);
    }

    public void searchCarList()
    {
        locators.getInfo().click();
        wait.until(ExpectedConditions.elementToBeClickable(locators.getAllCarsAndModels()));
        locators.getAllCarsAndModels().sendKeys(Keys.RETURN);
    }

    public void selectMark(String mark)
    {
        wait.until(ExpectedConditions.visibilityOfAllElements(locators.getCarList()));
        selectByTextFromElementList(locators.getCarList(), mark);
    }

    public void selectModel(String model)
    {
        wait.until(ExpectedConditions.visibilityOfAllElements(locators.getCarModelList()));
        selectByTextFromElementList(locators.getCarModelList(), model);
    }

    public String getMarkAndModel()
    {
        wait.until(ExpectedConditions.visibilityOf(locators.getCarNameAndSeries()));
        return locators.getCarNameAndSeries().getText();
    }
}
