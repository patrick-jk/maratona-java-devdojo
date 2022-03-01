package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.name = "Jotaro";
        estudante01.age = 17;
        estudante01.sex = 'M';

        estudante02.name = "Josuke";
        estudante02.age = 16;
        estudante02.sex = 'M';

        estudante01.imprime();

        estudante02.imprime();
    }
}
