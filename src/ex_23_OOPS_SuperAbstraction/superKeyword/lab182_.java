package ex_23_OOPS_SuperAbstraction.superKeyword;

public class lab182_ {

}
class BaseClass{
    BaseClass(){
        System.out.println("DC-Parent");
    }
    BaseClass(String browser)
    {
        this.browser=browser;
        System.out.println("DC -parent" );
    }
    private String browser;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }
    void openBrowser()
    {
        System.out.println("Opening Browser!!");
    }
    void openBrowser(String browserName)
    {
        System.out.println("Open Browser!!->" + browserName);
    }
    void closeBrowser()
    {
        System.out.println("Close Browser!!");
    }

}
class TestCase extends BaseClass{

    void test(){}

    public TestCase()
    {
        //super(); //DC - default constructor
        super("chrome");//PC -parameter Constructor
        super.openBrowser();//Normal -type 1
        super.openBrowser("Chrome"); //type 3
        super.closeBrowser();//normal - type 1
        System.out.println(super.getBrowser());//getter
        super.setBrowser("firefox");//setter
    }
}
