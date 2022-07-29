package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AuthKazna {

    private WebDriver driver;

    private WebDriverWait wait;

    String url = "http://172.31.1.149/kazna/login";

    public AuthKazna(WebDriver driver, WebDriverWait wait)
    {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="login")
    public WebElement Loginfield;
    @FindBy(id="password")
    public WebElement Passwordfield;
    @FindBy(css=".btn.flex-grow-1.w-25.btn-huge.btn-primary")
    public WebElement buttonSignIn;

    public By CheckLSbyBTN= By.cssSelector(".list-group-item.list-elements__item.list-group-item-action");

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[1]/div[2]/button[1]")
    public WebElement LSKIO;


    public boolean existsSomeLS() {
        try {
            driver.findElement(CheckLSbyBTN);
            return true;
        } catch (NumberFormatException kek) {
            return false;
        }

    }

    public void openulr()
    {
        driver.navigate().to(url);
    }

    public void setLoginfield(String login)
    {
        Loginfield.sendKeys(login);
    }

    public void setPasswordfield(String pass)
    {
        Passwordfield.sendKeys(pass);
    }

    public void setButtonSignIn()
    {
        buttonSignIn.click();
    }

    public void setLSKIO()
    {
        LSKIO.click();
    }



    public void authorKazna(String login, String pass)
    {
        setLoginfield(login);
        setPasswordfield(pass);
        setButtonSignIn();
        existsSomeLS();
        setLSKIO();
    }
}
