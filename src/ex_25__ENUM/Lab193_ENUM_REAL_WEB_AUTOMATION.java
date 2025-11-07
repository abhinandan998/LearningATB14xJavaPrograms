package ex_25__ENUM;

public class Lab193_ENUM_REAL_WEB_AUTOMATION {
    static void main(String[] args) {

        System.out.println(Locators.page_input_email.getLocator());
        System.out.println(Locators.page_input_password.getLocator());
        System.out.println(Locators.page_button.getLocator());
    }
}
enum Locators
{
    page_input_email("//*[@id=\"login-username\"]"),
    page_input_password("//*[@id=\"login-password\"]"),
    page_button("#btn");

    private String locator;
    Locators(String locator) {
        this.locator = locator;
    }
    String getLocator()
    {
        return this.locator;
    }
}