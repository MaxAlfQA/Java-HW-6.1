package ru.netology.stats;

public class StatsService {
    public int sumSales (int[] sales) {
        int sum = 0;
        for (int i =0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }
    public int meanSales (int[] sales) {
        int sum = 0;
        for (int i =0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        int mean = sum/sales.length;
        return mean;





    }
}
