package lab;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.List.copyOf;
import static java.util.List.of;

/**
 * todo Document type Author
 */
public class Author {

    private String name;
    private int numberOfArticles;
    private List<String> journals;

    public Author(String name, int numberOfArticles, String... journals) {
        this.name = name;
        this.numberOfArticles = numberOfArticles;
        this.journals = asList(journals);
    }

    public String getName() {
        return name;
    }

    public int getNumberOfArticles() {
        return numberOfArticles;
    }

    public List<String> getJournals() {
        return copyOf(journals);
    }

    @Override
    public String toString() {
        return "Author{" +
            "name='" + name + '\'' +
            ", numberOfArticles=" + numberOfArticles +
            ", journals=" + journals +
            '}';
    }
}
