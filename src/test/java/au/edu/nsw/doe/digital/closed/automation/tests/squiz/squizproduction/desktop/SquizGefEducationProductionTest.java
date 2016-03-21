package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizproduction.desktop;


import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;

/**
 * Created by christopherpigden on 9/09/2015.
 */
public class SquizGefEducationProductionTest extends CapabilitiesBuilder {

    @Test
    public void gefEducationDesktopProductionEyesTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-framework-base", "");
        eyes.checkWindow(System.getenv("EYES-GEF-FRAMEWORK-HOMEPAGE"));

        squizAction.search(System.getenv("SEARCH-INPUT"));
        eyes.checkWindow(System.getenv("EYES-GEF-FRAMEWORK-SEARCH"));

        squizAction.getPage("gef-framework-base", "gef-framework-landing");
        eyes.checkWindow(System.getenv("EYES-GEF-FRAMEWORK-LANDING"));

        squizAction.getPage("gef-framework-base", "gef-framework-standard");
        squizAction.showHide();
        eyes.checkWindow(System.getenv("EYES-GEF-FRAMEWORK-STANDARD"));

        squizAction.getPage("gef-framework-base", "gef-framework-catalogue");
        eyes.checkWindow(System.getenv(" EYES-GEF-FRAMEWORK-CATALOGUE"));

        squizAction.catalogueListView();
        eyes.checkWindow(System.getenv("EYES-GEF-FRAMEWORK-CATALOGUE-LIST"));

        squizAction.getPage("gef-framework-base", "gef-framework-tab");
        eyes.checkWindow(System.getenv("EYES-GEF-FRAMEWORK-TAB"));

        squizAction.getPage("gef-framework-base", "gef-framework-news-index");
        eyes.checkWindow(System.getenv("EYES-GEF-FRAMEWORK-NEWS-INDEX"));

        squizAction.getPage("gef-framework-base", "gef-framework-news-article");
        eyes.checkWindow(System.getenv("EYES-GEF-FRAMEWORK-NEWS-ARTICLE"));

        squizAction.getPage("gef-framework-base-default-banner", "");
        eyes.checkWindow(System.getenv("EYES-GEF-FRAMEWORK-DEFAULT-BANNER"));

        squizAction.getPage("gef-framework-base-shallow-banner", "");
        eyes.checkWindow(System.getenv("EYES-GEF-FRAMEWORK-SHALLOW-BANNER"));

        eyes.close();
    }
}
