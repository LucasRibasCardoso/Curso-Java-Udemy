package Modulo03.DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program1 {
    public static void main(String[] args) {

        // Instanciações de Objetos Data-Hora
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        Instant instant = Instant.now();

        System.out.println("Local Date: " + localDate);
        System.out.println("Local Date Time: " + localDateTime);
        System.out.println("Instant: " + instant);

        // String para Objetos Data-Hora
        LocalDate localDateParse = LocalDate.parse("2024-08-27");
        LocalDateTime localDateTimeParse = LocalDateTime.parse("2024-08-27T18:26:00");
        Instant instantParse = Instant.parse("2024-08-27T18:26:00Z");

        Instant instantParse2 = Instant.parse("2024-08-27T18:26:00-03:00");

        System.out.println("Local Date Parse: " + localDateParse);
        System.out.println("Local Date Time Parse: " + localDateTimeParse);
        System.out.println("Instant Parse: " + instantParse);
        System.out.println("Instant Parse 2: " + instantParse2);
        System.out.println();

        // Formatar data
        DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDateFormat = LocalDate.parse("27/08/2024", datePattern);

        DateTimeFormatter dateTimePattern = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime localDateTimeFormat = LocalDateTime.parse("27/08/2024 18:26:00", dateTimePattern);

        LocalDate localDateSeparated = LocalDate.of(2024, 8, 27);
        LocalDateTime localDateTimeSeparated = LocalDateTime.of(2024, 8, 27, 18, 26, 0);

        System.out.println("Local Date Format: " + localDateFormat);
        System.out.println("Local Date Time Format: " + localDateTimeFormat);
        System.out.println("Local Date Separated: " + localDateSeparated);
        System.out.println("Local DateTime Separated: " + localDateTimeSeparated);
        System.out.println();

        // Formatando de objeto para String
        LocalDate date1 = LocalDate.parse("2024-08-27");
        LocalDateTime date2 = LocalDateTime.parse("2024-08-27T18:26:00");
        Instant date3 = Instant.parse("2024-08-27T18:26:00Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("date1 = " + date1.format(fmt1));

        System.out.println("date2 = " + date2.format(fmt1));
        System.out.println("date2 = " + date2.format(fmt2));
        System.out.println("date2 = " + date2.format(fmt4));

        System.out.println("date3 = " + fmt3.format(date3));
        System.out.println("date3 = " + fmt5.format(date3));
    }
}
