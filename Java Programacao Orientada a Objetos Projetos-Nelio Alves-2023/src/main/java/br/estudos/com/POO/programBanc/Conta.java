package br.estudos.com.POO.programBanc;

public class Conta {

    private int numeroConta;

    private String nomeTitular;

    private double saldo;

    public Conta(int numeroConta, String nomeTitular, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public Conta(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public void deposito(double saldo){
        this.saldo += saldo;
    }

    public void saque(double saldo){
        this.saldo -= saldo + 5.0;
    }


    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta{" + " numeroConta = " + numeroConta + ", nomeTitular = " + nomeTitular + ", saldo = $" + String.format("%.2f",saldo ) +'}';
    }
}