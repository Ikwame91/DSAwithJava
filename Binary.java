public class Binary {
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
    
        while (low <= high) {
            int mid = (low + high) / 2;
    
            if (arr[mid] == key) {
                return mid; // Found the key at index mid
            } else if (key < arr[mid]) {
                high = mid - 1; // Search left half
            } else {
                low = mid + 1; // Search right half
            }
        }
    
        return -1; // Key not found
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 17, 23, 31};
        int key = 17;
    
        int index = binarySearch(arr, key);
    
        if (index != -1) {
            System.out.println("Number " + key + " found at index " + index);
        } else {
            System.out.println("Number " + key + " not found in the array.");
        }
    }
    
    
}