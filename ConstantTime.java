public class ConstantTime {
   
    public int addTwoNumbers(int a, int b) {
        return a + b;
    }
    
    public void demonstrateAddTwoNumbers() {
        int result = addTwoNumbers(5, 3);
        System.out.println("Sum: " + result);  
    }

    public static void main(String[] args) {
        ConstantTime ct = new ConstantTime();
        ct.demonstrateAddTwoNumbers();
    }
    
}
