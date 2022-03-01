package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Print all the even numbers from 0 to 1 million
        for (int evenNumber = 0; evenNumber<=1_000_000; evenNumber++) {
            if (evenNumber % 2 == 0) {
                System.out.println(evenNumber);
            }
        }
    }
}
