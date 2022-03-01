package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // age < 15 Kids Category
        // age >= 15 && age < 18 Teen Category
        // age >= 18 Adult Category
        int age = 18;
        String category;
        category = age < 16 ? "Kids Category" : "Adults Category";
        System.out.println(category);
    }
}
