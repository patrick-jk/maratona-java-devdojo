package academy.devdojo.maratonajava.javacore.Oexceptions.exception.dominio;

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
        super("Invalid login");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
