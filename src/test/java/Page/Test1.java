package Page;

import Test.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

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