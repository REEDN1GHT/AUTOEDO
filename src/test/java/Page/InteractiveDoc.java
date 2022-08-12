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

import static Tests.Form_Rio.Document_Header_Rio.kbkFormRIO;

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
    public WebElement buttonVersionDocument;
    @FindBy(xpath = "//div[@class='v-filterselect v-widget v-has-width v-required v-filterselect-required v-filterselect-focus']/input")
    public WebElement stageFormRIO;
    @FindBy(css = ".gwt-MenuItem.gwt-MenuItem-selected")
    public WebElement viborElement;
    @FindBy(css=".v-filterselect-input.v-filterselect-input-readonly")
    public WebElement versionDBFormRio;
    @FindBy(css = ".swal2-confirm.swal2-styled")
    public WebElement modalWindowButtonOK;
    @FindBy(xpath = "//span[text()='Добавить строку']/ancestor::div[@role='button']")
    public WebElement buttonAddNewString;
    @FindBy(css = ".v-filterselect.v-widget.v-modified.v-has-width.missedField.v-filterselect-missedField .v-filterselect-button")
    public WebElement subReport;

    @FindBy(xpath = "//td[@class='v-table-cell-content'][3]//input")
    public WebElement field2021ManualInput;
    @FindBy(xpath = "//td[@class='v-table-cell-content'][4]//input")
    public WebElement field2022ManualInput;
    @FindBy(xpath = "//td[@class='v-table-cell-content'][5]//input")
    public WebElement field2023NotManualInput;
    @FindBy(xpath = "//td[@class='v-table-cell-content'][7]//input")
    public WebElement field2024NotManualInput;
    @FindBy(xpath = "//td[@class='v-table-cell-content'][9]//input")
    public WebElement field2025NotManualInput;
    @FindBy(xpath = "//td[@class='v-table-cell-content'][6]//input")
    public WebElement fieldTempRost1;
    @FindBy(xpath = "//td[@class='v-table-cell-content'][8]//input")
    public WebElement fieldTempRost2;
    @FindBy(xpath = "//td[@class='v-table-cell-content'][10]//input")
    public WebElement fieldTempRost3;

    private By modalWindowNoDoc = By.id("swal2-content");
    private By modal = By.xpath("//*[text()='Готовый документ не найден']");

    public InteractiveDoc(WebDriver driver, WebDriverWait wait)
    {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver,this);
    }

    public boolean isElementPresented() {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            List list = driver.findElements(By.cssSelector(".swal2-popup.swal2-modal.swal2-icon-warning.swal2-show"));
        return list.size()>0;
    }


    //Поле Год в шапке документа
    public void setYearFormRio() throws InterruptedException {
        buttonYearRio.click();
        String spisokYearFormRio = ConfigBuilder.getproperty("yearFormRIO");
        WebElement buttonENTER = driver.findElement(By.xpath("//span[text()='"+spisokYearFormRio+"']/parent::td"));
        buttonENTER.click();
    }

    //Старая реализация для поля Стадия. Только для поля "Стадия".
    //Причина: В новой реализации, при раскрытии списка в ЭДО и конфиге раздичаются значения
    public void setStageFormRio() throws InterruptedException {
        stageFormRIO.sendKeys(ConfigBuilder.getproperty("stageFormRIO"));
        viborElement.click();
    }
    public void setStageDPFormRio() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        stageFormRIO.sendKeys(ConfigBuilder.getproperty("stageDPFormRIO"));
        viborElement.click();
    }

    public void setKbkFormRIO() throws InterruptedException {
        wait_Kbk_Rio();
        buttonKbkFormRio.click();
        String spisokKbkFormRio = ConfigBuilder.getproperty("kbkFormRIO");
        WebElement buttonENTER = driver.findElement(By.xpath("//span[text()='"+spisokKbkFormRio+"']/parent::td"));
        buttonENTER.click();
    }
    public void setKbkDPFormRIO() throws InterruptedException {
        wait_Kbk_Rio();
        buttonKbkFormRio.click();
        String spisokKbkFormRio = ConfigBuilder.getproperty("kbkDPFormRIO");
        WebElement buttonENTER = driver.findElement(By.xpath("//span[text()='"+spisokKbkFormRio+"']/parent::td"));
        buttonENTER.click();
    }
    public void setVersionDocument()
    {
        wait_Kbk_Rio();
        buttonVersionDocument.click();
        String spisokVersionFormRio = ConfigBuilder.getproperty("VERdpFormRIO");
        WebElement buttonENTER = driver.findElement(By.xpath("//span[text()='"+spisokVersionFormRio+"']/parent::td"));
        buttonENTER.click();
    }
    public void setNumberDBFormRio() throws InterruptedException {
        wait_Kbk_Rio();
        buttonVersionDocument.click();
        String spisokNumberDBFormRio = ConfigBuilder.getproperty("NUMBERdpFormRIO");
        WebElement buttonENTER = driver.findElement(By.xpath("//span[text()='"+spisokNumberDBFormRio+"']/parent::td"));
        buttonENTER.click();
    }
    public void buttonLoadDocumentInteractivePage()  {
        WebElement shadowHost = driver.findElement(By.tagName("left-nav-interactive"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement shadowContent = shadowRoot.findElement(By.cssSelector("#upload"));
        shadowContent.click();
    }

    public void setListSubReport()
    {
        subReport.click();
        String listSubReportFormRio11 = ConfigBuilder.getproperty("subReportFormRio11");
        WebElement buttonENTER = driver.findElement(By.xpath("//span[text()='"+listSubReportFormRio11+"']/parent::td"));
        buttonENTER.click();
    }




    public String CheckListHeaderformRioEDO() {
        List<String> myValuess = driver.findElements(By.cssSelector(".v-filterselect-suggestmenu td"))
                .stream()
                .map(option -> option.getAttribute("innerText").trim())
                .collect(Collectors.toList());

        return myValuess.toString();
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
    public void parsData()
    {
        setiNNGRBS();
        setFoFormRIO();
    }

    public void waitModalWindow()
    {
        var newWait = new WebDriverWait(driver,Duration.ofSeconds(16));
        newWait.until(ExpectedConditions.visibilityOfElementLocated(modalWindowNoDoc));
    }
    public void waitSubformRio()
    {
        var newWait = new WebDriverWait(driver,Duration.ofSeconds(15));
        newWait.until(ExpectedConditions.visibilityOfElementLocated(modal));
    }
    public boolean wait_waitYearRIO()
    {
        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
            return buttonYearRio.isDisplayed();
        }
        catch (NoSuchElementException e){return false;}
        finally {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }
    }
    public void wait_waitStageRio()
    {
        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        }
        finally {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }
    }
    public void setWait()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public boolean wait_Kbk_Rio()
    {
        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
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
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
            return buttonVersionDocument.isDisplayed();
        }
        catch (NoSuchElementException e){return false;}
        finally {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }
    }









/*
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

    public void setVersionDocument(String version) throws InterruptedException {
        wait_VersionDocumentRio();
        buttonVersionDocument.click();
        String spisokVersionFormRio = ConfigBuilder.getproperty("VERdpFormRIO");
        WebElement buttonENTER = driver.findElement(By.xpath("//span[text()='"+spisokVersionFormRio+"']/parent::td"));
        buttonENTER.click();
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



*/
}