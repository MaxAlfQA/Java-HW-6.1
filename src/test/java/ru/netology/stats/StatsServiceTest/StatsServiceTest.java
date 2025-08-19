package ru.netology.stats.StatsServiceTest;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    @Test
    public void shouldFindAmountSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmount = 180;
        int actualAmount = service.sumSales(sales);
        Assertions.assertEquals(expectedAmount, actualAmount);

    }

    @Test
    public void shouldFindMeanSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMean = 15;
        int actualMean = service.meanSales(sales);
        Assertions.assertEquals(expectedMean, actualMean);
    }



}
