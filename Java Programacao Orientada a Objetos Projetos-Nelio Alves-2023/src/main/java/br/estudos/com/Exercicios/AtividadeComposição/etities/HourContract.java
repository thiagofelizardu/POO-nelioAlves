package br.estudos.com.Exercicios.AtividadeComposição.etities;

import java.util.Date;

public class HourContract {

    private Date date;
    private Double valuePerHour;
    private Integer hours;
    public HourContract() {
    }
    public HourContract(Date date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }



    public double totalvalue(){
        return valuePerHour * hours;
    }

    public Date getDate() {
        return date;
    }

}
