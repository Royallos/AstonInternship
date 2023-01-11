import com.aston.internship.homework.one.bubbleSort.impl.BubbleSorter;
import com.aston.internship.homework.one.bubbleSort.IBubbleSorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSorterTest {

    @Test
    void sort_nonSortedArray_arrayDataIsSortedFlagIsWorking() {
        IBubbleSorter<Integer> integerIBubbleSorter = new BubbleSorter<>();
        Integer[] integers = {2, 5, 1, 3, 6, 7, 8};
        integerIBubbleSorter.sort(integers, true);
        int iterationsNumber = integerIBubbleSorter.getIterationsNumber();
        Assertions.assertTrue(iterationsNumber < integers.length);
        integerIBubbleSorter = new BubbleSorter<>();
        integerIBubbleSorter.sort(integers, false);
        iterationsNumber = integerIBubbleSorter.getIterationsNumber();
        Assertions.assertTrue(iterationsNumber == integers.length);
    }
}
