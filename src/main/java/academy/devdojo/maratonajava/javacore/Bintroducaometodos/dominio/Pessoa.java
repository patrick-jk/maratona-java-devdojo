package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Invalid Age!");
        }
        this.age = age;
    }

    public void printData() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
