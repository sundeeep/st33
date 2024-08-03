/**
 * 1) Write a java program to find out Nth element of Fibonacci series of a given number by using
recursion?
 Fibonacci series: 0 1 1 2 3 5
 Input: n=4
 Output:
 Nth-Element is: 2 

 */

import java.util.Scanner;

public class NthElementFib {
    public int fibonacci(int element) {
        if (element <= 0) 
            return 0;
        if (element == 1) 
            return 1;
        return fibonacci(element - 1) + fibonacci(element - 2);
    }

    public static void main(String[] args) {
        int element;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter which element, you want from fibonacci series: ");
        element = input.nextInt();
        NthElementFib nthFibObj = new NthElementFib();
        int fibonacciNumberOfNthElement = nthFibObj.fibonacci(element);
        System.out.println("Element - "+element+" in fibonacci series is: " + fibonacciNumberOfNthElement);
    }
}
