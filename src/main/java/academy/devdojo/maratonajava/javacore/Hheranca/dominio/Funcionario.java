package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salary;

    static {
        System.out.println("Inside Funcionario static initialization block");
    }

    {
        System.out.println("Inside Funcionario initialization block 1");
    }

    {
        System.out.println("Inside Funcionario initialization block 2");
    }

    public Funcionario(String name) {
        super(name);
        System.out.println("Inside Funcionario Constructor");
    }

    public void printData() {
        super.printData();
        System.out.println(this.salary);
    }

    public void relatorioPagamento() {
        System.out.println("I " + this.name + " received " + this.salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
