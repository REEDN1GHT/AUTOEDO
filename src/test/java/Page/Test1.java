package Page;

import Tests.Form_Rio.Form_Rio_11.BD_Request_FormRIO;
import Tests.TestBase;
import org.junit.jupiter.api.Test;

import static Tests.Form_Rio.Form_Rio_11.BD_Request_FormRIO.DU_R;

public class Test1 extends TestBase {

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
}


