public class ArrayOperations {
    int[] array;
    int size, max, min;

    public ArrayOperations(int[] _array) {
        array = _array;
        size = array.length;
    }

    int getEvenNumbers() {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) count++;
        }
        return count;
    }

    int getMultipliedSum() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        return sum * 3;
    }

    int getDelta() {
        max = 0;
        min = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] >= max) max = array[i];
            if (array[i] < min) min = array[i];
        }
        return max - min;
    }

    int getMean() {
        int mean = 0;
        for (int i = 0; i < size; i++) {
            mean += array[i];
        }
        return mean / size;
    }

    int getMaxMinSum() {
        for (int i = 0; i < size; i++) {
            if (array[i] >= max) max = array[i];
            if (array[i] < min) min = array[i];
        }
        return max + min;
    }

    int getModuleMax() {
        int moduleMax = 0;
        for (int i = 0; i < size; i++) {
            if (Math.abs(array[i]) >= moduleMax) moduleMax = Math.abs(array[i]);
        }
        return moduleMax;
    }
}
