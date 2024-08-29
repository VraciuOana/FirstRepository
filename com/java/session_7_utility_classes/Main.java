package session_7_utility_classes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main (String[] args){

        demonstrateDateTimeOperations();
    }

    private static void demonstrateDateTimeOperations(){
        System.out.println("===");

        LocalDate today = LocalDate.now();
        System.out.println("Today's date = " +today);
        LocalDate tenDatesLater = today.plusDays(10);
        System.out.println("Date after 10 days = " +tenDatesLater);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date and time: " +currentDateTime);
        LocalDateTime futuredatetime = currentDateTime.plusHours(5).plusMinutes(30);
        System.out.println("5 h and 30 min later:" +futuredatetime);

        //parsing
        String dateTimeString = "2025-01-01 10:30";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm");

    }

    
}
