package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa {
    protected String name;
    protected double salary;

    public Funcionario(String name, double salary) {
        this.name = name;
        this.salary = salary;
        calcularBonus();
    }

    @Override
    public void printData() {
        System.out.println("Printing...");
    }

    public abstract void calcularBonus();
}
