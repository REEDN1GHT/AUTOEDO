package Test;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.time.Duration;

public class TestBase {
    protected WebDriver driver;
    protected WebDriverWait wait;
    BD con = new BD();
    @BeforeEach
    public void setUp() throws SQLException, ClassNotFoundException {
        System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        con.getConnection();
        //System.out.print(con.checkIsDocExist());

    }

    @AfterEach
    public void tearDown() throws IOException, SQLException {
        var sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sourceFile,new File("C:\\creen\\screenshot.png"));

        con.closeConnect();
        driver.quit();

    }
}
