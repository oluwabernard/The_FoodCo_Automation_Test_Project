package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;
    public DashboardPage(WebDriver driver) {
        this.driver= driver;
    }
    private By HOUSEHOLDButton=By.xpath("//*[@id=\"nav-menu-item-3339\"]/a");
    //locate HOUSEHOLD Text element and click


    public HouseHoldPage clickHOUSEHOLD()throws InterruptedException{
        Thread.sleep(3000);
        driver.findElement(HOUSEHOLDButton).click();
        return new HouseHoldPage(driver);

    }








}
