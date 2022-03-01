package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public abstract class Produto implements Taxavel {
    protected String name;
    protected double value;

    public Produto(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }
}
