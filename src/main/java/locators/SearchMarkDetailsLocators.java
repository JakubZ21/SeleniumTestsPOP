package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchMarkDetailsLocators {

    @FindBy(css = "[data-se=\"header-nav-link-toggle__hdinf\"]")
    private WebElement info;

    public WebElement getInfo() {
        return info;
    }

    public void setInfo(WebElement info) {
        this.info = info;
    }

    @FindBy(css = "[data-se=\"header-nav-link__hdinfmd\"]")
    private WebElement allCarsAndModels;

    public WebElement getAllCarsAndModels() {
        return allCarsAndModels;
    }

    public void setAllCarsAndModels(WebElement allCarsAndModels) {
        this.allCarsAndModels = allCarsAndModels;
    }

    @FindBy(css = ".CardInfo___3YfD_F .btn--link")
    private List<WebElement> carList;

    public List<WebElement> getCarList() {
        return carList;
    }

    public void setCarList(List<WebElement> carList) {
        this.carList = carList;
    }

    @FindBy(css = ".CardInfo___2mHZKr .btn--link")
    private List<WebElement> carModelList;

    public List<WebElement> getCarModelList() {
        return carModelList;
    }

    public void setCarModelList(List<WebElement> carModelList) {
        this.carModelList = carModelList;
    }

    @FindBy(css = ".SeriesStage__Title___3n6MmJ")
    private WebElement carNameAndSeries;

    public WebElement getCarNameAndSeries() {
        return carNameAndSeries;
    }

    public void setCarNameAndSeries(WebElement carNameAndSeries) {
        this.carNameAndSeries = carNameAndSeries;
    }
}
