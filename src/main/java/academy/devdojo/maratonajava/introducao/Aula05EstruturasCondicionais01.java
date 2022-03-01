package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int age = 16;
        boolean isAuthorizedToBuyAlcohol = age >= 18;
        // !

        if (isAuthorizedToBuyAlcohol) {
            System.out.println("Authorized to buy alcoholic drink");
        }

        if (!isAuthorizedToBuyAlcohol) {
            System.out.println("Not authorized to buy alcoholic drink");
        }

        boolean c = false;
        if (c == true) {
            System.out.println("Boolean is True!");
        }
    }
}
