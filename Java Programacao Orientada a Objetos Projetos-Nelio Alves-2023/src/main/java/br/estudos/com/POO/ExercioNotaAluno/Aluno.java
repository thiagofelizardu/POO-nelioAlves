package br.estudos.com.POO.ExercioNotaAluno;

public class Aluno {

    public String name;

    public double nota1;
    public double nota2;
    public double nota3;



    public double mediaAluno(){
        return nota1  + nota2  + nota3 /100 ;
    }
    public boolean alunoAprovado(){
        return mediaAluno() >= 60;
    }

    public double pointsToPass(){
        return 60 - mediaAluno();
    }

}
