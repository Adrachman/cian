import job.task.BaseDriver;
import job.task.home.ApartmentsPage;
import job.task.home.BasePage;
import job.task.home.Cian;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;

import java.util.concurrent.TimeUnit;

//import static job.task.Configuration.OPENED_BROWSER;

public class BaseTest {
    protected WebDriver driver = BaseDriver.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected Cian cian = new Cian(driver);
    protected static final Logger LOGGER = LogManager.getLogger();
    protected ApartmentsPage apartmentsPage = new ApartmentsPage(driver);
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        LOGGER.warn("Выбирается саммая дешевая квартира");
        driver.getWindowHandle();

    }
//    @AfterSuite(alwaysRun = true)
//    public void close(){
//        driver.quit();
//    }
}
