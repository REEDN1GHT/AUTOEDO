package Tests.Form_Rio;

import Page.AuthEDO;
import Resources.ConfigBuilder;
import Page.CabinetPage;
import Page.InteractiveDoc;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledIf;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Document_Header_Rio extends Tests.TestBase {

    public static String yearFormRIO=ConfigBuilder.getproperty("yearFormRIO");
    public static String stageFormRIO=ConfigBuilder.getproperty("stageFormRIO");


    @Test
    @Order(1)

    public void interactivePage_CheckModalWindowNoKBK_Successful() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setYearFormRio();
        interactiveDoc.setStageFormRIO();
        interactiveDoc.modalWindow.click();
        Assertions.assertNull(requestRIO.CheckRequestGRBS(), "Есть утвержденные заявки ГРБС");

    }




    @Test
    @Order(2)

    public void interactivePage_CheckYearFormRIO_Successfull() throws InterruptedException {
   //     assumeFalse(interactivePage_CheckModalWindowNoKBK_Successful());
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setYearFormRio();


    }
    @Test
    @Order(3)
    public void interactivePage_CheckStageFormRio_Successfull() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setYearFormRio();
        interactiveDoc.setStageFormRIO();


    }

    @Test
    @Order(4)
    public void interactivePage_CheckKbkFormRio_Successfull() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setYearFormRio();
        interactiveDoc.setStageFormRIO();
        interactiveDoc.setKbkFormRIO();


    }

    @Test
    @Order(5)
    public void interactivePage_CheckVersionFormRio_Successfull() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setYearFormRio();
        interactiveDoc.setStageFormRIO();
        interactiveDoc.setKbkFormRIO();
        interactiveDoc.setVersionDocument("01");
    }


}
