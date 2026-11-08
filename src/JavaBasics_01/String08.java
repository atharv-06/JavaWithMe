
package JavaBasics_01;

// Java Strings

public class String08 {

    public static void main(String[] args) {

        // 1. String Declaration and Initialization
        String name = "Rahul";

        System.out.println("Name: " + name);

        // 2. Creating String using new keyword
        String city = new String("Pune");

        System.out.println("City: " + city);

        // 3. Concatenation (Joining Strings)
        String firstName = "Rahul";
        String lastName = "Kumar";

        String fullName = firstName + " " + lastName;

        System.out.println("Full Name: " + fullName);

        // 4. String Length
        System.out.println("Length: " + name.length());

        // 5. Access Character
        System.out.println("First Character: " + name.charAt(0));

        // 6. Convert to Uppercase
        System.out.println("Uppercase: " + name.toUpperCase());

        // 7. Convert to Lowercase
        System.out.println("Lowercase: " + name.toLowerCase());

        // 8. Compare Strings using equals()
        String a = "Java";
        String b = "Java";

        System.out.println("Equals: " + a.equals(b));

        // 9. Compare Strings using equalsIgnoreCase()
        String x = "JAVA";
        String y = "java";

        System.out.println("Ignore Case: " + x.equalsIgnoreCase(y));

        // 10. Contains
        String message = "Welcome to Java";

        System.out.println("Contains: " + message.contains("Java"));

        // 11. Starts With
        System.out.println("Starts With: " + message.startsWith("Welcome"));

        // 12. Ends With
        System.out.println("Ends With: " + message.endsWith("Java"));

        // 13. Substring
        System.out.println("Substring: " + message.substring(11));

        // 14. Replace
        System.out.println("Replace: " + message.replace("Java", "Python"));

        // 15. Remove Extra Spaces
        String text = "  Hello Java  ";

        System.out.println("Trim: " + text.trim());

        // 16. Check Empty String
        String empty = "";

        System.out.println("Is Empty: " + empty.isEmpty());

        // 17. String Immutability
        String s = "Hello";

        s.concat(" Java");

        System.out.println("Original String: " + s);

        s = s.concat(" Java");

        System.out.println("Updated String: " + s);

    }
}
