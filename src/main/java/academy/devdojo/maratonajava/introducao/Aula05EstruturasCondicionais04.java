package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        // Calculate how much taxes is paid depending on how much the person earn annually
        // <= 34712 pays 9.7%
        // >= 34713 && <= 68507 pays 37.35%
        // > 68508 pays 49.50%
        double annualSalary = 80000;
        double paymentTaxes;
        if (annualSalary <= 34712) {
            paymentTaxes = annualSalary * 0.097;
        } else if (annualSalary >= 34713 && annualSalary <= 68507) {
            paymentTaxes = annualSalary * 0.3735;
        } else {
            paymentTaxes = annualSalary * 0.4950;
        }
        System.out.println("My annual salaries is: $" + annualSalary + ", I pay: $" + paymentTaxes + " of taxes");
    }
}
