package session_5_advanced_flow_control;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args){

        whileExampleWithContinue();
        nestedForExample();
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

    private static void nestedForExample(){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int searchVal = 5;

        SEARCH:
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length;j++){
                if(matrix[i][j] == searchVal) {
                    System.out.println("Found it!");
                    break SEARCH;

                }
                System.out.println(matrix[i][j] + " ");
                }
            }
        System.out.println("Done!");

        }
    }


