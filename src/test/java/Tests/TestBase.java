package Tests;

import Tests.Form_Rio.BD_Request_Main_FormRIO;
import Tests.Form_Rio.Form_Rio_11.BD_Requests_11formRIO_TableOne;
import Tests.Report_form_documents.BD_Request_Monthly_Report_0503117;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.time.Duration;


    public class TestBase {
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    public static BD con = new BD();
    public BD_Request_Monthly_Report_0503117 request = new BD_Request_Monthly_Report_0503117();
    public BD_Request_Main_FormRIO requestRIO = new BD_Request_Main_FormRIO();
    public BD_Requests_11formRIO_TableOne requests_11formRIO_tableOne = new BD_Requests_11formRIO_TableOne();
    @BeforeClass
    public void setUp() throws SQLException, ClassNotFoundException {
        con.getConnectionBudget22();
        con.getConnectionBudget21();

        System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");

        driver = new ChromeDriver();

        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }


    @AfterClass
    public void tearDown() throws IOException, SQLException {
        var sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sourceFile,new File("C:\\creen\\screenshot.png"));

        con.closeConnectBudget22();
        con.closeConnectBudget21();
        driver.quit();

    }
}
