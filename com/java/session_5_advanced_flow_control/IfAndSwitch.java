package session_5_advanced_flow_control;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IfAndSwitch {
    public static void main(String[] args) {

//        dayfOfWeekWithIf();
//        daysOfWeekWithSwitch();

//    for(ZileleSaptamanii zi : ZileleSaptamanii.values()) {
//        System.out.println(zi);
//    }

//    ZileleSaptamanii duminica = ZileleSaptamanii.DUMINICA;
//
//    switch (duminica) {
//       case LUNI, MARTI, MIERCURI, JOI, VINERI -> System.out.println("Nu e weekend!");
//        default -> System.out.println("E weekend!");


//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        for (int i : array) {
//            if (i % 2 ==0)
//                continue;
//            System.out.println("NR: " +i);

        int[] array = {1, 2, 3, 4, 4 , 6, 7, 8, 9, 10};
        System.out.println(FindInArray(5, array));;
        }



    public static void dayfOfWeekWithIf() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce day of week (1-7):");
        int day = scanner.nextInt();

        if (day == 1) {
            System.out.println("Luni");
        } else if (day == 2) {
            System.out.println("Marti");
        } else if (day == 3) {
            System.out.println("Miercuri");
        } else if (day == 4) {
            System.out.println("Joi");
        } else if (day == 5) {
            System.out.println("Vineri");
        } else if (day == 6) {
            System.out.println("Sambata");
        } else if (day == 7) {
            System.out.println("Duminica");
        } else {
            System.out.println("Invalid");
        }
    }

    public static void daysOfWeekWithSwitch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introducere day of the week (1-7):");
        int day = scanner.nextInt();

        switch (day) {
            case 1 -> System.out.println("Luni");
            case 2 -> System.out.println("Marti");
            case 3 -> System.out.println("Miercuri");
            case 4 -> System.out.println("Joi");
            case 5 -> System.out.println("Vineri");
            case 6 -> System.out.println("Sambata");
            case 7 -> System.out.println("Duminica");
            default -> System.out.println("Invalid");
        }
    }

    private static boolean FindInArray(int value, int[] array) {
        for (int i : array){
            if (i ==value)
                return true;
        }
        return false;




    }
}


