package Test;

import Test.Form_RIO.BD_Request_FormRIO;
import Test.Report_form_documents.BD_Request_Monthly_Report_0503117;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
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
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    public static BD con = new BD();
    public BD_Request_Monthly_Report_0503117 request = new BD_Request_Monthly_Report_0503117();
    public BD_Request_FormRIO requestRIO = new BD_Request_FormRIO();

    @BeforeAll
    public static void setUp() throws SQLException, ClassNotFoundException {
        con.getConnection();
        System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");

        driver = new ChromeDriver();

        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }


    @AfterAll
    public static void tearDown() throws IOException, SQLException {
        var sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sourceFile,new File("C:\\creen\\screenshot.png"));
        //BD con = new BD();
        con.closeConnect();
        driver.quit();

    }
}
