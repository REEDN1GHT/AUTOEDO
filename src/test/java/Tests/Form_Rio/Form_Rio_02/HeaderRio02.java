package Tests.Form_Rio.Form_Rio_02;

import Page.AuthEDO;
import Page.CabinetPage;
import Page.InteractiveDoc;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class HeaderRio02 extends TestBase {
    public static String vrFormRio = "121";
   // @Test(invocationCount = 10)
    @Test()
    public void interactivePage_CheckYearFormRIO_Successfull() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect2();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        var str = interactiveDoc.CheckListHeaderYearformRioEDO2(interactiveDoc.yearElement);
        Assert.assertEquals(str,requestRIO.CheckListYEARformRIO(),"Справочник ЭДО не соответствует справочнику в БД");

    }
    @Test
    public void interactivePage_CheckStageFormRio_Successfull() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect2();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setYearNewRealiz02();
        var str = interactiveDoc.CheckListHeaderYearformRioEDO2(interactiveDoc.stageElement);
        Assert.assertEquals(str,requestRIO.CheckListSTAGEformRIO(),"Справочник ЭДО не соответствует справочнику в БД");

    }
    @Test
    public void interactivePage_CheckKbkFormRio_Successfull() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect2();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.parsData();
        interactiveDoc.setYearNewRealiz02();
        interactiveDoc.setStageNewRealiz02();
        checkAppearanceModalWindow();
        var str = interactiveDoc.CheckListHeaderYearformRioEDO2(interactiveDoc.kbkElement);
        Assert.assertEquals(str,requestRIO.CheckKBKformRIO(),"Справочник ЭДО не соответствует справочнику в БД");

    }

    @Test()
    public void interactivePage_CheckKbkDPFormRio_Successfull() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect2();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.parsData();
        interactiveDoc.setYearNewRealiz02();
        interactiveDoc.setStageDPNewRealiz02();
        checkAppearanceModalWindow();
        var str = interactiveDoc.CheckListHeaderYearformRioEDO2(interactiveDoc.kbkElement);
        Assert.assertEquals(str,requestRIO.CheckKBKDPformRIO(),"Справочник ЭДО не соответствует справочнику в БД");
    }
    @Test()
    public void interactivePage_CheckVersionFormRio_Successfull() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect2();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.parsData();
        interactiveDoc.setYearNewRealiz02();
        interactiveDoc.setStageNewRealiz02();
        checkAppearanceModalWindow();
        interactiveDoc.setKbkNewRealiz02();
        var str = interactiveDoc.CheckListHeaderYearformRioEDO2(interactiveDoc.versionElement);
        Assert.assertEquals(str,requestRIO.CheckVERfromRIO(),"Справочник ЭДО не соответствует справочнику в БД");
    }
    @Test()
    public void interactivePage_CheckNumberDPFormRio_Successfull() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect2();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.parsData();
        interactiveDoc.setYearNewRealiz02();
        interactiveDoc.setStageDPNewRealiz02();
        checkAppearanceModalWindow();
        interactiveDoc.setKbkDPNewRealiz02();
        var str = interactiveDoc.CheckListHeaderYearformRioEDO2(interactiveDoc.versionElement);
        Assert.assertEquals(str,requestRIO.CheckVERDPfromRIO(),"Справочник ЭДО не соответствует справочнику в БД");
    }
    @Test()
    public void interactivePage_VersionDPFormRio_Successfull() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect2();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setYearNewRealiz02();
        interactiveDoc.parsData();
        interactiveDoc.setStageDPNewRealiz02();
        interactiveDoc.setKbkDPNewRealiz02();
        interactiveDoc.setNumberDPDocumentNewRealiz02();
        checkDisabledVersionDPFormRIO();

    }

  @Test()
  public void interactivePage_CheckModalWindowNoKBK_Successful() throws InterruptedException {
      AuthEDO authEDO = new AuthEDO(driver, wait);
      authEDO.authorization();
      CabinetPage cabinetPage = new CabinetPage(driver, wait);
      cabinetPage.createDocument();
      cabinetPage.setSelect2();
      cabinetPage.clickCreate();
      InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
      interactiveDoc.parsData();
      interactiveDoc.setYearNewRealiz02();
      interactiveDoc.setStageNewRealiz02();
      checkAbsenceModalWindow();
      Assert.assertNull(requests_02formRIO.CheckRequestGRBS(), "Есть утвержденные заявки ГРБС");

  }

    public void checkDisabledVersionDPFormRIO() {
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        if(interactiveDoc.isElementPresentedNewRealization()) {
            Assert.assertNull(requestRIO.CheckDU_RETURN(), "Есть отклоненные документы");
        }
        else {
            interactiveDoc.versionDpRIO.click();
            Assert.assertEquals(interactiveDoc.CheckListHeaderformRioEDO(),requestRIO.CheckVersionDPFormRIO(),"Версии в ЭДО и БД различаются");
        }
    }

    public void checkAppearanceModalWindow() {
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        if (interactiveDoc.isElementPresentedNewRealization() & requestRIO.CheckRequestGRBS() ==null) {
            System.out.println("Заявка не утверждена, тест будет проигнорирован");
            throw new SkipException(" ");
        }
        else if (interactiveDoc.isElementPresentedNewRealization() & requestRIO.CheckRequestGRBS() !=null) {
            System.out.println("Заявка существует, ЭДО сломалось");
            throw new SkipException(" ");
        }
    }
    public void checkAbsenceModalWindow(){
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        if (!interactiveDoc.isElementPresentedNewRealization()) {
            System.out.println("Модальное окно не появилось, тест будет проигнорирован");
            throw new SkipException(" ");
        }
    }
}
