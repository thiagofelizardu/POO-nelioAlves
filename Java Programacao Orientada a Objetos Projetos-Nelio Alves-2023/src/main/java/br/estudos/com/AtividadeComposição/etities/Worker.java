package br.estudos.com.AtividadeComposição.etities;

import br.estudos.com.AtividadeComposição.etities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private Departament departament;

    private List<HourContract> contracts = new ArrayList<>();
    public Worker() {

    }
    public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }


    public void addContract(HourContract hourContract){
        contracts.add(hourContract);
    }
    public void removeContract(HourContract hourContract){
        contracts.remove(hourContract);
    }
    public double income(int year, int month) {
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract c : contracts) {
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if (year == c_year && month == c_month) {
                sum += c.totalvalue();
            }
        }
        return sum;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }








    public Departament getDepartament() {
        return departament;
    }


}
