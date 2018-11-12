package au.edu.nsw.doe.digital.closed.automation.tests.squiz;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.squiz.*;
import au.edu.nsw.doe.digital.closed.automation.pageobjects.sso.SsoLogin;
import com.applitools.eyes.Eyes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;


public class SquizActionMethods implements SquizActions {


    protected WebDriver driver;


    public SquizActionMethods(WebDriver driver) {
        this.driver = driver;

    }

    public void wait(final By element) throws Exception {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 90);
            By thisElement = element;
            wait.until(ExpectedConditions.elementToBeClickable(thisElement));
        } catch (final Exception e) {
            throw e;

        }
    }

    public void getPage(final String domain, final String pageUrl) throws Exception {
        try {
            String thisDomain = System.getenv(domain);
            String thisPageUrl = System.getenv(pageUrl);
            driver.get(thisDomain + (thisPageUrl == null ? "" : thisPageUrl));
            System.out.println("Loaded domain url");

           try {
                    if (thisPageUrl.contains("tab") || thisPageUrl.contains("standard") || thisPageUrl.contains("gef-policies"))
                    {
                        Thread.sleep(2000);
                        System.out.print("This is " + thisPageUrl + "page. So it's in sleep thread for 2000 miliseconds");
                    }
                }
                catch( final NullPointerException e)
                {
                    System.out.println("I am in try catch but i don't know why !!");
                }
             } catch (final Exception e) {
            System.out.println("Failed to load page");
            throw e;


//                wait.until(ExpectedConditions.visibilityOfElementLocated();
            // This wil have code to verify if the secondary index element has launched.


        }
    }


    public void search(final String searchInput) throws Exception {
        try {
            wait(GefSearch.searchField);
            wait(GefSearch.searchSubmitButton);
            String thisSearchInput = searchInput;
            driver.findElement(GefSearch.searchField).clear();
            driver.findElement(GefSearch.searchField).sendKeys(thisSearchInput == "SEARCH-INPUT" ? "test" : thisSearchInput);
            driver.findElement(GefSearch.searchSubmitButton).click();
            wait(GefSearch.pagination);
        } catch (final Exception e) {
            throw e;
        }
    }


    public void mobileSearch(final String searchInput) throws Exception {
        try {
            wait(GefSearch.mobileSearchButton);
            driver.findElement(GefSearch.mobileSearchButton).click();
            wait(GefSearch.searchField);
            wait(GefSearch.searchSubmitButton);
            String thisSearchInput = searchInput;
            driver.findElement(GefSearch.searchField).clear();
            driver.findElement(GefSearch.searchField).sendKeys(thisSearchInput == "SEARCH-INPUT" ? "test" : thisSearchInput);
            driver.findElement(GefSearch.searchSubmitButton).click();
            wait(GefSearch.pagination);
        } catch (final Exception e) {
            throw e;
        }
    }

    public void tab() throws Exception {

        try {
            wait(GefTab.tab);
            driver.findElement(GefTab.tab).click();
            Thread.sleep(500);
        } catch (final Exception e) {
            throw e;
        }
    }

    public void showHide() throws Exception {
        try {
            wait(GefShowHide.showHide1);
            wait(GefShowHide.showHide2);
            wait(GefShowHide.showHide3);
            driver.findElement(GefShowHide.showHide1).click();
        } catch (final Exception e) {
            throw e;
        }
    }

    public void catalogueGroupSelect(final String group) throws Exception{
        String thisGroup = group;
        try {
            if(thisGroup == "automation"){
            driver.findElement(GefCatalogue.automationGroup).click();
            }
        }catch(final Exception e){
            System.out.println();
            throw e;
        }

    }

    public void catalogueListView() throws Exception {
        try {
            wait(GefCatalogue.listViewButton);
            driver.findElement(GefCatalogue.listViewButton).click();
            Thread.sleep(500);
        } catch (final Exception e) {
            throw e;
        }
    }

    public void catalogueSort(String order) throws Exception {
       String thisOrder = order;

        try {
            if (thisOrder == "High") {
                driver.findElement(GefCatalogue.highOrder).click();
                System.out.println("Sorted from highest to lowest");
            }
            if (thisOrder == "Low") {
                driver.findElement(GefCatalogue.lowOrder).click();
                System.out.println("Sorted from lowest to highest");
            }
            if (thisOrder == "AZ") {
                driver.findElement(GefCatalogue.azOrder).click();
                System.out.println("Sorted from a to z");
            }
            if (thisOrder == "ZA") {
                driver.findElement(GefCatalogue.zaOrder).click();
                System.out.println("Sorted from z to a");
            }

        }catch (final Exception e){
            System.out.println("Failed to sort the list");
            throw e;

        }
    }

    public void getNewInstance() throws Exception{
        try {
            driver.get("https://cms.det.nsw.edu.au/__lib/web/sup_switcher.php");
            wait(By.xpath("//input[@value='New Instance']"));
            driver.findElement(By.xpath("//input[@value='New Instance']")).click();
        }catch(final Exception e){
            throw e;
        }
    }

    public void clickWebElement(By locator) throws Exception{
        By thisLocator = locator;
        try {
            driver.findElement(thisLocator).click();
            System.out.println("Clicked on element");
        }catch (final Exception e){
            System.out.println("Failed to click element");
            throw e;
        }
    }

    public void maximiseWindow() throws Exception{
       try{ driver.manage().window().maximize();
           System.out.println("Window maximised");
    }
       catch (final Exception e){
           System.out.println("Failed to maxmise window");
       }
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
                if (!"Home | Inside the department".equals(driver.getTitle())) {
                    throw new IllegalStateException("Failed login");
                }
                break;
            } catch (Exception e) {
                // handle exception
                if (++count == maxTries) throw e;
            }
        }
    }

    public void navigation() throws Exception {

        try {

            }
            catch(final Exception e)
            {
                System.out.println(e.getLocalizedMessage());
            }


    }

    public boolean FeedbackWidget() throws Exception {
        try {

            //wait(FeedbackWidget.yourFeedbackWidget)
            driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
            if (driver.findElement(FeedbackWidget.yourFeedbackWidget).isEnabled() == true)
                return true;
            else
                return false;
        } catch (final Exception e) {
            throw e;
        }
    }


    public boolean SocialMedia() throws Exception {
        try {

           // wait(GefConnectWithUs.connectWithuspost);
            driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;

            if (driver.findElements(GefConnectWithUs.connectWithuspost).size() > 0 ) {
                System.out.println("Number of posts displayed are " + driver.findElements(GefConnectWithUs.connectWithuspost).size());
                return true;
            }
            else
                return false;
        } catch (final Exception e) {
            throw e;
        }
    }
}







