package lab;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<Author> authors = List.of(
            new Author("Khalid M.", 170, "Scientific Reports", "Arabian Journal of Chemictry", "Chemosphere"),
            new Author("Wang G.", 50, "Journal of Hydrology", "Nature Communications", "Water Research"),
            new Author("Karri R.R.", 56, "Scientific Reports", "Renewable Energy", "Journal of Molecular Liquids"),
            new Author("Pakalapati H.", 9, "Bioresource Technology", "Scientific Reports"),
            new Author("Yuan M.M.", 26, "Nature Climate Change", "Nature Comminications"),
            new Author("Zhou J.", 620, "Microblome", "Environmental Pollution", "Geoderma", "Nature Climat Change"),
            new Author("Lin L.", 16, "Environmental Pollution", "Communications Biology"),
            new Author("Elbashir N.O.", 94, "Scientific Reports", "Energy", "Processes", "Catalysts"),
            new Author("Challiwala M.", 10, "Scientific Reports", "Catalysis Today", "AlChE Journal"),
            new Author("Ghouri M.M.", 19, "Computer Aided Chemical Engineering", "Journal of Physical Chemistry C.")
        );

        authors.forEach(author -> {
            if (author.getNumberOfArticles() < 3) {
                System.out.println(author);
            }
        });

        Iterator<Author> iterator = authors.iterator();
        while (iterator.hasNext()) {
            Author next = iterator.next();
            if (next.getJournals().contains("Scientific Reports")) {
                System.out.println(next);
            }
        }

        Map<String, Integer> journalsMap = new HashMap<>();

        authors.forEach(author -> author.getJournals().forEach(journal ->
            journalsMap.put(journal, journalsMap.getOrDefault(journal, 0) + 1)));

        authors.forEach(author -> {
            if (author.getNumberOfArticles() > 50) {
                System.out.println(author);
            }
        });
    }
}
