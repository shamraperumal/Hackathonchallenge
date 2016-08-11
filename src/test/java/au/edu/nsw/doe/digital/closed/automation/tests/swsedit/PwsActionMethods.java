package au.edu.nsw.doe.digital.closed.automation.tests.swsedit;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.pws.*;
import au.edu.nsw.doe.digital.closed.automation.pageobjects.sso.SsoLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by ededios on 7/09/15.
 */
public class PwsActionMethods implements PwsActions {

    private final WebDriver driver;

    public PwsActionMethods(final WebDriver driver) {
        if (driver == null) {
            throw new IllegalArgumentException("WebDriver driver cannot be null");
        }
        this.driver = driver;
    }

    public void ssoLoginEntry() throws Exception {
        try {
            System.out.print("get page");
            driver.get(System.getenv("SSOURL"));
            wait(SsoLogin.username);
            wait(SsoLogin.password);
            wait(SsoLogin.submitButton);
            driver.findElement(SsoLogin.username).sendKeys(System.getenv("USERNAME"));
            driver.findElement(SsoLogin.password).sendKeys(System.getenv("PASSWORD"));
            driver.findElement(SsoLogin.submitButton).click();
        } catch (final Exception e) {
            System.out.println("Login failed");
            throw e;
        }
    }

    public void ssoLogin() throws Exception {
        System.out.println("Attempting login...");
        int count = 0;
        int maxTries = 3;
        while (true) {
            try {
                ssoLoginEntry();
                if (!"landing - shared".equals(driver.getTitle())) {
                    throw new IllegalStateException("Failed login");
                }
                break;
            } catch (Exception e) {
                // handle exception
                if (++count == maxTries) throw e;
            }
        }
    }

    public void getPage(final String domain, final String pageUrl, final String newPageA, final String newPageB) throws Exception {
        try {
            String thisPageUrl = System.getenv(pageUrl);
            String thisNewPageA = newPageA;
            String thisNewPageB = newPageB;
            driver.get(System.getenv(domain) + (thisPageUrl == null ? "" : thisPageUrl) + (thisNewPageA == null ? "" : thisNewPageA) + (thisNewPageB == null ? "" : thisNewPageB));
            System.out.println("Loaded domain url");

        } catch (final Exception e) {
            System.out.println("Failed to load page");
            throw e;
        }
    }

    public void wait(final By element) throws Exception {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            By thisElement = element;
            wait.until(ExpectedConditions.elementToBeClickable(thisElement));

        } catch (final Exception e) {
            throw e;
        }
    }

    public void killPopup() throws Exception {
        try {
            wait(WelcomeLightBox.checkBox);
            System.out.println("Pop Up checkbox loaded");
            wait(WelcomeLightBox.closeButton);
            System.out.println("Pop Up close button loaded");
            driver.findElement(WelcomeLightBox.checkBox).click();
            System.out.println("Ticked the check box");
            driver.findElement(WelcomeLightBox.closeButton).click();
            System.out.println("Closed the welcome popup...");

        } catch (final Exception e) {
            System.out.println("Failed to close welcome popup.");
            throw e;
        }
    }

    public void updateTitle(String title) throws Exception {
        try {
            wait(SwsHomePage.editTitle);
            driver.findElement(SwsHomePage.editTitle).click();
            wait(SwsHomePage.titleField);
            driver.findElement(SwsHomePage.titleField).clear();
            driver.findElement(SwsHomePage.titleField).sendKeys(title);
            driver.findElement(SwsHomePage.titleOkButton).click();
        } catch (final Exception e) {
            throw e;
        }
    }

    public void updateMotto(String motto) throws Exception {
        try {
            wait(SwsHomePage.editMotto);
            driver.findElement(SwsHomePage.editMotto).click();
            wait(SwsHomePage.mottoField);
            driver.findElement(SwsHomePage.mottoField).clear();
            driver.findElement(SwsHomePage.mottoField).sendKeys(motto);
            driver.findElement(SwsHomePage.mottoOkButton).click();
        } catch (final Exception e) {
            throw e;
        }
    }

    public void updateTagLine(String tagLine) throws Exception {
        try {
            wait(SwsHomePage.editTagline);
            driver.findElement(SwsHomePage.editTagline).click();
            wait(SwsHomePage.tagLineField);
            driver.findElement(SwsHomePage.tagLineField).clear();
            driver.findElement(SwsHomePage.tagLineField).sendKeys(tagLine);
            driver.findElement(SwsHomePage.tagLineOkButton).click();
        } catch (final Exception e) {
            throw e;
        }
    }

    public String addPage() throws Exception {
        try {
            final String newPageA = "Regression-" + Math.round(Math.random() * 1000000);
            wait(AddPage.addPageButton);
            System.out.println("Add page button loaded");
            WebElement element = driver.findElement(AddPage.addPageButton);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            System.out.println("Scrolled to add page button");
            driver.findElement(AddPage.addPageButton).click();
            wait(AddPage.standardPageTitleField);
            System.out.println("Title field loaded");
            driver.findElement(AddPage.standardPageTitleField).sendKeys(newPageA);
            wait(CommonLightbox.okButton);
            System.out.println("Ok button loaded");
            driver.findElement(CommonLightbox.okButton).click();
            System.out.println("Added a new page titled " + newPageA);
            return newPageA;

        } catch (final Exception e) {
            System.out.println("Failed to add a page.");
            throw e;
        }
    }

    public String addSectionPage() throws Exception {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            final String newPageA = "Regression-" + Math.round(Math.random() * 1000000);
            WebElement addSectionPageButton = wait.until(ExpectedConditions.elementToBeClickable(AddPage.addSectionPageButton));
            driver.findElement(AddPage.addSectionPageButton).click();
            WebElement addSectionPageTitleField = wait.until(ExpectedConditions.elementToBeClickable(AddPage.sectionPageTitleField));
            driver.findElement(AddPage.sectionPageTitleField).sendKeys(newPageA);
            WebElement okButton = wait.until(ExpectedConditions.elementToBeClickable(CommonLightbox.okButton));
            System.out.println("Ok button loaded");
            driver.findElement(CommonLightbox.okButton).click();
            System.out.println("Adding a new section page titled " + newPageA);
            return newPageA;

        } catch (final Exception e) {
            System.out.println("Failed to add a section page.");
            throw e;
        }
    }

    public String pwsAddEvent() throws Exception {
        try {
            wait(SwsCalendarPage.addEventButton);
            final String newEventA = "Regression " + Math.round(Math.random() * 1000000);
            driver.findElement(SwsCalendarPage.addEventButton).click();
            wait(SwsCalendarPage.eventTitleField);
            driver.findElement(SwsCalendarPage.eventTitleField).sendKeys(newEventA);
            wait(SwsCalendarPage.startTime);
            driver.findElement(SwsCalendarPage.startTime).clear();
            driver.findElement(SwsCalendarPage.startTime).sendKeys(System.getenv("SWS-CALENDAR-EVENT-A-START-TIME"));
            wait(SwsCalendarPage.eventDetails);
            driver.findElement(SwsCalendarPage.eventDetails).sendKeys(System.getenv("SWS-CALENDAR-EVENT-A-DETAILS"));
            WebElement element = driver.findElement(SwsCalendarPage.eventOkButton);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            wait(SwsCalendarPage.eventOkButton);
            driver.findElement(SwsCalendarPage.eventOkButton).click();
            wait(SwsCalendarPage.radioButton1);
            driver.findElement(SwsCalendarPage.radioButton1).click();
            driver.findElement(SwsCalendarPage.radioButton2).click();
            wait(SwsCalendarPage.eventPublishConfirmation);
            driver.findElement(SwsCalendarPage.eventPublishConfirmation).click();
            return newEventA;

        } catch (final Exception e) {
            throw e;
        }
    }

    public String pwsGetCalendarEventUrl(String newEventA, String environment) throws Exception {
        try {
            String thisEnvironment = environment;
            if (thisEnvironment == "SWS-BASE-LIVE") {
                wait(SwsHomePage.calendarPortlet);
                driver.findElement(By.xpath("//div[@class='upevents']//a[contains(.,'" + newEventA + "')]")).click();
            } else {
                getPage("SWS-BASE-STAGING", "SWS-CALENDAR", "", "");
                wait(SwsCalendarPage.calendarPortlet);
                By eventLink = By.xpath("//table[@class='det-calendar-table']//a[contains(.,'" + newEventA + "')]");
                WebElement element = driver.findElement(eventLink);
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                driver.findElement(eventLink).click();
            }
            String eventURL = driver.getCurrentUrl();
            return eventURL;

        } catch (final Exception e) {
            throw e;
        }
    }


    public void pwsDeleteEvent() throws Exception {
        try {
            wait(SwsCalendarPage.deleteEventButton);
            driver.findElement(SwsCalendarPage.deleteEventButton).click();
            wait(SwsCalendarPage.deleteOkButton);
            driver.findElement(SwsCalendarPage.deleteOkButton).click();
            wait(SwsCalendarPage.deleteConfirmationButton);
            driver.findElement(SwsCalendarPage.deleteConfirmationButton).click();

        } catch (final Exception e) {
            throw e;
        }

    }

    public String pwsAddFeaturedNews() throws Exception {
        try {
            final String newPageA = "Regression-" + Math.round(Math.random() * 1000000);
            wait(AddPage.addNewsArticleButton);
            driver.findElement(AddPage.addNewsArticleButton).click();
            wait(AddPage.newsArticleTitleField);
            driver.findElement(AddPage.newsArticleTitleField).sendKeys(newPageA);
            driver.findElement(CommonLightbox.okButton).click();
            System.out.println("Added a new Featured Article titled " + newPageA);
            driver.findElement(AddPage.featuredRadioButtonYes).click();
            return newPageA;

        } catch (final Exception e) {
            System.out.println("Failed to add a featured news article.");
            throw e;
        }
    }

    public String pwsAddNews() throws Exception {
        try {
            final String newPageA = "Regression-" + Math.round(Math.random() * 1000000);
            wait(AddPage.addNewsArticleButton);
            driver.findElement(AddPage.addNewsArticleButton).click();
            wait(AddPage.newsArticleTitleField);
            driver.findElement(AddPage.newsArticleTitleField).sendKeys(newPageA);
            driver.findElement(CommonLightbox.okButton).click();
            System.out.println("Added a news article titled " + newPageA);
            return newPageA;

        } catch (final Exception e) {
            System.out.println("Failed to add a news article.");
            throw e;
        }
    }

    public String pwsAddPageOnSitemap() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        try {
            wait(SiteMap.ourSchoolButton);
            System.out.println("Our School button located");
            driver.findElement(SiteMap.ourSchoolButton).click();
            System.out.println("Our School button clicked");
            wait.until(ExpectedConditions.visibilityOfElementLocated(SiteMap.flyOut));
            System.out.println("Flyout Opened");
            wait(SiteMap.addSiteMapPageButton);
            System.out.println("Add page button button located");
            driver.findElement(SiteMap.addSiteMapPageButton).click();
            System.out.println("Add page button clicked");
            wait(SiteMap.addSiteMapPageTitleField);
            System.out.println("Title field located");
            final String newPageA = "SM-" + Math.round(Math.random() * 1000000);
            driver.findElement(SiteMap.addSiteMapPageTitleField).clear();
            System.out.println("Title field cleared");
            driver.findElement(SiteMap.addSiteMapPageTitleField).sendKeys(newPageA);
            System.out.println("Title entered");
            wait(SiteMap.siteMapOkButton);
            System.out.println("Ok button located");
            driver.findElement(SiteMap.siteMapOkButton).click();
            System.out.println("Ok button clicked");
            wait(SiteMap.siteMapOkConfirmationButton);
            System.out.println("Ok confirmation button located");
            driver.findElement(SiteMap.siteMapOkConfirmationButton).click();
            System.out.println("Ok confirmation button clicked");
            return newPageA;

        } catch (final Exception e) {
            System.out.println("Failed to add page through sitemap");
            throw e;
        }
    }

    public void pwsExpandSiteMap() throws Exception {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 90);
            wait.until(ExpectedConditions.visibilityOfElementLocated(SiteMap.siteMapExpand));
            System.out.println("Expand link located");
            driver.findElement(SiteMap.siteMapExpand).click();
            System.out.println("Sitemap expanded");

        } catch (final Exception e) {
            System.out.println("Failed to expand sitemap");
            throw e;
        }
    }

    public String pwsSiteMapRenamePage() throws Exception {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 90);
            wait.until(ExpectedConditions.visibilityOfElementLocated(SiteMap.siteMapRenameButton));
            System.out.println("Located the sitemap rename button");
            driver.findElement(SiteMap.siteMapRenameButton).click();
            System.out.println("Clicked rename button");
            wait(SiteMap.siteMapRenameTitleField);
            System.out.println("Title field located");
            final String newPageB = "SM-" + Math.round(Math.random() * 1000000);
            driver.findElement(SiteMap.siteMapRenameTitleField).clear();
            System.out.println("Title field cleared");
            driver.findElement(SiteMap.siteMapRenameTitleField).sendKeys(newPageB);
            System.out.println("Title entered");
            wait(SiteMap.siteMapOkConfirmationButton);
            System.out.println("Ok confirmation button located");
            driver.findElement(SiteMap.siteMapOkConfirmationButton).click();
            System.out.println("Ok confirmation button clicked");
            return newPageB;

        } catch (final Exception e) {
            System.out.println("Failed to rename page");
            throw e;
        }
    }

    public void pwsDeletePageOnSitemap() throws Exception {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 90);
            wait.until(ExpectedConditions.visibilityOfElementLocated(SiteMap.flyOut));
            System.out.println("Flyout Opened");
            wait(SiteMap.siteMapDeleteButton);
            System.out.println("Delete page button button located");
            driver.findElement(SiteMap.siteMapDeleteButton).click();
            System.out.println("Delete page button clicked");
            wait(SiteMap.siteMapOkConfirmationButton);
            System.out.println("Ok confirmation button located");
            driver.findElement(SiteMap.siteMapOkConfirmationButton).click();
            System.out.println("Ok confirmation button clicked");

        } catch (final Exception e) {
            System.out.println("Failed to delete page through sitemap");
            throw e;
        }
    }

    public String pwsAddAlbum() throws Exception {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            final String newAlbum = "regression-album-" + Math.round(Math.random() * 1000000);
            wait(SwsGalleryPage.addAlbumButton);
            System.out.println("Add Album button loaded");
            driver.findElement(SwsGalleryPage.addAlbumButton).click();
            System.out.println("Clicked Add Album button");
            wait(SwsGalleryPage.albumTitleField);
            System.out.println("Album Title field loaded");
            driver.findElement(SwsGalleryPage.albumTitleField).clear();
            driver.findElement(SwsGalleryPage.albumTitleField).sendKeys(newAlbum);
            System.out.println("Entered Album title");
            wait(SwsGalleryPage.albumDescriptionField);
            System.out.println("Album Description field loaded");
            driver.findElement(SwsGalleryPage.albumDescriptionField).clear();
            driver.findElement(SwsGalleryPage.albumDescriptionField).sendKeys("Vivamus suscipit tortor eget felis porttitor volutpat. Praesent sapien massa, convallis a pellentesque nec, egestas non nisi.");
            System.out.println("Entered text in to the description field");
            wait(SwsGalleryPage.albumNextButton);
            System.out.println("Next button loaded");
            driver.findElement(SwsGalleryPage.albumNextButton).click();
            System.out.println("Clicked next button");
            wait.until(ExpectedConditions.visibilityOfElementLocated(SwsGalleryPage.albumUploadText));
            System.out.println("Expected text is visible");
            WebElement upload = driver.findElement(SwsGalleryPage.albumUpload);
            upload.sendKeys(System.getenv("SWS-ALBUM-IMAGE"));
            wait.until(ExpectedConditions.visibilityOfElementLocated(SwsGalleryPage.albumSubmitButton));
            System.out.println("Submit button loaded");
            driver.findElement(SwsGalleryPage.albumSubmitButton).click();
            System.out.println("Clicked submit button");
            wait.until(ExpectedConditions.visibilityOfElementLocated(SwsGalleryPage.albumUploadDoneButton));
            System.out.println("Loaded done button");
            driver.findElement(SwsGalleryPage.albumUploadDoneButton).click();
            System.out.println("Clicked Done button");
            return newAlbum;

        } catch (final Exception e) {
            System.out.println("Failed to add album");
            throw e;

        }
    }


    public void enterText() throws Exception {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            String parentwindow = driver.getWindowHandle();
            WebElement iframe = driver.findElement(By.tagName("iframe"));
            WebElement editorIframe = wait.until(ExpectedConditions.elementToBeClickable(iframe));
            System.out.println("Iframe loaded");
            driver.switchTo().frame(iframe);
            WebElement tinymce = driver.findElement(By.tagName("body"));
            WebElement editor = wait.until(ExpectedConditions.elementToBeClickable(tinymce));
            System.out.println("Editor loaded");
            tinymce.clear();
            tinymce.sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
            driver.switchTo().window(parentwindow);
            System.out.println("Entering text in to the ck editor...");
        } catch (final Exception e) {
            System.out.println("Failed to enter text in to ck editor.");
            throw e;
        }
    }


    public void publishPage() throws Exception {
        try {
            wait(PageActionToolbar.publishButton);
            System.out.println("Publish button loaded");
            driver.findElement(PageActionToolbar.publishButton).click();
            System.out.println("Clicked publish button");
            wait(CommonLightbox.containsChildrenNoRadioButton);
            driver.findElement(CommonLightbox.containsChildrenNoRadioButton).click();
            driver.findElement(CommonLightbox.copyrightYesRadioButton).click();
            System.out.println("Radio buttons ticked");
            wait(CommonLightbox.okButton);
            driver.findElement(CommonLightbox.okButton).click();
            System.out.println("Clicked publish button");
            wait(CommonLightbox.okButton);
            driver.findElement(CommonLightbox.okButton).click();
            System.out.println("Clicked ok confirmation button");
            System.out.println("Published page");

        } catch (final Exception e) {
            System.out.println("Failed to publish page.");
            throw e;
        }
    }

    public void deletePage() throws Exception {
        try {
            wait(PageActionToolbar.deleteButton);
            driver.findElement(PageActionToolbar.deleteButton).click();
            System.out.println("Clicked Delete button");
            wait(CommonLightbox.okButton);
            driver.findElement(CommonLightbox.okButton).click();
            System.out.println("Clicked ok button");
            wait(CommonLightbox.okButton);
            driver.findElement(CommonLightbox.okButton).click();
            System.out.println("Clicked ok confirmation button");
            System.out.println("Deleted page");

        } catch (final Exception e) {
            System.out.println("Failed to delete page.");
            throw e;
        }
    }

    public void pwsChangeSiteDesign(By design, By primary, By secondary) throws Exception {
        try {
            wait(design);
            driver.findElement(design).click();
            System.out.println("Selected design");
            wait(primary);
            driver.findElement(primary).click();
            if (secondary !=null) {
                driver.findElement(secondary).click();
                System.out.println("Selected primary and secondary colours");
            }
            System.out.println("Selected primary colours");
            driver.findElement(SwsDesignPage.designSubmitButton).click();
            System.out.println("Clicked design button");
            wait(SwsDesignPage.designSubmitConfirmationButton);
            driver.findElement(SwsDesignPage.designSubmitConfirmationButton).click();
            System.out.println("Clicked design confirmation button");

        } catch (final Exception e) {
            System.out.println("Failed to change the design");
            throw e;
        }
    }

    public void pwsAddSocial(String socialLink, String account) throws Exception {
        try {
            String thisSocialLink = socialLink;
            String thisAccount = System.getenv(account);
            if (thisSocialLink == "twitter") {
                wait(SwsSocialProfile.addTwitterLink);
                driver.findElement(SwsSocialProfile.addTwitterLink).click();
                wait(SwsSocialProfile.socialProfileNameField);
                driver.findElement(SwsSocialProfile.socialProfileNameField).sendKeys(thisAccount);
            }
            if (thisSocialLink == "facebook") {
                wait(SwsSocialProfile.addFacebookLink);
                driver.findElement(SwsSocialProfile.addFacebookLink).click();
                wait(SwsSocialProfile.socialProfileNameField);
                driver.findElement(SwsSocialProfile.socialProfileNameField).sendKeys(thisAccount);
            }
            if (thisSocialLink == "youtube") {
                wait(SwsSocialProfile.addYoutubeLink);
                driver.findElement(SwsSocialProfile.addYoutubeLink).click();
                wait(SwsSocialProfile.youtubeProfileNameField);
                driver.findElement(SwsSocialProfile.youtubeProfileNameField).sendKeys(thisAccount);
            }
            if (thisSocialLink == "vimeo") {
                wait(SwsSocialProfile.addVimeoLink);
                driver.findElement(SwsSocialProfile.addVimeoLink).click();
                wait(SwsSocialProfile.vimeoProfileNameField);
                driver.findElement(SwsSocialProfile.vimeoProfileNameField).sendKeys(thisAccount);
            }
            wait(SwsSocialProfile.socialProfileOkButton);
            driver.findElement(SwsSocialProfile.socialProfileOkButton).click();

        } catch (final Exception e) {
            throw e;
        }
    }

    public void pwsDeleteSocial() throws Exception {
        try {
            driver.findElement(SwsSocialProfile.removeSocialMediaButton).click();
            wait(SwsSocialProfile.confirmDeleteSocialMediaButton);
            driver.findElement(SwsSocialProfile.confirmDeleteSocialMediaButton).click();
            wait(SwsSocialProfile.publishButton);

        } catch (final Exception e) {
            throw e;
        }
    }

    public void pwsPublishSocialProfile() throws Exception {
        try {
            wait(SwsSocialProfile.publishButton);
            driver.findElement(SwsSocialProfile.publishButton).click();
            Thread.sleep(3000);

        } catch (final Exception e) {
            throw e;
        }
    }

    public void searchPwsDecCorporateSite() throws Exception {
        try {
            wait(DecCorporateSearch.headerSearchField);
            System.out.println("Header Search field located");
            driver.findElement(DecCorporateSearch.headerSearchField).sendKeys(System.getenv("DEC-CORPORATE-SEARCH-INPUT"));
            System.out.println("Entered text in to search field");
            wait(DecCorporateSearch.headerSearchSubmitButton);
            System.out.println("Header Search Submit Button located");
            driver.findElement(DecCorporateSearch.headerSearchSubmitButton).click();
            System.out.println("Submitted Search");

        } catch (final Exception e) {
            System.out.println("Failed to submit search");
            throw e;
        }
    }

    public void searchPwsDecCorporateSiteDgBlog() throws Exception {
        try {
            wait(DecCorporateSearch.blogSearchField);
            System.out.println("Blog Search field located");
            driver.findElement(DecCorporateSearch.blogSearchField).sendKeys(System.getenv("DEC-CORPORATE-BLOG-SEARCH-INPUT"));
            System.out.println("Entered text in to search field");
            wait(DecCorporateSearch.blogSearchButton);
            System.out.println("Blog Search Submit Button located");
            driver.findElement(DecCorporateSearch.blogSearchButton).click();
            System.out.println("Submitted Search");

        } catch (final Exception e) {
            System.out.println("Failed to submit search");
            throw e;
        }
    }

    public void searchPwsDecInternationalSchoolSearch() throws Exception {
        try {
            wait(DecInternationalSearch.schoolSearchtextField);
            System.out.println("School Search field located");
            driver.findElement(DecInternationalSearch.schoolSearchtextField).click();
            driver.findElement(DecInternationalSearch.schoolSearchtextField).sendKeys(System.getenv("DEC-INTERNATIONAL-SCHOOL-SEARCH-INPUT"));
            System.out.println("Search text entered");
            wait(DecInternationalSearch.schoolSuitableForDropDown);
            System.out.println("Suitable for drop down located");
            WebElement selectSuitableFor = driver.findElement(DecInternationalSearch.schoolSuitableForDropDown);
            driver.findElement(DecInternationalSearch.schoolSuitableForDropDown).click();
            selectSuitableFor.sendKeys("s");
            driver.findElement(DecInternationalSearch.schoolSearchSubmitButton).click();
            System.out.println("Clicked submit button");

        } catch (final Exception e) {
            System.out.println("Failed to search");
            throw e;
        }
    }

    public void searchPwsDecInternationalSearch() throws Exception {
        try {
            wait(DecInternationalSearch.gsaSearchTextField);
            driver.findElement(DecInternationalSearch.gsaSearchTextField).click();
            System.out.println("Clicked on search field");
            driver.findElement(DecInternationalSearch.gsaSearchTextField).sendKeys(System.getenv("DEC-INTERNATIONAL-GSA-SEARCH-INPUT"));
            System.out.println("Entered search text");
            wait(DecInternationalSearch.gsaSearchSubmitButton);
            driver.findElement(DecInternationalSearch.gsaSearchSubmitButton).click();
            System.out.println("Clicked on search submit button");

        } catch (final Exception e) {
            System.out.println("Failed to submit search");
            throw e;
        }
    }


}
