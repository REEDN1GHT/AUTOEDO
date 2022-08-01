package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class AuthKazna {

    private WebDriver driver;

    private WebDriverWait wait;

    String url = "http://172.31.1.149/kazna/login";
    //String orgLS;

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

    //public By CheckLSbyBTN= By.cssSelector(".list-group-item.list-elements__item.list-group-item-action");
    /*@FindBy(xpath = "//div[contains(text(),'0806003')]")
    WebElement clickCardAuth;*/



    @FindBy(xpath = "//button[text()=' Перейти в ЛК ']")
    WebElement buttonClickLK;


    protected boolean isElementPresent() {
        List list = driver.findElements(By.cssSelector(".personal-account.d-flex.flex-column"));
        return list.size() >0;
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
    public void setClickCardAuth(String orgLS)
    {
        WebElement SwitchLS = driver.findElement(By.xpath("//div[contains(text(),'"+orgLS+"')]"));
        SwitchLS.click();
        //clickCardAuth.click();
    }

    public void kaznaAuthor(String login, String password, String orgLS)
    {
        setLoginfield(login);
        setPasswordfield(password);
        setButtonSignIn();
        if (isElementPresent())
        {
            setClickCardAuth(orgLS);
        }

    }


    //Пример кастомного неявного ожидания
    public boolean wait_implicitlyWait()
    {
        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            return buttonClickLK.isDisplayed();
        }
        catch (NoSuchElementException e){return false;}
    finally {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }
    }


    //Пример кастомного явного ожидания
    public void wait_ButtonPassLK_ModalWindow()
    {
        var newWait = new WebDriverWait(driver,Duration.ofSeconds(5));
        newWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Перейти в ЛК ']")));
    }
}
