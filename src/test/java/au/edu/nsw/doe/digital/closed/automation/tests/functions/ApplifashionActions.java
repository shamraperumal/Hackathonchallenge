package au.edu.nsw.doe.digital.closed.automation.tests.functions;

import org.openqa.selenium.By;



public interface ApplifashionActions {


    void getPage(final String domain, final String pageUrl) throws Exception;

    void wait(final By element) throws Exception;

    void click(By locator) throws Exception;

    void maximiseWindow() throws Exception;

    void setScreenDimensions() throws Exception;

    void hover(By locator) throws Exception;

    void selectfiltertypeandvalue(String filtertype, String filtervalue);
    void selectproduct(String producttype);




}
