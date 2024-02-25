public class linear {
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public void demonstratePrintArray() {
        int[] numbers = {1, 4, 2, 8, 5};
        printArray(numbers);  // Output: 1 4 2 8 5
    }

    public static void main(String[] args) {
        linear demo = new linear();
        demo.demonstratePrintArray();
    }
}
