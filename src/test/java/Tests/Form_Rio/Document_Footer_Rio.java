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
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver, wait);
        interactiveDoc.setYearFormRio();
        interactiveDoc.setStageFormRio();
        interactiveDoc.parsData();
        Document_Header_Rio ModalKBK = new Document_Header_Rio();
        ModalKBK.checkAppearanceModalWindow();
        interactiveDoc.buttonLoadDocumentInteractivePage();
        Assert.assertEquals(request_footer_RIO.CheckListFIO(), "Справочник ЭДО не соответствует справочнику в БДС");


    }


}
