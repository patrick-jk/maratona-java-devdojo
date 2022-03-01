package academy.devdojo.maratonajava.javacore.Oexceptions.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        File file = new File("arquivo\\test.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created file: " + isCreated);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}