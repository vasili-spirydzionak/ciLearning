package com.epam.pages;

import com.google.common.base.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.concurrent.TimeUnit;

public class StartPage extends AbstractPage {

    private static WebDriver driver;

    private static By input = By.id("lst-ib");
    private static By submitBtn = By.name("btnK");

    public StartPage() {
        super();
        this.driver = getInstance();
    }

    public StartPage openPage() {
        driver.get("https://www.google.com/");
        new FluentWait<WebDriver>(driver)
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(1, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class)
                .until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(input);
            }
        });

        return this;
    }

    public StartPage enterText(String text) {
        driver.findElement(input).sendKeys(text);
        return this;
    }

    public StartPage submitSearch() {
        driver.findElement(submitBtn).submit();
        return this;
    }

}
