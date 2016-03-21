package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizlegacytemplates.mobile;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.Dimension;

/**
 * Created by cpigden on 11/02/2016.
 */
public class SquizSchoolbizMobileTemplateTest extends CapabilitiesBuilder {

    @Ignore
    @Test
    public void schoolbizMobileTemplateEyesTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);
        Dimension dimension = new Dimension(375, 650);
        driver.manage().window().setSize(dimension);

        squizAction.getPage("schoolbiz-template-base", "schoolbiz-template-homepage");
        eyes.checkWindow(System.getenv("EYES-SCHOOLBIZ-HOME"));

        squizAction.getPage("schoolbiz-template-base", "schoolbiz-template-landingpage");
        eyes.checkWindow(System.getenv("EYES-SCHOOLBIZ-LANDING"));

        squizAction.getPage("schoolbiz-template-base", "schoolbiz-template-issuepage");
        eyes.checkWindow(System.getenv("EYES-SCHOOLBIZ-ISSUE"));

        squizAction.getPage("schoolbiz-template-base", "schoolbiz-template-articlepage");
        eyes.checkWindow(System.getenv("EYES-SCHOOLBIZ-ARTICLE"));

        squizAction.getPage("schoolbiz-template-base", "schoolbiz-template-forms");
        eyes.checkWindow(System.getenv("EYES-SCHOOLBIZ-FORM"));

        eyes.close();
    }
}
