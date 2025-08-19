package ru.netology.stats;

public class StatsService {
    public int sumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }

        return sum;
    }

    public int meanSales(int[] sales) {

        return sumSales(sales) / sales.length;

    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSalesMouth(int[] sales) {
        int mean = meanSales(sales);
        int minSumMouth = 0;
        for (int sale : sales) {
            if (sale < mean) {
                minSumMouth++;

            }

        }
        return minSumMouth;


    }

    public int maxSalesMouth(int[] sales) {
        int mean = meanSales(sales);
        int maxSumMouth = 0;
        for (int sale : sales) {
            if (sale > mean) {
                maxSumMouth++;

            }

        }
        return maxSumMouth;
    }

}
