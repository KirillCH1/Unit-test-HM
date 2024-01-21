import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class AverageComparatorTest {
    @Test
    public void testCompareAverages_FirstListGreater() {
        AverageComparator comparator = new AverageComparator();
        String result = comparator.compareAverages(Arrays.asList(1, 2, 3), Arrays.asList(1, 2));
        assertEquals("Первый список имеет большее среднее значение", result);
    };

    @Test
    public void testCompareAverages_SecondListGreater() {
        AverageComparator comparator = new AverageComparator();
        String result = comparator.compareAverages(Arrays.asList(1, 2), Arrays.asList(1, 2, 3));
        assertEquals("Второй список имеет большее среднее значение", result);
    };

    @Test
    public void testCompareAverages_EqualAverages() {
        AverageComparator comparator = new AverageComparator();
        String result = comparator.compareAverages(Arrays.asList(1, 2, 3), Arrays.asList(3, 2, 1));
        assertEquals("Средние значения равны", result);
    };

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateAverage_EmptyList() {
        AverageComparator comparator = new AverageComparator();
        comparator.compareAverages(Collections.emptyList(), Arrays.asList(1, 2, 3));
    };
}
