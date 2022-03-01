package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Donate if payment > 5000
        double payment = 1000;
        // (condition) ? true : false

        String result = payment > 5000 ? "I'm gonna donate 500 to DevDojo" : "I still not " +
                "have condition, but I'll have!";
        System.out.println(result);
    }
}
