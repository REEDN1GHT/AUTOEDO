package Tests.Form_Rio.Form_Rio_11;

import Page.AuthEDO;
import Page.CabinetPage;
import Page.InteractiveDoc;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Form_Rio_11_Subform_1 extends TestBase {
    @Test()
    public void interactivePage_field2021Subform1_fieldAvailableManualInput() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setYearFormRio();
        interactiveDoc.setStageFormRio();
        interactiveDoc.setKbkFormRIO();
        interactiveDoc.setVersionDocument();
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
        cabinetPage.createDocument();
        cabinetPage.setSelect();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setYearFormRio();
        interactiveDoc.setStageFormRio();
        interactiveDoc.setKbkFormRIO();
        interactiveDoc.setVersionDocument();
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
        cabinetPage.createDocument();
        cabinetPage.setSelect();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setYearFormRio();
        interactiveDoc.setStageFormRio();
        interactiveDoc.setKbkFormRIO();
        interactiveDoc.setVersionDocument();
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
        cabinetPage.createDocument();
        cabinetPage.setSelect();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setYearFormRio();
        interactiveDoc.setStageFormRio();
        interactiveDoc.setKbkFormRIO();
        interactiveDoc.setVersionDocument();
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
        cabinetPage.createDocument();
        cabinetPage.setSelect();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setYearFormRio();
        interactiveDoc.setStageFormRio();
        interactiveDoc.setKbkFormRIO();
        interactiveDoc.setVersionDocument();
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
        cabinetPage.createDocument();
        cabinetPage.setSelect();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setYearFormRio();
        interactiveDoc.setStageFormRio();
        interactiveDoc.setKbkFormRIO();
        interactiveDoc.setVersionDocument();
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
        cabinetPage.createDocument();
        cabinetPage.setSelect();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setYearFormRio();
        interactiveDoc.setStageFormRio();
        interactiveDoc.setKbkFormRIO();
        interactiveDoc.setVersionDocument();
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
        cabinetPage.createDocument();
        cabinetPage.setSelect();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setYearFormRio();
        interactiveDoc.setStageFormRio();
        interactiveDoc.setKbkFormRIO();
        interactiveDoc.setVersionDocument();
        interactiveDoc.buttonLoadDocumentInteractivePage();
        interactiveDoc.waitSubformRio();
        interactiveDoc.modalWindowButtonOK.click();
        interactiveDoc.buttonAddNewString.click();
        Assert.assertTrue(Boolean.parseBoolean(interactiveDoc.fieldTempRost3.getAttribute("readonly")),"Поле доступно для ввода");
    }
    @Test()
    public void interactivePage_field2023PaymentСorporatePropertyTax_fieldDataLoadedSuccessful() throws InterruptedException {
        var summ = 1503;
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setYearFormRio();
        interactiveDoc.setStageFormRio();
        interactiveDoc.setKbkFormRIO();
        interactiveDoc.setVersionDocument();
        interactiveDoc.buttonLoadDocumentInteractivePage();
        interactiveDoc.waitSubformRio();
        interactiveDoc.modalWindowButtonOK.click();
        interactiveDoc.setListSubReport();

        //interactiveDoc.buttonAddNewString.click();
        Assert.assertTrue(Boolean.parseBoolean(interactiveDoc.fieldTempRost3.getAttribute("readonly")),"Поле доступно для ввода");
    }
}
