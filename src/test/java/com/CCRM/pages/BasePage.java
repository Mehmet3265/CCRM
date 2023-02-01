package com.CCRM.pages;

import com.CCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//img[@class='intro-img']")
    public WebElement bookİmage;

    @FindBy(xpath = "//a[contains(@class, 'is-active')]")
    public WebElement linkMap;

    @FindBy(xpath = "//a[@class='navbar-link' and contains(text(),'schedule')]")
    public WebElement linkSchedule;

    @FindBy(xpath = "//a[@href='/schedule/my']")
    public WebElement linkScheduleMy;

    @FindBy(xpath = "//a[@href='/schedule/clusters/my']")
    public WebElement linkScheduleGeneral;

    @FindBy(xpath = "//a[@href='/hunt']")
    public WebElement linkHunt;

    @FindBy(xpath = "//a[@class='navbar-link' and contains(text(),'my')]")
    public WebElement linkMy;

    @FindBy(xpath = "//a[@href='/me']")
    public WebElement linkMySelf;

    @FindBy(xpath = "//a[@href='/team']")
    public WebElement linkMyTeam;

    @FindBy(xpath = "//a[@href='/sign-out']")
    public WebElement linkSignOut;




    public void login(String email,String password){

    }




    /*
     * Logout Method
     * */
}
