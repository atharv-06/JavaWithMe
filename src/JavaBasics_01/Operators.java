/*In Java, operators are special symbols used to perform operations on variables and values.*/


package JavaBasics_01;

public class Operators {
	public static void main(String args[]) {
		/*1. Arithmetic Operators(+, -, *, /, %)
			Arithmetic Operators are used to perform arithmetic operations on primitive numeric data types such as int, float, and double.*/
		
		int a = 10, b = 3;
		
		// Addition
        int sum = a + b;
        
        // Subtraction
        int diff = a - b;
        
        // Multiplication
        int mul = a * b;
        
        // Division
        int div = a / b;
        
        // Modulus
        int mod = a % b;      // Modulus

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
        System.out.println("Modulus: " + mod);
        
        
       /*2. Unary Operators
		    Unary Operators need only one operand. They are used to increment, decrement, or negate a value. */
        
       // Integer declared
       int g = 10;
       int h = 10;

       // Using unary operators
       System.out.println("Postincrement : " + (g++));		//Post-increment (a++) returns the value first, then increments it.
       System.out.println("Preincrement : " + (++g));		//Pre-increment (++a) increments first, then returns the updated value.

       System.out.println("Postdecrement : " + (h--));		//Same behavior applies to decrement operators (--).
       System.out.println("Predecrement : " + (--h));
        
        /*3. Assignment Operator
T			he assignment operator assigns a value from the right-hand side to a variable on the left. Since it has right-to-left associativity,
 			the right-hand value must be declared or constant. 
 			Compound operators like +=, *=, -=, /=, %= perform operation and assignment together.
        */
       
    // initial value
       int num = 10; 
       System.out.println("Initial: " + num);

       // add 5 → num = num + 5
       num += 5;
       System.out.println("After +5: " + num);

       // multiply by 2 → num = num * 2
       num *= 2;  
       System.out.println("After *2: " + num);

       // subtract 5 → num = num - 5
       num -= 5;
       System.out.println("After -5: " + num);

       // divide by 2 → num = num / 2
       num /= 2;
       System.out.println("After /2: " + num);

       // remainder after dividing by 3 → num = num % 3
       num %= 3;
       System.out.println("After %3: " + num);
       
       /*4. Relational Operators( >, <, >=, <=, ==, != )
			Relational Operators are used to check for relations like equality, greater than, and less than.
			They return boolean results after the comparison and are extensively used in looping statements 
			as well as conditional if-else statements.  
        
        Operators like >, <, >=, <=, ==, != return boolean values.

        */
       
    // Comparison operators
       int p = 10;
       int q = 3;
       int r = 5;

       System.out.println("p > q: " + (p > q));
       System.out.println("p < q: " + (p < q));
       System.out.println("p >= q: " + (p >= q));
       System.out.println("p <= q: " + (p <= q));
       System.out.println("p == r: " + (p == r));
       System.out.println("p != r: " + (p != r));
       
       /*5. Logical Operators
			Logical Operators are used to perform "logical AND" and "logical OR" operations, similar to AND gate and OR gate 
			in digital electronics. They have a short-circuiting effect, meaning the second condition is not evaluated if the first is false
			
			Boolean variables x and y are used to perform logical operations.
			&& (AND) returns true only if both conditions are true.
			|| (OR) returns true if at least one condition is true.
			! (NOT) reverses the boolean value.
			*/
       
    // Logical operators
       boolean x = true;
       boolean y = false;
     
       System.out.println("x && y: " + (x && y));
       System.out.println("x || y: " + (x || y));
       System.out.println("!x: " + (!x));
       
       /*6. Ternary operator
T		he Ternary Operator is a shorthand version of the if-else statement. It has three operands and hence the name Ternary. The general format is,
		Syntax: (condition) ? value1 : value2.
        */
       
       int e = 20, f = 10, i = 30, result;

       // result holds max of three
       // numbers
       result = ((e > f) ? (e > i) ? e : i : (f > i) ? f : i);
       System.out.println("Max of three numbers = "+ result);
       
       /*7. Bitwise Operators
		These operators perform operations at the bit level.

		Bitwise Operators manipulate individual bits using AND, OR, XOR, and NOT.
		Shift Operators move bits to the left or right, effectively multiplying or dividing by powers of two.
		
		Binary values d and e are used to perform bit-level operations.
		Operators like &, |, ^, ~ manipulate individual bits.
		Shift operators (<<, >>, >>>) move bits left or right.
		These operations are useful in low-level programming and optimizations.
		
		*/
       
    // Bitwise operators
       int j = 0b1010;
       int k = 0b1100;
     
       System.out.println("j & k : " + (j & k));
       System.out.println("j | k : " + (j | k));
       System.out.println("j ^ k : " + (j ^ k));
       System.out.println("~j : " + (~j));
       System.out.println("j << 2 : " + (j<< 2));
       System.out.println("k >> 1 : " + (k >> 1));
       System.out.println("k >>> 1 : " + (k >>> 1));
       
       
       /*8. instanceof Operator
		The instanceof operator is used for type checking. It can be used to test if an object is an instance of a class, 
		a subclass, or an interface. The general format,  
		
		The instanceof operator checks the type of an object at runtime.
		It returns true if the object belongs to a specific class or type.
		str instanceof String confirms the type of the string object.
		It helps ensure type safety and avoid runtime errors.
		*/
       
       String str = "Hello";
       System.out.println(str instanceof String); 

       Object obj = 10; 
       System.out.println(obj instanceof Integer); 
       System.out.println(obj instanceof String);  
	}
}
