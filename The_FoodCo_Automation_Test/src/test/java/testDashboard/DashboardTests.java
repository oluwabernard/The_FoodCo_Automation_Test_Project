package testDashboard;

import Pageobject.DashboardPage;
import Pageobject.HouseHoldPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import testLogin.LoginTests;

public class DashboardTests extends LoginTests {
    By HOUSEHOLDButton=By.xpath("//*[@id=\"nav-menu-item-3339\"]/a");

    public HouseHoldPage clickHOUSEHOLD()throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(HOUSEHOLDButton).click();
        return new HouseHoldPage(driver);
    }




}
