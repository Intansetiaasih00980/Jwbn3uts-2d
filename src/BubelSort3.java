import java.util.Arrays;

public class BubelSort3 {
    import java.util.Arrays;

    public class BubbleSortExample {
        public static void bubbleSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Tukar elemen arr[j] dengan arr[j+1]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
        public static void main(String[] args) {
            int[] arr = {64, 34, 25, 12, 22, 11, 90};

            System.out.println("Array sebelum pengurutan: " + Array.toString(arr));

            bubbleSort(arr);

            System.out.println("Array setelah pengurutan: " + Arrays.toString(arr));
        }
    }
}
