package refactored;

public class ArrayOperations {
    public int[] array;
    public int size;
    private int max, min;

    public ArrayOperations(int[] _array) {
        array = _array;
        size = array.length;
    }

    public int getEvenNumbers() {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) count++;
        }
        return count;
    }

    public int getMultipliedSum() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        return sum * 3;
    }

    public int getDelta() {
        max = 0;
        min = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] >= max) max = array[i];
            if (array[i] < min) min = array[i];
        }
        return max - min;
    }

    public int getMean() {
        int mean = 0;
        for (int i = 0; i < size; i++) {
            mean += array[i];
        }
        return mean / size;
    }

    public int getMaxMinSum() {
        for (int i = 0; i < size; i++) {
            if (array[i] >= max) max = array[i];
            if (array[i] < min) min = array[i];
        }
        return max + min;
    }

    public int getModuleMax() {
        int moduleMax = 0;
        for (int i = 0; i < size; i++) {
            if (Math.abs(array[i]) >= moduleMax) moduleMax = Math.abs(array[i]);
        }
        return moduleMax;
    }
}