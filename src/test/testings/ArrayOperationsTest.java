package testings;

import org.junit.*;
import static org.junit.Assert.*;
import refactored.ArrayOperations;

public class ArrayOperationsTest {
    private ArrayOperations arrayOperations;

    @Before
    public void init() {
        int[] arrayToOperate = new int[]{3, 5, 4, 1, 9, 0, 0, 2, 10, 7};
        arrayOperations = new ArrayOperations(arrayToOperate);
    }

    //region Input test
    @Test
    public void checkNullArray() {
        assertNotNull(arrayOperations.array);
    }

    @Test
    public void checkOneItemArray() {
        assertFalse(arrayOperations.size == 1);
    }

    @Test
    public void identicalValuesArray() {
        int referenceValue = arrayOperations.array[0];
        for (int i = 1; i < arrayOperations.array.length; i++) {
            assertFalse(referenceValue == arrayOperations.array[i]);
        }
    }
    //endregion

    //region Operations test
    @Test
    public void multipliedSumTest() {
        int actual = arrayOperations.getMultipliedSum();
        assertEquals(41 * 3, actual);
    }

    @Test
    public void deltaTest() {
        int actual = arrayOperations.getDelta();
        assertEquals(10, actual);
    }

    @Test
    public void meanTest() {
        int actual = arrayOperations.getMean();
        assertEquals(4, actual);
    }

    @Test
    public void evenNumbersTest(){
        int actual = arrayOperations.getEvenNumbers();
        assertEquals(5, actual);
    }

    @Test
    public void maxMinSumTest() {
        int actual = arrayOperations.getMaxMinSum();
        assertEquals(10, actual);
    }

    @Test
    public void moduleMaxTest() {
        int actual = arrayOperations.getModuleMax();
        assertEquals(10, actual);
    }
    //endregion
}
