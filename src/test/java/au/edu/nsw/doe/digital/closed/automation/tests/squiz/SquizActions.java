package au.edu.nsw.doe.digital.closed.automation.tests.squiz;

import org.openqa.selenium.By;

/**
 * Created by ededios on 7/09/15.
 */

public interface SquizActions {


    void getPage(final String domain, final String pageUrl) throws Exception;

    void search(final String searchInput) throws Exception;

    void mobileSearch(final String searchInput) throws Exception;

    void wait(final By element) throws Exception;

    void tab() throws Exception;

    void catalogueListView() throws Exception;

    void showHide() throws Exception;


}
