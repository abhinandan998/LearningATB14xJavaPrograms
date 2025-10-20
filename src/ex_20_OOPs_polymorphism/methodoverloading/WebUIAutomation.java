package ex_20_OOPs_polymorphism.methodoverloading;

public class WebUIAutomation {
    static void main(String[] args) {
        Browser b1 = new Browser();
        b1.startBrowser();
        b1.startBrowser("chrome");
        b1.startBrowser("firefox");
    }

}
class Browser{

    void startBrowser()
    {
        System.out.println("Default browser is started");
    }
    void startBrowser(String browser)
    {
        System.out.println("Starting browser:" +browser);
    }
}
