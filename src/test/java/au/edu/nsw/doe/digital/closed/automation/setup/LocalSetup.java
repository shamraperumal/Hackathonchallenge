package au.edu.nsw.doe.digital.closed.automation.setup;

import com.applitools.eyes.Eyes;
import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.ProxySettings;
import com.applitools.eyes.RectangleSize;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by christopherpigden on 22/03/2016.
 */

public abstract class LocalSetup {

    protected WebDriver driver;
    public String baseUrl;
    protected Eyes eyes;
    public String proxy = System.getenv("PROXYURL");

    protected MatchLevel getMatchLevel() {
        String matchLevel = System.getenv("MATCH_LEVEL");
        return MatchLevel.valueOf(matchLevel);
    }

    protected RectangleSize getRectangleSize() {
        String rectangleHeight = System.getenv("RECTANGLE_HEIGHT");
        String rectangleWidth = System.getenv("RECTANGLE_WIDTH");
        return new RectangleSize(Integer.parseInt(rectangleWidth), Integer.parseInt(rectangleHeight));
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

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = System.getenv("BASEURL");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Starting test...");
        doSetup();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Performing clean up");
        driver.quit();
        cleanUp();
    }


    protected void cleanUp() {
    }

    protected void doSetup() {
    }
}