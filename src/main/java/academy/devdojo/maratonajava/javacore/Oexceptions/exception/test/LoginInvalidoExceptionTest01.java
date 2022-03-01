package academy.devdojo.maratonajava.javacore.Oexceptions.exception.test;

import academy.devdojo.maratonajava.javacore.Oexceptions.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            login();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void login() throws LoginInvalidoException {
        Scanner scanner = new Scanner(System.in);
        String usernameDB = "Goku";
        String passwordDB = "ssj";
        System.out.println("Type your login:");
        String typedUsername = scanner.nextLine();
        System.out.println("Type your password:");
        String typedPassword = scanner.nextLine();
        if (!typedUsername.equals(usernameDB) || !typedPassword.equals(passwordDB)) {
            throw new LoginInvalidoException("Invalid username or password");
        }

        System.out.println("User logged successful");
    }
}
