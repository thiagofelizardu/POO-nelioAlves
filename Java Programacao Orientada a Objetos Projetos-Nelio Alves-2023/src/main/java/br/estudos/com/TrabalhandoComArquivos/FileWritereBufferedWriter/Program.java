package br.estudos.com.TrabalhandoComArquivos.FileWritereBufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        String[] lines = new String[] {"Ola mundo","FileWriter e BufferedWriter","Ola mundo"};
        String path = "C:\\temp\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){// sem esse true ele cria recria, com o true so acresenta ao mesmo arquivo
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
