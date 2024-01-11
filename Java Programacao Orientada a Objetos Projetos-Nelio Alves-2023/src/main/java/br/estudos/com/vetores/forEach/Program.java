package br.estudos.com.vetores.forEach;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String[] vect = new String[]{"Maria","Jose","Alice"};

        for(int i=0;i< vect.length; i++){
            System.out.println(vect[i]);
        }
        System.out.println("_________________________________");
        for(String obj : vect){
            System.out.println(obj);
        }

    }
}
