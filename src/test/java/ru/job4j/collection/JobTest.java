package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {

    @Test
    public void whenComparatorByName() {
        Comparator<Job> cmpName = new SortByNameJob();
        int rsl = cmpName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByNameReverse() {
        Comparator<Job> cmpNameReverse = new SortByNameReverseJob();
        int rsl = cmpNameReverse.compare(
                new Job("Fix bug", 1),
                new Job("Impl task", 0)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByPriority() {
        Comparator<Job> cmpPriority = new SortByPriorityJob();
        int rsl = cmpPriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByPriorityReverse() {
        Comparator<Job> cmpPriorityReverse = new SortByPriorityReverseJob();
        int rsl = cmpPriorityReverse.compare(
                new Job("Fix bug", 1),
                new Job("Impl task", 0)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpName = new SortByNameJob().thenComparing(new SortByPriorityJob());
        int rsl = cmpName.compare(
                new Job("Impl task", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByNameRevAndPriorityRev() {
        Comparator<Job> cmpName = new SortByNameReverseJob().thenComparing(new SortByPriorityReverseJob());
        int rsl = cmpName.compare(
                new Job("Impl task", 1),
                new Job("Impl task", 0)
        );
        assertThat(rsl, lessThan(0));
    }
}