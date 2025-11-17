package ex_24_OOPs_Super_Abstraction.ex_23_OOPs_SuperKeyword;

public class Lab091_ {
    //same as Lab090
}

class BaseClass{
    private String browser;

    BaseClass() {
        System.out.println("Base class created");
    }

    BaseClass(String s) {
        System.out.println("Special Base class created "+s);
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    void openBrowser() {
        System.out.println("Opening Browser");
    }

    void openBrowser(String browserName) {
        System.out.println("Opening Browser " + browserName);
    }

    void closeBrowser() {
        System.out.println("Closing Browser");
    }

}

class TestClass extends BaseClass {

    void TestC() {

    }

    public TestClass() {
        super("Chrome");
        super.openBrowser();
        super.openBrowser("Firefox");
        super.closeBrowser();
    }

}
