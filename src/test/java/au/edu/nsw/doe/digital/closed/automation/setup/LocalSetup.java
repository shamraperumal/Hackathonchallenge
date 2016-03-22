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
    
    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = System.getenv("BASEURL");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
