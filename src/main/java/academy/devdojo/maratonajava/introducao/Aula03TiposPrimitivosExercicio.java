package academy.devdojo.maratonajava.introducao;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome> morando no endereço <endereço>, confirmo que recebi o salário de <salário>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String name = "Joseph";
        String address = "Times Square - 238";
        double salary = 8600;
        String paymentDate = "08/01/2021";
        String reportPayment = "I " + name + ", living in " + address + ", I confirm" +
                " that " + "I received the payment of $" + salary + " in the date " + paymentDate;
        System.out.println(reportPayment);
    }
}
