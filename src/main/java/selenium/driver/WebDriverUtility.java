package selenium.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class WebDriverUtility {

    public static WebDriver getWebDriver(Browser browser) {
        WebDriver webDriver;
        switch (browser) {
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                webDriver = new FirefoxDriver(getFireFoxOptions());
                break;
            case CHROME:
            default:
                WebDriverManager.chromedriver().setup();
                // hardcoded path to faciltate test code implementation
                System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
                webDriver = new ChromeDriver(getChromeOptions());
                break;
        }
        webDriver.manage().window().maximize();

        return webDriver;
    }

    public static void closeWebDriver(WebDriver webDriver) {
        if (webDriver != null)
            webDriver.quit();
    }


    private static ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        // To start chrome in english
        options.addArguments("lang=en-GB");
        // To start chrome without security warning
        options.addArguments("disable-infobars");
        // To start Google Chrome for Testing app
        // hardcoded path to faciltate test code implementation
        options.addArguments("binary=/Applications/Google Chrome for Testing");
        return options;
    }

    private static FirefoxOptions getFireFoxOptions() {
        FirefoxOptions options = new FirefoxOptions();
        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("intl.accept_languages", "en-GB");
        options.setProfile(profile);
        return options;
    }

}
