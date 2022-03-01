package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = scanner.nextLine();
        System.out.println("Type your age: ");
        int age = scanner.nextInt();
        System.out.println("Type M or F to your sex: ");
        char sex = scanner.next().charAt(0);

        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Sex: "+sex);
    }
}
