package au.edu.nsw.doe.digital.closed.automation.tests.aem.swswhitelabel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AemActionMethods implements AemActions{


    protected WebDriver driver;


    public AemActionMethods(WebDriver driver) {
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

        } catch (final Exception e) {
            System.out.println("Failed to load page");
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



}




