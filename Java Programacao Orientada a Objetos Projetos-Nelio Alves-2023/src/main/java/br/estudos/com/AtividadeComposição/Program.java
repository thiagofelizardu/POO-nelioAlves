package br.estudos.com.AtividadeComposição;

import br.estudos.com.AtividadeComposição.etities.Departament;
import br.estudos.com.AtividadeComposição.etities.HourContract;
import br.estudos.com.AtividadeComposição.etities.Worker;
import br.estudos.com.AtividadeComposição.etities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Qual o nome do Departamento");
        String depatamentoName = leitor.nextLine();

        System.out.println("Entre com Dados Sobre o trabalhador");
        System.out.print("Nome: ");
        String nameWorker = leitor.nextLine();
        System.out.print("Level: ");
        String levelWorker = leitor.nextLine();
        System.out.print("Base Salary: ");
        double baseSalary = leitor.nextDouble();
        Worker worker = new Worker(nameWorker, WorkerLevel.valueOf(levelWorker),baseSalary , new Departament(depatamentoName));

        System.out.println("Quantos Contratos Vai Ter: ");
        int n = leitor.nextInt();

        for (int i = 1 ; i<=n ; i++){
            System.out.println("Entre com o Contrato #" + i + " data");
            System.out.print("Entre com a Data (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(leitor.next());
            System.out.print("Valor Pro hora : ");
            double valorPerHour = leitor.nextDouble();
            System.out.print("Duração (hora): ");
            int hour = leitor.nextInt();
            HourContract contract = new HourContract(contractDate,valorPerHour,hour);
            worker.addContract(contract);
        }
        System.out.println();
        System.out.print("Entre com o mes para calcular a saida :");
        String monthAndYear = leitor.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Nome: " + worker.getName());
        System.out.println("Departamento: " + worker.getDepartament().getName());
        System.out.println("Valor para saida: "+ monthAndYear +" : "+String.format("%.2f ", worker.income(year,month)));


        leitor.close();
    }
}
