package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassTest02 {
    private String name = "Midoriya";

    void print(final String param) {
        final String lastName = "Izuku";

        class LocalClass {
            public void printLocal() {
                System.out.println(param);
                System.out.println(name + " " + lastName);
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassTest02 outer = new OuterClassTest02();
        outer.print("DevDojo");
    }
}
