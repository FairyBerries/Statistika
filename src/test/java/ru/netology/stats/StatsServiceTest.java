package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    public void shouldCalculateSum() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 32, 19, 20, 7, 14, 14, 18};

        int expected = 192;
        int actual = service.calculateSum(sales);

        assertEquals(expected, actual);
    }


    @Test
    public void shouldCalculateAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 32, 19, 20, 7, 14, 14, 18};

        int expected = 16;
        int actual = service.calculateAverage(sales);

        assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateMaxSales() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 32, 19, 20, 7, 14, 14, 18};

        int expected = 6;
        int actual = service.calculateMaxSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMinSales() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 32, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.calculateMinSales(sales);

        assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateAmountMonthBelowAvg() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 32, 19, 20, 7, 14, 14, 18};

        int expected = 7;
        int actual = service.calculateAmountMonthBelowAvg(sales);

        assertEquals(expected, actual);


    }

    @Test
    void calculateAmountMonthAboveAvg() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 32, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.calculateAmountMonthAboveAvg(sales);

        assertEquals(expected, actual);
    }
}




