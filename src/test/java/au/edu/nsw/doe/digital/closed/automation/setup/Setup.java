package au.edu.nsw.doe.digital.closed.automation.setup;

import com.applitools.eyes.Eyes;
import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.ProxySettings;
import com.applitools.eyes.RectangleSize;
import com.saucelabs.common.SauceOnDemandAuthentication;
import com.saucelabs.common.SauceOnDemandSessionIdProvider;
import com.saucelabs.junit.SauceOnDemandTestWatcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.*;

import java.net.URL;

/**
 * Created by ededios on 3/09/15.
 */
public abstract class Setup implements SauceOnDemandSessionIdProvider {

    public String userName = System.getenv("SAUCELABS.USER");
    public String accessKey = System.getenv("SAUCELABS.APIKEY");
    public String saucelabsUrl = System.getenv("SAUCELABS.URL");
    public String proxy = System.getenv("PROXYURL");
    public String testBrowser = getCapabilities().getBrowserName();
    public String testVersion = getCapabilities().getVersion();
    public String testBrowserVersion = " - "+ testBrowser + " "+testVersion;
    protected SauceOnDemandAuthentication authentication = new SauceOnDemandAuthentication(userName, accessKey);
    protected WebDriver driver;
    protected String sessionId;
    protected Eyes eyes;
    protected String testName;
    
    
    @Rule
    //JUnit Rule which will mark the sauce Job as passed/failed when the test succeeds or fails.
    public SauceOnDemandTestWatcher resultReportingTestWatcher = new SauceOnDemandTestWatcher(this, authentication);

    @Rule
    public TestRule watcher = new TestWatcher() {
        protected void starting(Description description) {
            String thisEnvironment = System.getenv("ENVIRONMENT");
            testName = description.getMethodName() + (thisEnvironment == null ? "" : thisEnvironment);
        }
    };

    @Before
    public void setUp() throws Exception {
        eyes = createApliToolsEyes();
        final WebDriver browser = createWebDriver();
        this.driver = eyes.open(browser, "DoE", testName + testBrowserVersion, getRectangleSize());
        this.sessionId = ((RemoteWebDriver) browser).getSessionId().toString();
        doSetUp();
        System.out.println("Starting test...");
    }

    private Eyes createApliToolsEyes() {
        final Eyes eyes = new Eyes();
        eyes.setApiKey(System.getenv("APPLITOOLS.APIKEY"));
        eyes.setMatchLevel(getMatchLevel());
        eyes.setForceFullPageScreenshot(true);
        if(proxy != null) {
            eyes.setProxy(new ProxySettings(proxy));
        }
        return eyes;
    }

    private WebDriver createWebDriver() throws Exception {
        String sauceUrl = String.format(saucelabsUrl, userName, accessKey);
        return new RemoteWebDriver(new URL(sauceUrl), getCapabilities());
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        cleanUp();
        System.out.println("End test.");
    }

    @Override
    //Gets sauce labs session id.
    public String getSessionId() {
        eyes.abortIfNotClosed();
        return sessionId;
    }

    protected void cleanUp() {
    }

    protected void doSetUp() {
    }

    protected abstract RectangleSize getRectangleSize();

    protected abstract MatchLevel getMatchLevel();

    protected abstract DesiredCapabilities getCapabilities();
}