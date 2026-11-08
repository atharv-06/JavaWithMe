/*Java data types define the type of data a variable can store in a program. They help,
 *  the compiler allocate memory efficiently and ensure type safety. 
 *  
 *  ● Java provides two main categories: 1.Primitive and 2.non-primitive data types.
 *  ● Memory allocation determines how much memory is required for each variable
 *  ● Operations support defines what operations can be performed on data
 *  ● Each data type has a default value when not initialized
 *  
 *  ● Syntax
 *  	dataType variableName = value;
 *  */



package JavaBasics_01;

public class DataTypes03 {
	public static void main(String args[]) {
		/*1. Primitive Data Types: Primitive data types store simple values directly in memory. Java provides eight primitive data types, each with a fixed size and range, which are summarized below:*/
		
		System.out.println("This Is Boolen Type");
		boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is fish tasty? " + isFishTasty);
        
        System.out.println("This Is Byte Type");
        byte age = 25;
        byte temperature = -10;
        System.out.println("Age: " + age);
        System.out.println("Temperature: " + temperature);
        
        System.out.println("This Is Short Type");
        short students = 1000;
        short temp = -200;
        System.out.println("Number's of Students: " + students);
        System.out.println("Temperature: " + temp);
        
        System.out.println("This Is Int Type");
        int population = 2000000;
        int distance = 150000000;
        System.out.println("Population: " + population);
        System.out.println("Distance: " + distance);
        
        System.out.println("This Is Long Type");
        long worldPopulation = 7800000000L;
        long lightYears = 9460730472580800L;
        System.out.println("World Population: " + worldPopulation);
        System.out.println("Light Years: " + lightYears);
        
        System.out.println("This Is Float Type");
        float pi = 3.14f;
        float gravity = 9.81f;
        System.out.println("Pi: " + pi);
        System.out.println("Gravity: " + gravity);
        
        System.out.println("This Is Double Type");
        double pi1 = 3.141592653589793;
        double avogadro = 6.02214076e23;
        System.out.println("Pi: " + pi1);
        System.out.println("Avogadro's Number: " + avogadro);
        
        System.out.println("This Is Char Type");
        char grade = 'A';
        char symbol = '$';
        System.out.println("Grade: " + grade);
        System.out.println("Symbol: " + symbol);
        
        /*2. Non-Primitive (Reference) Data Types
			Non-primitive data types store references (memory addresses) rather than actual values. They are created by users and include types like String, Class, Object, Interface, and Array.*/
		
        System.out.println("This Is String Type");
        String name = "Java";
        String message = "Welcome to Java";
        System.out.println("Name: " + name);
        System.out.println("Message: " + message);
        
        //2.Array
        //3.Class
        //4.Object
        //5.Interface
        
	}
}
