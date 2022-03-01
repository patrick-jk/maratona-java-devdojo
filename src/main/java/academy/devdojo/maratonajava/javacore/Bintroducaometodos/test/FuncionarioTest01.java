package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setName("Yoshikage Kira");
        funcionario.setAge(32);
        funcionario.setSalaries(new double[]{3000, 2500, 4000});

        funcionario.printData();

        System.out.println("Average Salary: "+funcionario.getAverageSalaries());
    }
}
