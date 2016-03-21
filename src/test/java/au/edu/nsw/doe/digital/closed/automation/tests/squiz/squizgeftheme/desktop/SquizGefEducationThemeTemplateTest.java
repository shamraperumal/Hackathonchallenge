package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizgeftheme.desktop;


import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;

/**
 * Created by christopherpigden on 9/09/2015.
 */
public class SquizGefEducationThemeTemplateTest extends CapabilitiesBuilder {

    @Test
    public void gefEducationThemeTemplateEyesTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-framework-template-base", "gef-framework-template-home-default");
        eyes.checkWindow(System.getenv("EYES-GEF-FRAMEWORK-DEFAULT"));

        squizAction.getPage("gef-framework-template-base", "gef-framework-template-home");
        eyes.checkWindow(System.getenv("EYES-GEF-FRAMEWORK-HOME"));

        squizAction.getPage("gef-framework-template-base", "gef-framework-template-landing");
        eyes.checkWindow(System.getenv("EYES-GEF-FRAMEWORK-LANDING"));

        squizAction.getPage("gef-framework-template-base", "gef-framework-template-standard");
        eyes.checkWindow(System.getenv("EYES-GEF-FRAMEWORK-STANDARD"));

        squizAction.getPage("gef-framework-template-base", "gef-framework-template-search");
        eyes.checkWindow(System.getenv("EYES-GEF-FRAMEWORK-SEARCH"));

        squizAction.getPage("gef-framework-template-base", "gef-framework-template-news-index");
        eyes.checkWindow(System.getenv("EYES-GEF-FRAMEWORK-NEWS-INDEX"));

        squizAction.getPage("gef-framework-template-base", "gef-framework-template-news-article");
        eyes.checkWindow(System.getenv("EYES-GEF-FRAMEWORK-NEWS-ARTICLE"));

        squizAction.getPage("gef-framework-template-base", "gef-framework-template-catalogue");
        eyes.checkWindow(System.getenv("EYES-GEF-FRAMEWORK-CATALOGUE"));

        eyes.close();

    }
}

