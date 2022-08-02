package Page;

import Tests.TestBase;
import org.junit.jupiter.api.Test;

public class Test1 extends TestBase {

    @Test
   public void testauth() throws InterruptedException {
       AuthKazna authKazna = new AuthKazna(driver,wait);
       authKazna.openulr();
       authKazna.kaznaAuthor("7810577007","7810577007", "0806003");
       driver.navigate().to("http://172.31.1.149/#/");
       //driver.switchTo().activeElement(".modal-open");
        //authKazna.buttonClickLK.click();
    }

    @Test
    public void testBD(){
        requestRIO.CheckKBKMessages();
        //System.out.println(requestRIO.CheckRequestGRBS());
    }


}