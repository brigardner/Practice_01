public class IntegerSelectionSort {
    public static void sort(int[] array) {
        //int swaps = 0;
        int tempInt;
        int indexOfLeastInt = 0;

        for (int i = 0; i < array.length; i++) {
            indexOfLeastInt = i;

            for (int j = i; j < array.length; j++) {
                if (array[j] < array[indexOfLeastInt]) {
                    indexOfLeastInt = j;
                }
            }

            tempInt = array[i];
            array[i] = array[indexOfLeastInt];
            array[indexOfLeastInt] = tempInt;
            indexOfLeastInt = i + 1;
        }


    }
}
