package programQuestionsStatement;

//Write a program that classifies a triangle based on its side lengths
//Given three input values representing the lengths of the sides, determine
// if the triangle is equilateral (all sides are equal),
// isosceles (exactly two sides are equal), or scalene (no sides are equal).
// Use an if-else statement to classify the triangle.
// Input -> side1, side2, side3
//( int) ,  (String) -> Int
//> Output -> Eq ->  side 1 == side2 == side3 ,  Only 2 are equal iso, none - scalene
//( String out)

import java.util.Scanner;

public class Triangle_classifier {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =  sc.nextInt();
        int c = sc.nextInt();

        if(a==b && b==c)
        {
            System.out.println("equivalent triangle");
        } else if (a==b || b==c || c==a) {
            System.out.println("isosceles triangle");
        }
        else {
            System.out.println("Scalene triangle");
        }
    }
}
