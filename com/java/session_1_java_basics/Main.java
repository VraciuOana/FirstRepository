package session_1_java_basics;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int age; //declaration
        age = 30; //assign value

        int secondAgeValue = 30;//declaration & assign value

        System.out.println("My age:" + age);

        int x,y;
        x=5;
        y=3;

        int rezAddition = x+y;

        System.out.println("rezAddition = "+ rezAddition);

        int rezSubs = x-y;

        System.out.println("rezSubs = " + rezSubs);

        int rezDiv = x/y;

        System.out.println("rezDiv = " + rezDiv);

        int rezMod = x%y;

        System.out.println("rezMod = " + rezMod);

        String firstName = "Mihai";
        String lastName = "Pop";

        String fullName = firstName + " " + lastName;
        System.out.println("fullName = " + fullName);

        double myW = 52.3d;
        float myFloat = 12.4f;
        long myLong = 100000000000L;

        System.out.println(myW/2);

        short myShort = 3;

        int myShorInt = myShort;

        short xVAL = (short) x;

    }
}
