package ru.netology.stats;

public class StatsService {

    public int getSumSales(int[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];

        }
        return sum;

    }

    public int getAverageSumSales(int[] sales) {
        int average = 0;
        if (sales.length > 0) {
            int sum = 0;
            for (int i = 0; i < sales.length; i++) {
                sum += sales[i];
            }
            average = sum / sales.length;
        }
        return average;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int getMinAverage(int[] sales) {
        int minAverageMonths = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < getAverageSumSales(sales)) {
                minAverageMonths++;
            }
        }
        return minAverageMonths;


    }

    public int getMaxAverage(int[] sales) {
        int maxAverageMonths = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > getAverageSumSales(sales)) {
                maxAverageMonths++;

            }
        }
        return maxAverageMonths;
    }
}
