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
import Resources.ConfigBuilder;



public class AuthKazna {

    private WebDriver driver;

    private WebDriverWait wait;

    String url;
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
        driver.navigate().to(ConfigBuilder.getproperty("KAZNAurl"));
    }

   public void setLoginfield()
    {
        Loginfield.sendKeys(ConfigBuilder.getproperty("KAZNAlogin"));
    }

    public void setPasswordfield()
    {
        Passwordfield.sendKeys(ConfigBuilder.getproperty("KAZNApassword"));
    }

    public void setButtonSignIn()
    {
        buttonSignIn.click();
    }
    public void setClickCardAuth()
    {
        String orgLS = ConfigBuilder.getproperty("KAZNAorgLS");
        WebElement SwitchLS = driver.findElement(By.xpath("//div[contains(text(),'"+orgLS+"')]"));
        SwitchLS.click();
        //clickCardAuth.click();
    }

    public void kaznaAuthor()
    {
        setLoginfield();
        setPasswordfield();
        setButtonSignIn();
        if (isElementPresent())
        {
            setClickCardAuth();
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
