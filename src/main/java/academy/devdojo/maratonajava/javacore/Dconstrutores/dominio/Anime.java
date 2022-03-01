package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String animeName;
    private String type;
    private int episodes;
    private String gender;
    private String studio;

    public Anime(String animeName, String type, int episodes, String gender) {
        this();
        this.animeName = animeName;
        this.type = type;
        this.episodes = episodes;
        this.gender = gender;
    }

    public Anime(String animeName, String type, int episodes, String gender, String studio) {
        this(animeName, type, episodes, gender);
        this.studio = studio;
    }

    public Anime() {
        System.out.println("Inside Constructor without args");
    }

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
        System.out.println(this.studio);
        System.out.println("-------------");
    }
}