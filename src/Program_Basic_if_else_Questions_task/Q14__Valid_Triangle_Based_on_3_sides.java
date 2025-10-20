package Program_Basic_if_else_Questions_task;

import java.util.Scanner;

//14) Check if a Triangle is Valid Based on Three Sides.
public class Q14__Valid_Triangle_Based_on_3_sides {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2: ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3: ");
        double side3 = sc.nextDouble();

        // Check triangle validity using the triangle inequality theorem
        if ((side1 + side2 > side3) &&
                (side1 + side3 > side2) &&
                (side2 + side3 > side1)) {

            System.out.println(" The triangle is valid.");
        } else {
            System.out.println(" The triangle is NOT valid.");
        }
    }
}
