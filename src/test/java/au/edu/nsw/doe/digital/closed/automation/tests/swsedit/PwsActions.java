package au.edu.nsw.doe.digital.closed.automation.tests.swsedit;

import org.openqa.selenium.By;

/**
 * Created by ededios on 7/09/15.
 */
public interface PwsActions {

    void ssoLoginEntry() throws Exception;

    void ssoLogin() throws Exception;

    void wait(final By element) throws Exception;

    void updateTitle(String title) throws Exception;

    void updateMotto(String tag) throws Exception;

    void updateTagLine(String description) throws Exception;

    String addPage() throws Exception;

    String addSectionPage() throws Exception;

    String pwsAddAlbum() throws Exception;

    void enterText() throws Exception;

    void publishPage() throws Exception;

    void deletePage() throws Exception;

    void pwsChangeSiteDesign(By design, By primary, By secondary) throws Exception;

    String pwsAddFeaturedNews() throws Exception;

    String pwsAddNews() throws Exception;

    String pwsAddEvent() throws Exception;

    String pwsGetCalendarEventUrl(String newEvent, String environment) throws Exception;

    void pwsDeleteEvent() throws Exception;

    String pwsAddPageOnSitemap() throws Exception;

    void pwsExpandSiteMap() throws Exception;

    String pwsSiteMapRenamePage() throws Exception;

    void pwsDeletePageOnSitemap() throws Exception;

    void pwsAddSocial(String socialLink, String account) throws Exception;

    void pwsDeleteSocial() throws Exception;

    void pwsPublishSocialProfile() throws Exception;

    void searchPwsDecCorporateSite() throws Exception;

    void searchPwsDecCorporateSiteDgBlog() throws Exception;

    void searchPwsDecInternationalSchoolSearch() throws Exception;

    void searchPwsDecInternationalSearch() throws Exception;

    void getPage(final String domain, final String pageUrl, final String newPageA, final String newPageB) throws Exception;


}

