public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {5, 7, 2, 8, 1, 9, 3};
        
        if (numbers.length < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }
        
        int firstLargest, secondLargest;
        if (numbers[0] > numbers[1]) {
            firstLargest = numbers[0];
            secondLargest = numbers[1];
        } else {
            firstLargest = numbers[1];
            secondLargest = numbers[0];
        }
        
        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] != firstLargest) {
                secondLargest = numbers[i];
            }
        }
        
        System.out.println("The second largest number is: " + secondLargest);
    }
}
