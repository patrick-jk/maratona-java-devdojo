package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Escola {
    private String name;
    private Professor[] teachers;

    public Escola(String name) {
        this.name = name;
    }

    public Escola(String name, Professor[] teachers) {
        this.name = name;
        this.teachers = teachers;
    }

    public void printData() {
        System.out.println("School: " + this.name);
        if (teachers == null) return;
        for (Professor teacher : teachers) {
            System.out.println("Teacher: " + teacher.getName());
        }

    }
}
