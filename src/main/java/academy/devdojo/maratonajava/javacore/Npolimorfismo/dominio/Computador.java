package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Computador extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.21;
    public Computador(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTaxes() {
        System.out.println("Calculating computer taxes...");
        return this.value * IMPOSTO_POR_CENTO;
    }
}
