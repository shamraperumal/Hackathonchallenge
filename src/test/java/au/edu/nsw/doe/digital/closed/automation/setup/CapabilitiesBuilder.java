package au.edu.nsw.doe.digital.closed.automation.setup;

import com.applitools.eyes.*;
import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.RectangleSize;
import org.openqa.selenium.remote.DesiredCapabilities;


/**
 * Created by christopherpigden on 15/09/2015.
 */

public class CapabilitiesBuilder extends Setup {

    @Override
    protected MatchLevel getMatchLevel() {
        String matchLevel = System.getenv("MATCH_LEVEL");
        return MatchLevel.valueOf(matchLevel);
    }

    @Override
    public boolean getForceFullPageScreenshot() {
        return true;
    }

    @Override
    protected RectangleSize getRectangleSize() {
        String rectangleHeight = System.getenv("RECTANGLE_HEIGHT");
        String rectangleWidth = System.getenv("RECTANGLE_WIDTH");
        return new RectangleSize(Integer.parseInt(rectangleWidth), Integer.parseInt(rectangleHeight));
    }




    @Override
    protected DesiredCapabilities getCapabilities() {
        final DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platform", System.getenv("SELENIUM_PLATFORM"));
        capabilities.setCapability("version", System.getenv("SELENIUM_VERSION"));
        capabilities.setCapability("browserName", System.getenv("SELENIUM_BROWSER"));
        capabilities.setCapability("screenResolution", System.getenv("SCREEN_RESOLUTION"));
        capabilities.setCapability("name", testName);
        capabilities.setCapability("build", System.getenv("JOB_NAME") + "__" + System.getenv("BUILD_NUMBER"));

        return capabilities;
    }

}
