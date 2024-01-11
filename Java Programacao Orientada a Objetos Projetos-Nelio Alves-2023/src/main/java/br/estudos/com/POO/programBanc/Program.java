package br.estudos.com.POO.programBanc;


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.println("Informe o número da conta: ");
        int numeroConta = sc.nextInt();

        System.out.println("Informe o nome do titular: ");
        sc.nextLine();
        String nomeTitular = sc.nextLine();


        System.out.println("Deseja realizar um depósito inicial? (y/n) ");
        char resposta = sc.next().charAt(0);
        if (resposta == 'y') {
            System.out.println("Informe o valor do depósito inicial: ");
            double valorDepositoInicial = sc.nextFloat();
            conta = new Conta(numeroConta,nomeTitular,valorDepositoInicial);
        } else {
            conta = new Conta(numeroConta,nomeTitular);
        }


        System.out.println();
        System.out.println("Dados da Conta:"+ conta);
        System.out.println();

        System.out.println("Entre com o valor do deposito: ");
        double deposito = sc.nextDouble();
        conta.deposito(deposito);

        System.out.println("Dados da Conta atualizado:"+ conta);
        System.out.println();
        System.out.println("Entre com o valor do saque: ");
        double saque = sc.nextDouble();
        conta.saque(saque);
        System.out.println();
        System.out.println("Dados da Conta atualizado:"+ conta);
        System.out.println();


    }
}

