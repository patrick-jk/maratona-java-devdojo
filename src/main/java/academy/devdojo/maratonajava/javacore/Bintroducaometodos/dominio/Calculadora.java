package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num1, float num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double divideDoisNumeros02(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("There's no division by zero");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros(int number1, int number2) {
        number1 = 99;
        number2 = 33;
        System.out.println("Inside alteraDoisNumeros");
        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);
    }

    public void somaArray(int[] numbers) {
        int soma = 0;
        for (int num : numbers) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numbers) {
        int soma = 0;
        for (int num : numbers) {
            soma += num;
        }
        System.out.println(soma);
    }
}