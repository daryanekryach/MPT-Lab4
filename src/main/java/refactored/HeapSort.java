package refactored;

public class HeapSort implements Sorting {
    private int[] array;
    private int n;

    public void sort(int[] _array) {
        array = _array;
        buildHeap(array);
        for (int i = n; i > 0; i--) {
            swap(0, i);
            n = n - 1;
            maxHeap(0);
        }
    }

    private void buildHeap(int[] a) {
        n = a.length - 1;
        for (int i = n / 2; i >= 0; i--) {
            maxHeap(i);
        }
    }

    private void maxHeap(int i) {
        int left = 2 * i;
        int right = 2 * i + 1;
        int largest;

        if (left <= n && array[left] > array[i])
            largest = left;
        else
            largest = i;

        if (right <= n && array[right] > array[largest])
            largest = right;

        if (largest != i) {
            swap(i, largest);
            maxHeap(largest);
        }
    }

    private void swap(int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }


}
