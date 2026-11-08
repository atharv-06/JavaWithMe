
package JavaBasics_01;

// Array in Java

public class Array07 {

    public static void main(String[] args) {

        // 1. Array Declaration
        int[] numbers;

        // 2. Array Definition / Creation
        numbers = new int[5];

        // 3. Array Initialization using index
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // 4. Initialization using Array Literal
        int[] marks = {80, 85, 90, 75, 95};

        // 5. Access Array Elements
        System.out.println("First Element: " + numbers[0]);

        // 6. Update Array Elements
        numbers[1] = 100;
        System.out.println("Updated Element: " + numbers[1]);

        // 7. Traverse Array
        System.out.println("\nArray Elements:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // 8. Size of Array
        System.out.println("\nArray Size: " + numbers.length);

        // 9. Primitive Array
        int[] age = {20, 25, 30};

        System.out.println("\nPrimitive Array:");
        for (int a : age) {
            System.out.println(a);
        }

        // 10. Non-Primitive Array (String)
        String[] names = {"Rahul", "Amit", "Priya"};

        System.out.println("\nString Array:");
        for (String name : names) {
            System.out.println(name);
        }

        // 11. Arrays of Objects
        Student[] students = {
            new Student("Rahul"),
            new Student("Amit"),
            new Student("Priya")
        };

        System.out.println("\nArray of Objects:");
        for (Student s : students) {
            System.out.println(s.name);
        }

        // 12. Passing Array to Method
        System.out.println("\nPassing Array to Method:");
        displayArray(marks);

    }

    // Method to display array elements
    public static void displayArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}

// Student Class
class Student {

    String name;

    Student(String name) {
        this.name = name;
    }

}
