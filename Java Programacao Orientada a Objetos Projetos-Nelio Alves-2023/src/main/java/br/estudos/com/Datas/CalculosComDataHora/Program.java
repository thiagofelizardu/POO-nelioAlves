package br.estudos.com.Datas.CalculosComDataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {
    public static void main(String[] args) {
        LocalDate d01 =  LocalDate.parse("2023-07-20");
        LocalDateTime d02 =  LocalDateTime.parse("2023-07-20T01:30:24");
        Instant d03 = Instant.parse("2023-07-20T01:30:24Z");

        LocalDate pastWeekLocalDate = d01.minusDays(7);
        LocalDate nextWeekLocalDate = d01.plusYears(7);

        LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d02.plusYears(7);

        Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);

//        System.out.println(nextWeekLocalDate);
//        System.out.println(pastWeekLocalDate);
//        System.out.println(nextWeekLocalDateTime);
//        System.out.println(pastWeekLocalDateTime);
//        System.out.println(pastWeekInstant);
//        System.out.println(nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDateTime, d02);
        System.out.println(t1.toDays());
    }
}
