package academy.devdojo.maratonajava.javacore.Oexceptions.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo\\test.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created file: " + isCreated);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}