package ex_20_OOPs_polymorphism.methodoverloading;

public class Lab166_REAL_MOverloading {
    static void main(String[] args) {
        Home h1 = new Home();
        h1.task();
        h1.task("Bathroom Cleaning");

    }
    static class Home
    {
        void task()
        {
            System.out.println("Task: Cleaning Fan");
        }
        void task(String whichTask)
        {
            System.out.println("Task: " +whichTask);
        }
    }
}
