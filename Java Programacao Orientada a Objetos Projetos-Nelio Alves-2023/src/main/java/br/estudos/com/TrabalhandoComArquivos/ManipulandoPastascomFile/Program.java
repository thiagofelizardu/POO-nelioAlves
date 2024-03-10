package br.estudos.com.TrabalhandoComArquivos.ManipulandoPastascomFile;

import java.io.File;
import java.util.Scanner;

public class Program {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o caminho do arquivo: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);
        File[] files = path.listFiles(File::isFile);
        System.out.println("Folders: ");
        if (files != null) {
            for (File folder : files){
                System.out.println(folder);
            }
        }
        //criando uma pasta
        //creating a folder
        boolean success = new File(strPath + "\\subdir").mkdir();
        if (success){
            System.out.println("Diretorio criado com sucesso");
        }
        sc.close();
    }
}
