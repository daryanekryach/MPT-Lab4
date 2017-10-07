package refactored;

public class QuickSort implements Sorting {
    private int i, j;

    public void sort(int[] array, int start, int end) {
        if (array == null || array.length == 0)
            return;
        if (start >= end)
            return;

        int middle = start + (end - start) / 2;
        int pivot = array[middle];

        i = start;
        j = end;

        while (i <= j)
            indexChange(array, pivot);

        if (start < j)
            sort(array, start, j);

        if (end > i)
            sort(array, i, end);
    }

    private void indexChange(int[] array, int pivot) {
        while (array[i] < pivot)
            i++;
        while (array[j] > pivot)
            j--;
        if (i <= j)
            swap(array);
    }

    private void swap(int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        i++;
        j--;
    }
}

