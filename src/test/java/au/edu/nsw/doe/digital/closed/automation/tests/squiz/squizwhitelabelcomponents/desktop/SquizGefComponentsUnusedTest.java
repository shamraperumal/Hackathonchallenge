package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizwhitelabelcomponents.desktop;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.whitelabel.FullWidth;
import au.edu.nsw.doe.digital.closed.automation.pageobjects.whitelabel.Unused;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;

/**
 * Created by cpigden on 14/03/2016.
 */
public class SquizGefComponentsUnusedTest extends CapabilitiesBuilder {

    @Override
    public boolean getForceFullPageScreenshot() {
        return false;
    }


    @Test
    public void whitelabelExpandedNavTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-components-base", "gef-components-unused-column");
        eyes.checkRegion(Unused.expandedNav);

        eyes.close();
    }

    @Test
    public void whitelabelIconAndLabelTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-components-base", "gef-components-unused-column");
        eyes.checkRegion(Unused.iconAndLabel);

        eyes.close();
    }

    @Test
    public void whitelabelLoginLinkTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-components-base", "gef-components-unused-column");
        eyes.checkRegion(Unused.loginLink);

        eyes.close();
    }

    @Test
    public void whitelabelMaintenanceRibbonTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-components-base", "gef-components-unused-column");
        eyes.checkRegion(Unused.maintenanceRibbon);

        eyes.close();
    }

    @Test
    public void whitelabelNewsLetterSignUpTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-components-base", "gef-components-unused-column");
        eyes.checkRegion(Unused.newsLetterSignUp);

        eyes.close();
    }



    @Test
    public void whitelabelPrimaryHubTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-components-base", "gef-components-unused-column");
        eyes.checkRegion(Unused.primaryHub);

        eyes.close();
    }

    @Test
    public void whitelabelRadioListTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-components-base", "gef-components-unused-column");
        eyes.checkRegion(Unused.radioList);

        eyes.close();
    }
}
