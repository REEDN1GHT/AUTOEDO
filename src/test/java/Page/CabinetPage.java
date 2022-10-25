package Page;

import Resources.ConfigBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CabinetPage {
    private WebDriver driver;
    private WebDriverWait wait;
    public static String URLForm;

    @FindBy(id="uploadForm")
    WebElement docSelect;
    @FindBy(id="upload")
    public WebElement buttonUpload;

    private By waitModalCreateDoc = By.cssSelector("#createDocModal .h5");
    public CabinetPage(WebDriver driver,WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver,this);
    }
    public void createDocument()  {
        WebElement shadowHost = driver.findElement(By.tagName("left-nav"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement shadowContent = shadowRoot.findElement(By.cssSelector("#createDocumentButton"));
        shadowContent.click();
    }
    public void setSelect() {
        var viborDoc = new Select(docSelect);
        setWaitModalCreateDoc();
        viborDoc.selectByVisibleText(ConfigBuilder.getproperty("EDOnamedoc"));
    }
    public void setSelect2() {
        var viborDoc = new Select(docSelect);
        setWaitModalCreateDoc();
        viborDoc.selectByVisibleText(ConfigBuilder.getproperty("EDOnamedoc2"));
    }
    public void clickCreate()
    {
        buttonUpload.click();
    }
    public void openInteractiveFormDocument() {
        createDocument();
        setSelect();
        clickCreate();
    }
    public void setWaitModalCreateDoc()
    {
        WebDriverWait newWait = new WebDriverWait(driver,Duration.ofSeconds(5));
        newWait.until(ExpectedConditions.textToBePresentInElementLocated(waitModalCreateDoc,"Новый документ"));
    }

    public void parseUrlForm(){
        URLForm = driver.getCurrentUrl();
    }

}
