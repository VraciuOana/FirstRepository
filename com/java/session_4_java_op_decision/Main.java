package session_4_java_op_decision;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
//        sum (5,6);
//
//        Main main = new Main ();
//        int x = main.sum2 (3,6);
//        equality();
        objectEquality();
    }

    private static void objectEquality(){
        Person pers1 = new Person("Sam");
        Person pers2 = new Person ("Ion");

        Person pers3 = pers1;


        System.out.println(pers1 == pers2); //false
        System.out.println(pers1 ==  pers3);
    }
    private static void equality(){
        int a = 5;
        int b = 10;

        System.out.println(a == b); //false
        System.out.println(a != b); //true
    }

    private static void sum(int a, int b)  {
        System.out.println("Sum:" + (a + b));
    }

    public int sum2(int a, int b){
       return a + b;
        }
}

class Person{
    String name; //field

    Person(String name){ //constructor
        this.name = name; //parametru
    }
}

