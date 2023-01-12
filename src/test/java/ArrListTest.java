import com.aston.internship.homework.one.arrList.IArrList;
import com.aston.internship.homework.one.arrList.impl.ArrList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArrListTest {
    private final static int TEST_CAPACITY = 11;
    private final static int DEFAULT_CAPACITY = 16;

    private static IArrList<String> stringArrList;
    private static IArrList<Integer> integerArrList;

    @BeforeEach
    void init() {
        stringArrList = new ArrList<>();
        integerArrList = new ArrList<>(TEST_CAPACITY);
        for (int i = 0; i < 5; i++) {
            integerArrList.add(i);
        }
        stringArrList.add("arr");
        stringArrList.add("test");
    }

    @Test
    void createArr_defaultAndManualCapacityAreSet_correctArrayCapacity() {
        Assertions.assertEquals(DEFAULT_CAPACITY, stringArrList.size());
        Assertions.assertEquals(TEST_CAPACITY, integerArrList.size());
    }

    @Test
    void getElem_noParams_correctTypeAndValues() {
        for (int i = 0; i < 5; i++) {
            Assertions.assertEquals(i, integerArrList.get(i));
        }
        Assertions.assertEquals("arr", stringArrList.get(0));
        Assertions.assertEquals("test", stringArrList.get(1));
        Assertions.assertEquals(String.class, stringArrList.get(0).getClass());
        Assertions.assertEquals(Integer.class, integerArrList.get(0).getClass());
    }

    @Test
    void addElem_noParam_elemAddedSizeChanged() {
        int initArrSize = 3;
        Double nextArrSize = initArrSize * 1.5;
        IArrList<Integer> testArr = new ArrList<>(initArrSize);
        testArr.add(1);
        Assertions.assertTrue(checkDataAndSize(testArr, 0, 1, initArrSize));
        testArr.add(2);
        Assertions.assertTrue(checkDataAndSize(testArr, 1, 2, initArrSize));
        testArr.add(3);
        Assertions.assertTrue(checkDataAndSize(testArr, 2, 3, nextArrSize.intValue()));
    }

    @Test
    void addAll_noParams_elemsAddedCorrectSize() {
        Double nextArrSize = TEST_CAPACITY * 1.5;
        IArrList<Integer> testList= new ArrList<>();
        for (int i = 0; i < 5; i++) {
            testList.add(i);
        }
        integerArrList.addAll(testList);
        Assertions.assertTrue(checkDataAndSize(integerArrList, 5, 0, nextArrSize.intValue()));
    }

    @Test
    void delete_NoParams_elemDeletedIfPresentCorrectSize() {
        integerArrList.delete(10);
        integerArrList.delete(2);
        checkDataAndSize(integerArrList, 3, 3, TEST_CAPACITY);
    }

    private boolean checkDataAndSize(IArrList<Integer> target, int pos, int value, int size) {
        if (target.get(pos) != value || target.size() != size) {
            return false;
        }
        return true;
    }

    @Test
    void size_noParam_returnNumberOfElements() {
        Assertions.assertEquals(5, integerArrList.size());
    }
}
