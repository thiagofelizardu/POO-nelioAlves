package br.estudos.com.POO.ExercioNotaAluno;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno :");
        aluno.name = sc.nextLine();

        System.out.println("Digite a primeira nota  do aluno :");
        aluno.nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota  do aluno  :");
        aluno.nota2 = sc.nextDouble();

        System.out.println("Digite a terceira nota  do aluno :");
        aluno.nota3 = sc.nextDouble();
        System.out.println();
        System.out.println("Media Final : "+aluno.mediaAluno());
        System.out.println();
        if (aluno.alunoAprovado()){
            System.out.println("Aluno Aprovado");
        }else {
            System.out.println("Aluno Reprovado");
            System.out.println("Fatam "+aluno.pointsToPass()+" para passar");
        }


    }
}
