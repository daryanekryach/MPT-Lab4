public class QuickSort implements Sorting {

    private int temp, middle, pivot;
    private int i,j;
    public void sort(int[] array) {}

    public void Sort(int[] array, int start, int end) {
        if (array == null || array.length == 0)
            return;

        if (start >= end)
            return;

        middle = start + (end - start) / 2;
        pivot = array[middle];

         i = start;
         j = end;

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(array);
            }
        }

        if (start < j)
            Sort(array, start, j);

        if (end > i)
            Sort(array, i, end);
    }

    private void swap(int[] array) {
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        i++;
        j--;
    }
}

