package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String name = "William"; //String constant pool
        String name2 = "William";
        name = name.concat(" Suane"); // nome += " Suane"
        System.out.println(name);
        System.out.println(name == name2);
        String name3 = new String("William"); // 1- variavel de referencia, 2- objeto do tipo string, 3- uma string no string pool
        System.out.println(name2 == name3);
        System.out.println(name2 == name3.intern());
    }
}
