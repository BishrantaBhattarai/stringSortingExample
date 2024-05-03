package sorting;

import java.util.Arrays;

/**
 * @author Bishranta Bhattarai
 * @version 1.0
 * @since 2024-05-03, Friday
 **/
public class SelectionSort {

    public static void main(String[] args) {
        String[] arr = {"banana", "apple", "orange", "grape", "kiwi"};
        sort(arr);
        Arrays.stream(arr).forEach(str -> System.out.print(str + " "));
    }

    public static void sort(String[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            /*
            We first find the index of the minimum element in the unsorted part of the array
             */
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            /*
            We then Swap the minimum element with the first element of the unsorted part
             */
            String temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
