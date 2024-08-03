import java.util.Scanner;

public class AverageAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of ages: ");
        int n = scanner.nextInt();
        int[] ages = new int[n];
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter age " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
            sum += ages[i];
        }
        
        double average = (double) sum / n;
        System.out.println("The average age is: " + average);
    }
}
