package br.estudos.com.POO.Escapsulamento;

import br.estudos.com.POO.Escapsulamento.entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data:");
        System.out.println("Name:");
        String name =sc.nextLine();

        System.out.println("Price:");
        double price=sc.nextDouble();
        Product product1 = new Product();
        product1.setName("Computer");
        System.out.println(product1.getName());


//        System.out.println("Quantidade in stock");
//        int quantity = sc.nextInt();
//
//        Product product = new Product(name,price,quantity);
//        System.out.println(product);

    }
}