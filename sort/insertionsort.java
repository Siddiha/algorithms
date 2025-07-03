/*Time complexity
worst case - o(n^2)
Best case - o(n)*/

import java.util.*;

public class insertionsort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        insertionSort1(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort1(int[] arr) {
        for (int i = 1; i < arr.length; i++) {  // Start from 1 instead of 0
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}