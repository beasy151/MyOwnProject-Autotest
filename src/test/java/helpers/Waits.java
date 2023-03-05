package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {
    public static void waitForJsEnds(WebDriver driver, int secondsToWait) {
        new WebDriverWait(driver, Duration.ofSeconds(secondsToWait))
                .until(ExpectedConditions.jsReturnsValue("return jQuery.active == 0"));
    }
}
