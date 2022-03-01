package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Seminario;

public class SistemaTest01 {
    public static void main(String[] args) {
        Local local = new Local("Youtube");
        Local local2 = new Local("Florida");
        Professor professor = new Professor("Gyro Zeppeli", "Spin");
        Aluno aluno = new Aluno("Billy", 17);
        Aluno aluno2 = new Aluno("Marvin", 18);
        Aluno[] alunosJava = {aluno};
        Aluno[] alunosSpin = {aluno2};

        Seminario seminario = new Seminario("Seminário de Java", alunosJava, local);
        Seminario seminario2 = new Seminario("Seminário de Spin", alunosSpin, local2);

        seminario.setStudents(alunosJava);
        seminario2.setStudents(alunosSpin);

        Professor[] professors = {professor};
        seminario.setProfessors(professors);
        seminario2.setProfessors(professors);

        seminario.printData();
        seminario2.printData();
    }
}
