package session_3_java_operators;

public class Homework_s3_e1 {
    public static void main(String[] args) {

        //Binary Arithmetic Operators
        //Write a Java program to take two numbers as input and display the result of addition, subtraction, multiplication, division, and modulus.
        int a = 6;
        int b = 3;

        int valA = a + b;
        System.out.println("Sum = " +valA);
        int valS = a - b;
        System.out.println("Dif = " +valS);
        int valM1 = a * b;
        System.out.println("Multip = " +valM1);
        int valD = a / b;
        System.out.println("Div = " +valD);
        int valM2 = a % b;
        System.out.println("Module = " +valM2);

        // Write a program that calculates the area of a rectangle. Take the length and breadth as inputs.
        int l = 10;
        int L = 12;

        int A = l * L;
        System.out.println("Rectangle area = " +A);

        //Unary Operators:
        //Create a Java program where you increment and decrement the same variable. Display the value of the variable after each operation.
        int d = 5;
        int increment1 =  ++d;
        System.out.println("I1 = " +increment1);
        System.out.println("d = " +d);
        int increment2 = d++;
        System.out.println("I2 = " +increment2);
        System.out.println("d = " +d);
        int decrement1 = --d;
        System.out.println("D1 = " +decrement1);
        System.out.println("d = " +d);
        int decrement2 = d--;
        System.out.println("D2 = " +decrement2);
        System.out.println("d = " +d);

        //Write a program that reverses the sign of an entered integer using unary minus operator.
        int e = 5;
        int n = -e;
        System.out.println("Negativ = " +n);

        //Logical Complement and Negation Operators:
        //Write a program to check if a number is positive or negative using logical complement operator.

        boolean f = (3 > 0)? true: false;
        System.out.println("f = " +f);

        //Write a Java program that takes two boolean inputs from a user. Apply the logical negation operator (!) to each and print the result.
        boolean z = false;
        System.out.println("Z =" +z);
        z = !z;
        System.out.println(("!Z = " +z));

        boolean y = true;
        System.out.println("Y = " +y);
        y = !y;
        System.out.println("!Y = " +y);

    }
}
