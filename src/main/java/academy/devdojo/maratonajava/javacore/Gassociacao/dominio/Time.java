package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Time {
    private String name;
    private Jogador[] jogadores;

    public Time(String name) {
        this.name = name;
    }

    public void printData() {
        System.out.println(this.name);
        if (jogadores == null) return;
        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getName());
        }

    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public String getName() {
        return name;
    }
}