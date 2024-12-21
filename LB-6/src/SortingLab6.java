import java.util.Arrays;

public class SortingLab6 {
    public static void main(String[] args) {
        // Приклад масиву byte[]
        byte[] array = {12, 3, 7, 1, 9, 4, 6, 8};

        // Сортування вибором
        byte[] selectionSorted = selectionSortDescending(array.clone());
        System.out.println("Selection Sort (Descending): " + Arrays.toString(selectionSorted));

        // Сортування вставкою
        byte[] insertionSorted = insertionSortDescending(array.clone());
        System.out.println("Insertion Sort (Descending): " + Arrays.toString(insertionSorted));
    }

    // Сортування вибором
    public static byte[] selectionSortDescending(byte[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Обмін місцями
            byte temp = array[maxIndex];
            array[maxIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }

    // Сортування вставкою
    public static byte[] insertionSortDescending(byte[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            byte key = array[i];
            int j = i - 1;

            // Зміщуємо елементи, щоб знайти місце для вставки
            while (j >= 0 && array[j] < key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        return array;
    }
}


