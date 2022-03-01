package academy.devdojo.maratonajava.javacore.Oexceptions.runtime.test;

import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Inside ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Inside RuntimeException");
        }


        try {
            maybeThrowException();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    private static void maybeThrowException() throws SQLException, IOException {

    }
}
