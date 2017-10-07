package testings;
import org.junit.*;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Random;
import refactored.*;

public class SortsTest {
    private int[] originalArray, expectedArray, actualArray;

    @Before
    public void init() {
        originalArray = new int[50];
        Random random = new Random();
        for (int i = 0; i < originalArray.length; i++) {
            originalArray[i] = random.nextInt(50);
        }
    }

    private void fillArrays() {
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
        quickSort.sort(actualArray, 0, actualArray.length - 1);

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
    //endregion
}

