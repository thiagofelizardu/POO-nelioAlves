package br.estudos.com.ExercicioStringBuilder;

import br.estudos.com.ExercicioStringBuilder.entities.Comment;
import br.estudos.com.ExercicioStringBuilder.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Masssa");
        Comment c2 = new Comment("Showw");
        Post post1 = new Post(sdf.parse("21/08/2018 13:05:44"),"Indo pra BT", "Indo pra o carna",12);

        post1.addComment(c1);
        post1.addComment(c2);

        System.out.println(post1);
    }
}
