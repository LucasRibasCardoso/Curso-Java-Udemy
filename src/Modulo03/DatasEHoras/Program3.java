package Modulo03.DatasEHoras;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Program3 {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.parse("2024-08-28");

        LocalDate pastWeekLocalDate = localDate.minusDays(7);
        LocalDate pastDayLocalDate = localDate.minusDays(1);
        LocalDate nextWeekLocalDate = localDate.plusDays(7);
        LocalDate nextDayLocalDate = localDate.plusDays(2);
        System.out.println("Origin LocalDate -> " + localDate);
        System.out.println("pastWeekLocalDate: " + localDate + " -> " + pastWeekLocalDate);
        System.out.println("pastDayLocalDate:  " + localDate + " -> "+ pastDayLocalDate);
        System.out.println("nextWeekLocalDate: " + localDate + " -> " + nextWeekLocalDate);
        System.out.println("nextDayLocalDate:  " + localDate + " -> "+ nextDayLocalDate);
        System.out.println();


        LocalDateTime localDateTime = LocalDateTime.parse("2024-08-28T16:38:00");

        LocalDateTime rewind1LocalDateTime = localDateTime.minusHours(6);
        LocalDateTime rewind2LocalDateTime = localDateTime.minusMinutes(38);
        LocalDateTime future1LocalDateTime = localDateTime.plusSeconds(60);
        System.out.println("Origin LocalDateTime -> " + localDateTime);
        System.out.println("rewind1LocalDateTime: " + localDateTime + " -> " + rewind1LocalDateTime);
        System.out.println("rewind2LocalDateTime: " + localDateTime + " -> " + rewind2LocalDateTime);
        System.out.println("future1LocalDateTime: " + localDateTime + " -> " + future1LocalDateTime);
        System.out.println();


        Instant instant1 = Instant.parse("2024-08-28T16:38:00Z");

        Instant pastWeekInstant = instant1.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = instant1.plus(7, ChronoUnit.DAYS);
        System.out.println("Origin Instant: " + instant1);
        System.out.println("pastWeekInstant: " + instant1 + " -> " + pastWeekInstant);
        System.out.println("nextWeekInstant: " + instant1 + " -> " + nextWeekInstant);
        System.out.println();


        Duration durationDateTime = Duration.between(pastWeekLocalDate.atStartOfDay(), localDate.atStartOfDay());
        Duration durationLocalDateTime = Duration.between(rewind1LocalDateTime, future1LocalDateTime);
        System.out.println("Duration between pastWeekLocalDate and localDate -> " + durationDateTime.toDays());
        System.out.println("Duration between rewind1LocalDateTime and future1LocalDateTime -> " + durationLocalDateTime.toHours());
    }
}
