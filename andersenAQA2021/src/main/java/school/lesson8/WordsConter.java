package school.lesson8;

import java.util.*;

public class WordsConter {

    public static void main(String[] args) {

        List<String> animalsList = new ArrayList<>() {{
            add("Лошадь");
            add("Коза");
            add("Лошадь");
            add("Собака");
            add("Медведь");
            add("Волк");
            add("Лиса");
            add("Собака");
            add("Лошадь");
            add("Коза");
        }};

        animalsList.forEach(System.out::println);

        Set<String> animalsSet = new HashSet<>(animalsList);

        System.out.println("Вывод списка с уникальными значениями");
        animalsSet.forEach(System.out::println);

        Iterator iter = animalsSet.iterator();
        while (iter.hasNext()) {
            String animal = (String)iter.next();
            System.out.println("Количество слов " + animal + ": " + Collections.frequency(animalsList, animal));
        }

    }
}
