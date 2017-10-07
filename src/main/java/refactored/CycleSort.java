package refactored;

public class CycleSort implements Sorting {
    private int value, position, temp;
    private int[] array;

    public void sort(int[] _array) {
        array = _array;
        for (int cycleStart = 0; cycleStart < array.length - 1; cycleStart++) {
            value = array[cycleStart];
            position = cycleStart;

            for (int i = cycleStart + 1; i < array.length; i++)
                if (array[i] < value)
                    position++;

            if (position == cycleStart)
                continue;

            while (value == array[position])
                position++;


            while (position != cycleStart) {
                position = cycleStart;
                for (int i = cycleStart + 1; i < array.length; i++)
                    if (array[i] < value)
                        position++;

                while (value == array[position])
                    position++;

                swap();
            }
        }
    }

    private void swap(){
        temp = array[position];
        array[position] = value;
        value = temp;
    }
}
