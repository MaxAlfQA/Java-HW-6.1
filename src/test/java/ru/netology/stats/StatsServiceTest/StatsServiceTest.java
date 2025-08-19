package ru.netology.stats.StatsServiceTest;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    @Test
    public void shouldFindAmountSales() {    // Сумма всех продаж
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmount = 180;
        int actualAmount = service.sumSales(sales);
        Assertions.assertEquals(expectedAmount, actualAmount);

    }

    @Test
    public void shouldFindMeanSales() {    // Среднее число продаж
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMean = 15;
        int actualMean = service.meanSales(sales);
        Assertions.assertEquals(expectedMean, actualMean);
    }

    @Test
    public void shouldFindMaxMouthSales() {  // Месяц с макс. продажами
        StatsService service = new StatsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxMouth = 6;
        int actualMaxMouth  = service.maxSales(sales);
        Assertions.assertEquals(expectedMaxMouth, actualMaxMouth);

    }

    @Test
    public void shouldFindMinMouthSales() {       // Месяц с мин продажами
        StatsService service = new StatsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinMouth = 9;
        int actualMinMouth  = service.minSales(sales);
        Assertions.assertEquals(expectedMinMouth, actualMinMouth);
    }

    @Test
    public void shouldFindAllMinMouthSales() {     // Кол-во месяцев ниже среднего числа продаж
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAllMinMouth = 5;
        int actualAllMinMouth = service.minSalesMouth(sales);
        Assertions.assertEquals(expectedAllMinMouth, actualAllMinMouth);
    }

    @Test
    public void shouldFindAllMaxMouthSales() {     // Кол-во месяцев выше среднего числа продаж
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAllMaxMouth = 5;
        int actualAllMaxMouth = service.maxSalesMouth(sales);
        Assertions.assertEquals(expectedAllMaxMouth, actualAllMaxMouth);

    }



}
