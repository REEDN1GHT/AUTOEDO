package Page;

import Tests.Form_Rio.BD_Request_Footer_FormRio;
import Tests.Form_Rio.BD_Request_Header_FormRIO;
import Tests.Form_Rio.Form_Rio_11.BD_Requests_11formRIO;
import Tests.TestBase;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static Tests.Form_Rio.BD_Request_Header_FormRIO.DU_R;

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
        BD_Request_Header_FormRIO bd_request_Header_formRIO = new BD_Request_Header_FormRIO();
        bd_request_Header_formRIO.CheckRequestGRBS();
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
        interactiveDoc.setYearFormRio();
        interactiveDoc.setStageFormRio();
        interactiveDoc.setiNNGRBS();
        interactiveDoc.setFoFormRIO();
        interactiveDoc.setKbkFormRIO();
System.out.println(request_header_RIO.CheckVERfromRIO());

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
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
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
        InteractiveDoc interactiveDoc = new InteractiveDoc(driver,wait);
        interactiveDoc.setiNNGRBS();
        System.out.println(request_header_RIO.CheckKBKformRIO());


    }

    @Test
    public void testBDrequestCheck1() {
        BD_Request_Header_FormRIO bd = new BD_Request_Header_FormRIO();
        System.out.println(bd.CheckDU_RETURN());

    }

    @Test
    public void test11formBody() {
        BD_Requests_11formRIO DB = new BD_Requests_11formRIO();
        System.out.println(DB.FO_DOC_Load());


    }

    @Test
    public void testFOOTERrio() {
        BD_Request_Footer_FormRio BD = new BD_Request_Footer_FormRio();
        System.out.println(BD.CheckListFIO());
        System.out.println(BD.ChecKListJOB());
        System.out.println(BD.CheckListPHONE());
        System.out.println(BD.CheckFIO_CHIEF());
        System.out.println(BD.CheckListJOB_CHIEF());
    }

}


