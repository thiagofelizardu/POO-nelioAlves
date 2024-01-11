package br.estudos.com.POO.mebrosEstaticos;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    // serve para algo que nao precisa ser intanciado
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Entre o valor do raio");
        double radius = sc.nextDouble();

        double c = circumference(radius);

        double v = volume(radius);

        System.out.printf("Circumferece: %.2f%n",c);
        System.out.printf("Volume: %.2f%n",v);
        System.out.printf("PI: %.2f%n",c);

        sc.close();
    }
    public static double circumference(double radius){
        return 2.0 * PI *radius;
    }

    public static double volume(double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}