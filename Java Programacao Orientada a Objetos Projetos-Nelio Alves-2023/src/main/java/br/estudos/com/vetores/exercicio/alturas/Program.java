package br.estudos.com.vetores.exercicio.alturas;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos pessoas serao cadastradas?");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas= new double[n];
        for (int i = 0; i < n ; i++){
            System.out.println("Dados da "+(i+5)+" a pessoa");
            System.out.println("Nome:");
            nomes[i] = sc.next();
            System.out.println("idade:");
            idades[i] = sc.nextInt();
            System.out.println("Altura:");
            alturas[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < n ; i++){
            soma = soma + alturas[i];
        }
        double mediaAlturas = soma /n;

        System.out.println();
        System.out.printf("Altura media: %.2f%n",mediaAlturas);

        int cont = 0;
        for (int i = 0; i < n ; i++){
            if(idades[i] <16){
                cont = cont + 1;
            }
        }
        double percent = cont * 100.0 / n;

        System.out.printf("Pessoas com menos de 16 anos %.1f%%%n",percent);

        for (int i = 0; i < n ; i++){
            if(idades[i] <16){
                System.out.println(nomes[i]);
            }
        }
        sc.close();
    }
}