import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestPlan {
    private static final WebDriver driver=new ChromeDriver();

    @BeforeSuite
        public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName ="Search a url")
    public static void searchForProduct() {
        driver.get(Utils.BASE_URL);
        MainPage webForm= new MainPage(driver);
        webForm.populateSiteNameField();
        webForm.populatevalidURL();

    }

    @AfterSuite
        public static void cleaning(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
