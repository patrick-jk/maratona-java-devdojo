package academy.devdojo.maratonajava.javacore.Oexceptions.exception.dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa {
    @Override
    public void save() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Saving Funcionario");
    }
}
