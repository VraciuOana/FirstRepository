package session_5_advanced_flow_control;

import java.util.Scanner;

public class IfAndSwitch {
    public static void main(String[] args) {

        dayfOfWeekWithIf();

    }

    public static void dayfOfWeekWithIf(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce day of week (1-7):");
        int day = scanner.nextInt();

        if (day == 1) {
            System.out.println("Luni");
        }
        else if (day == 2) {
            System.out.println("Marti");
        }
        else if (day == 3) {
            System.out.println("Miercuri");
        }
        else if (day == 4) {
            System.out.println("Joi");
        }
        else if (day == 5) {
            System.out.println("Vineri");
        }
        else if (day == 6) {
            System.out.println("Sambata");
        }
        else if (day == 7) {
            System.out.println("Duminica");
        }
        else {
            System.out.println("Invalid");
        }
        }
    }

