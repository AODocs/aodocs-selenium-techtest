package functions;

import org.openqa.selenium.WebDriver;

public class FillDemoRequestForm {
    public static void enterFirstNameAndTab(WebDriver driver, String firstName){
        String firstNameSelector = "input[id*='firstname']";
        EnterText.viaCssSelectorsAndTab(driver, firstName, firstNameSelector);
    }

    public static void enterLastNameAndTab(WebDriver driver, String lastName){
        String lastNameSelector = "input[id*='lastname']";
        EnterText.viaCssSelectorsAndTab(driver, lastName, lastNameSelector);
    }

    public static void selectCompanySize(WebDriver driver, String dropdownOption){
        String companySizeSelector = "select[id*='company_size']";
        MultiSelectOptionField.dropdownOptions(driver, companySizeSelector, dropdownOption);
    }

    public static void enterYourEmailAndTab(WebDriver driver, String yourEmail){
        String yourEmailSelector = "input[id*='email']";
        EnterText.viaCssSelectorsAndTab(driver, yourEmail, yourEmailSelector);
    }
}
