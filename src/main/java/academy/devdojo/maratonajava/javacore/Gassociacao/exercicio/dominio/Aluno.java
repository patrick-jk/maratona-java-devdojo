package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio;

public class Aluno {
    private String name;
    private int age;
    private Seminario seminario;

    public Aluno(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printData() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
