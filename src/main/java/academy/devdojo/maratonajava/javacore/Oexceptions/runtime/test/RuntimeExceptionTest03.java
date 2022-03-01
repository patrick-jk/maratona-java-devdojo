package academy.devdojo.maratonajava.javacore.Oexceptions.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        openConnection();
    }

    public static String openConnection() {
        try {
            System.out.println("Opening File");
            System.out.println("Writing data in the file");
            return "Opened Connection";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Closing resource gave by OS");
        }
        return null;
    }

    public static void openConnection2() {
        try {
            System.out.println("Opening File");
            System.out.println("Writing data in the file");
            throw new RuntimeException();
        } finally {
            System.out.println("Closing resource released by OS");
        }
    }
}
