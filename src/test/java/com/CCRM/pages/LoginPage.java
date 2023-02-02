package com.CCRM.pages;

import com.CCRM.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@class='button is-dark']")
    public WebElement loginButton;

    @FindBy(xpath = "//h1[@class='title']")
    public WebElement mapInHomePage;

    @FindBy(xpath = "//img[@src='assets/images/bookit.png']")
    public WebElement mapInHomePageImg;

    public void login(String email, String password) {
        emailBox.sendKeys(email);
        passwordBox.sendKeys(password);
        loginButton.click();
    }


}
