package au.edu.nsw.doe.digital.closed.automation.tests.functions;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.Applifashion.GlobalElements;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;


public class ApplifashionActionMethods implements ApplifashionActions {


    protected WebDriver driver;


    public ApplifashionActionMethods(WebDriver driver) {
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


    public void click(By locator) throws Exception {
        By thisLocator = locator;
        try {
            driver.findElement(thisLocator).click();
            System.out.println("Clicked on element");
        } catch (final Exception e) {
            System.out.println("Failed to click element");
            throw e;
        }
    }

    public void maximiseWindow() throws Exception {
        try {
            driver.manage().window().maximize();
            System.out.println("Window maximised");
        } catch (final Exception e) {
            System.out.println("Failed to maxmise window");
        }
    }

    public void setScreenDimensions() throws Exception {
        try {
            String thisDevice = System.getenv("DEVICE");
            if(thisDevice.equals("Tablet")){
                Dimension dimension = new Dimension(768, 946);
                driver.manage().window().setSize(dimension);
                System.out.println("Set tablet width");
            }
            if(thisDevice.equals("Mobile")){
                Dimension dimension = new Dimension(375, 650);
                driver.manage().window().setSize(dimension);
                System.out.println("Set mobile width");
            }
        } catch (final Exception e) {
            System.out.println("Failed to set screen dimensions");
            throw e;
        }
    }


    public void hover(By locator) throws Exception{
        By thisLocator = locator;
        try {
            Actions builder = new Actions(driver);
            builder.moveToElement(driver.findElement(thisLocator)).perform();
            System.out.println("Hover on element");
        } catch (final Exception e) {
            System.out.println("Failed to hover on element");
            throw e;
        }
    }


    public void selectfiltertypeandvalue(String filtertype, String filtervalue) {
      //  wait(GlobalElements.filterType);
        List<WebElement> filtertypeTextfeilds = driver.findElements(GlobalElements.filterType);
        for (WebElement filtertypeTextfeild : filtertypeTextfeilds) {
            System.out.println(filtertypeTextfeild.getText());
            if (filtertypeTextfeild.getText() != null) {
                if (filtertypeTextfeild.getText().equals(filtertype)) {
                    List<WebElement> filtervalueTextfeilds = driver.findElements(GlobalElements.filtervalue);
                    for (WebElement filtervalueTextfeild : filtervalueTextfeilds) {
                        System.out.println(filtervalueTextfeild.getText());
                        if (filtervalueTextfeild.getText().contains(filtervalue)) {
                            filtervalueTextfeild.click();
                            driver.findElement(GlobalElements.filterbutton).click();
                            break;
                        }
                    }
                }
            /*    else if (filtertypeTextfeild.getAttribute("aria-expanded").equals("false") && filtertypeTextfeild.getText().equals(filtertype)) {
                    filtertypeTextfeild.click();
                    List<WebElement> filtervalueTextfeilds = driver.findElements(GlobalElements.filtervalue);
                    for (WebElement filtervalueTextfeild : filtervalueTextfeilds) {
                        if (filtervalueTextfeild.getText().equals(filtervalue))
                            filtervalueTextfeild.click();
                    }

                }
          */  }
        }
    }
    public void selectproduct(String producttype) {
        List<WebElement> producttypeTextfeilds = driver.findElements(GlobalElements.selectproduct);
        for (WebElement producttypeTextfeild : producttypeTextfeilds) {
            System.out.println(producttypeTextfeild.getText());
            //     if (producttypeTextfeild.getText() != null) {
            if (producttypeTextfeild.getText().equals(producttype)) {
                producttypeTextfeild.click();
                break;
            }
        }
        // }
    }

}



