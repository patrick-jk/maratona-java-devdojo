package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        // Create a class "carro1" with the following attributes: name, model and year
        // After that, create 2 different objects and print your values
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.name = "Corolla";
        carro1.model = "Sedan";
        carro1.year = 2021;

        carro2.name = "Range Rover";
        carro2.model = "SUV";
        carro2.year = 2022;

        System.out.println("Car Name: " + carro1.name + " | Model: " + carro1.model + " | Year: " + carro1.year);
        System.out.println("Car Name: " + carro2.name + " | Model: " + carro2.model + " | Year: " + carro2.year);
    }
}
