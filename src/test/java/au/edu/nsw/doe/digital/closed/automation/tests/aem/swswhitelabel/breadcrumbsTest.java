package au.edu.nsw.doe.digital.closed.automation.tests.aem.swswhitelabel;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.swswhitelabel.GlobalElements;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import org.junit.Test;
import org.openqa.selenium.Dimension;

/**
 * Created by christopherpigden on 8/8/17.
 */
public class breadcrumbsTest extends CapabilitiesBuilder {

    private AemActions action;

    @Override
    public void doSetUp() {
        action = new AemActionMethods(driver);
    }

    @Test
    public void breadcrumbsTest() throws Exception {

            try {
                String thisDevice = System.getenv("DEVICE");
                if(thisDevice == "Tablet"){
                    Dimension dimension = new Dimension(768, 946);
                    driver.manage().window().setSize(dimension);
                    System.out.println("Set tablet width");
                }
                if(thisDevice=="Mobile"){
                    Dimension dimension = new Dimension(375, 650);
                    driver.manage().window().setSize(dimension);
                    System.out.println("Set mobile width");
                }
            } catch (final Exception e) {
                System.out.println("Failed to set screen dimensions");
            }

            action.getPage("sws-component-base","sws-breadcrumbs");
            eyes.checkRegion(GlobalElements.breadcrumbs);

            eyes.close();
        }
    }

