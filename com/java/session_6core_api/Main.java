package session_6core_api;

import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello world!");
        System.out.println("Revers: " + sb.reverse().toString());

        String[] words = {"Sam", "Ion", "Dan", "Bob"};
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            stringBuilder.append(word).append(" ");

        }
        System.out.println("Concatenated string: " +stringBuilder.toString());

        StringJoiner stringJoiner = new StringJoiner(" ", "[", "]");
        for (String word : words){
            stringJoiner.add(word);
        }
        System.out.println("Concatenated string: " +stringJoiner.toString());


//        String str = "Hello World!";
//        String str1 = "Hello World!";
//
//        System.out.println("str == str2 " + (str == str1));
    }
}
