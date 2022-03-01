package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.06;
    private String dataValidade;
    public Tomate(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTaxes() {
        System.out.println("Calculating tomato taxes...");
        return this.value * IMPOSTO_POR_CENTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
