package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MainPage {
    private WebDriver driver;
    private WebDriverWait wait;
    String url = "http://172.31.1.149/#/";
    public MainPage(WebDriver driver, WebDriverWait wait)
    {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver,this);
    }
    private By cabinetRole = By.id("cabinet");

    @FindAll(
            {@FindBy (id = "login"),
             @FindBy(id = "password")})
    public WebElement logopas;






    @FindBy(css = ".btn.d-flex.mt-4.align-items-center.btn-primary.btn-huge")
    public WebElement buttonEnterMainPage;
    @FindBy(id = "login")
    public WebElement loginField;
    @FindBy(id = "password")
    private WebElement passwordField;
    @FindBy(css = ".btn.flex-grow-1.btn-primary.btn-huge")
    private WebElement buttonEnterAuthorization;
    @FindBy(css = ".btn.flex-grow-1.btn-primary.btn-huge")
    public WebElement buttonSubmit;
    @FindBy(id="cabinet")
    WebElement role;
    @FindBy(css = "#cabinet-modal___BV_modal_footer_ >button:nth-child(1)")
    public WebElement buttonSignInCabinet;
    //@FindBy(id = "")
    public By titleRoleText = By.id("no-target-role");

    public void open()
    {
        driver.navigate().to(url);
    }

    public void setLoginField(String logoPas)
    {
        loginField.sendKeys(logoPas);
    }
    public void setPasswordField(String logoPas)
    {
        passwordField.sendKeys(logoPas);
    }
    public void setButtonEnterAuthorization()
    {
        buttonEnterAuthorization.click();
    }
    public void role(String value)  {
        var cabinetRole = new Select(role);
        cabinetRole.selectByVisibleText(value);

        //return new CabinetPage(driver,wait);
    }
    public void setButtonSignInCabinet()
    {
        buttonSignInCabinet.click();
    }
    public void waitCabinet()
    {
        wait.until(ExpectedConditions.elementToBeClickable(buttonSignInCabinet));
    }

    public void authorization(String logopas,String value)  {
        setLoginField(logopas);
        setPasswordField(logopas);
        setButtonEnterAuthorization();
        role(value);
        waitCabinet();
        //Thread.sleep(500);
        setButtonSignInCabinet();
    }
}
