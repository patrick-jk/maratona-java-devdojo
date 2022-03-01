package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Jogador {
    private String name;
    private Time time;

    public Jogador(String name) {
        this.name = name;
    }

    public void printData() {
        System.out.println(this.name);
        if (time != null) {
            System.out.println(time.getName());
        }
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }
}