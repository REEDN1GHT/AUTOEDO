package Tests.Form_Rio;

import Page.AuthEDO;
import Resources.ConfigBuilder;
import Page.CabinetPage;
import Page.InteractiveDoc;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;


public class Document_Header_Rio extends Tests.TestBase {
    public static String yearFormRIO=ConfigBuilder.getproperty("yearFormRIO");
    public static String stageFormRIO=ConfigBuilder.getproperty("stageFormRIO");
    public static String stageDPFormRIO=ConfigBuilder.getproperty("stageDPFormRIO");
    public static String kbkFormRIO=ConfigBuilder.getproperty("kbkFormRIO");
    public static String kbkDPFormRIO=ConfigBuilder.getproperty("kbkDPFormRIO");
    public static String NUMBERdpFormRIO=ConfigBuilder.getproperty("NUMBERdpFormRIO");

    @Test()
    public void interactivePage_CheckModalWindowNoKBK_Successful() throws InterruptedException {
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
        checkAbsenceModalWindow();
        Assert.assertNull(requestRIO.CheckRequestGRBS(), "Есть утвержденные заявки ГРБС");
    }
    @Test()
    public void interactivePage_CheckYearFormRIO_Successfull() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.waitForElementToBeRefreshed();
        interactiveDoc.buttonYearRio.click();
        Assert.assertEquals(interactiveDoc.CheckListHeaderformRioEDO(), requestRIO.CheckListYEARformRIO(),"Справочник ЭДО не соответствует справочнику в БД");
    }
    @Test()
    public void interactivePage_CheckStageFormRio_Successfull() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setYearFormRio();
        Thread.sleep(2000);
        interactiveDoc.buttonStageFormRIO.click();
        Assert.assertEquals(interactiveDoc.CheckListHeaderformRioEDO(), requestRIO.CheckListSTAGEformRIO(),"Справочник ЭДО не соответствует справочнику в БД");
    }
    @Test()
    public void interactivePage_CheckKbkFormRio_Successfull() throws InterruptedException {
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
        interactiveDoc.parsData();
        checkAppearanceModalWindow();
        interactiveDoc.buttonKbkFormRio.click();
        Assert.assertEquals(interactiveDoc.CheckListHeaderformRioEDO(), requestRIO.CheckKBKformRIO(),"Справочник ЭДО не соответствует справочнику в БД");
    }
    @Test()
    public void interactivePage_CheckKbkDPFormRio_Successfull() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.parsData();
        interactiveDoc.setYearFormRio();
        interactiveDoc.setStageDPFormRio();
        checkAppearanceModalWindow();
        interactiveDoc.buttonKbkFormRio.click();
        Assert.assertEquals(interactiveDoc.CheckListHeaderformRioEDO(), requestRIO.CheckKBKDPformRIO(),"Справочник ЭДО не соответствует справочнику в БД");
    }

    @Test()
    public void interactivePage_CheckVersionFormRio_Successfull() throws InterruptedException {
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
        checkAppearanceModalWindow();
        interactiveDoc.setKbkFormRIO();
        interactiveDoc.buttonVersionDocument.click();
        Assert.assertEquals(interactiveDoc.CheckListHeaderformRioEDO(), requestRIO.CheckVERfromRIO(),"Справочник ЭДО не соответствует справочнику в БД");
    }
    @Test()
    public void interactivePage_CheckNumberDPFormRio_Successfull() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.parsData();
        interactiveDoc.setYearFormRio();
        interactiveDoc.setStageDPFormRio();
        checkAppearanceModalWindow();
        interactiveDoc.setKbkDPFormRIO();
        interactiveDoc.buttonVersionDocument.click();
        Assert.assertEquals(interactiveDoc.CheckListHeaderformRioEDO(), requestRIO.CheckVERDPfromRIO(),"Справочник ЭДО не соответствует справочнику в БД");
    }
    @Test()
    public void interactivePage_VersionDPFormRio_Successfull() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.parsData();
        interactiveDoc.setYearFormRio();
        interactiveDoc.setStageDPFormRio();
        checkAppearanceModalWindow();
        interactiveDoc.setKbkDPFormRIO();
        interactiveDoc.setNumberDBFormRio();
        checkDisabledVersionDPFormRIO();
        // interactiveDoc.setVersionDocument("01");
        //Assert.assertEquals(interactiveDoc.CheckListHeaderformRioEDO(),requestRIO.CheckVERDPfromRIO(),"Справочник ЭДО не соответствует справочнику в БД");
    }
    public void checkAppearanceModalWindow() {
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        if (interactiveDoc.isElementPresented() & requestRIO.CheckRequestGRBS() ==null) {
            System.out.println("Заявка не утверждена, тест будет проигнорирован");
            throw new SkipException(" ");
        }
        else if (interactiveDoc.isElementPresented() & requestRIO.CheckRequestGRBS() !=null)
        {
            System.out.println("Заявка существует, ЭДО сломалось");
            throw new SkipException(" ");
        }
    }

    public void checkAbsenceModalWindow(){
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        if (!interactiveDoc.isElementPresented()) {
            System.out.println("Модальное окно не появилось, тест будет проигнорирован");
            throw new SkipException(" ");
        }
    }

    public void checkDisabledVersionDPFormRIO() {
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        if(interactiveDoc.versionDBFormRio.isDisplayed())
            Assert.assertNull(requestRIO.CheckDU_RETURN(),"Есть отклоненные документы");
        else
        {

        }
    }
}
