package session_4_java_op_decision;

import java.util.Scanner;

public class FactoriPrimi {
    public static void printPrimeFactors(int nr){
        int e;

        for (e = 2; nr != 1; e++){
            if(nr % e == 0)
                System.out.println(e);
            for (; nr % e ==0;)
                nr /= e;

        }
    }

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        int nr;

        System.out.println("nr =");
        nr = inputScanner.nextInt();

        printPrimeFactors(nr);
    }
}
