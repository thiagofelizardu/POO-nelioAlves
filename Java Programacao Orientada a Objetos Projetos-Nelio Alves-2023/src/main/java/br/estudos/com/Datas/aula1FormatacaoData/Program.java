package br.estudos.com.Datas.aula1FormatacaoData;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

    public static void main(String[] args) {
        // sem minutos
        LocalDate d01 = LocalDate.now();

        //com minutos
        LocalDateTime d02 = LocalDateTime.now();

        // padrao gmt
        Instant d03 = Instant.now();

        //pegando ISO8601(padrao java)  passando para data
        LocalDate d04 = LocalDate.parse("2023-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2023-07-20T01:30:24");
        Instant d06 = Instant.parse("2023-07-20T01:30:24Z");

        //gmt no horario de SP
        Instant d07 = Instant.parse("2023-07-20T01:30:24-03:00");

        //fomartando uma data para String
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d08 =  LocalDate.parse("20/07/2024",fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2024 01:30" , DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        LocalDate d10 = LocalDate.of(2024,7,12);
        LocalDateTime d11 = LocalDateTime.of(2001,7,20,1,30);
        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d07);
        System.out.println(d08);
        System.out.println(d09);
        System.out.println(d10);
        System.out.println(d11.toString());
    }
}
