package au.edu.nsw.doe.digital.closed.automation.tests.swsedit;


import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests adding and deleting a page and confirms that changes are visible on the view node.
 */
public class PwsAddDeleteASectionPageTest extends CapabilitiesBuilder {

    private PwsActions action;

    @Before
    public void doSetUp() { action = new PwsActionMethods(driver);}

    @Test
    public void testAddAndDeleteASectionPage() throws Exception {


        action.ssoLogin();

        action.getPage("SWS-BASE-STAGING", "", "", "");

        final String newPageA = action.addSectionPage();

        //Pause to allow cache to clear
        Thread.sleep(3000);

        action.enterText();

        action.publishPage();

        //Pause to allow cache to clear
        Thread.sleep(10000);

        action.getPage("SWS-BASE-LIVE", "", newPageA, "");

        //asserts page is live
        assertEquals(newPageA + " - Automated Regression Testing", driver.getTitle());
        System.out.println(newPageA + " was succesfully published.");


        action.getPage("SWS-BASE-STAGING", "", newPageA, "");

        action.deletePage();

        //Pause to allow cache to clear
        Thread.sleep(10000);

        action.getPage("SWS-BASE-LIVE", "", newPageA, "");

        //asserts page was succesfully deleted.
        assertEquals("Status - Automated Regression Testing", driver.getTitle());
        System.out.println(newPageA + " was succesfully deleted.");



    }


}

