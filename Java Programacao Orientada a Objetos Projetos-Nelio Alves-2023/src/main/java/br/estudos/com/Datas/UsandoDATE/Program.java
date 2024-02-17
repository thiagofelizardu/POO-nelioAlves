package br.estudos.com.Datas.UsandoDATE;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {
    public static void main(String[] args) throws ParseException {
        //fomartando datas sdf para o tipo Date
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d1 = sdf1.parse("25/06/2018");
        Date d2 = sdf2.parse("25/06/2018 15:42:07");

        System.out.println("d1: " + sdf2.format(d1));
        System.out.println("d2: " + d2);

        // Formas de usar Date
        Date data = new Date();
        Date data2 = new Date(System.currentTimeMillis());
        System.out.println(sdf2.format(data));
        System.out.println(sdf2.format(data2));

        //Usando Date no Padrao UTC
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
        Date data3 = Date.from(Instant.parse("2019-08-08T15:05:45Z"));
        System.out.println(sdf3.format(data3));
    }
}
