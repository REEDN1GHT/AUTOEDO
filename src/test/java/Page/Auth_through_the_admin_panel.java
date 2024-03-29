package Page;

import Resources.ConfigBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.text.html.CSS;
import javax.xml.xpath.XPath;
import java.time.Duration;

public class Auth_through_the_admin_panel {


    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//input[@type=\"text\" and contains( @id,\"gwt-uid\")]")
    public WebElement login;
    @FindBy(xpath = "//input[@type=\"password\" and contains( @id,\"gwt-uid\")]")
    public WebElement password;
    @FindBy(css = ".v-button.v-widget.v-has-width")
    public WebElement buttonSignInADM;
    @FindBy(xpath = "//input[@class=\"v-textfield v-widget v-has-width\" and contains(@id,\"gwt-uid\")]")
    public WebElement keyphrase;
    @FindBy(xpath ="//input[@class=\"v-filterselect-input\" and contains(@id,\"gwt-uid\")]/following::input")
    public WebElement rolecombobox;
    @FindBy(css = ".gwt-MenuItem.gwt-MenuItem-selected")
    public WebElement viborelement;
    @FindBy(css = ".v-button.v-widget.user.v-button-user")
    public WebElement searchbutton;
    @FindBy(xpath = "//button[@class=\"v-nativebutton\"]")
    public WebElement buttonSignInACC;
    private By keyphraseforwait = By.xpath("//input[@class=\"v-textfield v-widget v-has-width\" and contains(@id,\"gwt-uid\")]");


    public Auth_through_the_admin_panel(WebDriver driver, WebDriverWait wait)
    {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver, this);
    }
    public void openADM() {
        driver.navigate().to(ConfigBuilder.getproperty("ADMINurl"));

    }
    public void setLogin() {
        login.sendKeys(ConfigBuilder.getproperty("ADMINlogin"));
    }
    public void setPassword() {
        password.sendKeys(ConfigBuilder.getproperty("ADMINpassword"));
    }
    public void setButtonSignInADM() {
        buttonSignInADM.click();
    }
    public void setKeyphrase() {
        keyphrase.sendKeys(ConfigBuilder.getproperty("ADMINFIOaccaunt"));
    }
    public void setRolecombobox() {
        rolecombobox.sendKeys(ConfigBuilder.getproperty("ADMINrole"));
        viborelement.click();
    }
    public void setSearchbutton() {
        searchbutton.click();
    }
    public void setButtonSignInACC() {
        buttonSignInACC.click();
    }
    public void setModalWindowRole() {
        String ModalWindowRole = ConfigBuilder.getproperty("ADMINrole");
        WebElement buttonENTER = driver.findElement(By.xpath("//*[contains(text(),'"+ModalWindowRole+"')]/following::button"));
        buttonENTER.click();
    }
    public void waitAuthSuccessful() {
        var newWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        newWait.until(ExpectedConditions.visibilityOfElementLocated(keyphraseforwait));
    }
    public void ADMINauthorization() throws InterruptedException {
        openADM();
        setLogin();
        setPassword();
        setButtonSignInADM();
        waitAuthSuccessful();
        setKeyphrase();
        setRolecombobox();;
        setSearchbutton();
        Thread.sleep(1000);
        setButtonSignInACC();
        setModalWindowRole();
    }
}
