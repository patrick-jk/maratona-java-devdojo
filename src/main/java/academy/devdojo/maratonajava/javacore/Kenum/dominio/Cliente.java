package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class Cliente {
    private String name;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String name, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.name = name;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + name + '\'' +
                ", tipoCliente=" + tipoCliente.getNomeRelatorio() +
                ", tipoClienteInt=" + tipoCliente.VALUE +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
