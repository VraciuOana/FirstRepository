package session_3_java_operators;

public class LogicOperators {
    public static void main(String[] args) {
        boolean boolVal = false;
        System.out.println("boolVal = " +boolVal);

        System.out.println(!boolVal);

        int a = !(3 < 5)? 4 : 5;
        System.out.println("a = " +a);
        String name = "Sam";
        int age = name.equals("Sam")? 30 : 40;
        System.out.println("Sam has " + age + " years");

        int valA = 3;
        int valB = 3;

        if (valA < valB) {
            System.out.println("First number is less than second one");
        } else if (valB > valB) {
            System.out.println("Second number is less than first one");
        } else {
            System.out.println("Number are equals!");
        }
    }
}
