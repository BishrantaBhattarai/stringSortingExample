package sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Bishranta Bhattarai
 * @version 1.0
 * @since 2024-05-03, Friday
 **/
public class UserInputBubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] arr = getUserInputStrings(n, scanner);

        BubbleSort.sort(arr);
        Arrays.stream(arr).forEach(s -> System.out.printf("%s ",s));
    }

    public static String[] getUserInputStrings(int n, Scanner scanner) {
        String[] arr = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }
        scanner.close();
        return arr;
    }

}
