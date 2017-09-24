import java.util.Scanner;
public class StatisticOfPrecipitation {
    public static void main(String[] args) {
        System.out.println("Введите количество дней наблюдения:");
        Scanner scanner = new Scanner(System.in);
        int daysForStatistic = scanner.nextInt();

        System.out.println("=========");

        if (daysForStatistic <= 0) {
            System.out.println("Количество дней наблюдения должно быть положительным!");
            return;
        }

        int daysWithoutPrecipitation = 0;
        int sumOfPrecipitation = 0;
        int maximumPrecipitation = 0;

        for (int i = 1; i <= daysForStatistic; i++) {
            System.out.println("Введите количество осадков за " + i + " день:");
            int precipitationOfDay = scanner.nextInt();

            if (precipitationOfDay == 0) {
                daysWithoutPrecipitation += 1;
            }

            sumOfPrecipitation += precipitationOfDay;

            if (maximumPrecipitation < precipitationOfDay) {
                maximumPrecipitation = precipitationOfDay;
            }
        }

        float averageAmountOfPrecipitation = (float) sumOfPrecipitation / daysForStatistic;

        System.out.println("=========\nКоличество дней без осадков: " + daysWithoutPrecipitation);
        System.out.println("Сумма осадков за период: " + sumOfPrecipitation);
        System.out.println("Среднее количество осадков за период: " + averageAmountOfPrecipitation);
        System.out.println("Максимальное количество дневных осадков за период: " + maximumPrecipitation);
    }
}
