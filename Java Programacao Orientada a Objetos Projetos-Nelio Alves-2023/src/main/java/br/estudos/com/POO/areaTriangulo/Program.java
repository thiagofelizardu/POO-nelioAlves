package br.estudos.com.POO.areaTriangulo;

import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Triangle x , y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Entre com as areas do Triangulo: X");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Entre com as areas do Triangulo: Y");
        y.a = sc.nextDouble();
        y.b= sc.nextDouble();
        y.c= sc.nextDouble();

        double areaX = x.area();

        double areaY = y.area();

        System.out.printf("Triangulo X area : %.4f%n",areaX);
        System.out.printf("Triangulo Y area : %.4f%n",areaY);

        if(areaX>areaY){
            System.out.println("Area maior X");
        }else {
            System.out.println("Area maior Y");
        }
    }
}