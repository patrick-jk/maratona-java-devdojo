package academy.devdojo.maratonajava.javacore.Oexceptions.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        division(1, 1);

        System.out.println("Code finished");
    }

    /**
     *
     * @param a
     * @param b cannot be zero
     * @return
     * @throws IllegalArgumentException if b equals zero
     */
    public static int division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Illegal Argument, cannot be zero");
        }
        return a / b;
    }
}
