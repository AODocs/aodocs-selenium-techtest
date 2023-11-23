package validations;

import org.openqa.selenium.WebDriver;

import utils.UrlResult;

public class Compare {
    public static UrlResult validateUrl(
        WebDriver driver,
        String protocol,
        String subDomain,
        String domainName,
        String topLevelDomain
        ){
        String expUrl = protocol + "://" + subDomain + "." + domainName + "." + topLevelDomain;
        
        Boolean result = false;
        if(driver.getCurrentUrl().equalsIgnoreCase(expUrl)){
            result = true;
        }

        // Return both the comparison result & the exepected URL string constructed here
        return new UrlResult(expUrl, result);
    }

}
