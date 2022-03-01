package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassTest03 {
    private String name = "William";

    static class Nested {
        private String lastName = "Suane";

        public void print() {
            System.out.println(new OuterClassTest03().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        OuterClassTest03.Nested nested = new OuterClassTest03.Nested();
        nested.print();
    }
}
