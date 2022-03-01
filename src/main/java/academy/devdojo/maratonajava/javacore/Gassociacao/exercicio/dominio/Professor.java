package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio;

public class Professor {
    private String name;
    private String speciality;
    private Seminario[] seminarios;

    public Professor(String name) {
        this.name = name;
    }

    public Professor(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
    }

    public Professor(String name, String speciality, Seminario[] seminarios) {
        this.name = name;
        this.speciality = speciality;
        this.seminarios = seminarios;
    }

    public String getName() {
        return name;
    }
}
