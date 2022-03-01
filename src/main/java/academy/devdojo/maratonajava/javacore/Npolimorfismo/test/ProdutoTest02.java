package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println(produto.getName());
        System.out.println(produto.getValue());
        System.out.println(produto.calculateTaxes());
        System.out.println("-----------------");

        Produto produto2 = new Tomate("Americano", 20);
        System.out.println(produto2.getName());
        System.out.println(produto2.getValue());
        System.out.println(produto2.calculateTaxes());
    }
}
