package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizuat.desktop;


import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;

/**
 * Created by christopherpigden on 9/09/2015.
 */
public class SquizGefEducationUatTest extends CapabilitiesBuilder {

    @Test
    public void gefEducationDesktopProductionEyesTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-education-base", "");
        eyes.checkWindow(System.getenv("EYES-GEF-EDUCATION-HOMEPAGE"));

        squizAction.getPage("gef-education-base", "gef-education-landing");
        eyes.checkWindow(System.getenv("EYES-GEF-EDUCATION-LANDING"));

        squizAction.getPage("gef-education-base", "gef-education-standard");
        squizAction.showHide();
        eyes.checkWindow(System.getenv("EYES-GEF-EDUCATION-STANDARD"));

        squizAction.getPage("gef-education-base", "gef-education-catalogue");
        eyes.checkWindow(System.getenv(" EYES-GEF-EDUCATION-CATALOGUE"));

        squizAction.catalogueListView();
        eyes.checkWindow(System.getenv("EYES-GEF-EDUCATION-CATALOGUE-LIST"));

        squizAction.getPage("gef-education-base", "gef-education-tab");
        eyes.checkWindow(System.getenv("EYES-GEF-EDUCATION-TAB"));

        squizAction.getPage("gef-education-base", "gef-education-news-index");
        eyes.checkWindow(System.getenv("EYES-GEF-EDUCATION-NEWS-INDEX"));

        squizAction.getPage("gef-education-base", "gef-education-news-article");
        eyes.checkWindow(System.getenv("EYES-GEF-EDUCATION-NEWS-ARTICLE"));

        squizAction.getPage("gef-education-base-default-banner", "");
        eyes.checkWindow(System.getenv("EYES-GEF-EDUCATION-DEFAULT-BANNER"));

        squizAction.getPage("gef-education-base-shallow-banner", "");
        eyes.checkWindow(System.getenv("EYES-GEF-EDUCATION-SHALLOW-BANNER"));

        eyes.close();
    }
}
