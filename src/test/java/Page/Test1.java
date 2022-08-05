package Page;

import Tests.Form_Rio.Form_Rio_11.BD_Request_FormRIO;
import Tests.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static Tests.Form_Rio.Form_Rio_11.BD_Request_FormRIO.DU_R;

public class Test1 extends TestBase {

    public static String numFO;
    @Test
    public void testauth() throws InterruptedException {
        AuthKazna authKazna = new AuthKazna(driver, wait);
        authKazna.openulr();
        authKazna.kaznaAuthor();
        driver.navigate().to("http://172.31.1.149/#/");
        //driver.switchTo().activeElement(".modal-open");
        //authKazna.buttonClickLK.click();
    }




    @Test
    public void testR(){
        BD_Request_FormRIO bd_request_formRIO = new BD_Request_FormRIO();
        bd_request_formRIO.CheckRequestGRBS();
        System.out.println(DU_R);


    }

    @Test
    public void testAUTHadmin() throws InterruptedException {
        Auth_through_the_admin_panel auth_through_the_admin_panel = new Auth_through_the_admin_panel(driver, wait);
        auth_through_the_admin_panel.openADM();
        auth_through_the_admin_panel.ADMINauthorization();
        //Thread.sleep(500000);
    }

    @Test
    public void testAYHTcofn() throws InterruptedException{
    AuthEDO authEDO = new AuthEDO(driver, wait);
    authEDO.authorization();
    }

    @Test
    public void testaprs() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setiNNGRBS();



    }
    //Парс номера fo из url
    @Test
    public void testFO() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        wait.until(ExpectedConditions.urlContains("fo"));
        String url = driver.getCurrentUrl();
        String[] urlfo = url.split("=");
        numFO = String.valueOf(urlfo[2]);
        System.out.println(numFO);


    }
}


