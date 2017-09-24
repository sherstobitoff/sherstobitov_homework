// Created by Sherstobitov Maxim on 22.09.2017
import java.util.Scanner;
public class Houses {
    public static void main(String[] args) {
        float a = scanVariable("Введите ширину первого дома (а):");
        float b = scanVariable("Введите длину первого дома (b):");
        float c = scanVariable("Введите ширину второго дома (с):");
        float d = scanVariable("Введите длину второго дома (d):");
        float e = scanVariable("Введите ширину участка (e):");
        float f = scanVariable("Введите длину участка (f):");

        if (a <= 0|| b <= 0|| c <= 0|| d <= 0|| e <= 0|| f <= 0) {
            System.out.println("==========\nНеверное значение параметров");
            return;
        }

        System.out.println(((a + c <= e) && (b + d <= f)) ? "==============\nIt's okay!" :
                "==============\nHouston, we have a problem!");
    }
    public static float scanVariable (String variableDescription) {
        System.out.println(variableDescription);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }
}
