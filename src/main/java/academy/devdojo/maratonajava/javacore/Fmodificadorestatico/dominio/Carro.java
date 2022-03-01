package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Carro {
    private String name;
    private double maxSpeed;
    private static double limitSpeed = 250;

    public Carro(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public void printData() {
        System.out.println("Name: " + this.name);
        System.out.println("Max Speed: " + this.maxSpeed);
        System.out.println("Limit Speed: " + Carro.limitSpeed);
        System.out.println("-------------------");
    }

    public static void setLimitSpeed(double limitSpeed) {
        Carro.limitSpeed = limitSpeed;
    }
}
