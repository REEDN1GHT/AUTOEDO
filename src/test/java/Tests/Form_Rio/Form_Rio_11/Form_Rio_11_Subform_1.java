package Tests.Form_Rio.Form_Rio_11;

import Page.AuthEDO;
import Page.CabinetPage;
import Page.InteractiveDoc;
import Tests.TestBase;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Duration;

public class Form_Rio_11_Subform_1 extends TestBase {
    @Test()
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
    @Test()
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
    @Test()
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
    @Test()
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
    @Test()
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
    @Test()
    public void interactivePage_fieldTempRost2_fieldAvailableManualInput() throws InterruptedException {
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
    @Test()
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
    @Test()
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
    @Test()
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
        interactiveDoc.setListSubReport1();
        interactiveDoc.waitTablePresent();
        interactiveDoc.scrollTableSubForm2();
        interactiveDoc.setField2023Number10();
        Thread.sleep(400);
        interactiveDoc.getValuefield2023Subform2();
        interactiveDoc.setListSubReport2();
        interactiveDoc.buttonAddNewString.click();
        interactiveDoc.setFieldIndictorSubForm1();
        interactiveDoc.wait_waitfield2023SubForm1();
        Assert.assertEquals(interactiveDoc.field2023NotManualInput.getAttribute("value").replace(',','.'),interactiveDoc.data2023Subform1.toString(),"Сумма в полях различается");
    }
    @Test()
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
        interactiveDoc.setListSubReport3_1();
        interactiveDoc.buttonAddNewString.click();
        interactiveDoc.setfield1QuarterSubform3_1();
        Thread.sleep(400);
        interactiveDoc.getValueFieldEpensesSubform3_1();
        interactiveDoc.setListSubReport2();
        interactiveDoc.buttonAddNewString.click();
        interactiveDoc.setFieldIndictorPaymentLandTaxSubForm1();
        interactiveDoc.wait_waitfield2023SubForm1();
        Assert.assertEquals(interactiveDoc.field2023NotManualInput.getAttribute("value").replace(',','.'),interactiveDoc.data2023Subform1.toString(),"Сумма в полях различается");
    }


}
