package br.estudos.com.Exercicios.ExercicioGerenciamentoPedido;

import br.estudos.com.Exercicios.ExercicioGerenciamentoPedido.entities.*;

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

        System.out.println("Enter Client Data:");
        System.out.println("Name: ");
        String clientName = leitor.nextLine();
        System.out.println("Email: ");
        String clientEmail = leitor.nextLine();
        System.out.println("Birth Date: ");
        Date clientBirth = sdf.parse(leitor.next());

        Client client = new Client(clientName,clientEmail,clientBirth);
        System.out.println("Enter Order data: ");
        System.out.println("Status Order: ");
        OrderStatus status = OrderStatus.valueOf(leitor.next());
        Order order = new Order(new Date(), status, client);

        System.out.println("How many items to this order? ");
        int n = leitor.nextInt();
        for (int i = 1 ; i<=n ; i++) {
            System.out.println("Enter #" + i + "item data:");
            System.out.println("Product Name: ");
            leitor.nextLine();
            String nameProduct = leitor.nextLine();
            System.out.println("Product Price: ");
            Double priceProduct = leitor.nextDouble();
            Product product = new Product(nameProduct,priceProduct);

            System.out.println("Quantity :");
            int quantity = leitor.nextInt();

            OrderItem orderItem = new OrderItem(quantity,priceProduct,product);

            order.addItem(orderItem);
        }
        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);

        leitor.close();
    }
}
