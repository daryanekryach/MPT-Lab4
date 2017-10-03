import org.junit.*;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Random;

public class SortingsTest {
    private int[] originalArray, expectedArray, actualArray, arrayToOperate;
    private int[][] matrixToOperate;
    private ArrayOperations arrayOperations;
    private MatrixOperations matrixOperations;

    @Before
    public void init() {
        originalArray = new int[50];

        Random random = new Random();
        for (int i = 0; i < originalArray.length; i++) {
            originalArray[i] = random.nextInt(50);
        }

        arrayToOperate = new int[]{3, 5, 4, 1, 9, 0, 0, 2, 10, 7};
        matrixToOperate = new int[][]{
                {4, -3, 0, 5},
                {-1, 5, 8, -4},
                {4, 7, 1, 0},
                {-6, -5, -3, -2}
        };

        arrayOperations = new ArrayOperations(arrayToOperate);
        matrixOperations = new MatrixOperations(matrixToOperate);
    }

    void fillArrays() {
        expectedArray = Arrays.copyOf(originalArray, 50);
        actualArray = Arrays.copyOf(originalArray, 50);
    }

    //region sorting test
    @Test
    public void bubbleSortTest() {
        BubbleSort bubbleSort = new BubbleSort();
        fillArrays();
        Arrays.sort(expectedArray);
        bubbleSort.sort(actualArray);

        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void shellSortTest() {
        ShellSort shellSort = new ShellSort();
        fillArrays();
        Arrays.sort(expectedArray);
        shellSort.sort(actualArray);

        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void heapSortTest() {
        HeapSort heapSort = new HeapSort();
        fillArrays();
        Arrays.sort(expectedArray);
        heapSort.sort(actualArray);

        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void insertionSortTest() {
        InsertionSort insertionSort = new InsertionSort();
        fillArrays();
        Arrays.sort(expectedArray);
        insertionSort.sort(actualArray);

        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void quickSortTest() {
        QuickSort quickSort = new QuickSort();
        fillArrays();
        Arrays.sort(expectedArray);
        quickSort.Sort(actualArray, 0, actualArray.length - 1);

        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void cycleSortTest() {
        CycleSort cycleSort = new CycleSort();
        fillArrays();
        Arrays.sort(expectedArray);
        cycleSort.sort(actualArray);

        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void arrayCopyTest() {
        assertArrayEquals(originalArray, Lab4.arrayCopy(originalArray));
    }
    //endregion

    //region one-dimension array operations tests
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

    //region two-dimension array(matrix) operations
    @Test
    public void afterNegTest() {
        int[][] expected = new int[][]{
                {5, 5, 5, 5},
                {9, 9, 9, 9},
                {100, 100, 100, 100},
                {-10, -10, -10, -10}
        };
        int[][] actual = matrixOperations.getAfterNeg();
        assertEquals(expected, actual);
    }

    @Test
    public void beforeNegTest() {
        int[][] expected = new int[][]{
                {4, 4, 4, 4},
                {12, 12, 12, 12},
                {-1, -1, -1, -1},
                {-14, -14, -14, -14}
        };
        int[][] actual = matrixOperations.getBeforeNeg();
        assertEquals(expected, actual);
    }
    //endregion
}

