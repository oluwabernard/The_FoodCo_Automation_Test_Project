package testHouseHold;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testDashboard.DashboardTests;
import testLogin.LoginTests;

public class HouseHoldTests extends DashboardTests {
private By BathAndBed =By.className("thumb-info-wrapper");
    //locate HomeAppliance on  HouseHold page and click
@Test(priority = 2)
    public void clickBathAndBed()throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(BathAndBed).click();
    }

    //Locating The Logout element on Dashboard Using By
    private By Logout =By.xpath("//*[@id=\"nav-menu-item-6558\"]/a");
    //locate the logout element and click
@Test(priority = 3)
    public void clickLogout()throws InterruptedException{

        driver.findElement(Logout).click();
    }

    //A confirmation for Logging Out is sent to The User at this Point
    //Initiate Action,At this point the User is Logged out finally from the Website
    private By ConfirmAndLogout = By.xpath("//*[@id=\"content\"]/article/div/div/div[1]/a");
    //locate confirm and Logout Element and click

    public void clickConfirmAndLogout()throws InterruptedException{
        //Wait for 5secs Before Executing
        Thread.sleep(2000);
        driver.findElement(ConfirmAndLogout).click();}






}
