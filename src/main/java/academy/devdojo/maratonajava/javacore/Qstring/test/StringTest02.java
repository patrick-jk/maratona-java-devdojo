package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String name = "  Johnny  ";
        String numbers = "012345";
        System.out.println(name.charAt(0));
        System.out.println(name.length());
        System.out.println(name.replace("n", "p"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(numbers.length());
        System.out.println(numbers.substring(3, numbers.length()));
        System.out.println(name.trim());
    }
}
