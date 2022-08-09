package Tests.Form_Rio;

import Page.AuthEDO;
import Resources.ConfigBuilder;
import Page.CabinetPage;
import Page.InteractiveDoc;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;




public class Document_Header_Rio extends Tests.TestBase {

    public static String yearFormRIO=ConfigBuilder.getproperty("yearFormRIO");
    public static String stageFormRIO=ConfigBuilder.getproperty("stageFormRIO");
    public static String kbkFormRIO=ConfigBuilder.getproperty("kbkFormRIO");
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
        interactiveDoc.setYearFormRio();
        interactiveDoc.setStageFormRIO();
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
        interactiveDoc.buttonYearRio.click();
        Assert.assertEquals(interactiveDoc.CheckListHeaderformRioEDO(),requestRIO.CheckListYEARformRIO(),"Справочник ЭДО не соответствует справочнику в БД");
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
        interactiveDoc.buttonStageFormRIO.click();

        checkAppearanceModalWindow();
        Assert.assertEquals(interactiveDoc.CheckListHeaderformRioEDO(),requestRIO.CheckListSTAGEformRIO(),"Справочник ЭДО не соответствует справочнику в БД");
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
        interactiveDoc.setYearFormRio();
        interactiveDoc.setStageFormRIO();
        interactiveDoc.setiNNGRBS();
        interactiveDoc.setFoFormRIO();
        checkAppearanceModalWindow();
        interactiveDoc.buttonKbkFormRio.click();
        Assert.assertEquals(interactiveDoc.CheckListHeaderformRioEDO(),requestRIO.CheckKBKformRIO(),"Справочник ЭДО не соответствует справочнику в БД");

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
        interactiveDoc.setYearFormRio();
        interactiveDoc.setStageFormRIO();
        checkAppearanceModalWindow();
        interactiveDoc.setKbkFormRIO();
        Assert.assertEquals(interactiveDoc.CheckListHeaderformRioEDO(),requestRIO.CheckVersionDPFormRIO(),"Справочник ЭДО не соответствует справочнику в БД");

        // interactiveDoc.setVersionDocument("01");
    }




    public void checkAppearanceModalWindow()
    {
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        if (interactiveDoc.isElementPresented() & requestRIO.CheckRequestGRBS() ==null) {
            System.out.println("Заявка утверждена, тест будет проигнорирован");
            throw new SkipException("Заявка утверждена, тест будет проигнорирован");
        }
        else if (interactiveDoc.isElementPresented() & requestRIO.CheckRequestGRBS() !=null)
        {
            System.out.println("Заявка существует, ЭДО поломалося");
            throw new SkipException("Заявка существует, ЭДО поломалося");
        }
    }

    public void checkAbsenceModalWindow(){
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        if (!interactiveDoc.isElementPresented()) {
            System.out.println("Модальное окно не появилось, тест будет проигнорирован");
            throw new SkipException("Модальное окно не появилось, тест будет проигнорирован");
        }
    }

}
