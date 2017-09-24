import java.util.Scanner;
public class LookingForFibonacciNumbersLoop {
    public static void main(String[] args) {
        System.out.println("Enter your number :");
        Scanner scanner = new Scanner(System.in);
        int myNumber = scanner.nextInt();

        if (myNumber == 1) {
            System.out.println("============\nFibonacci numbers: 0");
            return;
        }

        System.out.print("============\nFibonacci numbers: 0 1 ");

        int firstFibonacciNumber = 0;
        int secondFibonacciNumber = 1;

        for (int nextFibonacciNumber = 1; nextFibonacciNumber < myNumber; nextFibonacciNumber =
                firstFibonacciNumber + secondFibonacciNumber) {
            firstFibonacciNumber = secondFibonacciNumber;
            secondFibonacciNumber = nextFibonacciNumber;
            System.out.print(nextFibonacciNumber + " ");

        }
    }
}
