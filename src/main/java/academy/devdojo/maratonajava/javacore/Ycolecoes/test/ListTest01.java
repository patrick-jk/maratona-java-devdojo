package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(16);
        List<String> names2 = new ArrayList<>(16);
        names.add("William");
        names.add("DevDojo");
        names2.add("Suane");
        names2.add("Academy");

//        System.out.println(names.remove("william"));
        names.addAll(names2);

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("----------");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
