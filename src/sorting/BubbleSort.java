package sorting;

import java.util.Arrays;

/**
 * @author Bishranta Bhattarai
 * @version 1.0
 * @since 2024-05-03, Friday
 **/
public class BubbleSort {
    public static void main(String[] args) {
        String[] arr = {"banana", "apple", "orange", "grape", "kiwi"};
        sort(arr);
        Arrays.stream(arr).forEach(s -> System.out.printf("%s ",s));
    }

    public static void sort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[i]) < 0) {
                    String temp= arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }
}
