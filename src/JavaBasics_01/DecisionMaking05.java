
package JavaBasics_01;

public class DecisionMaking05 {

    public static void main(String[] args) {

        // 1. If Statement
        int age = 20;

        if (age >= 18) {
            System.out.println("You are eligible to vote");
        }

        // 2. If-Else Statement
        int number = 5;

        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        // 3. Else-If Statement
        int marks = 75;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 70) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

        // 4. Nested If Statement
        int age2 = 22;
        boolean hasLicense = true;

        if (age2 >= 18) {
            if (hasLicense) {
                System.out.println("You can drive");
            } else {
                System.out.println("You need a license");
            }
        } else {
            System.out.println("You are too young");
        }

        // 5. Switch Statement
        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Invalid Day");
        }
    }
}
