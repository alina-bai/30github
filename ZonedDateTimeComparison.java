package org.example;

import java.time.ZonedDateTime;
import java.time.ZoneId;

public class ZonedDateTimeComparison {
    public static void main(String[] args) {
        ZonedDateTime nowInDubai = ZonedDateTime.now(ZoneId.of("Asia/Dubai"));
        ZonedDateTime nowInNewYork = ZonedDateTime.now(ZoneId.of("America/New_York"));

        System.out.println("Время в Дубае: " + nowInDubai);
        System.out.println("Время в Нью-Йорке: " + nowInNewYork);

        System.out.println("Дубайское время позже нью-йоркского? " + nowInDubai.isAfter(nowInNewYork));
    }
}