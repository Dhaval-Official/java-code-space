package ex_25_ENUM;

public class Lab098_RealAutomation2 {
    public static void main(String[] args) {
        System.out.println(ENV.PROD.getBaseURL());
    }
}

enum ENV {

    DEV("https://dev.myapp.com"),
    STAGING("https://staging.myapp.com"),
    PROD("https://prod.myapp.com");

    private final String baseURL;

    ENV(String baseURL) {
        this.baseURL = baseURL;
    }

    String getBaseURL() {
        return this.baseURL;
    }

}