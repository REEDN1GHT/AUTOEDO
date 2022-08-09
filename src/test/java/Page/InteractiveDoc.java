package Page;

import Resources.ConfigBuilder;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class InteractiveDoc{
    private WebDriver driver;
    private WebDriverWait wait;
    public static String iNNGRBS;
    public static String foFormRio;
    //Локаторы для периодички
   // @FindBy(id="gwt-uid-57")// присмотреться к локатору, возможно изменится
   // WebElement period;
    @FindBy(css = "#period.multiselect.size-sm.w100px.e-select.e-select--light.e-select--small")
    WebElement clickPeriod;
    @FindBy(xpath = "//span[text()='06']/parent::span[@class='multiselect__option']")
    WebElement viborPeriod;
    @FindBy(css="#sub-report>.multiselect__select")
    WebElement clickPod;
    @FindBy(css="input#sub-report")
    WebElement podotchet_doxod;
    @FindBy(css="#sub-report .multiselect__element")
    WebElement podotchet_doxod_click;
    @FindBy(css = ".btn.mr-2.btn-outline-primary.btn-small")
    WebElement addString;
    @FindBy (css=".swal2-actions.swal2-loading")
    private By loaderDoc = By.id("swal2-title");

    //РИО


    @FindBy (id = "gwt-uid-31")
    WebElement placeiNNGRBS;

    @FindBy(xpath = "//button[text()='ОК']")
    public WebElement modalWindow;
    @FindBy(xpath = "//input[@id='gwt-uid-27']/following-sibling::div")
    public WebElement buttonYearRio;
    @FindBy (xpath="//input[@id='gwt-uid-29']/following-sibling::div")
    public WebElement buttonStageFormRIO;
    @FindBy(xpath = "//input[@id='gwt-uid-33']/following-sibling::div")
    public WebElement buttonKbkFormRio;
    @FindBy (xpath = "//input[@id='gwt-uid-35']/following-sibling::div")
    WebElement buttonVersionDocument;

    public InteractiveDoc(WebDriver driver, WebDriverWait wait)
    {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver,this);
    }

    public boolean isElementPresented() {
        List list = driver.findElements(By.cssSelector(".swal2-popup.swal2-modal.swal2-icon-warning.swal2-show"));
        return list.size() >0;
    }
public void setPeriod()
{
    clickPeriod.click();
    viborPeriod.click();

}
    public void setPodotchet_doxod(String podotchet) throws InterruptedException {
        clickPod.click();
        podotchet_doxod.sendKeys(podotchet);

        podotchet_doxod_click.click();
    }

    public void loaderDoc()
    {
        wait.until(ExpectedConditions.invisibilityOfElementWithText(loaderDoc,"Ожидайте"));
    }
    public void setAddString()
    {
        addString.click();
    }

    //Поле Год в шапке документа
    public void setYearFormRio() throws InterruptedException {
        wait_waitYearRIO();
        buttonYearRio.click();
        String spisokYearFormRio = ConfigBuilder.getproperty("yearFormRIO");
        WebElement buttonENTER = driver.findElement(By.xpath("//span[text()='"+spisokYearFormRio+"']/parent::td"));
        buttonENTER.click();
    }

    public void setStageFormRIO() throws InterruptedException {
        wait_waitStageRio();
        buttonStageFormRIO.click();
        String spisokStageFormRio = ConfigBuilder.getproperty("stageFormRIO");
        WebElement buttonENTER = driver.findElement(By.xpath("//span[text()='"+spisokStageFormRio+"']/parent::td"));
        buttonENTER.click();
    }

    public void setKbkFormRIO() throws InterruptedException {
        wait_Kbk_Rio();
        buttonKbkFormRio.click();
        String spisokKbkFormRio = ConfigBuilder.getproperty("kbkFormRIO");
        WebElement buttonENTER = driver.findElement(By.xpath("//span[text()='"+spisokKbkFormRio+"']/parent::td"));
        buttonENTER.click();
    }

    public void setiNNGRBS() {
        iNNGRBS = placeiNNGRBS.getAttribute("value");
    }
    public String setFoFormRIO()
    {
        WebElement shadowHost = driver.findElement(By.tagName("interactive-top-panel"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement shadowContent = shadowRoot.findElement(By.cssSelector(".text-dark.h4"));
        return foFormRio = shadowContent.getText().replaceAll("\\D+","");
    }

    public void setVersionDocument(String version) throws InterruptedException {
        wait_VersionDocumentRio();
        buttonVersionDocument.click();
        String spisokVersionFormRio = ConfigBuilder.getproperty("VERdpFormRIO");
        WebElement buttonENTER = driver.findElement(By.xpath("//span[text()='"+spisokVersionFormRio+"']/parent::td"));
        buttonENTER.click();
    }

    public String CheckListHeaderformRioEDO() {
        List<String> myValuess = driver.findElements(By.cssSelector(".v-filterselect-suggestmenu td"))
                .stream()
                .map(option -> option.getAttribute("innerText").trim())
                .collect(Collectors.toList());

        return myValuess.toString();
    }


    public List<String> valuesADM()
    {
        List<String> myValuess = driver.findElements(By.cssSelector("#period-table__row_0 [aria-colindex='3'] .multiselect__element .multiselect__option"))
                .stream()
                .map(option -> option.getAttribute("innerText").trim())
                .collect(Collectors.toList());

        return myValuess;
    }

    public List<String> kodDoxoda()
    {
        List<String> myValuess = driver.findElements(By.cssSelector("#period-table__row_0 [aria-colindex='4'] .multiselect__element .multiselect__option"))
                .stream()
                .map(option -> option.getAttribute("innerText").trim())
                .sorted()
                .collect(Collectors.toList());

        return myValuess;
    }
    public List<String> RazdelRasxod()
    {
        List<String> myValuess = driver.findElements(By.cssSelector("#period-table__row_0 [aria-colindex='4'] .multiselect__element .multiselect__option"))
                .stream()
                .map(option -> option.getAttribute("innerText").trim())

                .collect(Collectors.toList());

        return myValuess;
    }
    public List<String> TselevaiaRasxod()
    {
        List<String> myValuess = driver.findElements(By.cssSelector("#period-table__row_0 [aria-colindex='5'] .multiselect__element .multiselect__option"))
                .stream()
                .map(option -> option.getAttribute("innerText").trim())
                .collect(Collectors.toList());

        return myValuess;
    }
    public List<String> TselevaiaMORasxod()
    {
        List<String> myValuess = driver.findElements(By.cssSelector("#period-table__row_0 [aria-colindex='6'] .multiselect__element .multiselect__option"))
                .stream()
                .map(option -> option.getAttribute("innerText").trim())
                .collect(Collectors.toList());

        return myValuess;
    }
    public List<String> VIRasxod()
    {
        List<String> myValuess = driver.findElements(By.cssSelector("#period-table__row_0 [aria-colindex='7'] .multiselect__element .multiselect__option"))
                .stream()
                .map(option -> option.getAttribute("innerText").trim())
                .sorted()
                .collect(Collectors.toList());

        return myValuess;
    }
    public List<String> KosgyRasxod()
    {
        List<String> myValuess = driver.findElements(By.cssSelector("#period-table__row_0 [aria-colindex='8'] .multiselect__element .multiselect__option"))
                .stream()
                .map(option -> option.getAttribute("innerText").trim())
                .collect(Collectors.toList());

        return myValuess;
    }
    public boolean wait_waitYearRIO()
    {
        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            return buttonYearRio.isDisplayed();
        }
        catch (NoSuchElementException e){return false;}
        finally {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }
    }
    public boolean wait_waitStageRio()
    {
        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            return buttonStageFormRIO.isDisplayed();
        }
        catch (NoSuchElementException e){return false;}
        finally {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }
    }
    public boolean wait_Kbk_Rio()
    {
        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            return buttonKbkFormRio.isDisplayed();
        }
        catch (NoSuchElementException e){return false;}
        finally {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }
    }
    public boolean wait_VersionDocumentRio()
    {
        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            return buttonVersionDocument.isDisplayed();
        }
        catch (NoSuchElementException e){return false;}
        finally {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }
    }

    public void createDocument()  {
        WebElement shadowHost = driver.findElement(By.tagName("left-nav-interactive"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement shadowContent = shadowRoot.findElement(By.cssSelector("#upload"));
        shadowContent.click();
   }

}