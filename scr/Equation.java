// Created by Sherstobitov Maxim on 22.09.2017
import java.util.Scanner;
public class Equation {
    public static void main(String[] args) {
        float a = scanVariable("a");
        float b = scanVariable("b");
        float c = scanVariable("c");


        double ourDiscriminant = discriminant(a, b, c);
        if (isPositive(ourDiscriminant)) {
            double firstSolution = (- b + Math.sqrt(ourDiscriminant)) / (2 * a);
            double secondSolution = (- b - Math.sqrt(ourDiscriminant)) / (2 * a);
            System.out.println("==============\nКорни уравнения:\n" + "x1 = " + firstSolution + ", x2 = " +
                    secondSolution );
        } else if (isZero(ourDiscriminant)) {
            double onlySolution = - b / (2 * a);
            System.out.println("==============\nУравнение имеет один корень (два одинаковых корня):\n" + "x1 = x2 = " +
                    onlySolution);
        } else {
            System.out.println("==============\nОтрицательный дискриминант, решения в действительных числах нет");

        }


    }
    public static double discriminant (float a, float b, float c) {
        return b * b - 4 * a * c;
    }
    public static boolean isZero (double discriminant) {
        return discriminant == 0;
    }
    public static boolean isPositive (double discriminant) {
        return discriminant > 0;
    }
    public static float scanVariable (String variableDescription) {
        System.out.println("Введите " + variableDescription + ": ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }
}