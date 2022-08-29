package Page;

import Tests.Form_Rio.BD_Request_Main_FormRIO;
import Tests.Form_Rio.Form_Rio_11.BD_Requests_11formRIO_OLD;
import Tests.TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static Tests.Form_Rio.BD_Request_Main_FormRIO.DU_R;

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
    public void testR() {
        BD_Request_Main_FormRIO bd_request_Main_formRIO = new BD_Request_Main_FormRIO();
        bd_request_Main_formRIO.CheckRequestGRBS();
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
    public void testAYHTcofn() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        //authEDO.authorization();
        System.out.println(authEDO.buttonEnterMainPage);
    }

    @Test
    public void testaprs() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver, wait);
        interactiveDoc.setYearFormRio();
        interactiveDoc.setStageFormRio();
        interactiveDoc.setiNNGRBS();
        interactiveDoc.setFoFormRIO();
        interactiveDoc.setKbkFormRIO();
        System.out.println(requestRIO.CheckVERfromRIO());

    }

    //Парс номера fo из url
    @Test
    public void testFO() throws InterruptedException {  //Номер формы ЭДО из домена
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver, wait);
        wait.until(ExpectedConditions.urlContains("fo"));
        String url = driver.getCurrentUrl();
        String[] urlfo = url.split("=");
        numFO = String.valueOf(urlfo[2]);
        System.out.println(numFO);


    }


    @Test
    public void testDBrequestRIO() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver, wait);
        interactiveDoc.setiNNGRBS();
        System.out.println(requestRIO.CheckKBKformRIO());


    }

    @Test
    public void testBDrequestCheck1() {
        BD_Request_Main_FormRIO bd = new BD_Request_Main_FormRIO();
        System.out.println(bd.CheckDU_RETURN());

    }

    @Test
    public void test11formBody() {
        BD_Requests_11formRIO_OLD DB = new BD_Requests_11formRIO_OLD();
        System.out.println(DB.FO_DOC_Load());


    }

    @Test
    public void testFOOTERrio() throws InterruptedException, ParseException {
        /*AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.parsData();*/
        BD_Request_Main_FormRIO bd = new BD_Request_Main_FormRIO();
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-DD HH:mm");
        formatter.format(date);


        String Kek = "2022-08-16 11:56:21.81";
        Date RT = new SimpleDateFormat("YYYY-MM-DD HH:mm").parse(Kek);
        String RRT = String.valueOf(RT);
        List<String> RTR = new ArrayList<>();
        RTR.add(String.join(" ", RRT));
        System.out.println(date);
        Assert.assertEquals(RTR.toString(), requestRIO.CheckSaveDocuments(), "rtr");


    }


    @Test
    public void testDOWN() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver, wait);
        interactiveDoc.setYearFormRio();
        interactiveDoc.setStageFormRio();
        interactiveDoc.wait_Kbk_Rio();
        interactiveDoc.buttonKbkFormRio.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='v-filterselect v-widget v-has-width v-required v-filterselect-required v-filterselect-focus']/child::input")).sendKeys(Keys.DOWN);
        driver.findElement(By.xpath("//div[@class='v-filterselect v-widget v-has-width v-required v-filterselect-required v-filterselect-focus']/child::input")).sendKeys(Keys.DOWN);
        Thread.sleep(5000);


    }

    @Test
    public void testtest() throws InterruptedException {
        AuthEDO authEDO = new AuthEDO(driver, wait);
        authEDO.authorization();
        CabinetPage cabinetPage = new CabinetPage(driver, wait);
        cabinetPage.createDocument();
        cabinetPage.setSelect();
        cabinetPage.clickCreate();
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver, wait);
        interactiveDoc.setYearFormRio();
        //  interactiveDoc.wait_waitStageRio();
        interactiveDoc.setStageFormRio();
        interactiveDoc.parsData();
        //   BD_Request_Footer_FormRio bd = new BD_Request_Footer_FormRio();
        //    System.out.println(bd.CheckListPHONE());
    }

    @Test
    public void sum() {
        System.out.println(requests_11formRIO_tableOne.CheckStringTotalSumm2025());
    }
}



