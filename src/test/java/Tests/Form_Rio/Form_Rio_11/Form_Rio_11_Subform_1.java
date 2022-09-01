package Tests.Form_Rio.Form_Rio_11;

import Page.AuthEDO;
import Page.CabinetPage;
import Page.InteractiveDoc;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.ParseException;

public class Form_Rio_11_Subform_1 extends TestBase {
    @Test(priority = 1)
    public void interactivePage_fieldGuideIndicatorNameSubform1_fieldGuideIndicatorNameSuccessful() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.openInteractiveFormDocument();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderFieldFormRIO();
        interactiveDoc.buttonLoadDocumentInteractivePage();
        interactiveDoc.waitSubformRio();
        interactiveDoc.modalWindowButtonOK.click();
        interactiveDoc.buttonAddNewString.click();
        interactiveDoc.numeIndicatorSubForm1.click();
        Assert.assertEquals(interactiveDoc.CheckListHeaderformRioEDO(),requests_11formRIO_tableOne.CheckHandbookNAMEPOKAZATEL(),"Справочник Эдо не соответствует справочнику в БД");
    }
    @Test(priority = 2)
    public void interactivePage_field2021Subform1_fieldAvailableManualInput() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.openInteractiveFormDocument();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderFieldFormRIO();
        interactiveDoc.buttonLoadDocumentInteractivePage();
        interactiveDoc.waitSubformRio();
        interactiveDoc.modalWindowButtonOK.click();
        interactiveDoc.buttonAddNewString.click();
        Assert.assertNull(interactiveDoc.field2021ManualInput.getAttribute("readonly"),"Поле доступно для ввода");
    }
    @Test(priority = 3)
    public void interactivePage_field2022Subform1_fieldAvailableManualInput() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.openInteractiveFormDocument();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderFieldFormRIO();
        interactiveDoc.buttonLoadDocumentInteractivePage();
        interactiveDoc.waitSubformRio();
        interactiveDoc.modalWindowButtonOK.click();
        interactiveDoc.buttonAddNewString.click();
        Assert.assertNull(interactiveDoc.field2022ManualInput.getAttribute("readonly"),"Поле доступно для ввода");
    }
    @Test(priority = 4)
    public void interactivePage_field2023Subform1_fieldNotAvailableManualInput() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.openInteractiveFormDocument();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderFieldFormRIO();
        interactiveDoc.buttonLoadDocumentInteractivePage();
        interactiveDoc.waitSubformRio();
        interactiveDoc.modalWindowButtonOK.click();
        interactiveDoc.buttonAddNewString.click();
        Assert.assertTrue(Boolean.parseBoolean(interactiveDoc.field2023NotManualInput.getAttribute("readonly")),"Поле доступно для ввода");
    }
    @Test(priority = 5)
    public void interactivePage_field2024Subform1_fieldNotAvailableManualInput() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.openInteractiveFormDocument();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderFieldFormRIO();
        interactiveDoc.buttonLoadDocumentInteractivePage();
        interactiveDoc.waitSubformRio();
        interactiveDoc.modalWindowButtonOK.click();
        interactiveDoc.buttonAddNewString.click();
        Assert.assertTrue(Boolean.parseBoolean(interactiveDoc.field2024NotManualInput.getAttribute("readonly")),"Поле доступно для ввода");
    }
    @Test(priority = 6)
    public void interactivePage_field2025Subform1_fieldNotAvailableManualInput() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.openInteractiveFormDocument();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderFieldFormRIO();
        interactiveDoc.buttonLoadDocumentInteractivePage();
        interactiveDoc.waitSubformRio();
        interactiveDoc.modalWindowButtonOK.click();
        interactiveDoc.buttonAddNewString.click();
        Assert.assertTrue(Boolean.parseBoolean(interactiveDoc.field2025NotManualInput.getAttribute("readonly")),"Поле доступно для ввода");
    }
    @Test(priority = 7)
    public void interactivePage_fieldTempRostSubform1_fieldNotAvailableManualInput() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.openInteractiveFormDocument();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderFieldFormRIO();
        interactiveDoc.buttonLoadDocumentInteractivePage();
        interactiveDoc.waitSubformRio();
        interactiveDoc.modalWindowButtonOK.click();
        interactiveDoc.buttonAddNewString.click();
        Assert.assertTrue(Boolean.parseBoolean(interactiveDoc.fieldTempRost1.getAttribute("readonly")),"Поле доступно для ввода");
    }
    @Test(priority = 8)
    public void interactivePage_fieldTempRost2_fieldNotAvailableManualInput() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.openInteractiveFormDocument();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderFieldFormRIO();
        interactiveDoc.buttonLoadDocumentInteractivePage();
        interactiveDoc.waitSubformRio();
        interactiveDoc.modalWindowButtonOK.click();
        interactiveDoc.buttonAddNewString.click();
        Assert.assertTrue(Boolean.parseBoolean(interactiveDoc.fieldTempRost2.getAttribute("readonly")),"Поле доступно для ввода");
    }
    @Test(priority = 9)
    public void interactivePage_fieldTempRost3_fieldNotAvailableManualInput() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.openInteractiveFormDocument();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderFieldFormRIO();
        interactiveDoc.buttonLoadDocumentInteractivePage();
        interactiveDoc.waitSubformRio();
        interactiveDoc.modalWindowButtonOK.click();
        interactiveDoc.buttonAddNewString.click();
        Assert.assertTrue(Boolean.parseBoolean(interactiveDoc.fieldTempRost3.getAttribute("readonly")),"Поле доступно для ввода");
    }

    @Test(priority = 26)
    public void interactivePage_Check_DOC_SAVE_Successful() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.openInteractiveFormDocument();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.buttonLoadDocumentInteractivePage();
        interactiveDoc.waitSubformRio();
        interactiveDoc.modalWindowButtonOK.click();
        interactiveDoc.setFOOTERformRIO();
        interactiveDoc.buttonSaveDocumentInteractivePage();
        interactiveDoc.waitDocSaveformRio();
        Assert.assertEquals(InteractiveDoc.actualDate.toString(), requestRIO.CheckSaveDocuments(), "Ошибка сохранения документа в АИС БП");
    }
    @Test(priority = 10)
    public void interactivePage_field2023PaymentСorporatePropertyTax_fieldDataLoadedSuccessful() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.openInteractiveFormDocument();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderFieldFormRIO();
        interactiveDoc.buttonLoadDocumentInteractivePage();
        interactiveDoc.waitSubformRio();
        interactiveDoc.modalWindowButtonOK.click();
        interactiveDoc.setListSubReport("2. Расчет объема бюджетных ассигнований на уплату налога на имущество организаций");
        interactiveDoc.waitTablePresent();
        interactiveDoc.scrollTableSubForm2();
        interactiveDoc.setField2023Number10();
        Thread.sleep(400);
        interactiveDoc.getValuefield2023Subform2();
        interactiveDoc.setListSubReport("1. Объем бюджетных ассигнований в части уплаты налога на имущество организаций и земельного налога");
        interactiveDoc.buttonAddNewString.click();
        interactiveDoc.setFieldIndictorSubForm1();
        Thread.sleep(400);
        Assert.assertEquals(interactiveDoc.field2023NotManualInput.getAttribute("value").replace(',','.'),interactiveDoc.dataField.toString(),"Сумма в полях различается");
    }
    @Test(priority = 11)
    public void interactivePage_field2023PaymentLandTax_fieldDataLoadedSuccessful() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.openInteractiveFormDocument();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderFieldFormRIO();
        interactiveDoc.buttonLoadDocumentInteractivePage();
        interactiveDoc.waitSubformRio();
        interactiveDoc.modalWindowButtonOK.click();
        interactiveDoc.setListSubReport("3.1 Расчет объема бюджетных ассигнований на уплату земельного налога на очередной финансовый год");
        interactiveDoc.buttonAddNewString.click();
        interactiveDoc.setfield1QuarterSubform3_1();
        Thread.sleep(400);
        interactiveDoc.getValueFieldEpensesSubform();
        interactiveDoc.setListSubReport("1. Объем бюджетных ассигнований в части уплаты налога на имущество организаций и земельного налога");
        interactiveDoc.buttonAddNewString.click();
        interactiveDoc.setFieldIndictorPaymentLandTaxSubForm1();
        Thread.sleep(200);
        Assert.assertEquals(interactiveDoc.field2023NotManualInput.getAttribute("value").replace(',','.'),interactiveDoc.dataField.toString(),"Сумма в полях различается");
    }
    @Test(priority = 12)
    public void interactivePage_field2024PaymentСorporatePropertyTax_fieldDataLoadedSuccessful() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.openInteractiveFormDocument();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderFieldFormRIO();
        interactiveDoc.buttonLoadDocumentInteractivePage();
        interactiveDoc.waitSubformRio();
        interactiveDoc.modalWindowButtonOK.click();
        interactiveDoc.setListSubReport("2. Расчет объема бюджетных ассигнований на уплату налога на имущество организаций");
        interactiveDoc.waitTablePresent();
        interactiveDoc.scrollTableSubForm2();
        interactiveDoc.setField2024Number8_3();
        Thread.sleep(400);
        interactiveDoc.getValuefield2024Subform2();
        interactiveDoc.setListSubReport("1. Объем бюджетных ассигнований в части уплаты налога на имущество организаций и земельного налога");
        interactiveDoc.buttonAddNewString.click();
        interactiveDoc.setFieldIndictorSubForm1();
        Thread.sleep(200);
        Assert.assertEquals(interactiveDoc.field2024NotManualInput.getAttribute("value").replace(',','.'),interactiveDoc.dataField.toString(),"Сумма в полях различается");
    }
    @Test(priority = 13)
    public void interactivePage_field2024PaymentLandTax_fieldDataLoadedSuccessful() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.openInteractiveFormDocument();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderFieldFormRIO();
        interactiveDoc.buttonLoadDocumentInteractivePage();
        interactiveDoc.waitSubformRio();
        interactiveDoc.modalWindowButtonOK.click();
        interactiveDoc.setListSubReport("3.1 Расчет объема бюджетных ассигнований на уплату земельного налога на очередной финансовый год");
        interactiveDoc.buttonAddNewString.click();
        interactiveDoc.setListSubReport("3.2 Расчет объема бюджетных ассигнований на уплату земельного налога на первый год планового периода");
        interactiveDoc.waitForElementToBeRefreshed2();
        interactiveDoc.setfield1QuarterSubform3_1();
        interactiveDoc.waitTextElementLastField();
        interactiveDoc.getValueFieldEpensesSubform();
        interactiveDoc.setListSubReport("1. Объем бюджетных ассигнований в части уплаты налога на имущество организаций и земельного налога");
        interactiveDoc.buttonAddNewString.click();
        interactiveDoc.setFieldIndictorPaymentLandTaxSubForm1();
        Thread.sleep(200);
        Assert.assertEquals(interactiveDoc.field2024NotManualInput.getAttribute("value").replace(',','.'),interactiveDoc.dataField.toString(),"Сумма в полях различается");
    }
    @Test(priority = 14)
    public void interactivePage_field2025PaymentСorporatePropertyTax_fieldDataLoadedSuccessful() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.openInteractiveFormDocument();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderFieldFormRIO();
        interactiveDoc.buttonLoadDocumentInteractivePage();
        interactiveDoc.waitSubformRio();
        interactiveDoc.modalWindowButtonOK.click();
        interactiveDoc.setListSubReport("2. Расчет объема бюджетных ассигнований на уплату налога на имущество организаций");
        interactiveDoc.waitTablePresent();
        interactiveDoc.scrollTableSubForm2();
        interactiveDoc.setField2025Number10();
        Thread.sleep(400);
        interactiveDoc.getValuefield2025Subform2();
        interactiveDoc.setListSubReport("1. Объем бюджетных ассигнований в части уплаты налога на имущество организаций и земельного налога");
        interactiveDoc.buttonAddNewString.click();
        interactiveDoc.setFieldIndictorSubForm1();
        Thread.sleep(200);
        Assert.assertEquals(interactiveDoc.field2025NotManualInput.getAttribute("value").replace(',','.'),interactiveDoc.dataField.toString(),"Сумма в полях различается");
    }
    @Test(priority = 15)
    public void interactivePage_field2025PaymentLandTax_fieldDataLoadedSuccessful() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.openInteractiveFormDocument();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderFieldFormRIO();
        interactiveDoc.buttonLoadDocumentInteractivePage();
        interactiveDoc.waitSubformRio();
        interactiveDoc.modalWindowButtonOK.click();
        interactiveDoc.setListSubReport("3.1 Расчет объема бюджетных ассигнований на уплату земельного налога на очередной финансовый год");
        interactiveDoc.buttonAddNewString.click();
        interactiveDoc.setListSubReport("3.3  Расчет объема бюджетных ассигнований на уплату земельного налога на второй год планового периода");
        interactiveDoc.waitForElementToBeRefreshed2();
        interactiveDoc.setfield1QuarterSubform3_1();
        interactiveDoc.waitTextElementLastField();
        interactiveDoc.getValueFieldEpensesSubform();
        interactiveDoc.setListSubReport("1. Объем бюджетных ассигнований в части уплаты налога на имущество организаций и земельного налога");
        interactiveDoc.buttonAddNewString.click();
        interactiveDoc.setFieldIndictorPaymentLandTaxSubForm1();
        Thread.sleep(200);
        Assert.assertEquals(interactiveDoc.field2025NotManualInput.getAttribute("value").replace(',','.'),interactiveDoc.dataField.toString(),"Сумма в полях различается");
    }
    @Test(priority = 16)
    public void interactivePage_fieldGrowthRateCalculate_fielGrowthRateSuccessful() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.openInteractiveFormDocument();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderFieldFormRIO();
        interactiveDoc.buttonLoadDocumentInteractivePage();
        interactiveDoc.waitSubformRio();
        interactiveDoc.modalWindowButtonOK.click();
        interactiveDoc.setListSubReport("2. Расчет объема бюджетных ассигнований на уплату налога на имущество организаций");
        interactiveDoc.waitTablePresent();
        interactiveDoc.scrollTableSubForm2();
        interactiveDoc.setField2023Number10();
        interactiveDoc.setListSubReport("1. Объем бюджетных ассигнований в части уплаты налога на имущество организаций и земельного налога");
        interactiveDoc.buttonAddNewString.click();
        interactiveDoc.setFieldIndictorSubForm1();
        interactiveDoc.field2022ManualInput.sendKeys("4214");
        var dataField2022 = interactiveDoc.field2022ManualInput.getAttribute("value").replace(',','.');
        var dataField2023 = interactiveDoc.field2023NotManualInput.getAttribute("value").replace(',','.');

        Assert.assertEquals(interactiveDoc.raschetZnach(dataField2023,dataField2022),interactiveDoc.dataField.toString(),"Сумма в полях различается");
    }
    @Test(priority = 17)
    public void interactivePage_fieldGrowthRate2Calculate_fielGrowthRateSuccessful() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.openInteractiveFormDocument();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderFieldFormRIO();
        interactiveDoc.buttonLoadDocumentInteractivePage();
        interactiveDoc.waitSubformRio();
        interactiveDoc.modalWindowButtonOK.click();
        interactiveDoc.setListSubReport("2. Расчет объема бюджетных ассигнований на уплату налога на имущество организаций");
        interactiveDoc.waitTablePresent();
        interactiveDoc.scrollTableSubForm2();
        interactiveDoc.setField2023Number10();
        interactiveDoc.setField2024Number8_3();
        interactiveDoc.setListSubReport("1. Объем бюджетных ассигнований в части уплаты налога на имущество организаций и земельного налога");
        interactiveDoc.buttonAddNewString.click();
        interactiveDoc.setFieldIndictorSubForm1();
        Thread.sleep(200);
        var dataField2023 = interactiveDoc.field2023NotManualInput.getAttribute("value").replace(',','.');
        var dataField2024 = interactiveDoc.field2024NotManualInput.getAttribute("value").replace(',','.');
        Assert.assertEquals(interactiveDoc.raschetZnach(dataField2023,dataField2024),interactiveDoc.dataField.toString(),"Сумма в полях различается");
    }
    @Test(priority = 18)
    public void interactivePage_fieldGrowthRate3Calculate_fielGrowthRateSuccessful() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.openInteractiveFormDocument();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderFieldFormRIO();
        interactiveDoc.buttonLoadDocumentInteractivePage();
        interactiveDoc.waitSubformRio();
        interactiveDoc.modalWindowButtonOK.click();
        interactiveDoc.setListSubReport("2. Расчет объема бюджетных ассигнований на уплату налога на имущество организаций");
        interactiveDoc.waitTablePresent();
        interactiveDoc.scrollTableSubForm2();
        interactiveDoc.setField2024Number8_3();
        interactiveDoc.setField2025Number10();
        interactiveDoc.setListSubReport("1. Объем бюджетных ассигнований в части уплаты налога на имущество организаций и земельного налога");
        interactiveDoc.buttonAddNewString.click();
        interactiveDoc.setFieldIndictorSubForm1();
        Thread.sleep(200);
        var dataField2024 = interactiveDoc.field2024NotManualInput.getAttribute("value").replace(',','.');
        var dataField2025 = interactiveDoc.field2025NotManualInput.getAttribute("value").replace(',','.');
        Assert.assertEquals(interactiveDoc.raschetZnach(dataField2024,dataField2025),interactiveDoc.dataField.toString(),"Сумма в полях различается");
    }

   /* @Test()
    public void interactivePage_checkSumStringTotal2021_SumStringTotal2021Successful() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.openInteractiveFormDocument();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderFieldFormRIO();
        interactiveDoc.buttonLoadDocumentInteractivePage();
        interactiveDoc.waitSubformRio();
        interactiveDoc.modalWindowButtonOK.click();
        var edoSumTotal = interactiveDoc.stringTotal2021.getText().replace(',','.');
        var bdSumTotal = requests_11formRIO_tableOne.CheckStringTotalSumm2022();
        Assert.assertEquals(edoSumTotal.replaceAll("\\s+",""),interactiveDoc.okryglenie(bdSumTotal),"Сумма не сходится");
    }*/
    @Test(priority = 19)
    public void interactivePage_checkSumStringTotal2022_SumStringTotal2022Successful() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.openInteractiveFormDocument();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.separateKBK();
        interactiveDoc.buttonLoadDocumentInteractivePage();
        interactiveDoc.waitSubformRio();
        interactiveDoc.modalWindowButtonOK.click();

        var edoSumTotal = interactiveDoc.stringTotal2022.getText().replace(',','.');
        var bdSumTotal = requests_11formRIO_tableOne.CheckStringTotalSumm2022();
        Assert.assertEquals(edoSumTotal.replaceAll("\\s+",""),interactiveDoc.okryglenie(bdSumTotal),"Сумма не сходится");
    }
    @Test(priority = 20)
    public void interactivePage_checkSumStringTotal2023_SumStringTotal2023Successful() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.openInteractiveFormDocument();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.separateKBK();
        interactiveDoc.buttonLoadDocumentInteractivePage();
        interactiveDoc.waitSubformRio();
        interactiveDoc.modalWindowButtonOK.click();
        var edoSumTotal = interactiveDoc.stringTotal2023.getText().replace(',','.');
        var bdSumTotal = requests_11formRIO_tableOne.CheckStringTotalSumm2023();
        Assert.assertEquals(edoSumTotal.replaceAll("\\s+",""),interactiveDoc.okryglenie(bdSumTotal),"Сумма не сходится");
    }
    @Test(priority = 21)
    public void interactivePage_checkSumStringTotal2024_SumStringTotal2024Successful() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.openInteractiveFormDocument();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.separateKBK();
        interactiveDoc.buttonLoadDocumentInteractivePage();
        interactiveDoc.waitSubformRio();
        interactiveDoc.modalWindowButtonOK.click();
        var edoSumTotal = interactiveDoc.stringTotal2024.getText().replace(',','.');
        var bdSumTotal = requests_11formRIO_tableOne.CheckStringTotalSumm2024();
        Assert.assertEquals(edoSumTotal.replaceAll("\\s+",""),interactiveDoc.okryglenie(bdSumTotal),"Сумма не сходится");
    }
    @Test(priority = 22)
    public void interactivePage_checkSumStringTotal2025_SumStringTotal2025Successful() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.openInteractiveFormDocument();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.separateKBK();
        interactiveDoc.buttonLoadDocumentInteractivePage();
        interactiveDoc.waitSubformRio();
        interactiveDoc.modalWindowButtonOK.click();
        var edoSumTotal = interactiveDoc.stringTotal2025.getText().replace(',','.');
        var bdSumTotal = requests_11formRIO_tableOne.CheckStringTotalSumm2025();
        Assert.assertEquals(edoSumTotal.replaceAll("\\s+",""),interactiveDoc.okryglenie(bdSumTotal),"Сумма не сходится");
    }
    @Test(priority = 23)
    public void interactivePage_checkTotalGrowthRate1_SumStringTotalGrowthRate1Successful() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.openInteractiveFormDocument();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderFieldFormRIO();
        interactiveDoc.buttonLoadDocumentInteractivePage();
        interactiveDoc.waitSubformRio();
        interactiveDoc.modalWindowButtonOK.click();
        var edoSumTotal = interactiveDoc.stringTotal2023.getAttribute("innerText").replace(',','.').replaceAll("\\s+","");
        var edoSumTotal2 = interactiveDoc.stringTotal2022.getAttribute("innerText").replace(',','.').replaceAll("\\s+","");
        var bdSumTotal = interactiveDoc.stringTotalGrowthRate1.getAttribute("innerText").replace(',','.').replaceAll("\\s+","");

       Assert.assertEquals(interactiveDoc.raschetZnach(edoSumTotal,edoSumTotal2),bdSumTotal,"Сумма не сходится");
    }
    @Test(priority = 24)
    public void interactivePage_checkTotalGrowthRate2_SumStringTotalGrowthRate1Successful() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.openInteractiveFormDocument();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderFieldFormRIO();
        interactiveDoc.buttonLoadDocumentInteractivePage();
        interactiveDoc.waitSubformRio();
        interactiveDoc.modalWindowButtonOK.click();
        var edoSumTotal = interactiveDoc.stringTotal2024.getAttribute("innerText").replace(',','.').replaceAll("\\s+","");
        var edoSumTotal2 = interactiveDoc.stringTotal2023.getAttribute("innerText").replace(',','.').replaceAll("\\s+","");
        var bdSumTotal = interactiveDoc.stringTotalGrowthRate2.getAttribute("innerText").replace(',','.').replaceAll("\\s+","");
        Assert.assertEquals(interactiveDoc.raschetZnach(edoSumTotal,edoSumTotal2),bdSumTotal,"Сумма не сходится");
    }
    @Test(priority = 25)
    public void interactivePage_checkTotalGrowthRate3_SumStringTotalGrowthRate1Successful() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.openInteractiveFormDocument();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderFieldFormRIO();
        interactiveDoc.buttonLoadDocumentInteractivePage();
        interactiveDoc.waitSubformRio();
        interactiveDoc.modalWindowButtonOK.click();
        var edoSumTotal = interactiveDoc.stringTotal2025.getAttribute("innerText").replace(',','.').replaceAll("\\s+","");
        var edoSumTotal2 = interactiveDoc.stringTotal2024.getAttribute("innerText").replace(',','.').replaceAll("\\s+","");
        var bdSumTotal = interactiveDoc.stringTotalGrowthRate3.getAttribute("innerText").replace(',','.').replaceAll("\\s+","");
        Assert.assertEquals(interactiveDoc.raschetZnach(edoSumTotal,edoSumTotal2),bdSumTotal,"Сумма не сходится");
    }
}
