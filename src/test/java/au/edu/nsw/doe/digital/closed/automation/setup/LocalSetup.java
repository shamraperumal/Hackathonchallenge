package au.edu.nsw.doe.digital.closed.automation.setup;

import com.applitools.eyes.Eyes;
import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.ProxySettings;
import com.applitools.eyes.RectangleSize;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by christopherpigden on 22/03/2016.
 */

public abstract class LocalSetup {

    protected WebDriver driver;
    public String baseUrl;
    public String proxy = System.getenv("PROXYURL");
    public String environment = System.getenv("ENVIRONMENT");
    protected Eyes eyes;
    protected String testName;
    protected String matchLevel = System.getenv("MATCH_LEVEL");

    @Rule
    public TestRule watcher = new TestWatcher() {
        protected void starting(Description description) {
            testName = description.getMethodName() + " on " + environment;
        }
    };

    protected RectangleSize rectangle() {
        String rectangleHeight = System.getenv("RECTANGLE_HEIGHT");
        String rectangleWidth = System.getenv("RECTANGLE_WIDTH");
        return new RectangleSize(Integer.parseInt(rectangleWidth), Integer.parseInt(rectangleHeight));
    }

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver","C:/Users/SNAGAREDDI/Downloads/chromedriver_win32/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("test-type");
        options.addArguments("--start-maximized");
        options.addArguments("--disable-extensions");
        options.addArguments("disable-infobars");
        driver = new ChromeDriver(options);

        baseUrl = System.getenv("BASEURL");
        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
      Eyes eyes = new Eyes();
        eyes.setApiKey("rIAas8LXlLDwbaIsnz9gfvuJlRqblSfTyNxsLDATS6Y110");
        if (proxy != null) {
            eyes.setProxy(new ProxySettings(proxy));
        }
        driver = eyes.open(driver, "DoE", testName + rectangle());
        MatchLevel.valueOf(matchLevel);
        System.out.println("Starting test...");
        doSetup();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Performing clean up");
        driver.quit();
    }

    protected void doSetup() {
    }
}