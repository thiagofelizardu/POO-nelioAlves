package br.estudos.com.lista.aula1introdução;

import java.util.ArrayList;
import java.util.List;

public class Program {


    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("Maria");
        list.add("Marcos");
        list.add("Jose");
        list.add("Joao");
        list.add("Bob");
        System.out.println(list.size());
        for (String x : list){
            System.out.println(x);
        }
        System.out.println("+++++++++++++++++++++++++++++");
        //list.remove(1);
        list.removeIf(x-> x.charAt(0)=='M');
        for (String x : list){
            System.out.println(x);
        }
        System.out.println("+++++++++++++++++++++++++++++");
        // indexof retorna a posição em que esta o elemento
        System.out.println("Index of  Bob "+ list.indexOf("Bob"));
        System.out.println("Index of Marcos"+ list.indexOf("Marcos"));

        System.out.println("+++++++++++++++++++++++++++++");
        List<String> result = list.stream().filter(x-> x.charAt(0)=='J').toList();
        for (String e : result){
            System.out.println(e);
        }
        System.out.println("+++++++++++++++++++++++++++++");
        String name= list.stream().filter(x-> x.charAt(0)=='J').findFirst().orElse(null);
        System.out.println(name);
    }

}
