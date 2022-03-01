package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Loading file data...");
    }

    @Override
    public void remove() {
        System.out.println("Removing file data...");
    }

    @Override
    public void checkPermissions() {
        System.out.println("Checking file permissions...");
    }
}
