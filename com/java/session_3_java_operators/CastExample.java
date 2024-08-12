package session_3_java_operators;

public class CastExample {
    public static void main (String[] args) {
        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;
        long longVal2 = 513157145134615L;

        short rez1 = byteVal;

        short rez2 = (short) longVal;
        short rez3 = (short) longVal2;
        System.out.println("rez3 = " + rez3);

        float rez4 = longVal - floatVal;
        System.out.println("rez4 = " +rez4);

        int a = 2;
        int b = 3;
        int c = 4;

        a += b;
        System.out.println("A1 = " +a);
        a += b * 2;
        System.out.println("A2 = " +a);
        a += c * b - 5;
        System.out.println("A3 = " +a);

        a *= c * 2 + 2;
        System.out.println("A4 = " +a);

        b *= a-- + ++c *2;
        System.out.println("B = " +b);

    }
}
