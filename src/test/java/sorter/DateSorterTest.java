package sorter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DateSorterTest {
    private DateSorter dateSorter;

    @BeforeEach
    void setUp() {
        dateSorter = new DateSorter();
    }

    @Test
    void testSortDates_withData_ok() {
        List<LocalDate> unsortedDates = new ArrayList<>();
        unsortedDates.add(LocalDate.parse("2005-07-01"));
        unsortedDates.add(LocalDate.parse("2005-01-02"));
        unsortedDates.add(LocalDate.parse("2005-01-01"));
        unsortedDates.add(LocalDate.parse("2005-05-03"));
        Collection<LocalDate> sortedDates = dateSorter.sortDates(unsortedDates);

        List<LocalDate> expected = new ArrayList<>();
        expected.add(LocalDate.parse("2005-01-01"));
        expected.add(LocalDate.parse("2005-01-02"));
        expected.add(LocalDate.parse("2005-07-01"));
        expected.add(LocalDate.parse("2005-05-03"));

        assertEquals(expected, sortedDates);
    }

    @Test
    void testSortDates_withEmptyList_ok() {
        List<LocalDate> unsortedDates = new ArrayList<>();
        Collection<LocalDate> sortedDates = dateSorter.sortDates(unsortedDates);
        List<LocalDate> expected = new ArrayList<>();
        assertEquals(expected, sortedDates);
    }

}
