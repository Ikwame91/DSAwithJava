import java.util.Arrays;

    public class bubblesort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Unsorted Array: " + Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
        second(args);
    }


    ////

    public static void second(String[] args) {
        int[] num = {89, 26, 89, 23, 22, 12,12,45,56,67, 90};
        System.out.println("Unsorted Arrayss: " + Arrays.toString(num));
    
        bubbleSort(num);
    
        System.out.println("Sorted arrayss: " + Arrays.toString(num));
    }
}




// Key Points:

// Time Complexity: O(n^2) in both average and worst cases. This means its performance degrades significantly for larger datasets.
// Space Complexity: O(1), meaning it uses a constant amount of extra space regardless of the input size.
// Stability: Bubble sort is a stable sorting algorithm, meaning it preserves the relative order of elements with equal keys.
// Best Case: If the array is already sorted, bubble sort takes only one pass to confirm it, resulting in O(n) time complexity.
// When to Use Bubble Sort:

// It's often used for educational purposes due to its simplicity and ease of understanding.
// It can be suitable for small datasets or cases where simplicity is prioritized over efficiency.
// However, for larger datasets or performance-critical applications, more efficient sorting algorithms like merge sort or quick sort are generally preferred.