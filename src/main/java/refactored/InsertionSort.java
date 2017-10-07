package refactored;

public class InsertionSort implements Sorting {
    private int[] array;

    public void sort(int[] _array) {
        array = _array;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    swap(j);
                }
            }
        }
    }

    private void swap(int j) {
        int temp = array[j];
        array[j] = array[j - 1];
        array[j - 1] = temp;
    }
}
