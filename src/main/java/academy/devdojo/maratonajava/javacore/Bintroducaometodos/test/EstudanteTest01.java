package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.name = "Jotaro";
        estudante01.age = 17;
        estudante01.sex = 'M';

        estudante02.name = "Josuke";
        estudante02.age = 16;
        estudante02.sex = 'M';

        impressora.imprime(estudante01);

        impressora.imprime(estudante02);
    }
}
