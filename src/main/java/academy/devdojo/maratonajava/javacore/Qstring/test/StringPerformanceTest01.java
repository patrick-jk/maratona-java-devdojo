package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        concatString(30_000);
        long end = System.currentTimeMillis();
        System.out.println("Tempo gasto para String: " + (end - start) + "ms");

        start = System.currentTimeMillis();
        concatStringBuilder(30_000);
        end = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder: " + (end - start) + "ms");

        start = System.currentTimeMillis();
        concatStringBuffer(30_000);
        end = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer: " + (end - start) + "ms");
    }

    public static void concatString(int size) {
        String text = "";
        for (int i = 0; i < size; i++) {
            text += i;
        }
    }

    public static void concatStringBuilder(int size) {
        StringBuilder sb = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            sb.append(i);
        }
    }

    public static void concatStringBuffer(int size) {
        StringBuffer sb = new StringBuffer(size);
        for (int i = 0; i < size; i++) {
            sb.append(i);
        }
    }
}
