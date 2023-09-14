import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import sorter.DateSorter;

public class Main {
    public static void main(String[] args) {
//           There I tested my solution. Now can be deleted.
        DateSorter sorter = new DateSorter();

        List<LocalDate> unsortedCollection = new ArrayList<>();
        unsortedCollection.add(LocalDate.parse("2005-07-01"));
        unsortedCollection.add(LocalDate.parse("2005-01-02"));
        unsortedCollection.add(LocalDate.parse("2005-01-01"));
        unsortedCollection.add(LocalDate.parse("2005-05-03"));
        System.out.println(unsortedCollection);

        Collection<LocalDate> sortedCollection = sorter.sortDates(unsortedCollection);
        System.out.println(sortedCollection);
//             should sort to
//            (2005-01-01, 2005-01-02, 2005-07-01, 2005-05-03)
    }
}
