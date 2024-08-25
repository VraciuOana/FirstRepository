package session_5_advanced_flow_control;

public class Main {

    public static void main(String[] args){

        whileExampleWithContinue();
    }
    private static void whileExampleWithContinue() {
        int i = 0;
        int sum = 0;

        while (i <= 4) {
            if (i == 3) {
                i++;
                continue;
            }
            sum += i;
            i++;
        }
        System.out.println("Sum = " +sum);
    }

}
