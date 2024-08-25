package session_4_java_op_decision;

import java.util.Scanner;

public class ComparareNr {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numar = ");
        int a = scanner.nextInt();

        System.out.println("Numar = ");
        int b = scanner.nextInt();

        System.out.println("Numar = ");
        int c = scanner.nextInt();

//        if (a > b) {
//                if (a > c) {
//                    System.out.println("Cel mai mare numar = " + a);
//                } else {
//                    System.out.println("Cel mai mare numar = " + c);
//                }}
//        else{
//                if (b > c) {
//                    System.out.println("Cel mai mare numar = " + b);
//                } else {
//                    System.out.println("Cel mai mare numar = " + c);
//                }
//            }
         int max = (a > b) ? ((a>c)? a : c) : ((b > c)? b : c);
        System.out.println("Max = " +max);
            }
        }



