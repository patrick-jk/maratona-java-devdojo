package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9, 0));
        mangas.add(new Manga(1L, "Berserk", 9.5, 5));
        mangas.add(new Manga(4L, "Pokemon", 3.2, 0));
        mangas.add(new Manga(3L, "Attack on titan", 11.2, 2));
        mangas.add(new Manga(2L, "Dragon ball Z", 2.99, 0));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while(mangas.iterator().hasNext()) {
//            if(mangaIterator.next().getQuantity() == 0) {
//                mangaIterator.remove();
//            }
//        }

        mangas.removeIf(manga -> manga.getQuantity() == 0);

        System.out.println(mangas);
    }
}
