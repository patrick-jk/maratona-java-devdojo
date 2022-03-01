package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {
    // private -> default -> protected -> public
    @Override
    public void load() {
        System.out.println("Loading database data...");
    }

    @Override
    public void remove() {
        System.out.println("Removing database data...");
    }

    @Override
    public void checkPermissions() {
        System.out.println("Checking database permissions...");
    }

    public static void retrieveDataMaxSize() {
        System.out.println("Inside DatabaseLoader Class retrieveDataMaxSize");
    }
}
