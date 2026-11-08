/*Java Methods are blocks of code that perform a specific task. 
 * A method allows us to reuse code, improving both efficiency 
 * and organization. All methods in Java must belong to a class. Methods are similar to functions and expose the behavior of objects.
 * A method allows to write a piece of logic once and reuse it wherever needed in the program.
Helps to keep your code clean, organized, easier to understand and manage.
 */


package JavaBasics_01;


// Types of Methods in Java

public class Method06 {

    // 1. Without Parameter and Without Return Value
    public static void printMessage() {

        System.out.println("Hello, Javaaa!");

    }

    // 2. With Parameter and Without Return Value
    public static void add(int a, int b) {

        System.out.println("Addition: " + (a + b));

    }

    // 3. Without Parameter and With Return Value
    public static int getNumber() {

        return 100;

    }

    // 4. With Parameter and With Return Value
    public static int multiply(int a, int b) {

        return a * b;

    }

    // 5. Non-static Method (Object Required)
    public void display() {

        System.out.println("This is a Non-static Method");

    }

    public static void main(String[] args) {

        // Calling Static Method without object
        printMessage();

        // Calling method with parameters
        add(10, 20);

        // Calling method with return value
        int num = getNumber();
        System.out.println("Number: " + num);

        // Calling method with parameter and return value
        int result = multiply(5, 4);
        System.out.println("Multiplication: " + result);

        // Creating object to call Non-static method
        Method06 obj = new Method06();

        obj.display();

    }
}
