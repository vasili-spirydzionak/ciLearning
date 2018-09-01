package com.epam.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbstractPage {

    AbstractPage() {
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
    }

    public static WebDriver getInstance() {
        return WebDriverProvider.INSTANCE;
    }

    private static class WebDriverProvider {
        private static final WebDriver INSTANCE = new ChromeDriver();
    }

}
