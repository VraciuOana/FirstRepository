package session_1_java_basics;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerClass {
    public static void main (String[] args){
        System.out.println(Arrays.toString(args));
        System.out.println("Age:" +args[0]);
        System.out.println("Name:"+args[1]);
        System.out.println("Color:"+args[2]);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert your name: ");
        String myName = scanner.nextLine();

        System.out.println("My name is" +myName);

        System.out.println("Insert x: ");
        int x = scanner.nextInt();

        System.out.println("Insert y: ");
        int y = scanner.nextInt();

        int sum = x+y;

        System.out.println("sum = " + sum);

//        ++ - increment;

//        int x = 1;
//        System.out.println("x =" + x);
//        x = x+1;
//        System.out.println("x = " + x);
//        x++;
//        System.out.println("x = " + +x);
//
//        System.out.println("x = " + ++x);
//        System.out.println("x = " + x++);
//        System.out.println("x = " + +x);

        int a,b;
        a=3;
        b=5;
        int c=a+b++;
        System.out.println("c=" + c);
        System.out.println("b=" + b);

        a--;
        System.out.println("a =" +a);
        int d = ++a + b--;
        System.out.println("d = " +d);
        scanner.close();
    }
}

