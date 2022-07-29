package Test.Form_RIO;

import Page.CabinetPage;
import Page.InteractiveDoc;
import Page.AutoEDO;
import org.junit.jupiter.api.Test;
import Test.TestBase;

public class FormRIO extends TestBase {

    @Test
    public void interactivePage_CheckGuideKodAdmRasxod_GuideKodAdmRasxodCorrect() throws InterruptedException {
        AutoEDO autoEDO = new AutoEDO(driver, wait);
        autoEDO.open();
        autoEDO.buttonEnterMainPage.click();
        autoEDO.authorization("7830002342", "Сотрудник ГРБС");
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect("Расчёты и обоснования, форма 01");
        cabinetPage.clickCreate();
        InteractiveDoc docPage = new InteractiveDoc(driver, wait);
        docPage.setYearFormRio();
        Thread.sleep(15000);



    }
}
