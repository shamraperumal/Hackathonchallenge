package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizgreytheme.mobile;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;
import org.openqa.selenium.Dimension;

/**
 * Created by christopherpigden on 21/3/17.
 */
public class SquizMobileGreyThemeTemplateTest extends CapabilitiesBuilder {

    @Test
    public void greyMobileThemeTemplateEyesTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        Dimension dimension = new Dimension(375, 650);

        driver.manage().window().setSize(dimension);

        squizAction.getPage("grey-theme-template-base", "grey-theme-template-home");
        eyes.checkWindow(System.getenv("EYES-GREY-THEME-HOME"));

        squizAction.getPage("grey-theme-template-base", "grey-theme-template-landing");
        eyes.checkWindow(System.getenv("EYES-GREY-THEME-LANDING"));

        squizAction.getPage("grey-theme-template-base", "grey-theme-template-standard");
        eyes.checkWindow(System.getenv("EYES-GREY-THEME-STANDARD"));

        squizAction.getPage("grey-theme-template-base", "grey-theme-template-news-index");
        eyes.checkWindow(System.getenv("EYES-GREY-THEME-NEWS-INDEX"));

        squizAction.getPage("grey-theme-template-base", "grey-theme-template-news-article");
        eyes.checkWindow(System.getenv("EYES-GREY-THEME-NEWS-ARTICLE"));

        squizAction.getPage("grey-theme-template-base", "grey-theme-template-catalogue");
        eyes.checkWindow(System.getenv("EYES-GREY-THEME-CATALOGUE"));

        squizAction.getPage("grey-theme-template-base", "grey-theme-template-AZ1");
        eyes.checkWindow(System.getenv("EYES-GREY-THEME-AZ-1"));

        squizAction.getPage("grey-theme-template-base", "grey-theme-template-AZ2");
        eyes.checkWindow(System.getenv("EYES-GREY-THEME-AZ-2"));

        squizAction.getPage("grey-theme-template-base", "grey-theme-template-AZ3");
        eyes.checkWindow(System.getenv("EYES-GREY-THEME-AZ-3"));

        eyes.close();

    }
};
