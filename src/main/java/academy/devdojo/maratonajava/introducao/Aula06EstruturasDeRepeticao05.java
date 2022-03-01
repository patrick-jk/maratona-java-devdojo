package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condition valorParcel >= 1000
        double totalValue = 30_000;
        for (int installmentsNumber = (int) totalValue; installmentsNumber >= 1; installmentsNumber--) {
            double installmentValue = totalValue / installmentsNumber;
            if (installmentValue < 1000) {
                continue;
            }
            System.out.println("Installment: " + installmentsNumber + " $" + installmentValue);
        }
    }
}
