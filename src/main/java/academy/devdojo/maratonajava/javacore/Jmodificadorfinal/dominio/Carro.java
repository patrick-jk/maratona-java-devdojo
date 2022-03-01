package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String name;
    public static final double LIMIT_SPEED = 250;
    public final Comprador COMPRADOR = new Comprador();

    public final void printData() {
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
