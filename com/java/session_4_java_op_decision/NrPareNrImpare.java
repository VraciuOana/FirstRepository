package session_4_java_op_decision;

import java.util.Scanner;

public class NrPareNrImpare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int nr = sc.nextInt();
        int ContorPar = 0; int ContorInpar = 0;
        for (int i = 1; i < nr; i++){
            if (i % 2 == 0) {
                ContorPar++;
            }
            else {
                ContorInpar++ ;
            }
        }
        System.out.println("Numarul = " +nr);
        System.out.println("Numere pare = " +ContorPar + "Numere inpare = " +ContorInpar);
    }
}
