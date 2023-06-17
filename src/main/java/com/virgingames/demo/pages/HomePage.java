package com.virgingames.demo.pages;

import com.virgingames.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome to Virgin Games']")
    WebElement welcomeText;



    public String verifyWelcomeText() {
        String message1 = getTextFromElement(welcomeText);
        log.info("Welcome message :" + welcomeText.getText());
        return getTextFromElement(welcomeText);

    }
}