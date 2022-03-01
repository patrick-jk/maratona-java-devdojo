package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Will A. Zeppeli";
        professor.age = 36;
        professor.sex = 'M';

        System.out.println("Name: " + professor.name + " | Age: " + professor.age + " | Sex: " + professor.sex);
    }
}
