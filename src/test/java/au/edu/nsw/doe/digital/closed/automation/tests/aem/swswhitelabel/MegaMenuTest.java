package au.edu.nsw.doe.digital.closed.automation.tests.aem.swswhitelabel;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.swswhitelabel.GlobalElements;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import org.junit.Test;

public class MegaMenuTest extends CapabilitiesBuilder {

    private AemActions action;

    @Override
    public void doSetUp() {
        action = new AemActionMethods(driver);
    }

    @Test
    public void megaMenuTest() throws Exception {
        {
            action.setScreenDimensions();

            action.getPage("sws-component-base","sws-mega-menu");
            eyes.checkRegion(GlobalElements.megaMenu);

            action.click(GlobalElements.subMenuLink1);
            eyes.checkRegion(GlobalElements.subMenu);

            action.click(GlobalElements.subMenuLink2);
            eyes.checkRegion(GlobalElements.subMenu);

            action.click(GlobalElements.subMenuLink3);
            eyes.checkRegion(GlobalElements.subMenu);

            eyes.close();
        }
    }
}
