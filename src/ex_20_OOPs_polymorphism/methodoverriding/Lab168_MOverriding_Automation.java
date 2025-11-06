package ex_20_OOPs_polymorphism.methodoverriding;

public class Lab168_MOverriding_Automation {
    static void main(String[] args) {

        ChromeTC c1 = new ChromeTC();
        c1.openBrowser();
        commonToAll commonToAll = new commonToAll();
        commonToAll.openBrowser();

        //Dynamic dispatch
        commonToAll c2 = new ChromeTC();
        c2.openBrowser();

        commonToAll c3 = new FirefoxTC();
        c3.openBrowser();
    }

    static class commonToAll{
        void openBrowser(){

            System.out.println("Starting the IE browser");

        }
    }
    static class ChromeTC extends  commonToAll
    {
        void openBrowser()
        {
            System.out.println("Starting Chrome, Better Browser");
        }
    }
    static class FirefoxTC extends  commonToAll
    {
        void openBrowser()
        {
            System.out.println("Starting Firefox, Better Browser");
        }
    }
}
