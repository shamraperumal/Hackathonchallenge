package au.edu.nsw.doe.digital.closed.automation.tests.swsedit;


import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests adding and deleting a page and confirms that changes are visible on the view node.
 */

public class PwsAddDeleteStandardPageTest extends CapabilitiesBuilder {

    private PwsActions action;

    @Before
    public void doSetUp() { action = new PwsActionMethods(driver);}

    @Test
    public void testAddAndDeleteAPage() throws Exception {

        action.ssoLogin();

        action.getPage("SWS-BASE-STAGING", "sws-ourschool", "", "");

        final String newPageA = action.addPage();

        action.enterText();

        action.publishPage();

        Thread.sleep(10000);

        action.getPage("SWS-BASE-LIVE", "sws-ourschool", newPageA, "");

        //Asserts if page is published
        assertEquals(newPageA + " - Automated Regression Testing", driver.getTitle());
        System.out.println(newPageA + " was succesfully published.");


        action.getPage("SWS-BASE-STAGING", "sws-ourschool", newPageA, "");

        action.deletePage();

        Thread.sleep(10000);

        action.getPage("SWS-BASE-LIVE", "sws-ourschool", newPageA, "");

        //Asserts if page was deleted
        assertEquals("Status - Automated Regression Testing", driver.getTitle());
        System.out.println(newPageA + " was succesfully deleted.");


    }

}
