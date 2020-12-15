package au.edu.nsw.doe.digital.closed.automation.setup;

import com.applitools.eyes.*;
import com.applitools.eyes.selenium.*;
import com.applitools.eyes.visualgrid.model.*;
import com.applitools.eyes.visualgrid.services.*;
import io.github.bonigarcia.wdm.*;
import org.junit.*;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.text.*;
import java.util.*;
import java.util.concurrent.TimeUnit;


public abstract class Setup {

    protected WebDriver driver;
    public String baseUrl;
    public String proxy = System.getenv("PROXYURL");
    public String environment = System.getenv("ENVIRONMENT");
    protected Eyes eyes;
    protected String testName;
    protected String matchLevel = System.getenv("MATCH_LEVEL");
    public static BatchInfo ExecutionDate;
    public String appname = System.getenv("APPNAME");
    public String branchname = System.getenv("BRANCHNAME");
    public  EyesRunner runner = null;
    public  Configuration suiteConfig;
    public static String chromeDriverPath;

    @BeforeClass
    public static  void setBatch() throws Exception
    {

        ExecutionDate =new BatchInfo("Holiday Shopping");
        String batchId =  "Holiday Shopping" +System.getenv("BRANCHNAME");
        ExecutionDate.setId(batchId);



    }


    @Rule
    public TestRule watcher = new TestWatcher() {
        protected void starting(Description description) {
            testName = description.getMethodName() /*+ " on " + environment*/;
        }
    };

    protected RectangleSize rectangle() {
        String rectangleHeight = System.getenv("RECTANGLE_HEIGHT");
        String rectangleWidth = System.getenv("RECTANGLE_WIDTH");
        return new RectangleSize(Integer.parseInt(rectangleWidth), Integer.parseInt(rectangleHeight));
    }

    private Eyes createApliToolsEyes() {

        Eyes eyes = new Eyes(runner);
        eyes.setConfiguration(suiteConfig);
        eyes.setApiKey(System.getenv("APPLITOOLS.APIKEY"));
        eyes.setMatchLevel(MatchLevel.valueOf(matchLevel));
        eyes.setSendDom(true);
        try {
            //  if (getForceFullPageScreenshot()== true) {
            eyes.setForceFullPageScreenshot(true);
            // eyes.setScrollToRegion(true);
            System.out.println("Force Full Page Screenshot" + eyes.getForceFullPageScreenshot());
            eyes.setStitchMode(StitchMode.CSS);
            //
            }catch (final Exception e){
            System.out.print("failed to set the full page screenshot");
        }
        if (proxy != null) {
            eyes.setProxy(new ProxySettings(proxy));
        }
        return eyes;
    }

    @Before
    public void setUp() throws Exception {
        runner = new VisualGridRunner(new RunnerOptions().testConcurrency(2));

        suiteConfig = new Configuration();
        suiteConfig.addBrowser(new DesktopBrowserInfo(1200, 800, BrowserType.FIREFOX,"desktopBaseline"));
        suiteConfig.addBrowser(new DesktopBrowserInfo(1200, 800, BrowserType.CHROME,"desktopBaseline"));
       suiteConfig.addBrowser(new DesktopBrowserInfo(1200, 800, BrowserType.EDGE_CHROMIUM,"desktopBaseline"));
        suiteConfig.addBrowser(new DesktopBrowserInfo(1200, 800, BrowserType.SAFARI,"desktopBaseline"));
       suiteConfig.addBrowser(new IosDeviceInfo(IosDeviceName.iPhone_X, ScreenOrientation.LANDSCAPE));

        suiteConfig.setViewportSize(new RectangleSize(1200, 800));



        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        baseUrl = System.getenv("BASEURL");
        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
        eyes = createApliToolsEyes();
        eyes.setBatch(ExecutionDate);
        eyes.setBranchName(branchname);

        if (proxy != null) {
            eyes.setProxy(new ProxySettings(proxy));
        }
        driver = eyes.open(driver, appname, testName /*+ rectangle()*/);

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