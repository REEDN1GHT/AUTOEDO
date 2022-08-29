package Page;

import Resources.ConfigBuilder;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.xpath.XPath;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;

public class InteractiveDoc{
    private WebDriver driver;
    private WebDriverWait wait;
    public static String iNNGRBS;
    public static String foFormRio;
    public static List<String> actualDate = new ArrayList<>();
    public  BigDecimal dataField;

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
    @FindBy(xpath = "//div[@class='v-expand']/div[@class='v-slot'][1]/div[@class='v-formlayout v-layout v-widget v-has-width']//div[@class='v-filterselect-button']")
    public WebElement buttonYearRio;
    @FindBy (xpath="//div[@class='v-expand']/div[@class='v-slot'][2]/div[@class='v-formlayout v-layout v-widget v-has-width']//div[@class='v-filterselect-button']")
    public WebElement buttonStageFormRIO;
    @FindBy(xpath = "//div[@class='v-expand']/div[@class='v-slot'][4]/div[@class='v-formlayout v-layout v-widget v-has-width']//div[@class='v-filterselect-button']")
    public WebElement buttonKbkFormRio;
    @FindBy (xpath = "//div[@class='v-expand']/div[@class='v-slot'][5]/div[@class='v-formlayout v-layout v-widget v-has-width']//div[@class='v-filterselect-button']")
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
    @FindBy(xpath = "//tr[@class='v-table-row-odd'][13]//td[@class='v-table-cell-content'][3]//input")
    public WebElement field2023Number10;
    @FindBy(xpath = "//tr[@class='v-table-row-odd'][12]//td[@class='v-table-cell-content'][4]//input")
    public WebElement field2024Number8_3;
    @FindBy(xpath = "//tr[@class='v-table-row-odd'][12]//td[@class='v-table-cell-content'][5]//input")
    public WebElement field2025Number8_3;
    @FindBy(xpath = "//td[@class='v-table-cell-content'][10]//input")
    public WebElement field1QuarterSubform3_1;
    @FindBy(xpath = "//td[@class='v-table-cell-content'][last()]//input")
    public WebElement fieldExpensesSubFormLast;
    @FindBy (xpath = "//tr[@class='v-table-row'][14]/td[@class='v-table-cell-content'][3]//input")
    public WebElement field2023Number11;
    @FindBy (xpath = "//tr[@class='v-table-row'][14]/td[@class='v-table-cell-content'][4]//input")
    public WebElement field2024Number11;
    @FindBy (xpath = "//tr[@class='v-table-row'][14]/td[@class='v-table-cell-content'][5]//input")
    public WebElement field2025Number11;
    @FindBy (xpath = "//tr[@class='v-table-row']//div[@class='v-filterselect-button']")
    public WebElement numeIndicatorSubForm1;
    @FindBy(xpath = "//div[text()='Руководитель']/parent::div")
    public WebElement switchPlacementtoChiefformRIO;
    @FindBy(xpath = "//div[@class='v-table-footer']//td[3]//span[@class='row_any'][2]")
    public WebElement stringTotal2021;
    @FindBy(xpath = "//div[@class='v-table-footer']//td[4]//span[@class='row_any'][2]")
    public WebElement stringTotal2022;
    @FindBy(xpath = "//div[@class='v-table-footer']//td[5]//span[@class='row_any'][2]")
    public WebElement stringTotal2023;
    @FindBy(xpath = "//div[@class='v-table-footer']//td[7]//span[@class='row_any'][2]")
    public WebElement stringTotal2024;
    @FindBy(xpath = "//div[@class='v-table-footer']//td[9]//span[@class='row_any'][2]")
    public WebElement stringTotal2025;
    @FindBy(xpath = "//div[@class='v-table-footer']//td[6]//span[@class='row_any'][2]")
    public WebElement stringTotalGrowthRate1;
    @FindBy(xpath = "//div[@class='v-table-footer']//td[8]//span[@class='row_any'][2]")
    public WebElement stringTotalGrowthRate2;
    @FindBy(xpath = "//div[@class='v-table-footer']//td[10]//span[@class='row_any'][2]")
    public WebElement stringTotalGrowthRate3;
    @FindBy (xpath = "//div[@class='v-scrollable v-table-body-wrapper v-table-body']")
    public WebElement scrollTable;

    private By modalWindowNoDoc = By.id("swal2-content");
    private By modal = By.xpath("//*[text()='Готовый документ не найден']");
    private By swalSuccessfulSave = By.xpath("//*[text()='Документ успешно сохранен']");


    public InteractiveDoc(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver,this);
    }
    public boolean isElementPresented() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        List list = driver.findElements(By.cssSelector(".swal2-popup.swal2-modal.swal2-icon-warning.swal2-show"));
        return list.size()>0;
    }
    public void waitForElementToBeRefreshed() {
        WebDriverWait newWait = new WebDriverWait(driver,Duration.ofSeconds(30));
        newWait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(buttonYearRio)));
    }

    //Поле Год в шапке документа
    public void setYearFormRio() {
        waitForElementToBeRefreshed();
        buttonYearRio.click();
        String spisokYearFormRio = ConfigBuilder.getproperty("yearFormRIO");
        WebElement buttonENTER = driver.findElement(By.xpath("//span[text()='"+spisokYearFormRio+"']/parent::td"));
        buttonENTER.click();
    }
    //Старая реализация для поля Стадия. Только для поля "Стадия".
    //Причина: В новой реализации, при раскрытии списка в ЭДО и конфиге различаются значения
    public void setStageFormRio() {
        stageFormRIO.sendKeys(ConfigBuilder.getproperty("stageFormRIO"));
        viborElement.click();
    }
    public void setStageDPFormRio() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        stageFormRIO.sendKeys(ConfigBuilder.getproperty("stageDPFormRIO"));
        viborElement.click();
    }
    public void setKbkFormRIO() {
        wait_Kbk_Rio();
        buttonKbkFormRio.click();
        String spisokKbkFormRio = ConfigBuilder.getproperty("kbkFormRIO");
        WebElement buttonENTER = driver.findElement(By.xpath("//span[text()='"+spisokKbkFormRio+"']/parent::td"));
        buttonENTER.click();
    }
    public void setKbkDPFormRIO() {
        wait_Kbk_Rio();
        buttonKbkFormRio.click();
        String spisokKbkFormRio = ConfigBuilder.getproperty("kbkDPFormRIO");
        WebElement buttonENTER = driver.findElement(By.xpath("//span[text()='"+spisokKbkFormRio+"']/parent::td"));
        buttonENTER.click();
    }
    public void setVersionDocument() {
        wait_Kbk_Rio();
        buttonVersionDocument.click();
        String spisokVersionFormRio = ConfigBuilder.getproperty("VERdpFormRIO");
        WebElement buttonENTER = driver.findElement(By.xpath("//span[text()='"+spisokVersionFormRio+"']/parent::td"));
        buttonENTER.click();
    }
    public void setNumberDBFormRio() {
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
    public void buttonSaveDocumentInteractivePage() {
        WebElement shadowHost = driver.findElement(By.tagName("left-nav-interactive"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement shadowContent = shadowRoot.findElement(By.cssSelector("#save"));
        shadowContent.click();
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-DD HH:mm");
        formatter.format(date);
        String Date1 = String.valueOf(date);
        actualDate.add(String.join(Date1));

    }

    public void setListSubReport(String str) throws InterruptedException {
        subReport.click();
       // subReport2.sendKeys(str);
        Thread.sleep(600);
        //subReport2.sendKeys(Keys.ENTER);
        //String listSubReportFormRio11 = ConfigBuilder.getproperty("subReportFormRio11");
         WebElement buttonENTER = driver.findElement(By.xpath("//span[text()='"+str+"']/parent::td"));
         buttonENTER.click();
    }


    public void setFieldIndictorSubForm1()
    {
        numeIndicatorSubForm1.click();
        String listSubReportFormRio11 = ConfigBuilder.getproperty("nameIndicatorSubForm1");
        WebElement buttonENTER = driver.findElement(By.xpath("//span[text()='"+listSubReportFormRio11+"']/parent::td"));
        buttonENTER.click();
    }
    public void setFieldIndictorPaymentLandTaxSubForm1()
    {
        numeIndicatorSubForm1.click();
        String listSubReportFormRio11 = ConfigBuilder.getproperty("nameIndicatorPaymentLandTaxSubForm1");
        WebElement buttonENTER = driver.findElement(By.xpath("//span[text()='"+listSubReportFormRio11+"']/parent::td"));
        buttonENTER.click();
    }
    public void setField2023Number10()
    {
        field2023Number10.sendKeys("457457");
        field2023Number10.sendKeys(Keys.ENTER);
    }
    public void setField2024Number8_3()
    {
        field2024Number8_3.sendKeys("445732");
        field2024Number8_3.sendKeys(Keys.ENTER);
    }
    public void setField2025Number10()
    {
        field2025Number8_3.sendKeys("5436654");
        field2025Number8_3.sendKeys(Keys.ENTER);
    }

    public void setfield1QuarterSubform3_1() throws InterruptedException {
       // Thread.sleep(700);

            field1QuarterSubform3_1.sendKeys("857864");
            field1QuarterSubform3_1.sendKeys(Keys.ENTER);

    }

    public String raschetZnach(String str, String str2)
    {
        var raschet = Float.parseFloat(str)/Float.parseFloat(str2)*100;
        dataField = new BigDecimal(raschet).setScale(2, RoundingMode.HALF_UP);
        return dataField.toString();
    }


    public void getValuefield2023Subform2()
    {
        float data2023Subform2 = Float.parseFloat(field2023Number11.getAttribute("value").replace(',','.'));
        dataField = new BigDecimal(data2023Subform2).setScale(2, RoundingMode.HALF_UP).setScale(1, RoundingMode.HALF_UP);
    System.out.println(dataField);
    }
    public void getValuefield2024Subform2()
    {
        float data2023Subform2 = Float.parseFloat(field2024Number11.getAttribute("value").replace(',','.'));
        dataField = new BigDecimal(data2023Subform2).setScale(2, RoundingMode.HALF_UP).setScale(1, RoundingMode.HALF_UP);

    }
    public void getValuefield2025Subform2()
    {
        float data2023Subform2 = Float.parseFloat(field2025Number11.getAttribute("value").replace(',','.'));
        dataField = new BigDecimal(data2023Subform2).setScale(2, RoundingMode.HALF_UP).setScale(1, RoundingMode.HALF_UP);

    }

    public void getValueFieldEpensesSubform() throws InterruptedException {
        //Thread.sleep(400);
        float data2023Subform2 = Float.parseFloat(fieldExpensesSubFormLast.getAttribute("value").replace(',','.'));
        System.out.println(data2023Subform2);
        dataField = new BigDecimal(data2023Subform2).setScale(1, RoundingMode.HALF_UP);

    }
    public String okryglenie(float str)
    {
        dataField = new BigDecimal(str).setScale(1, RoundingMode.HALF_UP);
        return dataField.toString();
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

    public void setHeaderFieldFormRIO() throws InterruptedException
    {
        setYearFormRio();
        setStageFormRio();
        setKbkFormRIO();
        setVersionDocument();
    }
    public void scrollTableSubForm2()
    {
        for(var i = 0;i<10;i++)
            scrollTable.sendKeys(Keys.ARROW_DOWN);
    }

    public void waitSubformRio()
    {
        var newWait = new WebDriverWait(driver,Duration.ofSeconds(30));
        newWait.until(ExpectedConditions.visibilityOfElementLocated(modal));
    }

    public void waitDocSaveformRio()
    {
        var newWait = new WebDriverWait(driver,Duration.ofSeconds(30));
        newWait.until(ExpectedConditions.visibilityOfElementLocated(swalSuccessfulSave));
    }


    public void wait_waitfield2023SubForm1()
    {
        WebDriverWait newWait = new WebDriverWait(driver,Duration.ofSeconds(4));
        newWait.until(driver->driver.findElements(By.xpath("//tr[@class='v-table-row']")).size()==1);
     /*   try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
            return field2023NotManualInput.isDisplayed();
        }
        catch (NoSuchElementException e){return false;}
        finally {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }*/
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

    public void waitTablePresent()
    {
        WebDriverWait driverWait = new WebDriverWait(driver,Duration.ofSeconds(3));
        driverWait.until(driver1 -> driver.findElements(By.xpath("//div[@class='v-table-body-noselection']//tr")).size()>1);
    }


// Локаторы для футера формы РИО

    public String CheckListFIOformRIO() throws InterruptedException {
        List<String> ListFIO = new ArrayList<>();
        int STRnumber = 0;
        driver.findElement(By.xpath("//span[text()='ФИО']/parent::div/following-sibling::div/div")).click();
        WebElement Status = driver.findElement(By.xpath("//div[@class='v-filterselect-status']"));
        String Nstatus = Status.getAttribute("innerText");
        int RNstatus = Integer.parseInt(Nstatus.substring(Nstatus.indexOf("/")+1));
        while (RNstatus > STRnumber) {
            WebElement dropdown = driver.findElement(By.xpath("//span[text()='ФИО']/parent::div/following-sibling::div/input"));
            dropdown.sendKeys(Keys.DOWN);
            Thread.sleep(1000);
            String ValueSTR = dropdown.getAttribute("value");
            ListFIO.add(String.join(" , ", ValueSTR));
            STRnumber = STRnumber + 1;
        }
        Collections.sort(ListFIO);
        return ListFIO.toString();
    }
    public String CheckListJOBformRIO() throws InterruptedException {
        List<String> ListJOB = new ArrayList<>();
        int STRnumber = 0;
        driver.findElement(By.xpath("//span[text()='Должность']/parent::div/following-sibling::div/div")).click();
        WebElement Status = driver.findElement(By.xpath("//div[@class='v-filterselect-status']"));
        String Nstatus = Status.getAttribute("innerText");
        int RNstatus = Integer.parseInt(Nstatus.substring(Nstatus.indexOf("/")+1));
        while (RNstatus > STRnumber) {
            WebElement dropdown = driver.findElement(By.xpath("//span[text()='Должность']/parent::div/following-sibling::div/input"));
            dropdown.sendKeys(Keys.DOWN);
            Thread.sleep(1000);
            String ValueSTR = dropdown.getAttribute("value");
            ListJOB.add(String.join(" , ", ValueSTR));
            STRnumber = STRnumber + 1;
        }
        Collections.sort(ListJOB);
        return ListJOB.toString();
    }


    public String CheckListPHONEformRIO() throws InterruptedException {
        List<String> ListPHONE = new ArrayList<>();
        int STRnumber = 0;
        driver.findElement(By.xpath("//span[text()='Тел.']/parent::div/following-sibling::div/div")).click(); //Открытие выпадающего списка
        WebElement Status = driver.findElement(By.xpath("//div[@class='v-filterselect-status']")); //Определение кол-ва строк
        String Nstatus = Status.getAttribute("innerText");
        int RNstatus = Integer.parseInt(Nstatus.substring(Nstatus.indexOf("/")+1));
        while (RNstatus > STRnumber) {
            WebElement dropdown = driver.findElement(By.xpath("//span[text()='Тел.']/parent::div/following-sibling::div/input"));
            dropdown.sendKeys(Keys.DOWN);
            Thread.sleep(1000);
            String ValueSTR = dropdown.getAttribute("value");
            ListPHONE.add(String.join(" , ", ValueSTR));
            STRnumber = STRnumber + 1;
        }
        Collections.sort(ListPHONE);
        return ListPHONE.toString();

    }

    public String CheckListFIO_CHIEFformRIO() throws InterruptedException {
        List<String> ListFIO_CHIEF = new ArrayList<>();
        int STRnumber = 0;
        switchPlacementtoChiefformRIO.click(); //Переключение на вкладку "Руководитель"
        driver.findElement(By.xpath("//span[text()='ФИО']/parent::div/following-sibling::div/div")).click();
        WebElement Status = driver.findElement(By.xpath("//div[@class='v-filterselect-status']"));
        String Nstatus = Status.getAttribute("innerText");
        int RNstatus = Integer.parseInt(Nstatus.substring(Nstatus.indexOf("/")+1));
        while (RNstatus > STRnumber) {
            WebElement dropdown = driver.findElement(By.xpath("//span[text()='ФИО']/parent::div/following-sibling::div/input"));
            dropdown.sendKeys(Keys.DOWN);
            Thread.sleep(1000);
            String ValueSTR = dropdown.getAttribute("value");
            ListFIO_CHIEF.add(String.join(" , ", ValueSTR));
            STRnumber = STRnumber + 1;
        }
        Collections.sort(ListFIO_CHIEF);
        return ListFIO_CHIEF.toString();
    }

    public String CheckListJOB_CHIEFformRIO() throws InterruptedException {
        List<String> ListJOB_CHIEF = new ArrayList<>();
        int STRnumber = 0;
        switchPlacementtoChiefformRIO.click(); //Переключение на вкладку "Руководитель"
        driver.findElement(By.xpath("//span[text()='Должность']/parent::div/following-sibling::div/div")).click();
        WebElement Status = driver.findElement(By.xpath("//div[@class='v-filterselect-status']"));
        String Nstatus = Status.getAttribute("innerText");
        int RNstatus = Integer.parseInt(Nstatus.substring(Nstatus.indexOf("/")+1));
        while (RNstatus > STRnumber) {
            WebElement dropdown = driver.findElement(By.xpath("//span[text()='Должность']/parent::div/following-sibling::div/input"));
            dropdown.sendKeys(Keys.DOWN);
            Thread.sleep(1000);
            String ValueSTR = dropdown.getAttribute("value");
            ListJOB_CHIEF.add(String.join(" , ", ValueSTR));
            STRnumber = STRnumber + 1;
        }
        Collections.sort(ListJOB_CHIEF);
        return ListJOB_CHIEF.toString();
    }
    public void setFIOformRIO() {
        WebElement field = driver.findElement(By.xpath("//span[text()='ФИО']/parent::div/following-sibling::div/input"));
        field.clear();
        field.sendKeys("Авто тест тестович");
        field.sendKeys(Keys.ENTER);
    }
    public void setJOBformRIO() {
        WebElement field = driver.findElement(By.xpath("//span[text()='Должность']/parent::div/following-sibling::div/input"));
        field.clear();
        field.sendKeys("Автотестер");
        field.sendKeys(Keys.ENTER);
    }
    public void setPHONEformRIO() {
        WebElement field = driver.findElement(By.xpath("//span[text()='Тел.']/parent::div/following-sibling::div/input"));
        field.clear();
        field.sendKeys("89283866775");
        field.sendKeys(Keys.ENTER);
    }

    public void setFIO_ChiefformRIO() {
        WebElement field = driver.findElement(By.xpath("//span[text()='ФИО']/parent::div/following-sibling::div/input"));
        field.clear();
        field.sendKeys("Авто Тест Руководович");
        field.sendKeys(Keys.ENTER);
    }

    public void setJOB_ChiefformRIO() {

        WebElement field = driver.findElement(By.xpath("//span[text()='Должность']/parent::div/following-sibling::div/input"));
        field.clear();
        field.sendKeys("Автотестер руководитель");
        field.sendKeys(Keys.ENTER);
    }

    public void setFOOTERformRIO() throws InterruptedException {
        setFIOformRIO();
        Thread.sleep(300);
        setJOBformRIO();
        Thread.sleep(300);
        setPHONEformRIO();
        Thread.sleep(300);
        driver.findElement(By.xpath("//div[text()='Руководитель']/parent::div")).click();
        Thread.sleep(300);
        setFIO_ChiefformRIO();
        Thread.sleep(300);
        setJOB_ChiefformRIO();
    }

    public static Object[] removeLastElement(List<String>[] arr) {
        return Arrays.stream(Arrays.copyOf(arr, arr.length - 1)).toArray();
    }


    public void waitForElementToBeRefreshed2()
    {
        WebDriverWait newWait = new WebDriverWait(driver,Duration.ofSeconds(10));
        newWait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(field1QuarterSubform3_1)));
    }
    public void waitTextElement2023SubForm2Field11()
    {
        WebDriverWait newWait = new WebDriverWait(driver,Duration.ofSeconds(10));
        newWait.until(driver->driver.findElement(By.xpath("//tr[@class='v-table-row'][14]/td[@class='v-table-cell-content'][3]//input"))
                .getAttribute("value")
                .length()!=0);
    }
    public void waitTextElement2024SubForm2Field11()
    {
        WebDriverWait newWait = new WebDriverWait(driver,Duration.ofSeconds(10));
        newWait.until(driver->driver.findElement(By.xpath("//tr[@class='v-table-row'][14]/td[@class='v-table-cell-content'][4]//input"))
                .getAttribute("value")
                .length()!=0);
    }
    public void waitTextElement2025SubForm2Field11()
    {
        WebDriverWait newWait = new WebDriverWait(driver,Duration.ofSeconds(10));
        newWait.until(driver->driver.findElement(By.xpath("//tr[@class='v-table-row'][14]/td[@class='v-table-cell-content'][5]//input"))
                .getAttribute("value")
                .length()!=0);
    }
    public void waitTextElementSubForm1Field2023()
    {
        WebDriverWait newWait = new WebDriverWait(driver,Duration.ofSeconds(10));
        newWait.until(driver->driver.findElement(By.xpath("//td[@class='v-table-cell-content'][5]//input"))
                .getAttribute("value")
                .length()!=0);
    }
    public void waitTextElementLastField()
    {
        WebDriverWait newWait = new WebDriverWait(driver,Duration.ofSeconds(10));
        newWait.until(driver->driver.findElement(By.xpath("//td[@class='v-table-cell-content'][last()]//input"))
                .getAttribute("value")
                .length()!=0);
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
