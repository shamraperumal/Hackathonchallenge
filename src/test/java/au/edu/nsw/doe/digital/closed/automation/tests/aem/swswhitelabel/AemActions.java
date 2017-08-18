package au.edu.nsw.doe.digital.closed.automation.tests.aem.swswhitelabel;

import org.openqa.selenium.By;

/**
 * Created by ededios on 7/09/15.
 */

public interface AemActions {


    void getPage(final String domain, final String pageUrl) throws Exception;

    void wait(final By element) throws Exception;

    void clickWebElement(By locator) throws Exception;

    void maximiseWindow() throws Exception;

    void setScreenDimensions(String DEVICE) throws Exception;




}
