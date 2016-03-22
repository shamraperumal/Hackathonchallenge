package au.edu.nsw.doe.digital.closed.automation.setup;

import com.applitools.eyes.Eyes;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by christopherpigden on 22/03/2016.
 */

public abstract class LocalSetup {

    public WebDriver driver;
    public String baseUrl;
    protected Eyes eyes;
    protected String testName;
    public String proxy = System.getenv("PROXYURL");

//    protected MatchLevel getMatchLevel() {
//        String matchLevel = System.getenv("MATCH_LEVEL");
//        return MatchLevel.valueOf(matchLevel);
//    }
//
//    protected RectangleSize getRectangleSize() {
//        String rectangleHeight = System.getenv("RECTANGLE_HEIGHT");
//        String rectangleWidth = System.getenv("RECTANGLE_WIDTH");
//        return new RectangleSize(Integer.parseInt(rectangleWidth), Integer.parseInt(rectangleHeight));
//    }

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = System.getenv("BASEURL");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        eyes = createApliToolsEyes();
//        this.driver = eyes.open(driver, "DoE", testName, getRectangleSize());
    }

//    private Eyes createApliToolsEyes() {
//        final Eyes eyes = new Eyes();
//        eyes.setApiKey(System.getenv("APPLITOOLS.APIKEY"));
//        eyes.setMatchLevel(getMatchLevel());
//        eyes.setForceFullPageScreenshot(true);
//        if(proxy != null) {
//            eyes.setProxy(new ProxySettings(proxy));
//        }
//        return eyes;
//    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
