package Tests.Form_Rio;

import Page.AuthEDO;
import Resources.ConfigBuilder;
import Page.CabinetPage;
import Page.InteractiveDoc;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Document_Footer_Rio extends TestBase {

    @Test()
    public void interactivePage_CheckFIOformRIO_Successful() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.parsData();
        interactiveDoc.setYearFormRio();
        interactiveDoc.setStageFormRio();
        interactiveDoc.setKbkFormRIO();
        interactiveDoc.setVersionDocument();
        interactiveDoc.buttonLoadDocumentInteractivePage();
        interactiveDoc.waitSubformRio();
        interactiveDoc.modalWindowButtonOK.click();
        Assert.assertEquals(interactiveDoc.CheckListFIOformRIO(), requestRIO.CheckListFIO(), "Справочник ЭДО не соответствует справочнику в БД");
    }

    @Test
    public void interactivePage_CheckJOBformRIO_successful() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.parsData();
        interactiveDoc.setYearFormRio();
        interactiveDoc.setStageFormRio();
        interactiveDoc.setKbkFormRIO();
        interactiveDoc.setVersionDocument();
        interactiveDoc.buttonLoadDocumentInteractivePage();
        interactiveDoc.waitSubformRio();
        interactiveDoc.modalWindowButtonOK.click();
        Assert.assertEquals(interactiveDoc.CheckListJOBformRIO(), requestRIO.ChecKListJOB(), "Справочник ЭДО не соответствует справочнику в БД");
    }

    @Test
    public void interactivePage_CheckPHONEformRIO_successful() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.parsData();
        interactiveDoc.setYearFormRio();
        interactiveDoc.setStageFormRio();
        interactiveDoc.setKbkFormRIO();
        interactiveDoc.setVersionDocument();
        interactiveDoc.buttonLoadDocumentInteractivePage();
        interactiveDoc.waitSubformRio();
        interactiveDoc.modalWindowButtonOK.click();
        Assert.assertEquals(interactiveDoc.CheckListPHONEformRIO(), requestRIO.CheckListPHONE(), "Справочник ЭДО не соответствует справочнику в БД");
    }

    @Test
    public void interactivePage_CheckFIO_CHIEFformRIO_successful() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.parsData();
        interactiveDoc.setYearFormRio();
        interactiveDoc.setStageFormRio();
        interactiveDoc.setKbkFormRIO();
        interactiveDoc.setVersionDocument();
        interactiveDoc.buttonLoadDocumentInteractivePage();
        interactiveDoc.waitSubformRio();
        interactiveDoc.modalWindowButtonOK.click();
        Assert.assertEquals(interactiveDoc.CheckListFIO_CHIEFformRIO(), requestRIO.CheckListFIO_CHIEF(), "Справочник ЭДО не соответствует справочнику в БД");
    }

    public void interactivePage_CheckJOB_CHIEFformRIO_successful() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.parsData();
        interactiveDoc.setYearFormRio();
        interactiveDoc.setStageFormRio();
        interactiveDoc.setKbkFormRIO();
        interactiveDoc.setVersionDocument();
        interactiveDoc.buttonLoadDocumentInteractivePage();
        interactiveDoc.waitSubformRio();
        interactiveDoc.modalWindowButtonOK.click();
        Assert.assertEquals(interactiveDoc.CheckListJOB_CHIEFformRIO(), requestRIO.CheckListJOB_CHIEF(), "Справочник ЭДО не соответствует справочнику в БД");
    }
}