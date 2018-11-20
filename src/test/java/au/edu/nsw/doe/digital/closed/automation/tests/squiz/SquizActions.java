package au.edu.nsw.doe.digital.closed.automation.tests.squiz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by ededios on 7/09/15.
 */

public interface SquizActions {


    void getPage(final String domain, final String pageUrl) throws Exception;

    void search(final String searchInput) throws Exception;

    void mobileSearch(final String searchInput) throws Exception;

    void wait(final By element) throws Exception;

    void tab() throws Exception;

    void catalogueGroupSelect(final String group) throws Exception;

    void catalogueListView() throws Exception;

    void catalogueSort(final String order) throws Exception;

    void showHide() throws Exception;

    void clickWebElement(By locator) throws Exception;

    void getNewInstance() throws Exception;

    void maximiseWindow() throws Exception;

    void ssoLoginEntry() throws Exception;

    void ssoLogin() throws Exception;

    void navigation() throws Exception;

    boolean FeedbackWidget() throws Exception;

    boolean SocialMedia() throws Exception;

    boolean Desktopguidedjourneynavigate() throws Exception;

    boolean keyboardnavigation(final String Keystroke) throws Exception;

    boolean longcontentnavigate() throws Exception;

}
