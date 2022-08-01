package Page;

import Test.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test1 extends TestBase {

    @Test
   public void testauth() throws InterruptedException {
       AuthKazna authKazna = new AuthKazna(driver,wait);
       authKazna.openulr();
       authKazna.kaznaAuthor("7810577007","7810577007");
       Thread.sleep(5000);
        driver.navigate().to("http://172.31.1.149/#/");
   }
}
