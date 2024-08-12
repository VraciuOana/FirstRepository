package session_3_java_operators;

public class Main {
    public static void main(String[] argd) {
        int valA = 21;
        int valB = 6;
        int valC = 3;
        int valD = 1;

        int rez1 = valA - valB / valC;
        System.out.println("Rez 1 = " + rez1);

        int rez2 = (valA - valB) / valC;
        System.out.println("Rez 2 = " + rez2);

        int rez3 = valA / valC * valD + valB;
        System.out.println("Rez 3 = " + rez3);

        int rez4 = valA / (valC * (valD + valB));
        System.out.println("Rez 4 = " + rez4);
    }
}
