package Modulo03.DatasEHoras;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program2 {
    public static void main(String[] args) {

        Instant instant1 = Instant.parse("2024-08-28T20:10:00Z");
        LocalDate localDate = LocalDate.ofInstant(instant1, ZoneId.systemDefault());
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant1, ZoneId.of("America/Sao_Paulo"));

        System.out.println("Instant -> LocalDate: " + localDate);
        System.out.println("LocalDateTime local = " + localDateTime);
        System.out.println();

        LocalDate date = LocalDate.parse("2024-08-28");

        System.out.println("LocalDate -> " + date);
        System.out.println("Ano -> " + date.getYear());
        System.out.println("Mês -> " + date.getMonth());
        System.out.println("Dia do mês -> " + date.getDayOfMonth());
        System.out.println("Dia da semana -> " + date.getDayOfWeek());
        System.out.println("Dia do ano -> " + date.getDayOfYear());

        System.out.println();

        // As operações acima também estão disponíveis para LocalDateTime
        LocalDateTime dateTime = LocalDateTime.parse("2024-08-28T16:38:00");

        System.out.println("LocalDateTime -> " + dateTime);
        System.out.println("Hora -> " + dateTime.getHour());
        System.out.println("Minutos -> " + dateTime.getMinute());
        System.out.println("Segundos -> " + dateTime.getSecond());
    }
}
