import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MainPage extends PageObject{

    private final String SITE_NAME="Youtube";
    private final String VALID_URL="www.youtube.com";

    @FindBy(xpath="//*[@id=\"siteName\"]")
    private WebElement siteNameField;
    @FindBy(xpath="//*[@id=\"urlName\"]")
    private WebElement validURL;
    @FindBy(xpath="//*[@id=\"myForm\"]/button")
    private WebElement submit;

    public MainPage(WebDriver driver){
        super(driver);
    }

    public void populateSiteNameField() {
        this.siteNameField.sendKeys(SITE_NAME);
    }
    public void populatevalidURL() {this.validURL.sendKeys(VALID_URL);}
   /* public void populatesubmit(){this.submit.click();}*/
    
}

