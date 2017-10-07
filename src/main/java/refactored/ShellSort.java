package refactored;

public class ShellSort implements Sorting {
    public void sort(int[] array) {
        int increment = array.length / 2;
        int j;
        int temp;
        while (increment > 0) {
            for (int i = increment; i < array.length; i++) {
                j = i;
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

}
