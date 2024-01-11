package br.estudos.com.iniciante;

public class FuncoesStrings {
    public static void main(String[] args) {
        String original = "AAAA aa AAA";
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();

        String[] ce = original.split(" ");


//        System.out.println(original);
//        System.out.println(s01);
//        System.out.println(s02);
        System.out.println(ce[0]);
    }
}
