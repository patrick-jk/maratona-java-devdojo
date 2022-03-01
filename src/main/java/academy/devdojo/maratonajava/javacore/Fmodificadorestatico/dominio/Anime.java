package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String name;
    private static int[] episodes;

    // 0 - Bloco de inicialização estático é executado quando a JVM carregar a classe
    // 1 - Alocado espaco em memoria para o objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    // 3 - Bloco de inicializacao é executado
    // 4 - Construtor é executado

    static {
        System.out.println("Dentro do Bloco de Inicialização");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for (int episode : Anime.episodes) {
            System.out.print(episode + " ");
        }
        System.out.println();
    }

    public String getName() {
        return this.name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
