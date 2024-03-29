package br.estudos.com.Datas.UsandoCalendar;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {
    public static void main(String[] args) {

        SimpleDateFormat  simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(simpleDateFormat.format(d));

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.toInstant());
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime();
        System.out.println(simpleDateFormat.format(d));

    }
}
