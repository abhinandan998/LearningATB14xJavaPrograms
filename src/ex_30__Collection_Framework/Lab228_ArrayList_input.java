package ex_30__Collection_Framework;

import java.util.*;

public class Lab228_ArrayList_input {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String continueInput = "Y";
        List<String> names = new ArrayList<>();
        while (continueInput.equalsIgnoreCase("Y")) {
            System.out.println("Enter the name");
            String name = sc.next();
            names.add(name);
            sc.nextLine();

            System.out.println("Do you want to enter another name: ");
            continueInput = sc.nextLine();
        }
        for (String name : names) {
            System.out.println(name);
        }
        sc.close();
    }
}
