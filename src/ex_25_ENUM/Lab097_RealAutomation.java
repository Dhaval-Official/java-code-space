package ex_25_ENUM;

public class Lab097_RealAutomation {
    public static void main(String[] args) {
        System.out.println(locators.page_input_email.getLocator());
    }
}

enum locators {
    page_input_email("//*[@id=loginName]"),
    page_input_password("//*[@id=loginPass]"),
    page_input_button("#btn");

    private String locator;

    locators(String locator) {
        this.locator = locator;
    }

    String getLocator() {
        return this.locator;
    }

}