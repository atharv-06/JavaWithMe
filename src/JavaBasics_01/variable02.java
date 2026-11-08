/*In Java, a variable is a container used to store data or information in a program.
 * Whenever we want to store a value such as a name, age, salary, or marks, we use variables.
 * Syntax of a Variable
	dataType variableName = value;
	
	● Data Type: Specifies the type of data a variable can store, such as int, double, or String.
	● Variable Name: Identifies the variable and must follow Java identifier rules.
	● Value (Optional): Can be assigned during declaration or later in the program.
	*/


package JavaBasics_01;

public class variable02 {
	public static void main(String args[]) {
		// Declaring and initializing variables
        
        // Integer variable  
        int age = 25;       
        
        // String variable  
        String name = "Welcome To Java"; 
        
        // Double variable 
        double salary = 50000.50;     

        // Displaying the values of variables
        System.out.println("Age: " + age);          
        System.out.println("Name: " + name);        
        System.out.println("Salary: " + salary);
	}
}
