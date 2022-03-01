package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;

    void load();

    default void checkPermissions() {
        System.out.println("Checking permissions...");
    }

    static void retrieveDataMaxSize() {
        System.out.println("Inside Interface retrieveDataMaxSize");
    }
}
