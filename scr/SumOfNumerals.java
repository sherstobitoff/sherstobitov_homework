import java.util.Scanner;
public class SumOfNumerals {
    public static void main(String[] args) {
        System.out.println("Enter your number :");
        Scanner scanner = new Scanner(System.in);
        int myNumber = scanner.nextInt();

        int sumOfNumerals = 0;

        while (myNumber != 0) {
            sumOfNumerals = sumOfNumerals + myNumber % 10;
            myNumber = myNumber / 10;
        }
        System.out.println(sumOfNumerals > 0 ? "=====\nSum of numerals :" + sumOfNumerals : "=====\nSum of numerals :"
                + (-1 * sumOfNumerals));
    }
}
