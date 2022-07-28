package Page;

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
    String url = "http://172.31.1.149/#/";

    private By createButton = By.id("createDocumentButton");

    @FindBy(id="uploadForm")
    WebElement docSelect;

    @FindBy(id="upload")
    public WebElement buttonUpload;

    public CabinetPage(WebDriver driver,WebDriverWait wait)
    {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver,this);
    }

    public void createDocument()  {
//        WebElement roots = new WebDriverWait(driver,30)
//                .until(ExpectedConditions.visibilityOfElementLocated(By.tagName("left-nav")));
//        JavascriptExecutor jsDriver= (JavascriptExecutor) driver;
//        SearchContext shadow_root = (SearchContext) jsDriver.executeScript("return arguments[0].shadowRoot",roots);
//        WebElement docButton =shadow_root.findElement(createButton);
//        docButton.click();

//          WebElement roots = driver.findElement(By.tagName("left-nav"));
//       // JavascriptExecutor jsDriver= (JavascriptExecutor) driver;
//        WebElement searchContext = (WebElement) ((JavascriptExecutor)driver).executeScript("return arguments[0].shadowRoot",roots);
//          WebElement shadow =  searchContext.findElement(By.id("createDocumentButton"));
//          shadow.click();


        WebElement shadowHost = driver.findElement(By.tagName("left-nav"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        //Thread.sleep(1000);
       // WebElement shadowContent = new WebDriverWait(driver, Duration.ofSeconds(40)).until(ExpectedConditions.visibilityOf(shadowRoot.findElement(By.cssSelector(".nav-link"))));
WebElement shadowContent = shadowRoot.findElement(By.cssSelector("#createDocumentButton"));
shadowContent.click();
        //Thread.sleep(1000);
       // shadowContent.click();
    }
   // public void waitCreateButton()
  //  {
 //       wait.until(ExpectedConditions.visibilityOfElementLocated(".nav-link"));
  //  }
    public void setSelect(String value) throws InterruptedException {
        var viborDoc = new Select(docSelect);
        Thread.sleep(1000);
        viborDoc.selectByVisibleText(value);
    }
    public void clickCreate()
    {
        buttonUpload.click();
        //return new InteractiveDocPage(driver,wait);
    }

}
