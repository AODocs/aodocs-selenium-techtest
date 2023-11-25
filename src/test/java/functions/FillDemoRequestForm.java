package functions;

import org.openqa.selenium.WebDriver;

public class FillDemoRequestForm {
    public static void completeFormForTechTest(
        WebDriver driver,
        String firstName,
        String lastName,
        String yourEmail,
        String companySize
        ){
            enterFirstName(driver, firstName);
            enterLastName(driver, lastName);
            enterYourEmail(driver, yourEmail);
            selectCompanySize(driver, companySize);
    }

    public static void completeTextFieldsOnly(
        WebDriver driver,
        String firstName,
        String lastName,
        String yourEmail,
        String phoneNumber,
        String yourCompany,
        String yourMessage
        ){
            enterFirstName(driver, firstName);
            enterLastName(driver, lastName);
            enterYourCompany(driver, yourCompany);
            enterYourEmail(driver, yourEmail);
            enterPhoneNumber(driver, phoneNumber);
            enterYourMessage(driver, yourMessage);
    }

    public static void enterFirstName(WebDriver driver, String firstName){
        String firstNameSelector = "#firstname-384ed391-59a1-4016-bc91-62bb1307edb2_326";
        EnterText.viaCssSelectors(driver, firstName, firstNameSelector);
    }

    public static void enterLastName(WebDriver driver, String lastName){
        String lastNameSelector = "#lastname-384ed391-59a1-4016-bc91-62bb1307edb2_326";
        EnterText.viaCssSelectors(driver, lastName, lastNameSelector);
    }

    public static void enterLastNameAndTab(WebDriver driver, String lastName){
        String lastNameSelector = "#lastname-384ed391-59a1-4016-bc91-62bb1307edb2_326";
        EnterText.viaCssSelectorsAndTab(driver, lastName, lastNameSelector);
    }

    public static void enterYourCompany(WebDriver driver, String yourCompany){
        String yourCompanySelector = "#company-384ed391-59a1-4016-bc91-62bb1307edb2_326";
        EnterText.viaCssSelectors(driver, yourCompany, yourCompanySelector);
    }

    public static void selectCompanySize(WebDriver driver, String dropdownOption){
        String companySizeSelector = "#company_size__c-384ed391-59a1-4016-bc91-62bb1307edb2_326";
        MultiSelectOptionField.dropdownOptions(driver, companySizeSelector, dropdownOption);
    }

    public static void enterYourEmail(WebDriver driver, String yourEmail){
        String yourEmailSelector = "#email-384ed391-59a1-4016-bc91-62bb1307edb2_326";
        EnterText.viaCssSelectors(driver, yourEmail, yourEmailSelector);
    }

    public static void enterYourEmailAndTab(WebDriver driver, String yourEmail){
        String yourEmailSelector = "#email-384ed391-59a1-4016-bc91-62bb1307edb2_326";
        EnterText.viaCssSelectorsAndTab(driver, yourEmail, yourEmailSelector);
    }

    public static void enterPhoneNumber(WebDriver driver, String phoneNumber){
        String phoneNumberSelector = "#phone-384ed391-59a1-4016-bc91-62bb1307edb2_326";
        EnterText.viaCssSelectors(driver, phoneNumber, phoneNumberSelector);
    }

    public static void enterYourMessage(WebDriver driver, String yourMessage){
        String yourMessageSelector = "#your_request__c-384ed391-59a1-4016-bc91-62bb1307edb2_326";
        EnterText.viaCssSelectors(driver, yourMessage, yourMessageSelector);
    }
}
