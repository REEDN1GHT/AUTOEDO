package Page;

import Test.TestBase;
import org.junit.jupiter.api.Test;

public class Test1 extends TestBase {





    @Test
    public void testauth() throws InterruptedException {
        AuthKazna authKazna = new AuthKazna(driver, wait);
        authKazna.openulr();
        authKazna.authorKazna("ZSD", "ZSD");
        authKazna.buttonSignIn.click();
        if (authKazna.existsSomeLS()==false) {
            authKazna.LSKIO.click();
        }
        /*Assertions.assertTrue(authKazna.existsSomeLS());*/
        driver.navigate().to("http://172.31.1.149/#/");


    }
}
