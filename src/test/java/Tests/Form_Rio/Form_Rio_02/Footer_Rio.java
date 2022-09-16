package Tests.Form_Rio.Form_Rio_02;

import Page.AuthEDO;
import Page.CabinetPage;
import Page.InteractiveDoc;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Footer_Rio extends TestBase {
    @Test()
    public void interactivePage_CheckFIOformRIO_Successful() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        var str = interactiveDoc.CheckListHeaderYearformRioEDO2(interactiveDoc.fioIspolnitel);
        Assert.assertEquals(str, requestRIO.CheckListFIO().replaceAll("\\s(\\p{Punct})","$1"), "Справочник ЭДО не соответствует справочнику в БД");

    }
    @Test()
    public void interactivePage_CheckJOBformRIO_successful() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        var str = interactiveDoc.CheckListHeaderYearformRioEDO2(interactiveDoc.jobIspolnitel);
        Assert.assertEquals(str, requestRIO.ChecKListJOB().replaceAll("\\s(\\p{Punct})","$1"), "Справочник ЭДО не соответствует справочнику в БД");

    }
    @Test()
    public void interactivePage_CheckPHONEformRIO_successful() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        var str = interactiveDoc.CheckListHeaderYearformRioEDO2(interactiveDoc.PhoneIspolnitel);
        Assert.assertEquals(str, requestRIO.CheckListPHONE().replaceAll("\\s(\\p{Punct})","$1"), "Справочник ЭДО не соответствует справочнику в БД");

    }
    @Test()
    public void interactivePage_CheckFIO_CHIEFformRIO_successful() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.switchPlacementtoChiefformRIONewRealiz.click();
        var str = interactiveDoc.CheckListHeaderYearformRioEDO2(interactiveDoc.fioChief);
        Assert.assertEquals(str, requestRIO.CheckListFIO_CHIEF().replaceAll("\\s(\\p{Punct})","$1"), "Справочник ЭДО не соответствует справочнику в БД");

    }
    @Test()
    public void interactivePage_CheckJOB_CHIEFformRIO_successful() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorizationWithCabinetPage();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setHeaderNewRealizationFieldFormRIO();
        interactiveDoc.parsData();
        interactiveDoc.waitNewRealizSubformRio();
        zagruzkaDocumenta();
        interactiveDoc.switchPlacementtoChiefformRIONewRealiz.click();
        var str = interactiveDoc.CheckListHeaderYearformRioEDO2(interactiveDoc.jobChief);
        Assert.assertEquals(str, requestRIO.CheckListJOB_CHIEF().replaceAll("\\s(\\p{Punct})","$1"), "Справочник ЭДО не соответствует справочнику в БД");

    }


    public void zagruzkaDocumenta(){
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        String str = interactiveDoc.sozdanieNovDoc.getText();
        if (str.equals("Создание нового документа")){
            interactiveDoc.modalWindowButtonOK.click();
        }
    }

}
