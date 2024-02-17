package br.estudos.com.Datas.DataGlobalParaLocal;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {
    public static void main(String[] args) {
        LocalDate d01 =  LocalDate.parse("2002-08-12");
        LocalDateTime d02 =  LocalDateTime.parse("2023-07-20T01:30:24");
        Instant d03 = Instant.parse("2023-07-20T01:30:24Z");

        //converte o instant no fuso do meu pc
        LocalDate r1 = LocalDate.ofInstant(d03,ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d03,ZoneId.of("Portugal"));

        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));




        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

        //retorna uma coleção com os nomes dos FusoHorarios que pode usar
//        for (String s : ZoneId.getAvailableZoneIds()){
//            System.out.println(s);
//        }

    }
}
