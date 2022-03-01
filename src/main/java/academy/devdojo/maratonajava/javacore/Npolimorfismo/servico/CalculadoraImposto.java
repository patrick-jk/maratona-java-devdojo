package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Tax Report");
        double tax = produto.calculateTaxes();
        System.out.println("Product: " + produto.getName());
        System.out.println("Value: " + produto.getValue());
        System.out.println("Taxes to be paid: " + tax);
        if (produto instanceof Tomate) {
            System.out.println(((Tomate) produto).getDataValidade());
        }
    }
}
