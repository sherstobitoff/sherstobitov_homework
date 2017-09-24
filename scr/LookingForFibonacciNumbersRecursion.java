import java.util.Scanner;
public class LookingForFibonacciNumbersRecursion {
    public static void main(String[] args) {
        System.out.println("Enter your number :");
        Scanner scanner = new Scanner(System.in);
        int myNumber = scanner.nextInt();

        System.out.print("==========\nFibonacci numbers: ");
        int i = 0;
        while (fibonacciNumbersLessThenMyNumber(i) < myNumber) {
            System.out.print(fibonacciNumbersLessThenMyNumber(i) + " ");
            i++;
        }
        fibonacciNumbersLessThenMyNumber(myNumber);

    }
    public static int fibonacciNumbersLessThenMyNumber (int number) {
        if (number == 0 || number == 1) {
            return number;
        } else {
           return fibonacciNumbersLessThenMyNumber(number - 1) + fibonacciNumbersLessThenMyNumber(number - 2);
        }
     }
}
