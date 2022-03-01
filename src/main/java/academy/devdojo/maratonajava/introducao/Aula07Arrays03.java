package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numbers01 = new int[3];
        int[] numbers02 = {1, 2, 3, 4, 5};
        int[] numbers03 = new int[]{5, 4, 3, 2, 1};

//        for (int i = 0; i < numbers03.length; i++) {
//          System.out.println(numbers03);
//        }

        for (int number : numbers03) {
            System.out.println(number);
        }
    }
}
