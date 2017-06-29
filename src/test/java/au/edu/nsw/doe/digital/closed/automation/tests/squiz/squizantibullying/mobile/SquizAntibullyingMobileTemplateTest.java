package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizantibullying.mobile;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;

/**
 * Created by christopherpigden on 21/3/17.
 */
public class SquizAntibullyingMobileTemplateTest extends CapabilitiesBuilder {

    @Test
    public void antibullyingMobileTemplateEyesTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("antibullying-template-base", "antibullying-template-home");
        eyes.checkWindow(System.getenv("EYES-ANTIBULLYING-HOME"));

        squizAction.getPage("antibullying-template-base", "antibullying-template-landing");
        eyes.checkWindow(System.getenv("EYES-ANTIBULLYING-LANDING"));

        squizAction.getPage("antibullying-template-base", "antibullying-template-standard");
        eyes.checkWindow(System.getenv("EYES-ANTIBULLYING-Standard"));

        squizAction.getPage("antibullying-template-base", "antibullying-template-search");
        eyes.checkWindow(System.getenv("EYES-ANTIBULLYING-SEARCH"));

        squizAction.getPage("antibullying-template-base", "antibullying-template-news-index");
        eyes.checkWindow(System.getenv("EYES-ANTIBULLYING-NEWS-INDEX"));

        squizAction.getPage("antibullying-template-base", "antibullying-template-news-article");
        eyes.checkWindow(System.getenv("EYES-ANTIBULLYING-NEWS-ARTICLE"));

        squizAction.getPage("antibullying-template-base", "antibullying-template-catalogue");
        eyes.checkWindow(System.getenv("EYES-ANTIBULLYING-CATALOGUE"));


        eyes.close();

    }
};
