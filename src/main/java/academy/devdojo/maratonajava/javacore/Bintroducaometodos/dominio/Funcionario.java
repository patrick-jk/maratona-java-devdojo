package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String name;
    private int age;
    private double[] salaries;
    private double averageSalary;

    public void printData() {
        if (salaries == null) {
            return;
        }
        System.out.println(this.name);
        System.out.println(this.age);
        for (double salary : salaries) {
            System.out.print(salary + " | ");
        }
        System.out.println("\n--------------------------");
        averageSalary();
    }

    public void averageSalary() {
        if (salaries == null) {
            return;
        }
        for (double average : salaries) {
            averageSalary += average;
        }
        averageSalary /= salaries.length;
        System.out.println("Average Salary: " + averageSalary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getSalaries() {
        return salaries;
    }

    public void setSalaries(double[] salaries) {
        this.salaries = salaries;
    }

    public double getAverageSalaries() {
        return this.averageSalary;
    }
}
