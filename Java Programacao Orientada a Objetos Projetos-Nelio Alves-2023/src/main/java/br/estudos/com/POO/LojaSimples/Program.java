package br.estudos.com.POO.LojaSimples;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println(" Enter product data:");
        System.out.println("Name:");
        product.name=sc.nextLine();

        System.out.println("Price:");
        product.price=sc.nextDouble();

        System.out.println("Quantidade in stock");
        product.quantity=sc.nextInt();

        System.out.println();
        System.out.printf("Total em R$: %.2f ", product.totalValueInStock());
        System.out.println();
        System.out.println("Entre com o numero que deseja adicionar a mais no Estoque");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println(product);
        System.out.println();

        System.out.println("Entre com o numero que deseja remover a mais no Estoque");
        int quantityRemove = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println(product);
        System.out.println();

    }
}
