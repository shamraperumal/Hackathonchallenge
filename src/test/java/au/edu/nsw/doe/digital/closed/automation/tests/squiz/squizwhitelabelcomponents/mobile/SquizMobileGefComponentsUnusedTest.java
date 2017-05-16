package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizwhitelabelcomponents.mobile;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.whitelabel.Unused;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;
import org.openqa.selenium.Dimension;

/**
 * Created by cpigden on 14/03/2016.
 */
public class SquizMobileGefComponentsUnusedTest extends CapabilitiesBuilder {

    @Override
    public boolean getForceFullPageScreenshot() {
        return false;
    }

    @Test
    public void whitelabelMobileExpandedNavTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);
        Dimension dimension = new Dimension(375, 650);
        driver.manage().window().setSize(dimension);

        squizAction.getPage("gef-components-base", "gef-components-unused-column");
        eyes.checkRegion(Unused.expandedNav);

        eyes.close();
    }

    @Test
    public void whitelabelMobileIconAndLabelTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);
        Dimension dimension = new Dimension(375, 650);
        driver.manage().window().setSize(dimension);

        squizAction.getPage("gef-components-base", "gef-components-unused-column");
        eyes.checkRegion(Unused.iconAndLabel);

        eyes.close();
    }

    @Test
    public void whitelabelMobileLoginLinkTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);
        Dimension dimension = new Dimension(375, 650);
        driver.manage().window().setSize(dimension);

        squizAction.getPage("gef-components-base", "gef-components-unused-column");
        eyes.checkRegion(Unused.loginLink);

        eyes.close();
    }

    @Test
    public void whitelabelMobileMaintenanceRibbonTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);
        Dimension dimension = new Dimension(375, 650);
        driver.manage().window().setSize(dimension);

        squizAction.getPage("gef-components-base", "gef-components-unused-column");
        eyes.checkRegion(Unused.maintenanceRibbon);

        eyes.close();
    }

    @Test
    public void whitelabelMobileNewsLetterSignUpTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);
        Dimension dimension = new Dimension(375, 650);
        driver.manage().window().setSize(dimension);

        squizAction.getPage("gef-components-base", "gef-components-unused-column");
        eyes.checkRegion(Unused.newsLetterSignUp);

        eyes.close();
    }



    @Test
    public void whitelabelMobilePrimaryHubTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);
        Dimension dimension = new Dimension(375, 650);
        driver.manage().window().setSize(dimension);

        squizAction.getPage("gef-components-base", "gef-components-unused-column");
        eyes.checkRegion(Unused.primaryHub);

        eyes.close();
    }

    @Test
    public void whitelabelMobileRadioListTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);
        Dimension dimension = new Dimension(375, 650);
        driver.manage().window().setSize(dimension);

        squizAction.getPage("gef-components-base", "gef-components-unused-column");
        eyes.checkRegion(Unused.radioList);

        eyes.close();
    }


}
