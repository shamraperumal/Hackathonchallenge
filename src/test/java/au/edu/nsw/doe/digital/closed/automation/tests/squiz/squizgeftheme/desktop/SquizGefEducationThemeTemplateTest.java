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

        squizAction.getPage("gef-framework-template-base", "gef-framework-template-education-home");
        eyes.checkWindow(System.getenv("EYES-GEF-FRAMEWORK-EDUCATION-HOME"));

        squizAction.getPage("gef-framework-template-base", "gef-framework-template-education-inside-the-department");
        eyes.checkWindow(System.getenv("EYES-GEF-FRAMEWORK-EDUCATION-INSIDE-THE-DEPARTMENT"));

        squizAction.getPage("gef-framework-template-base", "gef-framework-template-education-primary-hub");
        eyes.checkWindow(System.getenv("EYES-GEF-FRAMEWORK-EDUCATION-PRIMARY-HUB"));

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

        squizAction.getPage("gef-framework-template-base", "gef-framework-template-erm");
        eyes.checkWindow(System.getenv("EYES-GEF-FRAMEWORK-ERM"));

        squizAction.getPage("gef-framework-template-base", "gef-framework-template-policies-landing-az");
        eyes.checkWindow(System.getenv("EYES-GEF-FRAMEWORK-POLICY-LANDING-AZ"));

        squizAction.getPage("gef-framework-template-base", "gef-framework-template-policies-landing-topic");
        eyes.checkWindow(System.getenv("EYES-GEF-FRAMEWORK-POLICY-LANDING-TOPIC"));

        squizAction.getPage("gef-framework-template-base", "gef-framework-template-policies-topic");
        eyes.checkWindow(System.getenv("EYES-GEF-FRAMEWORK-POLICY-TOPIC"));

        squizAction.getPage("gef-framework-template-base", "gef-framework-template-policies-standard");
        eyes.checkWindow(System.getenv("EYES-GEF-FRAMEWORK-POLICY-STANDARD"));

        squizAction.getPage("gef-framework-template-base", "gef-framework-template-policy-implementation-document");
        eyes.checkWindow(System.getenv("EYES-GEF-FRAMEWORK-POLICY-IMPLEMENTATION-DOCUMENT"));

        squizAction.getPage("gef-framework-template-base", "gef-framework-template-az-variant1");
        eyes.checkWindow(System.getenv("EYES-GEF-FRAMEWORK-A-Z-VARIANT-1"));

        squizAction.getPage("gef-framework-template-base", "gef-framework-template-az-variant2");
        eyes.checkWindow(System.getenv("EYES-GEF-FRAMEWORK-A-Z-VARIANT-2"));

        squizAction.getPage("gef-framework-template-base", "gef-framework-template-az-variant3");
        eyes.checkWindow(System.getenv("EYES-GEF-FRAMEWORK-A-Z-VARIANT-3"));

        eyes.close();

    }
}

