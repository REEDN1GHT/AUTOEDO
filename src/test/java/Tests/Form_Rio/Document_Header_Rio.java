package Tests.Form_Rio;

import Page.AutoEDO;
import Page.CabinetPage;
import Page.InteractiveDoc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.NoSuchElementException;

import java.time.Duration;


public class Document_Header_Rio extends Tests.TestBase {
    public static String yearFormRIO="2023";
    public static String stageFormRIO="01";


    @Test
    public void interactivePage_CheckModalWindowNoKBK_Successful() throws InterruptedException {
        AutoEDO autoEDO = new AutoEDO(driver, wait);
        autoEDO.open();
        autoEDO.buttonEnterMainPage.click();
        autoEDO.authorization("DavydovaGP", "Сотрудник ГРБС");
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect("Расчёты и обоснования, форма 11");
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setYearFormRio(yearFormRIO);
        interactiveDoc.setStageFormRIO(stageFormRIO);
        interactiveDoc.modalWindow.click();

    }


    @Test
    public void interactivePage_CheckYearFormRIO_Successfull() throws InterruptedException {
        AutoEDO autoEDO = new AutoEDO(driver, wait);
        autoEDO.open();
        autoEDO.buttonEnterMainPage.click();
         autoEDO.authorization("MO_005", "Сотрудник ГРБС");
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect("Расчёты и обоснования, форма 11");
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setYearFormRio(yearFormRIO);


    }
    @Test
    public void interactivePage_CheckStageFormRio_Successfull() throws InterruptedException {
        AutoEDO autoEDO = new AutoEDO(driver, wait);
        autoEDO.open();
        autoEDO.buttonEnterMainPage.click();
        autoEDO.authorization("MO_005", "Сотрудник ГРБС");
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect("Расчёты и обоснования, форма 11");
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setYearFormRio(yearFormRIO);
        interactiveDoc.setStageFormRIO(stageFormRIO);


    }

    @Test
    public void interactivePage_CheckKbkFormRio_Successfull() throws InterruptedException {
        AutoEDO autoEDO = new AutoEDO(driver, wait);
        autoEDO.open();
        autoEDO.buttonEnterMainPage.click();
        autoEDO.authorization("MO_005", "Сотрудник ГРБС");
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect("Расчёты и обоснования, форма 11");
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setYearFormRio(yearFormRIO);
        interactiveDoc.setStageFormRIO(stageFormRIO);
        interactiveDoc.setKbkFormRIO("0505 0920083140 851");


    }

    @Test
    public void interactivePage_CheckVersionFormRio_Successfull() throws InterruptedException {
        AutoEDO autoEDO = new AutoEDO(driver, wait);
        autoEDO.open();
        autoEDO.buttonEnterMainPage.click();
        autoEDO.authorization("DavydovaGP", "Сотрудник ГРБС");
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect("Расчёты и обоснования, форма 11");
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setYearFormRio(yearFormRIO);
        interactiveDoc.setStageFormRIO(stageFormRIO);
        interactiveDoc.setKbkFormRIO("0505 0920083140 851");
        interactiveDoc.setVersionDocument("01");
    }


}
