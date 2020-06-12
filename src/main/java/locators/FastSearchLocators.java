package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FastSearchLocators {

    @FindBy(id = "qsmakeBuy")
    private WebElement mark;

    @FindBy(id = "qsmodelBuy")
    private WebElement model;

    @FindBy(css = "#qsmilwrp .form-control.form-control--combobox")
    private WebElement kilometer;

    @FindBy(id = "ambit-search-location")
    private WebElement city;

    @FindBy(id = "qssub")
    private WebElement searchButton;

    public WebElement getKilometer() {
        return kilometer;
    }

    public void setKilometer(WebElement kilometer) {
        this.kilometer = kilometer;
    }

    public WebElement getCity() {
        return city;
    }

    public void setCity(WebElement city) {
        this.city = city;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public void setSearchButton(WebElement searchButton) {
        this.searchButton = searchButton;
    }

    public WebElement getMark() {
        return mark;
    }

    public void setMark(WebElement mark) {
        this.mark = mark;
    }

    public WebElement getModel() {
        return model;
    }

    public void setModel(WebElement model) {
        this.model = model;
    }
}
