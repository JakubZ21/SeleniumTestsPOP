import helpers.FileHelper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.FastSearchPage;
import pages.SearchMarkDetailsPage;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class Testy {

    private WebDriver driver;

    @Before
    public void  setUp(){
        System.setProperty("webdriver.chrome.driver", "G:\\Pobrane Torrent\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.mobile.de/");
        FileHelper.createFile();
    }

    @Test
    public void mobileDeTests(){
        FastSearchPage fastSearchPage = new FastSearchPage(driver);
        fastSearchPage.selectMark("Audi");
        FileHelper.writeToFile("Searching fof Audi");
        fastSearchPage.selectModel("A4");
        FileHelper.writeToFile("A4");
        fastSearchPage.selectKilometer("100.000 km");
        FileHelper.writeToFile("100 000 km");
        fastSearchPage.selectCity("Berlin");
        FileHelper.writeToFile("In berlin");
        fastSearchPage.search();
    }

    @Test
    public void getInformationAboutModel()
    {
        SearchMarkDetailsPage searchMarkDetailsPage = new SearchMarkDetailsPage(driver);
        searchMarkDetailsPage.searchCarList();
        searchMarkDetailsPage.selectMark("Audi");
        searchMarkDetailsPage.selectModel("Audi A4");
        assertThat(searchMarkDetailsPage.getMarkAndModel(), containsString("Audi A4 (Serie)"));
    }



    @After
    public void tearDown() {
        driver.quit();
        FileHelper.closeWriter();
    }
}
