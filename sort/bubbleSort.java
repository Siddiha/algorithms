import java.util.Arrays;

public class bubbleSort {  // Class names should be PascalCase
    public static void main(String[] args) {
        int[] arr = {-1, 7, -32, 89};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // Fix: Inner loop should run until `arr.length - i - 1`
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;  // Early exit if no swaps occur
        }
    }
}