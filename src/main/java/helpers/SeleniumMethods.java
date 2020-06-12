package helpers;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SeleniumMethods {
    public static void selectByTextFromDropdown(WebElement webElement, String expectedText){
        new Select(webElement).selectByVisibleText(expectedText);
    }

    public static void selectByTextFromElementList(List<WebElement> list, String expectedText)
    {
        for (int i=0; i<list.size(); i++)
        {
            if (list.get(i).getText().contains(expectedText))
            {
                list.get(i).click();
                break;
            }
        }
    }

    public static void clickElement(WebElement element)
    {
        element.click();
    }

    public static void sendKeysToElementAndLoseFocus(WebElement element, String expectedText)
    {
        element.sendKeys(expectedText);
        element.sendKeys(Keys.TAB);
    }
}
