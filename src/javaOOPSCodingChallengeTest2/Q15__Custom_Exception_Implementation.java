package javaOOPSCodingChallengeTest2;

//Create a custom exception class "InvalidAgeException" and
// throw it if age is less than 18.

//Input:
//validateAge(15) and validateAge(25)
//Output:
//InvalidAgeException: Age must be 18 or above. Provided age: 15 Age is valid: 25

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class Q15__Custom_Exception_Implementation {
    public static void ValidateAge(int age) throws InvalidAgeException {
        if (age > 18) {
            throw new InvalidAgeException("Age must be 18 or above. Provided age:" + age);
        } else {
            System.out.println("Age is valid: " + age);
        }
    }

    public static void main(String[] args) {

        try {
            ValidateAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("InvalidAgeException: " + e.getMessage());
        }

        try {

            ValidateAge(25);
        } catch (InvalidAgeException e) {
            System.out.println("InvalidAgeException: " + e.getMessage());
        }
    }
}



