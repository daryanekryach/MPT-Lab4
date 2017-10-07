package refactored;

public class ShellSort implements Sorting {

    private int temp, increment;
    private int[] array;

    public void sort(int[] _array) {
        array = _array;
        increment = array.length / 2;
        while (increment > 0) {
            for (int i = increment; i < array.length; i++) {
                int j = i;
                temp = array[i];
                while (j >= increment && array[j - increment] > temp) {
                    array[j] = array[j - increment];
                    j = j - increment;
                }
                array[j] = temp;
            }
            if (increment == 2) increment = 1;
            else increment *= (5.0 / 11);
        }
    }

//    private int swap(int j) {
//        array[j] = array[j - increment];
//        j = j - increment;
//        return j;
//    }
//
//    private void Swap(int i) {
//        int j = i;
//        temp = array[i];
//        while (j >= increment && array[j - increment] > temp) {
//            swap(j);
//        }
//        array[j] = temp;
//    }
}
