package br.estudos.com.Execoes.TryCacth.Finaly;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

    
    public static void main(String[] args) {
        File file = new File("C:\\temp\\in.txt.txt");
        Scanner sc = null;
        try{
            sc= new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }catch (FileNotFoundException e){
            System.out.println("Error opeing File : " + e.getMessage());
        }finally {
            if (sc !=null){
                sc.close();
                System.out.println("finaly executado");
                //executa independente se ter ocorrido execao ou n
            }
        }

    }
}
