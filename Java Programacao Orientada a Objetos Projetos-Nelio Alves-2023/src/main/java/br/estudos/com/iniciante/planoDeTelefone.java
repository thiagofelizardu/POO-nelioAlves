package br.estudos.com.iniciante;

import java.util.Scanner;

public class planoDeTelefone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int minuto = sc.nextInt();

        double planoBasico = 50.0;
        if (minuto > 100) {
            planoBasico += (minuto - 100) * 2.00;
        }


        System.out.printf("Valor da conta = R$ %.2f%n", planoBasico);

        sc.close();
    }
}
