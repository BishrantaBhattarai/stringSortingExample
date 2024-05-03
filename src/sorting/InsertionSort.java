package sorting;

import java.util.Arrays;

/**
 * @author Bishranta Bhattarai
 * @version 1.0
 * @since 2024-05-03, Friday
 **/
public class InsertionSort {
    public static void main(String[] args) {
        String[] arr = {"banana", "apple", "orange", "grape", "kiwi"};

        sort(arr);

        Arrays.stream(arr).forEach(str -> System.out.print(str + " "));
    }

    public static void sort(String[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            String key = arr[i];
            int j = i - 1;

            // Move elements of arr[0 to i-1], that are greater than key, to one position ahead of their current position
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
