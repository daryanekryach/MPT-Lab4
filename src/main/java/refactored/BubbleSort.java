package refactored;

public class BubbleSort implements Sorting {
    private int temp, n;
    private int[] array;
    public void sort(int[] _array){
        array = _array;
        n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
               swap(j);
            }
        }
    }

    private void swap(int j){
        if (array[j - 1] > array[j]) {
            temp = array[j - 1];
            array[j - 1] = array[j];
            array[j] = temp;
        }
    }
}
