package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;

import java.util.LinkedList;
import java.util.List;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorioMemoria = new RepositorioMemoria();
        repositorioMemoria.save();
        Repositorio repositorioBancoDeDados = new RepositorioBancoDeDados();
        repositorioBancoDeDados.save();
        Repositorio repositorioArquivo = new RepositorioArquivo();
        repositorioArquivo.save();
        List<String> list = new LinkedList<>();
        list.add("Jonathan");
        list.add("Joseph");
        list.add("Jotaro");
        System.out.println(list);
    }
}
