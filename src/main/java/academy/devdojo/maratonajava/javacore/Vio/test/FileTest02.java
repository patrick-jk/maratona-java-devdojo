package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileFolder = new File("pasta");
        boolean isFolderCreated = fileFolder.mkdir();
        System.out.println("Folder created? " + isFolderCreated);
        File fileFileFolder = new File(fileFolder, "arquivo.txt");
        boolean isFileFolderCreated = fileFileFolder.createNewFile();
        System.out.println("arquivo.txt created? " + isFileFolderCreated);

        File fileRenamed = new File(fileFolder, "arquivo_renomeado.txt");
        boolean isFileRenamed = fileFileFolder.renameTo(fileRenamed);
        System.out.println("File renamed? " + isFileRenamed);

        File folderRenamed = new File("pasta2");
        boolean isFolderRenamed = fileFolder.renameTo(folderRenamed);
        System.out.println("Folder renamed? " + isFolderRenamed);
    }
}
