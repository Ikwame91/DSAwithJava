public class quadraticO {
    public boolean isPairSumPresent(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    return true;
                }
            }
        }
    
        return false;
    }
    public void demonstratePairSumPresent() {
        int[] numbers = {3, 8, 12, 4, 1};
        int targetSum = 15;
        boolean isPairPresent = isPairSumPresent(numbers, targetSum);
    
        if (isPairPresent) {
            System.out.println("Pair with sum " + targetSum + " found");
        } else {
            System.out.println("Pair with sum " + targetSum + " not found");
        }
    
    // Time complexity: O(n^2)
    // Nested loops create n^2 potential comparisons.
    
}
public static void main(String[] args) {
    quadraticO bigO = new quadraticO();
    bigO.demonstratePairSumPresent();
}
}
