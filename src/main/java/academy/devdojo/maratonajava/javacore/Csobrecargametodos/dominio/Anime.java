package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String animeName;
    private String type;
    private int episodes;
    private String gender;

    public void init(String animeName, String type, int episodes) {
        this.animeName = animeName;
        this.type = type;
        this.episodes = episodes;
    }

    public void init(String animeName, String type, int episodes, String gender) {
        this.init(animeName, type, episodes);
        this.gender = gender;
    }

    public void printData() {
        System.out.println(this.animeName);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.gender);
    }
}