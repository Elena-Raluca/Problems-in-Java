package main;

import enums.DateFormatter;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.of(2023, 10, 26);
        DateFormatter date = new DateFormatter();
        System.out.println(date.getDay(localDate1));
        System.out.println(date.getMonth(localDate1));
        System.out.println(date.getYear(localDate1));
    }
}