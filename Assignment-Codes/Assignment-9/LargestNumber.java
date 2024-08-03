public class LargestNumber {
    public static void main(String[] args) {
        int[] numbers = {5, 7, 2, 8, 1, 9, 3};
        int largest = numbers[0];
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        
        System.out.println("The largest number is: " + largest);
    }
}
