package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HouseHoldPage {
    private WebDriver driver;
    public HouseHoldPage(WebDriver driver) {
        this.driver = driver;
    }
    private By BathAndBed =By.className("thumb-info-wrapper");
    private By Towel1 =By.xpath("//*[@id=\"content\"]/div[3]/ul/li[1]/div/div[1]/a/div/img");
    private By Towel2 =By.xpath("//*[@id=\"content\"]/div[3]/ul/li[2]/div/div[1]/a/div/img");
    private By Towel3 =By.xpath("//*[@id=\"content\"]/div[3]/ul/li[3]/div/div[1]/a/div/img");
    private By LogoutButton =By.xpath("//*[@id=\"nav-menu-item-6558\"]/a");
    private By ConfirmAndLogout = By.xpath("//*[@id=\"content\"]/article/div/div/div[1]/a");


    //confirm the HouseHold URL
    public String getHouseHoldPageUrl() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
// wait Untill Url Is Visible
        wait.until(ExpectedConditions.urlToBe("https://foodco.ng/product-category/household/"));
        return driver.getCurrentUrl();
    }
    //locate HomeAppliance on  HouseHold page and click
    public void clickBathAndBed()throws InterruptedException{
        Thread.sleep(3000);
        driver.findElement(BathAndBed).click();
    }



    //Locating The Logout element on Dashboard Using By

    //locate the logout element and click
    public DashboardPage clickLogout()throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(LogoutButton).click();
    return new DashboardPage(driver);
    }
    public void clickConfirmAndLogout()throws InterruptedException{
        //Wait for 5secs Before Executing
        Thread.sleep(5000);
        driver.findElement(ConfirmAndLogout).click();}

}
